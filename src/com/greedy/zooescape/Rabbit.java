package com.greedy.zooescape;


	public class Rabbit extends LevelUp implements IFood {
		private int hp;
		private int speed;
		private int power;
		
		public Rabbit() {}
		
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
		
		@Override
		public void iBanana() {
			speed += BANANA;
			System.out.println("토끼가 바나나를 먹고 속력이 " + BANANA + "만큼 빨라졌습니다. 토끼의 현재 속력은 " + speed + "입니다");
		}
		
		@Override
		public void iApple() {
			hp += APPLE;
			System.out.println("토끼가 사과를 먹고 체력이 " + APPLE + "만큼 상승했습니다. 토끼의 현재 체력은 " + hp + "입니다");
			
		}

		@Override
		public void iWatermolon() {
			power += WATERMELON;
			System.out.println("토끼가 수박을 먹고 파워가 " + WATERMELON + "만큼 강해졌습니다. 토끼의 현재 체력은 " + power + "입니다.");
			
		}
		
		@Override
		public void igarbage() {
			speed += GARBAGE;
			System.out.println("토끼가 쓰레기를 먹고 속력이 " + GARBAGE + "만큼 느려졌습니다. 토끼의 현재 속력은 " + speed + "입니다.");
			
		}

		@Override
		public void iFoodillness() {
			hp += IFOODILLNESS;
			System.out.println("토끼가 식중독에 걸려서 체력이 " + IFOODILLNESS + "만큼 떨어졌습니다. 토끼의 현재 체력은 " + hp + "입니다.");
			
		}
		

	}

