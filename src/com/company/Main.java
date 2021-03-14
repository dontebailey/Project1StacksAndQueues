package com.company;
import net.datastructures.ArrayQueue;
import net.datastructures.ArrayStack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Operations on stacks");
        Scanner inputArray = new Scanner(System.in);
        String[] userInput;
        System.out.println("Enter a list of numbers with first number being how many numbers you choose: ");
        userInput = inputArray.next().split(",");

        ArrayQueue<Integer> outputQueue = new ArrayQueue<>(20);

        for (int i = 1;  i < userInput.length ; ++i ){
            outputQueue.enqueue(Integer.parseInt(userInput[i]));

        }
        int n = Integer.parseInt(userInput[0]);

        ArrayQueue<Integer> inputQueue = new ArrayQueue<>(n);

        for (int j = 1; j <= n; ++j ){
            inputQueue.enqueue(j);
        }
        ArrayStack<Integer> tempStack = new ArrayStack<>(20);
        int inputFirst = 0;
//        inputFirst = inputQueue.dequeue();
        while(!inputQueue.isEmpty()) {
            inputFirst = inputQueue.dequeue();
            if (inputFirst == outputQueue.first()) {
                outputQueue.dequeue();
                while ((!tempStack.isEmpty()) && (tempStack.top() == outputQueue.first())) {

                    tempStack.pop();
                    outputQueue.dequeue();
                }

            }
            else
                tempStack.push(inputFirst);
        }
//        System.out.println(inputQueue);
//        System.out.println(outputQueue);
//        System.out.println(inputFirst);
//        System.out.println(tempStack);
        System.out.print(outputQueue.isEmpty() && tempStack.isEmpty());


    }
}
