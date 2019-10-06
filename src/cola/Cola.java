package cola;

interface Cola<T> {
	boolean offer(T dato);
	void poll();
	T peek();
	boolean isEmpty();
	void empty();
}
