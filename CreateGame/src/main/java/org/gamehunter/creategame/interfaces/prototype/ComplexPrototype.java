package org.gamehunter.creategame.interfaces.prototype;

import org.gamehunter.creategame.interfaces.builder.ComplexProduct;

public interface ComplexPrototype extends Prototype, ComplexProduct {
    @Override
    ComplexPrototype createClone();
}
