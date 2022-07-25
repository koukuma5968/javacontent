package example.run;

public class Chapter11_08_Thread extends Thread {
	String name;
	Chapter11_08_Sub_synchronized sub;
	public Chapter11_08_Thread(Chapter11_08_Sub_synchronized sub, String name) {
		this.name = name;
		this.sub = sub;
	}
	@Override
	public void run() {
		this.sub.print(this.name);
	}
}
