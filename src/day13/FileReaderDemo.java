package day13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.junit.Test;

public class FileReaderDemo {
	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("demo.txt");
			int ch = 0;
			while ((ch = reader.read()) != -1) {
				System.out.println(ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void fileReader1() {
		try {
			Reader reader = new FileReader("demo.txt");
			while (true) {
				int ch = reader.read();
				if (ch == -1) {
					break;
				}
				System.out.print((char) ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void fileReader2() {
		Reader reader = null;
		try {
			reader = new FileReader("demo.txt");
			int ch = 0;
			while ((ch = reader.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != reader) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@Test
	public void fileReader3() {
		Reader reader = null;
		try {
			reader = new FileReader("demo.txt");
			char[] buffer = new char[1024];
			int length = 0;
			while ((length = reader.read(buffer)) != -1) {
				System.out.println(length);
				for (char c : buffer) {
					System.out.print(c);
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != reader) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
