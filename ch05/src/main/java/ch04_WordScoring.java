package main.java;

import java.util.*;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ch04_WordScoring {
    static int score(String word) {
        return word.replaceAll("a", "").length();
    }

    static int scoreWithBonus(String word) {
        int base = score(word);
        if (word.contains("c"))
            return base + 5;
        else
            return base;
    }

    static int scoreWithBonusAndPenalty(String word) {
        int base = score(word);
        int bonus = word.contains("c") ? 5 : 0;
        int penalty = word.contains("s") ? 7 : 0;
        return base + bonus - penalty;
    }

    static List<String> rankedWords(Function<String, Integer> wordScore, List<String> words) {
        Comparator<String> wordComparator = (w1, w2) -> Integer.compare(
            wordScore.apply(w2),
            wordScore.apply(w1));

        return words.stream().sorted(wordComparator).collect(Collectors.toList());
    }

    // 改善する
    static int bonus(String word) {
        return word.contains("c") ? 5 : 0;
    }

    static int penalty(String word) {
        return word.contains("s") ? 7 : 0;
    }

    public static void main(String[] args) {

        List<String> words = Arrays.asList("ada", "haskell", "scala", "java", "rust");

        {
            List<String> ranking = rankedWords(w -> score(w), words);
            System.out.println(ranking);
            assert (ranking.toString().equals("[haskell, rust, scala, java, ada]"));
            System.out.println(words);
            assert (ranking.toString().equals("[haskell, rust, scala, java, ada]"));

            // 4.10
            List<String> rankingWithPenalty =  rankedWords(w -> scoreWithBonusAndPenalty(w), words);
            System.out.println(rankingWithPenalty);
            assert (ranking.toString().equals("[java, ada, scala, haskell, rust]"));

            // 改善する
            List<String> rankingWithPenaltyRefactor =  rankedWords(w -> score(w) + bonus(w) - penalty(w), words);
            System.out.println(rankingWithPenaltyRefactor);
        }
    }
}
