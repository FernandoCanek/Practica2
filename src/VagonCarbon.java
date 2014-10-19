/**
 * VagonCarbon, hereda el constructor de la super-clase
 * Vagon, por lo tanto, su constructor es de un nodo
 */
public class VagonCarbon extends Vagon{
	
	boolean activo = true;
	int carbonKilometros = 100;
	
	public VagonCarbon(int posicion){
		
		super(posicion);
		
	}
	
	//metodo publico de recorrer, verificando que haya carbon
	public void recorrer(int kilometrosARecorrer){
		if((activo == true) && carbonKilometros > 0){
			avanzarGastantoCarbon(carbonKilometros, kilometrosARecorrer);
		}else{
			System.out.println("Ya no hay carbon en el vagon");
		}
	}//fin metodo publico de recorrer

	//Resta el numero de kilometros a avanzar del carbonporKilometro existente
	private void avanzarGastantoCarbon(int carbonActual, int kilometrosARecorrer) {
			
			this.carbonKilometros = carbonActual - kilometrosARecorrer;			
			
	}//fin metodo privado avanzarGastantoCarbon;

}
