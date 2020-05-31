package com.company;
//20-21.04
//4 kropka - odpowiedź Tak
public class Main {
    void długość(String s) {
        System.out.println(s.length());
    }

    public static void main(String[] args) throws Exception {
        try {
            Main zmienna = new Main();
            zmienna.długość(null);
        } catch (NullPointerException w) {
            throw new Exception(w);
        }
    }
}