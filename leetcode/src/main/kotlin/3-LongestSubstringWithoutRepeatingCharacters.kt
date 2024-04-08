package com.wye

import kotlin.math.max

class LongestSubstringWithoutRepeatingCharacters {

    fun lengthOfLongestSubstring(s: String): Int {
        val n = s.length
        var ans = 0
        var j = 0
        val set = hashSetOf<Char>()
        s.forEachIndexed { index, c ->
            if (index > 0) {
                set.remove(s[index - 1])
            }

            while (j <= n-1 && !set.contains(s[j])) {
                set.add(s[j])
                j++
            }
            ans = max(ans,j - index)
        }
        return ans
    }
}