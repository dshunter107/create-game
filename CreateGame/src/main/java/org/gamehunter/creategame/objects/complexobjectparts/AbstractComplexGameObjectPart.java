package org.gamehunter.creategame.objects.complexobjectparts;

import java.util.ArrayList;

import org.gamehunter.creategame.constants.GameAreaName;
import org.gamehunter.creategame.interfaces.builder.ComplexProduct;
import org.gamehunter.creategame.interfaces.factory.Product;
import org.gamehunter.creategame.interfaces.prototype.ComplexPartPrototype;
import org.gamehunter.creategame.interfaces.registry.AbstractRegistrant;
import org.gamehunter.creategame.objects.characteristics.Characteristic;
import org.gamehunter.creategame.objects.complexobjects.ComplexGameObject;
import org.gamehunter.creategame.registry.RegistrySingleton;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class AbstractComplexGameObjectPart extends AbstractRegistrant implements ComplexPartPrototype {
    protected @Setter ArrayList<Characteristic> characteristics;
    protected @Setter ComplexGameObject inGameObject;
    protected ComplexPartPrototype clone;
    private @Setter int cloneNumber;

    public AbstractComplexGameObjectPart() {
        this.initializePart();
    }

    public AbstractComplexGameObjectPart(ComplexGameObject cgo) {
        this.initializePart();
        this.inGameObject = cgo;
    }

    private void initializePart() {
        this.characteristics = new ArrayList<>();
        this.cloneNumber = 1;
    }

    @Override
    public abstract void addThisPartToProduct(ComplexProduct complexProduct);

    @Override
    public abstract boolean isValid(ComplexProduct complexProduct);

    @Override
    public void preparePart(ComplexProduct complexProduct) {
        if (!((RegistrySingleton) new RegistrySingleton().getInstance()).contains(this)) {
            this.generateId();
        }
    }

    public GameAreaName getArea() {
        if (this.inGameObject != null) {
            return this.inGameObject.getArea();
        }
        return null;
    }

    @Override
    public Product addCharacteristic(Characteristic characteristic) {
        this.characteristics.add(characteristic);
        return this;
    }

    @Override
    public ComplexPartPrototype createClone() {
        this.clone.setCloneNumber(this.cloneNumber + 1);
        for (Characteristic c : this.characteristics) {
            this.clone.addCharacteristic(c);
        }
        return this.clone;
    }
}
