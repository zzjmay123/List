package com.my.seqlist;

/**
 * ����һ�����Ա�˳��洢�Ľӿ�
 * @author zzjmyay
 *
 */
public interface ISeqList<T> {
	
	/**
	 * ���ڻ�ȡָ��λ�õ�Ԫ��
	 * @param i ��Ҫ��ȡԪ�ص�λ��
	 * @return
	 */
	public T getElement(int i);
	
	/**
	 * ����һ��Ԫ��
	 * @param i ��Ҫ�����λ��
	 * @param t �����Ԫ��
	 * @return
	 */
	public boolean insertElem(int i,T t);
	
	/**
	 * ɾ��ָ��λ�õ�Ԫ��
	 * @param i Ҫɾ����Ԫ�ص�λ��
	 * @return
	 */
	public T deleteElem(int i);
}
