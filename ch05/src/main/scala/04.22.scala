// // 4.22 コーヒーブレイク　：　Scalaで関数を渡す

// def rankedWords(wordScore: String => Int, words: List[String]): List[String] = {
//   words.sortBy(wordScore).reverse
// }

def score(word: String): Int = word.replaceAll("a", "").length

def bonus(word: String): Int = if (word.contains("c")) 5 else 0

def penalty(word: String): Int = if (word.contains("s")) 7 else 0

// // rankedWords(w => score(w) + bonus(w) - penalty(w), words)

// // 4.28 実習 map
// // 1)
// def len(s: String): Int = s.length
// // List("scala", "rust", "ada").map(len)

// // 2) sの個数を返す
// def numberOfS(s: String): Int = s.length - s.replaceAll("s", "").length
// // List("scala", "rust", "ada").map(numberOfS)

// // 3)
// def negative(i: Int): Int = -i
// // List(5, 1, 2, 4, 0).map(negative)

// // 4)
// def double(i: Int): Int = i * 2
// // List(5, 1, 2, 4, 0).map(double)

// // 4.32
// def highScoringWords(
//     wordScore: String => Int,
//     words: List[String]
// ): List[String] = {
//   words.filter(w => wordScore(w) > 1)
// }
// //// val words = List("ada", "haskell", "scala", "java", "rust")
// // highScoringWords(w => score(w) + bonus(w) - penalty(w), words)
