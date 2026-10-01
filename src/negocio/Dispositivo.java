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
        System.out.println(activo ? "El/la " + nombre + " esta: Encendido" : "El/la " + nombre + " esta: Apagado");
    }

    void activar(){
        System.out.println("Activando " + nombre + "...");
        if(activo == false){
            activo=true;
            System.out.println("El/la " + nombre + " se ha activado");
        } else{
            System.out.println("El/la " + nombre + " ya estaba activo");
        }

    }


}
