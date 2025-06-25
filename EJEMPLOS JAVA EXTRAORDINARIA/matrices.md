En Java, **las matrices (arrays)** son estructuras de datos que permiten almacenar múltiples valores del mismo tipo en una sola variable. A continuación te explico cómo funcionan, con ejemplos y detalles clave:

---

### ✅ 1. **Declaración de una matriz**

```java
int[] numeros;       // Matriz de enteros
String[] nombres;    // Matriz de Strings
```

---

### ✅ 2. **Inicialización de una matriz**

#### a) Especificando el tamaño:

```java
int[] numeros = new int[5]; // Crea una matriz con 5 elementos (del 0 al 4)
```

#### b) Inicialización directa con valores:

```java
int[] numeros = {10, 20, 30, 40, 50};
```

---

### ✅ 3. **Acceder y modificar elementos**

Los índices comienzan en 0.

```java
System.out.println(numeros[2]); // Imprime el tercer elemento (30)
numeros[1] = 25;                // Modifica el segundo elemento a 25
```

---

### ✅ 4. **Recorrer una matriz**

#### a) Con un bucle `for`:

```java
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

#### b) Con un bucle `for-each`:

```java
for (int num : numeros) {
    System.out.println(num);
}
```

---

### ✅ 5. **Matriz multidimensional**

También puedes trabajar con **matrices bidimensionales** (como una tabla).

```java
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6}
};

// Acceder a un valor
System.out.println(matriz[1][2]); // Imprime 6

// Modificar
matriz[0][1] = 9;

// Recorrer
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}
```

---

### ✅ Notas importantes

* El tamaño de una matriz en Java es **fijo** una vez creado.
* Puedes usar clases como `ArrayList` si necesitas una estructura más flexible.
* Las matrices pueden contener **tipos primitivos** (`int`, `double`, etc.) o **objetos** (`String`, `Persona`, etc.).


### 📝 **Enunciado del problema:**

> Crea un programa en Java que almacene las calificaciones de 3 estudiantes en 4 materias utilizando una **matriz bidimensional**. Luego, el programa debe:
>
> 1. Mostrar todas las calificaciones en forma de tabla.
> 2. Calcular y mostrar el promedio de cada estudiante.

---

### ✅ **Código en Java:**

```java
public class Calificaciones {
    public static void main(String[] args) {
        // 3 estudiantes, 4 materias
        int[][] calificaciones = {
            {85, 90, 78, 92}, // Estudiante 1
            {76, 88, 80, 85}, // Estudiante 2
            {90, 91, 89, 87}  // Estudiante 3
        };

        // Mostrar la tabla de calificaciones
        System.out.println("Calificaciones de los estudiantes:");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print(calificaciones[i][j] + " ");
            }
            System.out.println();
        }

        // Calcular y mostrar el promedio de cada estudiante
        System.out.println("\nPromedios:");
        for (int i = 0; i < calificaciones.length; i++) {
            int suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
            }
            double promedio = (double) suma / calificaciones[i].length;
            System.out.printf("Estudiante %d: %.2f\n", (i + 1), promedio);
        }
    }
}
```

---

### 🧠 **Explicación:**

* Se usa una **matriz de enteros** `int[][]` donde cada fila representa a un estudiante y cada columna una materia.
* Se recorre la matriz para:

  * Mostrar los valores.
  * Sumar las notas por estudiante y calcular su promedio.

---

¿Te gustaría extender este ejemplo con entrada de datos desde el teclado usando `Scanner`?
