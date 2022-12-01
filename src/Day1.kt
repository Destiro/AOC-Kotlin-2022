package `1`

import java.io.File
fun main() {
    val input = File("src", "main/kotlin/1/input.txt").readLines()

    fun mainer(list: List<String>): Int {
        var biggestSum: Int = 0
        var currSum: Int = 0

        for (line in list) {
            if (line.equals("")) {
                if (currSum >= biggestSum) {
                    biggestSum = currSum
                }
                currSum = 0
            } else {
                currSum += line.toInt()
            }
        }

        return biggestSum
    }

    println(mainer(input))
}

