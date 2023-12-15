package org.gamehunter.creategame.values;

public class NoValue implements Values {
    public static final boolean HAS_VALUE = false;

    @Override
    public boolean getHasValue() {
        return HAS_VALUE;
    }
}
