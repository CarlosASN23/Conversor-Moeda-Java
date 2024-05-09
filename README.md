# DESCRIÇÃO
OBJETIVO: Desenvolver um Conversor de Moedas que ofereça interação textual (via console) com os usuários, proporcionando no mínimo 6 opções distintas de conversões de moedas em um menu. A taxa de conversão não será estática, mas sim dinamicamente obtida por meio de uma API, garantindo dados precisos e em tempo real para uma experiência mais atualizada e eficaz.

Os passos para completar este desafio serão detalhados a seguir e estarão disponíveis na seção adjacente:

    - Configuração do Ambiente Java;
    - Criação do Projeto;
    - Consumo da API;
    - Análise da Resposta JSON;
    - Filtro de Moedas;
    - Exibição de Resultados aos Usuários;
    
# 1º PASSO
Configuração do ambiente de desenvolvimento Java para o nosso desafio de construção do Conversor de Moedas. Certifique-se de ter os seguintes programas, arquivos e versões:

    Java JDK: versão: 11 em diante -
    Download the Latest Java LTS Free
    Biblioteca Gson 2.10.1 em diante -
    Maven Central Repository Search
    Postman -
    Download Postman | Get Started for Free
    IDE (Ambiente de desenvolvimento integrado) IntelliJ IDEA- opcional -
    Baixe o IntelliJ IDEA – O principal IDE para Java e Kotlin

# 2º PASSO
Conhecendo a documentação da API https://www.exchangerate-api.com/ para a realização das conversões entre as moedas.

# 3º PASSO
Importando a biblioteca Gson no Intellij

# 4º PASSO
Construindo o client para solicitações HttpClient

# 5º PASSO
Criação da requisição HttpRquest para configura e personalizar as solicitações feita a API

# 6º PASSO
Construindo a resposta HttpResponse para gerenciar as respostas recebidas da API

# 7ºPASSO
Realizando a resposta em formato Json utilizando a biblioteca Gson através de mapeamentos de dados JSON para objetos Java

# 8º PASSO
Filtrando as moedas através das classes ConverteMoeda e Sigla

# 9º PASSO
Conversão de valores entre as moedas, através da interação com o usuario

# 10º PASSO
Criação da classe GeradorDeArquivo para gerar arquivos Json sobre as atividades realizadas pelo usuario (Conversão de moedas) através da biblioteca FileWriter

