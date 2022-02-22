# Proyecto-software

Integrantes del Equipo BOT

1. Jose Armando Pozo Silva
2. Rene Ruben Vicente Navia
3. Bernardo Gilberto Duran Mamani
# Proyecto BOT ingenieria del Software
BOT orientado a la búsqueda de mascotas perdidas 
## Introduccion
El siguiente proyecto está orientado a al desarrollo de un BOT para la plataforma Telegram, con la finalidad de apoyar y facilitar la búsqueda de mascotas extraviadas en la ciudad de La Paz, Bolivia, dado que los medios tradicionales como ser afiches, publicaciones en redes sociales u otros toman mucho tiempo para ser efectivos o no llegan a un grupo que pueda ayudar de forma inmediata, es necesario un **BOT para apoyar la búsqueda de mascotas** en el cual se reciban los datos necesarios y una zona específica para que el BOT informe en un grupo respectivo a una zona y estos puedan apoyar en la búsqueda en la brevedad posible.
## Objetivo
Lograr crear un prototipo de BOT en la plataforma de Telegram el cúal agilice la búsqueda de una mascota extraviada. Logrando que una persona que haya perdido a su mascota pueda hacer una publicación rapida en el BOT, el cúal se encargue de enviar el aviso a la respectiva zona donde sucedio la perdida, logrando que la búsqueda de dicha mascota sea mas optima y eficaz en un corto tiempo.
## Problematica
En la ciudad de La Paz se tiene un gran número de mascotas desaparecidas, aunque en el pasado se intentaron implementar aplicaciones para ayudar con la busqueda de mascotas perdidas, estas no fueron muy populares, los avisos llegaban a pocas personas y los medios tradicionales también presentan algunas falencias como:
- Comunicación lenta. En el caso de los afiches, estos tardan mucho tiempo en llegar a un público objetivo de ayuda, en muchos casos la mascota ya no se encuentra en las cercanías cuando estos afiches llegan a la población
- Costo Extra y tiempo perdido. El tener que realizar un documento con la foto y las caracteristicas de la raza se pierde tiempo, ya que se tiene que fotocopiar dicho afiche varias veces y ir a la calle a pegar el afiche en muchos postes o paredes de la zona, si quieres que más gente vea tu afiche, tienes que llegar a una distancia más lejana de tu zona, eso es perdida de dinero y tambien que dañas el aspecto de la zona con papeles pegados en sus paredes o postes de luz. 
- Notificación dispersa. Cuando se publica un aviso de mascota perdida en distintos grupos en redes sociales, los avisos de búsqueda llegan de forma rápida pero a un grupo muy amplio de personas, que muy probablemente no se encuentren en un radio para ayudar con la búsqueda.

Las personas desconocen Apps para la búsqueda de mascotas, muchos proyecto con una temática similar fracasan debido a que las personas desconocen o no desean realizar la descarga de aplicaciones adicionales a no ser que requieran el servicio, por lo cual es más práctico y de fácil acceso el uso de un grupo en un servicio de mensajería instantánea para llegar a un grupo mayor de personas en un área más específica de la ciudad.

Notificaciones de mascotas realmente lejanas a tu zona. En grupos de Facebook hay muchos grupos que te notifican la perdida de una mascota, pero muchas veces esa mascota se perdio en una zona que esta muy lejana a la tuya, por eso que ya muchas personas no ven los avisos porque piensan que es de otra zona lejana, por lo cual tener dividido por zonas y que te lleguen notificaciones de mascotas solo de tu zona será mas optimo y evitamos ver mascotas extraviadas de zonas alejada a su zona.

## Valor del proyecto
- Tangible
-- Reduce costos para la búsqueda, en el caso de afiches y otros.
- Intangible
-- Las personas tendrán una forma más sencilla y rápida de comunicar avisos de búsqueda para las mascotas.
-- Se comunicará del caso en un radio menor de búsqueda, buscando un aporte mayor de otras personas.
-- Acelerar la busqueda, el tener las zonas divididas por grupos ayudará eficazmente a la busqueda.
## Ejemplo de funcionamiento
- U (Usuario): Hola
- BOT: Hola en que puedo ayudarlo: 
opcion: 1) Publicar un aviso de mascota perdida. 2) Mascota encontrada. 3) Mostrar todos los avisos de mascotas no encontradas

Caso 1.  Publicar un aviso de mascota perdida
- BOT: Seleccione la zona donde su mascota se perdio: 1) zona sur. 2) Sopocachi. 3) Miraflores ...
- U: 1) zona sur
- BOT: Ingrese el nombre de la mascota
- U: Pancho
- BOT: Ingrese una descripcion de la mascota
- U: Perro mediano, color cafe con manchas negras en las orejas y patas, lleva un collar verde.....
- BOT: Ultimo lugar de contacto con la mascota
- U: Calle x al frente del cafe ejemplo
- BOT: Datos de contacto adicionales
- U: Telefono fijo ########## 
- BOT: Confirmar la publicación de perdida? (Si/No).
- U: Si
- BOT: Su aviso fue publicado con el codigo **aabbbccc** en los grupos de zona sur, calacoto, etc
- BOT en GRUPO ZONA SUR: se perdio **Pancho** en **Calle x al frente del cafe ejemplo**, cuenta con la descripcion: **Perro mediano, color cafe con manchas negras en las orejas y patas, lleva un collar verde.....**, si se tiene informacion contactar a: **Telefono fijo ##########** 

Caso 2 Mascota encontrada
- BOT: Ingrese su codigo de aviso
- U: aabbbccc
- BOT: Desea marcar este aviso como encontrado: si/no
- U: si
- BOT en GRUPO ZONA SUR: se encontro a **Pancho**

Caso 3 Mostrar todos los avisos de mascotas no encontradas
- BOT: estos son los avisos de mascotas que no fueron encontradas:
1) Pancho, zona sur, Calle x al frente del cafe ejemplo, descripcion: Perro mediano, color cafe con manchas negras en las orejas y patas, lleva un collar verde.....,informacion contacto: Telefono fijo ##########
2) ........
3) ........ 

