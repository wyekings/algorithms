package org.wyekings

class LongestCommonPrefix {
    fun longestCommonPrefix1(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        var prefix = ""
        val first = strs[0]
        first.forEachIndexed { index, c ->
            for (i in 1..<strs.size) {
                val current = strs[i]
                if (index < current.length && c != current[index]) return prefix
            }
            prefix += first[index]
        }

        return prefix
    }
}

fun main() {
    val solution = LongestCommonPrefix()
    val strs = arrayOf("flower","flow","flight")
    val result = solution.longestCommonPrefix1(strs)
    println("result=$result")

}