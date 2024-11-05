import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class LeerArchivos {
    public static void main(String[] args) {

        //Identificar si la ruta del archivo es correcta
        File file = new File("D:\\Fundamentos de Programacion\\Ejercicio_Manejo_de_Archivos\\");
        System.out.println(file.exists());

        //Leer el archivo
        String ruta = "D:\\Fundamentos de Programacion\\Ejercicio_Manejo_de_Archivos\\";
        String nombreArchivo = "test.txt";

        try (FileReader fr = new FileReader(ruta + nombreArchivo)) {

            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

