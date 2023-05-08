package UITestingSprint_1;

import org.junit.jupiter.api.Test;

public class Cycle {

    @Test // Цикл for
    // Цикл for пригодится, когда число повторений известно заранее.
    public void cycleFor() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Печатаем: " + i);
        }
        System.out.println("\n хватит.");
    }

    @Test
    public void conditionalLoopsAndNestedLoops() {
        int freeHours = 4; // Объявили переменную с количеством свободного времени в часах и присвоили ей значение

        checkReading(freeHours); // вызываем метод с циклом и передаём в него количество свободного времени
    }

    public static void checkReading(int freeHours) {// метод принимает количество свободного времени как параметр
        if (freeHours >= 2) { // Цикл сработает, только если есть два или больше часа свободного времени
            for (int i = 1; i < 4; i = i + 1) {
                System.out.println("Анатолий прочитал " + i + "-ю главу");
            }
        } else {
            System.out.println("Сегодня не читаем.");
        }
    }
}

