package org.gamehunter.creategame.objects.characteristics;

import org.gamehunter.creategame.interfaces.prototype.Prototype;
import org.gamehunter.creategame.values.Value;

public interface Characteristic extends Prototype {
    String getName();

    void setName(String name);

    Value getValue();

    void setValue(Value value);

    @Override
    Characteristic createClone();
}
