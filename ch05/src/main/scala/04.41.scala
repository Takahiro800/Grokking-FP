import scala.compiletime.ops.boolean
// 4.41 コーヒーブレイク　：　関数を返す

val numList = List(5, 1, 2, 4, 0)
def largerThanBefore(n: Int): Int => Boolean = { i =>
  i > n
}

// これはfilterで使うので、paramの順序は重要
def largerThan(n: Int)(i: Int): Boolean = i > n
/*
numList.filter(largerThan(4))
numList.filter(largerThan(1))
 */

def divisibleByBefore(n: Int): Int => Boolean = { i =>
  i % n == 0
}

def divisibleBy(n: Int)(i: Int): Boolean = i % n == 0
/*
numList.filter(divisibleBy(5))
numList.filter(divisibleBy(2))
 */

val strList = List("scala", "ada", "rust")

def shorterThanBefore(n: Int): String => Boolean = { s =>
  s.length() < n
}

def shorterThan(n: Int)(s: String): Boolean = s.length < n

/*
strList.filter(shorterThan(4))
strList.filter(shorterThan(7))
 */

def numberOfS(s: String): Int = {
  s.length - s.replaceAll("s", "").length
}

def containsSBefore(moreThan: Int): String => Boolean = { s =>
  numberOfS(s) > moreThan
}

def containsS(moreThan: Int)(s: String): Boolean = numberOfS(s) > moreThan

/*
strList.filter(containsS(2))
strList.filter(containsS(0))
 */
