// def rankedWords(
//     // javaだと Function<String, Integer>と書く必要があった
//     wordScore: String => Int,
//     words: List[String]
// ): List[String] = {
//   words.sortBy(wordScore).reverse
// }

// def score(word: String): Int = {
//   word.replaceAll("a", "").length()
// }

// // 4.17
// def len(word: String): Int = {
//   word.length()
// }

// def numberOfS(s: String): Int = {
//   s.length() - s.replaceAll("s", "").length()
// }
// // List("rust", "ada").sortBy(numberOfS)

// def negative(i: Int): Int = -i
// // List(5, 1, 2, 4, 3).sortBy(negative)

// def negativeNumberOfS(s: String): Int = -numberOfS(s)
// // List("ada", "rust").sortBy(negativeNumberOfS)

// // 4.21 関数をインラインで渡す
// def bonus(word: String): Int = {
//   if (word.contains("c")) 5 else 0
// }
// rankedWords(w => score(w) + bonus(w), words)
// -> List("rust", "java")
