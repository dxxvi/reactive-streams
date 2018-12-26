package home

import org.junit.jupiter.api.Test

class JUnit5ScalaTests {
    @Test
    def palindromeSubstrings() {
        def isPalindrome(s: String): Boolean = s.reverse == s

        def findAllPalindromesUsingBruteForceApproach(s: String): Set[String] = for {
                i <- (0 until s.length).toSet[Int]
                j <- (i+1) to s.length
                substring = s.substring(i, j)
                if isPalindrome(substring)
            } yield substring

        println(findAllPalindromesUsingBruteForceApproach("abcdefedefe"))

        @annotation.tailrec
        def findPalindromes(s: String, low: Int, high: Int, set: Set[String]): Set[String] =
            if (low < 0 || high >= s.length || s(low) != s(high)) set
            else findPalindromes(s, low - 1, high + 1, set + s.substring(low, high + 1))

        def findAllPalindromesUsingCenter(s: String): Set[String] =
            (0 until s.length).toSet[Int] flatMap { i =>
                findPalindromes(s, i, i, Set[String]()) ++ findPalindromes(s, i, i + 1, Set[String]())
            }

        println(findAllPalindromesUsingCenter("abcdefedefe"))
    }

    @Test
    def x() {

    }
}
