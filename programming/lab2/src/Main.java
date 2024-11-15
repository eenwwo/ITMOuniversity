import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class Main {
    public static void main(String[] args) {
        
        Battle b = new Battle();
        Pokemon p1 = new Phione("Жесткий", 1);
        Pokemon p2 = new Petilil("Вупсень", 1);
        Pokemon p3 = new Lilligant("Красавчик", 1);

        Pokemon p4 = new Slakoth("Рядовой", 1);
        Pokemon p5 = new Vigoroth("Босяк", 1);
        Pokemon p6 = new Slaking("Пупсень", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}