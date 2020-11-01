package com.netlight.lab15_16;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private final ArrayList<Node> nodeList = new ArrayList<>();
    private final HashMap<Integer, String> actionMap = new HashMap<>();

    public Graph() {
        actionMap.put(0, "create_project");
        actionMap.put(1, "add_library");
        actionMap.put(2, "restart");
        actionMap.put(3, "test");
        actionMap.put(4, "deploy");
        actionMap.put(5, "drop_db");

        nodeList.add(new Node(0, 1, 0, 1, 4, 1));
        nodeList.add(new Node(0, 2, 3, 1, 3, 5));
        nodeList.add(new Node(0, 3, 5, 1, 4, 1));
        nodeList.add(new Node(0, 2, 2, 1, 4, 4));
        nodeList.add(new Node(0, 0, 4, 1, 2, 2));
    }

    public void emulate(ArrayList<Integer> transList) {
        int initState = 0;
        for (int i = 0; i < transList.size(); i++) {
            System.out.println(actionMap.get(nodeList
                    .get(initState)
                    .getActionMap()
                    .get(transList.get(i))));
            initState = nodeList
                    .get(initState)
                    .getTransitionMap()
                    .get(transList.get(i));
        }
    }
}
