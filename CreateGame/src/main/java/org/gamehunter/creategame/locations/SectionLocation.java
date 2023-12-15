package org.gamehunter.creategame.locations;

import org.gamehunter.creategame.constants.GameAreaName;
import org.gamehunter.creategame.objects.complexobjectparts.Section;

import lombok.Getter;

@Getter
public class SectionLocation extends AbstractLocation {
    private Section inGameSection;
    private Location inSectionLocation;

    SectionLocation(String name, Section inGameSection) {
        this.inGameSection = inGameSection;
        this.name = name;
    }

    SectionLocation(String name, SectionLocation inSectionLocation) {
        this.inSectionLocation = inSectionLocation;
        this.name = name;
    }

    @Override
    public GameAreaName getArea() {
        return this.inGameSection.getArea();
    }
}
