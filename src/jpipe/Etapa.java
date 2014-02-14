package jpipe;

public interface Etapa {

	public void lee();
	
	public void ejecuta();
	
	public void escribe() throws ExcepcionTrap;
}
