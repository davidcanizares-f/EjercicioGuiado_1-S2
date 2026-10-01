package negocio;

public class MainDispositivo {

    public static void main() {

        Dispositivo dispositivo1 = new Dispositivo();
        dispositivo1.nombre= "Laptop";
        dispositivo1.tipo = "Computadora";
        dispositivo1.activo= true;


        Dispositivo dispositivo2 = new Dispositivo();
        dispositivo2.nombre= "Televisor";
        dispositivo2.tipo = "Entretenimiento";
        dispositivo2.activo= false;


        System.out.println("=== DISPOSITIVO 1 ===");
        dispositivo1.mostrarDatos();
        dispositivo1.mostrarEstado();

        System.out.println();


        System.out.println("=== DISPOSITIVO 2 ===");
        dispositivo2.mostrarDatos();
        dispositivo2.mostrarEstado();

        dispositivo1.activo = false;
        System.out.println();
        System.out.println("Cambiando estado de... "+ dispositivo1.nombre);
        System.out.println("=== DISPOSITIVO 1 ===");

        dispositivo1.mostrarEstado();
        dispositivo1.activar();
        dispositivo1.activar();
    }
}
