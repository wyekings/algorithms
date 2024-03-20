package org.wyekings


/**
 * https://leetcode.cn/problems/two-sum
 */
class Solution {

    /**
     * time complexity: O(n2)
     * space complexity: O(1)
     */
    fun twoSum1(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            for (j in (i + 1) until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }

    /**
     * time complexity: O(n)
     * space complexity: O(n)
     */
    fun twoSum2(nums: IntArray, target: Int): IntArray {
        val map = hashMapOf<Int,Int>()
        nums.forEachIndexed { index, num ->
            val result = target - num
            if (map.containsKey(result)) {
                return intArrayOf(map[result]!!,index)
            }
            map[num]= index
        }

        return intArrayOf()
    }

    fun twoSum3(nums:IntArray, target:Int):IntArray {
        val map = hashMapOf<Int,Int>()
        nums.forEachIndexed{index,num ->
            val result= target - num
            if (map.containsKey(result)) {
                return intArrayOf(map[result]!!,index)
            }
            map[num] = index
        }

        return  intArrayOf()
    }
}

fun main() {
    val nums = intArrayOf(2, 11, 7, 15)
    val target = 9
    val solution = Solution()

    val result1 = solution.twoSum1(nums, target)
    println("result1=${result1.toList()}")

    val result2 = solution.twoSum2(nums,target)
    println("result2=${result2.toList()}")
}