package org.wyekings

class SubstringSearch {

    fun bf(haystack: String, needle: String): Int {
        val m = haystack.length
        val n = needle.length
        for (i in 0..(m - n)) {
            var flag = true
            for (j in 0..<n) {
                if (haystack[i + j] != needle[j]) {
                    flag = false
                    break
                }
            }
            if (flag) {
                return i
            }
        }
        return -1
    }

    fun kmp(haystack: String, needle: String): Int {
        val m = haystack.length
        val n = needle.length

        val next = getNext(needle)

        var j = 0
        for (i in 0..<m) {
            while (j > 0 && haystack[i] != needle[j]) {
                j = next[j - 1]
            }

            if (haystack[i] == needle[j]) {
                j++
            }

            if (j == n) {
                return i - n + 1
            }
        }

        return -1
    }

    fun getNext(needle: String): IntArray {
        val length = needle.length
        val next = IntArray(length)
        next[0] = 0
        var j = 0
        for (i in 1..<length) {
            while (j > 0 && needle[i] != needle[j]) {
                j = next[j - 1]
            }
            if (needle[i] == needle[j]) {
                j++
            }
            next[i] = j
        }
        return next
    }
}