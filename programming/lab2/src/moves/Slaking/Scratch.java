package moves.Slaking;

import ru.ifmo.se.pokemon.*;

public class Scratch extends PhysicalMove {
    public Scratch() {
        super(Type.NORMAL, 40, 100);
    }

    @Override
    protected String describe() {
        return "использует Scratch";
    }
}
