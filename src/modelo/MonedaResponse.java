package modelo;
import java.util.Map;

public record MonedaResponse(
        String result,
        Map<String, Double> conversion_rates,
        String error_type
) {}