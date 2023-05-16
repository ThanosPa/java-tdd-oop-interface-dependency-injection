package com.booleanuk.core;

import java.util.Map;

public class Scrabble {
    Map<Character, Integer> englishLetterScores;
    Map<Character, Integer> greekLetterScores;
    Map<Character, Integer> russianLetterScores;

    public Scrabble() {
        Alphabet englishAlphabet = new EnglishAlphabet();
        Alphabet greekAlphabet = new GreekAlphabet();
        Alphabet russianAlphabet = new RussianAlphabet();

        this.englishLetterScores = englishAlphabet.getLetterScores();
        this.greekLetterScores = greekAlphabet.getLetterScores();
        this.russianLetterScores = russianAlphabet.getLetterScores();
    }

    public int score(String word) {
        int total = 0;

        for (char ch : word.toCharArray()) {
            if (this.englishLetterScores.containsKey(ch)) {
                int score = this.englishLetterScores.get(ch);
                total += score;
            } else if (this.greekLetterScores.containsKey(ch)) {
                int score = this.greekLetterScores.get(ch);
                total += score;
            }else if (this.russianLetterScores.containsKey(ch)) {
                int score = this.russianLetterScores.get(ch);
                total += score;
            }
        }

        return total;
    }

    public int scoreTripleDouble(String word) {
        int score = 0;
        int multiplier = 1;
        boolean isValid = true;

        int curlyCounter = 0;
        int squareCounter = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == '{') {
                curlyCounter++;
                multiplier *= 2;
            } else if (c == '}') {
                if (curlyCounter == 0) {
                    isValid = false;
                    break;
                }
                curlyCounter--;
                multiplier /= 2;
            } else if (c == '[') {
                squareCounter++;
                multiplier *= 3;
            } else if (c == ']') {
                if (squareCounter == 0) {
                    isValid = false;
                    break;
                }
                squareCounter--;
                multiplier /= 3;
            } else if (Character.isLetter(c)) {
                switch (Character.toUpperCase(c)) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    case 'L':
                    case 'N':
                    case 'R':
                    case 'S':
                    case 'T':
                        score += multiplier;
                        break;
                    case 'D':
                    case 'G':
                        score += 2 * multiplier;
                        break;
                    case 'B':
                    case 'C':
                    case 'M':
                    case 'P':
                        score += 3 * multiplier;
                        break;
                    case 'F':
                    case 'H':
                    case 'V':
                    case 'W':
                    case 'Y':
                        score += 4 * multiplier;
                        break;
                    case 'K':
                        score += 5 * multiplier;
                        break;
                    case 'J':
                    case 'X':
                        score += 8 * multiplier;
                        break;
                    case 'Q':
                    case 'Z':
                        score += 10 * multiplier;
                        break;
                }
            }
        }

        if (curlyCounter > 0 || squareCounter > 0) {
            isValid = false;
        }

        return isValid ? score : 0;
    }
}
