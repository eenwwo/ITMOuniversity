package Entities;

public class ShoreMember extends Character {
    public ShoreMember(String name) {
        super(name);
    }

    @Override
    public void performAction() {
        System.out.print(name + " ждет на берегу.");
    }
}
