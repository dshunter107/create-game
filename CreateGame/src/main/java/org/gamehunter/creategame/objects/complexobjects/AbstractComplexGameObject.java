package org.gamehunter.creategame.objects.complexobjects;

import java.util.ArrayList;

import org.gamehunter.creategame.interfaces.builder.ComplexProduct;
import org.gamehunter.creategame.interfaces.builder.ComplexProductPart;
import org.gamehunter.creategame.interfaces.builder.Director;
import org.gamehunter.creategame.locations.Location;
import org.gamehunter.creategame.objects.AbstractGameObject;
import org.gamehunter.creategame.objects.complexobjectparts.Section;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class AbstractComplexGameObject extends AbstractGameObject
implements ComplexGameObject {
    private ArrayList<ComplexProductPart> sections;
    private ArrayList<ComplexProductPart> connections;
    private @Setter Director director;
    private @Setter ComplexProduct complexClone;

    public AbstractComplexGameObject(Location inLocation) {
        super(inLocation);
        this.sections = new ArrayList<>();
        this.connections = new ArrayList<>();
    }

    /*
     * @Override public SectionConnection createConnection(Section sectionFrom,
     * Section sectionTo) { return new SectionConnection(sectionFrom, sectionTo); }
     */

    @Override
    public boolean areSectionsConnected(Section sectionFrom, Section sectionTo) {
        return sectionFrom.getConnectedSections().contains(sectionTo);
    }

    @Override
    public ComplexProduct createClone() {
        for (ComplexProductPart section : this.sections) {
            section.createClone().addThisPartToProduct(this.complexClone);
        }
        for (ComplexProductPart connection : this.connections) {
            connection.createClone().addThisPartToProduct(this.complexClone);
        }
        super.setClone(this.complexClone);
        super.createClone();
        return this.complexClone;
    }
}
