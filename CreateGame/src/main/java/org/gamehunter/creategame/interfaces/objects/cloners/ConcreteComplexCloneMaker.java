package org.gamehunter.creategame.interfaces.objects.cloners;

import org.gamehunter.creategame.objects.complexobjects.ComplexGameObject;

public class ConcreteComplexCloneMaker extends AbstractCloneMaker {

    public ConcreteComplexCloneMaker() {
        // TODO Auto-generated constructor stub
    }

    public CloneMaker buildComplexClone(ComplexGameObject prototype, ComplexGameObject clone) {

        return this;
    }

}

