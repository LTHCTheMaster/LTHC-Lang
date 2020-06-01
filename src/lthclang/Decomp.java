package lthclang;

import java.util.ArrayList;
import java.util.List;

import lthclang.basicinst.PrintInstSet;
import lthclang.basicinst.numinst.AddInstSet;
import lthclang.basicinst.numinst.DivInstSet;
import lthclang.basicinst.numinst.EDivInstSet;
import lthclang.basicinst.numinst.FloatInputInstSet;
import lthclang.basicinst.numinst.ModInstSet;
import lthclang.basicinst.numinst.SubInstSet;
import lthclang.basicinst.numinst.MultInstSet;
import lthclang.basicinst.numinst.RandomInstSet;
import lthclang.basicinst.strinst.RandomStrInstSet;
import lthclang.basicinst.strinst.StrAddInstSet;
import lthclang.basicinst.strinst.StrInputInstSet;
import lthclang.var.number.Var;
import lthclang.var.str.StrVar;

public class Decomp
{
	private Reader prgmdReader = new Reader();
	private List<String> prgm = prgmdReader.getPrgm();
	private PrintInstSet print = new PrintInstSet();
	private String inst;
	private String str;
	
	private AddInstSet addFunc = new AddInstSet();
	private SubInstSet subFunc = new SubInstSet();
	private MultInstSet multFunc = new MultInstSet();
	private DivInstSet divFunc = new DivInstSet();
	private ModInstSet modFunc = new ModInstSet();
	private EDivInstSet eDivFunc = new EDivInstSet();
	private StrAddInstSet strAddFunc = new StrAddInstSet();
	private RandomInstSet rand = new RandomInstSet();
	
	private List<Var> variable = new ArrayList<Var>();
	private FloatInputInstSet floatIn = new FloatInputInstSet();
	
	private List<StrVar> strVariable = new ArrayList<StrVar>();
	private StrInputInstSet strIn = new StrInputInstSet();
	private RandomStrInstSet strRand = new RandomStrInstSet();
	
	public void executerMethod()
	{
		variable.add(new Var("abcdefghijklmnopqrstuvwxyzazertyuiopqsdfghjklmwxcvbn01234567897894561230_defaultvar_ghydusjhgduyhd",0.0F));
		strVariable.add(new StrVar("abcdefghijklmnopqrstuvwxyzazertyuiopqsdfghjklmwxcvbn01234567897894561230_defaultstrvar_ghydusjhgduyhd",""));
		int index = 0;
		while(index < prgm.size())
		{
			str = prgm.get(index);
			this.inst = str.split(" ")[0];
			//Print Instruction
			if(this.inst.equalsIgnoreCase("print"))
			{
				String inst2 = "";
				for(int i = 1; i < str.split(" ").length; i++)
				{
					inst2 += str.split(" ")[i] + " ";
				}
				print.print(inst2);
			}
			//Print with line Instruction
			if(this.inst.equalsIgnoreCase("printl"))
			{
				String inst2 = "";
				for(int i = 1; i < str.split(" ").length; i++)
				{
					inst2 += str.split(" ")[i] + "\n";
				}
				print.print(inst2);
			}
			
			//Create Var
			if(this.inst.equalsIgnoreCase("var"))
			{
				int isExist = 0;
				for(Var var : variable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
					{
						isExist = 1;
					}
				}
				if(isExist == 0)
				{
					variable.add(new Var(str.split(" ")[1].toLowerCase(), Float.parseFloat(str.split(" ")[2])));
				}
			}
			//PrintVar
			if(this.inst.equalsIgnoreCase("printvar"))
			{
				for(Var var : variable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
					{
						print.print(var.getValueStr());
					}
				}
			}
			
			//Add
			if(this.inst.equalsIgnoreCase("add"))
			{
				for(Var varstock : variable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(varstock.getName()))
					{	
						for(Var vara : variable)
						{
							if(str.split(" ")[2].equalsIgnoreCase(vara.getName()))
							{
								for(Var varb : variable)
								{
									if(str.split(" ")[3].equalsIgnoreCase(varb.getName()))
									{
										varstock.setValue(addFunc.addNumVar(vara.getValue(), varb.getValue()));
									}
								}
							}
						}
					}
				}
			}
			
			//Sub
			if(this.inst.equalsIgnoreCase("sub"))
			{
				for(Var varstock : variable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(varstock.getName()))
					{	
						for(Var vara : variable)
						{
							if(str.split(" ")[2].equalsIgnoreCase(vara.getName()))
							{
								for(Var varb : variable)
								{
									if(str.split(" ")[3].equalsIgnoreCase(varb.getName()))
									{
										varstock.setValue(subFunc.subNumVar(vara.getValue(), varb.getValue()));
									}
								}
							}
						}
					}
				}
			}
			
