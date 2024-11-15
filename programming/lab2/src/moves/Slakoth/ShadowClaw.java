package moves.Slakoth;

import ru.ifmo.se.pokemon.*;

public class ShadowClaw extends PhysicalMove {
    public ShadowClaw() {
        super(Type.GHOST, 70, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, -1);
    }
    @Override
    protected String describe() {
        return "использует ShadowClaw";
    }
}
