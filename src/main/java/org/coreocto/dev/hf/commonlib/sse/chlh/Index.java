package org.coreocto.dev.hf.commonlib.sse.chlh;

import java.util.ArrayList;
import java.util.List;

public class Index {
    private String docId = null;
    private List<String> bloomFilters = new ArrayList<>();
    private int wordCnt = 0;

    public int getWordCnt() {
        return wordCnt;
    }

    public void setWordCnt(int wordCnt) {
        this.wordCnt = wordCnt;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public List<String> getBloomFilters() {
        return bloomFilters;
    }

    public void setBloomFilters(List<String> bloomFilters) {
        this.bloomFilters = bloomFilters;
    }
}
