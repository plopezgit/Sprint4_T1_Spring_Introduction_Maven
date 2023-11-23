package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.Controllers;

public class HelloWorldController {
	
	public String hi(String name) {
		return "Hi " + name + ", you are in";
	}
	
	public String hi2(String name) {
		return "Hi " + name + ", you are in";
	}

	
	
	/*

En el archivo application.properties, configura la variable server.port con el valor 9000.
Convertiremos esta aplicación en una API REST:
 	Dependiendo del package principal, crea otro subpackage llamado Controllers, y dentro de él, 
	añade la clase HelloWorldController.
	Deberá tener dos métodos:
 		String saluda
 		String saluda2

• Estos dos métodos recibirán un parámetro String llamado nombre, y devolverán la frase:
• "Hola, "+ nombre +". Estás ejecutando un proyecto Maven”.

El primer método responderá a una petición GET, y deberá ser configurado para recibir el parámetro 
como un RequestParam. El parámetro "nombre" tendrá el valor predeterminado “UNKNOWN”.
Deberá responder a:
• http://localhost:9000/HelloWorld
• http://localhost:9000/HelloWorld?nombre=Mi nombre

El segundo método responderá a una petición GET, y deberá ser configurado para recibir el parámetro 
como una PathVariable. El parámetro "nombre" será opcional.
Deberá responder a:
• http://localhost:9000/HelloWorld2
• http://localhost:9000/HelloWorld2/mi nombre

Muy Importante
Además del enlace a Git de la tarea resuelta, tendrás que incluir al menos dos enlaces diferentes de los recursos que te hemos proporcionado en el campus, que te hayan servido o lo hubieran podido hacer, para resolver la totalidad de la tarea o algunas partes.
	
	 */

	
	
}
