# Kata Couting duplicate

Escribir una función que devuelva el recuento de letras y dígitos numéricos distintos (sin distinguir entre mayúsculas y
minúsculas)
que aparecen más de una vez en la cadena de entrada. Se puede suponer que la cadena de entrada contiene solo letras
(mayúsculas y minúsculas) y dígitos numéricos.

Ejemplo:

```java
"abcde" -> 0 // Sin caracteres repetidos
"aabbcde" -> 2 // Se repiten 'a' y 'b'
"aabBcde" -> 2 // 'a' se repite dos veces y la 'b' también (b and B)
"indivisibility" -> 1 // 'i' se repite seis veces
"Indivisibilities" -> 2 // 'i' se repite siete veces y la 's' dos
"aA11" -> 2 // 'a' y '1'
"ABBA" -> 2 // 'A' y 'B' ambos se repiten dos veces
```
