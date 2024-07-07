import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Buscarmoneda {

    Exchange moneda(String cambiomoneda, String monedaacambiar){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/02d0d37ff988e0f4f68b18b4/pair/"+cambiomoneda+"/"+monedaacambiar);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().
                uri(direccion).build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            throw new RuntimeException("Error inesperado"+e);
        }
        return new Gson().fromJson(response.body(), Exchange.class);
    }
}
