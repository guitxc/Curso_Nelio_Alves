# Operadores e Precedência no Java

## Operadores Aritméticos
- **Soma:** `+`
- **Subtração:** `-`
- **Multiplicação:** `*`
- **Divisão:** `/`
- **Resto:** `%`

**Exemplo:**
```java
int a = 10 + 2; // 12
int b = 10 - 2; // 8
int c = 10 * 2; // 20
int d = 10 / 2; // 5
int e = 10 % 3; // 1
```

## Precedência de Operadores

A ordem de avaliação dos operadores em Java é:

1. **Parênteses:** `()`
2. **Unários:** `++`, `--`, `+`, `-`, `!`
3. **Multiplicação, Divisão, Resto:** `*`, `/`, `%`
4. **Soma, Subtração:** `+`, `-`
5. **Relacionais:** `<`, `>`, `<=`, `>=`
6. **Igualdade:** `==`, `!=`
7. **Lógicos AND:** `&&`
8. **Lógicos OR:** `||`
9. **Atribuição:** `=`, `+=`, `-=`, etc.

**Exemplo de Precedência:**
```java
int resultado = 2 + 3 * 4; // resultado = 14 (multiplicação antes da soma)
int resultado2 = (2 + 3) * 4; // resultado2 = 20 (parênteses primeiro)
boolean teste = 2 + 2 == 4 && 3 > 1; // true (aritmético > relacional > lógico)
```

# Declaração de Variáveis e Tipos Primitivos em Java

## Declaração de Variáveis
A declaração segue o padrão:
```java
<tipo> <nome> = <valor>;
```
Exemplo:
```java
int idade = 20;
double altura = 1.70;
char genero = 'M';
boolean ativo = true;
String nome = "Maria";
```

---

## Tipos Primitivos

- **Números inteiros:**  
  `byte`, `short`, `int`, `long`
  ```java
  int numero = 100;
  long populacao = 8000000L;
  ```

- **Números com ponto flutuante:**  
  `float`, `double`
  ```java
  float preco = 10.5f;
  double salario = 2500.75;
  ```

- **Valor verdade:**  
  `boolean`
  ```java
  boolean aprovado = true;
  ```

- **Caractere Unicode:**  
  `char`
  ```java
  char letra = 'A';
  ```

---

## Tipo String

- **String:**  
  Usado para textos e palavras.
  ```java
  String mensagem = "Olá, mundo!";
  ```

---

## Nomes de Variáveis

- Devem seguir o padrão **camelCase**: primeira palavra minúscula, próximas iniciam com maiúscula.
  ```java
  int idadeAluno;
  double valorTotal;
  String nomeCompleto;
  ```

- Não podem começar com número e não podem conter espaços.

---
## Tipos Primitivos em Java

| Descrição                  | Tipo    | Tamanho  | Valores                              | Valor padrão |
|----------------------------|---------|----------|--------------------------------------|--------------|
| tipos numéricos inteiros   | byte    | 8 bits   | -128 a 127                           | 0            |
|                            | short   | 16 bits  | -32768 a 32767                       | 0            |
|                            | int     | 32 bits  | -2147483648 a 2147483647             | 0            |
|                            | long    | 64 bits  | -9223372036854770000 a 9223372036854770000 | 0L           |
| tipos numéricos com ponto flutuante | float   | 32 bits  | -1,4024E-37 a 3,4028E+38             | 0.0f         |
|                            | double  | 64 bits  | -4,94E-307 a 1,79E+308               | 0.0          |
| um caractere Unicode       | char    | 16 bits  | '\u0000' a '\uFFFF'                  | '\u0000'     |
| valor verdade              | boolean | 1 bit    | (false, true)                        | false        |

> **String** – cadeia de caracteres (palavras ou textos)

**Exemplo de uso:**
```java
byte b = 10;
short s = 200;
int i = 1000;
long l = 10000L;
float f = 3.14f;
double d = 2.71828;
char c = 'A';
boolean ativo = true;
String nome = "Maria";
```

> Veja mais em: [unicode-table.com](https://unicode-table.com)  
> Exemplo: `char a = '\u0061'; // a com código Unicode`