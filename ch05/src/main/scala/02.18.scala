object TipCalculator {
  def getTipPercentage(names: List[String]): Int = {
    if (names.size > 5) {
      20
    } else if (names.size > 0) {
      10
    } else 0
  }
}

// TipCalculator.getTipPercentage(List.empty)

val smallGroup = List("Alice", "Bob", "Charlie")
// TipCalculator.getTipPercentage(smallGroup)

val largeGroup = List("Alice", "Bob", "Charlie", "Daniel", "Emily", "Frank")
// TipCalculator.getTipPercentage(largeGroup)
