En Java, **los métodos** son bloques de código que realizan una tarea específica y pueden ser reutilizados múltiples veces. Son fundamentales para estructurar programas de forma clara, modular y eficiente.

---

### 🧠 ¿Qué son los métodos en Java?

Un **método** es una función que pertenece a una clase. Define un conjunto de instrucciones que se ejecutan cuando el método es llamado.

---

### 🧩 Estructura de un método en Java

```java
modificador tipoRetorno nombreMetodo(parámetros) {
    // Cuerpo del método
    instrucciones;
    return valor; // si el tipo de retorno no es void
}
```

🔹 **modificador:** define el nivel de acceso (`public`, `private`, `protected`, etc.)

🔹 **tipoRetorno:** indica el tipo de dato que el método devuelve (`int`, `String`, `void`, etc.)

🔹 **nombreMetodo:** debe ser único dentro de su clase (siguiendo convenciones como empezar en minúscula)

🔹 **parámetros:** (opcionales) valores que se pasan al método

🔹 **return:** devuelve un valor si el método no es `void`

---

### ✅ Ejemplo de un método

```java
public int sumar(int a, int b) {
    int resultado = a + b;
    return resultado;
}
```

🔹 Este método se llama `sumar`, recibe dos enteros y devuelve la suma de ambos.

---

### 🚀 ¿Cómo se usa un método?

Para usar (invocar) un método, simplemente se llama por su nombre:

```java
int resultado = sumar(5, 3); // resultado será 8
```

> Si el método no es `static`, debe llamarse a través de una instancia del objeto.

---

### 🧱 Tipos de métodos

1. **Métodos estáticos (`static`)**
   Se llaman sin necesidad de crear una instancia de la clase.

   ```java
   public static void saludar() {
       System.out.println("¡Hola!");
   }

   saludar(); // se puede llamar directamente
   ```

2. **Métodos de instancia (no static)**
   Requieren una instancia del objeto para ser usados.

   ```java
   public class Persona {
       public void decirNombre() {
           System.out.println("Me llamo Ana");
       }
   }

   Persona p = new Persona();
   p.decirNombre();
   ```

---

### 🔄 ¿Para qué sirven?

* Reutilizar código
* Dividir tareas complejas en pequeñas funciones
* Mejorar legibilidad y mantenimiento
* Evitar redundancias

Perfecto. Aquí tienes un **enunciado** seguido del **ejemplo en Java con métodos**.

---

### 📝 **Enunciado:**

Crear un programa en Java que simule una calculadora simple. La calculadora debe tener una clase `Calculadora` con métodos para realizar las siguientes operaciones:

* Sumar dos números
* Restar dos números
* Multiplicar dos números
* Dividir dos números

Luego, desde el método `main`, se debe crear una instancia de la clase `Calculadora`, llamar a sus métodos con valores de prueba y mostrar los resultados en pantalla.

---


### 💻 **Código Java con entrada por pantalla:**

```java
import java.util.Scanner;

public class Calculadora {

    // Método para sumar
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método para restar
    public int restar(int a, int b) {
        return a - b;
    }

    // Método para multiplicar
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para dividir
    public double dividir(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: división por cero.");
            return 0;
        }
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        // Pedir los números al usuario
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        // Realizar operaciones
        int suma = calc.sumar(num1, num2);
        int resta = calc.restar(num1, num2);
        int multiplicacion = calc.multiplicar(num1, num2);
        double division = calc.dividir(num1, num2);

        // Mostrar resultados
        System.out.println("Resultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        // Cerrar el Scanner
        scanner.close();
    }
}
```

---

### ✅ ¿Qué necesitas para ejecutarlo?

* Guardar el código en un archivo llamado `Calculadora.java`
* Compilar: `javac Calculadora.java`
* Ejecutar: `java Calculadora`
* Luego ingresar los dos números cuando el programa lo pida

---
