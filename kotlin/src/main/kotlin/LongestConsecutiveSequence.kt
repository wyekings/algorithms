package org.wyekings

import kotlin.math.max

class LongestConsecutiveSequence {

    fun longestConsecutiveSequence(nums: IntArray): Int {
        val set = hashSetOf(*(nums.toTypedArray()))
        var longestStreak = 0
        set.forEach {
            if (!set.contains(it - 1)) {
                var current = it
                var currentStreak = 0
                while (set.contains(current + 1)) {
                    current++
                    currentStreak++
                }
                longestStreak = max(longestStreak, currentStreak)
            }
        }
        return longestStreak
    }
}