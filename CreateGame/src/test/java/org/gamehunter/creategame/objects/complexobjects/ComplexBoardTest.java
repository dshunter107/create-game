package org.gamehunter.creategame.objects.complexobjects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.gamehunter.creategame.builder.ComplexBoardDirector;
import org.gamehunter.creategame.constants.GameAreaName;
import org.gamehunter.creategame.interfaces.builder.ComplexProduct;
import org.gamehunter.creategame.interfaces.builder.ComplexProductPart;
import org.gamehunter.creategame.locations.GameLocation;
import org.gamehunter.creategame.objects.characteristics.Characteristic;
import org.gamehunter.creategame.objects.characteristics.ConcreteCharacteristic;
import org.gamehunter.creategame.objects.complexobjectparts.ConcreteSection;
import org.gamehunter.creategame.objects.complexobjectparts.Section;
import org.gamehunter.creategame.objects.complexobjectparts.SectionConnection;
import org.gamehunter.creategame.registry.RegistrySingleton;
import org.gamehunter.creategame.values.ArbitraryValue;
import org.gamehunter.creategame.values.IntegerValue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ComplexBoardTest {

    @Test
    void testBuilderDesignPattern() {
        new RegistrySingleton().getInstance();

        GameLocation location = new GameLocation(GameAreaName.COMMON);
        ComplexProduct complexBoard = new ComplexBoardDirector()
                .createBuilder(location)
                .setAllPotentialParts(this.createProductParts())
                .buildProduct()
                .getProduct();

        assertEquals(64, complexBoard.getSections().size());
        assertEquals(63, complexBoard.getConnections().size());
    }

    private HashMap<String, ArrayList<ComplexProductPart>> createProductParts() {
        ArrayList<ComplexProductPart> sections = new ArrayList<>();
        ArrayList<ComplexProductPart> connections = new ArrayList<>();
        HashMap<String, ArrayList<ComplexProductPart>> allPotentialParts = new HashMap<>();
        allPotentialParts.put("sections", sections);
        allPotentialParts.put("connections", connections);

        Section previousSection = new ConcreteSection();

        int dimensions = 8;

        for (int rowNumber = 1; rowNumber <= dimensions; rowNumber++) {
            for (int colNumber = 1; colNumber <= dimensions; colNumber++) {
                Characteristic row = new ConcreteCharacteristic("row", new IntegerValue(rowNumber));
                Characteristic col = new ConcreteCharacteristic("column", new IntegerValue(colNumber));
                Characteristic name = new ConcreteCharacteristic("name",
                        new ArbitraryValue<String>(this.createName(rowNumber, colNumber)));
                ArrayList<Characteristic> characteristics = new ArrayList<>();
                characteristics.add(name);
                characteristics.add(row);
                characteristics.add(col);
                Section thisSection = new ConcreteSection();
                thisSection.setCharacteristics(characteristics);
                sections.add(thisSection);

                SectionConnection thisConnection = new SectionConnection(thisSection, previousSection);
                connections.add(thisConnection);
                previousSection = thisSection;

            }
        }

        return allPotentialParts;
    }

    private String createName(int rowNumber, int colNumber) {
        String colName = null;

        switch (colNumber) {
        case 1:
            colName = "A";
            break;
        case 2:
            colName = "B";
            break;
        case 3:
            colName = "C";
            break;
        case 4:
            colName = "D";
            break;
        case 5:
            colName = "E";
            break;
        case 6:
            colName = "F";
            break;
        case 7:
            colName = "G";
            break;
        case 8:
            colName = "H";
            break;
        default:
            throw new RuntimeException("illegal argument");
        }

        return new String(colName + rowNumber);
    }

}
