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

# Resumo da aula

## System.out.print
Imprime um texto na tela **sem** pular linha ao final.
```java
System.out.print("Olá, ");
System.out.print("mundo!");
// Saída: Olá, mundo!
```

## System.out.println
Imprime um texto na tela **pulando linha** ao final.
```java
System.out.println("Olá,");
System.out.println("mundo!");
// Saída:
// Olá,
// mundo!
```

## System.out.printf

Permite imprimir valores formatados.
- `%d` para inteiros
- `%f` para números de ponto flutuante
- `%s` para strings
- `%c` para caracteres (`char`)
- `%n` para quebra de linha

```java
int idade = 25;
double salario = 1234.56;
String nome = "Ana";
char letra = 'A';

System.out.printf("Nome: %s, Idade: %d, Salário: %.2f, Letra: %c%n", nome, idade, salario, letra);
// Saída: Nome: Ana, Idade: 25,
```

## Locale
Usado para definir o padrão de formatação (ex: ponto ou vírgula em números decimais).
```java
import java.util.Locale;
Locale.setDefault(Locale.US);
System.out.printf("%.2f%n", 1234.56); // Saída: 1234.56
```

## Como concatenar vários elementos em um mesmo comando de escrita
Você pode usar o operador `+` para juntar textos e variáveis.
```java
String nome = "Carlos";
int idade = 30;
System.out.println("Nome: " + nome + ", Idade: " + idade);
// Saída: Nome: Carlos, Idade: 30
```

## Exemplos
```java
System.out.print("A");
System.out.println("B");
System.out.printf("Valor: %.1f%n", 10.5);
```
Saída:
```
AB
Valor: 10.5
```
# Comandos de Atribuição e Casting em Java

## Atribuição

Atribuição é o ato de armazenar um valor em uma variável usando o operador `=`.

**Exemplo:**
```java
int idade = 20;
double altura = 1.75;
char letra = 'A';
boolean ativo = true;
```

Você também pode atualizar o valor de uma variável:
```java
idade = 25;
altura = altura + 0.05;
```

## Casting (Conversão de Tipos)

Casting é a conversão explícita de um tipo de dado para outro.  
No Java, pode ser **implícito** (automático) ou **explícito** (quando há risco de perda de informação).

### Casting Implícito (Widening)
Ocorre quando convertemos de um tipo menor para um maior (ex: `int` para `double`).

```java
int x = 10;
double y = x; // Conversão implícita: int para double
```

### Casting Explícito (Narrowing)
Necessário quando convertemos de um tipo maior para um menor (ex: `double` para `int`).

```java
double a = 5.7;
int b = (int) a; // b recebe 5 (parte decimal é descartada)
```

### Exemplo com char e int
```java
char letra = 'A';
int codigo = (int) letra; // código recebe 65 (valor Unicode de 'A')
```

### Exemplo com operações
```java
int a = 5;
int b = 2;
double resultado = (double) a / b; // resultado será 2.5
```

---

**Resumo:**  
- Use o operador `=` para atribuição.
- Use `(tipo)` para casting explícito.
- Casting implícito ocorre automaticamente quando não há risco de perda de dados.

# Scanner em Java

## Scanner

O `Scanner` é uma classe usada para ler dados do teclado em Java.  
Para usar, é necessário importar:
```java
import java.util.Scanner;
```

### Criando um Scanner
```java
Scanner sc = new Scanner(System.in);
```

---

### Métodos principais

- **next()**  
  Lê a próxima palavra (até espaço ou quebra de linha).
  ```java
  String palavra = sc.next();
  ```

- **nextInt()**  
  Lê um número inteiro.
  ```java
  int numero = sc.nextInt();
  ```

- **nextDouble()**  
  Lê um número com ponto flutuante.
  ```java
  double valor = sc.nextDouble();
  ```

- **next().charAt(0)**  
  Lê o próximo token e pega o primeiro caractere.
  ```java
  char letra = sc.next().charAt(0);
  ```

---

### Como ler até a quebra de linha

- **nextLine()**  
  Lê toda a linha até a quebra de linha (Enter).
  ```java
  String linha = sc.nextLine();
  ```

---

### Como limpar o buffer de leitura

Após ler um número com `nextInt()` ou `nextDouble()`, pode ser necessário limpar o buffer antes de usar `nextLine()`:
```java
sc.nextLine(); // Limpa o buffer
```

**Exemplo:**
```java
int idade = sc.nextInt();
sc.nextLine(); // Limpa o buffer antes de ler uma linha completa
String nome = sc.nextLine();
```

---
**Dica:**  
Sempre feche o Scanner ao final do uso para liberar recursos:
```java
sc.close();
```

# Funções Matemáticas em Java

A classe `Math` do Java oferece várias funções matemáticas úteis. Aqui estão algumas das principais:

- **Math.sqrt(x)**  
  Calcula a raiz quadrada de `x`.
  ```java
  double raiz = Math.sqrt(16); // 4.0
  ```

- **Math.pow(a, b)**  
  Calcula `a` elevado à potência `b`.
  ```java
  double potencia = Math.pow(2, 3); // 8.0
  ```

- **Math.abs(x)**  
  Retorna o valor absoluto de `x`.
  ```java
  int absoluto = Math.abs(-10); // 10
  double absoluto2 = Math.abs(-5.7); // 5.7
  ```

---

## Exemplos completos

```java
double x = -9.0;
double raiz = Math.sqrt(Math.abs(x)); // 3.0

double base = 5.0;
double expoente = 2.0;
double resultado = Math.pow(base, expoente); // 25.0

int valor = -20;
int valorAbsoluto = Math.abs(valor); // 20

System.out.println("Raiz: " + raiz);
System.out.println("Potência: " + resultado);
System.out.println("Valor absoluto: " + valorAbsoluto);
```

## Exemplo: Expressão de Segundo Grau (Bhaskara)

Para resolver uma equação do segundo grau do tipo `ax² + bx + c = 0`, usamos a fórmula de Bhaskara:

- **Delta:**  
  \(\Delta = b^2 - 4ac\)

- **Raízes:**  
  \(x_1 = \frac{-b + \sqrt{\Delta}}{2a}\)  
  \(x_2 = \frac{-b - \sqrt{\Delta}}{2a}\)

**Exemplo em Java:**
```java
double a = 1.0;
double b = -3.0;
double c = 2.0;

double delta = Math.pow(b, 2) - 4 * a * c;

if (delta >= 0) {
    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
    System.out.println("x1 = " + x1);
    System.out.println("x2 = " + x2);
} else {
    System.out.println("Não existem raízes reais.");
}
// Saída: x1 = 2.0, x2 = 1.0
```