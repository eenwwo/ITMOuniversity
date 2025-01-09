package Enums;

public enum Action {
    LEAVE(" выйти "),
    LOSE(" потерять "),
    TELL(" рассказать "),
    WAIT(" ждать "),
    RELEASE(" выпустить "),
    UNANCHOR(" снять с якоря "),
    ANCHOR(" встать на якорь "),
    CUT(" отрезала "),
    MISS(" упустить ");

    private final String action;
    Action(String text) {
        this.action = text;
    }
    public String getAction() {
        return action;
    }
}
