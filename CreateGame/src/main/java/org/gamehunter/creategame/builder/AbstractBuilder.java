package org.gamehunter.creategame.builder;

import java.util.ArrayList;
import java.util.HashMap;

import org.gamehunter.creategame.interfaces.builder.Builder;
import org.gamehunter.creategame.interfaces.builder.ComplexProduct;
import org.gamehunter.creategame.interfaces.builder.ComplexProductPart;
import org.gamehunter.creategame.locations.Location;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class AbstractBuilder implements Builder {
    protected ComplexProduct complexProduct;
    private @Setter HashMap<String, ArrayList<ComplexProductPart>> allPotentialParts;

    public AbstractBuilder(Location inLocation) {
        this.complexProduct = this.instantiateProduct(inLocation);
    }

    protected abstract ComplexProduct instantiateProduct(Location inLocation);


    @Override
    public void buildPart(ComplexProductPart part) {
        if (part.isValid(this.complexProduct)) {
            part.preparePart(this.complexProduct);
            part.addThisPartToProduct(this.complexProduct);
        }
    }

    @Override
    public Builder buildParts() {
        for (String key : this.allPotentialParts.keySet()) {
            ArrayList<ComplexProductPart> potentialParts = this.allPotentialParts.get(key);
            for (ComplexProductPart part : potentialParts) {
                this.buildPart(part);
            }
        }
        return this;
    }

}
