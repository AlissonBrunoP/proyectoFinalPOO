public class HabilidadesFactory {
        private static HabilidadesFactory instance;


    public HabilidadesFactory() {
    }
    public static void setInstance(HabilidadesFactory instance) {
        HabilidadesFactory.instance = instance;
    }

    public static HabilidadesFactory getInstance() {
        if(instance == null){
            instance = new HabilidadesFactory();
        }
        return instance;
    }
    public Habilidades generarHabilidad(String codigo){
        switch (codigo){
            case "SALTA" :
                return new HabilidadesSimples("Saltar","Salto de Personaje",7.5);
            case "DISPARA" :
                return new HabilidadesSimples("Disparar","Personaje dispara",10.0);
            case "SALTO Y DISPARA" :
                HabilidadesCombinadas habilidadesCombinadas = new HabilidadesCombinadas("Disparo_al_saltar","Personaje hace un salto y dispara");
                habilidadesCombinadas.generarHabilidad(this.generarHabilidad("SALTA"));
                habilidadesCombinadas.generarHabilidad(this.generarHabilidad("DISPARA"));
                return habilidadesCombinadas;
        }
        return null;
    }


}
