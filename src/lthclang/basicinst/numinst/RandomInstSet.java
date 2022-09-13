package lthclang.basicinst.numinst;

import java.util.Random;

public class RandomInstSet 
{
	public RandomInstSet() {
		// TODO Auto-generated constructor stub
	}
	
	public float randomInt(int adjust, int limit)
	{
		Random rand = new Random();
		return (float)(adjust + rand.nextInt(limit-adjust));
	}
	
	public float randomInt(int limit)
	{
		Random rand = new Random();
		return (float)(rand.nextInt(limit));
	}
	
	public float randomFloat()
	{
		Random rand = new Random();
		return rand.nextFloat();
	}
}