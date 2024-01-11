package org.gamehunter.creategame.interfaces.command;

public interface Command {
    Command execute();

    Command undo();
}
