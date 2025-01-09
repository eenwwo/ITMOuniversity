package Entities;

public abstract class Character {
    protected String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Описание действия персонажа
    public abstract void performAction();
}
