package com.my.seqlist;

/**
 * ��Ҫ���׵ĸ���������ĳ��ȣ�=���Ա�ĳ���
 * @author Administrator
 *
 * @param <T>
 */
public class SeqList<T> implements ISeqList<T> {
	public static final int MAXSIZE = 20;// ��ʼ���Ĵ洢�ռ�����

	private T[] data;// �������洢���Ա�
	private int length;// ���Ա�ĵ�ǰ����

	public SeqList() {
		data = (T[]) new Object[MAXSIZE];
	}

	@Override
	public T getElement(int i) {

		if (i < 0 || i > MAXSIZE) {
			return null;
		}

		T t = data[i - 1];

		return t;
	}

	//ʱ�临�Ӷ���O(n)��һ��������˵��ʱ�临�Ӷ���ָ���ʱ�临�Ӷ�
	@Override
	public boolean insertElem(int i, T t) {
		if (length == MAXSIZE) {
			System.out.println("�洢��������");
			return false;
		}

		if (i < 0 || i > MAXSIZE) {
			System.out.println("�����λ�ò��ڷ�Χ��");
			return false;
		}

		if (i < length) {
			// ���ڶ�β����
			for (int j = length - 1; j >= i; j--) {

				data[j + 1] = data[j];// ���е�Ԫ������ƶ�
			}

		}
		data[i - 1] = t;
		length++;// ���Ա�ĳ���+1
		return true;
	}

	@Override
	public T deleteElem(int i) {
		if (length == 0) {
			System.out.println("���Ա�Ϊ�ձ�");
			return null;
		}
		
		if(i<0 || i>length){
			System.out.println("Ҫɾ����Ԫ�ز��ڷ�Χ��");
			return null;
		}
		
		T t= data[i-1];
		//����i�����Ԫ����ǰ�ƶ�
		
		for(int j=(i-1);j < length;j++){
			data[j]=data[j+1];
			
		}
		length--;
		return t;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		if(length<0 || length >MAXSIZE){
			System.out.println("���Ȳ��Ϸ�");
		}
		this.length = length;
	}

	public T[] getData() {
		return data;
	}

	public void setData(T[] data) {
		this.data = data;
	}

}
