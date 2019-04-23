

## EXCEPCIONES PERSONALIZADAS :cyclone:

<En la mayoría de los casos, es más simple desde el punto de vista de diseño de código usar clases de Exception genéricas existentes al lanzar excepciones. Esto es especialmente cierto si solo necesita la excepción para llevar un simple mensaje de error. En ese caso, generalmente se prefiere RuntimeException , ya que no es una excepción marcada. Existen otras clases de excepción para las clases comunes de errores:

+ UnsupportedOperationException : una determinada operación no es compatible
+ IllegalArgumentException : se pasó un valor de parámetro no válido a un método
+ IllegalStateException : su API ha alcanzado internamente una condición que nunca debería ocurrir, o que se produce como resultado de usar su API de forma no válida

### Casos en los que usted desee utilizar una clase de excepción personalizada incluyen los siguientes::statue_of_liberty:

Está escribiendo una API o biblioteca para que otros la utilicen, y quiere permitir que los usuarios de su API puedan capturar y manejar específicamente las excepciones de su API y poder diferenciar esas excepciones de otras excepciones más genéricas .
Está lanzando excepciones para un tipo específico de error en una parte de su programa, que desea detectar y manejar en otra parte de su programa, y ​​desea poder diferenciar estos errores de otros errores más genéricos.
Puede crear sus propias excepciones personalizadas extendiendo RuntimeException para una excepción no verificada, o excepción comprobada extendiendo cualquier Exception que no sea también subclase de RuntimeException , porque:

Las subclases de Excepción que no son también subclases de RuntimeException son excepciones comprobadas> 



[Fuente de la info](https://riptutorial.com/es/java/example/422/excepciones-personalizadas)

