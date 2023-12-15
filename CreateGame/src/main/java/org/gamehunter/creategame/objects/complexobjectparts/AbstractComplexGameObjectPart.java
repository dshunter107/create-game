package org.gamehunter.creategame.objects.complexobjectparts;

import java.util.ArrayList;

import org.gamehunter.creategame.constants.GameAreaName;
import org.gamehunter.creategame.interfaces.builder.ComplexProduct;
import org.gamehunter.creategame.interfaces.builder.ComplexProductPart;
import org.gamehunter.creategame.interfaces.registry.AbstractRegistrant;
import org.gamehunter.creategame.objects.characteristics.Characteristic;
import org.gamehunter.creategame.objects.complexobjects.ComplexGameObject;
import org.gamehunter.creategame.registry.RegistrySingleton;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class AbstractComplexGameObjectPart extends AbstractRegistrant implements ComplexProductPart {
    protected @Setter ArrayList<Characteristic> characteristics;
    protected @Setter ComplexGameObject inGameObject;

    public AbstractComplexGameObjectPart() {
        this.characteristics = new ArrayList<>();
    }

    public AbstractComplexGameObjectPart(ComplexGameObject cgo) {
        this.characteristics = new ArrayList<>();
        this.inGameObject = cgo;
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

}
