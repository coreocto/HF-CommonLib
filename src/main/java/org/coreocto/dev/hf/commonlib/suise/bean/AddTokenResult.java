package org.coreocto.dev.heavensfall.commonlib.suise.bean;

import java.util.List;

public class AddTokenResult {
    private String id = null;
    private List<String> c = null;
    private List<String> x = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getC() {
        return c;
    }

    public void setC(List<String> c) {
        this.c = c;
    }

    public List<String> getX() {
        return x;
    }

    public void setX(List<String> x) {
        this.x = x;
    }
}
