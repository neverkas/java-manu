<center>
# Juego de Embarcaciones
</center>
<p align="center">
    <img src= "../../images/mi-barco-no-se-va-a-undir.png" height=300>
</p>

# Enunciado del Proyecto

## 1. Tipos de embarcaciones
- Carabelas (cualquier carga)
- Bote (1 tipo de carga)      
- Botecito
- Balsa

## 2. Carga
- Oro (cantidad)
- Granos (peso)
- Espadas (cantidad)
- Azúcar (peso)

## 3. Puerto
- Listado de embarcaciones
- Listado de carga
- Horario de apertura
- Embarcaciones llegan y salen
- Horario de cierre

- - -
  
# Aprendiendo de los errores
Observaciones de errores que se cometieron durante el desarrollo del 
proyecto

### 1. El orden de los parámetros de casos de prueba con assertEqual
> El primer parámetro es el el valor esperado, y el segundo es el dato que se tiene 
y se quiere evaluar y comparar con el esperado.

```Java
// manera correcta de utilizar assertEquals()
assertEquals(3, Embarcacion.listarEmbarcaciones().size());
```

### 2. El nombre de las pruebas unitarias
> Deben tener como postfijo Test `cargarEmbarcacionTest()`
```Java
@Test
void cargarUnaEmbarcacionTest(){
// codigo por aquí..
}
```

### 3. Agrupar clases e interfaces, no separar en directorios
 > Al tratar de organizar en tantas carpetas se puede perder la relación entre interfaz 
 y las clases que la implementan

### 4. Crear Listas Enlazadas
> Se puede crear a partir tanto de una interfaz, como de una clase.

### 5. Diferencias entre branches y tags de git
> Los **branches** no sólo se crean para separar un entorno de trabajo (testing, desarrollo, 
producción) del proyecto, sino también para el seguimiento individual de funcionalidade que 
tienen errores. 

```bash
; creo un branch de la versón estable v1.0
; su seguimiento v1.0.1, v1.0.2, .. se haría con tags
git branch embarcacion-v1.0
```

> Mientras que los **tags** permiten tener un control de distintas versiones, pudiendo 
hacer un *checkout* del proyecto de una versión específica en vez de hacerlo con el 
*hash* de un commit que no resulta muy cómodo.

```console
git tag -a v1.0.0-embarcacion -m "Juego de Embarques v1.0.0"
```