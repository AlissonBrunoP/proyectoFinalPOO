public class HabilidadesSimples extends Habilidades{
    private Double puntaje;

    public HabilidadesSimples(String nombre, String descripcion, Double puntaje) {
        super();
        this.puntaje = puntaje;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public Double calcularPuntaje() {
        return null;
    }

    @Override
    public Double calcularPuntaje(String nombre) {
        if (nombre.equals("Disparar")){
            return puntaje += 5;
        }
        return null;
    }

}
