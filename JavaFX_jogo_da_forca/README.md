# 🐍 Jogo da Forca em Java

Este projeto é uma implementação clássica do **Jogo da Forca** desenvolvida em Java. O sistema seleciona aleatoriamente palavras de um banco de dados e gerencia as tentativas do usuário via terminal.

## 🎯 Objetivo do Projeto

O objetivo é aplicar conceitos lógicos de programação, como manipulação de listas (`ArrayList`), estruturas de repetição (`while` e `for`) e geração de números aleatórios, seguindo o planejamento pedagógico do **Prof. Eng. Arnaldo Sousa**.

---

## 📐 Wireframe do Jogo (Esboço do PDF)

Baseado no planejamento do projeto, o fluxo de interface no terminal segue este padrão:

```text
+---------------------------------------+
|        Wireframe Jogo da Forca        |
+---------------------------------------+
|                                       |
|   Palavra: [ _, _, _, _, _ ]          |
|                                       |
|   Chute uma letra: u                  |
|                                       |
|   Você tem mais 5 tentativas.         |
|                                       |
|   Palavra: [ c, _, b, r, a ]          |
|                                       |
|   Chute uma letra: o                  |
|                                       |
|   Parabéns, você acertou!             |
|   A palavra era: cobra                |
|                                       |
+---------------------------------------+
```

### Funcionalidades
- **Seleção Aleatória:** O jogo escolhe entre palavras como "cobra", "elefante" e "girafa".

- **Máscara de Palavra:** Exibe traços (_) que são substituídos conforme o jogador acerta as letras.

- **Controle de Tentativas:** O jogador inicia com 6 tentativas. A cada erro, o número é decrementado.

- **Verificação de Vitória/Derrota:** O jogo encerra ao descobrir a palavra ou ao zerar as tentativas.

### Compilação 
```bash
javac ProjetoJogoDaForca.java
```

### Execução
```bash
java ProjetoJogoDaForca
```