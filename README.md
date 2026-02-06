# WORDLE 🥴
## DESCRIPCIÓN
Wordle es un popular juego de palabras online, donde los usuarios deben adivinar una palabra  de 4-6 letras en un máximo de 5 intentos.

## COMO JUGAR 

   ### MECANICA 
   El juego busca dentro de la base de datos de https://random-word-api.herokuapp.com/word?length=5&lang=es , y recibe la palabra aleatoria de 5 letras en Español, que utilizaremos para jugar.
   
   Al iniciar el juego generará la cantidad de letras que tiene esa palabra en un formato de "_ ",  Por ejemplo, si la palabra fuera piñas, entonces en pantalla se verá "_ _ _ _ _" y tambien la acompañará una tabla con la cantidad de intentos que tenemos para lograr adivinar la palabra, 5 filas con la cantidad de columnas igual a la cantidad de letras de la palabra, usando el ejemplo de piñas, entonces el tableros sería de 5 filas x 5 columnas. 
   
   Para llevar un historial de nuestras jugadas cada vez que terminemos un turno, se imprimirá el historial de palabras que hemos usado, esto se explicará en la condición de WIN O GAME OVER.

   ### CONDICION DE WIN O GAME OVER
   Ahora que conoces la cantidad de letras que tiene la palabra comenzamos a jugar.

   El objetivo es tratar de adivinar la palabra en cada intento, si la palabra no es correcta entonces dicha palabra ocupara el espacio de la primera fila(del tablero), y pasaremos al siguiente intento.

   ¿Cómo saber si estamos acercandonos a la palabra?

   Si en nuestro intento de palabra alguna de las letras coincide en la misma posición que la palabra secreta entonces esta se marcará de color verde y quedará como pista(ayuda) para nuestra siguiente jugada, por otro lado si en nuestra palabra se encuentra una de las letras que aparece en la palabra secreta, pero en una posición diferente a la original, está se marcará de color amarillo, teniendo otra pista de la palabra secreta, si por el contrario las letras de nuestra palabra no coinciden de ninguna manera, permanecerán de color gris.

   ¿GANAR O PERDER?

   Si logramos adivinar la palabra antes o en el intento 5 (es decir cuando se llena el tablero)), habremos ganado, se terminará el juego y el programa nos preguntará si queremos iniciar nuevamente, la palabra con la que juguemos la siguiente partida será otra completamente diferente.

   Si por el contrario, llegamos al intento 5 y no adivinamos la palabra, perderemos pero tendremos la oportunidad de volver a jugar. (Es importante divertirse, pero para los que tienen sed de revancha, esto es viene de maravilla) dale a volver a JUGAR.
   

