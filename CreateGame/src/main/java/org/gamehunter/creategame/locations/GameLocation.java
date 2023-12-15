package org.gamehunter.creategame.locations;

import org.gamehunter.creategame.constants.GameAreaName;

import lombok.Getter;
import lombok.Setter;

@Getter
public class GameLocation extends AbstractLocation {
    private @Setter GameAreaName area;

    public GameLocation(GameAreaName area) {
        this.area = area;
        this.name = this.area.toString();
    }

    public GameLocation(String name, GameLocation inLocation) {
        super(inLocation);
        this.area = inLocation.getArea();
        this.name = name;
    }
}
