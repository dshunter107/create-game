package org.gamehunter.creategame.locations;

import org.gamehunter.creategame.constants.GameAreaName;
import org.gamehunter.creategame.objects.SimpleCard;
import org.gamehunter.creategame.objects.SimpleGameObject;
import org.gamehunter.creategame.objects.characteristics.ConcreteCharacteristic;
import org.gamehunter.creategame.values.ArbitraryValue;
import org.gamehunter.creategame.values.DoubleValue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GameLocationTests {

    @Test
    public void testObserverPattern() {
        GameLocation commonArea = new GameLocation(GameAreaName.COMMON);
        GameLocation scoreArea = new GameLocation("Score Area", commonArea);
        GameLocation mainScoreArea = new GameLocation("Main Score Area", scoreArea);
        GameLocation sideScoreArea = new GameLocation("Side Score Area", scoreArea);

        SimpleGameObject aceOfSpades = this.makeCard(mainScoreArea, 1, "Spades");
        SimpleGameObject twoOfSpades = this.makeCard(mainScoreArea, 2, "Spades");
        SimpleGameObject threeOfSpades = this.makeCard(commonArea, 3, "Spades");
        SimpleGameObject fourOfSpades = this.makeCard(sideScoreArea, 4, "Spades");

        assert commonArea.numberOfItems() == 4;
        assert scoreArea.numberOfItems() == 3;
        assert mainScoreArea.numberOfItems() == 2;
        assert sideScoreArea.numberOfItems() == 1;

        aceOfSpades.setInLocation(sideScoreArea);
        twoOfSpades.setInLocation(scoreArea);
        threeOfSpades.setInLocation(scoreArea);
        fourOfSpades.setInLocation(sideScoreArea);

        assert commonArea.numberOfItems() == 4;
        assert scoreArea.numberOfItems() == 4;
        assert mainScoreArea.numberOfItems() == 0;
        assert sideScoreArea.numberOfItems() == 2;
    }

    private SimpleGameObject makeCard(Location location, Integer number, String suit) {
        return new SimpleCard(location)
                .addCharacteristic(new ConcreteCharacteristic("Number", new DoubleValue(number)))
                .addCharacteristic(new ConcreteCharacteristic("Suit", new ArbitraryValue<String>(suit)));

    }
}
