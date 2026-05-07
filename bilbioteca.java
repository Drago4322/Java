import java.util.ArrayList;
import java.util.Scanner;

class libro {
    int id;
    String titulo;
    String autor;
    int paginas;
    String fecha;
    String ultEd;
    double precio;
    boolean estado;
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<libro> libros = new ArrayList<>();
        int opcion;
        int contadorId = 1;

        System.out.println("Hola, Bienvenido a la biblioteca!");

        do {
            System.out.println("------MENU-------");
            System.out.println("1. Nuevo libro");
            System.out.println("2. Libros disponibles");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    libro l = new libro();

                    l.id = contadorId++;

                    System.out.print("Ingrese el titulo del libro: ");
                    l.titulo = scanner.nextLine();

                    System.out.print("Ingrese el autor del libro: ");
                    l.autor = scanner.nextLine();

                    System.out.print("Ingrese la cantidad de paginas: ");
                    l.paginas = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese la fecha de publicacion: ");
                    l.fecha = scanner.nextLine();

                    System.out.print("Ingrese la fecha de la ultima edición: ");
                    l.ultEd = scanner.nextLine();

                    System.out.print("Ingrese el precio del libro: ");
                    l.precio = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Esta disponible? S/N: ");
                    String resp = scanner.nextLine();

                    if (resp.equalsIgnoreCase("s")) {
                        l.estado = true;
                    } else {
                        l.estado = false;
                    }

                    libros.add(l);

                    System.out.println("Libro creado con exito");
                }

                case 2 -> {
                    System.out.println("Libros disponibles:");
                    boolean hay = false;

                    for (libro l : libros) {
                        if (l.estado) {
                            System.out.println(
                                "ID: " + l.id +
                                " | Titulo: " + l.titulo +
                                " | Autor: " + l.autor +
                                " | Paginas: " + l.paginas +
                                " | Fecha: " + l.fecha +
                                " | Ultima edición: " + l.ultEd +
                                " | Precio: " + l.precio
                            );
                            hay = true;
                        }
                    }

                    if (!hay) {
                        System.out.println("No hay libros disponibles");
                    }
                }

                case 3 -> {
                    System.out.print("Ingrese el ID del libro a prestar: ");
                    int idBuscar = scanner.nextInt();
                    boolean encontrado = false;

                    for (libro l : libros) {
                        if (l.id == idBuscar) {
                            if (l.estado) {
                                l.estado = false;
                                System.out.println("Libro prestado correctamente");
                            } else {
                                System.out.println("El libro ya está prestado");
                            }
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Libro no encontrado");
                    }
                }

                case 4 -> {
                    System.out.print("Ingrese el ID del libro a devolver: ");
                    int idBuscar = scanner.nextInt();
                    boolean encontrado = false;

                    for (libro l : libros) {
                        if (l.id == idBuscar) {
                            if (!l.estado) {
                                l.estado = true;
                                System.out.println("Libro devuelto correctamente");
                            } else {
                                System.out.println("El libro ya está disponible");
                            }
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Libro no encontrado");
                    }
                }

                case 5 -> {
                    System.out.println("Saliendo del sistema...");
                }

                default -> {
                    System.out.println("Opcion inválida");
                }
            }

        } while (opcion != 5);
    }
}
