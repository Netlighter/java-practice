package com.netlight.lab15_16;

import java.util.HashMap;

public class Node {
    private final HashMap<Integer, Integer> transitionMap = new HashMap<>();
    private final HashMap<Integer, Integer> actionMap = new HashMap<>();

    public Node(int trans0, int state0, int action0, int trans1, int state1, int action1) {
        transitionMap.put(trans0, state0);
        transitionMap.put(trans1, state1);
        actionMap.put(trans0, action0);
        actionMap.put(trans1, action1);
    }

    public HashMap<Integer, Integer> getTransitionMap() {
        return transitionMap;
    }

    public HashMap<Integer, Integer> getActionMap() {
        return actionMap;
    }
}