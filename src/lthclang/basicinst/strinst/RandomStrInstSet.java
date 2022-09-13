package lthclang.basicinst.strinst;

import java.util.Random;

public class RandomStrInstSet 
{
	private int random;
	private Random rand = new Random();
	
	public RandomStrInstSet() {
		// TODO Auto-generated constructor stub
	}
	
	public String randStr()
	{
		random = 1 + rand.nextInt(62);
		
		switch (random) {
			case 1:
				return "a";
			case 2:
				return "b";
			case 3:
				return "c";
			case 4:
				return "d";
			case 5:
				return "e";
			case 6:
				return "f";
			case 7:
				return "g";
			case 8:
				return "h";
			case 9:
				return "i";
			case 10:
				return "j";
			case 11:
				return "k";
			case 12:
				return "l";
			case 13:
				return "m";
			case 14:
				return "n";
			case 15:
				return "o";
			case 16:
				return "p";
			case 17:
				return "q";
			case 18:
				return "r";
			case 19:
				return "s";
			case 20:
				return "t";
			case 21:
				return "u";
			case 22:
				return "v";
			case 23:
				return "w";
			case 24:
				return "x";
			case 25:
				return "y";
			case 26:
				return "z";
			case 27:
				return "A";
			case 28:
				return "B";
			case 29:
				return "C";
			case 30:
				return "D";
			case 31:
				return "E";
			case 32:
				return "F";
			case 33:
				return "G";
			case 34:
				return "H";
			case 35:
				return "I";
			case 36:
				return "J";
			case 37:
				return "K";
			case 38:
				return "L";
			case 39:
				return "M";
			case 40:
				return "N";
			case 41:
				return "O";
			case 42:
				return "P";
			case 43:
				return "Q";
			case 44:
				return "R";
			case 45:
				return "S";
			case 46:
				return "T";
			case 47:
				return "U";
			case 48:
				return "V";
			case 49:
				return "W";
			case 50:
				return "X";
			case 51:
				return "Y";
			case 52:
				return "Z";
			case 53:
				return "0";
			case 54:
				return "1";
			case 55:
				return "2";
			case 56:
				return "3";
			case 57:
				return "4";
			case 58:
				return "5";
			case 59:
				return "6";
			case 60:
				return "7";
			case 61:
				return "8";
			default:
				return "9";
		}
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