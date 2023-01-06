package com.greedy.zooescape;


import java.util.Scanner;

public class GameManager {
	
	public void gameManager() {
		
		

		
		LevelUp[] animal = {
				new Rabbit(80, 60, 40),
				new Bear(30, 80, 40),
				new Zebra(60, 20, 70),
		};
		
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========================동물원을 탈출 하자!==========================");
		System.out.println("동물원을 탈출하기 위해서는 능력치가 평균 70점을 넘어야합니다.");
		System.out.println("동물을 선택해주세요 : ");
		System.out.println("1. 토끼");
		System.out.println("2. 곰");
		System.out.println("3. 얼룩말");
		int selectAnimal = sc.nextInt();
		
		switch(selectAnimal) {
		case 1 : System.out.println(animal[0]); break;
		case 2 : System.out.println(animal[1]); break;
		case 3 : System.out.println(animal[2]); break;
		}

		
		String[] food = {"바나나", "수박", "사과", "쓰레기", "식중독"};
		
		/* 게임 돌리기 */
		
		int gameSet = 5;
		
			
		
		for(int i = 0; i < 5 ; i++) {
			
			
			System.out.println("동물원을 탈출하기 위한 아이템 상자(1~5 정수 중 하나)를 고르세요 : ");
			int number = sc.nextInt();			
			
			
			int randomFood = (int) (Math.random() * food.length - 1);
			
			System.out.println("상자가 열렸습니다 \n" + food[randomFood] + "아이템을 얻었습니다");
			
		
			if(food[randomFood] == food[0]) {//바나나
				
				switch(selectAnimal) {
				case 1 : ((Rabbit)animal[0]).iBanana(); break;
				case 2 : ((Bear)animal[1]).iBanana(); break;
				case 3 : ((Zebra)animal[2]).iBanana(); break;
				} 
				
			} 
			
			if(food[randomFood] == food[1]) {//수박
				
				switch(selectAnimal) {
				case 1 : ((Rabbit)animal[0]).iWatermolon(); break;
				case 2 : ((Bear)animal[1]).iWatermolon(); break;
				case 3 : ((Zebra)animal[2]).iWatermolon(); break;
				} 
				
			}
			
			if(food[randomFood] == food[2]) {//사과
				
				switch(selectAnimal) {
				case 1 : ((Rabbit)animal[0]).iApple(); break;
				case 2 : ((Bear)animal[1]).iApple(); break;
				case 3 : ((Zebra)animal[2]).iApple(); break;
				} 
				
			}
			
			if(food[randomFood] == food[3]) {//쓰레기일때
				
				switch(selectAnimal) {
				case 1 : ((Rabbit)animal[0]).igarbage(); break;
				case 2 : ((Bear)animal[1]).igarbage(); break;
				case 3 : ((Zebra)animal[2]).igarbage(); break;
				} 
				
			}
			
			if(food[randomFood] == food[4]) {//식중독일때
				
				switch(selectAnimal) {
				case 1 : ((Rabbit)animal[0]).iFoodillness(); break;
				case 2 : ((Bear)animal[1]).iFoodillness(); break;
				case 3 : ((Zebra)animal[2]).iFoodillness(); break;
				} 
				
			}
			
			gameSet -= 1 ;			
			System.out.println("남은 선택 기회 : " + gameSet + "회");
							
			}//for
		
		
		/* 탈출 조건*/
		
		
		
		if(selectAnimal == 1) {
			if(((Rabbit)animal[0]).avg() >= 70) {
				System.out.println("축하합니다!토끼가 동물원을 탈출했습니다!");
			}else{
				System.out.println("토끼가 탈출에 실패했습니다.");
			}
			
		}else if (selectAnimal == 2) {
			if(((Bear)animal[1]).avg() >= 70) {
				System.out.println("축하합니다!곰이 동물원을 탈출했습니다!");
			}else{
				System.out.println("곰이 탈출에 실패했습니다.");
			}
			

		}else if (selectAnimal == 3) {

			if(((Zebra)animal[2]).avg() >= 70) {
				System.out.println("축하합니다!얼룩말이 동물원을 탈출했습니다!");
			}else{
				System.out.println("얼룩말이 탈출에 실패했습니다.");
			}
		}
		
		

			} 
			
}




