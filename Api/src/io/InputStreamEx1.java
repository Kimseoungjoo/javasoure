package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) {
		
		// System.in : 키보드 입력
		InputStream in = System.in;
		int input = 0;
		try {
			// int input = in.read();
			while((input = in.read())!=-1) { // 1byte 만 읽어온다. 그래서 반복문 사용
				
				System.out.print((char)input);
			}
			
		} catch (IOException e)
	{
			e.printStackTrace();
		}
	}
}
