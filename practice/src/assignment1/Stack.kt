package assignment1

class Stack<T> {

    private val stack = ArrayList<T>()

    fun push(element: T) {
        stack.add(element)
    }

    fun pop(): T? {
        if (stack.isEmpty()) {
            return null
        }
        return stack.removeLast()
    }

    fun size() = stack.size
    
    fun find(element: T) = stack.contains(element)
}