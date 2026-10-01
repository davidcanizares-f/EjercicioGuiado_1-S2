package negocio;
public class Dispositivo {


    public String nombre;
    String tipo;
    public boolean activo;


    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
    }
    public void mostrarEstado() {
        System.out.println(activo ? "Estado: Prendido" : "Estado: Apagado");
    }


}
