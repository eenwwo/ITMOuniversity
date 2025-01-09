package Enums;

public enum Location {
    SHORE("берег"),
    SEA("море");

    private final String title;

    Location(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
