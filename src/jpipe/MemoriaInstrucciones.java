package jpipe;

import java.util.ArrayList;
import java.util.List;

public class MemoriaInstrucciones {
	private List<Instruccion> lista;
	
	public MemoriaInstrucciones() {
		lista = new ArrayList<Instruccion>();
	}
	
	public void addInstruccion(Instruccion instruccion) {
		lista.add(instruccion);
	}
	
	public Instruccion getInstruccion(int indice) {
		return lista.get(indice);
	}
}
