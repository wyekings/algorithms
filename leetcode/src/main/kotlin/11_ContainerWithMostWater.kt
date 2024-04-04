package com.wye

import kotlin.math.max
import kotlin.math.min

class ContainerWithMostWater {

    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.lastIndex
        var ans = 0
        while (left < right) {
            val area = min(height[left], height[right]) * (right - left)
            ans = max(ans, area)
            if (height[left] <= height[right]) {
                left++
            } else {
                right--
            }
        }
        return ans
    }
}