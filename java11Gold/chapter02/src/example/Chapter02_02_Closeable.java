package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Chapter02_02_Closeable implements AutoCloseable {
	BufferedReader br;
	public void load() throws FileNotFoundException {
		File f = new File("chapter02/file");
		br = new BufferedReader(new FileReader(f.getAbsoluteFile()));
	}
	protected void read() throws IOException {
		System.out.println(br.readLine());
	}
	@Override
	public void close() throws Exception {
		System.out.println("close");
		br.close();
	}
}
