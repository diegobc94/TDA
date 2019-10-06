package cola;

public class ColaEstatica<T> implements Cola<T>{

	private T cola[];
	private int first;
	private int last;
	
	public ColaEstatica(int TAM) {
		cola = (T[]) new Object[TAM];
		first = -1;
		last = -1;
	}
	
	@Override
	public boolean offer(T dato) {
		if(cola.length==last-1)
			return false;
		if(last==-1)
			first=0;
		cola[++last]=dato;
		return true;
	}

	@Override
	public void poll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void empty() {
		// TODO Auto-generated method stub
		
	}

}
