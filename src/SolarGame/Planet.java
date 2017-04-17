package SolarGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import SolarUtil.GameUtil;

/*
 * 要提供的参数有椭圆长轴长，短轴长，中心距离，偏转角度，速度
 */
/**
 * @author 云
 *
 */
public class Planet extends Star{

	double longAsic,shortAsic;
	double degree;
	double speed;
	Star center;
	boolean satellite;

	
	
	/**
	 * @param longAsics
	 */

	public Planet(Star center,String imgpath,double longAsic, double shortAsic, double degree,
			double speed) {
		super(GameUtil.getImage(imgpath));
		this.center = center;
		this.x=center.x+longAsic;
		this.y=center.y;
		this.longAsic = longAsic;
		this.shortAsic = shortAsic;
		this.degree = degree;
		this.speed = speed;
	}
	
	//该构造器用来传入是否是行星这一判断
	public Planet(Star center,String imgpath,double longAsic, double shortAsic, double degree,
			double speed,boolean satellite) {
		this(center,imgpath,longAsic,shortAsic,degree,speed);
		this.satellite=satellite;
	}
	public Planet(Image img, double x, double y) {
		super(img, x, y);
		// TODO Auto-generated constructor stub
	}
	public Planet(String imgpath,double  x,double y){
		super(imgpath, x, y);
	}
	//重新画地球
	void draw(Graphics g){
		g.drawImage(img, (int)x, (int)y, null);
		move();
		if(!satellite){  //判断是否是行星
		drawTrace(g);
		}
	}
	//地球运动
	void move(){
		x=center.x+center.width/2+longAsic*Math.cos(degree);
		y=center.y+center.height/2+shortAsic*Math.sin(degree);
		degree+=speed;
	}
	//把轨迹花出来
	void drawTrace(Graphics g){
		double OvalX,OvalY,OvalWidth,OvalHeight;
		OvalWidth=longAsic*2;
		OvalHeight=shortAsic*2;
		OvalX=center.x-longAsic+center.width/2;
		OvalY=center.y-shortAsic+center.height/2;
		
		Color c=g.getColor();//得到当前画笔颜色
		g.setColor(Color.blue);
		g.drawOval((int)OvalX, (int)OvalY, (int)OvalWidth, (int)OvalHeight);
		g.setColor(c);
	}

}
