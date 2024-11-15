package moves.Slakoth;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().turns(2).condition(Status.SLEEP);
        p.addEffect(e);
        p.setMod(Stat.HP, (int) - (p.getStat(Stat.HP) - p.getHP()));
    }

    @Override
    protected String describe() {
        return "использует Rest";
    }
}
