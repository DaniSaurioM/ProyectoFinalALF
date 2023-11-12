# Título: Implementación de una Máquina de Turing en Java
Autor: Gustavo Monzon
Fecha: 10/11/2023

## Introducción:
La máquina de Turing es un modelo teórico que representa un dispositivo computacional con capacidad ilimitada. 
En este proyecto, implementaremos una versión sencilla de una máquina de Turing en el lenguaje de programación Java. 
El propósito de esta implementación es entender los conceptos fundamentales de las máquinas de Turing y cómo se pueden utilizar para realizar cómputos.


## Objetivos:
Comprender los principios básicos de una máquina de Turing.
Implementar una versión sencilla de una máquina de Turing en Java.
Demostrar el funcionamiento de la máquina de Turing con ejemplos específicos.

## Conclusiones:
La implementación de esta máquina de Turing simple en Java demuestra la capacidad de este modelo teórico para realizar cálculos. 
A través de este proyecto, se han explorado los conceptos fundamentales de las máquinas de Turing, proporcionando una base para comprender dispositivos computacionales más complejos.



# DOCUMENTACION

## Primero pasos y entorno de sistema

 Primero que todo debemos tener los archivos .txt en la misma ruta en la que esta el programa escrito en java.
   Estos archivos .txt contienen la descripcion de la maquina de turing. 

   Nota: En este repositoria se le proporcionan dos archivos .txt para que pueda testear la maquina :)
   
   ![image](https://github.com/DaniSaurioM/ProyectoFinalALF/assets/109646287/6385a6cb-5e1a-4f1f-858f-916f19d342b1)

   ### Interpretacion de los elementos del archivo.
   * {0,1}: El lenguaje, el conjunto de simbolos de la MT.
   * q: Estados de la máquina de Turing.
   * s: Estado de aceptacion de la máquina de Turing.
   * q0p0Dk, q1p1Dk, qbsbDk, p0q0Dk, p1q1Dk: Reglas de transicion de la MT. Cada regla está en el formato EstadoActual SimboloActual -> EstadoNuevo SímboloNuevo Direccion.

## Utilizacion de la maquina.
  Primero la maquina nos preguntara cual de las dos maquina de turing queremos utilizar y escribimos segun las opciones <br>
  ![image](https://github.com/DaniSaurioM/ProyectoFinalALF/assets/109646287/2a70937a-b1e5-4dfd-a141-893c552e5123)

  nos da una pequeña explicacion de la maquina y luego nos solicita ingresar una cadena<br>
  Si la cadena es erronea nos indica que la MT no acepta la cadena y nos pregunta si queremos seguir ingresando cadenas<br>

  ![image](https://github.com/DaniSaurioM/ProyectoFinalALF/assets/109646287/595cf6de-22a4-4ee4-b313-15c4088b9213)

  Si caso contrario la cadena es aceptada por la MT. Nos indica que la cadena fue aceptada y nos pregunta si queremos seguir ingresando cadenas<br>
  ![image](https://github.com/DaniSaurioM/ProyectoFinalALF/assets/109646287/6530cd3f-f9c5-4b44-b529-05715ea93db2)

  Si decidimos no seguir ingresando cadenas, nos pregunta si queremos seleccionar otra maquina. <br>

  en caso contrario, salimos del programa 


  Aqui hay un video de youtube, de explicacion sobre como se debe utilizar la maquina la maquina.
  * https://youtu.be/kOHUH6dCiyo

