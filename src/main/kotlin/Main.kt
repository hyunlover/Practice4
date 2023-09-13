fun main(args: Array<String>) {

     // 1 задача

    fun printFullName( firstName: String, lastName: String ) // создание функции, которая принимает 2 строки
    {
        val fullName = "$firstName $lastName"; // создание константы для полного имени
        println(fullName); // вывод константы
    }

    // 2 задача

    printFullName(firstName = "Юлия", lastName = "Панченко"); // вызов функции именованными аргументами

    // 3 задача

    fun calculateFullName( firstName: String, lastName: String) : String // создание функции для возвращения имени
    {
        return "$firstName $lastName"; // возвращение имени в виде строки
    }
    val myName = calculateFullName(firstName = "Юлия", lastName = "Панченко"); /* создание константы и сохранение
                                                                               имени с помощью функции*/
    println(myName); // вывод константы

    // 4 задача

    fun calculateFullName1( firstName: String, lastName: String) : Pair< String , Int> // изменение функции
    {
        val fullName = "$firstName $lastName"; // создание константы, содержащей полное имя
        return Pair (fullName, fullName.length ); // возвращение Pair, содержащей полное имя и его длину
    }
    val nameLength = calculateFullName1(firstName = "Юлия", lastName = "Панченко"); /* создание константы и сохранение
                                                                               имени с помощью функции*/
    println(nameLength); // вывод константы

    // 5 задача

    fun number( number: Int): Boolean // создание функции для нахождения целого числа
    {
        if (number<1) // условие, меньше ли 1 число
        {
            return false; // если число меньше 1, то оно не целое, не возвращаем
        }
        for (i in 2 until number) // создание цикла для проверки
        {
            if (number % i ==0 ) // условие, делится ли число без остатка
            {
                return false; // если делится с отстатком, значит не целое, не возвращаем
            }
            else
            {
                return true; // если делится без остатка, возвращаем
            }
        }

    }
    fun main() // создание главной функции
    {
        val number = 8; // создание константы и присваивание ей значения
        if (number(number)) // узнаем, целое ли число с помощью функции number
        {
            println("$number простое") // вывод константы
        }
        else
        {
            println("$number не простое") // вывод константы
        }
    }

    // 6 задача

    fun fibonacci (a: Int) : Int // создание функции для вычисления значения из последовательности фибоначчи
    {
        if ( a <=0 ) // условие, если меньше или равно 0
        {
            return 0; // возвращаем 0
        }
        if ( a==1 || a==2) // условие, если равно 1 или 2
        {
            return 1; // возвращаем 1(по условию задачи)
        }
        return fibonacci(a-1)+fibonacci(a-2) // возвращение значения (по сумме двух предыдущих
    }
    println(fibonacci(1)); // вывод значений
    println(fibonacci(2));
    println(fibonacci(3));
    println(fibonacci(4));
    println(fibonacci(5));



}