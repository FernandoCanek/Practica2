/**
 * Super Clase padre Vagon, es la implementación del nodo,
 * por lo que los vagones que hereden de ésta, serán 
 * tambien nodos para la lista enlazada (locomotora) 
 * @author fernandocanek-yh
 */
 
public class Vagon {
	
	int posicion;
	Vagon siguiente;
	
	//constructor generico
	public Vagon(int posicion){
		
		this.posicion = posicion;
		siguiente = null;
		
	}

}
