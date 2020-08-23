package lthclang.game.engine.lthcsmagicworld;

import java.awt.image.DataBufferInt;

import lthclang.game.engine.lthcsmagicworld.gfx.Font;
import lthclang.game.engine.lthcsmagicworld.gfx.Image;
import lthclang.game.engine.lthcsmagicworld.gfx.ImageTile;

public class Renderer 
{
	private int pW, pH;
	private int[] p;
	
	private Font font = Font.STANDARD;
	
	public Renderer(GameContainer gc)
	{
		pW = gc.getWidth();
		pH = gc.getHeight();
		p = ((DataBufferInt)gc.getWindow().getImage().getRaster().getDataBuffer()).getData();
	}
	
	public void clear()
	{
		for(int i = 0; i < p.length; i++)
		{
			p[i] = 0;
		}
	}
	
	public void setPixel(int x, int y, int value)
	{
		if(x < 0 || x >= pW || y < 0 || y >= pH)
		{
			return;
		}
		
		p[x + y * pW] = value;
	}
	
	public void setPixelWT(int x, int y, int value)
	{
		//Transparency color HexCode: 0xffff00ff
		if((x < 0 || x >= pW || y < 0 || y >= pH) || value == 0xffff00ff)
		{
			return;
		}
		
		p[x + y * pW] = value;
	}
	
	public void drawText(String text, int offX, int offY, int color)
	{
		text = text.toUpperCase();
		int offset = 0;
		
		for(int i = 0; i < text.length(); i++)
		{
			int unicode = text.codePointAt(i) - 32;
			
			for(int y = 0; y < font.getFontImage().getH(); y++)
			{
				for(int x = 0; x < font.getWidths()[unicode]; x++)
				{
					if(font.getFontImage().getP()[(x + font.getOffsets()[unicode]) + y * font.getFontImage().getW()] == 0xffffffff)
					{
						setPixelWT(x + offX + offset, y + offY, color);
					}
				}
			}
			
			offset += font.getWidths()[unicode];
		}
	}
	
	public void drawImage(Image image, int offX, int offY)
	{
		if(offX < -image.getW()) return;
		if(offY < -image.getH()) return;
		if(offX >= pW) return;
		if(offY >= pH) return;
		
		int newX = 0;
		int newY = 0;
		int newWidth = image.getW();
		int newHeight = image.getH();
		
		if(offX < 0){newX -= offX;}
		if(offY < 0){newY -= offY;}
		if(newWidth + offX >= pW){newWidth -= newWidth + offX - pW;}
		if(newHeight + offY >= pH){newHeight -= newHeight + offY - pH;}
		
		for(int y = newY; y < newHeight; y++)
		{
			for(int x = newX; x < newWidth; x++)
			{
				setPixel(x + offX, y + offY, image.getP()[x + y * image.getW()]);
			}
		}
	}
	
	public void drawImageTile(ImageTile image, int offX, int offY, int tileX, int tileY)
	{
		if(offX < -image.getTileW()) return;
		if(offY < -image.getTileH()) return;
		if(offX >= pW) return;
		if(offY >= pH) return;
		
		int newX = 0;
		int newY = 0;
		int newWidth = image.getTileW();
		int newHeight = image.getTileH();
		
		if(offX < 0){newX -= offX;}
		if(offY < 0){newY -= offY;}
		if(newWidth + offX >= pW){newWidth -= newWidth + offX - pW;}
		if(newHeight + offY >= pH){newHeight -= newHeight + offY - pH;}
		
		for(int y = newY; y < newHeight; y++)
		{
			for(int x = newX; x < newWidth; x++)
			{
				setPixel(x + offX, y + offY, image.getP()[(x + tileX * image.getTileW()) + (y + tileY * image.getTileH()) * image.getW()]);
			}
		}
	}
	
	public void drawImageWT(Image image, int offX, int offY)
	{
		//Transparency color HexCode: 0xffff00ff
		if(offX < -image.getW()) return;
		if(offY < -image.getH()) return;
		if(offX >= pW) return;
		if(offY >= pH) return;
		
		int newX = 0;
		int newY = 0;
		int newWidth = image.getW();
		int newHeight = image.getH();
		
		if(offX < 0){newX -= offX;}
		if(offY < 0){newY -= offY;}
		if(newWidth + offX >= pW){newWidth -= newWidth + offX - pW;}
		if(newHeight + offY >= pH){newHeight -= newHeight + offY - pH;}
		
		for(int y = newY; y < newHeight; y++)
		{
			for(int x = newX; x < newWidth; x++)
			{
				setPixelWT(x + offX, y + offY, image.getP()[x + y * image.getW()]);
			}
		}
	}
	
	public void drawImageTileWT(ImageTile image, int offX, int offY, int tileX, int tileY)
	{
		//Transparency color HexCode: 0xffff00ff
		if(offX < -image.getTileW()) return;
		if(offY < -image.getTileH()) return;
		if(offX >= pW) return;
		if(offY >= pH) return;
		
		int newX = 0;
		int newY = 0;
		int newWidth = image.getTileW();
		int newHeight = image.getTileH();
		
		if(offX < 0){newX -= offX;}
		if(offY < 0){newY -= offY;}
		if(newWidth + offX >= pW){newWidth -= newWidth + offX - pW;}
		if(newHeight + offY >= pH){newHeight -= newHeight + offY - pH;}
		
		for(int y = newY; y < newHeight; y++)
		{
			for(int x = newX; x < newWidth; x++)
			{
				setPixelWT(x + offX, y + offY, image.getP()[(x + tileX * image.getTileW()) + (y + tileY * image.getTileH()) * image.getW()]);
			}
		}
	}
	
	public void drawRect(int offX, int offY, int width, int height, int color)
	{
		for(int y = 0; y < height; y++)
		{
			setPixel(offX, y + offY, color);
			setPixel(offX + width, y + offY, color);
		}
		
		for(int x = 0; x < width; x++)
		{
			setPixel(x + offX, offY, color);
			setPixel(x + offX, offY + height, color);
		}
	}
	
	public void drawFillRect(int offX, int offY, int width, int height, int color)
	{
		if(offX < -width) return;
		if(offY < -height) return;
		if(offX >= pW) return;
		if(offY >= pH) return;
		
		int newX = 0;
		int newY = 0;
		int newWidth = width;
		int newHeight = height;
		
		if(offX < 0){newX -= offX;}
		if(offY < 0){newY -= offY;}
		if(newWidth + offX >= pW){newWidth -= newWidth + offX - pW;}
		if(newHeight + offY >= pH){newHeight -= newHeight + offY - pH;}
		
		for(int y = newY; y < newHeight; y++)
		{
			for(int x = newX; x < newWidth; x++)
			{
				setPixel(x + offX, y + offY, color);
			}
		}
	}
}
