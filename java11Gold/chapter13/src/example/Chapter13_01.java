package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter13_01 {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
			System.out.print("入力値=" + br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
