package com.wye

class ThreeSum {

    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val ans = mutableListOf<List<Int>>()
        for (first in nums.indices) {
            if (nums[first] >= 0) {
                break
            }

            if (first > 0 && nums[first] == nums[first - 1]) {
                continue
            }

            var second = first + 1
            var third = nums.size - 1
            while (second < third) {
                val sum = nums[first] + nums[second] + nums[third]
                when {
                    sum < 0 -> {
                        second++
                    }

                    sum > 0 -> {
                        third--
                    }

                    else -> {
                        val list = listOf(nums[first], nums[second], nums[third])
                        ans.add(list)
                        while (second < third && nums[second + 1] == nums[second]) {
                            second++
                        }
                        while (second < third && nums[third - 1] == nums[third]) {
                            third--
                        }
                        second++
                        third--
                    }
                }
            }
        }
        return ans
    }
}

fun main() {
    val nums = intArrayOf(-1, 0, 1, 2, -1, -4)
    val solution = ThreeSum()
    solution.threeSum(nums)
}