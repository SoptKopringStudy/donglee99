package assignment2

class Items {

    var items: List<Item>

    fun countTotalPrice(): Int {
        var sum: Int = 0
        for (i in 0..items.size - 1) {
            sum += items.get(i).price
        }
        return sum
    }

    fun getItem(index: Int): Item {
        return items.get(index)
    }

    fun getSize(): Int {
        return items.size
    }

    constructor(items: List<Item>) {
        this.items = items
    }
}
