package org.coreocto.dev.hf.commonlib.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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

    private static final int BUF_SIZE = 0x1000; // 4K

    public static long copy(InputStream from, OutputStream to) throws IOException {
        byte[] buf = new byte[BUF_SIZE];
        long total = 0;
        while (true) {
            int r = from.read(buf);
            if (r == -1) {
                break;
            }
            to.write(buf, 0, r);
            total += r;
        }
        return total;
    }
}
