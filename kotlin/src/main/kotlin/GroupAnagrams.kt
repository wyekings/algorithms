package org.wyekings

class GroupAnagrams {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, List<String>>()
        strs.forEach {
            val charArray = it.toCharArray()
            charArray.sort()
            val key = String(charArray)
            val list = map.getOrDefault(key, emptyList()).toMutableList()
            list.add(it)
            map[key] =list
        }
        return map.values.toList()
    }

}