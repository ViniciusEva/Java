# Gerador de Senhas Seguras (Java)

Um utilitário simples, porém robusto, desenvolvido em Java para gerar senhas aleatórias criptograficamente seguras através do terminal.

## 🚀 Funcionalidades

- **Segurança Forte:** Utiliza a classe `SecureRandom` para garantir que a aleatoriedade seja resistente a ataques.
- **Interatividade:** Permite que o usuário defina o comprimento da senha no momento da execução.
- **Diversidade de Caracteres:** Inclui letras (maiúsculas e minúsculas), números e uma ampla gama de símbolos especiais:
  - `abcdefghijklmnopqrstuvwxyz`
  - `ABCDEFGHIJKLMNOPQRSTUVWXYZ`
  - `0123456789`
  - `!@#$%&*()_+-=[]|,./?><`

## 🛠️ Pré-requisitos

- **Java JDK** (versão 11 ou superior recomendada).
- **JavaFX SDK** (caso utilize a configuração de módulos sugerida no código).

## ⚙️ Como Compilar e Rodar

Abra o seu terminal na pasta do projeto e utilize os comandos abaixo:

### Compilação padrão:
```bash
javac ProjetoGeradorDeSenhas.java
```

### Execução

**1** - javac --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.controls ProjetoGeradorDeSenhas.java
**2** - java --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.controls ProjetoGeradorDeSenhas

### 📖 Exemplo de Uso
Digite o comprimento da senha que deseja: 14
Senha gerada: aB8$kL2!pQ9@mN