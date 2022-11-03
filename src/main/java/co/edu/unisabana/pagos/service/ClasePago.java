package co.edu.unisabana.pagos.service;

public class ClasePago implements Runnable {
    @Override
    public void run() {
        System.out.println("pago asincrono");
    }
}
