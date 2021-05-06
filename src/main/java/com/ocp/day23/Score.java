
package com.ocp.day23;

public class Score {
    public static boolean isValid(int score) {
        return score >= 0 && score <= 100 ? true:false;
    }
}
