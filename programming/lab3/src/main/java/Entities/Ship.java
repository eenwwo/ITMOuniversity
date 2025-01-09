package Entities;

import Enums.BoatState;

public class Ship {
    private String name;
    private BoatState state; // На якоре, в движении

    public Ship(String name) {
        this.name = name;
        this.state = BoatState.ANCHORED; // По умолчанию корабль на якоре
    }

    public String unanchor() {
        state = BoatState.MOVING;
        return name + " снялся с якоря и теперь в движении.\n";
    }

    public String anchor() {
        state = BoatState.ANCHORED;
        return name + " снова на якоре.\n";
    }

    public BoatState getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " сейчас " + state.getState() + ".";
    }
}