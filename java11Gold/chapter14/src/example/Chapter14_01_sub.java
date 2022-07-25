package example;

import java.io.Serializable;

public class Chapter14_01_sub implements Serializable {
	private int id;
	private String name;
	public Chapter14_01_sub(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void print() { System.out.println("id=" + id + ",name=" + name);}
	private Object writeReplace() {
		System.out.println("writeReplace");
		return new Chapter14_01_subProxy(id, name);
	}
	private static class Chapter14_01_subProxy implements Serializable {
		private final int id;
		private final String name;
		Chapter14_01_subProxy(int id, String name) {
			this.id = id;
			this.name = name;
		}
		private Object readResolve() {
			System.out.println("readResolve");
			return new Chapter14_01_sub(this.id, this.name);
		}
	}
}
