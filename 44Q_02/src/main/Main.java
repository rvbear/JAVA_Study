package main;

import television.Television;

public class Main {
	public static void main(String[] args) {
		Television myTv = new Television(7, 10, true);
		Television yourTv = new Television(9, 12, true);

		if (myTv.isOnOff())
			System.out.println("���� �ڷ����� ä���� " + myTv.getChannel() 
							+ "�̰�, ������ " + myTv.getVolume() + "�Դϴ�.");
		else
			System.out.println("���� �ڷ������� OFF �����Դϴ�.");
		
		if(yourTv.isOnOff())
			System.out.println("���� �ڷ����� ä���� " + yourTv.getChannel() 
			+ "�̰�, ������ " + yourTv.getVolume() + "�Դϴ�.");
		else
			System.out.println("���� �ڷ������� OFF �����Դϴ�.");
	}
}