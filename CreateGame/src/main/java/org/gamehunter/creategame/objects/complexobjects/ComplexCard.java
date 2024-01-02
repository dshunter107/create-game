package org.gamehunter.creategame.objects.complexobjects;

import org.gamehunter.creategame.constants.GameObjectTypeName;
import org.gamehunter.creategame.interfaces.objects.Card;
import org.gamehunter.creategame.interfaces.prototype.ComplexPrototype;
import org.gamehunter.creategame.locations.Location;

import lombok.Getter;

@Getter
public class ComplexCard extends AbstractComplexGameObject implements Card {
    private final GameObjectTypeName TYPE = GameObjectTypeName.CARD;

    /**
     * Constructor for the Card class. All objects (including Cards) must be
     * associated with an area.
     *
     * @param inLocation
     */
    public ComplexCard(Location inLocation) {
        super(inLocation);
    }

    @Override
    public ComplexPrototype createClone() {
        this.setComplexClone(new ComplexBoard(this.getInLocation()));
        return super.createClone();
    }
}
