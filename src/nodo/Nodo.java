package nodo;

public class Nodo<T> {
	private T dato;
	private Nodo<T> sig;
	
	public Nodo(T dato, Nodo<T> sig) {
		this.dato=dato;
		this.sig=sig;
	}

	public T getDato() {
		return dato;
	}
	
	public void setDato(T dato) {
		this.dato=dato;
	}

	public void setSig(Nodo<T> sig) {
		this.sig=sig;
	}

	public Nodo<T> getSig() {
		return sig;
	}
	
	
}
