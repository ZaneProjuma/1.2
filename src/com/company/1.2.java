package com.company;

class Main {

    public static void main(String[] args) {
        int time = 21;
        if (time>=5 && time<=12)
            System.out.println("Good Morning, Sunshine!");
        else if (time>=13 && time<=19)
            System.out.println("Good Afternoon! Work hard!");
        else if (time>=20 && time<=24)
            System.out.println("Good Evening! Get some rest!");
    }
}
