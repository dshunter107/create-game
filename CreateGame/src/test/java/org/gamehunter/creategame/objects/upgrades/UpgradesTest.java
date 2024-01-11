package org.gamehunter.creategame.objects.upgrades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.gamehunter.creategame.objects.characteristics.Characteristic;
import org.gamehunter.creategame.objects.characteristics.ConcreteCharacteristic;
import org.gamehunter.creategame.objects.upgrades.operations.Operation;
import org.gamehunter.creategame.objects.upgrades.operations.doubles.OperationDoubleAdd;
import org.gamehunter.creategame.objects.upgrades.operations.doubles.OperationDoubleMax;
import org.gamehunter.creategame.objects.upgrades.operations.doubles.OperationDoubleMultiply;
import org.gamehunter.creategame.values.DoubleValue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UpgradesTest {

    @Test
    void testDecoratorDesignPattern() {
        String weapon = "weapon";
        Operation doubleAdd = new OperationDoubleAdd();
        Operation doubleMax = new OperationDoubleMax();
        Operation doubleMultiply = new OperationDoubleMultiply();

        Characteristic mainCharacteristic = new ConcreteCharacteristic(weapon, new DoubleValue(4));
        Upgrade characteristicModifier1 = new CharacteristicUpgrade(weapon, new DoubleValue(1))
                .setNestedObject(mainCharacteristic).setOperation(doubleAdd);
        Upgrade characteristicModifier2 = new CharacteristicUpgrade(weapon, new DoubleValue(2))
                .setNestedObject(characteristicModifier1).setOperation(doubleAdd);
        Upgrade characteristicModifier3 = new CharacteristicUpgrade(weapon, new DoubleValue(3))
                .setNestedObject(characteristicModifier2).setOperation(doubleAdd);

        assertEquals(10.0, (Double) characteristicModifier3.getValue().getValue());

        characteristicModifier1.setOperation(doubleMax);
        characteristicModifier2.setOperation(doubleMax);
        characteristicModifier3.setOperation(doubleMax);

        assertEquals(4.0, (Double) characteristicModifier3.getValue().getValue());

        characteristicModifier1.setOperation(doubleMultiply);
        characteristicModifier2.setOperation(doubleMultiply);
        characteristicModifier3.setOperation(doubleMultiply);

        assertEquals(24.0, (Double) characteristicModifier3.getValue().getValue());
    }
}
