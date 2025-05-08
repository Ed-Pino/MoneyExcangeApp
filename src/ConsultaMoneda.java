import com.google.gson.Gson;
import modelo.MonedaConversionResponse;
import modelo.MonedaResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    private final String apiKey;
    private final HttpClient httpClient;
    private final Gson gson;

    public ConsultaMoneda(String apiKey) {
        this.apiKey = apiKey;
        this.httpClient = HttpClient.newHttpClient();
        this.gson = new Gson();
    }

    public String obtenerTasaCambioUSD(String currency) throws IOException, InterruptedException {
        String url = String.format("https://v6.exchangerate-api.com/v6/%s/latest/USD", apiKey);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            MonedaResponse jsonResponse = gson.fromJson(response.body(), MonedaResponse.class);
            if ("success".equals(jsonResponse.result())) {
                if (jsonResponse.conversion_rates().containsKey(currency)) {
                    return jsonResponse.conversion_rates().get(currency).toString();
                } else {
                    System.err.println("Moneda no encontrada: " + currency);
                    return null;
                }
            } else {
                System.err.println("Error de API: " + jsonResponse.error_type());
                return null;
            }
        } else {
            System.err.println("Error HTTP: " + response.statusCode());
            return null;
        }
    }

    public double obtenerConversion(String fromCurrency, String toCurrency, double amount) throws IOException, InterruptedException {
        String url = String.format("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s",
                apiKey, fromCurrency, toCurrency);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            MonedaConversionResponse jsonResponse = gson.fromJson(response.body(), MonedaConversionResponse.class);
            if ("success".equals(jsonResponse.result())) {
                return jsonResponse.conversion_rate() * amount;
            } else {
                System.err.println("Error API: " + jsonResponse.error_type());
                return -1;
            }
        } else {
            System.err.println("Error HTTP: " + response.statusCode());
            return -1;
        }
    }
}
