package org.gamehunter.creategame.objects.complexobjects;

import java.util.ArrayList;

import org.gamehunter.creategame.interfaces.builder.Director;
import org.gamehunter.creategame.interfaces.prototype.ComplexPartPrototype;
import org.gamehunter.creategame.interfaces.prototype.ComplexPrototype;
import org.gamehunter.creategame.locations.Location;
import org.gamehunter.creategame.objects.AbstractGameObject;
import org.gamehunter.creategame.objects.complexobjectparts.Section;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class AbstractComplexGameObject extends AbstractGameObject
implements ComplexGameObject {
    private ArrayList<ComplexPartPrototype> sections;
    private ArrayList<ComplexPartPrototype> connections;
    private @Setter Director director;
    private @Setter ComplexPrototype complexClone;

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
    public ComplexPrototype createClone() {
        for (ComplexPartPrototype section : this.sections) {
            section.createClone().addThisPartToProduct(this.complexClone);
        }
        for (ComplexPartPrototype connection : this.connections) {
            connection.createClone().addThisPartToProduct(this.complexClone);
        }
        super.setClone(this.complexClone);
        super.createClone();
        return this.complexClone;
    }
}
