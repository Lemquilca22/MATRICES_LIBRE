# WORDLE 🅰️
## DESCRIPCIÓN
Wordle es un popular juego de palabras online, donde los usuarios deben adivinar una palabra  de 4-6 letras en un máximo de 5 intentos.

## COMO JUGAR 

   ### MECANICA 
   El juego tiene una base de datos (array tipo String) con 100 nombres, al inicio del juego el programa elige una palabra aleatoria de su base de datos y nosotros debemos intentar adivinarla.
   
   Al iniciar el juego se generará la cantidad de letras que tiene esa palabra en un formato de "_ ",  Por ejemplo, si la palabra fuera piña, entonces en pantalla se verá "_ _ _ _ " y tambien la tabla con la cantidad de intentos que tenemos para lograr adivinar la palabra, 5 filas con la cantidad de columnas igual a la cantidad de letras de la palabra, usando el ejemplo de piña, entonces el tableros sería de 5 filas x 4 columnas.

   ### CONDICION DE WIN O GAME OVER
   Ahora que conoces la cantidad de letras que tiene la palabra comenzamos a jugar.

   El objetivo es tratar de adivinar la palabra en cada intento, si la palabra no es correcta entonces dicha palabra ocupara el espacio de la primera fila, y pasaremos al siguiente intento.

   ¿Cómo saber si estamos acercandonos a la palabra?

   Si en nuestro intento de palabra alguna de las letras coincide en la misma posición que la palabra secreta entonces esta se marcará de color verde y quedará como pista(ayuda) para nuestra siguiente jugada, por otro lado si en nuestra palabra se encuentra una de las letras que aparece en la palabra secreta, pero en una posición diferente a la original, está se marcará de color amarillo, teniendo otra pista de la palabra secreta, si por el contrario las letras de nuestra palabra no coinciden de ninguna manera, permanecerán de color gris.
   

