package com.wye

class MoveZeroes {
    fun moveZeros(nums: IntArray) {
        var left = 0
        var right = 0
        val length = nums.size
        while (right < length) {
            if (nums[right] != 0) {
                if (left != right) {
                    val temp = nums[left]
                    nums[left] = nums[right]
                    nums[right] = temp
                }
                left++
            }
            right++
        }
    }
}