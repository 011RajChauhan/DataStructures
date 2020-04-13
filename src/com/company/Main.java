package com.company;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int [] myArray = {17,3,9,6,2};
        for(int i = 1; i < myArray.length; i++) {
            for(int j = 0; j < myArray.length - 1; j++) {
                if(myArray[j] < myArray[j+1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }
        }
        for(int i: myArray) {
            System.out.println(i);
        }
    }
}
