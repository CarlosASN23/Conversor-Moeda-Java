package br.com.alura.conversormoeda;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMoeda {

    private Moeda obj;

    public Moeda converterMoeda(String siglaMoedaAtual, String siglaMoedaConverte) {

        //Chave API
        String api_key = "f9f4a92476a8ab3e09adc3a3";

        URI converterMoeda = URI.create(("https://v6.exchangerate-api.com/v6/" + api_key + "/pair/" + siglaMoedaAtual + "/" + siglaMoedaConverte));
        HttpRequest request = HttpRequest.newBuilder()
                .uri(converterMoeda)
                .build();
        if (siglaMoedaConverte != null){

            if (siglaMoedaAtual != null) {

                try {

                    HttpResponse<String> response = HttpClient
                            .newHttpClient()
                            .send(request, HttpResponse.BodyHandlers.ofString());

                    Gson gson = new Gson();
                    return obj = gson.fromJson(response.body(),Moeda.class);
                }
                catch (IOException | InterruptedException e) {
                    throw new RuntimeException("Não foi possivel fazer a conversão");
                }
            }
        }
        return obj;
    }
}
