package `1`

import java.io.File
fun main() {
    val input = File("AOC-Kotlin-2022/src/data/input.txt").readLines()

    fun part1(list: List<String>): Int {
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

    fun part2(list: List<String>){
        var snacks: IntArray = intArrayOf()
        var currSum: Int = 0

        for (line in list) {
            if (line.equals("")) {
                snacks += currSum
                currSum = 0
            } else {
                currSum += line.toInt()
            }
        }
        snacks.sort()
        println(snacks.get(snacks.size-1).toString()+" "+snacks.get(snacks.size-2).toString()+" "+snacks.get(snacks.size-3).toString())
    }

    println(part1(input))
    println(part2(input))
}

