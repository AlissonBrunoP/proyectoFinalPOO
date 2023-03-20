public class Main {
    public static void main(String[] args) {

                Personaje link = new Personaje("Link");
                HabilidadesFactory factory = HabilidadesFactory.getInstance();

                link.generarHabilidad(factory.generarHabilidad("SALTA"));
                link.generarHabilidad(factory.generarHabilidad("DISPARA"));
                link.generarHabilidad(factory.generarHabilidad("SALTO Y DISPARA"));
                link.generarHabilidad(factory.generarHabilidad("SALTO Y DISPARA"));
                link.generarHabilidad(factory.generarHabilidad("DISPARA"));
                link.generarHabilidad(factory.generarHabilidad("SALTA"));

                link.mostrarHabilidades();
            }

}