package com.company;
import net.datastructures.ArrayStack;

public class Main {

    public static void main(String[] args) {
        System.out.println("Operations on stacks");
        ArrayStack<Integer> S = new ArrayStack<>(10);
        S.push(4);
        S.push(3);
        System.out.println(S);
        System.out.println(S.top());

    }
}
