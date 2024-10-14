package currencyconverter;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyService {
    private static final String API_KEY = "a0b405660f1ad16112f13de0";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";
    private static final HttpClient httpClient = HttpClient.newHttpClient();
    private static final Gson gson = new Gson();

    public double getExchangeRate(String fromCurrency, String toCurrency) throws IOException, InterruptedException {
        String url = BASE_URL + fromCurrency;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        JsonObject jsonObject = gson.fromJson(response.body(), JsonObject.class);

        return jsonObject.getAsJsonObject("conversion_rates").get(toCurrency).getAsDouble();
    }
}