/**
 * Clase Locomotora, funciona como la "Lista" de la estructura de datos
 * @author fernandocanek-yh
 *
 */
import java.util.Scanner;
public class Locomotora {
	
	
	
	Scanner s = new Scanner(System.in);//Objeto scanner para leer indicaciones de usuario
	int kilometros; //# de kilometros entre estaciones, para calcular el carbon
	int pPrimeraBajan, pPrimeraSuben, pTerceraBajan, pTerceraSuben; //variables que indican el el cambio de usuarios en cada estacion
	
	int numeroPasajerosPrimera = 0; //numero de pasajeros actuales 1a clase
	int numeroPasajerosTercera = 0; //numero de pasajeros actuales 3a clase
	
	final int CARBON = 0;
	final int PRIMERA = 1;
	final int TERCERA = 2;
	
	VagonCarbon inicio = null; 
	VagonPasajerosPrimera vpp = null;
	VagonPasajerosTercera vpt = null;
	
	
	void menuDeUso(){
		
		
		System.out.println("GRACIAS POR UTILIZAR EL SISTEMA DE TRENES...\n"
				+ "Estamos en la estación Cero, ¿A Cuanto está la estación 1?");
		
		kilometros = s.nextInt();
		
		System.out.println("¿Cuantos pasajeros de primera clase bajan?");
		pPrimeraBajan = s.nextInt();
		numeroPasajerosPrimera = numeroPasajerosPrimera - pPrimeraBajan;
		
		
		System.out.println("¿Cuantos pasajeros de primera clase suben?" );		
		pPrimeraSuben = s.nextInt();
		numeroPasajerosPrimera = numeroPasajerosPrimera + pPrimeraSuben;
		
		System.out.println("¿Cuantos pasajeros de tercera clase bajan?");
		pTerceraBajan = s.nextInt();
		numeroPasajerosTercera = numeroPasajerosTercera - pTerceraBajan;
					
		System.out.println("¿Cuantos pasajeros de tercera clase bajan?");
		pTerceraSuben = s.nextInt();
		numeroPasajerosTercera = numeroPasajerosTercera +pTerceraSuben;
		
		System.out.println("Hay: " + numeroPasajerosPrimera+" pasajeros en primera clase y "+
		numeroPasajerosTercera+" pasajeros en tercera clase \n");
		
		construyeLocomotora();
	
		
		
		
	}
	
	
	
	private void construyeLocomotora() {
		int cont = 0;
		
		if(kilometros <= 100){
			agregarVagon(CARBON, cont);
			cont++;
		}else{
			for(int i = 0; i<= (kilometros/100); i++){
				agregarVagon(CARBON, cont);
				cont++;
			}
		}
		
		
		if(numeroPasajerosPrimera <= 10){
			agregarVagon(PRIMERA, cont);
			cont++;
		}else{
			for(int i = 0; i<= (kilometros/10); i++){
				agregarVagon(PRIMERA, cont);
				cont++;
			}
		}
		
		if(numeroPasajerosTercera <= 40){
			agregarVagon(TERCERA, cont);
			cont++;
		}else{
			for(int i = 0; i<= (kilometros/100); i++){
				agregarVagon(TERCERA, cont);
				cont++;
			}
		}
		
	}

	
	
	public void agregarVagon(int tipo, int posicion){
		
		switch(tipo){
		case CARBON:
			
			if(inicio == null){
				inicio = new VagonCarbon(posicion);
			}else{
				VagonCarbon tmp = inicio;
				inicio = new VagonCarbon(posicion);
				inicio.siguiente = tmp;
				
			}
			
			break;
			
		case PRIMERA:
			if(inicio == null){
				vpp = new VagonPasajerosPrimera(posicion);
			}else{
				VagonPasajerosPrimera tmp = vpp;
				vpp = new VagonPasajerosPrimera(posicion);
				vpp.siguiente = tmp;
				
			}
			
			break;
			
			
		case TERCERA:
			if(inicio == null){
				vpt = new VagonPasajerosTercera(posicion);
			}else{
				VagonPasajerosTercera tmp = vpt;
				vpt = new VagonPasajerosTercera(posicion);
				vpt.siguiente = tmp;
				
			}
			
			break;
		}
		
		
	}
	
	
	
	


	public static void main(String[]  a){
		
		Locomotora l = new Locomotora();
		l.menuDeUso();
		
		
		
	}
	
	
	
}
