import java.util.List;

public class Robot implements Runnable {
    private List<Posicion> camino;
    private int posicionActual = 0;
    private String nombre;

    public Posicion getPosicionActual() {
        return camino.get(posicionActual);
    }

    public Robot(String nombre, List<Posicion> camino){
       this.camino = camino;
       this.nombre = nombre;
    }

    @Override
    public void run() {


        while(posicionActual != camino.size() - 1){ // Mientras no hayamos llegado al final
            Posicion siguientePosicion = camino.get(posicionActual + 1);
            siguientePosicion.entrar(this);
            getPosicionActual().salir(this);
            posicionActual++;
        }

        System.out.println(nombre + " RECORRIDO FINALIZADO");
    }

    @Override
    public String toString() {
        return nombre;
    }
}
