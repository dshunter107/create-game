package org.gamehunter.creategame.objects.complexobjectparts;

import org.gamehunter.creategame.interfaces.builder.ComplexProduct;
import org.gamehunter.creategame.interfaces.connection.Connection;

import lombok.Getter;

@Getter
public class SectionConnection extends AbstractComplexGameObjectPart implements Connection {
    private Section from;
    private Section to;

    public SectionConnection(Section sectionFrom, Section sectionTo) {
        this.from = sectionFrom;
        this.to = sectionTo;
    }

    @Override
    public void addThisPartToProduct(ComplexProduct complexProduct) {
        complexProduct.getConnections().add(this);
        complexProduct.addComplexProductInfoToPart(this);
    }

    @Override
    public boolean isValid(ComplexProduct complexProduct) {
        return complexProduct.getSections().contains(this.from) &&
                complexProduct.getSections().contains(this.to);
    }

}
