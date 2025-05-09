/**
 * В переменной celsius хранится целое число — температура воздуха.
 * Выведите в консоль:
 * ○ «Freezing», если celsius ≤ 0;
 * ○ «Cool», если 1 ≤ celsius ≤ 15;
 * ○ «Warm», если 16 ≤ celsius ≤ 25;
 * ○ «Hot», если celsius > 25.
 */
fun task1(celsius: Int) {
    if (celsius <= 0) {
        println("Freezing")
    } else if (celsius >= 1 && celsius <= 15) {
        println("Cool")
    } else if (celsius >= 16 && celsius <= 25) {
        println("Warm")
    } else if (celsius > 25) {
        println("Hot")
    }
}

/**
 * Пассажир сообщает свой возраст в переменной age.
 * Определите стоимость билета по тарифам и выведите найденную стоимость:
 * ○ до 7 лет (включительно) — 0 ₽,
 * ○ 8–17 лет — 15 ₽,
 * ○ 18–60 лет — 30 ₽,
 * ○ старше 60 лет — 20 ₽.
 */
fun task2(age: Int) {
    when (age) {
        in 0..7 -> println("0 rub")

        in 8..17 -> println("15 rub")

        in 18..60 -> println("30 rub")

        else -> println("20 rub")
    }
}

/**
 * В переменной month дан номер месяца (1–12).
 * Напечатайте название времени года на английском: «Winter», «Spring», «Summer»
 * или «Autumn».
 */
fun task3(month: Int) {
    when (month) {
        1, 2, 12 -> println("Winter")
        3, 4, 5 -> println("Spring")
        6, 7, 8 -> println("Summer")
        9, 10, 11 -> println("Autumn")
        else -> println("It season doesn't exist")
    }
}

/**
 * В переменной ch хранится одна заглавная латинская буква (A – Z). Выведите строку
 * «YES», если эта буква относится к гласным (A, E, I, O, U, Y), и «NO» в противном
 * случае.
 */
fun task4(ch: Char) {
    val yes = "YES"
    val no = "NO"
    when (ch) {
        'A', 'E', 'I', 'O', 'U', 'Y' -> println(yes)
        else -> println(no)
    }
}

/**
 * Пользователь вводит число n (1–9).
 * Выведите в одной строке через пробел значения n × 1, n × 2, …, n × 10.
 *
 * @param i - счетчикк
 */
fun task5(n: Int) {
    if (n in 1..9) {
        for (i in 1..10) {
            print("${n * i} ")
        }
        print('\n')
    }
}

/**
 * В коде объявлен массив cities из пяти названий городов.
 * Выведите их по одному на строке в обратном порядке (последний → первый).
 *
 * @param index - индексы
 */
fun task6() {
    val cities = arrayOf<String>("Amsterdam", "Moscow", "Barcelona", "Dublin", "Geneva")
    for (index in 4 downTo 0) {
        print(cities[index] + " ")
    }
    print('\n')
}

/**
 * Вводится произвольная строка text.
 * Посчитайте и выведите количество русских гласных букв
 * («аоиеёэыуюя», регистр неважен).
 *
 * @param vowels - список гласных букв
 * @param count - счетчик гласных букв в строке
 */
fun task7(text: String) {
    //val text = readln()
    val vowels = listOf('а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я')
    var count = 0
    for (letter in text.lowercase()) {
        if (letter in vowels) {
            count++
        }
    }
    println("$count")
}

/**
 * Есть изменяемый список целых чисел numbers: MutableList<Int>. Последний
 * элемент списка равен 0. Определите наименьшее значение среди всех элементов,
 * стоящих до этого нуля, и запишите результат в переменную minValue: Int.
 */
fun task8() {
    val numbers: MutableList<Int> = mutableListOf(5, 0, 6, -5, 100, 0)
    var minValue: Int = 0
    for (index in 0 until (numbers.size - 1)) {
        if (numbers[index] < minValue) {
            minValue = numbers[index] // -5
        }
    }
    //println("$minValue")
    //в задании не было сказано про вывод наименьшего числа
}

/**
 * Дан список целых чисел data: List<Int>.
 * Просматривайте элементы по порядку, накапливая их сумму в переменной total:
 * Int, до тех пор, пока total не станет больше 1000. По завершении работы
 * программы в total должно находиться получившееся итоговое значение.
 *
 * @param sum - предельная сумма
 * @param flag - сигнальная метка
 */
fun task9() {
    val data: List<Int> = listOf(300, 300, 300, 300, 5)
    var total: Int = 0
    val sum = 1000
    var flag = 0
    while (flag != 1) {
        for ((index, _) in data.withIndex()) {
            if (total <= sum) {
                total += data[index]
            }
            if (total >= sum) {
                flag = 1
            }
        }
    }
    //println("$total")
    //1200
    //в задании не было сказано про вывод числа
}

/**
 * Задано натуральное число k: Int. Найдите наименьшую степень двойки 2^m,
 * которая не меньше k, и сохраните это значение в переменной closestPower: Int.
 * Число m выводить или сохранять не требуется.
 */
fun task10(k: Int) {
    var m: Int = 0
    var closestPower: Int = 1

    while (k > 0) {
        closestPower *= 2
        m++
        if (closestPower >= k) {
            break
        }
    } // при k = 6: m = 3, closestPower = 8
    //println("$m " + "$closestPower")
    //в задании не было сказано про вывод числа
}

/**
 * В коде уже объявлена переменная middleName: String? = null.
 * Напечатайте строку вида «Количество символов = X»,
 * где X — длина middleName, если значение не null,
 * или 0, если переменная равна null.
 */
fun task11() {
    val middleName: String? = null
    if (middleName == null) {
        println("Number of characters = 0")
    } else {
        val X = middleName.length
        println("Number of characters = $X")
    }
}


fun main() {
    task1(celsius = 0)
    task2(age = 61)
    task3(month = 12)
    task4(ch = 'M')
    task5(n = 2)
    task6()
    task7(text = "Привет, Мир")
    task8()
    task9()
    task10(k = 6)
    task11()
}



