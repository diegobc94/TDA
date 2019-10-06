package cola;

import nodo.Nodo;

public class ColaDinamica<T> implements Cola<T>{

	private Nodo<T> first;
	private Nodo<T> last;
	
	public ColaDinamica() {
		first=null;
		last=null;
	}
	
	
	@Override
	public boolean offer(T dato) {
		Nodo<T> nodo = new Nodo<T>(dato,null);
		nodo.setDato(dato);
		last.setSig(nodo);
		return true;
	}

	@Override
	public void poll() {
		if(first!=null)
			first=first.getSig();
	}

	@Override
	public T peek() {
		return (T) first.getDato();
	}

	@Override
	public boolean isEmpty() {
		return first == null ? true : false;
	}

	@Override
	public void empty() {
		while(first!=null) {
			Nodo<T> aux = first;
			first=first.getSig();
			aux.setSig(null);
		}
		last=null;
	}

}
