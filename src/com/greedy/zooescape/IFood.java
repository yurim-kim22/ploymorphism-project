package com.greedy.zooescape;

public interface IFood {
	
	public static final int BANANA = 20;
	public static final int APPLE = 25;
	public static final int WATERMELON = 30;
	public static final int GARBAGE = -20;
	public static final int IFOODILLNESS = -30;
	
	
	public abstract void iBanana();
	public abstract void iApple();
	public abstract void iWatermolon();
	public abstract void iFoodillness();
}
