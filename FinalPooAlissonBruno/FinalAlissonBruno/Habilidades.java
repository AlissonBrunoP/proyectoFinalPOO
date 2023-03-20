public abstract class Habilidades {
    private String nombre;
    private String descripcion;

    public Habilidades() {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularPuntaje();

    @Override
    public String toString() {
        return "nombre: " + nombre + " puntaje: " + calcularPuntaje();
    }

    public String getNombre() {
        return nombre;
    }

    public abstract Double calcularPuntaje(String nombre);
}
