public abstract class Posicion {
    private Tipo tipo;
    protected String nombre;

    public Posicion(Tipo tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public abstract void entrar(Robot r);

    public abstract void salir(Robot r);
}
