package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class RussianAlphabet implements Alphabet{

    public Map<Character,Integer> getLetterScores(){

        return new HashMap<>(){{
            put('А', 1);
            put('Б', 3);
            put('В', 1);
            put('Г', 3);
            put('Д', 2);
            put('Е', 1);
            put('Ё', 1);
            put('Ж', 5);
            put('З', 5);
            put('И', 1);
            put('Й', 4);
            put('К', 2);
            put('Л', 2);
            put('М', 2);
            put('Н', 1);
            put('О', 1);
            put('П', 2);
            put('Р', 2);
            put('С', 2);
            put('Т', 1);
            put('У', 2);
            put('Ф', 8);
            put('Х', 5);
            put('Ц', 5);
            put('Ч', 5);
            put('Ш', 8);
            put('Щ', 10);
            put('Ъ', 10);
            put('Ы', 4);
            put('Ь', 3);
            put('Э', 8);
            put('Ю', 8);
            put('Я', 3);
        }};

    }
}
