package pokemons;

import moves.Slakoth.*;
import moves.Vigoroth.*;
import ru.ifmo.se.pokemon.*;

public class Vigoroth extends Slakoth {
    public Vigoroth(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(60, 60, 60, 35, 35, 30);
        setMove(new ShadowClaw(), new Rest(), new FocusEnergy());
    }

}
