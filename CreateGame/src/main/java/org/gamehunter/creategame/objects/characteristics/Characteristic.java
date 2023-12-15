package org.gamehunter.creategame.objects.characteristics;

import org.gamehunter.creategame.values.Values;

public interface Characteristic {
    public String getName();

    public void setName(String name);

    public Values getValue();

    public void setValue(Values value);
}
