package cola;

public class ColaEstatica<T> implements Cola<T>{

	private T cola[];
	private int first;
	private int elems;
	
	public ColaEstatica(int TAM) {
		cola = (T[]) new Object[TAM];
		first = 0;
		elems = 0;
	}
	
	@Override
	public boolean offer(T dato) {
		if(elems==cola.length)
			return false;
		cola[(first+elems)%cola.length]=dato;
		elems++;
		return true;
	}

	@Override
	public void poll() {
		if(elems==0)
			return;
		first = (first+1)%elems;
		elems--;
	}

	@Override
	public T peek() {
		if(elems==0)
			return null;
		return cola[first];
	}

	@Override
	public boolean isEmpty() {
		return elems==0 ? true : false;
	}

	@Override
	public void empty() {
		first=-1;
		elems=0;
	}

}
