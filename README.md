# Hotel RMI – Sistema de Gerenciamento de Quartos

## 📌 Descrição do Projeto

Este projeto implementa um **sistema distribuído de gerenciamento de quartos de hotel** utilizando **Java RMI (Remote Method Invocation)**. A aplicação permite que um cliente se conecte remotamente a um servidor para **listar quartos disponíveis, reservar quartos e liberar reservas**, simulando um cenário real de comunicação cliente–servidor.

O objetivo principal do projeto é aplicar conceitos de **sistemas distribuídos**, como objetos remotos, invocação de métodos à distância, registro de serviços e comunicação via rede, de forma prática e didática.

---

## 🏗️ Arquitetura

O sistema é dividido em três partes principais:

* **Interface Remota (`GerenciadorQuartos`)**

  * Define os métodos que podem ser chamados remotamente pelo cliente.

* **Servidor (`ServidorHotel` / `GerenciadorQuartosImpl`)**

  * Implementa a lógica de negócio.
  * Mantém o estado dos quartos (disponíveis ou reservados).
  * Registra o serviço no RMI Registry.

* **Cliente (`ClienteHotel`)**

  * Conecta-se ao RMI Registry.
  * Consome os métodos remotos.
  * Permite interação via terminal.

---

## ⚙️ Funcionalidades

* 📋 Listar quartos disponíveis
* 🔐 Reservar um quarto
* 🔓 Liberar um quarto reservado
* 🌐 Comunicação remota utilizando Java RMI

---

## 🧰 Tecnologias Utilizadas

* Java
* Java RMI
* Programação Orientada a Objetos
* Sistemas Distribuídos

---

## ▶️ Como Executar o Projeto

### 1️⃣ Compilar os arquivos

No diretório do projeto:

```bash
javac *.java
```

### 2️⃣ Iniciar o servidor

```bash
java ServidorHotel
```

O servidor iniciará o **RMI Registry** na porta `1099` e disponibilizará o serviço `HotelService`.

### 3️⃣ Executar o cliente (em outro terminal)

```bash
java ClienteHotel
```

O cliente se conectará ao servidor e exibirá o menu de opções no terminal.

---

## 📚 Conceitos Aplicados

* Invocação Remota de Métodos (RMI)
* Comunicação cliente–servidor
* Objetos distribuídos
* Serialização de dados
* Separação de responsabilidades

---

## 🎓 Contexto Acadêmico

Projeto desenvolvido com fins **didáticos**, voltado ao aprendizado de **Java RMI e sistemas distribuídos**, comum em disciplinas de Engenharia da Computação e áreas afins.

---

## 👤 Autor

**Filipe Nogueira**
Curso: Engenharia da Computação

---

## 📄 Observações

Este projeto não tem foco em interface gráfica ou persistência em banco de dados, priorizando a compreensão da comunicação remota e da arquitetura distribuída.
