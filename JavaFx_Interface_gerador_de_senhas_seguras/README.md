# 🖥️ Interface Gráfica para o Gerador de Senhas

Esta é a camada visual (Frontend) do projeto **Gerador de Senhas Seguras**. Desenvolvida em JavaFX, esta interface permite que o usuário gere senhas de forma intuitiva, sem a necessidade de interagir diretamente com o terminal.

## 🔗 Integração de Classes

O projeto agora está dividido em uma arquitetura de duas camadas:
1.  **Lógica (Backend):** A classe `ProjetoGeradorDeSenhas` contém o algoritmo `SecureRandom`.
2.  **Interface (Frontend):** A classe `ProjetoGeradorDeSenhasGUI` gerencia a janela, os botões e os campos de texto.

---

## 🎨 Funcionalidades da Interface

* **Campo de Entrada:** Permite definir o tamanho da senha (com sugestão padrão de 8 caracteres).
* **Botão de Ação:** Gatilho que executa a lógica de geração ao ser clicado.
* **Campo de Saída Estilizado:** Exibe a senha gerada em um campo de leitura (não editável) com estilo visual moderno (**texto ciano em fundo preto**).
* **Layout Organizado:** Uso de `VBox` com espaçamentos (`Spacing`) e margens (`Padding`) para uma interface limpa.

---

## 🛠️ Como Compilar e Executar

Como esta classe depende da classe original, ambas devem estar no mesmo diretório.

### Compilação
```bash
javac --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.controls ProjetoGeradorDeSenhas.java ProjetoGeradorDeSenhasGUI.java
```

### Execução
```bash
java --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.controls ProjetoGeradorDeSenhasGUI
```

### O que mudou aqui?
1. **Conexão:** a GUI agora "chama" a lógica que fez antes.
2. **Estilização:** visual (Ciano/Preto) implementado.
3. **Organização:** `VBox` e `Insets` ajudam no design.