package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> result = new ArrayDeque<>();

        if (!firstQueue.isEmpty()) result.addLast(firstQueue.poll());
        if (!firstQueue.isEmpty()) result.addLast(firstQueue.poll());
        if (!secondQueue.isEmpty()) result.addLast(secondQueue.poll());
        if (!secondQueue.isEmpty()) result.addLast(secondQueue.poll());

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()){

            firstQueue.add(result.pollLast());
            if (!firstQueue.isEmpty()) result.addLast(firstQueue.poll());
            if (!firstQueue.isEmpty()) result.addLast(firstQueue.poll());

            secondQueue.add(result.pollLast());
            if (!secondQueue.isEmpty()) result.addLast(secondQueue.poll());
            if (!secondQueue.isEmpty()) result.addLast(secondQueue.poll());

        }
        return result;
    }
}
