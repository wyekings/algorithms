package org.wyekings

class SearchInsertPosition {

    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            val mid = (left + right) / 2
            val midValue = nums[mid]
            if (target == midValue) return mid

            if (target > midValue) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return left
    }
}