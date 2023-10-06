package Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Collections {
	
	public static void main(String[] args) {
		
		//Array
		String [] listaCompras = new String [] {"Leche", "Pan", "Huevos"};
		System.out.println(listaCompras);//Me imprime el espacio en memoria, no los productos contenidos en mi array
		
		//Para los elementos de tipo String que llamaremos poductoAImprimir lo vamos a tomar y lo imprimes
		for(String prodcuctoAImprimir : listaCompras)//Lo saco de lista de compras, lo guardo en productoAImprimir y lo pongo en la impresora
		System.out.println(prodcuctoAImprimir);
		
		
		//Implementacio de un arrayList
		//Clase General (interfaz), tipo de dato general 
		List<String> listaDeContactos= new ArrayList<>();
		
		
		//Agrego elementos del tipo String a mi arrayList llamado listaDeContactos
		listaDeContactos.add("Felipe");
		listaDeContactos.add("Roberto");
		listaDeContactos.add("Alicia");
		listaDeContactos.add("Fatima");
		
		//Obtener un elemento de la lista
		String datoFelipe = listaDeContactos.get(0);
		System.out.println(datoFelipe);
		
		//Borrar un elemento de la lista
		listaDeContactos.remove(1);
		System.out.println(listaDeContactos);
		
		//Implementacion de un conjunto (SET)
		//Sintaxis 
		//Interface de donde implemento + tipo de dato que usare+ nombre que le doy al conjunto + instancia de la clase especifica
		
		Set<String> cartasDeJuego = new HashSet<>();
		
		//Agregar elementos 
		cartasDeJuego.add("As de Corazones");
		cartasDeJuego.add("2 de picas");
		cartasDeJuego.add("Reina de Treboles");
		
		//No puedo saber posiciones, solo saber si lo contiene
		if(cartasDeJuego.contains("Reina de Corazones")) {
			System.out.println("La reina de treboles si esta en el conjunto ");
			}else {
				System.out.println("No encuentro el elemento solicitado");
			}
		
		//Implementación de un mapa (hashMap)
		Map <String, String> libretaDirecciones = new HashMap<>();
		
		//Agregar elementos a mi libreta de direcciones, donde mi llave es igual nombre y mi value es igual a dirección
		libretaDirecciones.put("Felipe", "Tlalnepantla"); //Agrego a mi primer pesona en mi libreta de direcciones.
		libretaDirecciones.put("Dr. Simi", "CDMX");
		libretaDirecciones.put("Naruto", "Konoha");
		
		//Método para sacar información de la libreta creando una nueva variable
		String direccionFelipe = libretaDirecciones.get("Felipe");//De la libreta de direcciones traeme la dirección de
		String direccionNaruto = libretaDirecciones.get("Konoha");
		System.out.println(direccionFelipe);
		System.out.println(direccionNaruto);//Imprime un nulo, ya que se está buscando por el Value(konoha) y no por la Key(Naruto)
		

		
	}

}


/*
 * Colecciones:
 * 		-Arrays: estructura de datos lineal que contienen elementos del mismo tipo  
 * 		los elementos se almacenan de forma contigua.
 * 			-Es un estructura de datos fija y almacena datos del mismo tipo
 * 			-La longitud no cambia, se establece al momento de crearlo
 * 			-Se accede a los elementos por medio de un índice
 * 			-Puede contener datos primitivos y objetos.
 * 			-No proporciona métodos adicionales para agregar o eliminar elementos.
 * 			Ej: una lista de compras del supermecado
 * 
 * 		-ArrayList: implementación de una lista, utiliza un array dinámico que
 * 		permite almacenar datos 
 * 
 * 
 * 
 */
/*
*
*- ArrayList
 * 
 * 
 * Es una implementacion de una lista (List), es decir, que esta en un nivel abajo de las listas. Utiliza un array dinamico que permite almacenar datos.
 * 
 * Sus principales caracteristicas son:
 * 
 * 	- Tamanio dinamico, a diferencia de los arrays tradicionales, el tamanio de un arrayList si se puede modificar.
 *  - Acceso rapido, podemos acceder a un elemento del arrayList por su posicion o indice
 *  - Coste elevado al momento de insertar o eliminar elementos. Si agrego un elemento, tengo que recorrer todos los demas elementos.
 *  
 * 
*Set (conjunto)
 *  Estructura de datos que alamacena datos unicos sin  orden especifico. Las principales caracteristicas de un set son:
 *  
 *  -No hay elementos duplicados, ya que los conjuntos no los pueden contener. Si se intenta agregar un elemento ya existente, la operacion se ignora.
 *  
 *  -No hay un orden especifico, los elementos se alamacenan sin orden espeficifico, los elementos se almacenan sin orden especifico.
 *  -La busqueda es mas sencilla, ya que al no tener elementos duplicados se usa una funcion hash para encontrar elementos deseado.
*	
*	MAP :
*		Estructura de datos que almacena pares de clave-valor.
*			-Almacenamiento con pares K-V
*			-Sin orden específico, similar a un SET
*			-Búsqueda rápida, la búsqueda se hace por medio de un valor (key)y usa una función interna hash para buscar elements
*			
*		Ej: Como una agenda telefónica donde puedes agregar, modificar, eliminar
*
*
*/