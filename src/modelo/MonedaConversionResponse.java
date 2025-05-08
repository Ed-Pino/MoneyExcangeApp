package modelo;
public record MonedaConversionResponse(
        String result,
        double conversion_rate,
        String error_type
) {}