			//Mult
			if(this.inst.equalsIgnoreCase("mult"))
			{
				for(Var varstock : variable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(varstock.getName()))
					{	
						for(Var vara : variable)
						{
							if(str.split(" ")[2].equalsIgnoreCase(vara.getName()))
							{
								for(Var varb : variable)
								{
									if(str.split(" ")[3].equalsIgnoreCase(varb.getName()))
									{
										varstock.setValue(multFunc.multNumVar(vara.getValue(), varb.getValue()));
									}
								}
							}
						}
					}
				}
			}
			
			//Div
			if(this.inst.equalsIgnoreCase("div"))
			{
				for(Var varstock : variable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(varstock.getName()))
					{	
						for(Var vara : variable)
						{
							if(str.split(" ")[2].equalsIgnoreCase(vara.getName()))
							{
								for(Var varb : variable)
								{
									if(str.split(" ")[3].equalsIgnoreCase(varb.getName()))
									{
										varstock.setValue(divFunc.divNumVar(vara.getValue(), varb.getValue()));
									}
								}
							}
						}
					}
				}
			}
			
			//Mod
			if(this.inst.equalsIgnoreCase("mod"))
			{
				for(Var varstock : variable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(varstock.getName()))
					{	
						for(Var vara : variable)
						{
							if(str.split(" ")[2].equalsIgnoreCase(vara.getName()))
							{
								for(Var varb : variable)
								{
									if(str.split(" ")[3].equalsIgnoreCase(varb.getName()))
									{
										varstock.setValue(modFunc.modNumVar(vara.getValue(), varb.getValue()));
									}
								}
							}
						}
					}
				}
			}
			
			//EDiv
			if(this.inst.equalsIgnoreCase("ediv"))
			{
				for(Var varstock : variable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(varstock.getName()))
					{	
						for(Var vara : variable)
						{
							if(str.split(" ")[2].equalsIgnoreCase(vara.getName()))
							{
								for(Var varb : variable)
								{
									if(str.split(" ")[3].equalsIgnoreCase(varb.getName()))
									{
										varstock.setValue(eDivFunc.eDivNumVar(vara.getValue(), varb.getValue()));
									}
								}
							}
						}
					}
				}
			}
			
			//Random Int Base
			if(this.inst.equalsIgnoreCase("irand"))
			{
				for(Var var : variable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
					{
						var.setValue(rand.randomInt(Integer.parseInt(str.split(" ")[2])));
					}
				}
			}
			
			//Random Int Base With Adjust
			if(this.inst.equalsIgnoreCase("arand"))
			{
				for(Var var : variable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
					{
						var.setValue(rand.randomInt(Integer.parseInt(str.split(" ")[2]), Integer.parseInt(str.split(" ")[3])));
					}
				}
			}
			
			//Random Float 
			if(this.inst.equalsIgnoreCase("frand"))
			{
				for(Var var : variable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
					{
						var.setValue(rand.randomFloat());
					}
				}
			}
			
			//Float Input
			if(this.inst.equalsIgnoreCase("finput"))
			{
				for(Var var : variable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
					{
						var.setValue(floatIn.floatInput());
					}
				}
			}
			//Float Input with custom message
			if(this.inst.equalsIgnoreCase("mfinput"))
			{
				for(Var var : variable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
					{
						String msg = "";
						for(int i = 2; i < str.split(" ").length; i++)
						{
							msg += str.split(" ")[i] + " ";
						}
						var.setValue(floatIn.cFloatInput(msg));
					}
				}
			}
			
			//Set
			if(this.inst.equalsIgnoreCase("set"))
			{
				for(Var var : variable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
					{
						var.setValue(Float.parseFloat(str.split(" ")[2]));
					}
				}
			}
			
			//Str create
			if(this.inst.equalsIgnoreCase("str"))
			{
				int isExist = 0;
				for(StrVar var : strVariable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
					{
						isExist = 1;
					}
				}
				if(isExist == 0)
				{
					String inst2 = "";
					for(int i = 2; i < str.split(" ").length; i++)
					{
						inst2 += str.split(" ")[i] + " ";
					}
					strVariable.add(new StrVar(str.split(" ")[1], inst2));
				}
			}
			//Strl create
			if(this.inst.equalsIgnoreCase("strl"))
			{
				int isExist = 0;
				for(StrVar var : strVariable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
					{
						isExist = 1;
					}
				}
				if(isExist == 0)
				{
					String inst2 = "";
					for(int i = 2; i < str.split(" ").length; i++)
					{
						inst2 += str.split(" ")[i] + "\n";
					}
					strVariable.add(new StrVar(str.split(" ")[1], inst2));
				}
			}
			
			//PrintStr
			if(this.inst.equalsIgnoreCase("printstr"))
			{
				for(StrVar var : strVariable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
					{
						print.print(var.getValue());
					}
				}
			}
			
			//StrAdd
			if(this.inst.equalsIgnoreCase("stradd"))
			{
				for(StrVar varstock : strVariable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(varstock.getName()))
					{
						for(StrVar vara : strVariable)
						{
							if(str.split(" ")[2].equalsIgnoreCase(vara.getName()))
							{	
								for(StrVar varb : strVariable)
								{
									if(str.split(" ")[3].equalsIgnoreCase(varb.getName()))
									{
										varstock.setValue(strAddFunc.addStr(vara.getValue(), varb.getValue()));
									}
								}
							}
						}
					}
				}
			}
				
			//Str Input
			if(this.inst.equalsIgnoreCase("sinput"))
			{
				for(StrVar var : strVariable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
					{
						var.setValue(strIn.strInput());
					}
				}
			}
			//Str Input with custom message
			if(this.inst.equalsIgnoreCase("msinput"))
			{
				for(StrVar var : strVariable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
					{
						String msg = "";
						for(int i = 2; i < str.split(" ").length; i++)
						{
							msg += str.split(" ")[i] + " ";
						}
						var.setValue(strIn.cStrInput(msg));
					}
				}
			}
			
			//SetStr
			if(this.inst.equalsIgnoreCase("setstr"))
			{
				for(StrVar var : strVariable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
					{
						String inst2 = "";
						for(int i = 2; i < str.split(" ").length; i++)
						{
							inst2 += str.split(" ")[i] + " ";
						}
						var.setValue(inst2);
					}
				}
			}
			//SetStrl
			if(this.inst.equalsIgnoreCase("setstrl"))
			{
				for(StrVar var : strVariable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
					{
						String inst2 = "";
						for(int i = 2; i < str.split(" ").length; i++)
						{
							inst2 += str.split(" ")[i] + "\n";
						}
						var.setValue(inst2);
					}
				}
			}
			
			//Random Str
			if(this.inst.equalsIgnoreCase("strrand"))
			{
				for(StrVar var : strVariable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
					{
						var.setValue(strRand.randStr());
					}
				}
			}
			
			//Random Str with Size
			if(this.inst.equalsIgnoreCase("sstrrand"))
			{
				for(StrVar var : strVariable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
					{
						var.setValue(strRand.sRandStr(Integer.parseInt(str.split(" ")[2])));
					}
				}
			}
			
			//Unconditional Jump
			if(this.inst.equalsIgnoreCase("jmp"))
			{
				index = Integer.parseInt(str.split(" ")[1]) - 2;
			}
			
			//Conditional Jump [on float]
			if(this.inst.equalsIgnoreCase("cjmp"))
			{
				for(Var vara : variable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(vara.getName()))
					{
						for(Var varb : variable)
						{
							if(str.split(" ")[3].equalsIgnoreCase(varb.getName()))
							{
								if(str.split(" ")[2].equalsIgnoreCase("="))
								{
									if(vara.getValue() == varb.getValue())
									{
										index = Integer.parseInt(str.split(" ")[4]) - 2;
									}
								}
								if(str.split(" ")[2].equalsIgnoreCase("<"))
								{
									if(vara.getValue() < varb.getValue())
									{
										index = Integer.parseInt(str.split(" ")[4]) - 2;
									}
								}
								if(str.split(" ")[2].equalsIgnoreCase(">"))
								{
									if(vara.getValue() > varb.getValue())
									{
										index = Integer.parseInt(str.split(" ")[4]) - 2;
									}
								}
								if(str.split(" ")[2].equalsIgnoreCase("!=") || str.split(" ")[2].equalsIgnoreCase("=!"))
								{
									if(vara.getValue() != varb.getValue())
									{
										index = Integer.parseInt(str.split(" ")[4]) - 2;
									}
								}
								if(str.split(" ")[2].equalsIgnoreCase("<=") || str.split(" ")[2].equalsIgnoreCase("=<"))
								{
									if(vara.getValue() <= varb.getValue())
									{
										index = Integer.parseInt(str.split(" ")[4]) - 2;
									}
								}
								if(str.split(" ")[2].equalsIgnoreCase(">=") || str.split(" ")[2].equalsIgnoreCase("=>"))
								{
									if(vara.getValue() >= varb.getValue())
									{
										index = Integer.parseInt(str.split(" ")[4]) - 2;
									}
								}
							}
						}
					}
				}
			}
			
			//Conditional Jump [on str]
			if(this.inst.equalsIgnoreCase("csjmp"))
			{
				for(StrVar vara : strVariable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(vara.getName()))
					{
						for(StrVar varb : strVariable)
						{
							if(str.split(" ")[3].equalsIgnoreCase(varb.getName()))
							{
								if(str.split(" ")[2].equalsIgnoreCase("="))
								{
									if(vara.getValue() == varb.getValue())
									{
										index = Integer.parseInt(str.split(" ")[4]) - 2;
									}
								}
								if(str.split(" ")[2].equalsIgnoreCase("!=") || str.split(" ")[2].equalsIgnoreCase("=!"))
								{
									if(vara.getValue() != varb.getValue())
									{
										index = Integer.parseInt(str.split(" ")[4]) - 2;
									}
								}
							}
						}
					}
				}
			}
			
			index++;
		}
	}
}
