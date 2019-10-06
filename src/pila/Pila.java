package pila;

interface Pila<T> {
	boolean push(T dato);
	void pop();
	T peek();
	boolean isEmpty();
	void empty();
}
