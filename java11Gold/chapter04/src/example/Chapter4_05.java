package example;

public class Chapter4_05<E> {
	private E element;
	public void add(E element) {
		this.element = element;
	}
	public E get() {
		return this.element;
	}
	public <T> T getType(T type) {
		return type;
	}
}
