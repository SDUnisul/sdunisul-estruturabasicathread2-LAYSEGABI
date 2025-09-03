package com.mycompany.mavenproject1;

public class NewClass1 {

    static class Corredor extends Thread {

        String nome;

        Corredor(String nome) {
            this.nome = nome;
        }

        public void run() {
            for (int i = 1; i <= 100; i += 10) {
                System.out.println(nome + "percorreu" + i + "m");

                try {
                    Thread.sleep(400);
                } catch (Exception e) {

                }
            }
        }

    }

    public static void main(String[] args) throws Exception {
        Corredor c1 = new Corredor("Corredor 1: ");
        Corredor c2 = new Corredor("Corredor 2: ");
        Corredor c3 = new Corredor("Corredor 3: ");

        c1.start();
        c2.start();
        c3.start();

        c1.join();
        c2.join();
        c3.join();
        
        System.out.println("Corrida acabada");
    }
}
