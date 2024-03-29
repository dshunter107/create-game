package org.gamehunter.creategame.interfaces.builder;

import org.gamehunter.creategame.interfaces.factory.Product;
import org.gamehunter.creategame.interfaces.registry.Registrant;
import org.gamehunter.creategame.objects.complexobjects.ComplexGameObject;

public interface ComplexProductPart extends Product, Registrant {

    boolean isValid(ComplexProduct complexProduct);

    void preparePart(ComplexProduct complexProduct);

    void addThisPartToProduct(ComplexProduct complexProduct);

    void setInGameObject(ComplexGameObject cgo);

    @Override
    ComplexProductPart createClone();

}
