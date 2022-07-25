package example.run;

public class Chapter11_07_Thread extends Thread {
	String name;
	Chapter11_07_Sub sub;
	public Chapter11_07_Thread(Chapter11_07_Sub sub, String name) {
		this.name = name;
		this.sub = sub;
	}
	@Override
	public void run() {
		this.sub.print(this.name);
	}
}
