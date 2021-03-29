package com.Malhi;

public class Main {

    public static void main(String[] args) {
        arrayClass<Integer> abn = new arrayClass<>();
        abn.add(12);
        abn.add(26);
        abn.add(34);
        abn.add(39);
        abn.print();
        System.out.println(abn.remove(26));
        abn.print();

    }
}
