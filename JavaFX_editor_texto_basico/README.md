# Projeto Editor de Texto Básico

Este projeto consiste em um editor de texto simples desenvolvido em **Java** utilizando a biblioteca **JavaFX**. O software permite que o usuário realize a edição de textos e salve o conteúdo em arquivos locais.

---

## 🎨 Wireframe (Esboço da Interface)

O design da interface segue a estrutura básica apresentada abaixo:

```text
+---------------------------------------+
|        Editor de Texto Básico         |
+---------------------------------------+
| [Salvar]                              |
+---------------------------------------+
|                                       |
|                                       |
|           Área de Texto               |
|                                       |
|                                       |
+---------------------------------------+
```

## 🎯 Objetivo
O propósito deste projeto é:
* Criar um editor de texto simples usando JavaFX.
* Permitir que o programa seja utilizado para digitar, editar e salvar texto em um arquivo.

## 🏗️ Componentes do Sistema
A interface foi construída utilizando os seguintes elementos principais:
* **TextArea**: Área dedicada para realizar a digitação e a edição do texto.
* **Botão "Salvar"**: Componente que abre uma janela de diálogo para que o usuário escolha onde deseja salvar o arquivo de texto.
* **ToolBar**: Barra de ferramentas que organiza o botão de salvar no topo da interface.
* **BorderPane**: Gerenciador de layout que posiciona a barra de ferramentas no topo e a área editável no centro.

---

## 🚀 Como Compilar e Executar

### Compilação:
```bash
javac --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.controls ProjetoEditorDeTextoBasico.java
```

### Execução:
```bash
java --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.controls ProjetoEditorDeTextoBasico

```
