package com.greedy.zooescape;


	public class Rabbit {
		private int hp;
		private int speed;
		private int power;
		
		public Rabbit() {};
		
		public Rabbit(int hp, int speed, int power) {
			this.hp = hp;
			this.speed = speed;
			this.power = power;
		}

		public int getHp() {
			return hp;
		}

		public void setHp(int hp) {
			this.hp = hp;
		}

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}

		public int getPower() {
			return power;
		}

		public void setPower(int power) {
			this.power = power;
		}
		
		//메소드?
		
//		@Override
//		public int ibanana() {
//			return 				speed + 20;
//			System.out.println("바나나를 먹고 속력이 20만큼 빨라졌습니다");
//		}
	//	
//		@Override
//		public int iApple() {
//			return hp + 25;
//		}
	//	
//		@Override
//		public int iWatermelon() {
//			return power + 30;
//		}
	//	
//		@Override
//		public int iGabage() {
//			return power - 20;
//		}
	//	
//		@Override
//		public int iFoodillness() {
//			return hp - 30;
//		}
		
	}

