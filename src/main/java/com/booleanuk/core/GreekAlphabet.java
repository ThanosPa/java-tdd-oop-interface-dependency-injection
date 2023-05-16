package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class GreekAlphabet implements Alphabet {

    @Override
    public Map<Character, Integer> getLetterScores() {
        return new HashMap<>(){
            {
                put('α', 1);
                put('ε', 1);
                put('ι', 1);
                put('ο', 1);
                put('φ', 1);
                put('ξ', 1);

                put('β', 2);
                put('δ', 2);
                put('π', 2);

                put('γ', 3);
                put('η', 3);
                put('ν', 3);
                put('τ', 3);

                put('ζ', 4);
                put('κ', 4);
                put('ρ', 4);
                put('ψ', 4);
                put('λ', 4);

                put('θ', 5);
                put('χ', 5);

                put('μ', 8);
                put('σ', 8);

                put('υ', 10);
                put('ω', 10);
            }};
    }
}
