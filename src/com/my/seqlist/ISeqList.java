package com.my.seqlist;

/**
 * 定义一个线性表顺序存储的接口
 * @author zzjmyay
 *
 */
public interface ISeqList<T> {
	
	/**
	 * 用于获取指定位置的元素
	 * @param i 需要获取元素的位置
	 * @return
	 */
	public T getElement(int i);
	
	/**
	 * 插入一个元素
	 * @param i 需要插入的位置
	 * @param t 插入的元素
	 * @return
	 */
	public boolean insertElem(int i,T t);
	
	/**
	 * 删除指定位置的元素
	 * @param i 要删除的元素的位置
	 * @return
	 */
	public T deleteElem(int i);
}
