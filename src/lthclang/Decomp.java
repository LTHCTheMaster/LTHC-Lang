package lthclang;

import java.util.ArrayList;
import java.util.List;

import lthclang.basicinst.ConvertFloatAndStrInstSet;
import lthclang.basicinst.PrintInstSet;
import lthclang.basicinst.numinst.FloatInputInstSet;
import lthclang.basicinst.numinst.RandomInstSet;
import lthclang.basicinst.strinst.RandomStrInstSet;
import lthclang.basicinst.strinst.StrAddInstSet;
import lthclang.basicinst.strinst.StrInputInstSet;
import lthclang.var.number.ListVar;
import lthclang.var.number.Var;
import lthclang.var.str.StrVar;

public class Decomp
{
	private Reader prgmdReader = new Reader();
	private List<String> prgm = prgmdReader.getPrgm();
	private PrintInstSet print = new PrintInstSet();
	private String inst;
	private String str;
	private ConvertFloatAndStrInstSet converter = new ConvertFloatAndStrInstSet();
	
	private StrAddInstSet strAddFunc = new StrAddInstSet();
	private RandomInstSet rand = new RandomInstSet();
	
	private List<Var> variable = new ArrayList<Var>();
	private FloatInputInstSet floatIn = new FloatInputInstSet();
	private List<ListVar> variableList = new ArrayList<ListVar>();
	
	private List<StrVar> strVariable = new ArrayList<StrVar>();
	private StrInputInstSet strIn = new StrInputInstSet();
	private RandomStrInstSet strRand = new RandomStrInstSet();
	
