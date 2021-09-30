package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.BufferUnderflowException;

public class BufferedInputStreamEx5 {
	public static void main(String[] args) {

		// FileInputStream만 사용하는 경우 + byte배열
		try (FileInputStream fis = new FileInputStream("c:\\temp\\Rolling.mp3");
				FileOutputStream fos = new FileOutputStream("c:\\temp\\Rolling_copy4.mp3")) {

			byte data[] = new byte[1024];
			long start = System.currentTimeMillis();

			while (fis.read(data) != -1) {
				fos.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream + byte +FileOutStream 사용시" + (end - start));

		} catch (Exception e) {
			e.printStackTrace();
		}

		// FileInputStream + BufferedInputStream를 사용하는 경우 +byte 배열 사용하는 경우
		// FileOutputStream + BufferedOutStream
		try (FileInputStream fis = new FileInputStream("c:\\temp\\picture.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("c:\\temp\\Rolling_copy5.mp3");
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			byte data[] = new byte[1024];

			long start = System.currentTimeMillis();

			while (bis.read(data) != -1) {
				bos.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream + BufferedInputStream +byte +out..사용시" + (end - start));

		} catch (Exception e) {
			e.printStackTrace();
		}
//
//		FileInputStream fis = null;
//		BufferedInputStream bis = null;
//		FileOutputStream fos = null;
//		BufferedOutputStream bos = null;
//		try {
//
////			fis = new FileInputStream("c:\\temp\\picture.jpg");
//			fis = new FileInputStream("c:\\temp\\Rolling.mp3");
//			bis = new BufferedInputStream(fis);
////			fos  = new FileOutputStream("c:\\temp\\picture_copy2.jpg");
//			fos = new FileOutputStream("c:\\temp\\Rolling_copy2.mp3");
//			bos = new BufferedOutputStream(fos);
//
//			int data;
//
//			while ((data = bis.read()) != -1) {
//				bos.write(data);
//			}
//			bos.flush(); // 버퍼 비우기
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fis.close();
//				fos.close();
//				bis.close();
//				bos.close();
//			} catch (Exception e2) {
//			}
//		}

	}
}
