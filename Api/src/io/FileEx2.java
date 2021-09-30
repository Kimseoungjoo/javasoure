package io;

import java.io.File;

/*File
 * ������ �ٷ�� ���� Ŭ����
 * ����(���丮) : /, \ 
 * \n , \t \b ... �̽������� 
 */
public class FileEx2 {

	public static void main(String[] args) {
		
		File file = new File("c:\\temp\\InputStreamEx1.java");
		
		//���� �̸� 
		String fileName = file.getName();
		//.�� ��ġ�� �˾ƾ��ϴ� ������ �ʿ��ϴ� 
		
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("���ϸ� : "+fileName); // Ȯ��� ����
		System.out.println("���ϸ� : "+fileName.substring(0, pos)); // Ȯ��� ����
		System.out.println("���ϸ� : "+fileName.substring(pos+1)); // Ȯ��� ����
		
		System.out.println("��θ� ������ ���ϸ� : "+file.getPath() );
		System.out.println("������ ���� �ִ� ������ : "+file.getParent() );
		
		System.out.println("File.sepearator : "+File.separator );
		System.out.println("File.pathSeparator"+File.pathSeparator);
		
	}

}
