package jpipe;

import java.util.ArrayList;

public class CPU {
	
	private ArrayList<Etapa> etapas;

	public CPU() {
		
	}
	
	public void inicializa() {
		
	}
	
	public void empieza() {
	
		try {
			while ( true ) {
				for ( Etapa etapa : etapas ) {
					etapa.lee();
					etapa.ejecuta();
					etapa.escribe();
				}
			}
		} catch ( ExcepcionTrap e ) {
			this.finalizar();
		}
	}
	
	public void finalizar() {
		
	}
}
