package org.wyekings

/**
 * https://leetcode.cn/problems/roman-to-integer
 */
class RomanToInteger {

    fun romanToInt(s: String): Int {
        var sum = 0
        var previous = 0
        for (i in s.length - 1 downTo 0) {
            val current = s[i].int
            if (current < previous) {
                sum -= current
            } else {
                sum += current
            }
            previous = current
        }
        return sum
    }

}

private val Char.int: Int
    get() = when (this) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> 0
    }
