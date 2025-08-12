# Expressões Comparativas em Java

| Operador | Significado           | Exemplo                |
|----------|----------------------|------------------------|
| `==`     | Igual                | `a == b`               |
| `!=`     | Diferente            | `a != b`               |
| `>`      | Maior                | `a > b`                |
| `<`      | Menor                | `a < b`                |
| `>=`     | Maior ou igual       | `a >= b`               |
| `<=`     | Menor ou igual       | `a <= b`               |

## Exemplo de uso

```java
int a = 5, b = 10;
System.out.println(a == b); // false
System.out.println(a < b);  // true
System.out.println(a != b); // true
```

# Expressões Lógicas em Java

As expressões lógicas são usadas para combinar ou inverter condições. Elas retornam valores booleanos (`true` ou `false`):

| Operador | Significado         | Exemplo                |
|----------|--------------------|------------------------|
| `&&`     | E lógico (AND)     | `a > 0 && b < 5`       |
| `||`     | OU lógico (OR)     | `a == 10 || b == 20`   |
| `!`      | NÃO lógico (NOT)   | `!(a == b)`            |

## Explicação

- `&&` (E): A expressão só é verdadeira se **ambas** as condições forem verdadeiras.
- `||` (OU): A expressão é verdadeira se **pelo menos uma** das condições for verdadeira.
- `!` (NÃO): Inverte o valor lógico da condição.

## Exemplos de uso

```java
int a = 5, b = 10;

// E lógico
System.out.println(a > 0 && b < 20); // true (ambas são verdadeiras)

// OU lógico
System.out.println(a == 5 || b == 5); // true (a == 5 é verdadeiro)

// NÃO lógico
System.out.println(!(a < b)); // false (a < b é verdadeiro, mas o NOT inverte o valor)
```