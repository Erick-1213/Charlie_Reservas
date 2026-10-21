# Registro XP - Equipo ___
Repositorio: (https://github.com/Erick-1213/Charlie_Reservas)

Integrantes y usuarios GitHub:


Erik Guerrero - erigue08


Heidy Tenelema - Musui123


Erick Cuichan - Erick-1213


Dayana Martinez - Dalinel05

## Cliente y objetivo de valor
¿Qué necesidad de negocio resuelve este incremento? (máx. 2 líneas)

Automatizacion de registro y cancelacion de una reserva de sala de estudio para estudiantes.

## Valores XP observables
Registre dos decisiones reales del equipo que reflejen comunicación, simplicidad, retroalimentación, coraje o respeto.

Comunicación: Trabajamos en parejas utilizando los roles de Driver (conductor) y Navigator (navegador), intercambiando ideas y propuestas durante la implementación de las historias de usuario.

Respeto: Distribuimos las historias de usuario entre las parejas y establecimos una rotación de roles cada 10 minutos para garantizar la participación de ambos integrantes. Además, utilizamos un temporizador para controlar el tiempo dedicado a cada rol.


## Responsabilidades flexibles
Pareja 1 (HU-01): Erick Cuichan / Dayana Martínez | 

Pareja 2 (HU-02): Erik Guerrero / Heidy Tenelema

Facilitación: Erick Cuichan | Seguimiento: Erik Guerrero | Consulta al cliente: Heidy Tenelema 


#### Programación en Parejas (XP)

| Turno| Duración | Driver | Navigator |
|------|----------|--------|-----------|
| 1 | 10 min | Heidy | Erik |
| 1 | 10 min | Dayana | Erick |
| 2 | 10 min | Erik | Heidy |
| 2 | 10 min | Erick | Dayana |
| 3 | 10 min | Heidy | Erik |
| 3 | 10 min | Dayana | Erick |
| 4 | 10 min | Dayana | Erick |
| 4 | 10 min | Heidy | Erik |
| 5 | 10 min | Erik | Heidy |
| 5 | 10 min | Erick | Dayana |
| 6 | 10 min | Dayana | Erick |
| 6 | 10 min | Heidy | Erik |
| 7 | 10 min | Erik | Heidy |
| 7 | 10 min | Erick | Dayana |

## Historias, aceptación y estimaciones
| Historia | Prioridad | Estimación relativa | Criterios de aceptación | Tareas |
|---|---|---|---|---|
| HU-01 | Alta | 25| Registrar un bloque libre; rechazar duplicados y datos inválidos.| Crear pruebas, implementar registro y verificar resultados.|
| HU-02 | Alta | 23|Permitir cancelar al titular, rechazar a terceros y liberar el bloque. | cancelación y verificar resultados.|

## Tablero mínimo


| Por hacer | En curso | Terminado |
|---|---|---|
| Completar la HU-02 | Implementación de HU-02: Cancelar reserva | HU-01: Registrar reserva |
| Revisar los Pull Requests | Pruebas de HU-02 | Asignación de historias de usuario |
| Ejecutar pruebas integradas | | Estimaciones mediante Planning Poker |


## Prácticas técnicas

**Evidencia RED (prueba inicial que falla, momento o commit):**  
`BookingPolicyTest.rechazaSegundaReservaDelMismoEstudiante` — La prueba falló porque el sistema permitía que un mismo estudiante registrara más de una reserva activa.

**Evidencia GREEN (prueba que pasa después, momento o commit):**  
`BookingPolicyTest.rechazaSegundaReservaDelMismoEstudiante` — Después de implementar la validación de una única reserva activa por estudiante, se ejecutó nuevamente la prueba y pasó satisfactoriamente.

**Refactorización o decisión de simplicidad:**  
Se mantuvo la estructura existente del proyecto, implementando la nueva validación sobre las reservas almacenadas en memoria, sin incorporar clases o dependencias adicionales.


## Git / revisión / CI
PR HU-01: ... | Revisor distinto del autor: ...
PR HU-02: ... | Revisor distinto del autor: ...
Resultado Actions (éxito/fallo/no disponible): ... | URL de ejecución: ...

## Cambio del cliente (completar SOLO cuando se anuncie)

**ID:** CR-01

**Nueva regla:** Un estudiante no podrá mantener más de una reserva activa entre los bloques A, B y C.

**Impacto en pruebas/código:** Se deben incorporar pruebas unitarias para rechazar una segunda reserva activa del mismo estudiante, permitir reservas de estudiantes diferentes y comprobar que una cancelación válida habilita una nueva reserva. Se modifica la lógica de BookingPolicy.java sin alterar las reglas existentes.

**Prioridad revisada:** Alta.

**Efecto sobre el alcance:** Se incorpora la restricción de una reserva activa por estudiante al registro de reservas, conservando los requisitos originales de HU-01 y HU-02.

**Decisión del equipo y estado final:** Pendiente de implementación y verificación.


## Cierre
**Historias aceptadas:** HU-01 (registro de reservas), HU-02 (cancelación de reservas) y HU-03 (CR-01: límite de una reserva activa por estudiante).

**Pendientes conocidos:** Ninguno a nivel funcional, tras completar la implementación y verificar los criterios de aceptación.

**Siguiente mejora concreta:** Ampliar las pruebas unitarias para contemplar más casos límite y garantizar el correcto funcionamiento del sistema.
