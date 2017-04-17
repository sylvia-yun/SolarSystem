package SolarGame;

import java.awt.Graphics;
import java.awt.Image;

import SolarUtil.GameUtil;

/*
 * ��̫�������ǻ�����
 */
public class Star {

	double width,height;
	double x,y;
	Image img;
	//���췽��
	
	public Star(){} //����Ҫ�и��չ���������Ϊ����������̳���
	public Star(Image img){
		this.img=img;
		this.width=img.getWidth(null);
		this.height=img.getHeight(null);
	}
	public Star(Image img,double x,double y){
		this(img);  //��������Ĺ�����
		this.x=x;
		this.y=y;
	}
	void draw(Graphics g){
		g.drawImage(img, (int)x, (int)y, null);
	}
	public Star(String imagepath,double x,double y){
		this(GameUtil.getImage(imagepath),x,y);//��������Ĺ�����
	}
	
}
