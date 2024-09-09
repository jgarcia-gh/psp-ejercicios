package pconcurrente.ejercicio7;

public class FabricarBateria implements Runnable {

    private Vehiculo vehiculo;

    public FabricarBateria(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    @Override
    public void run() {
        System.out.println("FB: Fabricando batería");
        try {
            Thread.sleep((long)((Math.random()*9000)+1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Bateria b = new Bateria();
        System.out.println("FB: Batería fabricada");

        synchronized (vehiculo){
            System.out.println("FB: Ensamblando batería");
            vehiculo.ensamblarBateria(b);
        }
    }
}
