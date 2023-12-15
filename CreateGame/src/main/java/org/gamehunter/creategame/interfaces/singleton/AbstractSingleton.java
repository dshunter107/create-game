package org.gamehunter.creategame.interfaces.singleton;

public abstract class AbstractSingleton implements Singleton {
    private static Singleton instance;

    public AbstractSingleton() {
    }

    @Override
    public Singleton getInstance() {
        if (instance == null) {
            instance = this.instantiate();
        }

        return instance;
    }

    /**
     * you must return a new instance of the subclass that wishes to use this
     * abstract singleton. For example, return new RegistrySingleton();
     *
     * @return a new instance of this subclass
     */
    protected abstract Singleton instantiate();
}
