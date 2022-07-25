package example.run;

public class Chapter11_08_Sub_synchronized {
	public void print(String name) {
		synchronized(this) {
			System.out.println(name);
			for (int i=0; i<10; i++) {
				System.out.print(i + ",");
			}
			System.out.println();
		}
	}
}
