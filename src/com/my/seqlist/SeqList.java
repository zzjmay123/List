package com.my.seqlist;

/**
 * 需要明白的概念是数组的长度！=线性表的长度
 * @author Administrator
 *
 * @param <T>
 */
public class SeqList<T> implements ISeqList<T> {
	public static final int MAXSIZE = 20;// 初始化的存储空间容量

	private T[] data;// 数组来存储线性表
	private int length;// 线性表的当前长度

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

	//时间复杂度是O(n)，一般我们所说的时间复杂度是指最坏的时间复杂度
	@Override
	public boolean insertElem(int i, T t) {
		if (length == MAXSIZE) {
			System.out.println("存储容量已满");
			return false;
		}

		if (i < 0 || i > MAXSIZE) {
			System.out.println("插入的位置不在范围内");
			return false;
		}

		if (i < length) {
			// 不在队尾插入
			for (int j = length - 1; j >= i; j--) {

				data[j + 1] = data[j];// 所有的元素向后移动
			}

		}
		data[i - 1] = t;
		length++;// 线性表的长度+1
		return true;
	}

	@Override
	public T deleteElem(int i) {
		if (length == 0) {
			System.out.println("线性表为空表");
			return null;
		}
		
		if(i<0 || i>length){
			System.out.println("要删除的元素不在范围内");
			return null;
		}
		
		T t= data[i-1];
		//所有i后面的元素向前移动
		
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
			System.out.println("长度不合法");
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
