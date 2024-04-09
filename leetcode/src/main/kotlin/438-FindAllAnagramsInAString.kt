package com.wye

class FindAllAnagramsInAString {

    fun findAnagrams(s: String, p: String): List<Int> {
        val sLen = s.length
        val pLen = p.length
        if (sLen < pLen) {
            return emptyList()
        }

        val ans = mutableListOf<Int>()
        val count = IntArray(26)

        for (i in p.indices) {
            ++count[s[i] - 'a']
            --count[s[i] - 'a']
        }

        var differ = 0
        count.forEach {
            if (it != 0) {
                differ++
            }
        }

        if (differ == 0) {
            ans.add(0)
        }

        for (i in 0..<(sLen - pLen)) {
            if (count[s[i] - 'a'] == 1) {
                differ--
            } else if (count[s[i] - 'a'] == 0) {
                differ++
            }
            --count[s[i] - 'a']

            if (count[s[i + pLen] - 'a'] == -1) {
                differ--
            } else if (count[s[i + pLen] - 'a'] == 0) {
                differ++
            }
            ++count[s[i + pLen] - 'a']

            if (differ == 0) {
                ans.add(i + 1)
            }
        }

        return ans
    }
}