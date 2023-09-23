package main;

import television.Television;

public class Main {
	public static void main(String[] args) {
		Television myTv = new Television(7, 10, true);
		Television yourTv = new Television(9, 12, true);

		if (myTv.isOnOff())
			System.out.println("나의 텔레비전 채널은 " + myTv.getChannel() 
							+ "이고, 볼륨은 " + myTv.getVolume() + "입니다.");
		else
			System.out.println("나의 텔레비전은 OFF 상태입니다.");
		
		if(yourTv.isOnOff())
			System.out.println("너의 텔레비전 채널은 " + yourTv.getChannel() 
			+ "이고, 볼륨은 " + yourTv.getVolume() + "입니다.");
		else
			System.out.println("너의 텔레비전은 OFF 상태입니다.");
	}
}