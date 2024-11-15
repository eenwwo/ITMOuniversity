package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.Phione.*;

public class Phione extends Pokemon {
    public Phione(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(80, 80, 80, 80, 80, 80);
        setMove(new BubbleBeam(), new DazzlingGleam(), new DoubleTeam(), new Waterfall());
    }

}
