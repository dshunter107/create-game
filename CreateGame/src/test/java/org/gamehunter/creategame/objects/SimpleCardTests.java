package org.gamehunter.creategame.objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.gamehunter.creategame.constants.GameAreaName;
import org.gamehunter.creategame.locations.GameLocation;
import org.gamehunter.creategame.objects.characteristics.ConcreteCharacteristic;
import org.gamehunter.creategame.values.ArbitraryValue;
import org.gamehunter.creategame.values.DoubleValue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SimpleCardTests {

    @Test
    void testStrategyDesignPattern() {
        SimpleCard oneOfClubs = this.createOneOfClubs();
        assert oneOfClubs.characteristics.size() == 2;
    }

    @Test
    void testPrototypeDesignPattern() {
        SimpleCard oneOfClubs = this.createOneOfClubs();
        SimpleCard secondOneOfClubs = (SimpleCard) oneOfClubs.createClone();
        assertEquals(2, secondOneOfClubs.getCharacteristics().size());
    }

    SimpleCard createOneOfClubs() {
        SimpleCard oneOfClubs = new SimpleCard(new GameLocation(GameAreaName.COMMON));
        oneOfClubs.addCharacteristic(new ConcreteCharacteristic("Value", new DoubleValue(1)))
        .addCharacteristic(new ConcreteCharacteristic("Suit", new ArbitraryValue<String>("Clubs")));
        return oneOfClubs;
    }
}
