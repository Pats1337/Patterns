interface ArithmeticStrategy {
    fun arithmetic(a: Int, b: Int): Int
}

class AdditionStrategy : ArithmeticStrategy {
    override fun arithmetic(a: Int, b: Int): Int {
        return a + b
    }
}

class SubtractionStrategy : ArithmeticStrategy {
    override fun arithmetic(a: Int, b: Int): Int {
        return a - b
    }
}

class MultiplicationStrategy : ArithmeticStrategy {
    override fun arithmetic(a: Int, b: Int): Int {
        return a * b
    }
}

fun arithmetic(arithmeticStrategy: ArithmeticStrategy, a: Int, b: Int): Int {
    return arithmeticStrategy.arithmetic(a, b)
}

fun main() {
    val a = 10
    val b = 5
    println(arithmetic(AdditionStrategy(), a, b))
    println(arithmetic(SubtractionStrategy(), a, b))
    println(arithmetic(MultiplicationStrategy(), a, b))
}