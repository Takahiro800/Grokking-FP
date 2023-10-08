def firstTwo(list: List[String]): List[String] = {
  list.slice(0, 2)
}

def lastTwo(list: List[String]): List[String] = {
  // list.takeRight(2)
  list.slice(list.size - 2, list.size)
}

def movedFirstTwoToTheEnd(list: List[String]): List[String] = {
  val firstTwo = list.slice(0, 2)
  val withoutFirstTwo = list.slice(2, list.size)
  withoutFirstTwo.appendedAll(firstTwo)
}

def insertBeforeLast(list: List[String], element: String): List[String] = {
  val withoutLast = list.slice(0, list.size - 1)
  withoutLast.appended(element).appended(list.last)
}

object ch03_SlicingAndAppending extends App {
  assert(firstTwo(List("a", "b", "c")) == List("a", "b"))
  assert(lastTwo(List("a", "b", "c")) == List("b", "c"))
  assert(movedFirstTwoToTheEnd(List("a", "b", "c")) == List("c", "a", "b"))
  assert(insertBeforeLast(List("a", "b"), "c") == List("a", "c", "b"))
}
