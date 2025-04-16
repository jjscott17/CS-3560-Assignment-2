package org.example;

import java.util.*;

public class ThroneInheritance {
    String kingName;
    Map<String, List<String>> map = new HashMap<>();  // for cache children;
    Map<String, Boolean> alive = new HashMap<>();
    public ThroneInheritance(String kingName) {
        this.kingName = kingName;
    }

    public void birth(String parentName, String childName) {
        // create list of children for the parent if one does not already exist
        map.putIfAbsent(parentName, new ArrayList<>());
        // add childName to the list
        map.get(parentName).add(childName);
        // label child as alive
        alive.put(childName, true);
    }

    public void death(String name) {
        alive.put(name, false);
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
        res.add(p);
        // if name is a parent
        if (map.containsKey(p)) {
            for (String child : map.get(p)) {
                res.addAll(getList(child)); // recursively add their children
            }
        }
        return res;
    }
}
