package lthclang;

import java.util.List;

import lthclang.basicinst.PrintInstSet;
import lthclang.basicinst.numinst.AddInstSet;
import lthclang.basicinst.numinst.FloatInputInstSet;
import lthclang.basicinst.strinst.StrAddInstSet;
import lthclang.basicinst.strinst.StrInputInstSet;
import lthclang.var.number.AVarInstSet;
import lthclang.var.number.BVarInstSet;
import lthclang.var.number.CVarInstSet;
import lthclang.var.number.DVarInstSet;
import lthclang.var.number.EVarInstSet;
import lthclang.var.number.FVarInstSet;
import lthclang.var.str.StrDeuxVarInstSet;
import lthclang.var.str.StrTroisVarInstSet;
import lthclang.var.str.StrUnVarInstSet;

public class Decomp
{
	private Reader prgmdReader = new Reader();
	private List<String> prgm = prgmdReader.getPrgm();
	private PrintInstSet print = new PrintInstSet();
	private String inst;
	private String str;
	
	private AddInstSet addFunc = new AddInstSet();
	private StrAddInstSet strAddFunc = new StrAddInstSet();
	
	private AVarInstSet variableA = new AVarInstSet();
	private BVarInstSet variableB = new BVarInstSet();
	private CVarInstSet variableC = new CVarInstSet();
	private DVarInstSet variableD = new DVarInstSet();
	private EVarInstSet variableE = new EVarInstSet();
	private FVarInstSet variableF = new FVarInstSet();
	private FloatInputInstSet floatIn = new FloatInputInstSet();
	
	private StrUnVarInstSet str1 = new StrUnVarInstSet();
	private StrDeuxVarInstSet str2 = new StrDeuxVarInstSet();
	private StrTroisVarInstSet str3 = new StrTroisVarInstSet();
	private StrInputInstSet strIn = new StrInputInstSet();
	
