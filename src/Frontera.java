
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Frontera {

    Scanner teclado = new Scanner(System.in);

    List<Person> personList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Frontera frontera = new Frontera();
        frontera.iniciar();
    }

    public void mostrarNombre(){
        System.out.println(personList+",");
    }

    public void buscadorNombre() {

        Scanner teclado3 = new Scanner(System.in);

        System.out.println("Escribe el nombre que buscas:");
        String nombre = teclado3.nextLine();

        for (Person i:personList) {
            if (i.getNombre().equals(nombre)){
                System.out.println(i+" coincide con una de las personas que ha pasado la frontera.");
            } else {
                System.out.println("La persona con el nombre: "+nombre+" no coincide con ninguna persona que haya pasado la frontera.");
            }
        }

    }

    public void buscadorDNI() {
        teclado = new Scanner(System.in);
        System.out.println("Escribe el dni que buscas:");
        String dni = teclado.next();

     //   for (int i = 0; i <personList.size(); i++) {
       //     Person p = personList.get(i);
      //  }

        for (Person p:personList) {
            if (p.getDni().equals(dni)){
                System.out.println(dni+" coincide con una de las personas que ha pasado la frontera.");
            } else {
                System.out.println("La persona con el dni: "+dni+" no coincide con ninguna persona que haya pasado la frontera");
            }
        }
    }

    public void registrarPersona() {

        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        String nombre = teclado2.nextLine();
        System.out.println("Escribe tu DNI: ");
        String dni = teclado2.nextLine();
        personList.add(new Person(nombre, dni));

    }


    public void iniciar() throws IOException {

        bucle_principal:
        while (true) {

            System.out.println(" 1. Paso de Frontera (Registro).");
            System.out.println(" 2. Mostrar todas las personas.");
            System.out.println(" 3. Busqueda por nombre.");
            System.out.println(" 4. Busqueda por DNI.");
            System.out.println(" 5. Salir.");

            System.out.println("Escribe la opción que quieres elegir: ");
            Integer opcion = teclado.nextInt();


            switch (opcion) {
                case 1:
                    registrarPersona();
                    break;
                case 2:
                    mostrarNombre();
                    break;
                case 3:
                    buscadorNombre();
                    break;
                case 4:
                    buscadorDNI();
                    break;
                case 5:
                    System.out.println("Exit");
                    break bucle_principal;
            }


        }
    }
}









