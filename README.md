# Operadores en Java

Este documento proporciona una visión general de los diferentes tipos de operadores en Java, incluyendo su uso, precedencia y ejemplos.

## Índice

- [1. Introducción](#1.introducción)
- [2. Tipos de Operadores](#2-tipos-de-operadores)
  - [2.1. Operadores Aritméticos](#21-operadores-aritméticos)
  - [2.2. Operadores de Asignación](#22-operadores-de-asignación)
  - [2.3. Operadores Relacionales](#23-operadores-relacionales)
  - [2.4. Operadores Lógicos](#24-operadores-lógicos)
  - [2.5. Operadores Unarios](#25-operadores-unarios)
  - [2.6. Operador Ternario](#26-operador-ternario)
- [3. Precedencia de Operadores](#3-precedencia-de-operadores)
- [4. Instalacion de Ejemplos](#4-instalacion-de-ejemplos)

## 1. Introducción

Los operadores son símbolos que permiten realizar operaciones en variables y valores. En Java, existen varios tipos de operadores que se utilizan en diferentes contextos.

## 2. Tipos de Operadores

### 2.1. Operadores Aritméticos 

Se utilizan para realizar operaciones matemáticas básicas. 

- **Suma (`+`)**
- **Resta (`-`)**
- **Multiplicación (`*`)**
- **División (`/`)**
- **Módulo (`%`)**

Ejemplos en `OperadoresAritmeticos.java`

### 2.2. Operadores de Asignación
Se utilizan para asignar valores a las variables.
- **Asignación simple (`=`)**
- **Asignación con suma (`+=`)**
- **Asignación con resta (`-=`)**
- **Asignación con multiplicación (`*=`)**
- **Asignación con división (`/=`)**
- **Asignación con módulo (`%=`)**

Ejemplos en `OperadoresAsignacion.java`

### 2.3. Operadores Relacionales
Se utilizan para comparar dos valores y devuelven un valor booleano.
- **Mayor que (`>`)**
- **Menor que (`<`)**
- **Mayor o igual que (`>=`)**
- **Menor o igual que (`<=`)**
- **Igual a (`==`)**
- **Distinto de (`!=`)**

Ejemplos en `OperadoresRelacionales.java`

### 2.4. Operadores Lógicos
Se utilizan para combinar condiciones booleanas.
- **AND lógico (`&&`)**
- **OR lógico (`||`)**
- **NOT lógico (`!`)**

Ejemplos en `OperadoresLogicos.java`

### 2.5. Operadores Unarios
Operan sobre un solo operando.
- **Incremento (`++`)**
- **Decremento (`--`)**
- **Negación (`-`)**
- **Complemento bit a bit (`~`)**

Ejemplos en `OperadoresUnarios.java`

### 2.6. Operador Ternario
Un operador condicional que actúa como una forma abreviada de `if-else`.
- **Sintaxis**: `condición ? valorSiVerdadero : valorSiFalso`

Ejemplos en `OperadorTernario.java`


## 3. Precedencia de Operadores

La precedencia de operadores determina el orden en que se evalúan los operadores en una expresión. Los operadores con mayor precedencia se evalúan primero. La siguiente es una lista general de precedencia en Java:

1. Operadores Postfijos (`expr++`, `expr--`)
2. Operadores Unarios (`++expr`, `--expr`, `+`, `-`, `!`, `~`)
3. Casting (`(tipo)`)
4. Operadores Aritméticos (`*`, `/`, `%`)
5. Operadores Aritméticos (`+`, `-`)
6. Desplazamientos (`<<`, `>>`, `>>>`)
7. Operadores Relacionales (`<`, `>`, `<=`, `>=`, `instanceof`)
8. Operadores de Igualdad (`==`, `!=`)
9. Operadores Bit a Bit (`&`)
10. Operadores Bit a Bit (`^`)
11. Operadores Bit a Bit (`|`)
12. Operadores Lógicos (`&&`)
13. Operadores Lógicos (`||`)
14. Operador Ternario (`? :`)
15. Operadores de Asignación (`=`, `+=`, `-=`, `*=`, `/=`, `%=`)

Ejemplo en `PrecedenciaOperadores.java`


## 4. Instalacion de Ejemplos

Clona el repositorio o descarga el código fuente. 
   ```bash
    git@github.com:marinagpdev/Java-Operadores.git
```

Si deseas contribuir, por favor abre un issue o envía un pull request en el repositorio.
