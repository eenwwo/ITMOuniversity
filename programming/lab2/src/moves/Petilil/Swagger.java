package moves.Petilil;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.33) {
            p.setMod(Stat.ATTACK, -1);
        }
    }

    @Override
    protected String describe() {
        return "использует Swagger";
    }
}

