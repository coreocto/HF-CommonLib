package org.coreocto.dev.hf.commonlib.sse.suise.bean;

import java.util.List;

public class SearchTokenResult {
    private String searchToken = null;
    private List<String> searchHistory = null;

    public String getSearchToken() {
        return searchToken;
    }

    public void setSearchToken(String searchToken) {
        this.searchToken = searchToken;
    }

    public List<String> getSearchHistory() {
        return searchHistory;
    }

    public void setSearchHistory(List<String> searchHistory) {
        this.searchHistory = searchHistory;
    }

}
