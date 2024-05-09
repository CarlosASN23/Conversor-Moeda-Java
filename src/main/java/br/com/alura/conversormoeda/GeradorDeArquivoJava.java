package br.com.alura.conversormoeda;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivoJava {

    private Object siglaMoedaAtual;
    private Object siglaMoedaConverte;

    public void salvaJson(Moeda moeda) throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter(moeda.getSiglas() + ".json");
        escrita.write(gson.toJson(moeda));
        escrita.close();
    }
}
