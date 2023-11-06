//Создать приложение, которое подсчитывает количество различных символов во введенной строке.
// Символы в ответе расположить в алфавитном порядке. Например, дана строка AASADDSS. На выходе получаем:
// A - 3
// D - 2
// S - 3
fun main() {
    println("Введите строку:")
    val str = readLine().toString()
    val countChar = mutableMapOf<Char, Int>() //использование коллекции map
    for (char in str) {
        countChar[char] = countChar.getOrDefault(char, 0) + 1 //сравнение элементов коллекции
    }
    println("Вывод:")
    countChar.toSortedMap().forEach { (char, count) -> //сортировка элементов коллекции по алфавиту
        println("$char - $count")
    }
}