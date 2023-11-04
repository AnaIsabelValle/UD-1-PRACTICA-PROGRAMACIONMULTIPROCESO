# UD-1-PRACTICA-PROGRAMACIONMULTIPROCESO

- Autor:
    - Nombre:
        - Ana Isabel González Rosales
    - Fecha:
        - Octubre 2.023
    - git:
        - https://github.com/AnaIsabelValle/UD-1-PRACTICA-PROGRAMACIONMULTIPROCESO

## Introducción:

![C:\Users\ANA\IdeaProjects\UD-1-Practica-ProgramacionMultiproceso\src\images\procesojava-esp.jpg](C:\Users\ANA\IdeaProjects\UD-1-Practica-ProgramacionMultiproceso\src\images\procesojava-esp.jpg)
## Análisis:

Se pretende acceder a un fichero de texto llamado "lorem_ipsum.txt", para realizaar una serie de cálculos.

## Sintaxis:

1. Creación de paquetes:
    1. Paquete raíz llamado **net/salesianos**, incluye:

2. Creacción de clases:
    1. **Contador**:
       * Su función es leer el texto y transformar las vocales que encuentre a mayúsculas y sumarlas.
    2. **Lanzador de Procesos**:
        * Creamos un método estático que no duelve nada, para iniciar el contador de vocales, pasándole como parámetros: el texo, vocal y nombre del archivo.
        * Creamos un proceso con ProcessBuilder, indicando, java, la ruta (path) de la Clase Contador.java y los argumentos: texto y vocal.
        * Creamos una variable de tipo String que guarde la ruta (path) en los ficheros donde se guardarán las vocales.
        * Comienza el proceso con ProcessBuilder.start().
3. En la clase ejecutable **Main**:
    * Se crea una variable de tipo String que la llamamos rutaLorem en la cuál indicamos la ruta(path) del fichero de texto "lorem_ipsum".
    * Lanzamos los procesos para que se guarden en la carpeta creada con el nombre "salidas" cada vocal en su archivo correspondiente llamado: salidaVocalA,E,I,O y U.
    * Creamos una variable de cada ruta de los ficheros de las vocales donde lea y guarde el número de cada vocal.
    * Y los muestre con el sout.
    * Se crea una variable de tipo String que guarde la ruta del texto y lo muestre.
    * Cerramos el fichero.
   