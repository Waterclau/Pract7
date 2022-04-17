# Pract7

## Objetivos de la practica:

Desarrollo de una App de Spring Boot que incluya una funcionalidad que permita persistir información utilizando la librería Spring Data JDBC con una base de datos H2.

El módulo de persistencia debe incluir las operaciones (INSERT, UPDATE,  SELECT y DELETE)

Las operaciones debe de incluir como mínimo dos operaciones “JOINS”  utilizando la anotación @Query.

En este caso se orienta la práctica a operaciones de un banco,con un cliente, cuenta y transacciones

## Fases:

### Creacion de tablas
 
Se crean tres tablas :
  1) Cliente (clienteId, cuentaId, edad, pais, nombre)
  2) Cuenta (clienteId, cuentaId, deposito, deudas)
  3) Movimientos ( clienteId, cuentaId, cuentaDestino, cantidad, causa)
Las tablas se encuentran en la siguiente ruta:
src\main\resources\my_shema.sql

En resources tambien se encuetran application.properties y my_data.sql, donde se introducen datos a las tablas

### Back-End

#### Modelos 
Creamos los archivos Cliente.java, Cuenta.java y Movimientos.java con sus respectivos metodos
src\main\java\com\example\demo\model\Cliente.java
#### Repositorios 
Donde creamos querys 
src\main\java\com\example\demo\repository
#### Services
Donde se realizan los joins entre Cliente y Cuenta & Cliente y Movimientos
src\main\java\com\example\demo\service

PD: alguna operacion no se realiza de correctamente por errores en los archivos
