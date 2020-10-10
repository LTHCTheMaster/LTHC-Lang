package lthclang;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import lthclang.basicinst.numinst.FloatInputInstSet;
import lthclang.basicinst.numinst.RandomInstSet;
import lthclang.basicinst.strinst.RandomStrInstSet;
import lthclang.basicinst.strinst.StrInputInstSet;
import lthclang.var.number.ListVar;
import lthclang.var.number.Var;
import lthclang.var.str.StrVar;

public class Decomp
{
	private Reader prgmdReader = new Reader();
	private final List<String> prgm = prgmdReader.getPrgm();
	private String inst;
	private String str;
	
	private final RandomInstSet rand = new RandomInstSet();
	
	private List<Var> variable = new ArrayList<Var>();
	private final FloatInputInstSet floatIn = new FloatInputInstSet();
	private List<ListVar> variableList = new ArrayList<ListVar>();
	
	private List<StrVar> strVariable = new ArrayList<StrVar>();
	private final StrInputInstSet strIn = new StrInputInstSet();
	private final RandomStrInstSet strRand = new RandomStrInstSet();
	
	private String inst2 = "";
	
	public void executerMethod()
	{
		prgmdReader = null;
		int index = 0;
		while(index < prgm.size())
		{
			str = prgm.get(index);
			inst = str.split(" ")[0].toLowerCase();
			//Print Instruction
			if(inst.equals("print"))
			{
				inst2 = "";
				for(short i = 1; i < str.split(" ").length; i++)
				{
					inst2 += str.split(" ")[i] + " ";
				}
				JOptionPane.showMessageDialog(null, inst2);
			}
			//Print with line Instruction
			if(inst.equals("printl"))
			{
				inst2 = "";
				for(short i = 1; i < str.split(" ").length; i++)
				{
					inst2 += str.split(" ")[i] + "\n";
				}
				JOptionPane.showMessageDialog(null, inst2);
			}
			
			//Create Var
			if(inst.equals("var"))
			{
				byte isExist = 0;
				for(Var var : variable)
				{
					if(str.split(" ")[1].equals(var.getName()))
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
			if(inst.equals("pvar"))
			{
				byte isExist = 0;
				if(!(str.split(" ").length != 6 && str.split(" ").length != 8 && str.split(" ").length != 10))
				{
					for(Var var : variable)
					{
						if(str.split(" ").length == 6)
						{
							if(str.split(" ")[1].equals(var.getName()))
							{
								isExist = 1;
							}
							if(str.split(" ")[2].equals(var.getName()))
							{
								isExist = 1;
							}
							if(!(str.split(" ")[3].equals("=")))
							{
								isExist = 1;
							}
						}
						if(str.split(" ").length == 8)
						{
							if(str.split(" ")[1].equals(var.getName()))
							{
								isExist = 1;
							}
							if(str.split(" ")[2].equals(var.getName()))
							{
								isExist = 1;
							}
							if(str.split(" ")[3].equals(var.getName()))
							{
								isExist = 1;
							}
							if(!(str.split(" ")[4].equals("=")))
							{
								isExist = 1;
							}
						}
						if(str.split(" ").length == 10)
						{
							if(str.split(" ")[1].equals(var.getName()))
							{
								isExist = 1;
							}
							if(str.split(" ")[2].equals(var.getName()))
							{
								isExist = 1;
							}
							if(str.split(" ")[3].equals(var.getName()))
							{
								isExist = 1;
							}
							if(str.split(" ")[4].equals(var.getName()))
							{
								isExist = 1;
							}
							if(!(str.split(" ")[5].equals("=")))
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
			if(inst.equals("printvar"))
			{
				for(Var var : variable)
				{
					if(str.split(" ")[1].equals(var.getName()))
					{
						JOptionPane.showMessageDialog(null, var.getValue());
					}
				}
			}
			
			//Add
			if(inst.equals("add"))
			{
				for(Var varstock : variable)
				{
					if(str.split(" ")[1].equals(varstock.getName()))
					{	
						for(Var vara : variable)
						{
							if(str.split(" ")[2].equals(vara.getName()))
							{
								for(Var varb : variable)
								{
									if(str.split(" ")[3].equals(varb.getName()))
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
			if(inst.equals("sub"))
			{
				for(Var varstock : variable)
				{
					if(str.split(" ")[1].equals(varstock.getName()))
					{	
						for(Var vara : variable)
						{
							if(str.split(" ")[2].equals(vara.getName()))
							{
								for(Var varb : variable)
								{
									if(str.split(" ")[3].equals(varb.getName()))
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
			if(inst.equals("mult"))
			{
				for(Var varstock : variable)
				{
					if(str.split(" ")[1].equals(varstock.getName()))
					{	
						for(Var vara : variable)
						{
							if(str.split(" ")[2].equals(vara.getName()))
							{
								for(Var varb : variable)
								{
									if(str.split(" ")[3].equals(varb.getName()))
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
			if(inst.equals("div"))
			{
				for(Var varstock : variable)
				{
					if(str.split(" ")[1].equals(varstock.getName()))
					{	
						for(Var vara : variable)
						{
							if(str.split(" ")[2].equals(vara.getName()))
							{
								for(Var varb : variable)
								{
									if(str.split(" ")[3].equals(varb.getName()))
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
			if(inst.equals("mod"))
			{
				for(Var varstock : variable)
				{
					if(str.split(" ")[1].equals(varstock.getName()))
					{	
						for(Var vara : variable)
						{
							if(str.split(" ")[2].equals(vara.getName()))
							{
								for(Var varb : variable)
								{
									if(str.split(" ")[3].equals(varb.getName()))
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
			if(inst.equals("ediv"))
			{
				for(Var varstock : variable)
				{
					if(str.split(" ")[1].equals(varstock.getName()))
					{	
						for(Var vara : variable)
						{
							if(str.split(" ")[2].equals(vara.getName()))
							{
								for(Var varb : variable)
								{
									if(str.split(" ")[3].equals(varb.getName()))
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
			if(inst.equals("irand"))
			{
				for(Var var : variable)
				{
					if(str.split(" ")[1].equals(var.getName()))
					{
						var.setValue(rand.randomInt(Integer.parseInt(str.split(" ")[2])));
					}
				}
			}
			
			//Random Int Base With Adjust
			if(inst.equals("arand"))
			{
				for(Var var : variable)
				{
					if(str.split(" ")[1].equals(var.getName()))
					{
						var.setValue(rand.randomInt(Integer.parseInt(str.split(" ")[2]), Integer.parseInt(str.split(" ")[3])));
					}
				}
			}
			
			//Random Float 
			if(inst.equals("frand"))
			{
				for(Var var : variable)
				{
					if(str.split(" ")[1].equals(var.getName()))
					{
						var.setValue(rand.randomFloat());
					}
				}
			}
			
			//Float Input
			if(inst.equals("finput"))
			{
				for(Var var : variable)
				{
					if(str.split(" ")[1].equals(var.getName()))
					{
						var.setValue(floatIn.floatInput());
					}
				}
			}
			//Float Input with custom message
			if(inst.equals("mfinput"))
			{
				for(Var var : variable)
				{
					if(str.split(" ")[1].equals(var.getName()))
					{
						inst2 = "";
						for(short i = 2; i < str.split(" ").length; i++)
						{
							inst2 += str.split(" ")[i] + " ";
						}
						var.setValue(floatIn.cFloatInput(inst2));
					}
				}
			}
			
			//Set
			if(inst.equals("set"))
			{
				for(Var var : variable)
				{
					if(str.split(" ")[1].equals(var.getName()))
					{
						var.setValue(Float.parseFloat(str.split(" ")[2]));
					}
				}
			}
			
			//Str create
			if(inst.equals("str"))
			{
				byte isExist = 0;
				for(StrVar var : strVariable)
				{
					if(str.split(" ")[1].equals(var.getName()))
					{
						isExist = 1;
					}
				}
				if(isExist == 0)
				{
					inst2 = "";
					for(short i = 2; i < str.split(" ").length; i++)
					{
						inst2 = inst2 + str.split(" ")[i] + " ";
					}
					strVariable.add(new StrVar(str.split(" ")[1], inst2));
				}
			}
			//Strl create
			if(inst.equals("strl"))
			{
				byte isExist = 0;
				for(StrVar var : strVariable)
				{
					if(str.split(" ")[1].equals(var.getName()))
					{
						isExist = 1;
					}
				}
				if(isExist == 0)
				{
					inst2 = "";
					for(short i = 2; i < str.split(" ").length; i++)
					{
						inst2 = inst2 + str.split(" ")[i] + "\n";
					}
					strVariable.add(new StrVar(str.split(" ")[1], inst2));
				}
			}
			
			//PrintStr
			if(inst.equals("printstr"))
			{
				for(StrVar var : strVariable)
				{
					if(str.split(" ")[1].equals(var.getName()))
					{
						JOptionPane.showMessageDialog(null, var.getValue());
					}
				}
			}
			
			//StrAdd
			if(inst.equals("stradd"))
			{
				for(StrVar varstock : strVariable)
				{
					if(str.split(" ")[1].equals(varstock.getName()))
					{
						for(StrVar vara : strVariable)
						{
							if(str.split(" ")[2].equals(vara.getName()))
							{	
								for(StrVar varb : strVariable)
								{
									if(str.split(" ")[3].equals(varb.getName()))
									{
										varstock.setValue(vara.getValue() + varb.getValue());
									}
								}
							}
						}
					}
				}
			}
				
			//Str Input
			if(inst.equals("sinput"))
			{
				for(StrVar var : strVariable)
				{
					if(str.split(" ")[1].equals(var.getName()))
					{
						var.setValue(strIn.strInput() + " ");
					}
				}
			}
			//Str Input with custom message
			if(inst.equals("msinput"))
			{
				for(StrVar var : strVariable)
				{
					if(str.split(" ")[1].equals(var.getName()))
					{
						inst2 = "";
						for(short i = 2; i < str.split(" ").length; i++)
						{
							inst2 += str.split(" ")[i] + " ";
						}
						var.setValue(strIn.cStrInput(inst2)+ " ");
					}
				}
			}
			
			//SetStr
			if(inst.equals("setstr"))
			{
				for(StrVar var : strVariable)
				{
					if(str.split(" ")[1].equals(var.getName()))
					{
						inst2 = "";
						for(short i = 2; i < str.split(" ").length; i++)
						{
							inst2 += str.split(" ")[i] + " ";
						}
						var.setValue(inst2);
					}
				}
			}
			//SetStrl
			if(inst.equals("setstrl"))
			{
				for(StrVar var : strVariable)
				{
					if(str.split(" ")[1].equals(var.getName()))
					{
						inst2 = "";
						for(short i = 2; i < str.split(" ").length; i++)
						{
							inst2 += str.split(" ")[i] + "\n";
						}
						var.setValue(inst2);
					}
				}
			}
			
			//Random Str
			if(inst.equals("strrand"))
			{
				for(StrVar var : strVariable)
				{
					if(str.split(" ")[1].equals(var.getName()))
					{
						var.setValue(strRand.randStr());
					}
				}
			}
			
			//Random Str with Size
			if(inst.equals("sstrrand"))
			{
				for(StrVar var : strVariable)
				{
					if(str.split(" ")[1].equals(var.getName()))
					{
						var.setValue(strRand.sRandStr(Integer.parseInt(str.split(" ")[2])));
					}
				}
			}
			
			//Unconditional Jump
			if(inst.equals("jmp"))
			{
				index = Integer.parseInt(str.split(" ")[1]) - 2;
			}
			
			//Conditional Jump [on float]
			if(inst.equals("cjmp"))
			{
				for(Var vara : variable)
				{
					if(str.split(" ")[1].equals(vara.getName()))
					{
						for(Var varb : variable)
						{
							if(str.split(" ")[3].equals(varb.getName()))
							{
								if(str.split(" ")[2].equals("="))
								{
									if(vara.getValue() == varb.getValue())
									{
										index = Integer.parseInt(str.split(" ")[4]) - 2;
									}
								}
								if(str.split(" ")[2].equals("<"))
								{
									if(vara.getValue() < varb.getValue())
									{
										index = Integer.parseInt(str.split(" ")[4]) - 2;
									}
								}
								if(str.split(" ")[2].equals(">"))
								{
									if(vara.getValue() > varb.getValue())
									{
										index = Integer.parseInt(str.split(" ")[4]) - 2;
									}
								}
								if(str.split(" ")[2].equals("!=") || str.split(" ")[2].equals("=!"))
								{
									if(vara.getValue() != varb.getValue())
									{
										index = Integer.parseInt(str.split(" ")[4]) - 2;
									}
								}
								if(str.split(" ")[2].equals("<=") || str.split(" ")[2].equals("=<"))
								{
									if(vara.getValue() <= varb.getValue())
									{
										index = Integer.parseInt(str.split(" ")[4]) - 2;
									}
								}
								if(str.split(" ")[2].equals(">=") || str.split(" ")[2].equals("=>"))
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
			if(inst.equals("csjmp"))
			{
				for(StrVar vara : strVariable)
				{
					if(str.split(" ")[1].equals(vara.getName()))
					{
						for(StrVar varb : strVariable)
						{
							if(str.split(" ")[3].equals(varb.getName()))
							{
								if(str.split(" ")[2].equals("="))
								{
									String a = vara.getValue();
									String b = varb.getValue();
									if(a.equals(b))
									{
										index = Integer.parseInt(str.split(" ")[4]) - 2;
									}
								}
								if(str.split(" ")[2].equals("!="))
								{
									String a = vara.getValue();
									String b = varb.getValue();
									if(!a.equals(b))
									{
										index = Integer.parseInt(str.split(" ")[4]) - 2;
									}
								}
								if(str.split(" ")[2].equals("=!"))
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
			if(inst.equals("vartostr"))
			{
				for(Var var : variable)
				{
					if(str.split(" ")[1].equals(var.getName()))
					{
						for(StrVar strvar : strVariable)
						{
							if(str.split(" ")[2].equals(strvar.getName()))
							{
								strvar.setValue(var.getValueStr());
							}
						}
					}
				}
			}
			//Convert str to float
			if(inst.equals("strtovar"))
			{
				for(Var var : variable)
				{
					if(str.split(" ")[1].equals(var.getName()))
					{
						for(StrVar strvar : strVariable)
						{
							if(str.split(" ")[2].equals(strvar.getName()))
							{
								var.setValue(Float.parseFloat(strvar.getValue()));
							}
						}
					}
				}
			}
			
			//varlist
			if(inst.equals("varlist"))
			{
				byte isExist = 0;
				for(ListVar list : variableList)
				{
					if(str.split(" ")[1].equals(list.getName()))
					{
						isExist = 1;
					}
				}
				if(isExist == 0)
				{
					List<Float> templist = new ArrayList<Float>();
					for(short i = 2; i < str.split(" ").length; i++)
					{
						templist.add(Float.parseFloat(str.split(" ")[i]));
					}
					variableList.add(new ListVar(str.split(" ")[1], templist));
				}
			}
			//varlistset
			if(inst.equals("varlistset"))
			{
				for(ListVar list : variableList)
				{
					if(str.split(" ")[1].equals(list.getName()))
					{
						list.setInList(Integer.parseInt(str.split(" ")[2]), Float.parseFloat(str.split(" ")[3]));
					}
				}
			}
			//varlistsetall
			if(inst.equals("varlistsetall"))
			{
				for(ListVar list : variableList)
				{
					if(str.split(" ")[1].equals(list.getName()))
					{
						List<Float> templist = new ArrayList<Float>();
						for(short i = 2; i < str.split(" ").length; i++)
						{
							templist.add(Float.parseFloat(str.split(" ")[i]));
						}
						list.setAllInList(templist);
					}
				}
			}
			//varlistadd
			if(inst.equals("varlistadd"))
			{
				for(ListVar list : variableList)
				{
					if(str.split(" ")[1].equals(list.getName()))
					{
						list.addAtEndOfList(Float.parseFloat(str.split(" ")[2]));
					}
				}
			}
			//varlistaddv
			if(inst.equals("varlistaddv"))
			{
				for(ListVar list : variableList)
				{
					if(str.split(" ")[1].equals(list.getName()))
					{
						for(Var var : variable)
						{
							if(str.split(" ")[2].equals(var.getName()))
							{
								list.addAtEndOfList(var.getValue());
							}
						}
					}
				}
			}
			//varlistremoveat
			if(inst.equals("varlistremove"))
			{
				for(ListVar list : variableList)
				{
					if(str.split(" ")[1].equals(list.getName()))
					{
						list.removeAt(Integer.parseInt(str.split(" ")[2]));
					}
				}
			}
			
			//pset
			if(inst.equals("pset"))
			{
				byte isP = 0;
				byte isUse = 0; //=
				byte isUse1 = 1;
				byte isUse2 = 1;
				byte isUse3 = 1;
				byte isUse4 = 1;
				byte isUse5 = 1;
				byte isUse6 = 1;
				byte isUse7 = 1;
				byte isUse8 = 1;
				
				if(!(str.split(" ").length != 6 && str.split(" ").length != 8 && str.split(" ").length != 10))
				{
					for(Var var : variable)
					{
						if(str.split(" ").length == 6)
						{
							if(str.split(" ")[1].equals(var.getName()))
							{
								isUse1 = 0;
							}
							if(str.split(" ")[2].equals(var.getName()))
							{
								isUse2 = 0;
							}
							if(!(str.split(" ")[3].equals("=")))
							{
								isUse = 1;
							}
							if(str.split(" ")[4].equals(var.getName()))
							{
								isUse3 = 0;
							}
							if(str.split(" ")[5].equals(var.getName()))
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
							if(str.split(" ")[1].equals(var.getName()))
							{
								isUse1 = 0;
							}
							if(str.split(" ")[2].equals(var.getName()))
							{
								isUse2 = 0;
							}
							if(str.split(" ")[3].equals(var.getName()))
							{
								isUse3 = 0;
							}
							if(!(str.split(" ")[4].equals("=")))
							{
								isUse = 1;
							}
							if(str.split(" ")[5].equals(var.getName()))
							{
								isUse4 = 0;
							}
							if(str.split(" ")[6].equals(var.getName()))
							{
								isUse5 = 0;
							}
							if(str.split(" ")[7].equals(var.getName()))
							{
								isUse6 = 0;
							}
							isUse7 = 0;
							isUse8 = 0;
						}
						if(str.split(" ").length == 10)
						{
							if(str.split(" ")[1].equals(var.getName()))
							{
								isUse1 = 0;
							}
							if(str.split(" ")[2].equals(var.getName()))
							{
								isUse2 = 0;
							}
							if(str.split(" ")[3].equals(var.getName()))
							{
								isUse3 = 0;
							}
							if(str.split(" ")[4].equals(var.getName()))
							{
								isUse4 = 0;
							}
							if(!(str.split(" ")[5].equals("=")))
							{
								isUse = 1;
							}
							if(str.split(" ")[6].equals(var.getName()))
							{
								isUse5 = 0;
							}
							if(str.split(" ")[7].equals(var.getName()))
							{
								isUse6 = 0;
							}
							if(str.split(" ")[8].equals(var.getName()))
							{
								isUse7 = 0;
							}
							if(str.split(" ")[9].equals(var.getName()))
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
							if(str.split(" ")[4].equals(var.getName()))
							{
								var1 = var.getValue();
							}
							if(str.split(" ")[5].equals(var.getName()))
							{
								var2 = var.getValue();
							}
						}
						if(str.split(" ").length == 8)
						{
							if(str.split(" ")[5].equals(var.getName()))
							{
								var1 = var.getValue();
							}
							if(str.split(" ")[6].equals(var.getName()))
							{
								var2 = var.getValue();
							}
							if(str.split(" ")[7].equals(var.getName()))
							{
								var3 = var.getValue();
							}
						}
						if(str.split(" ").length == 10)
						{
							if(str.split(" ")[6].equals(var.getName()))
							{
								var1 = var.getValue();
							}
							if(str.split(" ")[7].equals(var.getName()))
							{
								var2 = var.getValue();
							}
							if(str.split(" ")[8].equals(var.getName()))
							{
								var3 = var.getValue();
							}
							if(str.split(" ")[9].equals(var.getName()))
							{
								var4 = var.getValue();
							}
						}
					}
					for(Var var : variable)
					{
						if(str.split(" ").length == 6)
						{
							if(str.split(" ")[1].equals(var.getName()))
							{
								var.setValue(var1);
							}
							if(str.split(" ")[2].equals(var.getName()))
							{
								var.setValue(var2);
							}
						}
						if(str.split(" ").length == 8)
						{
							if(str.split(" ")[1].equals(var.getName()))
							{
								var.setValue(var1);
							}
							if(str.split(" ")[2].equals(var.getName()))
							{
								var.setValue(var2);
							}
							if(str.split(" ")[3].equals(var.getName()))
							{
								var.setValue(var3);
							}
						}
						if(str.split(" ").length == 10)
						{
							if(str.split(" ")[1].equals(var.getName()))
							{
								var.setValue(var1);
							}
							if(str.split(" ")[2].equals(var.getName()))
							{
								var.setValue(var2);
							}
							if(str.split(" ")[3].equals(var.getName()))
							{
								var.setValue(var3);
							}
							if(str.split(" ")[4].equals(var.getName()))
							{
								var.setValue(var4);
							}
						}
					}
				}
			}
			
			//varlistsize
			if(inst.equals("varlistsize"))
			{
				for(ListVar list : variableList)
				{
					if(str.split(" ")[1].equals(list.getName()))
					{
						for(Var var : variable)
						{
							if(str.split(" ")[2].equals(var.getName()))
							{
								var.setValue(list.getList().size());
							}
						}
					}
				}
			}
			//printvarlist
			if(inst.equals("printvarlist"))
			{
				for(ListVar list : variableList)
				{
					if(str.split(" ")[1].equals(list.getName()))
					{
						String out = "";
						for(short i = 0; i < list.getList().size(); i++)
						{
							out += list.getList().get(i).toString() + "\n";
						}
						JOptionPane.showMessageDialog(null, out);
					}
				}
			}
			
			index++;
		}
	}
}
