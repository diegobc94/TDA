package pila;

public class PilaEstatica<T> implements Pila<T>{

	private int top;
	private T pila[];
	
	public PilaEstatica(int TAM) {
		this.pila = (T[]) new Object[TAM];
		this.top=-1;
	}
	
	@Override
	public boolean push(T dato) {
		if(top==pila.length)
			return false;
		pila[++top]=dato;
		return true;
	}

	@Override
	public void pop() {
		if(top>-1)
			top--;
	}

	@Override
	public T peek() {
		return pila[top];
	}

	@Override
	public boolean isEmpty() {
		return top==-1 ? true : false; 
	}

	@Override
	public void empty() {
		top=-1;
	}

}
