package br.com.alura.conversormoeda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Sigla {
    AFEGANISTAO("AFN"),
    AFRICADOSUL("ZAR"),
    ALBANIA("ALL"),
    ARGELIA("DZD"),
    EUROPA("EUR"),
    ANGOLA("AOA"),
    ANGUILLA("XCD"),
    ANTILHASHOLANDESAS("ANG"),
    ARABIASAUDITA("SAR"),
    ARGENTINA("ARS"),
    ARMENIA("AMD"),
    ARUBA("AWG"),
    AUSTRALIA("AUD"),
    AZERBAIJAO("AZN"),
    BAHAMAS("BSD"),
    BAHRAIN("BHD"),
    BANGLADESH("BDT"),
    BARBADOS("BBD"),
    BELARUS("BYR"),
    BELIZE("BZD"),
    BENIN("XOF"),
    BERMUDAS("BMD"),
    BUTAO("INR"),
    BOLIVIA("BOB"),
    BRASIL("BRL"),
    CAMAROES("XAF"),
    CANADA("CAD"),
    CHILE("CLP"),
    CHINA("CNY"),
    COLOMBIA("COP"),
    ESTADOSUNIDOS("USD"),
    INDIA("INR");

    private String siglas;

    private static final Map<String, Sigla> siglaPegarValor = new HashMap<>();

    static {
        for(Sigla sigla : Sigla.values()){
            siglaPegarValor.put(sigla.getsiglas(), sigla);
        }
    }
    void Sigla (String siglas){
        this.siglas = siglas;
    }
    Sigla(String siglas) {
        this.siglas = siglas;
    }
    public String getsiglas() {
        return this.siglas;
    }

    public static Sigla pegarFuncaoPorValor(String siglas){
        return siglaPegarValor.get(siglas);
    }

    public static Map<String, String> getTodasSiglas() {
        Map<String, String> siglas = new HashMap<>();
        for (Sigla sigla : Sigla.values()) {
            siglas.put(sigla.name(),sigla.getsiglas());
        }
        return siglas;
    }
}