package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sqrt().apply(16.0));

        }
        static UnaryOperator<Double> sqrt(){
        UnaryOperator<Double>u=san->Math.sqrt(san);
        return u;
        }

}
