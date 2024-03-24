package org.wyekings

import java.util.Deque
import java.util.LinkedList
import java.util.Stack

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val length = s.length
        if (length % 2 == 1) return false

        val pairs = hashMapOf(
            ')' to '(',
            ']' to '[',
            '}' to '{',
        )

        val stack: Deque<Char> = LinkedList()
        s.forEach { c ->
            if (pairs.containsKey(c)) {
                if (stack.isEmpty() || stack.peek() != pairs[c]) {
                    return false
                }
                stack.pop()
            } else {
                stack.push(c)
            }
        }

        return false
    }
}