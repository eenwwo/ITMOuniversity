package Entities;

public class BoatMember extends Character {
    public BoatMember(String name) {
        super(name);
    }

    @Override
    public void performAction() {
        System.out.print(name + " остался в шлюпке.");
    }
}
