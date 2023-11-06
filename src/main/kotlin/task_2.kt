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