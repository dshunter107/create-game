package org.gamehunter.creategame.interfaces.prototype;

import org.gamehunter.creategame.interfaces.builder.ComplexProductPart;

public interface ComplexPartPrototype extends Prototype, ComplexProductPart {
    @Override
    ComplexPartPrototype createClone();
}
