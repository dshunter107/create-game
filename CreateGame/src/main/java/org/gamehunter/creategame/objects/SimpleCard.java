package org.gamehunter.creategame.objects;

import org.gamehunter.creategame.constants.GameObjectTypeName;
import org.gamehunter.creategame.interfaces.objects.Card;
import org.gamehunter.creategame.locations.Location;

import lombok.Getter;

/**
 * A type of object for games. Typically, there are many cards in a game, so
 * this object can be used to recognize each card.
 */
@Getter
public class SimpleCard extends AbstractGameObject implements Card {
    private final GameObjectTypeName TYPE = GameObjectTypeName.CARD;

    /**
     * Constructor for the Card class. All objects (including Cards) must be
     * associated with an area.
     *
     * @param inLocation
     */
    public SimpleCard(Location inLocation) {
        super(inLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{ " + this.TYPE + " : ");
        sb.append(super.toString());
        sb.append(" } ");
        return sb.toString();
    }

    @Override
    public SimpleCard createClone() {
        SimpleCard cloneCard = new SimpleCard(this.getInLocation());
        this.setClone(cloneCard);
        super.createClone();
        return cloneCard;
    }
}
