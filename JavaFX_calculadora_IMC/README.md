# Configuração do JavaFX no VS Code

Este guia detalha como configurar o ambiente de desenvolvimento JavaFX no Visual Studio Code para resolver erros de bibliotecas não encontradas.

## 1. Instalação do JavaFX SDK

Se você ainda não possui o SDK instalado:

1. Acesse o site oficial: [Gluon JavaFX](https://gluonhq.com/products/javafx/).
2. Baixe o **JavaFX Windows SDK** compatível com a sua versão do Java (geralmente a versão **17** ou **21 LTS**).
3. Descompacte o arquivo em um diretório de fácil acesso.
   - *Exemplo:* `C:\java-libs\javafx-sdk`

## 2. Configuração das Bibliotecas no VS Code

Para que o editor reconheça as classes do JavaFX (removendo os erros de "import cannot be resolved"), siga estes passos:

1. No **VS Code**, abra a barra lateral esquerda (Explorer).
2. Localize a seção **Java Projects** (geralmente situada na parte inferior do painel).
3. Expanda o seu projeto atual.
4. Localize e clique com o botão direito (ou no ícone de **+**) em **Referenced Libraries**.
5. Navegue até a pasta onde você descompactou o SDK.
6. Entre na pasta `lib` e selecione todos os arquivos `.jar`.
7. Confirme a seleção.

---

## 3. Comandos de Compilação e Execução

Caso utilize o terminal (CMD) para compilar seu arquivo, lembre-se de apontar o caminho do módulo:

### Compilação
```bash
javac --module-path "C:\caminho\para\javafx-sdk\lib" --add-modules javafx.controls NomeDoArquivo.java

### EXECUÇÃO
java --module-path "C:\caminho\para\javafx-sdk\lib" --add-modules javafx.controls NomeDoArquivo


# Projeto Calculadora de IMC

Este projeto é uma aplicação simples para calcular o Índice de Massa Corporal (IMC), servindo como estudo de caso para desenvolvimento de interface e lógica matemática.

---

## 🎨 Wireframe (Interface)

O esboço abaixo representa a estrutura visual desejada para a aplicação:

```text
+---------------------------------------+
|                                       |
|            CALCULADORA                |
|               DE IMC                  |
|                                       |
|   Peso: __________ kg                 |
|                                       |
|   Altura: ________ m                  |
|                                       |
|   [ Calcular IMC ]                    |
|                                       |
+---------------------------------------+

| IMC (kg/m²) | Classificação |
| :--- | :--- |
| Abaixo de 17 | Muito abaixo do peso |
| 17 - 18,49 | Abaixo do peso |
| 18,5 - 24,99 | Peso normal |
| 25 - 29,99 | Acima do peso |
| 30 - 34,99 | Obesidade I |
| 35 - 39,99 | Obesidade II (severa) |
| Acima de 40 | Obesidade III (mórbida) |