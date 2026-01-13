# Projeto Mini Web Browser Java

Este projeto consiste no desenvolvimento de um navegador web minimalista utilizando a linguagem **Java** e a biblioteca gráfica **JavaFX**. [cite_start]O objetivo é demonstrar a integração de componentes web dentro de uma aplicação desktop.

---

## 🚀 Descrição do Projeto
O sistema é um navegador simplificado que permite ao usuário inserir uma URL e carregar o conteúdo visual de páginas da internet.A interface é composta por uma barra de endereços e uma área de exibição de conteúdo.

## 🛠️ Componentes Chave
A aplicação utiliza os seguintes componentes do JavaFX:
* **TextField**: Campo de texto para a inserção do endereço (URL) da página.
* **WebView**: Componente visual que atua como a janela de exibição do navegador.
* **WebEngine**: O motor interno responsável por processar e renderizar as páginas.

## ⚙️ Funcionalidades
* **Carregamento por Enter**: O navegador carrega a página automaticamente ao pressionar a tecla Enter após digitar a URL.
* **Tratamento de Protocolo**: O código inclui um método para inserir automaticamente o prefixo `http://` caso o usuário não o digite.
* **Foco em Navegação Simples**: Não foram implementados botões de controle adicionais, como "Voltar" ou "Parar".

## 💻 Como Compilar e Executar

Para rodar o projeto, é necessário apontar para o caminho do seu SDK JavaFX.

**Compilação:**
```bash
javac --module-path "%PATH_TO_FX%" --add-modules javafx.web ProjetoMiniWebBrowserJava.java
```

**Execução:**
```bash
java --module-path "%PATH_TO_FX%" --add-modules javafx.web ProjetoMiniWebBrowserJava
```

## 🌐 Testes de Compatibilidade

Devido às características do motor de renderização `WebEngine` do JavaFX, a experiência de navegação pode variar dependendo das tecnologias utilizadas pelos sites.

### ✅ Sites Compatíveis (Recomendados para Teste)
Estes sites foram testados e apresentam bom funcionamento:

* **myCompiler**: Plataforma de compilador Java online.
* **HackerEarth**: Ambiente para desafios e competições de programação.
* **Exercism**: Site focado no aprendizado e prática de várias linguagens.
* **CodeChef**: Plataforma de codificação com problemas e competições.
* **CodingBat**: Excelente para praticar lógica e sintaxe Java.
* **Amazon**: Navegação funcional em loja online.
* **Curso de Kubernetes**: Recurso educativo sobre orquestração de contêineres.

### ❌ Sites Incompatíveis (Limitações Conhecidas)
Alguns sites podem apresentar falhas de carregamento ou funções indisponíveis:

* **Terra**: Portal de notícias complexo com múltiplos serviços.
* **Udemy**: Plataforma de cursos (pode haver problemas com players de vídeo).

* **Edabit**: Atualmente incompatível com este motor de renderização.
