# Projeto: Lista de Compras 📝

Este é um projeto simples desenvolvido em **Java** com **JavaFX** que permite aos usuários gerenciar uma lista de compras de forma visual e exportar os dados para um arquivo de texto.

## 📐 Wireframe e Interface

O design do aplicativo segue a estrutura definida no planejamento inicial:

```text
+---------------------------------------+
|           Lista de Compras            |
+---------------------------------------+
| Digite o item que deseja adicionar    |
| [____________________________________]|
|                                       |
| [ Adicionar ]                         |
+---------------------------------------+
| Lista de Compras:                     |
| - Item 1                              |
| - Item 2                              |
| - Item 3                              |
+---------------------------------------+
| [ Exportar Lista ]                    |
+---------------------------------------+
```

### 🚀 Funcionalidades Principais:

* Com base nos requisitos do projeto, as seguintes funcionalidades foram implementadas:
* Campo de Texto: Área onde os usuários podem digitar o nome do item desejado.
* Botão "Adicionar": Ao clicar, o item é inserido tanto na lógica interna quanto na interface visual.
* Lista Visualizável: Exibe de forma organizada os itens que compõem a lista de compras atual.
* Botão "Exportar Lista": Salva os itens em um arquivo de texto nomeado listaDeCompras.txt.

### 🛠️ Tecnologias e Estrutura Técnica

* Linguagem: Java.
* Interface Gráfica: JavaFX (utilizando componentes como TextField, Button, ListView e VBox).
* Armazenamento: ArrayList para manipulação de dados e PrintWriter para exportação de arquivos.

---
## 💻 Como Executar o Projeto

Para compilar e rodar a aplicação, utilize os comandos abaixo no seu terminal (ajuste o caminho do SDK do JavaFX conforme sua instalação):

### Compilação
```bash
javac --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.web ProjetoListaDeCompras.java
```
### Execução
```bash
java --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.web ProjetoListaDeCompras
```

## Estrutura do Arquivo de Saída
* Ao clicar em Exportar, o sistema cria um arquivo `listaDeCompras.txt` no diretório raiz do projeto. Cada item adicionado aparecerá em uma nova linha dentro do arquivo.
