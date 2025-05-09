import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarCambio {
    // https://v6.exchangerate-api.com/v6/ SU-CLAVE-API /pair/ EUR / GBP / IMPORTE

    public Moneda cambio (String monedaActual, String monedaCambio, double monto) {
        URI link = URI.create("https://v6.exchangerate-api.com/v6/31118cbd8505283e353a3b71/pair/"+
                monedaActual + "/" + monedaCambio + "/" + monto);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(link)
                .build();

            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), Moneda.class);

            } catch (IOException | InterruptedException e) {
                throw new RuntimeException("Error");
            }
    }
}

