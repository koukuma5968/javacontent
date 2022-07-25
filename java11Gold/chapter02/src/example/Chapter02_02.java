package example;

public class Chapter02_02 {

	public static void main(String[] args) {
		try(Chapter02_02_Closeable cl = new Chapter02_02_Closeable();){
			cl.load();
			cl.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
