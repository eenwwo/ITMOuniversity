package pokemons;

import moves.Lilligant.*;
import moves.Phione.*;
import ru.ifmo.se.pokemon.*;
import moves.Petilil.*;

public class Lilligant extends Petilil {
    public Lilligant(String name, int level) {
        super(name, level);
        setType(Type.GRASS);
        setStats(70, 60, 75, 110, 75, 90);
        setMove(new PetalBlizzard());
    }

}
