package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThroneInheritance {
    String kingName;
    Map<String, List<String>> map = new HashMap<>();  // for cache children;
    Map<String, Boolean> alive = new HashMap<>();
    public ThroneInheritance(String kingName) {
        this.kingName = kingName;
    }

    public void birth(String pn, String cn) {

    }

    public void death(String name) {

    }

    public List<String> getInheritanceOrder() {
        List<String> list = getList(kingName);  //all list with alive and died
        List<String> res = new ArrayList<>();
        for (String s : list)
            if (alive.getOrDefault(s, true)) res.add(s);  // remove died
        return res;

    }

    private List<String> getList(String p) {   // recursion to get children and build the inheritance list;
        List<String> res = new ArrayList<>();

        return res;
    }
}