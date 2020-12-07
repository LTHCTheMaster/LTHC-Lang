package lthclang.basicinst.strinst;

import java.util.Random;

public class RandomStrInstSet 
{
	public RandomStrInstSet() {
		// TODO Auto-generated constructor stub
	}
	
	public String randStr()
	{
		String str ="";
		Random rand = new Random();
		int random = 1 + rand.nextInt(62);
		if(random == 1)
		{
			str = "a";
		}
		if(random == 2)
		{
			str = "b";
		}
		if(random == 3)
		{
			str = "c";
		}
		if(random == 4)
		{
			str = "d";
		}
		if(random == 5)
		{
			str = "e";
		}
		if(random == 6)
		{
			str = "f";
		}
		if(random == 7)
		{
			str = "g";
		}
		if(random == 8)
		{
			str = "h";
		}
		if(random == 9)
		{
			str = "i";
		}
		if(random == 10)
		{
			str = "j";
		}
		if(random == 11)
		{
			str = "k";
		}
		if(random == 12)
		{
			str = "l";
		}
		if(random == 13)
		{
			str = "m";
		}
		if(random == 14)
		{
			str = "n";
		}
		if(random == 15)
		{
			str = "o";
		}
		if(random == 16)
		{
			str = "p";
		}
		if(random == 17)
		{
			str = "q";
		}
		if(random == 18)
		{
			str = "r";
		}
		if(random == 19)
		{
			str = "s";
		}
		if(random == 20)
		{
			str = "t";
		}
		if(random == 21)
		{
			str = "u";
		}
		if(random == 22)
		{
			str = "v";
		}
		if(random == 23)
		{
			str = "w";
		}
		if(random == 24)
		{
			str = "x";
		}
		if(random == 25)
		{
			str = "y";
		}
		if(random == 26)
		{
			str = "z";
		}
		if(random == 27)
		{
			str = "A";
		}
		if(random == 28)
		{
			str = "B";
		}
		if(random == 29)
		{
			str = "C";
		}
		if(random == 30)
		{
			str = "D";
		}
		if(random == 31)
		{
			str = "E";
		}
		if(random == 32)
		{
			str = "F";
		}
		if(random == 33)
		{
			str = "G";
		}
		if(random == 34)
		{
			str = "H";
		}
		if(random == 35)
		{
			str = "I";
		}
		if(random == 36)
		{
			str = "J";
		}
		if(random == 37)
		{
			str = "K";
		}
		if(random == 38)
		{
			str = "L";
		}
		if(random == 39)
		{
			str = "M";
		}
		if(random == 40)
		{
			str = "N";
		}
		if(random == 41)
		{
			str = "O";
		}
		if(random == 42)
		{
			str = "P";
		}
		if(random == 43)
		{
			str = "Q";
		}
		if(random == 44)
		{
			str = "R";
		}
		if(random == 45)
		{
			str = "S";
		}
		if(random == 46)
		{
			str = "T";
		}
		if(random == 47)
		{
			str = "U";
		}
		if(random == 48)
		{
			str = "V";
		}
		if(random == 49)
		{
			str = "W";
		}
		if(random == 50)
		{
			str = "X";
		}
		if(random == 51)
		{
			str = "Y";
		}
		if(random == 52)
		{
			str = "Z";
		}
		if(random == 53)
		{
			str = "0";
		}
		if(random == 54)
		{
			str = "1";
		}
		if(random == 55)
		{
			str = "2";
		}
		if(random == 56)
		{
			str = "3";
		}
		if(random == 57)
		{
			str = "4";
		}
		if(random == 58)
		{
			str = "5";
		}
		if(random == 59)
		{
			str = "6";
		}
		if(random == 60)
		{
			str = "7";
		}
		if(random == 61)
		{
			str = "8";
		}
		if(random == 62)
		{
			str = "9";
		}
		
		return str;
	}
	
	public String sRandStr(int size)
	{
		String str = "";
		for(int i = 0; i < size; i++)
		{
			str += randStr();	
		}
		return str;
	}
}
