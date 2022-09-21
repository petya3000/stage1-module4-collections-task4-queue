package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {

        PriorityQueue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (String el : firstList) queue.add(el);
        for (String el : secondList) queue.add(el);

        return queue;

    }
}
