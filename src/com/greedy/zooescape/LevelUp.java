package com.greedy.zooescape;

public  class LevelUp {
	
	private int hp;
	private int speed;
	private int power;
	

	
	public LevelUp() {}
	
	public LevelUp(int hp, int speed, int power) {
		
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
	public String toString() {
		return "LevelUp [hp=" + hp + ", speed=" + speed + ", power=" + power + "]";
	}
	
	
	
}
