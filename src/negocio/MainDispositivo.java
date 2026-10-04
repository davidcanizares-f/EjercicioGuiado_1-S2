package negocio;

public class MainDispositivo {

    public static void main() {

        Dispositivo dispositivo1 = new Dispositivo();
        dispositivo1.nombre= "Laptop";
        dispositivo1.tipo = "Computadora";
        dispositivo1.activo= true;


        Dispositivo dispositivo2 = new Dispositivo();
        dispositivo2.nombre= "Televisor";
        dispositivo2.tipo = "Dispositivo Multimedia";
        dispositivo2.activo= false;


        System.out.println("=== DISPOSITIVO 1 ===");
        dispositivo1.mostrarInformacion();
        dispositivo1.mostrarEstado();

        System.out.println();


        System.out.println("=== DISPOSITIVO 2 ===");
        dispositivo2.mostrarInformacion();
        dispositivo2.mostrarEstado();

        dispositivo1.activo = false;
        System.out.println("\n---------------------------");
        System.out.println(">>>>> CAMBIO DE ATRIBUTOS <<<<<");
        System.out.println("=== DISPOSITIVO 1 ===");
        dispositivo1.mostrarEstado();
        dispositivo1.activar();
        dispositivo1.activar();
    }
}
