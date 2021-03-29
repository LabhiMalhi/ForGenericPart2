package com.Malhi;

import java.util.Arrays;

public class arrayClass <T>{
    private T [] arr;

    public arrayClass() {
        this.arr = (T[]) new Object[10];
    }



    public boolean add(T el) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = el;
                return true;
            }
        }
        return false;
    }


    public boolean remove(T el) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(el)) {
                arr[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean contain(T el) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(el)) {

                return true;
            }
        }
        return false;
    }

    public void print(){
        System.out.println(Arrays.toString(arr));
    }
}
