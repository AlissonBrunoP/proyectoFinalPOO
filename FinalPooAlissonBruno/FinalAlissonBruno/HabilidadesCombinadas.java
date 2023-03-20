import java.util.List;

public class HabilidadesCombinadas extends Habilidades{
    private int multiplicador;
    private List<Habilidades> habilidadesList;

    public HabilidadesCombinadas(int multiplicador, List<Habilidades> habilidadesList) {
        this.multiplicador = multiplicador;
        this.habilidadesList = habilidadesList;
    }

    public HabilidadesCombinadas(String disparo_al_saltar, String s) {
    }

    public void generarHabilidad(Habilidades habilidades){
        habilidadesList.add(habilidades);
    }

    @Override
    public Double calcularPuntaje() {
        Double sumarPuntaje = 0.00;
        for (Habilidades habilidad : habilidadesList) {
            sumarPuntaje += habilidad.calcularPuntaje();
        }
        return (sumarPuntaje/(habilidadesList.size())*4);
    }

    public Double calcularPuntaje(String nombre) {
        return null;
    }
}
