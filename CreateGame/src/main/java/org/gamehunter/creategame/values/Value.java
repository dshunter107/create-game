package org.gamehunter.creategame.values;

import org.gamehunter.creategame.interfaces.prototype.Prototype;
import org.gamehunter.creategame.objects.upgrades.executions.ExecutionEnvironment;

/**
 * Allows for different types of values. Types: (1) NoValue (2) BooleanValue (3)
 * IntegerValue (4) ArbitraryValue
 */
public interface Value extends Prototype {

    <V> V getValue();

    Value operation(Value secondValue, ExecutionEnvironment execution);

    @Override
    Value createClone();

}
