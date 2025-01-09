package Enums;

public enum BoatState {
    ANCHORED("на якоре"),
    MOVING("не на якоре");

    private final String state;
    BoatState(String text) {
        this.state = text;
    }
    public String getState() {
        return state;
    }
}
