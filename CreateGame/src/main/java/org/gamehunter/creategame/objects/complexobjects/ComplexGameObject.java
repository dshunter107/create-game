package org.gamehunter.creategame.objects.complexobjects;

import java.util.ArrayList;

import org.gamehunter.creategame.interfaces.prototype.ComplexPartPrototype;
import org.gamehunter.creategame.interfaces.prototype.ComplexPrototype;
import org.gamehunter.creategame.objects.SimpleGameObject;
import org.gamehunter.creategame.objects.complexobjectparts.Section;

public interface ComplexGameObject extends SimpleGameObject, ComplexPrototype {
    @Override
    ArrayList<ComplexPartPrototype> getSections();

    /*
     * Creates a one-way connection from 1 section to another
     *
     * @param sectionFrom
     *
     * @param sectionTo
     *
     * @return the ComplexGameObject
     *
     * SectionConnection createConnection(Section sectionFrom, Section sectionTo);
     */

    /**
     * Checks to see if a one-way connection exists from the first section to the
     * second section
     *
     * @param sectionFrom
     * @param sectionTo
     * @return true if there is a connection from the first section to the second
     *         section
     */
    boolean areSectionsConnected(Section sectionFrom, Section sectionTo);

}
