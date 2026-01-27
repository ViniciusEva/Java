# Projeto Premium: Sistema de Informações Climáticas em Tempo Real

Este projeto é um sistema desenvolvido em **Java** que utiliza a **WeatherAPI** para obter e exibir dados meteorológicos atuais de uma cidade específica.Ele demonstra a integração entre Java e APIs REST utilizando o formato de dados JSON.

## 📋 Objetivo do Projeto
O objetivo principal é praticar o consumo de APIs, a manipulação de dados em tempo real e a integração de bibliotecas externas para processar informações via protocolo HTTP.

## 🖼️ Wireframe (Execução no CMD)
Abaixo, a representação visual de como o sistema processa a entrada e exibe os dados meteorológicos no console:

![Wireframe do Sistema](txt)

```text
+---------------------------------------------------+
|Digite o nome da cidade:_____                      |
|Dados Originais (JSON):_____                       |
|Informações Meteorológicas para (cidade), Brazil   |
|Data e hora:_____                                  |
|Temperatura Atual:_____°C                          |
|Sensação Térmica:_____°C                           |
|Condição do Tempo:_____                            |
|Umidade:_____%                                     |
|Velocidade do Vento:_____km/h                      |
|Pressão Atmosférica:_____mb                        |
|                                                   |
|                                                   |
+---------------------------------------------------+
```

*(Imagem conforme o log de execução real do projeto)*

## 🚀 Funcionalidades Principais
1. **Entrada do usuário**: O sistema solicita o nome da cidade desejada.
2. **Comunicação com a API**: O programa envia uma requisição para a WeatherAPI.
3. **Exibição de dados**: Os dados retornados são formatados e exibidos de forma organizada para o usuário.

## 🛠️ Detalhes Técnicos
### Principais Classes Java Utilizadas 
* **java.net.URI**: Representa o endereço da web da API.
* **java.net.URLEncoder**: Codifica o nome da cidade para garantir que espaços e acentos funcionem na URL.
* **java.net.http.HttpClient**: Envia e recebe os dados via HTTP.
* **org.json.JSONObject**: Biblioteca externa usada para converter a resposta JSON em um objeto Java legível.

### O Papel do JSON
 JSON (JavaScript Object Notation) é um formato leve para troca de informações. No projeto, ele funciona da seguinte forma:
* O sistema envia a solicitação e recebe uma String longa no formato JSON.
* Essa String é convertida para um `JSONObject`.
* O código extrai valores específicos como Temperatura Atual, Sensação Térmica, Umidade e Velocidade do Vento.



## ⚙️ Como Compilar e Executar

> **Importante:** A biblioteca `org.json` não está presente no JDK padrão.É necessário baixar o arquivo `.jar` e adicioná-lo ao projeto.

### Comandos para Terminal (Exemplo utilizando JavaFX SDK)

**Para Compilar:**
```bash
javac --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules org.json ProjetoSistemaDeInformacoesClimaticasEmTempoReal.java
```

**Para Executar**
```bash
java --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules org.json ProjetoSistemaDeInformacoesClimaticasEmTempoReal
```