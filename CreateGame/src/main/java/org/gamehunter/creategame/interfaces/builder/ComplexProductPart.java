package org.gamehunter.creategame.interfaces.builder;

import org.gamehunter.creategame.interfaces.registry.Registrant;
import org.gamehunter.creategame.objects.complexobjects.ComplexGameObject;

public interface ComplexProductPart extends Registrant {

    boolean isValid(ComplexProduct complexProduct);

    void preparePart(ComplexProduct complexProduct);

    void addThisPartToProduct(ComplexProduct complexProduct);

    void setInGameObject(ComplexGameObject cgo);

}
