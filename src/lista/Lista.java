package lista;

import nodo.Nodo;

public interface Lista<T> {
	boolean pushBack(T dato);
	T popBack();
	boolean pushFront(T dato);
	T popFront();
	void remove(T dato);
	void reverse();
	void insertAt(int posicion, T dato);
	void eraseAt(int posicion);
	boolean isEmpty();
	void empty();
	Nodo<T> search(T dato);
	Nodo<T> searchAt(int posicion);
}
