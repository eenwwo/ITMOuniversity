package moves.Lilligant;

import ru.ifmo.se.pokemon.*;

public class PetalBlizzard extends PhysicalMove {
    public PetalBlizzard() {
        super(Type.GRASS, 90, 100);
    }

    @Override
    protected String describe() {
        return "использует PetalBlizzard";
    }
}
