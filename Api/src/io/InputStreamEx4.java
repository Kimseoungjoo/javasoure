package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx4 {

	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;
		
		byte[]	datas = new byte[100];
		
		// 사용자로부터 이름과 하고 싶은 말을 입력받은 후
		// String 객체로 변환
	System.out.print("이름 : ");
	try {
		int nameBytes = in.read(datas); // 홍길동 > 엔터 
		// Enter : carriage return => 13번, line feed: 10번
		
		String name = new String(datas, 0, nameBytes-2);
		
		System.out.println("하고 싶은 말: ");
		int commentsBytes = in.read(datas);
		String comment = new String(datas, 0,commentsBytes-2);
		
		System.out.println("입력한 이름 :" + name);
		System.out.println("입력한 하고 싶은 말 :" +comment);
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	}

}
