package collection;

import java.util.LinkedList;
import java.util.List;
/* Arraylist vs LinkedList
 * - ���������� �߰��� �����ϴ� ��쿡 ArrayList�� �� �� ������.
 * - �߰� �����͸� �߰�/���� �� LinkedList�� �� �� ���� 
 */
public class ListEx4 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		
		// �߰� 
		list.add("���");
		list.add("������");
		list.add("�ٳ���");
		list.add("����");
		list.add("����");
		list.add("��");
		list.add("����");
		System.out.println(list);
	}
}
