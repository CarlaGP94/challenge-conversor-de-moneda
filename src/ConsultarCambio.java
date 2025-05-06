import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarCambio {
    // Su clave API: 31118cbd8505283e353a3b71
    // https://v6.exchangerate-api.com/v6/ SU-CLAVE-API /par/ EUR / GBP / IMPORTE

    public void cambio (int moneda1, int moneda2, double monto) {
        URI link = URI.create("https://v6.exchangerate-api.com/v6/31118cbd8505283e353a3b71/pair/"+
                moneda1 + "/" + moneda2 + "/" + monto);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(link)
                .build();

        HttpResponse<String> response;

        {
            try {
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

