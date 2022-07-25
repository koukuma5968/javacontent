package example;

public class Chapter02_03 {

	public static void main(String[] args) {
		try {
			exThrows();
		} catch (Chapter02_03_Exception e) {
			e.printStackTrace();
		}
	}

	private static void exThrows() throws Chapter02_03_Exception {
		 throw new Chapter02_03_Exception();
	}
}
