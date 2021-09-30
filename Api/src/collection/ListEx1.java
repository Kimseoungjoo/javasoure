package collection;

import java.util.ArrayList;
import java.util.List;

/* �÷��� �����ӿ�ũ
 *  - ���� �����͵��� �����ϴ� Ŭ�������� ǥ��ȭ�� ������
 *  - collection(interface) - List, Set
 *  - Map
 *  
 *  List(�������̽�) : ������ �ִ�. �������� �ߺ��� �����ϴ�. 
 *       ���� Ŭ���� : Vector, ArrayList, LinkedList, Stack....
 *  	 �迭�� ���� �����ε�, ���׷��̵��� ����
 *  E / T / K / V  >> ��ü Ÿ���� �����϶�� �Ҹ��� 
 *  
 *  �⺻ Ÿ�� => ��ü Ÿ�� (Wrapper Ŭ����)
 *  ex) int => Integer, float => Float, double => Double, char = > character
 *  boolean = > Boolean
 */

public class ListEx1 {
	public static void main(String[] args) {
		
		// ��ü ���� 
		List<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Character> list3 = new ArrayList<Character>();
		
		// ������ �߰�
		list1.add("���");
		list1.add("������");
		list1.add("�ٳ���");
		list1.add("����");
		list1.add("����");
		list1.add("��");
		list1.add("����");
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		list2.add(10);

		//������ ��������
		for(String i :list1	 ) {
			System.out.println(i);
		}
		System.out.println();
		
		System.out.println(list1); // toString �������̵� 
		for(int i =0 ; i<list1.size();i++) { // size = length
			System.out.println(list1.get(i));
		}
		
		for(int i :list2) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println(list2);
		
		// �հ豸�ϱ� 
		int sum = 0;
		for(int i =0; i <list2.size(); i++) {
			sum+=list2.get(i);
			
		}
		System.out.println("�հ� :" + sum);
		
	}
}
