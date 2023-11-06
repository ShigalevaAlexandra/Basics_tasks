// Создать приложение, с помощью которого пользователь, введя целое число n и основание степени x узнает,
// существует ли целочисленный показатель степени y для которого выполняется равенство xy = n.
// В случае, если показатель существует – вычислить его и вывести.
// В противном случае вывести текст – «Целочисленный показатель не существует».

import kotlin.math.log
fun main() {
    println("x ^ y = n")
    print("Введите ЦЕЛОЕ число n: ")
    val chislo_n = readln().toInt()
    print("Введите основание x: ")
    val osnovanie_x = readln().toFloat()

    println("Вычесляем целочисленный показатель степени (y)...")
    var pokazatel_y = log(chislo_n.toFloat(), osnovanie_x) //использование функции log
    var int_part = pokazatel_y.toInt()
    var float_part = pokazatel_y - int_part //выделение вещественной части показателя

    if (float_part > 0.0) {
        println("ERROR: целочисленный показатель не существует...")
    } else {
        println("y = $pokazatel_y")
    }
}
