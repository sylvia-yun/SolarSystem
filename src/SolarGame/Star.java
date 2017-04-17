package SolarGame;

import java.awt.Graphics;
import java.awt.Image;

import SolarUtil.GameUtil;

/*
 * 把太阳等行星画出来
 */
public class Star {

	double width,height;
	double x,y;
	Image img;
	//构造方法
	
	public Star(){} //必须要有个空构造器，因为被其他的类继承了
	public Star(Image img){
		this.img=img;
		this.width=img.getWidth(null);
		this.height=img.getHeight(null);
	}
	public Star(Image img,double x,double y){
		this(img);  //调用上面的构造器
		this.x=x;
		this.y=y;
	}
	void draw(Graphics g){
		g.drawImage(img, (int)x, (int)y, null);
	}
	public Star(String imagepath,double x,double y){
		this(GameUtil.getImage(imagepath),x,y);//调用上面的构造器
	}
	
}
