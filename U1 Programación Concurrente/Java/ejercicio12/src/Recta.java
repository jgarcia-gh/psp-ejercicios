public class Recta extends Posicion {

    public Recta(String nombre) {
        super(Tipo.RECTA, nombre);
    }

    public void entrar(Robot r){
        System.out.println("Robot " + r + " entrando en " + nombre );
        try { Thread.sleep(3000); } catch (InterruptedException e){}
        System.out.println("Robot " + r + " en " + nombre );
    }
    public void salir(Robot r) {
        System.out.println("Robot " + r + " saliendo de " + nombre );
        try { Thread.sleep(3000); } catch (InterruptedException e){}
        System.out.println("Robot " + r + " ha salido de " + nombre );
    }
}
