package co.edu.unisabana.streamings.service;

public class ClaseMovie implements Runnable {
    @Override
    public void run() {
        System.out.println("publicacion asincrona");
    }
}
