// Создать приложение, в котором пользователь вводит две различных цифры.
// На выходе приложение выдает, если это возможно, из введенных цифр, нечетное число.
// Результат выводится в консоль.
// При невозможности создать нечетное число выводится сообщение – «Создать нечетное число невозможно».
// Каждое число вводится на отдельной строке
fun main() {
    print("Введите 1-ую цифру: ")
    val first_element: Byte = readln().toByte()
    print("Введите 1-ую цифру: ")
    val second_element: Byte = readln().toByte()

    println("Генерируем нечетное число...")

    if (first_element % 2 != 0) {
        println(second_element.toString() + first_element.toString())
    } else if (second_element % 2 != 0) {
        println(first_element.toString() + second_element.toString())
    }
    else println("Создать нечетное чило невозожно((")
}