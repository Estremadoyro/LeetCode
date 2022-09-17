package net.estremadoyro.main;

import java.util.*;

public class ValidParentheses {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        int stackPtr = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                chars[stackPtr++] = ')';
            } else if (chars[i] == '[') {
                chars[stackPtr++] = ']';
            } else if (chars[i] == '{') {
                chars[stackPtr++] = '}';
            } else if (stackPtr == 0 || chars[--stackPtr] != chars[i]) {
                return false;
            }
        }
        return stackPtr == 0;
    }

    private boolean closedRight(char s1, char s2) {
        System.out.format("s1: %c | s2: %c%n", s1, s2);
        if (s1 == "(".charAt(0) && s2 == ")".charAt(0)) {
            return true;
        } else if (s1 == "[".charAt(0) && s2 == "]".charAt(0)) {
            return true;
        } else return (s1 == "{".charAt(0) && s2 == "}".charAt(0));
    }

    private String[] removeElementAt(int index, String[] source) {
        String[] aux = new String[source.length - 1];
        for (int i = 0; i < aux.length; i++) {
            System.out.printf("i: %d%n", i);
            if (i == index) {
                continue;
            }

            aux[i] = source[i];
        }
        return aux;
    }
}


// "( ) { } } {"
// Constraints
// - Must be even

// "{ } ( )"
// "{ ( ) }" -> "{ }" -> ""
// aux = s
// iterationTimes = s.length
// Iterate through [0, s.length>
// for i in s.length
//   if [i] corresponds to [i+1] | aka { == }, ( == ), [ == ]
//     Then remove [i] & [i+1] from aux | s = "( )"
//     And reset loop starting from 0
//  if aux.length == 0
//    Then True
// else False
