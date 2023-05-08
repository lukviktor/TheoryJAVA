package UITestingSprint_1;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class Cycle {
    /**
     * Цикл for
     */
    @Test
    // Цикл for пригодится, когда число повторений известно заранее.
    public void cycleFor() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Печатаем: " + i);
        }
        System.out.println("\n хватит.");
    }

    public static void checkReading(int freeHours) {// метод принимает количество свободного времени как параметр
        if (freeHours >= 2) { // Цикл сработает, только если есть два или больше часа свободного времени
            for (int i = 0; i < 4; i = i + 1) {
                System.out.println("Печатаем: " + i);
            }
        } else {
            System.out.println("Больше не печатаем.");
        }
    }

    @Test
    public void conditionalLoopsAndNestedLoops() {
        int freeHours = 5; // Объявили переменную с количеством свободного времени в часах и присвоили ей значение

        checkReading(freeHours); // вызываем метод с циклом и передаём в него количество свободного времени
    }


    /**
     * Цикл while
     */
    @Test
    public void whileCycle() {
        int liters = 50; // Литры топлива
        while (liters > 1) { // Условие работы цикла - пока остался хотя бы 1 литр бензина
            liters = liters - 1; // Тратим 1 литр бензина за раз
        }

        System.out.println("Бензин кончился! Пора на заправку!");
    }

    @Test
    public void debt() {
        Random random = new Random(); // Генерирует случайное число

        int monthCount = 0; // Для учёта того, сколько месяцев понадобилось для возврата долга
        int moneyTotal = 0; // Суммарное количество отданных денег
        int rublesAMonth; // Сколько было отдано в этом месяце
        int credit = 50000; // Сколько нужно отдать
        int min = 3000; // Минимальная сумма, которую нужно отдавать
        int max = 5000; // Максимальная сумма, которую можно отдавать

        while (moneyTotal < credit) {
            int diff = max - min; // Разница между тем, что нужно отдать обязательно, и тем, что ты можешь отдать
            rublesAMonth = random.nextInt(diff + 1) + min; // Случайная сумма, которую ты отдашь в этом месяце (минимальное значение + то, что свыше минимального платежа)
            //System.out.println(rublesAMonth);
            moneyTotal = moneyTotal + rublesAMonth; // Добавили эти деньги к отданным
            //System.out.println(moneyTotal);
            monthCount = monthCount + 1; // Засчитали месяц
            //System.out.println(monthCount);
        }

        System.out.println("Ура! Ты отдал долг в " + credit + " р. за " + monthCount + " месяцев.");
    }
}


