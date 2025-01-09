package Logic;

import Entities.*;
import Entities.Character;
import Enums.Action;
import Enums.Location;
import Errors.AnchorException;
import Errors.BoatOverloadException;



public class Story {
    public static String play() {
        StringBuilder storyOutput = new StringBuilder();

        // 1. Дело принимало невыгодный для нас оборот.
        Deal deal = new Deal("дело ");
        System.out.println(deal.dealProcess(false));

        // Создаем окружение и объекты
        Ship ship = new Ship("Корабль");
        Boat boat = new Boat("Шлюпка", Location.SEA);
        Group shoreGroup = new Group("Группа на берегу");
        Group boatGroup = new Group("Группа в шлюпке");

        // Добавляем персонажей в группы
        for (int i = 1; i <= 7; i++) {
            shoreGroup.addMember(new ShoreMember("Человек " + i));
        }
        for (int i = 1; i <= 3; i++) {
            boatGroup.addMember(new BoatMember("Пассажир " + i));
        }

        // 2. Семеро вышли на берег
        storyOutput.append(shoreGroup.size())
                .append(" ")
                .append(Action.LEAVE.getAction())
                .append(" ")
                .append(Location.SHORE.getTitle())
                .append("\n");

        // 3. Если бы мы их захватили
        storyOutput.append("Если бы мы их захватили...\n");

        // 4. Это не принесло бы нам никакой пользы
        storyOutput.append("Это ")
                .append(Action.LOSE.getAction())
                .append(" бы пользу потому что\n");

        // 5. Мы бы упустили шлюпку с тремя остальными
        storyOutput.append("Мы бы ")
                .append(Action.MISS.getAction())
                .append(" ")
                .append(boat.getName())
                .append(" ")
                .append(" с ")
                .append(boatGroup.size())
                .append(" остальными\n");
        try {
            storyOutput.append(boat.unanchor());
            boat.move(Location.SEA);
        } catch (AnchorException e) {
            System.out.println("Ошибка: " + e.getMessage() + "\n");
        }

        // 6. Они бы рассказали
        storyOutput.append("Они бы ")
                .append(Action.TELL.getAction())
                .append(" о случившемся.\n");

        // 7. Тогда корабль бы снялся с якоря
        storyOutput.append("Тогда ")
                .append(ship.getName())
                .append(" бы ")
                .append(Action.UNANCHOR.getAction())
                .append("\n");
        storyOutput.append(ship.unanchor());

        // 8. Корабль был бы потерян
        storyOutput.append(ship.getName())
                .append(" был бы потерян.\n");

        // 9. Нам не оставалось ничего, кроме того как ждать
        storyOutput.append("\nНам не оставалось ничего кроме того как ")
                .append(Action.WAIT.getAction())
                .append("\n");
        storyOutput.append(shoreGroup.performActions());

        // 10. Семерых выпустили
        storyOutput.append(shoreGroup.size())
                .append(" ")
                .append(Action.RELEASE.getAction())
                .append(".\n");
        try {
            for (Character member : shoreGroup.getMembers()) {
                boat.addPassenger(member);
                boat.removePassenger(member); // Убираем, имитируя высадку
            }
        } catch (BoatOverloadException e) {
            storyOutput.append("Ошибка: ").append(e.getMessage()).append("\n");
        }

        // 11. Шлюпка с тремя остальными отошла на порядочное расстояние от берега
        storyOutput.append(boat.getName()).append(" с ").append(boatGroup.size()).append(" остальными")
                .append(Action.LEAVE.getAction())
                .append(" на порядочное расстояние от ")
                .append(Location.SHORE.getTitle())
                .append("\n");
        try {
            boat.move(Location.SEA);
        } catch (AnchorException e) {
            storyOutput.append("Ошибка: ")
                    .append(e.getMessage())
                    .append("\n");
        }

        // 12. Шлюпка встала на якорь
        storyOutput.append(boat.getName())
                .append(Action.ANCHOR.getAction())
                .append(".\n");
        try {
            boat.anchor();
        } catch (AnchorException e) {
            storyOutput.append("Ошибка: ")
                    .append(e.getMessage())
                    .append("\n");
        }

        // 13. Шлюпка отрезала возможность добраться до нее
        storyOutput.append(boat.getName())
                .append(Action.CUT.getAction())
                .append(" возможность добраться до ")
                .append(boat.getName())
                .append("\n");

        return storyOutput.toString();
    }
}