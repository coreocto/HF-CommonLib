package org.coreocto.dev.hf.commonlib.util;

import java.util.*;

public class Util {
    public static List<String> getSubstrings(String s, boolean sort) {
        Set<String> result = new HashSet<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            for (int j = 1; j <= length - i; j++) {
                result.add(new String(s.substring(i, i + j)));
            }
        }

        List<String> substrings = new ArrayList<>(result);
        if (sort) {
            Collections.sort(substrings);
        }

        return substrings;
    }
}
