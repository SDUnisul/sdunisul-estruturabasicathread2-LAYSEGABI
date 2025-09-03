
package com.mycompany.mavenproject1;

public class NewClass {
    static class Mensagem implements Runnable {

        String msg;
        
        Mensagem(String msg) {
            this.msg = msg;
        }

        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(msg + "" + i);

                try {
                    Thread.sleep(700);
                } catch (Exception e) {

                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Mensagem("Olá do Runnable 1: ")).start();
        new Thread(new Mensagem("Olá do Runnable 2: ")).start();

    }
}
