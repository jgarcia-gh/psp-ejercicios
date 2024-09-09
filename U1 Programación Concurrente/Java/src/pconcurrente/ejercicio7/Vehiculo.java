package pconcurrente.ejercicio7;

public class Vehiculo {
    private Motor motor = null;
    private Bateria bateria = null;
    private Carroceria carroceria = null;

    public void ensamblarMotor(Motor motor) {
        if(carroceria != null){
            this.motor = motor;
        } else {
            System.out.println("Error, no se puede ensamblar el motor sin carrocería");
        }
    }

    public void ensamblarBateria(Bateria bateria) {
        if(carroceria != null){
            this.bateria = bateria;
        } else {
            System.out.println("Error, no se puede ensamblar la batería sin carrocería");
        }
    }

    public void ensamblarCarroceria(Carroceria carroceria) {
        this.carroceria = carroceria;
    }

    public Motor getMotor() {
        return motor;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public Carroceria getCarroceria() {
        return carroceria;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "motor=" + motor +
                ", bateria=" + bateria +
                ", carroceria=" + carroceria +
                '}';
    }
}
