package io;

import java.io.File;
import java.io.FileInputStream;
/*File
 * ������ �ٷ�� ���� Ŭ����
 */
public class FileEx1 {
	public static void main(String[] args) {

		File file1 = new File("c:\\temp\\text.txt");
		File file2 = new File("c:\\temp","text.txt");

		File file3 = new File("c:\\temp");
		File file4 = new File(file3,"text.txt");
		// File file4 = new File(new File("c:\\temp"),"text.txt\");
		
		
		
	}
}
