package negocio;
public class Dispositivo {


    public String nombre;
    String tipo;
    public boolean activo;


    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
    }
    void mostrarEstado() {
        System.out.println(activo ? "Estado: Encendido" : "Estado: Apagado");
    }

    void activar(){
        System.out.println("> Activando " + nombre + "...");
        if(activo == false){
            activo=true;
            System.out.println("El/la " + nombre + " se ha activado");
        } else{
            System.out.println("El/la " + nombre + " ya estaba activo");
        }

    }



}
