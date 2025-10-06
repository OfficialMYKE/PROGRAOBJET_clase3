public class Jugador {
    String nombre;
    String posicion;
    int edad;
    int numero_camiseta;

    public Jugador (String nombre, String posicion, int edad, int numero_camiseta){
        this.nombre=nombre;
        this.posicion=posicion;
        this.edad=edad;
        this.numero_camiseta=numero_camiseta;
    }
    public void imprimir(){
        System.out.println("---------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Posicion: "+posicion);
        System.out.println("Edad: "+edad);
        System.out.println("Numero de camiseta: "+numero_camiseta);
    }
    public static void main(String[] args) {
        Jugador jugardor1 = new Jugador("Lionel Messi", "Extremo Izquierdo", 36, 10);
        jugardor1.imprimir();
        Jugador jugador2 = new Jugador("Neymar", "Estremo derecho", 30, 11);
        jugador2.imprimir();
        Jugador jugador3 = new Jugador("Luis Suarez", "Delantero", 37, 9);
        jugador3.imprimir();
    }
}
