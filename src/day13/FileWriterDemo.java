package day13;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import org.junit.Test;

public class FileWriterDemo {

	@Test
	public void fileWriter1() {
		Writer writer = null;
		try {
			writer = new FileWriter("ddd", true);
			char[] buffer = new char[] { 'a', 'b', 'c', 'd', 65, 97 };
			writer.write(buffer);

			// writer.write("c");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != writer) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	@Test
	public void fileWriter2() {
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader("demo.txt");
			writer = new FileWriter(new File("demo_bak.txt"));
			char[] buffer = new char[1024];
			reader.read(buffer);
			int length = 0;
			while ((length = reader.read(buffer)) != -1) {
				writer.write(buffer, 0, length);
			}
			

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != writer) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (null != reader) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
