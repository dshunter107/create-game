package org.gamehunter.creategame.objects.complexobjects;

import java.util.ArrayList;

import org.gamehunter.creategame.interfaces.builder.ComplexProduct;
import org.gamehunter.creategame.interfaces.builder.ComplexProductPart;
import org.gamehunter.creategame.locations.GameLocation;
import org.gamehunter.creategame.objects.AbstractGameObject;
import org.gamehunter.creategame.objects.complexobjectparts.Section;
import org.gamehunter.creategame.objects.complexobjectparts.SectionConnection;

import lombok.Getter;

@Getter
public class AbstractComplexGameObject extends AbstractGameObject
implements ComplexGameObject, ComplexProduct {
    private ArrayList<ComplexProductPart> sections;
    private ArrayList<ComplexProductPart> connections;

    public AbstractComplexGameObject(GameLocation inLocation) {
        super(inLocation);
        this.sections = new ArrayList<>();
        this.connections = new ArrayList<>();
    }

    @Override
    public SectionConnection createConnection(Section sectionFrom, Section sectionTo) {
        return new SectionConnection(sectionFrom, sectionTo);
    }


    @Override
    public boolean areSectionsConnected(Section sectionFrom, Section sectionTo) {
        return sectionFrom.getConnectedSections().contains(sectionTo);
    }

    @Override
    public void addComplexProductInfoToPart(ComplexProductPart part) {
        part.setInGameObject(this);
    }

}
