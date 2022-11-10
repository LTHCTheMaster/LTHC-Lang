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
	private String[] splited;
	
	private final RandomInstSet rand = new RandomInstSet();
	
	private List<Var> variable = new ArrayList<Var>();
	private final FloatInputInstSet floatIn = new FloatInputInstSet();
	private List<ListVar> variableList = new ArrayList<ListVar>();
	
	private List<StrVar> strVariable = new ArrayList<StrVar>();
	private final StrInputInstSet strIn = new StrInputInstSet();
	private final RandomStrInstSet strRand = new RandomStrInstSet();
	
	private String inst2 = "";
	
	public Decomp() {
		// TODO Auto-generated constructor stub
	}
	
	public void executerMethod()
	{
		prgmdReader = null;
		int index = -1;
		while(index < prgm.size() - 1)
		{
			index++;
			str = prgm.get(index);
			splited = str.split(" ");
			inst = splited[0];
			//Print Instruction
			if(inst.equals("print"))
			{
				inst2 = "";
				for(short i = 1; i < splited.length; i++)
				{
					inst2 += splited[i] + " ";
				}
				inst2 = inst2.replace("$n", "\n");
				JOptionPane.showMessageDialog(null, inst2);
				continue;
			}
			//Print with line Instruction
			if(inst.equals("printl"))
			{
				inst2 = "";
				for(short i = 1; i < splited.length; i++)
				{
					inst2 += splited[i] + "\n";
				}
				JOptionPane.showMessageDialog(null, inst2);
				continue;
			}
			
			//Create Var
			if(inst.equals("var"))
			{
				byte isExist = 0;
				for(Var var : variable)
				{
					if(splited[1].equals(var.getName()))
					{
						isExist = 1;
						break;
					}
				}
				if(isExist == 0)
				{
					variable.add(new Var(splited[1].toLowerCase(), Float.parseFloat(splited[2])));
				}
				continue;
			}
			
			//pvar
			if(inst.equals("pvar"))
			{
				byte isExist = 0;
				if(!(splited.length != 6 && splited.length != 8 && splited.length != 10))
				{
					for(Var var : variable)
					{
						if(splited.length == 6)
						{
							if(splited[1].equals(var.getName()))
							{
								isExist = 1;
								break;
							}
							if(splited[2].equals(var.getName()))
							{
								isExist = 1;
								break;
							}
						}
						if(splited.length == 8)
						{
							if(splited[1].equals(var.getName()))
							{
								isExist = 1;
								break;
							}
							if(splited[2].equals(var.getName()))
							{
								isExist = 1;
								break;
							}
							if(splited[3].equals(var.getName()))
							{
								isExist = 1;
								break;
							}
						}
						if(splited.length == 10)
						{
							if(splited[1].equals(var.getName()))
							{
								isExist = 1;
								break;
							}
							if(splited[2].equals(var.getName()))
							{
								isExist = 1;
								break;
							}
							if(splited[3].equals(var.getName()))
							{
								isExist = 1;
								break;
							}
							if(splited[4].equals(var.getName()))
							{
								isExist = 1;
								break;
							}
						}
					}
					if(splited.length == 6 && !(splited[3].equals("=")))
					{
						isExist = 1;
						break;
					}
					if(splited.length == 8 && !(splited[4].equals("=")))
					{
						isExist = 1;
						break;
					}
					if(splited.length == 10 && !(splited[5].equals("=")))
					{
						isExist = 1;
					}
				}
				else
				{
					isExist = 1;
				}
				if(isExist == 0)
				{
					if(splited.length == 6)
					{
						variable.add(new Var(splited[1].toLowerCase(), Float.parseFloat(splited[4])));
						variable.add(new Var(splited[2].toLowerCase(), Float.parseFloat(splited[5])));
					}
					if(splited.length == 8)
					{
						variable.add(new Var(splited[1].toLowerCase(), Float.parseFloat(splited[5])));
						variable.add(new Var(splited[2].toLowerCase(), Float.parseFloat(splited[6])));
						variable.add(new Var(splited[3].toLowerCase(), Float.parseFloat(splited[7])));
					}
					if(splited.length == 10)
					{
						variable.add(new Var(splited[1].toLowerCase(), Float.parseFloat(splited[6])));
						variable.add(new Var(splited[2].toLowerCase(), Float.parseFloat(splited[7])));
						variable.add(new Var(splited[3].toLowerCase(), Float.parseFloat(splited[8])));
						variable.add(new Var(splited[4].toLowerCase(), Float.parseFloat(splited[9])));
					}
				}
				continue;
			}
			
			//PrintVar
			if(inst.equals("printvar"))
			{
				for(Var var : variable)
				{
					if(splited[1].equals(var.getName()))
					{
						JOptionPane.showMessageDialog(null, var.getValue());
						break;
					}
				}
				continue;
			}
			
			//Add
			if(inst.equals("add"))
			{
				for(Var varstock : variable)
				{
					if(splited[1].equals(varstock.getName()))
					{	
						for(Var vara : variable)
						{
							if(splited[2].equals(vara.getName()))
							{
								for(Var varb : variable)
								{
									if(splited[3].equals(varb.getName()))
									{
										varstock.setValue(vara.getValue() + varb.getValue());
										break;
									}
								}
								break;
							}
						}
						break;
					}
				}
				continue;
			}
			
			//Sub
			if(inst.equals("sub"))
			{
				for(Var varstock : variable)
				{
					if(splited[1].equals(varstock.getName()))
					{	
						for(Var vara : variable)
						{
							if(splited[2].equals(vara.getName()))
							{
								for(Var varb : variable)
								{
									if(splited[3].equals(varb.getName()))
									{
										varstock.setValue(vara.getValue() - varb.getValue());
										break;
									}
								}
								break;
							}
						}
						break;
					}
				}
				continue;
			}
			
			//Mult
			if(inst.equals("mult"))
			{
				for(Var varstock : variable)
				{
					if(splited[1].equals(varstock.getName()))
					{	
						for(Var vara : variable)
						{
							if(splited[2].equals(vara.getName()))
							{
								for(Var varb : variable)
								{
									if(splited[3].equals(varb.getName()))
									{
										varstock.setValue(vara.getValue() * varb.getValue());
										break;
									}
								}
								break;
							}
						}
						break;
					}
				}
				continue;
			}
			
			//Div
			if(inst.equals("div"))
			{
				for(Var varstock : variable)
				{
					if(splited[1].equals(varstock.getName()))
					{	
						for(Var vara : variable)
						{
							if(splited[2].equals(vara.getName()))
							{
								for(Var varb : variable)
								{
									if(splited[3].equals(varb.getName()))
									{
										varstock.setValue(vara.getValue() / varb.getValue());
										break;
									}
								}
								break;
							}
						}
						break;
					}
				}
				continue;
			}
			
			//Mod
			if(inst.equals("mod"))
			{
				for(Var varstock : variable)
				{
					if(splited[1].equals(varstock.getName()))
					{	
						for(Var vara : variable)
						{
							if(splited[2].equals(vara.getName()))
							{
								for(Var varb : variable)
								{
									if(splited[3].equals(varb.getName()))
									{
										varstock.setValue(vara.getValue() % varb.getValue());
										break;
									}
								}
								break;
							}
						}
						break;
					}
				}
				continue;
			}
			
			//EDiv
			if(inst.equals("ediv"))
			{
				for(Var varstock : variable)
				{
					if(splited[1].equals(varstock.getName()))
					{	
						for(Var vara : variable)
						{
							if(splited[2].equals(vara.getName()))
							{
								for(Var varb : variable)
								{
									if(splited[3].equals(varb.getName()))
									{
										varstock.setValue((vara.getValue() - (vara.getValue() % varb.getValue())) / varb.getValue());
										break;
									}
								}
								break;
							}
						}
						break;
					}
				}
				continue;
			}
			
			//Random Int Base
			if(inst.equals("irand"))
			{
				for(Var var : variable)
				{
					if(splited[1].equals(var.getName()))
					{
						var.setValue(rand.randomInt(Integer.parseInt(splited[2])));
						break;
					}
				}
				continue;
			}
			
			//Random Int Base With Adjust
			if(inst.equals("arand"))
			{
				for(Var var : variable)
				{
					if(splited[1].equals(var.getName()))
					{
						var.setValue(rand.randomInt(Integer.parseInt(splited[2]), Integer.parseInt(splited[3])));
						break;
					}
				}
				continue;
			}
			
			//Random Float 
			if(inst.equals("frand"))
			{
				for(Var var : variable)
				{
					if(splited[1].equals(var.getName()))
					{
						var.setValue(rand.randomFloat());
						break;
					}
				}
				continue;
			}
			
			//Float Input
			if(inst.equals("finput"))
			{
				for(Var var : variable)
				{
					if(splited[1].equals(var.getName()))
					{
						var.setValue(floatIn.floatInput());
						break;
					}
				}
				continue;
			}
			//Float Input with custom message
			if(inst.equals("mfinput"))
			{
				for(Var var : variable)
				{
					if(splited[1].equals(var.getName()))
					{
						inst2 = "";
						for(short i = 2; i < splited.length; i++)
						{
							inst2 += splited[i] + " ";
						}
						var.setValue(floatIn.cFloatInput(inst2));
						break;
					}
				}
				continue;
			}
			
			//Set
			if(inst.equals("set"))
			{
				for(Var var : variable)
				{
					if(splited[1].equals(var.getName()))
					{
						var.setValue(Float.parseFloat(splited[2]));
						break;
					}
				}
				continue;
			}
			
			//Str create
			if(inst.equals("str"))
			{
				byte isExist = 0;
				for(StrVar var : strVariable)
				{
					if(splited[1].equals(var.getName()))
					{
						isExist = 1;
						break;
					}
				}
				if(isExist == 0)
				{
					inst2 = "";
					for(short i = 2; i < splited.length; i++)
					{
						inst2 = inst2 + splited[i] + " ";
					}
					inst2 = inst2.replace("$n", "\n");
					strVariable.add(new StrVar(splited[1], inst2));
				}
				continue;
			}
			//Strl create
			if(inst.equals("strl"))
			{
				byte isExist = 0;
				for(StrVar var : strVariable)
				{
					if(splited[1].equals(var.getName()))
					{
						isExist = 1;
						break;
					}
				}
				if(isExist == 0)
				{
					inst2 = "";
					for(short i = 2; i < splited.length; i++)
					{
						inst2 = inst2 + splited[i] + "\n";
					}
					strVariable.add(new StrVar(splited[1], inst2));
				}
				continue;
			}
			
			//PrintStr
			if(inst.equals("printstr"))
			{
				for(StrVar var : strVariable)
				{
					if(splited[1].equals(var.getName()))
					{
						JOptionPane.showMessageDialog(null, var.getValue());
						break;
					}
				}
				continue;
			}
			
			//StrAdd
			if(inst.equals("stradd"))
			{
				for(StrVar varstock : strVariable)
				{
					if(splited[1].equals(varstock.getName()))
					{
						for(StrVar vara : strVariable)
						{
							if(splited[2].equals(vara.getName()))
							{	
								for(StrVar varb : strVariable)
								{
									if(splited[3].equals(varb.getName()))
									{
										varstock.setValue(vara.getValue() + varb.getValue());
										break;
									}
								}
								break;
							}
						}
						break;
					}
				}
				continue;
			}
				
			//Str Input
			if(inst.equals("sinput"))
			{
				for(StrVar var : strVariable)
				{
					if(splited[1].equals(var.getName()))
					{
						var.setValue(strIn.strInput() + " ");
						break;
					}
				}
				continue;
			}
			//Str Input with custom message
			if(inst.equals("msinput"))
			{
				for(StrVar var : strVariable)
				{
					if(splited[1].equals(var.getName()))
					{
						inst2 = "";
						for(short i = 2; i < splited.length; i++)
						{
							inst2 += splited[i] + " ";
						}
						var.setValue(strIn.cStrInput(inst2)+ " ");
						break;
					}
				}
				continue;
			}
			
			//SetStr
			if(inst.equals("setstr"))
			{
				for(StrVar var : strVariable)
				{
					if(splited[1].equals(var.getName()))
					{
						inst2 = "";
						for(short i = 2; i < splited.length; i++)
						{
							inst2 += splited[i] + " ";
						}
						inst2 = inst2.replace("$n", "\n");
						var.setValue(inst2);
						break;
					}
				}
				continue;
			}
			//SetStrl
			if(inst.equals("setstrl"))
			{
				for(StrVar var : strVariable)
				{
					if(splited[1].equals(var.getName()))
					{
						inst2 = "";
						for(short i = 2; i < splited.length; i++)
						{
							inst2 += splited[i] + "\n";
						}
						var.setValue(inst2);
						break;
					}
				}
				continue;
			}
			
			//Random Str
			if(inst.equals("strrand"))
			{
				for(StrVar var : strVariable)
				{
					if(splited[1].equals(var.getName()))
					{
						var.setValue(strRand.randStr());
						break;
					}
				}
				continue;
			}
			
			//Random Str with Size
			if(inst.equals("sstrrand"))
			{
				for(StrVar var : strVariable)
				{
					if(splited[1].equals(var.getName()))
					{
						var.setValue(strRand.sRandStr(Integer.parseInt(splited[2])));
						break;
					}
				}
				continue;
			}
			
			//Unconditional Jump
			if(inst.equals("jmp"))
			{
				index = Integer.parseInt(splited[1]) - 2;
				continue;
			}
			
			//Conditional Jump [on float]
			if(inst.equals("cjmp"))
			{
				for(Var vara : variable)
				{
					if(splited[1].equals(vara.getName()))
					{
						for(Var varb : variable)
						{
							if(splited[3].equals(varb.getName()))
							{
								if(splited[2].equals("="))
								{
									if(vara.getValue() == varb.getValue())
									{
										index = Integer.parseInt(splited[4]) - 2;
									}
									break;
								}
								if(splited[2].equals("<"))
								{
									if(vara.getValue() < varb.getValue())
									{
										index = Integer.parseInt(splited[4]) - 2;
									}
									break;
								}
								if(splited[2].equals(">"))
								{
									if(vara.getValue() > varb.getValue())
									{
										index = Integer.parseInt(splited[4]) - 2;
									}
									break;
								}
								if(splited[2].equals("!=") || splited[2].equals("=!"))
								{
									if(vara.getValue() != varb.getValue())
									{
										index = Integer.parseInt(splited[4]) - 2;
									}
									break;
								}
								if(splited[2].equals("<=") || splited[2].equals("=<"))
								{
									if(vara.getValue() <= varb.getValue())
									{
										index = Integer.parseInt(splited[4]) - 2;
									}
									break;
								}
								if(splited[2].equals(">=") || splited[2].equals("=>"))
								{
									if(vara.getValue() >= varb.getValue())
									{
										index = Integer.parseInt(splited[4]) - 2;
									}
									break;
								}
							}
						}
						break;
					}
				}
				continue;
			}
			
			//Conditional Jump [on str]
			if(inst.equals("csjmp"))
			{
				for(StrVar vara : strVariable)
				{
					if(splited[1].equals(vara.getName()))
					{
						for(StrVar varb : strVariable)
						{
							if(splited[3].equals(varb.getName()))
							{
								if(splited[2].equals("="))
								{
									String a = vara.getValue();
									String b = varb.getValue();
									if(a.equals(b))
									{
										index = Integer.parseInt(splited[4]) - 2;
									}
									break;
								}
								if(splited[2].equals("!="))
								{
									String a = vara.getValue();
									String b = varb.getValue();
									if(!a.equals(b))
									{
										index = Integer.parseInt(splited[4]) - 2;
									}
									break;
								}
								if(splited[2].equals("=!"))
								{
									String a = vara.getValue();
									String b = varb.getValue();
									if(!a.equals(b))
									{
										index = Integer.parseInt(splited[4]) - 2;
									}
									break;
								}
							}
						}
						break;
					}
				}
				continue;
			}
			
			//Convert float to str
			if(inst.equals("vartostr"))
			{
				for(Var var : variable)
				{
					if(splited[1].equals(var.getName()))
					{
						for(StrVar strvar : strVariable)
						{
							if(splited[2].equals(strvar.getName()))
							{
								strvar.setValue(var.getValueStr());
								break;
							}
						}
						break;
					}
				}
				continue;
			}
			//Convert str to float
			if(inst.equals("strtovar"))
			{
				for(Var var : variable)
				{
					if(splited[1].equals(var.getName()))
					{
						for(StrVar strvar : strVariable)
						{
							if(splited[2].equals(strvar.getName()))
							{
								var.setValue(Float.parseFloat(strvar.getValue()));
								break;
							}
						}
						break;
					}
				}
				continue;
			}
			
			//varlist
			if(inst.equals("varlist"))
			{
				byte isExist = 0;
				for(ListVar list : variableList)
				{
					if(splited[1].equals(list.getName()))
					{
						isExist = 1;
						break;
					}
				}
				if(isExist == 0)
				{
					List<Float> templist = new ArrayList<Float>();
					for(short i = 2; i < splited.length; i++)
					{
						templist.add(Float.parseFloat(splited[i]));
					}
					variableList.add(new ListVar(splited[1], templist));
				}
				continue;
			}
			//varlistset
			if(inst.equals("varlistset"))
			{
				for(ListVar list : variableList)
				{
					if(splited[1].equals(list.getName()))
					{
						list.setInList(Integer.parseInt(splited[2]), Float.parseFloat(splited[3]));
						break;
					}
				}
				continue;
			}
			//varlistsetall
			if(inst.equals("varlistsetall"))
			{
				for(ListVar list : variableList)
				{
					if(splited[1].equals(list.getName()))
					{
						List<Float> templist = new ArrayList<Float>();
						for(short i = 2; i < splited.length; i++)
						{
							templist.add(Float.parseFloat(splited[i]));
						}
						list.setAllInList(templist);
						break;
					}
				}
				continue;
			}
			//varlistadd
			if(inst.equals("varlistadd"))
			{
				for(ListVar list : variableList)
				{
					if(splited[1].equals(list.getName()))
					{
						list.addAtEndOfList(Float.parseFloat(splited[2]));
						break;
					}
				}
				continue;
			}
			//varlistaddv
			if(inst.equals("varlistaddv"))
			{
				for(ListVar list : variableList)
				{
					if(splited[1].equals(list.getName()))
					{
						for(Var var : variable)
						{
							if(splited[2].equals(var.getName()))
							{
								list.addAtEndOfList(var.getValue());
								break;
							}
						}
						break;
					}
				}
				continue;
			}
			//varlistremoveat
			if(inst.equals("varlistremoveat"))
			{
				for(ListVar list : variableList)
				{
					if(splited[1].equals(list.getName()))
					{
						list.removeAt(Integer.parseInt(splited[2]));
						break;
					}
				}
				continue;
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
				
				if(!(splited.length != 6 && splited.length != 8 && splited.length != 10))
				{
					for(Var var : variable)
					{
						if(splited.length == 6)
						{
							if(splited[1].equals(var.getName()))
							{
								isUse1 = 0;
							}
							if(splited[2].equals(var.getName()))
							{
								isUse2 = 0;
							}
							if(!(splited[3].equals("=")))
							{
								isUse = 1;
							}
							if(splited[4].equals(var.getName()))
							{
								isUse3 = 0;
							}
							if(splited[5].equals(var.getName()))
							{
								isUse4 = 0;
							}
							isUse5 = 0;
							isUse6 = 0;
							isUse7 = 0;
							isUse8 = 0;
						}
						if(splited.length == 8)
						{
							if(splited[1].equals(var.getName()))
							{
								isUse1 = 0;
							}
							if(splited[2].equals(var.getName()))
							{
								isUse2 = 0;
							}
							if(splited[3].equals(var.getName()))
							{
								isUse3 = 0;
							}
							if(!(splited[4].equals("=")))
							{
								isUse = 1;
							}
							if(splited[5].equals(var.getName()))
							{
								isUse4 = 0;
							}
							if(splited[6].equals(var.getName()))
							{
								isUse5 = 0;
							}
							if(splited[7].equals(var.getName()))
							{
								isUse6 = 0;
							}
							isUse7 = 0;
							isUse8 = 0;
						}
						if(splited.length == 10)
						{
							if(splited[1].equals(var.getName()))
							{
								isUse1 = 0;
							}
							if(splited[2].equals(var.getName()))
							{
								isUse2 = 0;
							}
							if(splited[3].equals(var.getName()))
							{
								isUse3 = 0;
							}
							if(splited[4].equals(var.getName()))
							{
								isUse4 = 0;
							}
							if(!(splited[5].equals("=")))
							{
								isUse = 1;
							}
							if(splited[6].equals(var.getName()))
							{
								isUse5 = 0;
							}
							if(splited[7].equals(var.getName()))
							{
								isUse6 = 0;
							}
							if(splited[8].equals(var.getName()))
							{
								isUse7 = 0;
							}
							if(splited[9].equals(var.getName()))
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
						if(splited.length == 6)
						{
							if(splited[4].equals(var.getName()))
							{
								var1 = var.getValue();
							}
							if(splited[5].equals(var.getName()))
							{
								var2 = var.getValue();
							}
						}
						if(splited.length == 8)
						{
							if(splited[5].equals(var.getName()))
							{
								var1 = var.getValue();
							}
							if(splited[6].equals(var.getName()))
							{
								var2 = var.getValue();
							}
							if(splited[7].equals(var.getName()))
							{
								var3 = var.getValue();
							}
						}
						if(splited.length == 10)
						{
							if(splited[6].equals(var.getName()))
							{
								var1 = var.getValue();
							}
							if(splited[7].equals(var.getName()))
							{
								var2 = var.getValue();
							}
							if(splited[8].equals(var.getName()))
							{
								var3 = var.getValue();
							}
							if(splited[9].equals(var.getName()))
							{
								var4 = var.getValue();
							}
						}
					}
					for(Var var : variable)
					{
						if(splited.length == 6)
						{
							if(splited[1].equals(var.getName()))
							{
								var.setValue(var1);
							}
							if(splited[2].equals(var.getName()))
							{
								var.setValue(var2);
							}
						}
						if(splited.length == 8)
						{
							if(splited[1].equals(var.getName()))
							{
								var.setValue(var1);
							}
							if(splited[2].equals(var.getName()))
							{
								var.setValue(var2);
							}
							if(splited[3].equals(var.getName()))
							{
								var.setValue(var3);
							}
						}
						if(splited.length == 10)
						{
							if(splited[1].equals(var.getName()))
							{
								var.setValue(var1);
							}
							if(splited[2].equals(var.getName()))
							{
								var.setValue(var2);
							}
							if(splited[3].equals(var.getName()))
							{
								var.setValue(var3);
							}
							if(splited[4].equals(var.getName()))
							{
								var.setValue(var4);
							}
						}
					}
				}
				continue;
			}
			
			//varlistsize
			if(inst.equals("varlistsize"))
			{
				for(ListVar list : variableList)
				{
					if(splited[1].equals(list.getName()))
					{
						for(Var var : variable)
						{
							if(splited[2].equals(var.getName()))
							{
								var.setValue(list.getList().size());
								break;
							}
						}
						break;
					}
				}
				continue;
			}
			//printvarlist
			if(inst.equals("printvarlist"))
			{
				for(ListVar list : variableList)
				{
					if(splited[1].equals(list.getName()))
					{
						String out = "";
						for(short i = 0; i < list.getList().size(); i++)
						{
							out += list.getList().get(i).toString() + "\n";
						}
						JOptionPane.showMessageDialog(null, out);
						break;
					}
				}
				continue;
			}
		}
	}
}