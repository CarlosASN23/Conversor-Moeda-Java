package br.com.alura.conversormoeda;

import com.google.gson.annotations.SerializedName;

import java.text.DecimalFormat;

public class Moeda {

    @SerializedName("base_code")
    private String siglaMoedaAtual;

    @SerializedName("target_code")
    private String siglaMoedaConverte;

    @SerializedName("conversion_rate")
    private Double valorConversao;

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    private String siglas;


    public Moeda() {
    }

    public Moeda(String siglaMoedaAtual, String siglaMoedaConverte, Double valorConversao,String siglas) {
        this.siglaMoedaAtual = siglaMoedaAtual;
        this.siglaMoedaConverte = siglaMoedaConverte;
        this.valorConversao = valorConversao;
        this.siglas = siglas;
    }

    public String getSiglaMoedaAtual() {
        return siglaMoedaAtual;
    }

    public void setSiglaMoedaAtual(String siglaMoedaAtual) {
        this.siglaMoedaAtual = siglaMoedaAtual;
    }

    public String getSiglaMoedaConverte() {
        return siglaMoedaConverte;
    }

    public void setSiglaMoedaConverte(String siglaMoedaConverte) {
        this.siglaMoedaConverte = siglaMoedaConverte;
    }

    public Double getValorConversao() {
        return valorConversao;
    }

    public void setValorConversao(Double valorConversao) {
        this.valorConversao = valorConversao;
    }

    public void converterMoeda(Double valor){

        double resultado = this.valorConversao * valor;
        DecimalFormat df = new DecimalFormat("#.####");
        System.out.printf("O valor de $"+ valor + " na moeda " + this.getSiglaMoedaAtual()
                + " convertida para " + this.siglaMoedaConverte + " = $" +  df.format(resultado)+"\n");
    }
    @Override
    public String toString() {
        return "Sigla moeda atual: " +this.siglaMoedaAtual +
                "\nSigla moeda a ser convertida: " + this.siglaMoedaConverte +
                "\nValor de conversao: " + this.valorConversao;
    }
}
