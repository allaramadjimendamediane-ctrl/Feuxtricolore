package org.example;

public class SystemeAutomatique {

    public void demarrerFeux() {
        System.out.println("🚦 Feux démarrés");
    }

    public void executerCycle() {

        try {

            System.out.println("🟢 CIRCULATION");
            Thread.sleep(3000);

            System.out.println("🟠 RALENTIR");
            Thread.sleep(2000);

            System.out.println("🔴 ARRETER");
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void arreterFeux() {
        System.out.println("🛑 Feux arrêtés");
    }
}