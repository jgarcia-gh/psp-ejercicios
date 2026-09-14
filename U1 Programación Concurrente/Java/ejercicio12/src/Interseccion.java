import java.util.concurrent.locks.ReentrantLock;

public class Interseccion extends Posicion {

    private Robot robotEnInterseccion;

    public Interseccion(String nombre) {
        super(Tipo.INTERSECCION, nombre);
    }

    public void entrar(Robot r) {
        System.out.println("Robot " + r + " intentando entrar en " + nombre );

        if(robotEnInterseccion != null && robotEnInterseccion != r){
            System.out.println("COLISION ENTRE ROBOTS");
            throw new RuntimeException();
        }
        robotEnInterseccion = r;

        System.out.println("Robot " + r + " entrando en " + nombre );
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println("Robot " + r + " en " + nombre );
    }
    public void salir(Robot r) {
        System.out.println("Robot " + r + " saliendo de " + nombre );
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println("Robot " + r + " ha salido de " + nombre );
        robotEnInterseccion = null;
    }
}
