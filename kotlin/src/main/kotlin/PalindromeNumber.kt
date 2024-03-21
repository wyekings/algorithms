package org.wyekings

class PalindromeNumberSolution {

    fun isPalindrome1(x: Int): Boolean {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false

        val str = x.toString()
        val reversed = str.reversed()
        return str == reversed
    }

    fun isPalindrome2(x: Int): Boolean {
        var remain = x
        if (remain < 0 || (remain % 10 == 0 && remain != 0)) return false

        var div = 1
        while (remain / div >= 10) div *= 10

        while (remain > 0) {
            val left = remain / div
            val right = remain % 10
            if (left != right) return false

            remain = (remain % div) / 10
            div /= 100
        }
        return true;
    }
    fun isPalindrome3(x: Int): Boolean {
        var remain = x
        if (remain < 0 || (remain % 10 == 0 && remain != 0)) return false

        var reversed = 0
        while (remain > reversed) {
            reversed = reversed * 10 + remain % 10
            remain /= 10
        }
        return remain == reversed || remain == reversed / 10
    }
}

fun main() {
    val number1 = 121
    val solution = PalindromeNumberSolution()
    val result1 = solution.isPalindrome1(number1)

    println("$number1 isPalindrome=$result1")

    val number2 = 123
    val result2 = solution.isPalindrome1(number2)
    println("$number2 isPalindrome=$result2")
}