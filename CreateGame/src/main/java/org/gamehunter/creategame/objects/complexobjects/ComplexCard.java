package org.gamehunter.creategame.objects.complexobjects;

import org.gamehunter.creategame.constants.GameObjectTypeName;
import org.gamehunter.creategame.interfaces.objects.Card;
import org.gamehunter.creategame.locations.Location;
import org.gamehunter.creategame.objects.AbstractGameObject;

import lombok.Getter;

@Getter
public class ComplexCard extends AbstractGameObject implements Card {
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


}
