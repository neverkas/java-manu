<center>
# Juego de Embarcaciones
</center>
<p align="center">
    <img src= "../../images/mi-barco-no-se-va-a-undir.png" height=300>
</p>

## Tipos de embarcaciones
- Carabelas (cualquier carga)
- Bote (1 tipo de carga)      
- Botecito
- Balsa
  
**Observación: Las embarcaciones deben tener nombre**

## Carga
- Oro (cantidad)
- Granos (peso)
- Espadas (cantidad)
- Azúcar (peso)

## Puerto
- Listado de embarcaciones
- Listado de carga
- Horario de apertura
- Embarcaciones llegan y salen
- Horario de cierre

# Aprendiendo de los errores
Observaciones de errores que se cometieron durante el desarrollo del 
proyecto

### 1. El orden de los argumentos de casos de prueba
> El primer argumento es el el valor esperado, el segundo es el dato a evaluar

### 2. El nombre de las pruebas unitarias
> Deben tener como postfijo Test `cargarEmbarcacionTest()`

### 3. Agrupar clases e interfaces, no separar en directorios
 > Al tratar de organizar en tantas carpetas se puede perder la relación entre interfaz 
 y las clases que la implementan
