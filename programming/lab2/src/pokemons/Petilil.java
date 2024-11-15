package pokemons;

import moves.Phione.*;
import ru.ifmo.se.pokemon.*;
import moves.Petilil.*;

public class Petilil extends Phione {
    public Petilil(String name, int level) {
        super(name, level);
        setType(Type.GRASS);
        setStats(45, 35, 50, 70, 50, 30);
        setMove(new DoubleTeam(), new Swagger(), new EnergyBall());
    }

}