package UITesting.Sprint_2;

public class DataTypes {
    /**
    Строгая и статическая типизация
     * Статическая типизация
     * Java — язык с явной статической типизацией.
     * Явная типизация — это когда разработчик сам задаёт типы, пока пишет код.
     * Статическая — разработчик делает типизацию до запуска программы.
     * Другой подход — динамическая типизация.
     * Разработчики не задают тип переменных — программа сама определяет его, пока исполняет код.
     * Например, программа видит переменную 42 и присваивает ей тип — «целое число». Так это работает в Python.
     */

    /**
     * Примитивы: целочисленные типы
     *
     * Тип                                  Размер	                            Диапазон
     * byte (от англ. bite — «кусать»)	    8 бит	                        от -128 до 127
     * short (англ. — «короткий»)	        16 бит	                        от -32 768 до 32 767
     * int (англ. «целое число»)	        32 бита                 от -2 147 483 648 до 2 147 483 647
     * long (англ. «длинный»)	            64 бита     от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 (18 нулей)
     */

    /**
     *Примитивы: дробные типы
     *
     * Тип	    Размер	        Диапазон
     * float    32 бита         от 1.4∗10−451.4∗10−45 (45 знаков после запятой) до 3.4∗10383.4∗1038 (число с 38 нулями)
     * double   64 бита         от 4.9∗10−3244.9∗10−324 до 4.9∗103084.9∗10308
                           (от значений больше, чем с 300 знаками после запятой, — до значений больше, чем с 300 нулями)
     */

    /**
     * Логический тип
     *
     * Логический тип данных boolean может принимать два значения:
     * true (англ. «истинно, верно») и false (англ. «ложно, неверно»).
     */

    /**
     * Значения по умолчанию
     *
     * целочисленные типы — 0;
     * дробные — 0.0;
     * символьные — \u0000 . Это символ, который обозначает пустоту или «ничего» в «Юникоде»;
     * логический — false;
     * ссылочные — null (англ. «ноль»). Оно означает, что переменная ссылается «в никуда».
     */
}