	public void executerMethod()
	{
		variable.add(new Var("abcdefghijklmnopqrstuvwxyzazertyuiopqsdfghjklmwxcvbn01234567897894561230_defaultvar_ghydusjhgduyhd",0.0F));
		strVariable.add(new StrVar("abcdefghijklmnopqrstuvwxyzazertyuiopqsdfghjklmwxcvbn01234567897894561230_defaultstrvar_ghydusjhgduyhd",""));
		variableList.add(new ListVar("abcdefghijklmnopqrstuvwxyzazertyuiopqsdfghjklmwxcvbn01234567897894561230_defaultvarlist_ghydusjhgduyhd", null));
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
			
			//pvar
			if(this.inst.equalsIgnoreCase("pvar"))
			{
				int isExist = 0;
				if(!(str.split(" ").length != 6 && str.split(" ").length != 8 && str.split(" ").length != 10))
				{
					for(Var var : variable)
					{
						if(str.split(" ").length == 6)
						{
							if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
							{
								isExist = 1;
							}
							if(str.split(" ")[2].equalsIgnoreCase(var.getName()))
							{
								isExist = 1;
							}
							if(!(str.split(" ")[3].equalsIgnoreCase("=")))
							{
								isExist = 1;
							}
						}
						if(str.split(" ").length == 8)
						{
							if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
							{
								isExist = 1;
							}
							if(str.split(" ")[2].equalsIgnoreCase(var.getName()))
							{
								isExist = 1;
							}
							if(str.split(" ")[3].equalsIgnoreCase(var.getName()))
							{
								isExist = 1;
							}
							if(!(str.split(" ")[4].equalsIgnoreCase("=")))
							{
								isExist = 1;
							}
						}
						if(str.split(" ").length == 10)
						{
							if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
							{
								isExist = 1;
							}
							if(str.split(" ")[2].equalsIgnoreCase(var.getName()))
							{
								isExist = 1;
							}
							if(str.split(" ")[3].equalsIgnoreCase(var.getName()))
							{
								isExist = 1;
							}
							if(str.split(" ")[4].equalsIgnoreCase(var.getName()))
							{
								isExist = 1;
							}
							if(!(str.split(" ")[5].equalsIgnoreCase("=")))
							{
								isExist = 1;
							}
						}
					}
				}
				else
				{
					isExist = 1;
				}
				if(isExist == 0)
				{
					if(str.split(" ").length == 6)
					{
						variable.add(new Var(str.split(" ")[1].toLowerCase(), Float.parseFloat(str.split(" ")[4])));
						variable.add(new Var(str.split(" ")[2].toLowerCase(), Float.parseFloat(str.split(" ")[5])));
					}
					if(str.split(" ").length == 8)
					{
						variable.add(new Var(str.split(" ")[1].toLowerCase(), Float.parseFloat(str.split(" ")[5])));
						variable.add(new Var(str.split(" ")[2].toLowerCase(), Float.parseFloat(str.split(" ")[6])));
						variable.add(new Var(str.split(" ")[3].toLowerCase(), Float.parseFloat(str.split(" ")[7])));
					}
					if(str.split(" ").length == 10)
					{
						variable.add(new Var(str.split(" ")[1].toLowerCase(), Float.parseFloat(str.split(" ")[6])));
						variable.add(new Var(str.split(" ")[2].toLowerCase(), Float.parseFloat(str.split(" ")[7])));
						variable.add(new Var(str.split(" ")[3].toLowerCase(), Float.parseFloat(str.split(" ")[8])));
						variable.add(new Var(str.split(" ")[4].toLowerCase(), Float.parseFloat(str.split(" ")[9])));
					}
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
										varstock.setValue(vara.getValue() + varb.getValue());
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
										varstock.setValue(vara.getValue() - varb.getValue());
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
										varstock.setValue(vara.getValue() * varb.getValue());
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
										varstock.setValue(vara.getValue() / varb.getValue());
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
										varstock.setValue(vara.getValue() % varb.getValue());
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
										varstock.setValue((vara.getValue() - (vara.getValue() % varb.getValue())) / varb.getValue());
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
						inst2 = inst2 + str.split(" ")[i] + " ";
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
						inst2 = inst2 + str.split(" ")[i] + "\n";
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
						var.setValue(strIn.strInput() + " ");
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
						var.setValue(strIn.cStrInput(msg)+ " ");
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
									String a = vara.getValue();
									String b = varb.getValue();
									if(a.equals(b))
									{
										index = Integer.parseInt(str.split(" ")[4]) - 2;
									}
								}
								if(str.split(" ")[2].equalsIgnoreCase("!="))
								{
									String a = vara.getValue();
									String b = varb.getValue();
									if(!a.equals(b))
									{
										index = Integer.parseInt(str.split(" ")[4]) - 2;
									}
								}
								if(str.split(" ")[2].equalsIgnoreCase("=!"))
								{
									String a = vara.getValue();
									String b = varb.getValue();
									if(!a.equals(b))
									{
										index = Integer.parseInt(str.split(" ")[4]) - 2;
									}
								}
							}
						}
					}
				}
			}
			
			//Convert float to str
			if(this.inst.equalsIgnoreCase("vartostr"))
			{
				for(Var var : variable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
					{
						for(StrVar strvar : strVariable)
						{
							if(str.split(" ")[2].equalsIgnoreCase(strvar.getName()))
							{
								strvar.setValue(converter.convertfs(var.getValue()));
							}
						}
					}
				}
			}
			//Convert str to float
			if(this.inst.equalsIgnoreCase("strtovar"))
			{
				for(Var var : variable)
				{
					if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
					{
						for(StrVar strvar : strVariable)
						{
							if(str.split(" ")[2].equalsIgnoreCase(strvar.getName()))
							{
								var.setValue(converter.convertsf(strvar.getValue()));
							}
						}
					}
				}
			}
			
			//varlist
			if(this.inst.equalsIgnoreCase("varlist"))
			{
				int isExist = 0;
				for(ListVar list : variableList)
				{
					if(str.split(" ")[1].equalsIgnoreCase(list.getName()))
					{
						isExist = 1;
					}
				}
				if(isExist == 0)
				{
					List<Float> templist = new ArrayList<Float>();
					for(int i = 2; i < str.split(" ").length; i++)
					{
						templist.add(Float.parseFloat(str.split(" ")[i]));
					}
					variableList.add(new ListVar(str.split(" ")[1], templist));
				}
			}
			//varlistset
			if(this.inst.equalsIgnoreCase("varlistset"))
			{
				for(ListVar list : variableList)
				{
					if(str.split(" ")[1].equalsIgnoreCase(list.getName()))
					{
						list.setInList(Integer.parseInt(str.split(" ")[2]), Float.parseFloat(str.split(" ")[3]));
					}
				}
			}
			//varlistsetall
			if(this.inst.equalsIgnoreCase("varlistsetall"))
			{
				for(ListVar list : variableList)
				{
					if(str.split(" ")[1].equalsIgnoreCase(list.getName()))
					{
						List<Float> templist = new ArrayList<Float>();
						for(int i = 2; i < str.split(" ").length; i++)
						{
							templist.add(Float.parseFloat(str.split(" ")[i]));
						}
						list.setAllInList(templist);
					}
				}
			}
			//varlistadd
			if(this.inst.equalsIgnoreCase("varlistadd"))
			{
				for(ListVar list : variableList)
				{
					if(str.split(" ")[1].equalsIgnoreCase(list.getName()))
					{
						list.addAtEndOfList(Float.parseFloat(str.split(" ")[2]));
					}
				}
			}
			
			//pset
			if(this.inst.equalsIgnoreCase("pset"))
			{
				int isP = 0;
				int isUse = 0; //=
				int isUse1 = 1;
				int isUse2 = 1;
				int isUse3 = 1;
				int isUse4 = 1;
				int isUse5 = 1;
				int isUse6 = 1;
				int isUse7 = 1;
				int isUse8 = 1;
				
				if(!(str.split(" ").length != 6 && str.split(" ").length != 8 && str.split(" ").length != 10))
				{
					for(Var var : variable)
					{
						if(str.split(" ").length == 6)
						{
							if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
							{
								isUse1 = 0;
							}
							if(str.split(" ")[2].equalsIgnoreCase(var.getName()))
							{
								isUse2 = 0;
							}
							if(!(str.split(" ")[3].equalsIgnoreCase("=")))
							{
								isUse = 1;
							}
							if(str.split(" ")[4].equalsIgnoreCase(var.getName()))
							{
								isUse3 = 0;
							}
							if(str.split(" ")[5].equalsIgnoreCase(var.getName()))
							{
								isUse4 = 0;
							}
							isUse5 = 0;
							isUse6 = 0;
							isUse7 = 0;
							isUse8 = 0;
						}
						if(str.split(" ").length == 8)
						{
							if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
							{
								isUse1 = 0;
							}
							if(str.split(" ")[2].equalsIgnoreCase(var.getName()))
							{
								isUse2 = 0;
							}
							if(str.split(" ")[3].equalsIgnoreCase(var.getName()))
							{
								isUse3 = 0;
							}
							if(!(str.split(" ")[4].equalsIgnoreCase("=")))
							{
								isUse = 1;
							}
							if(str.split(" ")[5].equalsIgnoreCase(var.getName()))
							{
								isUse4 = 0;
							}
							if(str.split(" ")[6].equalsIgnoreCase(var.getName()))
							{
								isUse5 = 0;
							}
							if(str.split(" ")[7].equalsIgnoreCase(var.getName()))
							{
								isUse6 = 0;
							}
							isUse7 = 0;
							isUse8 = 0;
						}
						if(str.split(" ").length == 10)
						{
							if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
							{
								isUse1 = 0;
							}
							if(str.split(" ")[2].equalsIgnoreCase(var.getName()))
							{
								isUse2 = 0;
							}
							if(str.split(" ")[3].equalsIgnoreCase(var.getName()))
							{
								isUse3 = 0;
							}
							if(str.split(" ")[4].equalsIgnoreCase(var.getName()))
							{
								isUse4 = 0;
							}
							if(!(str.split(" ")[5].equalsIgnoreCase("=")))
							{
								isUse = 1;
							}
							if(str.split(" ")[6].equalsIgnoreCase(var.getName()))
							{
								isUse5 = 0;
							}
							if(str.split(" ")[7].equalsIgnoreCase(var.getName()))
							{
								isUse6 = 0;
							}
							if(str.split(" ")[8].equalsIgnoreCase(var.getName()))
							{
								isUse7 = 0;
							}
							if(str.split(" ")[9].equalsIgnoreCase(var.getName()))
							{
								isUse8 = 0;
							}
						}
					}
				}
				else
				{
					isP = 1;
				}
				if(isUse == 0 && isP == 0 && isUse1 == 0 && isUse2 == 0 && isUse3 == 0 && isUse4 == 0 && isUse5 == 0 && isUse6 == 0 && isUse7 == 0 && isUse8 == 0)
				{
					float var1 = 0;
					float var2 = 0;
					float var3 = 0;
					float var4 = 0;
					for(Var var : variable)
					{
						if(str.split(" ").length == 6)
						{
							if(str.split(" ")[4].equalsIgnoreCase(var.getName()))
							{
								var1 = var.getValue();
							}
							if(str.split(" ")[5].equalsIgnoreCase(var.getName()))
							{
								var2 = var.getValue();
							}
						}
						if(str.split(" ").length == 8)
						{
							if(str.split(" ")[5].equalsIgnoreCase(var.getName()))
							{
								var1 = var.getValue();
							}
							if(str.split(" ")[6].equalsIgnoreCase(var.getName()))
							{
								var2 = var.getValue();
							}
							if(str.split(" ")[7].equalsIgnoreCase(var.getName()))
							{
								var3 = var.getValue();
							}
						}
						if(str.split(" ").length == 10)
						{
							if(str.split(" ")[6].equalsIgnoreCase(var.getName()))
							{
								var1 = var.getValue();
							}
							if(str.split(" ")[7].equalsIgnoreCase(var.getName()))
							{
								var2 = var.getValue();
							}
							if(str.split(" ")[8].equalsIgnoreCase(var.getName()))
							{
								var3 = var.getValue();
							}
							if(str.split(" ")[9].equalsIgnoreCase(var.getName()))
							{
								var4 = var.getValue();
							}
						}
					}
					for(Var var : variable)
					{
						if(str.split(" ").length == 6)
						{
							if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
							{
								var.setValue(var1);
							}
							if(str.split(" ")[2].equalsIgnoreCase(var.getName()))
							{
								var.setValue(var2);
							}
						}
						if(str.split(" ").length == 8)
						{
							if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
							{
								var.setValue(var1);
							}
							if(str.split(" ")[2].equalsIgnoreCase(var.getName()))
							{
								var.setValue(var2);
							}
							if(str.split(" ")[3].equalsIgnoreCase(var.getName()))
							{
								var.setValue(var3);
							}
						}
						if(str.split(" ").length == 10)
						{
							if(str.split(" ")[1].equalsIgnoreCase(var.getName()))
							{
								var.setValue(var1);
							}
							if(str.split(" ")[2].equalsIgnoreCase(var.getName()))
							{
								var.setValue(var2);
							}
							if(str.split(" ")[3].equalsIgnoreCase(var.getName()))
							{
								var.setValue(var3);
							}
							if(str.split(" ")[4].equalsIgnoreCase(var.getName()))
							{
								var.setValue(var4);
							}
						}
					}
				}
			}
			
			//varlistsize
			if(this.inst.equalsIgnoreCase("varlistsize"))
			{
				for(ListVar list : variableList)
				{
					if(str.split(" ")[1].equalsIgnoreCase(list.getName()))
					{
						for(Var var : variable)
						{
							if(str.split(" ")[2].equalsIgnoreCase(var.getName()))
							{
								var.setValue(list.getList().size());
							}
						}
					}
				}
			}
			//printvarlist
			if(this.inst.equalsIgnoreCase("printvarlist"))
			{
				for(ListVar list : variableList)
				{
					if(str.split(" ")[1].equalsIgnoreCase(list.getName()))
					{
						String out = "";
						for(int i = 0; i < list.getList().size(); i++)
						{
							out += list.getList().get(i).toString() + "\n";
						}
						print.print(out);
					}
				}
			}
			
			index++;
		}
	}
}
