package pconcurrente.ejercicio6;

import java.util.Random;

public class Escritor implements Runnable {

    Log log;
    int id;

    public Escritor (int id, Log log){
        this.log = log;
        this.id = id;
    }
    @Override
    public void run() {
        Random r = new Random();
        // Escribimos en el log 100 mensajes
        for(int i = 1; i<= 100; i++ ){
            log.escribir(id, "Este es mi mensaje número " + i);
            try {
                Thread.sleep(r.nextInt(0,11)); //Haciendo esperas entre 0 y 10 milisegunods
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
