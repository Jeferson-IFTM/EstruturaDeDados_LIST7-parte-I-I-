# Implementação de Lista Sequencial (TAD) em Java

Este projeto consiste na implementação prática de um **Tipo Abstrato de Dados (TAD)** de Lista Sequencial. A estrutura utiliza arrays estáticos e foca na lógica de gerenciamento de memória e deslocamento de elementos (*shifting*).

## 🚀 Funcionalidades Implementadas

A classe `MyArrayList` suporta as seguintes operações:

* **Inserção:** `addFirst`, `addLast`, `insertAt` e `addSorted` (mantendo a ordem crescente).
* **Remoção:** `removeFirst`, `removeLast`, `removeAt` e `remove` (por valor).
* **Busca e Atualização:** `find` (retorna o índice), `get` e `set`.
* **Estado da Lista:** `isEmpty`, `isFull`, `count` e `display`.

---

## 🛠️ Estrutura do Projeto

O código foi dividido em três partes para seguir as melhores práticas de POO:

1.  **`MyArrayListTAD.java`**: Interface que define o contrato do TAD.
2.  **`MyArrayList.java`**: Classe que implementa a lógica de negócio e manipulação do array.
3.  **`Main.java`**: Classe de teste utilizada para gerar os logs de execução.

---

## 📈 Análise de Complexidade (Big O)

| Operação | Complexidade | Motivo |
| :--- | :--- | :--- |
| **addLast / removeLast** | $O(1)$ | Acesso direto ao último índice via contador `size`. |
| **addFirst / removeFirst** | $O(n)$ | Exige o deslocamento de todos os elementos existentes. |
| **insertAt / removeAt** | $O(n)$ | No pior caso, desloca $n$ elementos para abrir/fechar espaço. |
| **find** | $O(n)$ | Percorre a lista sequencialmente até encontrar o valor. |
| **get / set** | $O(1)$ | Acesso direto ao índice do array. |

