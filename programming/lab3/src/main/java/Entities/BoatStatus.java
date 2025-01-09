package Entities;

import Enums.Location;
import Enums.BoatState;

public record BoatStatus(BoatState state, Location location, int passengerCount) {
    @Override
    public String toString() {
        return "Состояние лодки: " + state.getState() +
                ", Местоположение: " + location.getTitle() +
                ", Пассажиров на борту: " + passengerCount;
    }
}
