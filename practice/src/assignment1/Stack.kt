package assignment1

class Stack<T> {

    private var stack = ArrayList<T>()

    fun push(element: T) {
        stack.add(element)
    }
    fun pop(): T? {
        if(stack.isEmpty()) {
            return null
        }
        return stack.removeAt(stack.size - 1)
    }
    fun size(): Int {
        return stack.size;
    }
    fun find(element: T): Boolean {
        return stack.contains(element)
    }
}