package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class BufferedReaderEx2 {

	public static void main(String[] args) {
		// BufferedInputStreamEx5 파일을 읽어서 화면에 줄번호와 함께
		// FileReader("src/io/BufferedInputStreamEx5.java")
//		try (FileReader fr = new FileReader("src/io/BufferedInputStreamEx5.java");
//				BufferedReader br = new BufferedReader(fr);
//				FileWriter fw = new FileWriter("c:\\temp\\test6.txt");
//				BufferedWriter bw = new BufferedWriter(fw)){
//				
//			String line =". ";
//			int  i= 0;
//			while((line = br.readLine())!=null) {
//				bw.write(i+". "+line);
//				bw.newLine();
//			i++;
//			}
//		
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		} 내가 짠 코딩
		try (FileReader fr = new FileReader("src/io/BufferedInputStreamEx5.java");
				BufferedReader br = new BufferedReader(fr);
				){
			
			//char cbuf[] = new char[100];
			String line="";
			
			int i = 1;
			while((line=br.readLine()) != null) {
				System.out.println(i+". "+line);
				i++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
