
class TwoSum {

    fun twoSum(nums:IntArray, target:Int):IntArray {
        val map = hashMapOf<Int, Int>()
        nums.forEachIndexed { index, num ->
            val result = target - num
            if (map.containsKey(result)) {
                return intArrayOf(map[result]!!, index)
            }
            map[num] = index
        }
        return intArrayOf()
    }
}

fun main() {
    println("-------------->")
}
