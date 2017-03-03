import java.util.Scanner;

class Person {

    private String nombre;
    private String dni;
    private static int contador;
    private Scanner teclado;

    public Person() {
        this.contador = contador;
    }

    public Person(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        contador++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String persona) {
        this.nombre = persona;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    } //GETTER & SETTER

    public void numPersonas() {

        System.out.println("El numero de personas que han pasado la frontera son: ");
        if (contador < 0) {
            this.contador = 0;
        } else {
            contador++;
        }
        System.out.println(contador);
    }


    @Override
    public String toString() {
        return "Person{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", teclado=" + teclado +
                '}';
    }
}
