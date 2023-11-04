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

Se basa en pretende acceder a un fichero de texto llamado "lorem_ipsum.txt", para realizaar una serie de cálculos.

## Sintaxis:

1. Creación de paquetes:
    1. Paquete raíz llamado **net/salesianos**, incluye:

2. Creación de clases:
    1. En el paquete **entidades** se han creado las siguientes clases:
        1. **Personaje**, implementada la interfaz Combate
        2. **Mob** "Abstracta"
        3. **MobHostil** "Abstracta",extiende de Mob, implementada la inferfaz Combate
        4. **MobPacifico** "Abstracta",extiende de Mob, implementada la interfaz Daño
        5. **Zombie** extiende de MobHostil
        6. **Enderman** extiende de MobHostil
        7. **Oveja** extiendde de MobPacifico

    2. En el paquete **interfaces**, se han implementado:
        1. La interfaz **Daño**
        2. La interfaz **Combate** que extiende de Daño

3. En la clase ejecutable **App**:
    1. Preguntar al usuario que arma quiere utilizar
    2. Preguntar al usuario que armadura quiere utilizar
    3. Instanciar el personaje
    4. Instaciar el enemigo
    5. Comenzar el combate
        1. El personaje solo atacará al enemigo
        2. El enemigo, podrá aleatoriamente atacar o moverse
        3. Finalizará cuando el personaje o el enemigo se queden sin salud
        4. Y se mostrará quién ha salido victorioso