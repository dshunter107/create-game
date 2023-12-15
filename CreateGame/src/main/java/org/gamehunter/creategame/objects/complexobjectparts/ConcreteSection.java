package org.gamehunter.creategame.objects.complexobjectparts;

import java.util.ArrayList;

import org.gamehunter.creategame.interfaces.builder.ComplexProduct;
import org.gamehunter.creategame.interfaces.connection.Connectable;
import org.gamehunter.creategame.locations.Location;
import org.gamehunter.creategame.objects.characteristics.Characteristic;
import org.gamehunter.creategame.objects.complexobjects.ComplexGameObject;

import lombok.Getter;
import lombok.Setter;

@Getter
public class ConcreteSection extends AbstractComplexGameObjectPart implements Section, Connectable {
    private ArrayList<Section> connectedSections;
    private @Setter ArrayList<Location> sectionLocations;

    public ConcreteSection() {
        this.initializeParts();
    }

    public ConcreteSection(ComplexGameObject cgo) {
        super(cgo);
        this.initializeParts();

    }

    private void initializeParts() {
        this.connectedSections = new ArrayList<>();
        this.sectionLocations = new ArrayList<>();
    }

    @Override
    public boolean getHasLocation() {
        return this.sectionLocations != null && this.sectionLocations.size() > 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Characteristic c : this.characteristics) {
            sb.append(c.toString());
        }
        return "GameItem [ characteristics="
        + sb.toString() + "]";
    }

    @Override
    public void addThisPartToProduct(ComplexProduct complexProduct) {
        complexProduct.getSections().add(this);
        complexProduct.addComplexProductInfoToPart(this);
    }

    @Override
    public boolean isValid(ComplexProduct complexProduct) {
        return true;
    }
}
