package Entities;

import Enums.BoatState;
import Enums.Location;
import Errors.AnchorException;
import Errors.BoatOverloadException;
import Interfaces.Anchorable;
import Interfaces.Movable;

import java.util.ArrayList;
import java.util.List;

public class Boat implements Movable, Anchorable {
    private String name;
    private BoatState state;
    private Location currentLocation;
    private List<Character> passengers;

    public Boat(String name, Location startLocation) {
        this.name = name;
        this.state = BoatState.ANCHORED;
        this.currentLocation = startLocation;
        this.passengers = new ArrayList<>();
    }

    @Override
    public String anchor() throws AnchorException {
        if (state == BoatState.ANCHORED) {
            throw new AnchorException(name + state.getState());
        }
        state = BoatState.ANCHORED;
        return (name + "на якоре");
    }

    @Override
    public String unanchor() throws AnchorException {
        if (state != BoatState.ANCHORED) {
            throw new AnchorException(name + state.getState());
        }
        state = BoatState.MOVING;
        return "\n" + name + " не на якоре" + "\n";
    }

    @Override
    public String move(Location Location) throws AnchorException {
        if (state == BoatState.ANCHORED) {
            throw new AnchorException(name + "не может двигаться пока " + state.getState());
        }
        state = BoatState.MOVING;
        currentLocation = Location;
        return (name + " движется к " + Location.getTitle());
    }

    // Метод для добавления пассажира
    public void addPassenger(Character passenger) {
        if (passengers.size() > 3) {
            throw new BoatOverloadException(name + "перегружена, нелья добавить " + passenger.getName());
        }
        passengers.add(passenger);
    }

    // Метод для удаления пассажира
    public void removePassenger(Character passenger) {
        passengers.remove(passenger);
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public BoatState getState() {
        return state;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public List<Character> getPassengers() {
        return passengers;
    }

    public BoatStatus getStatus() {
        return new BoatStatus(state, currentLocation, passengers.size());
    }
}
