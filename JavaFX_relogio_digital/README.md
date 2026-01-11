# 🕒 Relógio Digital em JavaFX

Este projeto é uma aplicação de interface gráfica (GUI) desenvolvida em Java que exibe um relógio digital em tempo real. Ele demonstra o uso de componentes visuais do JavaFX e o gerenciamento de eventos temporais com `Timeline`.

## 🚀 Funcionalidades

* **Atualização em Tempo Real:** O relógio atualiza os segundos automaticamente.
* **Interface Estilizada:** Design moderno com fundo preto e fonte amarela em tamanho grande para fácil leitura.
* **Precisão:** Utiliza a API `java.time` para capturar a hora exata do sistema.

---

## 🛠️ Tecnologias e Conceitos Utilizados

* **JavaFX (Stage, Scene, Label):** Para a construção da interface gráfica.
* **Java Time API (LocalDateTime):** Para manipulação de datas e horas.
* **JavaFX Animation (Timeline & KeyFrame):** Para criar o ciclo de atualização de 1 em 1 segundo sem travar a interface.

---

## 📋 Como Executar

Como este projeto utiliza **JavaFX**, você precisa apontar para o diretório do seu SDK. Utilize os comandos abaixo no terminal:

### Compilação
```bash
javac --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.controls ProjetoRelogioDigital.java
```
### Execução
```bash
java --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.controls ProjetoRelogioDigital
```
