fun main() {

    //Задача 1
    println("Пример выполнения решения задачи 1: " +
            States<Int>().getAverage(arrayOf(1, 2, 3, 4, 5)))

    //Задача 1.2
    println("Пример выполнения решения задачи 1.2: "
            + GenericMethod().isItInclude(1, arrayOf(1, 2, 3, 4, 5)))
}

//Класс для задачи 1
class States<T>() where T : Number {
    fun getAverage(array: Array<Number>): Number {
        var sum = 0.0
        array.forEach { sum += it.toDouble() }
        return sum / array.size
    }
}

//Класс для задачи 1.2
class GenericMethod {
    fun <T> isItInclude(value: T, array: Array<T>): Boolean {
        array.forEach { if (it == value) return true }
        return false
    }
}