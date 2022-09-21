package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new ArrayList<>();
        Deque<Integer> dishes = new ArrayDeque<>();
        for (int el = 1; el <= numberOfDishes; el++) {
            dishes.add(el);
        }

        int cou = 0;
        while (!dishes.isEmpty()) {
            Deque<Integer> helper = new ArrayDeque<>();
            for (int dish : dishes){
                helper.addLast(dish);
                cou++;
                if (cou == everyDishNumberToEat) {
                    list.add(helper.pollLast());
                    cou = 0;
                }
            }
            dishes = helper;

        }
        return list;
    }
}
