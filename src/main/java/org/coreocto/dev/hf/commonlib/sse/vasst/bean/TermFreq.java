package org.coreocto.dev.hf.commonlib.sse.vasst.bean;

import java.util.HashMap;
import java.util.Map;

public class TermFreq {
    private Map<String, Integer> terms = null;

    public TermFreq() {
        this.terms = new HashMap<>();
    }

    public Map<String, Integer> getTerms() {
        return terms;
    }

    public void clear() {
        terms.clear();
    }

    public void inc(String word) {
        int oldCnt = get(word);
        this.set(word, oldCnt + 1);
    }

    public void set(String word, int freq) {
        terms.put(word, freq);
    }

    public Integer get(String word) {
        if (terms.containsKey(word)) {
            return terms.get(word);
        } else {
            return 0;
        }
    }
}
