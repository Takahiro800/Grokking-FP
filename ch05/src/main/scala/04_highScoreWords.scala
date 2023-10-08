def highScoringWords(
    wordScore: String => Int
): Int => List[String] => List[String] = { highterThan => words =>
  words.filter(w => wordScore(w) > highterThan)
}

/* 4.47
val words = List("ada", "haskell", "scala", "java", "rust")
val words2 = List("football", "f1", "hockey", "basketball")

val wordWithScoreHighterThen: Int => List[String] => List[String] =
  highScoringWords(w => score(w) + bonus(w) - penalty(w))
 */
