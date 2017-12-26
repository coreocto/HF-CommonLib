package org.coreocto.dev.hf.commonlib.vasst.bean;

import java.util.ArrayList;
import java.util.List;

public class SearchResult {

    private List<RelScore> relScores = new ArrayList<>();
    private int matchedCnt;
    private int displayCnt;

    public List<RelScore> getRelScores() {
        return relScores;
    }

    public void setRelScores(List<RelScore> relScores) {
        this.relScores = relScores;
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
