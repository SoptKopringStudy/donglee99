package assignment2

class Printer {

    private fun printNameAndPrice(item: Item) {
        println(item.name + BLANK + item.price + WON)
    }

    private fun totalPricePrint(totalPrice: Int) {
        println(TOTAL + BLANK + totalPrice + WON)
    }

    private fun printItems(items: Items) {
        for (i in 0..items.getSize() - 1) {
            printNameAndPrice(items.getItem(i))
        }
    }

    fun view(items: Items) {
        println(OUTPUT)
        printItems(items)
        println(LINE)
        totalPricePrint(items.countTotalPrice())
    }

    companion object {
        private const val LINE = "---------------"
        private const val OUTPUT = "<출력>"
        private const val TOTAL = "총합"
        private const val BLANK = " "
        private const val WON = "원"
    }
}