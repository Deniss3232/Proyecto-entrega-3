public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la App de Reciclaje!");

        // Crear instancias de las otras clases
        Reciclaje reciclaje = new Reciclaje();
        Lugares lugares = new Lugares();
        Consejos consejos = new Consejos();

        // Mostrar información de reciclaje
        System.out.println("\nMateriales que puedes reciclar:");
        for (String material : reciclaje.getMaterialesReciclables()) {
            System.out.println("- " + material);
        }

        System.out.println("\nBeneficios de reciclar:");
        for (String beneficio : reciclaje.getBeneficios()) {
            System.out.println("- " + beneficio);
        }

        // Mostrar lugares donde reciclar
        System.out.println("\nLugares donde puedes reciclar:");
        for (String lugar : lugares.getLugaresReciclaje()) {
            System.out.println("- " + lugar);
        }

        // Mostrar consejos para reciclar mejor
        System.out.println("\nConsejos para mejorar el reciclaje:");
        for (String consejo : consejos.getConsejos()) {
            System.out.println("- " + consejo);
        }
    }
}
