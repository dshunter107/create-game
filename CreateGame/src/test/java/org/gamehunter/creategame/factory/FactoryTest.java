package org.gamehunter.creategame.factory;

import java.util.ArrayList;

import org.gamehunter.creategame.constants.GameAreaName;
import org.gamehunter.creategame.exceptions.InvalidNumberException;
import org.gamehunter.creategame.interfaces.factory.Product;
import org.gamehunter.creategame.locations.GameLocation;
import org.gamehunter.creategame.objects.characteristics.ConcreteCharacteristic;
import org.gamehunter.creategame.values.ArbitraryValue;
import org.gamehunter.creategame.values.IntegerValue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FactoryTest {

    @Test
    void testFactoryDesignPattern() {
        GameLocation inLocation = new GameLocation(GameAreaName.COMMON);
        CardFactory cf = new CardFactory();

        ArrayList<String> suits = new ArrayList<>();
        suits.add("Spades");
        suits.add("Hearts");
        suits.add("Clubs");
        suits.add("Diamonds");
        ArrayList<Product> cards = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            for (String s : suits) {
                ArrayList<ConcreteCharacteristic> characteristics = new ArrayList<>();
                characteristics.add(new ConcreteCharacteristic("Number", new IntegerValue(i)));
                characteristics.add(new ConcreteCharacteristic("Suit", new ArbitraryValue<String>(s)));
                String numberName = this.numberName(i);
                characteristics.add(new ConcreteCharacteristic("Number Name", new ArbitraryValue<String>(numberName)));
                characteristics.add(new ConcreteCharacteristic("Name",
                        new ArbitraryValue<String>(numberName + "Of" + s)));
                cards.add(cf.create(inLocation, characteristics));
            }
        }

        assert cards.size() == 40;
    }

    private String numberName(int i) {
        String numberName;
        switch (i) {
        case 1:
            numberName = "Ace";
            break;
        case 2:
            numberName = "Two";
            break;
        case 3:
            numberName = "Three";
            break;
        case 4:
            numberName = "Four";
            break;
        case 5:
            numberName = "Five";
            break;
        case 6:
            numberName = "Six";
            break;
        case 7:
            numberName = "Seven";
            break;
        case 8:
            numberName = "Eight";
            break;
        case 9:
            numberName = "Nine";
            break;
        case 10:
            numberName = "Ten";
            break;
        case 11:
            numberName = "Jack";
            break;
        case 12:
            numberName = "Queen";
            break;
        case 13:
            numberName = "King";
            break;
        default:
            throw new InvalidNumberException("Invalid Number");
        }
        return numberName;
    }

}
