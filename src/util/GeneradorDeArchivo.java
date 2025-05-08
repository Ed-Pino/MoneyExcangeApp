package util;
import modelo.Moneda;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GeneradorDeArchivo {

    public static void guardar(Moneda moneda) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String fechaFormateada = LocalDateTime.now().format(formatter);

        String nombreArchivo = String.format("conversion_%s_a_%s_%s.json",
                moneda.base(), moneda.target(), fechaFormateada);

        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            writer.write(new Gson().toJson(moneda));
            System.out.println("Resultado guardado en archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("No se pudo guardar el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}