package com.mycompany.mavenproject1;

public class ex4 {

    static class Numeros extends Thread {

        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);

                try {
                    Thread.sleep(300);
                } catch (Exception e) {

                }
            }
        }
    }

    static class Letras extends Thread {

        public void run() {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println(c);

                try {
                    Thread.sleep(300);
                } catch (Exception e) {

                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Thread t1 = new Numeros();
        Thread t2 = new Letras();

        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
        System.out.println("Cabouu");
    }
}
