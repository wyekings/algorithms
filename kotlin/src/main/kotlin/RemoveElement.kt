package org.wyekings

class RemoveElement {

    fun removeElement(nums: IntArray, value: Int): Int {
        var left = 0
        var right = nums.size - 1
        while (left < right) {
            if (nums[left] == value) {
                nums[left] = nums[right--]
            } else {
                left++
            }
        }
        return left
    }
}