package pconcurrente.ejercicio6;

public class Escritor implements Runnable {

    Log log;
    int id;

    public Escritor (int id, Log log){
        this.log = log;
        this.id = id;
    }
    @Override
    public void run() {
        // Escribimos en el log 100 mensajes
        for(int i = 1; i<= 100; i++ ){
            log.escribir(id, "Este es mi mensaje número " + i);
            try {
                Thread.sleep((long)(Math.random()*10)); //Haciendo esperas entre 0 y 10 milisegunods
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