	public void executerMethod()
	{
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
			
			//Set AVar Instruction
			if(this.inst.equalsIgnoreCase("ato"))
			{
				variableA.setAVar(Float.parseFloat(str.split(" ")[1]));
			}
			//Print AVar Instruction
			if(this.inst.equalsIgnoreCase("printavar"))
			{
				print.print(variableA.getAVarStr());
			}
			//Set BVar Instruction
			if(this.inst.equalsIgnoreCase("bto"))
			{
				variableB.setBVar(Float.parseFloat(str.split(" ")[1]));
			}
			//Print BVar Instruction
			if(this.inst.equalsIgnoreCase("printbvar"))
			{
				print.print(variableB.getBVarStr());
			}
			//Set CVar Instruction
			if(this.inst.equalsIgnoreCase("cto"))
			{
				variableC.setCVar(Float.parseFloat(str.split(" ")[1]));
			}
			//Print CVar Instruction
			if(this.inst.equalsIgnoreCase("printcvar"))
			{
				print.print(variableC.getCVarStr());
			}
			//Set DVar Instruction
			if(this.inst.equalsIgnoreCase("dto"))
			{
				variableD.setDVar(Float.parseFloat(str.split(" ")[1]));
			}
			//Print DVar Instruction
			if(this.inst.equalsIgnoreCase("printdvar"))
			{
				print.print(variableD.getDVarStr());
			}
			//Set EVar Instruction
			if(this.inst.equalsIgnoreCase("eto"))
			{
				variableE.setEVar(Float.parseFloat(str.split(" ")[1]));
			}
			//Print EVar Instruction
			if(this.inst.equalsIgnoreCase("printevar"))
			{
				print.print(variableE.getEVarStr());
			}
			//Set FVar Instruction
			if(this.inst.equalsIgnoreCase("fto"))
			{
				variableF.setFVar(Float.parseFloat(str.split(" ")[1]));
			}
			//Print FVar Instruction
			if(this.inst.equalsIgnoreCase("printfvar"))
			{
				print.print(variableF.getFVarStr());
			}
			
			//Set Str1 Instruction
			if(this.inst.equalsIgnoreCase("str1to"))
			{
				String inst2 = "";
				for(int i = 1; i < str.split(" ").length; i++)
				{
					inst2 += str.split(" ")[i] + " ";
				}
				str1.setStrVar(inst2);
			}
			//Print Str1 Instruction
			if(this.inst.equalsIgnoreCase("printstr1"))
			{
				print.print(str1.getStrVar());
			}
			//Set Str2 Instruction
			if(this.inst.equalsIgnoreCase("str2to"))
			{
				String inst2 = "";
				for(int i = 1; i < str.split(" ").length; i++)
				{
					inst2 += str.split(" ")[i] + " ";
				}
				str2.setStrVar(inst2);
			}
			//Print Str2 Instruction
			if(this.inst.equalsIgnoreCase("printstr2"))
			{
				print.print(str2.getStrVar());
			}
			//Set Str3 Instruction
			if(this.inst.equalsIgnoreCase("str3to"))
			{
				String inst2 = "";
				for(int i = 1; i < str.split(" ").length; i++)
				{
					inst2 += str.split(" ")[i] + " ";
				}
				str3.setStrVar(inst2);
			}
			//Print Str3 Instruction
			if(this.inst.equalsIgnoreCase("printstr3"))
			{
				print.print(str3.getStrVar());
			}
			
			//Set Str1 by line Instruction
			if(this.inst.equalsIgnoreCase("str1lto"))
			{
				String inst2 = "";
				for(int i = 1; i < str.split(" ").length; i++)
				{
					inst2 += str.split(" ")[i] + "\n";
				}
				str1.setStrVar(inst2);
			}
			//Set Str2 by line Instruction
			if(this.inst.equalsIgnoreCase("str2lto"))
			{
				String inst2 = "";
				for(int i = 1; i < str.split(" ").length; i++)
				{
					inst2 += str.split(" ")[i] + "\n";
				}
				str2.setStrVar(inst2);
			}
			//Set Str3 by line Instruction
			if(this.inst.equalsIgnoreCase("str3lto"))
			{
				String inst2 = "";
				for(int i = 1; i < str.split(" ").length; i++)
				{
					inst2 += str.split(" ")[i] + "\n";
				}
				str3.setStrVar(inst2);
			}
			
			//Add Instruction
			if(this.inst.equalsIgnoreCase("add"))
			{
				//A = x+y
				if(str.split(" ")[1].equalsIgnoreCase("a"))
				{
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableA.setAVar(addFunc.addNumVar(variableB.getBVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("d")) || (str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableA.setAVar(addFunc.addNumVar(variableB.getBVar(), variableD.getDVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("e")) || (str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableA.setAVar(addFunc.addNumVar(variableB.getBVar(), variableE.getEVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableA.setAVar(addFunc.addNumVar(variableB.getBVar(), variableF.getFVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("d")))
					{
						variableA.setAVar(addFunc.addNumVar(variableD.getDVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("e")))
					{
						variableA.setAVar(addFunc.addNumVar(variableE.getEVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("f")))
					{
						variableA.setAVar(addFunc.addNumVar(variableF.getFVar(), variableC.getCVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("e")) || (str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("d")))
					{
						variableA.setAVar(addFunc.addNumVar(variableD.getDVar(), variableE.getEVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("d")))
					{
						variableA.setAVar(addFunc.addNumVar(variableD.getDVar(), variableF.getFVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("e")))
					{
						variableA.setAVar(addFunc.addNumVar(variableE.getEVar(), variableF.getFVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("b")) || (str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableA.setAVar(addFunc.addNumVar(variableA.getAVar(), variableB.getBVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableA.setAVar(addFunc.addNumVar(variableA.getAVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("d")) || (str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableA.setAVar(addFunc.addNumVar(variableA.getAVar(), variableD.getDVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("e")) || (str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableA.setAVar(addFunc.addNumVar(variableA.getAVar(), variableE.getEVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableA.setAVar(addFunc.addNumVar(variableA.getAVar(), variableF.getFVar()));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableA.setAVar(addFunc.addNumVar(variableA.getAVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableA.setAVar(addFunc.addNumVar(variableA.getAVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableA.setAVar(addFunc.addNumVar(variableB.getBVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableA.setAVar(addFunc.addNumVar(variableB.getBVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableA.setAVar(addFunc.addNumVar(variableC.getCVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableA.setAVar(addFunc.addNumVar(variableC.getCVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableA.setAVar(addFunc.addNumVar(variableD.getDVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableA.setAVar(addFunc.addNumVar(variableD.getDVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("e") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("e") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("a"))
					{
						variableA.setAVar(addFunc.addNumVar(variableE.getEVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("e") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("e") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("a"))
					{
						variableA.setAVar(addFunc.addNumVar(variableE.getEVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("e") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("a"))
					{
						variableA.setAVar(addFunc.addNumVar(variableE.getEVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("e") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("a"))
					{
						variableA.setAVar(addFunc.addNumVar(variableF.getFVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("a"))
					{
						variableA.setAVar(addFunc.addNumVar(variableA.getAVar(), variableA.getAVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("b"))
					{
						variableA.setAVar(addFunc.addNumVar(variableB.getBVar(), variableB.getBVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("c"))
					{
						variableA.setAVar(addFunc.addNumVar(variableC.getCVar(), variableC.getCVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("d"))
					{
						variableA.setAVar(addFunc.addNumVar(variableD.getDVar(), variableD.getDVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableA.setAVar(addFunc.addNumVar(variableE.getEVar(), variableE.getEVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("f"))
					{
						variableA.setAVar(addFunc.addNumVar(variableF.getFVar(), variableF.getFVar()));
					}
				}
				
				//B = x+y
				if(str.split(" ")[1].equalsIgnoreCase("b"))
				{
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableB.setBVar(addFunc.addNumVar(variableB.getBVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("d")) || (str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableB.setBVar(addFunc.addNumVar(variableB.getBVar(), variableD.getDVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("e")) || (str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableB.setBVar(addFunc.addNumVar(variableB.getBVar(), variableE.getEVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableB.setBVar(addFunc.addNumVar(variableB.getBVar(), variableF.getFVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("d")))
					{
						variableB.setBVar(addFunc.addNumVar(variableD.getDVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("e")))
					{
						variableB.setBVar(addFunc.addNumVar(variableE.getEVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("f")))
					{
						variableB.setBVar(addFunc.addNumVar(variableF.getFVar(), variableC.getCVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("e")) || (str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("d")))
					{
						variableB.setBVar(addFunc.addNumVar(variableD.getDVar(), variableE.getEVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("d")))
					{
						variableB.setBVar(addFunc.addNumVar(variableD.getDVar(), variableF.getFVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("e")))
					{
						variableB.setBVar(addFunc.addNumVar(variableE.getEVar(), variableF.getFVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("b")) || (str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableB.setBVar(addFunc.addNumVar(variableA.getAVar(), variableB.getBVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableB.setBVar(addFunc.addNumVar(variableA.getAVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("d")) || (str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableB.setBVar(addFunc.addNumVar(variableA.getAVar(), variableD.getDVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("e")) || (str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableB.setBVar(addFunc.addNumVar(variableA.getAVar(), variableE.getEVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableB.setBVar(addFunc.addNumVar(variableA.getAVar(), variableF.getFVar()));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableB.setBVar(addFunc.addNumVar(variableA.getAVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableB.setBVar(addFunc.addNumVar(variableA.getAVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableB.setBVar(addFunc.addNumVar(variableB.getBVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableB.setBVar(addFunc.addNumVar(variableB.getBVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableB.setBVar(addFunc.addNumVar(variableC.getCVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableB.setBVar(addFunc.addNumVar(variableC.getCVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableB.setBVar(addFunc.addNumVar(variableD.getDVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableB.setBVar(addFunc.addNumVar(variableD.getDVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("e") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("e") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("a"))
					{
						variableB.setBVar(addFunc.addNumVar(variableE.getEVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("e") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("e") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("a"))
					{
						variableB.setBVar(addFunc.addNumVar(variableE.getEVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("e") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("a"))
					{
						variableB.setBVar(addFunc.addNumVar(variableE.getEVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("e") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("a"))
					{
						variableB.setBVar(addFunc.addNumVar(variableF.getFVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("a"))
					{
						variableB.setBVar(addFunc.addNumVar(variableA.getAVar(), variableA.getAVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("b"))
					{
						variableB.setBVar(addFunc.addNumVar(variableB.getBVar(), variableB.getBVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("c"))
					{
						variableB.setBVar(addFunc.addNumVar(variableC.getCVar(), variableC.getCVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("d"))
					{
						variableB.setBVar(addFunc.addNumVar(variableD.getDVar(), variableD.getDVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableB.setBVar(addFunc.addNumVar(variableE.getEVar(), variableE.getEVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("f"))
					{
						variableB.setBVar(addFunc.addNumVar(variableF.getFVar(), variableF.getFVar()));
					}
				}
				
				//C = x+y
				if(str.split(" ")[1].equalsIgnoreCase("c"))
				{
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableC.setCVar(addFunc.addNumVar(variableB.getBVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("d")) || (str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableC.setCVar(addFunc.addNumVar(variableB.getBVar(), variableD.getDVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("e")) || (str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableC.setCVar(addFunc.addNumVar(variableB.getBVar(), variableE.getEVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableC.setCVar(addFunc.addNumVar(variableB.getBVar(), variableF.getFVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("d")))
					{
						variableC.setCVar(addFunc.addNumVar(variableD.getDVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("e")))
					{
						variableC.setCVar(addFunc.addNumVar(variableE.getEVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("f")))
					{
						variableC.setCVar(addFunc.addNumVar(variableF.getFVar(), variableC.getCVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("e")) || (str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("d")))
					{
						variableC.setCVar(addFunc.addNumVar(variableD.getDVar(), variableE.getEVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("d")))
					{
						variableC.setCVar(addFunc.addNumVar(variableD.getDVar(), variableF.getFVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("e")))
					{
						variableC.setCVar(addFunc.addNumVar(variableE.getEVar(), variableF.getFVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("b")) || (str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableC.setCVar(addFunc.addNumVar(variableA.getAVar(), variableB.getBVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableC.setCVar(addFunc.addNumVar(variableA.getAVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("d")) || (str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableC.setCVar(addFunc.addNumVar(variableA.getAVar(), variableD.getDVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("e")) || (str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableC.setCVar(addFunc.addNumVar(variableA.getAVar(), variableE.getEVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableC.setCVar(addFunc.addNumVar(variableA.getAVar(), variableF.getFVar()));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableC.setCVar(addFunc.addNumVar(variableA.getAVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableC.setCVar(addFunc.addNumVar(variableA.getAVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableC.setCVar(addFunc.addNumVar(variableB.getBVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableC.setCVar(addFunc.addNumVar(variableB.getBVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableC.setCVar(addFunc.addNumVar(variableC.getCVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableC.setCVar(addFunc.addNumVar(variableC.getCVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableC.setCVar(addFunc.addNumVar(variableD.getDVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableC.setCVar(addFunc.addNumVar(variableD.getDVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("e") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("e") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("a"))
					{
						variableC.setCVar(addFunc.addNumVar(variableE.getEVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("e") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("e") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("a"))
					{
						variableC.setCVar(addFunc.addNumVar(variableE.getEVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("e") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("a"))
					{
						variableC.setCVar(addFunc.addNumVar(variableE.getEVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("e") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("a"))
					{
						variableC.setCVar(addFunc.addNumVar(variableF.getFVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("a"))
					{
						variableC.setCVar(addFunc.addNumVar(variableA.getAVar(), variableA.getAVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("b"))
					{
						variableC.setCVar(addFunc.addNumVar(variableB.getBVar(), variableB.getBVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("c"))
					{
						variableC.setCVar(addFunc.addNumVar(variableC.getCVar(), variableC.getCVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("d"))
					{
						variableC.setCVar(addFunc.addNumVar(variableD.getDVar(), variableD.getDVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableC.setCVar(addFunc.addNumVar(variableE.getEVar(), variableE.getEVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("f"))
					{
						variableC.setCVar(addFunc.addNumVar(variableF.getFVar(), variableF.getFVar()));
					}
				}
				
				//D = x+y
				if(str.split(" ")[1].equalsIgnoreCase("d"))
				{
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableD.setDVar(addFunc.addNumVar(variableB.getBVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("d")) || (str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableD.setDVar(addFunc.addNumVar(variableB.getBVar(), variableD.getDVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("e")) || (str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableD.setDVar(addFunc.addNumVar(variableB.getBVar(), variableE.getEVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableD.setDVar(addFunc.addNumVar(variableB.getBVar(), variableF.getFVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("d")))
					{
						variableD.setDVar(addFunc.addNumVar(variableD.getDVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("e")))
					{
						variableD.setDVar(addFunc.addNumVar(variableE.getEVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("f")))
					{
						variableD.setDVar(addFunc.addNumVar(variableF.getFVar(), variableC.getCVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("e")) || (str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("d")))
					{
						variableD.setDVar(addFunc.addNumVar(variableD.getDVar(), variableE.getEVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("d")))
					{
						variableD.setDVar(addFunc.addNumVar(variableD.getDVar(), variableF.getFVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("e")))
					{
						variableD.setDVar(addFunc.addNumVar(variableE.getEVar(), variableF.getFVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("b")) || (str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableD.setDVar(addFunc.addNumVar(variableA.getAVar(), variableB.getBVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableD.setDVar(addFunc.addNumVar(variableA.getAVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("d")) || (str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableD.setDVar(addFunc.addNumVar(variableA.getAVar(), variableD.getDVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("e")) || (str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableD.setDVar(addFunc.addNumVar(variableA.getAVar(), variableE.getEVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableD.setDVar(addFunc.addNumVar(variableA.getAVar(), variableF.getFVar()));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableD.setDVar(addFunc.addNumVar(variableA.getAVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableD.setDVar(addFunc.addNumVar(variableA.getAVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableD.setDVar(addFunc.addNumVar(variableB.getBVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableD.setDVar(addFunc.addNumVar(variableB.getBVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableD.setDVar(addFunc.addNumVar(variableC.getCVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableD.setDVar(addFunc.addNumVar(variableC.getCVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableD.setDVar(addFunc.addNumVar(variableD.getDVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableD.setDVar(addFunc.addNumVar(variableD.getDVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("e") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("e") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("a"))
					{
						variableD.setDVar(addFunc.addNumVar(variableE.getEVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("e") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("e") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("a"))
					{
						variableD.setDVar(addFunc.addNumVar(variableE.getEVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("e") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("a"))
					{
						variableD.setDVar(addFunc.addNumVar(variableE.getEVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("e") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("a"))
					{
						variableD.setDVar(addFunc.addNumVar(variableF.getFVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("a"))
					{
						variableD.setDVar(addFunc.addNumVar(variableA.getAVar(), variableA.getAVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("b"))
					{
						variableD.setDVar(addFunc.addNumVar(variableB.getBVar(), variableB.getBVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("c"))
					{
						variableD.setDVar(addFunc.addNumVar(variableC.getCVar(), variableC.getCVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("d"))
					{
						variableD.setDVar(addFunc.addNumVar(variableD.getDVar(), variableD.getDVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableD.setDVar(addFunc.addNumVar(variableE.getEVar(), variableE.getEVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("f"))
					{
						variableD.setDVar(addFunc.addNumVar(variableF.getFVar(), variableF.getFVar()));
					}
				}
				
				//E = x+y
				if(str.split(" ")[1].equalsIgnoreCase("e"))
				{
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableE.setEVar(addFunc.addNumVar(variableB.getBVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("d")) || (str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableE.setEVar(addFunc.addNumVar(variableB.getBVar(), variableD.getDVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("e")) || (str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableE.setEVar(addFunc.addNumVar(variableB.getBVar(), variableE.getEVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableE.setEVar(addFunc.addNumVar(variableB.getBVar(), variableF.getFVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("d")))
					{
						variableE.setEVar(addFunc.addNumVar(variableD.getDVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("e")))
					{
						variableE.setEVar(addFunc.addNumVar(variableE.getEVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("f")))
					{
						variableE.setEVar(addFunc.addNumVar(variableF.getFVar(), variableC.getCVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("e")) || (str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("d")))
					{
						variableE.setEVar(addFunc.addNumVar(variableD.getDVar(), variableE.getEVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("d")))
					{
						variableE.setEVar(addFunc.addNumVar(variableD.getDVar(), variableF.getFVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("e")))
					{
						variableE.setEVar(addFunc.addNumVar(variableE.getEVar(), variableF.getFVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("b")) || (str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableE.setEVar(addFunc.addNumVar(variableA.getAVar(), variableB.getBVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableE.setEVar(addFunc.addNumVar(variableA.getAVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("d")) || (str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableE.setEVar(addFunc.addNumVar(variableA.getAVar(), variableD.getDVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("e")) || (str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableE.setEVar(addFunc.addNumVar(variableA.getAVar(), variableE.getEVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableE.setEVar(addFunc.addNumVar(variableA.getAVar(), variableF.getFVar()));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableE.setEVar(addFunc.addNumVar(variableA.getAVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableE.setEVar(addFunc.addNumVar(variableA.getAVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableE.setEVar(addFunc.addNumVar(variableB.getBVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableE.setEVar(addFunc.addNumVar(variableB.getBVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableE.setEVar(addFunc.addNumVar(variableC.getCVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableE.setEVar(addFunc.addNumVar(variableC.getCVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableE.setEVar(addFunc.addNumVar(variableD.getDVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableE.setEVar(addFunc.addNumVar(variableD.getDVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("e") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("e") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("a"))
					{
						variableE.setEVar(addFunc.addNumVar(variableE.getEVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("e") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("e") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("a"))
					{
						variableE.setEVar(addFunc.addNumVar(variableE.getEVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("e") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("a"))
					{
						variableE.setEVar(addFunc.addNumVar(variableE.getEVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("e") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("a"))
					{
						variableE.setEVar(addFunc.addNumVar(variableF.getFVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("a"))
					{
						variableE.setEVar(addFunc.addNumVar(variableA.getAVar(), variableA.getAVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("b"))
					{
						variableE.setEVar(addFunc.addNumVar(variableB.getBVar(), variableB.getBVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("c"))
					{
						variableE.setEVar(addFunc.addNumVar(variableC.getCVar(), variableC.getCVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("d"))
					{
						variableE.setEVar(addFunc.addNumVar(variableD.getDVar(), variableD.getDVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableE.setEVar(addFunc.addNumVar(variableE.getEVar(), variableE.getEVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("f"))
					{
						variableE.setEVar(addFunc.addNumVar(variableF.getFVar(), variableF.getFVar()));
					}
				}
				
				//F = x+y
				if(str.split(" ")[1].equalsIgnoreCase("f"))
				{
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableF.setFVar(addFunc.addNumVar(variableB.getBVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("d")) || (str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableF.setFVar(addFunc.addNumVar(variableB.getBVar(), variableD.getDVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("e")) || (str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableF.setFVar(addFunc.addNumVar(variableB.getBVar(), variableE.getEVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("b")))
					{
						variableF.setFVar(addFunc.addNumVar(variableB.getBVar(), variableF.getFVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("d")))
					{
						variableF.setFVar(addFunc.addNumVar(variableD.getDVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("e")))
					{
						variableF.setFVar(addFunc.addNumVar(variableE.getEVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("f")))
					{
						variableF.setFVar(addFunc.addNumVar(variableF.getFVar(), variableC.getCVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("e")) || (str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("d")))
					{
						variableF.setFVar(addFunc.addNumVar(variableD.getDVar(), variableE.getEVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("d")))
					{
						variableF.setFVar(addFunc.addNumVar(variableD.getDVar(), variableF.getFVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("e")))
					{
						variableF.setFVar(addFunc.addNumVar(variableE.getEVar(), variableF.getFVar()));
					}
					
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("b")) || (str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableF.setFVar(addFunc.addNumVar(variableA.getAVar(), variableB.getBVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("c")) || (str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableF.setFVar(addFunc.addNumVar(variableA.getAVar(), variableC.getCVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("d")) || (str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableF.setFVar(addFunc.addNumVar(variableA.getAVar(), variableD.getDVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("e")) || (str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableF.setFVar(addFunc.addNumVar(variableA.getAVar(), variableE.getEVar()));
					}
					if((str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("f")) || (str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("a")))
					{
						variableF.setFVar(addFunc.addNumVar(variableA.getAVar(), variableF.getFVar()));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableF.setFVar(addFunc.addNumVar(variableA.getAVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableF.setFVar(addFunc.addNumVar(variableA.getAVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableF.setFVar(addFunc.addNumVar(variableB.getBVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableF.setFVar(addFunc.addNumVar(variableB.getBVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableF.setFVar(addFunc.addNumVar(variableC.getCVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableF.setFVar(addFunc.addNumVar(variableC.getCVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("a") && !str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableF.setFVar(addFunc.addNumVar(variableD.getDVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("a") && !str.split(" ")[2].equalsIgnoreCase("e"))
					{
						variableF.setFVar(addFunc.addNumVar(variableD.getDVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("e") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("e") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("a"))
					{
						variableF.setFVar(addFunc.addNumVar(variableE.getEVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("e") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("e") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("a"))
					{
						variableF.setFVar(addFunc.addNumVar(variableE.getEVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[3].equalsIgnoreCase("e") && !str.split(" ")[3].equalsIgnoreCase("b") && !str.split(" ")[3].equalsIgnoreCase("c") && !str.split(" ")[3].equalsIgnoreCase("d") && !str.split(" ")[3].equalsIgnoreCase("a"))
					{
						variableF.setFVar(addFunc.addNumVar(variableE.getEVar(), Float.parseFloat(str.split(" ")[3])));
					}
					if(str.split(" ")[3].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("f") && !str.split(" ")[2].equalsIgnoreCase("e") && !str.split(" ")[2].equalsIgnoreCase("b") && !str.split(" ")[2].equalsIgnoreCase("c") && !str.split(" ")[2].equalsIgnoreCase("d") && !str.split(" ")[2].equalsIgnoreCase("a"))
					{
						variableF.setFVar(addFunc.addNumVar(variableF.getFVar(), Float.parseFloat(str.split(" ")[2])));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("a") && str.split(" ")[3].equalsIgnoreCase("a"))
					{
						variableF.setFVar(addFunc.addNumVar(variableA.getAVar(), variableA.getAVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("b") && str.split(" ")[3].equalsIgnoreCase("b"))
					{
						variableF.setFVar(addFunc.addNumVar(variableB.getBVar(), variableB.getBVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("c") && str.split(" ")[3].equalsIgnoreCase("c"))
					{
						variableF.setFVar(addFunc.addNumVar(variableC.getCVar(), variableC.getCVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("d") && str.split(" ")[3].equalsIgnoreCase("d"))
					{
						variableF.setFVar(addFunc.addNumVar(variableD.getDVar(), variableD.getDVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("e") && str.split(" ")[3].equalsIgnoreCase("e"))
					{
						variableF.setFVar(addFunc.addNumVar(variableE.getEVar(), variableE.getEVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("f") && str.split(" ")[3].equalsIgnoreCase("f"))
					{
						variableF.setFVar(addFunc.addNumVar(variableF.getFVar(), variableF.getFVar()));
					}
				}
			}
			
			//StrAdd Instruction
			if(this.inst.equalsIgnoreCase("stradd"))
			{
				if(str.split(" ")[1].equalsIgnoreCase("str1"))
				{
					if(str.split(" ")[2].equalsIgnoreCase("str1") && str.split(" ")[3].equalsIgnoreCase("str1"))
					{
						str1.setStrVar(strAddFunc.addStr(str1.getStrVar(), str1.getStrVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str2") && str.split(" ")[3].equalsIgnoreCase("str2"))
					{
						str1.setStrVar(strAddFunc.addStr(str2.getStrVar(), str2.getStrVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str3") && str.split(" ")[3].equalsIgnoreCase("str3"))
					{
						str1.setStrVar(strAddFunc.addStr(str3.getStrVar(), str3.getStrVar()));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("str1") && str.split(" ")[3].equalsIgnoreCase("str2"))
					{
						str1.setStrVar(strAddFunc.addStr(str1.getStrVar(), str2.getStrVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str2") && str.split(" ")[3].equalsIgnoreCase("str1"))
					{
						str1.setStrVar(strAddFunc.addStr(str2.getStrVar(), str1.getStrVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str1") && str.split(" ")[3].equalsIgnoreCase("str3"))
					{
						str1.setStrVar(strAddFunc.addStr(str1.getStrVar(), str3.getStrVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str3") && str.split(" ")[3].equalsIgnoreCase("str1"))
					{
						str1.setStrVar(strAddFunc.addStr(str3.getStrVar(), str1.getStrVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str2") && str.split(" ")[3].equalsIgnoreCase("str3"))
					{
						str1.setStrVar(strAddFunc.addStr(str2.getStrVar(), str3.getStrVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str3") && str.split(" ")[3].equalsIgnoreCase("str2"))
					{
						str1.setStrVar(strAddFunc.addStr(str3.getStrVar(), str2.getStrVar()));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("str1") && !str.split(" ")[3].equalsIgnoreCase("str1") && !str.split(" ")[3].equalsIgnoreCase("str2") && !str.split(" ")[3].equalsIgnoreCase("str3"))
					{
						String inst2 = "";
						for(int i = 3; i < str.split(" ").length; i++)
						{
							inst2 += str.split(" ")[i] + " ";
						}
						str1.setStrVar(strAddFunc.addStr(str1.getStrVar(), inst2));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str2") && !str.split(" ")[3].equalsIgnoreCase("str1") && !str.split(" ")[3].equalsIgnoreCase("str2") && !str.split(" ")[3].equalsIgnoreCase("str3"))
					{
						String inst2 = "";
						for(int i = 3; i < str.split(" ").length; i++)
						{
							inst2 += str.split(" ")[i] + " ";
						}
						str1.setStrVar(strAddFunc.addStr(str2.getStrVar(), inst2));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str3") && !str.split(" ")[3].equalsIgnoreCase("str1") && !str.split(" ")[3].equalsIgnoreCase("str2") && !str.split(" ")[3].equalsIgnoreCase("str3"))
					{
						String inst2 = "";
						for(int i = 3; i < str.split(" ").length; i++)
						{
							inst2 += str.split(" ")[i] + " ";
						}
						str1.setStrVar(strAddFunc.addStr(str3.getStrVar(), inst2));
					}
				}
				
				if(str.split(" ")[1].equalsIgnoreCase("str2"))
				{
					if(str.split(" ")[2].equalsIgnoreCase("str1") && str.split(" ")[3].equalsIgnoreCase("str1"))
					{
						str2.setStrVar(strAddFunc.addStr(str1.getStrVar(), str1.getStrVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str2") && str.split(" ")[3].equalsIgnoreCase("str2"))
					{
						str2.setStrVar(strAddFunc.addStr(str2.getStrVar(), str2.getStrVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str3") && str.split(" ")[3].equalsIgnoreCase("str3"))
					{
						str2.setStrVar(strAddFunc.addStr(str3.getStrVar(), str3.getStrVar()));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("str1") && str.split(" ")[3].equalsIgnoreCase("str2"))
					{
						str2.setStrVar(strAddFunc.addStr(str1.getStrVar(), str2.getStrVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str2") && str.split(" ")[3].equalsIgnoreCase("str1"))
					{
						str2.setStrVar(strAddFunc.addStr(str2.getStrVar(), str1.getStrVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str1") && str.split(" ")[3].equalsIgnoreCase("str3"))
					{
						str2.setStrVar(strAddFunc.addStr(str1.getStrVar(), str3.getStrVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str3") && str.split(" ")[3].equalsIgnoreCase("str1"))
					{
						str2.setStrVar(strAddFunc.addStr(str3.getStrVar(), str1.getStrVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str2") && str.split(" ")[3].equalsIgnoreCase("str3"))
					{
						str2.setStrVar(strAddFunc.addStr(str2.getStrVar(), str3.getStrVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str3") && str.split(" ")[3].equalsIgnoreCase("str2"))
					{
						str2.setStrVar(strAddFunc.addStr(str3.getStrVar(), str2.getStrVar()));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("str1") && !str.split(" ")[3].equalsIgnoreCase("str1") && !str.split(" ")[3].equalsIgnoreCase("str2") && !str.split(" ")[3].equalsIgnoreCase("str3"))
					{
						String inst2 = "";
						for(int i = 3; i < str.split(" ").length; i++)
						{
							inst2 += str.split(" ")[i] + " ";
						}
						str2.setStrVar(strAddFunc.addStr(str1.getStrVar(), inst2));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str2") && !str.split(" ")[3].equalsIgnoreCase("str1") && !str.split(" ")[3].equalsIgnoreCase("str2") && !str.split(" ")[3].equalsIgnoreCase("str3"))
					{
						String inst2 = "";
						for(int i = 3; i < str.split(" ").length; i++)
						{
							inst2 += str.split(" ")[i] + " ";
						}
						str2.setStrVar(strAddFunc.addStr(str2.getStrVar(), inst2));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str3") && !str.split(" ")[3].equalsIgnoreCase("str1") && !str.split(" ")[3].equalsIgnoreCase("str2") && !str.split(" ")[3].equalsIgnoreCase("str3"))
					{
						String inst2 = "";
						for(int i = 3; i < str.split(" ").length; i++)
						{
							inst2 += str.split(" ")[i] + " ";
						}
						str2.setStrVar(strAddFunc.addStr(str3.getStrVar(), inst2));
					}
				}
				
				if(str.split(" ")[1].equalsIgnoreCase("str3"))
				{
					if(str.split(" ")[2].equalsIgnoreCase("str1") && str.split(" ")[3].equalsIgnoreCase("str1"))
					{
						str3.setStrVar(strAddFunc.addStr(str1.getStrVar(), str1.getStrVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str2") && str.split(" ")[3].equalsIgnoreCase("str2"))
					{
						str3.setStrVar(strAddFunc.addStr(str2.getStrVar(), str2.getStrVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str3") && str.split(" ")[3].equalsIgnoreCase("str3"))
					{
						str3.setStrVar(strAddFunc.addStr(str3.getStrVar(), str3.getStrVar()));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("str1") && str.split(" ")[3].equalsIgnoreCase("str2"))
					{
						str3.setStrVar(strAddFunc.addStr(str1.getStrVar(), str2.getStrVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str2") && str.split(" ")[3].equalsIgnoreCase("str1"))
					{
						str3.setStrVar(strAddFunc.addStr(str2.getStrVar(), str1.getStrVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str1") && str.split(" ")[3].equalsIgnoreCase("str3"))
					{
						str3.setStrVar(strAddFunc.addStr(str1.getStrVar(), str3.getStrVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str3") && str.split(" ")[3].equalsIgnoreCase("str1"))
					{
						str3.setStrVar(strAddFunc.addStr(str3.getStrVar(), str1.getStrVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str2") && str.split(" ")[3].equalsIgnoreCase("str3"))
					{
						str3.setStrVar(strAddFunc.addStr(str2.getStrVar(), str3.getStrVar()));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str3") && str.split(" ")[3].equalsIgnoreCase("str2"))
					{
						str3.setStrVar(strAddFunc.addStr(str3.getStrVar(), str2.getStrVar()));
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("str1") && !str.split(" ")[3].equalsIgnoreCase("str1") && !str.split(" ")[3].equalsIgnoreCase("str2") && !str.split(" ")[3].equalsIgnoreCase("str3"))
					{
						String inst2 = "";
						for(int i = 3; i < str.split(" ").length; i++)
						{
							inst2 += str.split(" ")[i] + " ";
						}
						str3.setStrVar(strAddFunc.addStr(str1.getStrVar(), inst2));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str2") && !str.split(" ")[3].equalsIgnoreCase("str1") && !str.split(" ")[3].equalsIgnoreCase("str2") && !str.split(" ")[3].equalsIgnoreCase("str3"))
					{
						String inst2 = "";
						for(int i = 3; i < str.split(" ").length; i++)
						{
							inst2 += str.split(" ")[i] + " ";
						}
						str3.setStrVar(strAddFunc.addStr(str2.getStrVar(), inst2));
					}
					if(str.split(" ")[2].equalsIgnoreCase("str3") && !str.split(" ")[3].equalsIgnoreCase("str1") && !str.split(" ")[3].equalsIgnoreCase("str2") && !str.split(" ")[3].equalsIgnoreCase("str3"))
					{
						String inst2 = "";
						for(int i = 3; i < str.split(" ").length; i++)
						{
							inst2 += str.split(" ")[i] + " ";
						}
						str3.setStrVar(strAddFunc.addStr(str3.getStrVar(), inst2));
					}
				}
			}
			
			//FloatInput Instruction
			if(this.inst.equalsIgnoreCase("finput"))
			{
				if(str.split(" ")[1].equalsIgnoreCase("a"))
				{
					variableA.setAVar(floatIn.floatInput());
				}
				if(str.split(" ")[1].equalsIgnoreCase("b"))
				{
					variableB.setBVar(floatIn.floatInput());
				}
				if(str.split(" ")[1].equalsIgnoreCase("c"))
				{
					variableC.setCVar(floatIn.floatInput());
				}
				if(str.split(" ")[1].equalsIgnoreCase("d"))
				{
					variableD.setDVar(floatIn.floatInput());
				}
				if(str.split(" ")[1].equalsIgnoreCase("e"))
				{
					variableE.setEVar(floatIn.floatInput());
				}
				if(str.split(" ")[1].equalsIgnoreCase("f"))
				{
					variableF.setFVar(floatIn.floatInput());
				}
			}
			
			//StrInput Instruction
			if(this.inst.equalsIgnoreCase("sinput"))
			{
				if(str.split(" ")[1].equalsIgnoreCase("str1"))
				{
					str1.setStrVar(strIn.strInput());
				}
				if(str.split(" ")[1].equalsIgnoreCase("str2"))
				{
					str2.setStrVar(strIn.strInput());
				}
				if(str.split(" ")[1].equalsIgnoreCase("str3"))
				{
					str3.setStrVar(strIn.strInput());
				}
			}
			
			//FloatInput with custom msg Instruction
			if(this.inst.equalsIgnoreCase("mfinput"))
			{
				if(str.split(" ")[1].equalsIgnoreCase("a"))
				{
					String inst2 = "";
					for(int i = 2; i < str.split(" ").length; i++)
					{
						inst2 += str.split(" ")[i] + " ";
					}
					variableA.setAVar(floatIn.cFloatInput(inst2));
				}
				if(str.split(" ")[1].equalsIgnoreCase("b"))
				{
					String inst2 = "";
					for(int i = 2; i < str.split(" ").length; i++)
					{
						inst2 += str.split(" ")[i] + " ";
					}
					variableB.setBVar(floatIn.cFloatInput(inst2));
				}
				if(str.split(" ")[1].equalsIgnoreCase("c"))
				{
					String inst2 = "";
					for(int i = 2; i < str.split(" ").length; i++)
					{
						inst2 += str.split(" ")[i] + " ";
					}
					variableC.setCVar(floatIn.cFloatInput(inst2));
				}
				if(str.split(" ")[1].equalsIgnoreCase("d"))
				{
					String inst2 = "";
					for(int i = 2; i < str.split(" ").length; i++)
					{
						inst2 += str.split(" ")[i] + " ";
					}
					variableD.setDVar(floatIn.cFloatInput(inst2));
				}
				if(str.split(" ")[1].equalsIgnoreCase("e"))
				{
					String inst2 = "";
					for(int i = 2; i < str.split(" ").length; i++)
					{
						inst2 += str.split(" ")[i] + " ";
					}
					variableE.setEVar(floatIn.cFloatInput(inst2));
				}
				if(str.split(" ")[1].equalsIgnoreCase("f"))
				{
					String inst2 = "";
					for(int i = 2; i < str.split(" ").length; i++)
					{
						inst2 += str.split(" ")[i] + " ";
					}
					variableF.setFVar(floatIn.cFloatInput(inst2));
				}
			}
			
			//StringInput with custom msg Instruction
			if(this.inst.equalsIgnoreCase("msinput"))
			{
				if(str.split(" ")[1].equalsIgnoreCase("str1"))
				{
					String inst2 = "";
					for(int i = 2; i < str.split(" ").length; i++)
					{
						inst2 += str.split(" ")[i] + " ";
					}
					str1.setStrVar(strIn.cStrInput(inst2));
				}
				if(str.split(" ")[1].equalsIgnoreCase("str2"))
				{
					String inst2 = "";
					for(int i = 2; i < str.split(" ").length; i++)
					{
						inst2 += str.split(" ")[i] + " ";
					}
					str2.setStrVar(strIn.cStrInput(inst2));
				}
				if(str.split(" ")[1].equalsIgnoreCase("str3"))
				{
					String inst2 = "";
					for(int i = 2; i < str.split(" ").length; i++)
					{
						inst2 += str.split(" ")[i] + " ";
					}
					str3.setStrVar(strIn.cStrInput(inst2));
				}
			}
			
			//Unconditional Jump
			if(this.inst.equalsIgnoreCase("jmp"))
			{
				index = Integer.parseInt(str.split(" ")[1]) - 2;
			}
			
			//Conditional Jump: a=0
			if(this.inst.equalsIgnoreCase("jmp0ea"))
			{
				if(variableA.getAVar() == 0.0)
				{
					index = Integer.parseInt(str.split(" ")[1]) - 2;
				}
			}
			//Conditional Jump: b=0
			if(this.inst.equalsIgnoreCase("jmp0eb"))
			{
				if(variableB.getBVar() == 0.0)
				{
					index = Integer.parseInt(str.split(" ")[1]) - 2;
				}
			}
			//Conditional Jump: c=0
			if(this.inst.equalsIgnoreCase("jmp0ec"))
			{
				if(variableC.getCVar() == 0.0)
				{
					index = Integer.parseInt(str.split(" ")[1]) - 2;
				}
			}
			//Conditional Jump: d=0
			if(this.inst.equalsIgnoreCase("jmp0ed"))
			{
				if(variableD.getDVar() == 0.0)
				{
					index = Integer.parseInt(str.split(" ")[1]) - 2;
				}
			}
			//Conditional Jump:e=0
			if(this.inst.equalsIgnoreCase("jmp0ee"))
			{
				if(variableE.getEVar() == 0.0)
				{
					index = Integer.parseInt(str.split(" ")[1]) - 2;
				}
			}
			//Conditional Jump: f=0
			if(this.inst.equalsIgnoreCase("jmp0ef"))
			{
				if(variableF.getFVar() == 0.0)
				{
					index = Integer.parseInt(str.split(" ")[1]) - 2;
				}
			}
			
			//Conditional Jump (Custom Condition
			if(this.inst.equalsIgnoreCase("cjmp"))
			{
				if(str.split(" ")[1].equalsIgnoreCase("a"))
				{
					if(str.split(" ")[2].equalsIgnoreCase("="))
					{
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableA.getAVar() == variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableA.getAVar() == variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableA.getAVar() == variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableA.getAVar() == variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableA.getAVar() == variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("!=") || str.split(" ")[2].equalsIgnoreCase("=!"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableA.getAVar() != variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableA.getAVar() != variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableA.getAVar() != variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableA.getAVar() != variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableA.getAVar() != variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase(">"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableA.getAVar() > variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableA.getAVar() > variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableA.getAVar() > variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableA.getAVar() > variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableA.getAVar() > variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("<"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableA.getAVar() < variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableA.getAVar() < variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableA.getAVar() < variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableA.getAVar() < variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableA.getAVar() < variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase(">=") || str.split(" ")[2].equalsIgnoreCase("=>"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableA.getAVar() >= variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableA.getAVar() >= variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableA.getAVar() >= variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableA.getAVar() >= variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableA.getAVar() >= variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("<=") || str.split(" ")[2].equalsIgnoreCase("=<"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableA.getAVar() <= variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableA.getAVar() <= variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableA.getAVar() <= variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableA.getAVar() <= variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableA.getAVar() <= variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
				}
				
				if(str.split(" ")[1].equalsIgnoreCase("b"))
				{
					if(str.split(" ")[2].equalsIgnoreCase("="))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableB.getBVar() == variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableB.getBVar() == variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableB.getBVar() == variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableB.getBVar() == variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableB.getBVar() == variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("!=") || str.split(" ")[2].equalsIgnoreCase("=!"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableB.getBVar() != variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableB.getBVar() != variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableB.getBVar() != variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableB.getBVar() != variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableB.getBVar() != variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase(">"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableB.getBVar() > variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableB.getBVar() > variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableB.getBVar() > variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableB.getBVar() > variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableB.getBVar() > variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("<"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableB.getBVar() < variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableB.getBVar() < variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableB.getBVar() < variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableB.getBVar() < variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableB.getBVar() < variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase(">=") || str.split(" ")[2].equalsIgnoreCase("=>"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableB.getBVar() >= variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableB.getBVar() >= variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableB.getBVar() >= variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableB.getBVar() >= variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableB.getBVar() >= variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("<=") || str.split(" ")[2].equalsIgnoreCase("=<"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableB.getBVar() <= variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableB.getBVar() <= variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableB.getBVar() <= variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableB.getBVar() <= variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableB.getBVar() <= variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
				}
				
				if(str.split(" ")[1].equalsIgnoreCase("c"))
				{
					if(str.split(" ")[2].equalsIgnoreCase("="))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableC.getCVar() == variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableC.getCVar() == variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableC.getCVar() == variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableC.getCVar() == variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableC.getCVar() == variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("!=") || str.split(" ")[2].equalsIgnoreCase("=!"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableC.getCVar() != variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableC.getCVar() != variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableC.getCVar() != variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableC.getCVar() != variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableC.getCVar() != variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase(">"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableC.getCVar() > variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableC.getCVar() > variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableC.getCVar() > variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableC.getCVar() > variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableC.getCVar() > variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("<"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableC.getCVar() < variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableC.getCVar() < variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableC.getCVar() < variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableC.getCVar() < variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableC.getCVar() < variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase(">=") || str.split(" ")[2].equalsIgnoreCase("=>"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableC.getCVar() >= variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableC.getCVar() >= variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableC.getCVar() >= variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableC.getCVar() >= variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableC.getCVar() >= variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("<=") || str.split(" ")[2].equalsIgnoreCase("=<"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableC.getCVar() <= variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableC.getCVar() <= variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableC.getCVar() <= variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableC.getCVar() <= variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableC.getCVar() <= variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
				}
				
				if(str.split(" ")[1].equalsIgnoreCase("d"))
				{
					if(str.split(" ")[2].equalsIgnoreCase("="))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableD.getDVar() == variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableD.getDVar() == variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableD.getDVar() == variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableD.getDVar() == variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableD.getDVar() == variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("!=") || str.split(" ")[2].equalsIgnoreCase("=!"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableD.getDVar() != variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableD.getDVar() != variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableD.getDVar() != variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableD.getDVar() != variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableD.getDVar() != variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase(">"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableD.getDVar() > variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableD.getDVar() > variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableD.getDVar() > variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableD.getDVar() > variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableD.getDVar() > variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("<"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableD.getDVar() < variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableD.getDVar() < variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableD.getDVar() < variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableD.getDVar() < variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableD.getDVar() < variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase(">=") || str.split(" ")[2].equalsIgnoreCase("=>"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableD.getDVar() >= variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableD.getDVar() >= variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableD.getDVar() >= variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableD.getDVar() >= variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableD.getDVar() >= variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("<=") || str.split(" ")[2].equalsIgnoreCase("=<"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableD.getDVar() <= variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableD.getDVar() <= variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableD.getDVar() <= variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableD.getDVar() <= variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableD.getDVar() <= variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
				}
				
				if(str.split(" ")[1].equalsIgnoreCase("e"))
				{
					if(str.split(" ")[2].equalsIgnoreCase("="))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableE.getEVar() == variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableE.getEVar() == variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableE.getEVar() == variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableE.getEVar() == variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableE.getEVar() == variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("!=") || str.split(" ")[2].equalsIgnoreCase("=!"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableE.getEVar() != variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableE.getEVar() != variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableE.getEVar() != variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableE.getEVar() != variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableE.getEVar() != variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase(">"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableE.getEVar() > variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableE.getEVar() > variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableE.getEVar() > variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableE.getEVar() > variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableE.getEVar() > variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("<"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableE.getEVar() < variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableE.getEVar() < variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableE.getEVar() < variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableE.getEVar() < variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableE.getEVar() < variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase(">=") || str.split(" ")[2].equalsIgnoreCase("=>"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableE.getEVar() >= variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableE.getEVar() >= variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableE.getEVar() >= variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableE.getEVar() >= variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableE.getEVar() >= variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("<=") || str.split(" ")[2].equalsIgnoreCase("=<"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableE.getEVar() <= variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableE.getEVar() <= variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableE.getEVar() <= variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableE.getEVar() <= variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("f"))
						{
							if(variableE.getEVar() <= variableF.getFVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
				}
				
				if(str.split(" ")[1].equalsIgnoreCase("f"))
				{
					if(str.split(" ")[2].equalsIgnoreCase("="))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableF.getFVar() == variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableF.getFVar() == variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableF.getFVar() == variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableF.getFVar() == variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableF.getFVar() == variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("!=") || str.split(" ")[2].equalsIgnoreCase("=!"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableF.getFVar() != variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableF.getFVar() != variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableF.getFVar() != variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableF.getFVar() != variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableF.getFVar() != variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase(">"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableF.getFVar() > variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableF.getFVar() > variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableF.getFVar() > variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableF.getFVar() > variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableF.getFVar() > variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("<"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableF.getFVar() < variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableF.getFVar() < variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableF.getFVar() < variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableF.getFVar() < variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableF.getFVar() < variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase(">=") || str.split(" ")[2].equalsIgnoreCase("=>"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableF.getFVar() >= variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableF.getFVar() >= variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableF.getFVar() >= variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableF.getFVar() >= variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableF.getFVar() >= variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
					
					if(str.split(" ")[2].equalsIgnoreCase("<=") || str.split(" ")[2].equalsIgnoreCase("=<"))
					{
						if(str.split(" ")[3].equalsIgnoreCase("a"))
						{
							if(variableF.getFVar() <= variableA.getAVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("b"))
						{
							if(variableF.getFVar() <= variableB.getBVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("c"))
						{
							if(variableF.getFVar() <= variableC.getCVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("d"))
						{
							if(variableF.getFVar() <= variableD.getDVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
						if(str.split(" ")[3].equalsIgnoreCase("e"))
						{
							if(variableF.getFVar() <= variableE.getEVar())
							{
								index = Integer.parseInt(str.split(" ")[4]) - 2;
							}
						}
					}
				}
			}
			
			index++;
		}
	}
}
