# 📚 Atividade de Programação Orientada a Objetos (Java)

## 🧠 Objetivo

Esta atividade tem como objetivo praticar os conceitos fundamentais de **Programação Orientada a Objetos (POO)** em Java, através da modelagem de um sistema acadêmico simples envolvendo alunos e disciplinas.

---

## 🏗️ Estrutura da Atividade

O exercício consiste na criação de três partes principais:

### 1. Classe `Aluno`
A classe `Aluno` representa um estudante e deve conter:

- Atributos (exemplo):
  - matrícula
  - nome
  - notas (3 notas)

- Métodos:
  - Construtor
  - Getters e Setters
  - Método `toString()`
  - Método para calcular a média (média aritmética)

---

### 2. Classe `Disciplina`
A classe `Disciplina` representa uma matéria e deve conter:

- Atributos:
  - código
  - nome
  - lista de alunos (`ArrayList<Aluno>`)

- Métodos:
  - Construtor
  - Getters e Setters
  - `toString()`
  - Método para adicionar alunos
  - Método para listar alunos aprovados (média ≥ 7)
  - Método para identificar o melhor aluno

---

### 3. Classe Principal (`Main`)
Responsável por:

- Criar uma disciplina
- Ler os dados dos alunos
- Adicionar alunos à disciplina
- Exibir:
  - Lista de alunos aprovados
  - Melhor aluno da turma

---

## ⚙️ Regras de Negócio

- A média do aluno é calculada pela **média aritmética das 3 notas**
- Um aluno é considerado **aprovado se média ≥ 7.0**
- O **melhor aluno** é aquele com maior média
  - Em caso de empate, considerar o primeiro

---

## 🧩 Conceitos de POO Trabalhados

O professor avalia fortemente os seguintes princípios:

### 🔹 Organização
Cada classe deve ter uma responsabilidade bem definida.

### 🔹 Coesão
Cada classe faz apenas **uma coisa específica**.

### 🔹 Encapsulamento
- Atributos privados
- Acesso via getters/setters

### 🔹 Reuso
Classes devem ser reutilizáveis.

### 🔹 Flexibilidade
Código modular e bem dividido facilita manutenção.

### 🔹 Delegação
Cada classe deve resolver suas próprias responsabilidades.

---

## 💻 Exemplo de Funcionamento

Entrada:
- Dados da disciplina
- Quantidade de alunos
- Informações de cada aluno (matrícula, nome, notas)

Saída esperada:
- Lista de alunos aprovados
- Melhor aluno da turma

---

## 🎯 Objetivo do Professor com essa Dinâmica

Essa atividade é só sobre:

- Pensar em **modelagem de classes**
- Separar responsabilidades corretamente
- Aplicar boas práticas de POO
- Simular um problema real simples

---
