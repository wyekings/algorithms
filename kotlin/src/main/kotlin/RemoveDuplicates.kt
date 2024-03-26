package org.wyekings

class RemoveDuplicates {

    fun removeDuplicates(nums: IntArray): Int {
        var slow = 0
        var fast = 1
        while (fast < nums.size) {
            if (nums[fast] != nums[slow]) {
                nums[++slow] = nums[fast]
            }
            fast++
        }
        return slow + 1
    }
}