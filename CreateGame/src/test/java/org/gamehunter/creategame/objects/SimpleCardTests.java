package org.gamehunter.creategame.objects;

import org.gamehunter.creategame.constants.GameAreaName;
import org.gamehunter.creategame.locations.GameLocation;
import org.gamehunter.creategame.objects.characteristics.ConcreteCharacteristic;
import org.gamehunter.creategame.values.ArbitraryValue;
import org.gamehunter.creategame.values.IntegerValue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SimpleCardTests {

    @Test
    void testStrategyDesignPattern() {
        SimpleCard oneOfClubs = new SimpleCard(new GameLocation(GameAreaName.COMMON));
        oneOfClubs.addCharacteristic(new ConcreteCharacteristic("Value", new IntegerValue(1)))
                .addCharacteristic(new ConcreteCharacteristic("Suit", new ArbitraryValue<String>("Clubs")));


        assert oneOfClubs.characteristics.size() == 2;
    }

}
