# 🖊️ Meu Primeiro Programa em Java: Classe Caneta

Este repositório marca o início da minha jornada na programação Java! 🚀 
É um projeto fundamental que explora os pilares da **Orientação a Objetos (OO)**, simulando o comportamento e as características de uma caneta do mundo real.

## 📝 Sobre o Projeto

O objetivo deste programa foi aprender como traduzir objetos da vida real para o código. Ele utiliza duas classes principais:
1.  **Caneta:** Define os atributos (o que ela tem) e os métodos (o que ela faz).
2.  **App:** A classe principal que "instancia" (cria) as canetas e executa as ações.

---

## 🏗️ Conceitos Aprendidos

Durante o desenvolvimento deste primeiro programa, apliquei conceitos essenciais:

* **Atributos:** Características do objeto, como `cor`, `modelo`, `ponta`, `carga` e o estado `tampada`.
* **Métodos:** Ações que o objeto pode realizar, como `rabiscar()`, `tampar()` e `destampar()`.
* **Estado (Status):** Um método para exibir o estado atual de cada atributo da caneta.
* **Instanciação:** A criação de diferentes objetos (`c1` e `c2`) a partir da mesma "planta" (classe).

---

## 🛠️ Como o Código Funciona

O programa simula a lógica de uso de uma caneta: você não pode rabiscar se ela estiver tampada!

### Estrutura de Classes

[Image of a UML Class Diagram for Caneta showing attributes like cor, modelo, ponta, and methods like rabiscar, tampar, destampar]

1.  **O Atributo `tampada`:** É um valor booleano (verdadeiro/falso) que controla o comportamento do método `rabiscar()`.
2.  **A Verificação:** Se tentarmos rabiscar com a caneta tampada, o sistema gera uma mensagem de erro.
3.  **Independência de Objetos:** No código, a caneta `c1` pode estar azul e tampada, enquanto a `c2` pode ser preta e destampada. Cada uma mantém seu próprio estado.

---

## 📋 Como Executar

1.  Certifique-se de ter o JDK instalado.
2.  Crie os arquivos `Caneta.java` e `App.java`.
3.  Compile e execute:

```bash
javac *.java
java App
```
### 📖 Exemplo de Saída no Terminal

ERRO! Não posso rabiscar
Uma caneta: Azul
está tampada? true
Ponta: 0.5
...

Estou Rabiscando
Uma caneta: Preta
está tampada? false
Modelo: Hostnet
...

================================================================================================================================================================================================================================================

***Este foi o meu primeiro contato prático com Java. Ele serviu de base para entender como a linguagem organiza os dados e as funções, preparando o caminho para projetos mais complexos, como interfaces gráficas e algoritmos de segurança.***

