package com.functional.function.second;

public enum Consonant {
    B, C, D, F, G, H, J, K, L, M, N, P, Q, R, S, T, V, W, X, Y, Z;

    public static boolean isConsonant(Character character) {
//        Consonant j = Consonant.valueOf(character.toString());

        for (Consonant c : Consonant.values()) {
            if(c.toString().equalsIgnoreCase(character.toString())){
                return true;
            }
        }
        return false;
    }
}
