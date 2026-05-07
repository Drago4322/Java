import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Calculadora
{
    private double resultado;
    private List<String> historial;

    public Calculadora()
    {
        this.resultado = 0;
        this.historial = new ArrayList<>();
    }

    public void sumar(double a, double b)
    {
        resultado = a + b;
        historial.add(a + " + " + b + " = " + resultado);
    }

    public void restar(double a, double b)
    {
        resultado = a - b;
        historial.add(a + " - " + b + " = " + resultado);
    }

    public void multiplicar(double a, double b)
    {
        resultado = a * b;
        historial.add(a + " * " + b + " = " + resultado);
    }

    public void dividir(double a, double b)
    {
        resultado = a / b;
        historial.add(a + " / " + b + " = " + resultado);
    }

    public void raizCuadrada(double a)
    {
        resultado = Math.sqrt(a);
        historial.add("sqrt(" + a + ") = " + resultado);
    }

    public void potencia(double base, double exponente)
    {
        resultado = Math.pow(base, exponente);
        historial.add(base + " ^ " + exponente + " = " + resultado);
    }

    public void seno(double angulo)
    {
        double radianes = Math.toRadians(angulo);
        resultado = Math.sin(radianes);
        historial.add("sin(" + angulo + "°) = " + resultado);
    }

    public void coseno(double angulo)
    {
        double radianes = Math.toRadians(angulo);
        resultado = Math.cos(radianes);
        historial.add("cos(" + angulo + "°) = " + resultado);
    }

    public double getResultado()
    {
        return resultado;
    }

    public List<String> getHistorial()
    {
        return historial;
    }
}

public class Main {
    public static void main(String[] args)
    {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir)
        {
            System.out.println("\n--- Menu de Operaciones ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Raiz Cuadrada");
            System.out.println("6. Potencia");
            System.out.println("7. Seno");
            System.out.println("8. Coseno");
            System.out.println("9. Ver Historial");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opcion: ");

            if (!scanner.hasNextInt())
            {
                System.out.println("Opcion no valida. Ingrese un numero del 1 al 10.");
                scanner.next();
                continue;
            }

            int opcion = scanner.nextInt();

            switch (opcion)
            {
                case 1 ->
                {
                    System.out.print("Ingrese el primer numero: ");
                    double a = scanner.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    double b = scanner.nextDouble();
                    calculadora.sumar(a, b);
                    System.out.println("Resultado: " + calculadora.getResultado());
                }
                case 2 ->
                {
                    System.out.print("Ingrese el primer numero: ");
                    double a = scanner.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    double b = scanner.nextDouble();
                    calculadora.restar(a, b);
                    System.out.println("Resultado: " + calculadora.getResultado());
                }
                case 3 ->
                {
                    System.out.print("Ingrese el primer numero: ");
                    double a = scanner.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    double b = scanner.nextDouble();
                    calculadora.multiplicar(a, b);
                    System.out.println("Resultado: " + calculadora.getResultado());
                }
                case 4 ->
                {
                    System.out.print("Ingrese el primer numero: ");
                    double a = scanner.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    double b = scanner.nextDouble();
                    calculadora.dividir(a, b);
                    System.out.println("Resultado: " + calculadora.getResultado());
                }
                case 5 ->
                {
                    System.out.print("Ingrese el numero: ");
                    double a = scanner.nextDouble();
                    calculadora.raizCuadrada(a);
                    System.out.println("Resultado: " + calculadora.getResultado());
                }
                case 6 ->
                {
                    System.out.print("Ingrese la base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    double exponente = scanner.nextDouble();
                    calculadora.potencia(base, exponente);
                    System.out.println("Resultado: " + calculadora.getResultado());
                }
                case 7 ->
                {
                    System.out.print("Ingrese el angulo en grados: ");
                    double angulo = scanner.nextDouble();
                    calculadora.seno(angulo);
                    System.out.println("Resultado: " + calculadora.getResultado());
                }
                case 8 ->
                {
                    System.out.print("Ingrese el angulo en grados: ");
                    double angulo = scanner.nextDouble();
                    calculadora.coseno(angulo);
                    System.out.println("Resultado: " + calculadora.getResultado());
                }
                case 9 -> {
                    System.out.println("\n--- Historial de Operaciones ---");
                    if (calculadora.getHistorial().isEmpty()) {
                        System.out.println("No hay operaciones registradas aun.");
                    } else {
                        for (String entrada : calculadora.getHistorial()) {
                            System.out.println(entrada);
                        }
                    }
                }
                case 10 -> {
                    System.out.println("Saliendo del programa...");
                    salir = true;
                }
                default -> System.out.println("Opcion no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}
