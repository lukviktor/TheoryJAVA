package UITesting.Sprint_2;

import org.junit.jupiter.api.Test;

public class WrapperClasses {
    /**
     * Соответствие примитивов и обёрток
     * <p>
     * Примитив	    Обёртка
     * byte	        Byte
     * short        Short
     * int	        Integer
     * long	        Long
     * char	        Character
     * float	    Float
     * double	    Double
     * boolean	    Boolean
     */
    @Test
    public void unpackingTypes() { // Распаковка типов
        Boolean wrapper = true; // упаковали значение в класс-обёртку Boolean
        System.out.println(wrapper);
        boolean primitive = wrapper; // распаковали обратно в примитив boolean
        System.out.println(primitive);
        /**
         * Есть исключение — если в переменной класса-обёртки хранится значение null.
         * В этом случае при распаковке Java выдаст ошибку:
         */
    }

    @Test
    public void error() {
        Float wrapperError = null; // упаковка
        float primitiveError = wrapperError; // распаковка
        System.out.println(primitiveError); // значения по умолчанию для класса-обёртки Float и для примитива float не совпадают
        /**
         * Причина ошибки: значения по умолчанию для класса-обёртки Float и для примитива float не совпадают
         */
    }

    @Test
    public void parseTest() {
        /**
         * Метод parse
         * Этот метод позволяет превращать строки в числовой тип. Например, строку
         * Важно, чтобы в строку было записано именно число, а не слово. Например, строку "тысяча" метод распарсить не сможет.
         * Этот метод есть у всех классов-обёрток, кроме Character
         */
        System.out.println(Byte.parseByte("10"));
        System.out.println(Byte.parseByte("12"));
        System.out.println(Short.parseShort("345"));
        System.out.println(Integer.parseInt("999999"));
        System.out.println(Long.parseLong("1000000000000"));
        System.out.println(Float.parseFloat("12.3"));
        System.out.println(Double.parseDouble("456.789"));
        System.out.println(Boolean.parseBoolean("true"));
    }

    @Test
    public void maxAndMin() {
        /**
         * Методы max() и min()
         */
        long a = 142_858_234;
        long b = 9_123_456_678L;
        Long maximum = Long.max(a, b); // ищем максимальное из двух чисел
        System.out.println("Максимальное значение - " + maximum);

        double c = 0.00175764;
        double d = 0.00138534;
        Double minimum = Double.min(c, d); // ищем минимальное из двух чисел
        System.out.println("Минимальное значение - " + minimum);

        /**
         * Методы max() и min() работают для классов-обёрток Integer, Long, Float и Double.
         * У классов Byte и Short нет методов, которые ищут максимальное и минимальное значения.
         * Эти значения можно вычислить, если привести их к типу int. Здесь применяют приведение типов.
         */

    }

    @Test
    public void valueTest() {
        /**
         * Метод value()
         *
         * Чтобы вызвать метод, нужно написать имя переменной-объекта и использовать точечную нотацию:
         * [имя переменной-объекта].[имя примитива, к которому нужно привести]Value().
         */
        Long bigNumber = 10L;
        short smallNumber = bigNumber.shortValue();
        System.out.println(smallNumber);
    }

    /**
     * Передача в метод по ссылке и по значению
     */

    private static void changeVariable(int variable) {
        // переменная приходит в метод со значением 10
        variable = variable * 3; // значение переменной variable стало 30
    }
    @Test
    public void valueNotChanged() {
        /**
         * Здесь напечатается значение переменной number: оно не поменялось и равно 10.
         */
        int number = 10; // объявлена переменная примитивного типа

        changeVariable(number); // её значение передано в метод changeVariable
        System.out.println(number); // значение number не изменилось: оно не 30, а 10
    }
    private static int changeVariableChanged(int variable) {
        return variable = variable * 3; // возвращаем новое значение variable
    }
    @Test
    public void valueChanged(){
        /**
         * Чтобы number стало равно variable,
         * нужно вернуть новое значение из метода оператором return и присвоить его number:
         */
        int number = 10; // объявили переменную примитивного типа
        number = changeVariableChanged(number); // присвоили number новое значение
        System.out.println(number); // теперь number равно 30
    }
}
