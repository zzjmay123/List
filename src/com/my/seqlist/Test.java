package com.my.seqlist;

import java.util.Random;

public class Test {
	final int MAX = 25;  
    Random r = new Random();  
    SeqList<Integer> seqList;  
      
    public Test() {  
        initSeqList();  
    }  
      
    //����һ�����Ա�˳��洢�ṹ  
    public void initSeqList() {  
  
        seqList = new SeqList<Integer>();  
//      int length = (int) Math.random();   //ֻ�ܲ���0.0 - 1.0֮���double�����  
        int length = Math.abs(r.nextInt(MAX));  //ʹ��Random�������һ��25���ҵ�ֵ,ʹ��Math.abs()������ȡ����ֵ    
        System.out.println("���������鳤��Ϊ ��" + length);  
          
        if(length > SeqList.MAXSIZE) {  
            System.out.println("�ó��Ȳ��Ϸ�");  
        }  
          
        for (int i = 1; i <= length; i++) {  //Ϊ���ɵ����鸳ֵ��ͬʱҲ�����˲���ֵ�ķ���  
            int j =r.nextInt(MAX);  
            System.out.print(j + " ");  
              
            if(!seqList.insertElem(i, j)) {  
                System.exit(0);   
            }  
        }  
        System.out.println("\nԭʼ������ ��");  
        display(seqList);  
    }  
      
    //����ɾ������  
    public void deleteElem() {  
        int i = r.nextInt(MAX);  
        System.out.println("\n\nɾ����λ���ǣ�" + i);  
        Integer deleteNumber = seqList.deleteElem(i);  
          
        if( deleteNumber == null) {  
            System.exit(0);  
        } else {  
            System.out.println("ɾ����Ԫ���� �� " + deleteNumber);  
            System.out.println("ɾ��Ԫ�غ������� ��");  
            display(seqList);  
        }  
    }  
      
    //����������뷽��  
    public void insertByRandom() {  
        int i = r.nextInt(MAX);  
        System.out.println("\n\n�������λ���� ��" + i);  
        int elem = r.nextInt(MAX);  
        System.out.println("������������� ��" + elem);  
        seqList.insertElem(i, elem);  
        System.out.println("����������ݺ������� ��");  
        display(seqList);  
    }  
      
    //����չʾ  
    public  void display(SeqList seqList) {  
        for (int i = 1; i < seqList.getData().length; i++) {  
              
            if(seqList.getElement(i) != null) {  
                System.out.print(seqList.getElement(i) + " ");  
            }  
              
        }  
        System.out.println("����ĳ���Ϊ ��" + seqList.getLength());  
    }  
      
    //��ȡԪ��  
    public void getElem() {  
        int i = r.nextInt(MAX);  
        System.out.println("\n��ȡλ��Ϊ ��" + i);  
        System.out.println("��ȡ����Ԫ��Ϊ : " + seqList.getElement(i));  
          
          
    }  
      
    public static void main(String[] args) {  
        Test s = new Test();  
        s.insertByRandom();  
        s.deleteElem();  
        s.getElem();  
    }  
}
