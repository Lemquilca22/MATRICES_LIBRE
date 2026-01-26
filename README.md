# WORDLE 🅰️
## DESCRIPCIÓN
Wordle es un popular juego de palabras online, donde los usuarios deben adivinar una palabra  de 4-6 letras en un máximo de 5 intentos.

## COMO JUGAR 

   ### MECANICA 
   El juego tiene una base de datos (array tipo String) con 100 nombres, al inicio del juego el programa elige una palabra aleatoria de su base de datos.
   
   Al iniciar el juego se generará la cantidad de letras que tiene esa palabra en un formato de "_ ",  Por ejemplo, si la palabra fuera piña, entonces en pantalla se verá "_ _ _ _ " y tambien la tabla con la cantidad de intentos que tenemos para lograr adivinar la palabra, 5 filas con la cantidad de columnas igual a la cantidad de letras de la palabra, usando el ejemplo de piña, entonces el tableros erñia de 5 filas x 4 columnas
   
   La razón por la cual no importa el orden en ese momento es porque al iniciar el Juego la maquina elige quien empieza el juego de manera aleatoria , siendo "o" la ficha con la que ha de jugar el J1. 

   ### MOVERSE EN EL TABLERO

   A diferencia del tres en raya clasico donde dibujamos nuestras fichas con papel y boli o un marcador, en esta versión debemos hacerlo por coordenadas ¿Qué quiere decir eso?
   
   Si tenemos un tablero de 3x3 entonces tendremos 9 espacios para colocar "o" u "x". ¿Entonces es tan facil como poner 1 y 3 si quiero poner mi ficha en la primera fila y 3 columna? 

   No, las coordenas de este tablero 3x3 van del (0-2) siendo 0 el primer valor y 2 el último, esto se aplica a Filas y columnas.

   EJEMPLO: Si quiero colocar el "o" en el centro del tablero debo ingresar 1, dejo un espacio, y nuevamente 1, algo así (1 1), el primer valor es la fila y el segundo la columna.

   ### GAME OVER Y RESUMEN

   Entonces el juego comienza; cada jugador ingresa la posición donde quiere poner su ficha (ojo, si la posición esta ocupada debes ingresar nuevamente el valor), a continuación según las condiciones para poder ganar:

  - Si la cantidad de Victorias necesarias es solo 1, entonces el primer jugador que forme 3 en raya gana, se acaba la partida.. (PUEDES VOLVER A JUGAR SI TIENES SED DE REVANCHA).
   
  - Si la cantidad de Victorias es superior a 1, entonces en cada ronda sumas victorias(+1) y se reiniciará el tablero para volver a jugar después de cada victoria, esto hasta que se cumpla la condición de partidas necesarias para ganar, cuando eso sucede GAME OVER!
   
  - Casi me olvido, ¿Y si ninguno consigue hacer 3 en raya? Pues... se reinicia el tablero y volvemos a Jugar hasta que alguien consiga 3 en raya, "en el empate no se suman puntos".

