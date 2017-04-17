package SolarGame;

import java.awt.Graphics;
import java.awt.Image;
import SolarUtil.GameFrame;
import SolarUtil.GameUtil;

/*
 * 太阳系主入口
 */
public class SolarFrame extends GameFrame{
	
	//导入背景图案
	Image bg=GameUtil.getImage("images/bg.jpg");
	//将各个行星导入进去
	Star sun=new Star("images/sun.jpg",400,300);
	Planet earth=new Planet(sun,"images/earth.jpg", 150, 100,1.14,0.14);
	Planet mars=new Planet(sun,"images/Mars.jpg", 200, 140,1.1,0.1);
	Planet moon=new Planet(earth,"images/Moon.jpg", 30, 20,1.1,0.3,true);
	Planet venus=new Planet(sun,"images/Venus.jpg", 300, 160,1.14,0.08,false);
	
	
	//画出背景和太阳
	public void paint(Graphics g){
		g.drawImage(bg, 0,0,null);
		sun.draw(g);
		earth.draw(g);
		mars.draw(g);
		moon.draw(g);
		venus.draw(g);
	}
	public static void main(String[] args) {
		new SolarFrame().launchFrame();
	}

}
