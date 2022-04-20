package assignment2

fun main() {
    var items: Items = Items(arrayOf(
            Item("돼지목살", 6000),
            Item("제로콜라", 2000),
            Item("민트초코 오레오", 1500),
            Item("진라면 순한맛", 1000)).toList())
    val printer = Printer()
    printer.view(items)
}