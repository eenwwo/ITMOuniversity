package pokemons;

import moves.Slakoth.*;
import moves.Vigoroth.*;
import moves.Slaking.*;
import ru.ifmo.se.pokemon.*;

public class Slaking extends Vigoroth {
    public Slaking(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(150, 160, 100, 95, 65, 100);
        setMove(new ShadowClaw(), new Rest(), new FocusEnergy(), new Scratch());
    }

}
