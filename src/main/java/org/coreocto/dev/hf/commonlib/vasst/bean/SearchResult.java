package org.coreocto.dev.hf.commonlib.vasst.bean;

public class SearchResult {
    private double score;
    private String docId;
    private int matchedCnt;
    private int displayCnt;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public int getMatchedCnt() {
        return matchedCnt;
    }

    public void setMatchedCnt(int matchedCnt) {
        this.matchedCnt = matchedCnt;
    }

    public int getDisplayCnt() {
        return displayCnt;
    }

    public void setDisplayCnt(int displayCnt) {
        this.displayCnt = displayCnt;
    }
}
