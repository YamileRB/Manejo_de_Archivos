import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Promedios {
    public static void main(String[] args) {
        String ruta = "D:\\Fundamentos de Programacion\\Ejercicio_Manejo_de_Archivos\\test.txt";
        ArrayList<Double> numeros = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                try {
                    double numero = Double.parseDouble(linea);
                    numeros.add(numero);
                } catch (NumberFormatException e) {
                    System.err.println("No se pudo convertir a número: " + linea);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        if (!numeros.isEmpty()) {
            double suma = 0;
            double mayor = Double.NEGATIVE_INFINITY;
            double menor = Double.POSITIVE_INFINITY;
            for (double numero : numeros) {
                suma += numero;
                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
            double promedio = suma / numeros.size();
            System.out.println("El promedio es: " + promedio);
            System.out.println("El número mayor es: " + mayor);
            System.out.println("El número menor es: " + menor);
        } else {
            System.out.println("No se encontraron números válidos en el archivo.");
        }
    }
}