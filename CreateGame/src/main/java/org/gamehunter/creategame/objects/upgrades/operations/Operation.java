package org.gamehunter.creategame.objects.upgrades.operations;

import org.gamehunter.creategame.values.Value;

public interface Operation {

    Value operateValues(Value firstValue, Value secondValue);

}
