package SolarUtil;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
/*
 * @ming
 */
import java.awt.event.WindowEvent;

import javax.swing.text.AbstractDocument.Content;



/*
 * ��������
 */
public class GameFrame extends Frame{
	
//	Image image=GameUtil.getImage("images/img.jpg"); //���ö���õĹ����࣬����ͼƬ����
	
	/*
	 * ���ش���
	 */
	
	
	
	public void launchFrame(){ //�����������ڽ���
		setSize(800,600); //�������´�С
		setLocation(100,100);//���ô���λ��
		setVisible(true); //���ô��ڿɼ�
		
		
		new PaintThread().start(); //�����ػ�
		//��Ӵ��ڼ����¼������Թرմ���
		addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
	}
	

	

/*
 * ��ͼ
 * @see java.awt.Window#paint(java.awt.Graphics)
 */
//	@Override
//	public void paint(Graphics g) {
//
//		Font f=new Font("����", Font.BOLD,100);
//		g.setFont(f);
//		g.drawRect(100, 100, 200, 200);
//		g.drawString("ʦ�ֺ�", 200, 200);
//		//g.drawImage(image, (int)x,(int)y,null);
//		x+=3;
//		
//	}
	/*
	 * ץȡ�׳����쳣���ӳ�40s����
	 */
	class PaintThread extends Thread{
		public void run(){
			while(true){
				repaint();
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
