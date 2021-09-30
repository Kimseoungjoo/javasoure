package io;

import java.io.File;

/*File
 * 파일을 다루기 위한 클래스
 * 폴더(디렉토리) : /, \ 
 * \n , \t \b ... 이스케이프 
 */
public class FileEx2 {

	public static void main(String[] args) {
		
		File file = new File("c:\\temp\\InputStreamEx1.java");
		
		//파일 이름 
		String fileName = file.getName();
		//.의 위치를 알아야하는 구문이 필요하다 
		
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("파일명 : "+fileName); // 확장명 포함
		System.out.println("파일명 : "+fileName.substring(0, pos)); // 확장명 제외
		System.out.println("파일명 : "+fileName.substring(pos+1)); // 확장명 제외
		
		System.out.println("경로를 포함한 파일명 : "+file.getPath() );
		System.out.println("파일이 속해 있는 폴더명 : "+file.getParent() );
		
		System.out.println("File.sepearator : "+File.separator );
		System.out.println("File.pathSeparator"+File.pathSeparator);
		
	}

}
