// Создать приложение, с помощью которого пользователь, введя два числа и символ операции, узнает результат.
// Символами операции могут быть: / — деление, * — умножение, + — сложение, - — вычитание.
// Числа могут быть вещественными.
// Числа и знак операции разделяются между собой одним пробелом.
//  Ввод производится в формате - ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ
fun main() {
    println("Введите числа и операцию в формате: ")
    println("число1 [пробел] число2 [пробел] операция")
    println("Доступные операции: / * + -")

    val str = readln()

    var first_element  = ""
    var second_element  = ""
    var operation = ""

    for (i in 0..(str.length-1)) { //цикл для перехода о введенноЙ строке и выбора из нее отдельно чисел и знак операции
        if ((str[i].toString() == " ") && (first_element  == "")) {
            for (j in 0..(i-1)) {
                first_element  = first_element  + str[j]
            }
        } else if ((str[i].toString() == " ") && (operation == "")) {
            operation = str[i-1].toString()
            for (j in i..(str.length-1)) {
                second_element  = second_element  + str[j]
            }
        }
    }

    when (operation) { //использование кейсов для создания миникалькулятора
        "+" -> println("$first_element + $second_element = ${first_element.toDouble() + second_element.toDouble()}")
        "-" -> println("$first_element - $second_element = ${first_element.toDouble() - second_element.toDouble()}")
        "*" -> println("$first_element * $second_element = ${first_element.toDouble() * second_element.toDouble()}")
        "/" -> println("$first_element / $second_element = ${first_element.toDouble() / second_element.toDouble()}")
        else->{
            println("ERROR: введены некорректные данные")
        }
    }

}