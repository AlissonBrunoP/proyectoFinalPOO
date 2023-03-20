import java.util.ArrayList;
import java.util.List;

public class Personaje {

    private List<HabilidadesCombinadas> habilidadesCombinadasList;
    private List<HabilidadesSimples> habilidadesSimplesList;
    private List<Habilidades> habilidadesList;

    public Personaje(List<HabilidadesCombinadas> habilidadesCombinadasList, List<HabilidadesSimples> habilidadesSimplesList, List<Habilidades> habilidadesList) {
        this.habilidadesCombinadasList = habilidadesCombinadasList;
        this.habilidadesSimplesList = habilidadesSimplesList;
        this.habilidadesList = habilidadesList;
    }

    public Personaje(String link) {
        habilidadesCombinadasList = new ArrayList<HabilidadesCombinadas>();
        habilidadesSimplesList = new ArrayList<HabilidadesSimples>();
    }
    public void mostrarHabilidades(){
        for (Habilidades habilidades : habilidadesList) {
            System.out.println(habilidades);
        }
    }

    public void generarHabilidad(Habilidades habilidades){
        habilidadesList.add(habilidades);
    }


}
