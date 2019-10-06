package pila;

import nodo.Nodo;

public class PilaDinamica<T> implements Pila<T>{

	private Nodo<T> top;
	
	public PilaDinamica() {
		top=null;
	}
	
	@Override
	public boolean push(T dato) {
		Nodo<T> nodo = new Nodo<T>(dato, top);
		top=nodo;
		return true;
	}

	@Override
	public void pop() {
		top=top.getSig();
	}

	@Override
	public T peek() {
		return top.getDato();
	}

	@Override
	public boolean isEmpty() {
		return top==null ? true : false;
	}

	@Override
	public void empty() {
		while(top!=null)
			top=top.getSig();
	}

}
