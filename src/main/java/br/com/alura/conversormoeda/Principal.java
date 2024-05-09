package br.com.alura.conversormoeda;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException, InterruptedException {

        //Instanciação da classe Conversor de Moeda para realizar a conversão e conexão com a API
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        Scanner sc = new Scanner(System.in);

        // Inicialização do menu de exibição
        String menu = "\n===== MENU DE ESCOLHAS =====" +
                "\n1 - EXIBIR SIGLAS DE MOEDAS" +
                "\n2 - CONVERTER MOEDA" +
                "\n3 - SAIR " +
                "\n============================";

        int opcao = 0;

        // Bloco condicional para execurtar as opções do menu
        while(opcao != 3){

            System.out.println(menu);

            System.out.println("Entre com uma número inteiro de 1 a 3");
            opcao = sc.nextInt();

            switch (opcao){

                case 1:

                    System.out.println("Aqui esta uma lista de alguns paises e as siglas de suas moedas: ");
                    Map<String, String> siglas = Sigla.getTodasSiglas();
                    for(Map.Entry<String, String> entry : siglas.entrySet()){
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    }
                    break;

                case 2:

                    // Entrada de dados
                    System.out.println("Entre com a sigla da moeda:");
                    String siglaMoedaAtual = sc.next();

                    System.out.println("Entre com a sigla da moeda a ser convertida:");
                    String siglaMoedaConverte = sc.next();

                    System.out.println("Dgite o valor a ser convertido:");
                    Double valorMoeda = sc.nextDouble();

                    try{

                        if(siglaMoedaAtual != null ){

                            if (siglaMoedaConverte != null){

                                Moeda novaMoeda = conversorMoeda.converterMoeda(siglaMoedaAtual,siglaMoedaConverte);
                                novaMoeda.converterMoeda(valorMoeda);
                                System.out.println(novaMoeda.toString());
                                GeradorDeArquivoJava gerador = new GeradorDeArquivoJava();
                                gerador.salvaJson(novaMoeda);

                            }
                        }
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Finalizando operação...");
                    break;

                case 3:
                    System.out.println("SAINDO DA APLICAÇÃO...");
                    break;
            }
        }
    }
}
