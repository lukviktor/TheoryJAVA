package UITestingSprint_1;

import org.junit.jupiter.api.Test;

public class Arrays {
    String[] buttons = {"Купить", "Снять", "Посуточно", "Новостройки"};// так выглядит массив: скоро ты научишься его создавать
    int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


    /**
     * Как создать массив,
     * Чтобы объявить массив, нужно:
     * 1. Указать тип значений, которые будут храниться в массиве: int, double, boolean, String или любой другой.
     * 2. Поставить квадратные скобки []. Именно они показывают, что перед нами массив.
     * 3. Указать имя массива. Например, buttons. Правила для имени массива те же самые, что и для переменной.
     * 4. Поставить оператор присваивания = и перечислить значения в фигурных скобках. Это называется инициализацией массива.
     */

    @Test
    public void setButtons() {
        System.out.println("Вы нажали кнопку: " + buttons[0]);//вывели значение элемента с индексом 0
        System.out.println("Вы нажали кнопку: " + buttons[1]);//вывели значение элемента с индексом 1
        System.out.println("Вы нажали кнопку: " + buttons[2]);//вывели значение элемента с индексом 2
        System.out.println("Вы нажали кнопку: " + buttons[3]);//вывели значение элемента с индексом 3
        System.out.println("Вы нажали кнопку: " + buttons[4]);//ошибка! Index 4 out of bounds for length 4
    }

    /**
     * Изменить значение элемента
     * <p>
     * Значение любого элемента в массиве можно изменить. Чтобы это сделать, нужно:
     * 1. Найти нужный элемент через его индекс. Например, ты меняешь кнопку «Купить» — это элемент с индексом 0: buttons[0].
     * 2. Задать новое значение через оператор присваивания =.
     * Например, можем поменять значение на «Смотреть на карте»: buttons[0] = "Смотреть на карте";
     */
    @Test
    public void changeValueOfElement() {
        // Выводим список названий кнопок, обращаясь к индексам элементов
        System.out.println("Список кнопок для приобретения и съёма недвижимости:");
        System.out.println(buttons[0]);
        System.out.println(buttons[1]);
        System.out.println(buttons[2]);
        System.out.println(buttons[3]);

        System.out.println("Если хочется своё, нажмите: " + buttons[0]);
        buttons[0] = "1"; // поменяли значение элемента на 1
        System.out.println("Но если денег мало, хватит только на " + buttons[0] + "-комнатную");

        System.out.println("Если денег на покупку нет, нажмите: " + buttons[1]);
        buttons[1] = "2"; // поменяли значение элемента на 2
        System.out.println("Тут уже можно снять " + buttons[1] + "-комнатную");

        System.out.println("А если вы в городе ненадолго, нажмите: " + buttons[2]);
        buttons[2] = "3"; // поменяли значение элемента на 3
        System.out.println("В этом случае уже можно пожить в " + buttons[2] + "-комнатной");

        System.out.println("А если хотите переехать с большой семьёй в новую квартиру, нажмите: " +
                buttons[3]);
        buttons[3] = "4+"; // поменяли значение элемента на 4+
        System.out.println("Ну а раз семья большая, то нужно брать квартиру с " + buttons[3] +
                " комнатами");

        // Теперь список названий кнопок другой
        System.out.println("Новый список кнопок для количества комнат:");
        System.out.println(buttons[0]);
        System.out.println(buttons[1]);
        System.out.println(buttons[2]);
        System.out.println(buttons[3]);
        System.out.println(buttons);
    }

    @Test
    public void setApple() {
        int[] waterConsumption = new int[3]; // Создай массив

        // Задай значение элементов массива
        waterConsumption[0] = 200;
        waterConsumption[1] = 400;
        waterConsumption[2] = 150;

        System.out.println(waterConsumption[0] + " " +
                waterConsumption[1] + " " +
                waterConsumption[2]); // Выведи на экран значения массива
        System.out.println("\n");
        System.out.println(waterConsumption.length);
        System.out.println("\n");
        for (int i = 0; i < waterConsumption.length; i++)
            System.out.println(waterConsumption[i]);
    }
}
