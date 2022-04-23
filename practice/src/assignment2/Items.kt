package assignment2

class Items {

    private val items: List<Item>

    fun countTotalPrice(): Int =  items.sumBy { item -> item.price }

    fun getItems(): List<Item> = this.items

    constructor(items: List<Item>) {
        this.items = items
    }
}
