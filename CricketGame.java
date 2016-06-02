
//Glory Jain
//Testing Plan: The user should click where they plan to hit, and then use the lines to guide where they want to hit towards.
	//The area should be where the user wants to hit i.e. North interacts with North, South does not interact with North.
    //Earn points based on how well the user hits the ball according to ball player's position
	

import java.awt.*; //import Scanners
import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;

public class CricketGame extends JFrame{//Game class header extends JFrame
private CardLayout ca;//declare all variables
private JPanel cards;
private int counter;
	public static void main(String[]args){ //public static void
	CricketGame game = new CricketGame();		//MainPanel mp = MainPanel
		}	
		
		public CricketGame(){//Game constructor header
			super("Hitter");//super
			setSize(1000,560);//set Size
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);//setDefaultCloseOperation(DISPOSE_ON_CLOSE)                                                                         
			setLocation(10,50);//setLocation(10,50)
			setResizable(true);//setResizable(true)
			ca = new CardLayout();
			cards = new JPanel(); 
			cards.setLayout(ca);	//declare and instantiate cardLayout
			MainPanel p = new MainPanel();//make an instance of mainPanel
			NorthPlay no = new NorthPlay();//make an instance of NorthPlay, no
			SouthPlay so = new SouthPlay();
			PointsCard1 point1 = new PointsCard1();
			PointsCard2 point2 = new PointsCard2();
			PointsCard4 point4 = new PointsCard4();
			PointsCard6 point5 = new PointsCard6();
			Out out = new Out();
			cards.add(p,"p");
			cards.add(no, "no");//add no
			cards.add(so, "so");
			cards.add(point1, "point1");
			cards.add(point1, "point2");
			cards.add(point1, "point3");
			cards.add(point1, "point4");
			cards.add(point1, "point6");
			cards.add(out, "out");
			cards.setBackground(Color.YELLOW);
			setContentPane(cards);
			setVisible(true);//setVisible(true);
	
	
		}



		
class MainPanel extends JPanel{//class mainPanel implements ActionListener				
	PanelNorth a;
	PanelSouth b;
	PanelWest c;
	PanelEast d;
	PanelField e;
	public MainPanel(){//mainPanel Constructor
		BorderLayout bl = new BorderLayout();
		setLayout(bl); //set the borderlayout
		a = new PanelNorth(); //declare and initialize different panels
		b = new PanelSouth();
		c = new PanelWest();
		d = new PanelEast();
		e = new PanelField();
		add(a, BorderLayout.NORTH); 
		add(b, BorderLayout.SOUTH);
		add(c, BorderLayout.WEST);
		add(d, BorderLayout.EAST);
		add(e, BorderLayout.CENTER);
			System.out.println("meow");	
	}
	public void paintComponent(Graphics g){
		setBackground(Color.PINK);
		super.paintComponent(g);
	}
	

}		 



class PanelNorth extends JPanel implements ActionListener{//PanelNorth
private JButton north; //private JButton North
private boolean pressed = false;
		PanelNorth(){//constructor
		setLayout(null);
		setPreferredSize(new Dimension(200,138));
		north = new JButton("North");
		north.setBounds(200, 70, 100, 50);
		north.addActionListener(this);//add Action Listener
		add(north);//add North Button
		System.out.println("There");	
	} 		
	public void paintComponent(Graphics g){ //paintComponent
		int x=0;
		int y=0;
		setBackground(Color.GREEN);//set background
		super.paintComponent(g);
		g.setColor(Color.BLACK);//paint
		//for(y=0;y<100;y+=20){//makes horizontal lines
			//g.drawLine(x,y,x, y+100);	
		//}
		g.setColor(Color.RED);//set color to red
		g.fillOval(150,20,30,30);//create two dots equidistant from the center
		g.fillOval(350,20,30,30);
		System.out.println("Hi");
	}
	public void actionPerformed (ActionEvent e) {
		pressed=true;
		if(pressed)
			ca.show(cards,"no");
		}
}
		
class PanelSouth extends JPanel implements ActionListener{//PanelSouth
private JButton south; //private JButton South
private boolean pressed = false;
	PanelSouth(){//constructor
		setLayout(null);
		setPreferredSize(new Dimension(200,138));
		south = new JButton("South");
		south.setBounds(200, 70, 100, 50);
		south.addActionListener(this);//add Action Listener
		add(south);//add Button 
	}
	public void paintComponent(Graphics g){	//paintComponent
		int x=0;
		int y=0;
		setBackground(Color.GREEN);	//set background
		super.paintComponent(g);
		g.setColor(Color.BLACK);//paint
		//for(y=0;y<100;y+=20){
			//g.drawLine(x,y,x, y+50);	
		//}		//makes horizontal lines
		g.setColor(Color.RED);//set color to red
		g.fillOval(150,20,30,30);
		g.fillOval(350,20,30,30);//create two dots equidistant from the center
	}	
	public void actionPerformed (ActionEvent e) {
		pressed=true;
		if(pressed)
			ca.show(cards,"so");
		}
}
		
class PanelEast extends JPanel implements ActionListener{//PanelEast
private JButton easteast;//private JButton East
private boolean pressed = false;
	PanelEast(){//constructor
		setLayout(null);
		setPreferredSize(new Dimension(100,550));
		easteast = new JButton("East");
		easteast.setBounds(0, 150, 100, 50);
		easteast.addActionListener(this);//add Action Listener
		add(easteast);//add Button 
	
		
		
	}
	public void paintComponent(Graphics g){	
		setBackground(Color.GREEN);//set background
		super.paintComponent(g);
		int x=0;
		int y=0;
		
		g.setColor(Color.BLACK);//paint
		//for(y=0;y<100;y+=20){
			//g.drawLine(x,y,x, y+10);	
		//}//makes vertical lines
		g.setColor(Color.RED);//set color to red
		g.fillOval(20,20,30,30);//create two dots equidistant from the center
		g.fillOval(20,80,30,30);			
		
	}

	public void actionPerformed (ActionEvent e) {
		pressed=true;
		if(pressed)
			ca.show(cards,"so");
		}
} 		
	

class PanelWest extends JPanel implements ActionListener{//PanelWest
private JButton west;//private JButton West
private boolean pressed = false;
	PanelWest(){	//constructor
		setLayout(null);
		setPreferredSize(new Dimension(133,150));
		west = new JButton("West");
		west.setBounds(15, 150, 100, 50);
		west.addActionListener(this);//add Action Listener
		add(west);//add Button 
}

public void paintComponent(Graphics g){	//paintComponent
		int x=0;
		int y=0;
		setBackground(Color.GREEN);	//set background
		super.paintComponent(g);
		g.setColor(Color.BLACK);//paint
		//for(y=0;y<150;y+=20){
		//	g.drawLine(x,y,x+50, y);	
		//}
		//makes vertical lines
		g.setColor(Color.RED);//set color to red
		g.fillOval(20,20,30,30);//create two dots equidistant from the center
		g.fillOval(20,80,30,30);		
}
	public void actionPerformed (ActionEvent e) {
		pressed=true;
		if(pressed)
			ca.show(cards,"so");
		}
}

class PanelField extends JPanel{//PanelField
private JButton field;//private JButton Field
private boolean pressed = false;
	PanelField(){//constructor
		setLayout(null);
		setPreferredSize(new Dimension(50,100));
	} 
public void paintComponent(Graphics g){		//paintComponent
		setBackground(Color.GREEN);//set background
		super.paintComponent(g);
		g.setColor(Color.ORANGE);//set color to orange-ish yellow color
		g.fillRect(67,60,100,200);//make a rectangle in the middle
		//g.drawImage();//20 pixels in from both the north and south side, have an image of a blue player
		g.setColor(Color.BLUE);
		g.drawString("Click on the region you want to hit in!",50,50);
		g.setColor(Color.BLUE);
		g.fillOval(100,80,30,30);
		g.fillOval(100,200,30,30);
}

}
		
class NorthPlay extends JPanel implements MouseListener{//North panel, extends ActionListener
private int field1x, field1y, field2x, field2y, clickx,clicky;//private int field1x, field11y, field2x, field2y, clickx,clicky; each represent the x and y coordinate 
private int pointCounter=0;//private int pointCounter;
private boolean out;	//private boolean out	
private int x,y;
private JButton back;
private boolean clicked;

	NorthPlay(){//constructor
		addMouseListener(this); //add ears to Panel		
		clicked = false;
		out=false; 
	}


	public void paintComponent(Graphics g){//paintComponent header
		setBackground(Color.GREEN);//backgroundColor green
		super.paintComponent(g);//super
		g.setColor(Color.RED);//set color to black
		for(y=0; y<1000;y+=50)//use a for loop to draw vertical lines for every 50 pixels
			g.drawLine(x,0,x,x+100);
		field1x=(int)(Math.random()*500+1);//use Mathrandom to figure out locations of field1x, field1y
		field1y=(int)(Math.random()*500+1);
		field2x=(int)(Math.random()*500+1);		
		field1y=(int)(Math.random()*500+1);	//use Mathrandom to figure out locations of field2x, field2y
//		drawImage(redplayer, field1x, field1y, this);//draw an Image of a red player at field1x, field1y
	//	drawImage(redplayer, field2x, field2y, this);//draw an Image of a red player at field2x, field2y
		//if(out==true){//if out is true
			//drawImage(ref,0,0,this);//drawImage of a referee crossing hands at out
		g.fillOval(field1x,field1y,25,25);
		g.fillOval(field2x,field2y,25,25);			
		g.drawString("Try to avoid the players in red",100,100);

	}


	public void mouseClicked(MouseEvent e){//mouseClicked
		clickx = e.getX();//get position
		clicky = e.getY();
		System.out.println(field1x);
		System.out.println(field1y);
		System.out.println(field2x);
		System.out.println(field2y);
		System.out.println(clickx);
		System.out.println(clicky);
		if(((field1x-5)<clickx && clickx<(field1x+5)) || ((field1y-5)<clicky && clicky<(field1y+5))	||	((field2x-5)<clickx && clickx<(field2x+5)) || ((field2y-5)<clicky && clicky<(field2y+5))){//if clickx or clicky is within 50 pixels of field1x/field1y or field2x/field2y
			counter+=0;//pointCounter=0;
			clicked = false;
			out=true;//out=true;
			
			}
		else if (((field1x-20)<clickx && clickx<(field1x+20)) || ((field1y-20)<clicky && clicky<(field1y+20))	||	((field2x-20)<clickx && clickx<(field2x+20)) || ((field2y-20)<clicky && clicky<(field2y+20))){ //else if clickx or clicky is within 100 pixels of field1x/field1y or field2x/field2y
			pointCounter+=1;//pointCounter increments by 1;
			clicked = true;
			ca.show(cards,"point1");
		}
		else if(((field1x-25)<clickx && clickx<(field1x+25)) || ((field1y-25)<clicky && clicky<(field1y+25))	||	((field2x-25)<clickx && clickx<(field2x+25)) || ((field2y-25)<clicky && clicky<(field2y+25))){//else if clickx or clicky is within 125 pixels of field1x/field1y or field2x/field2y
			counter+=2;//pointCounter increments by 2;
			clicked = true;
			ca.show(cards,"point2");
		}
		else if(((field1x-150)<clickx && clickx<(field1x+50)) || ((field1y-50)<clicky && clicky<(field1y+50))	||	((field2x-50)<clickx && clickx<(field2x+50)) || ((field2y-50)<clicky && clicky<(field2y+50))){//else if clickx or clicky is within 125 pixels of field1x/field1y or field2x/field2y
			counter+=4;//pointCounter increments by 4;	
			clicked = true;
			ca.show(cards,"point4");
			}
		else{//else 
			counter+=6;//pointCounter increments by 6;
			clicked = true;
			ca.show(cards,"point6");
			}
		if(out)
			ca.show(cards, "out");
	}		
			
	public void mouseReleased(MouseEvent e){}//mouse Released
	public void mousePressed(MouseEvent e){} //mousePressed
	public void mouseEntered(MouseEvent e){}//mouseEntered
	public void mouseExited(MouseEvent e){}	//mouseExited
	

}	

class SouthPlay extends JPanel implements MouseListener{//North panel, extends ActionListener
private int field1x, field1y, field2x, field2y, clickx,clicky;//private int field1x, field11y, field2x, field2y, clickx,clicky; each represent the x and y coordinate 
private int pointCounter;//private int pointCounter;
private boolean out;	//private boolean out	
private int x,y;
private JButton back;
private boolean clicked;

	SouthPlay(){//constructor
		addMouseListener(this); //add ears to Panel		
		clicked = false;
		out=false; 
	}


	public void paintComponent(Graphics g){//paintComponent header
		setBackground(Color.GREEN);//backgroundColor green
		super.paintComponent(g);//super
		g.setColor(Color.RED);//set color to black
		for(y=0; y<1000;y+=50)//use a for loop to draw vertical lines for every 50 pixels
			g.drawLine(x,0,x,x+100);
		field1x=(int)(Math.random()*500+1);//use Mathrandom to figure out locations of field1x, field1y
		field1y=(int)(Math.random()*500+1);
		field2x=(int)(Math.random()*500+1);		
		field1y=(int)(Math.random()*500+1);	//use Mathrandom to figure out locations of field2x, field2y
//		drawImage(redplayer, field1x, field1y, this);//draw an Image of a red player at field1x, field1y
	//	drawImage(redplayer, field2x, field2y, this);//draw an Image of a red player at field2x, field2y
		//if(out==true){//if out is true
			//drawImage(ref,0,0,this);//drawImage of a referee crossing hands at out
		g.fillOval(field1x,field1y,25,25);
		g.fillOval(field2x,field2y,25,25);			
		g.drawString("Try to avoid the players in red",100,100);
		
		//pass pointCounter to main
		//repaint();//go back to mainPanel card
		//show(f);
	}


	public void mouseClicked(MouseEvent e){//mouseClicked
		clickx = e.getX();//get position
		clicky = e.getY();
		if(((field1x-20)<clickx && clickx<(field1x+20)) || ((field1y-20)<clicky && clicky<(field1y+20))	||	((field2x-20)<clickx && clickx<(field2x+20)) || ((field2y-20)<clicky && clicky<(field2y+20))){//if clickx or clicky is within 50 pixels of field1x/field1y or field2x/field2y
			counter+=0;//pointCounter=0;
			out=true;//out=true;
			clicked=false;
			}
		else if (((field1x-40)<clickx && clickx<(field1x+40)) || ((field1y-40)<clicky && clicky<(field1y+40))	||	((field2x-40)<clickx && clickx<(field2x+40)) || ((field2y-40)<clicky && clicky<(field2y+40))){ //else if clickx or clicky is within 100 pixels of field1x/field1y or field2x/field2y
			counter+=1;//pointCounter increments by 1;
			clicked = true;
			ca.show(cards,"point1");
		}
		else if(((field1x-60)<clickx && clickx<(field1x+60)) || ((field1y-60)<clicky && clicky<(field1y+60))	||	((field2x-60)<clickx && clickx<(field2x+60)) || ((field2y-60)<clicky && clicky<(field2y+60))){//else if clickx or clicky is within 125 pixels of field1x/field1y or field2x/field2y
			counter+=2;//pointCounter increments by 2;
			clicked = true;
			ca.show(cards,"point2");
		}
		else if(((field1x-80)<clickx && clickx<(field1x+80)) || ((field1y-80)<clicky && clicky<(field1y+80))	||	((field2x-80)<clickx && clickx<(field2x+80)) || ((field2y-80)<clicky && clicky<(field2y+80))){//else if clickx or clicky is within 125 pixels of field1x/field1y or field2x/field2y
			counter+=4;//pointCounter increments by 4;	
			clicked = true;
			ca.show(cards,"point4");
		}
		else{//else 
			counter+=6;//pointCounter increments by 6;
			clicked = true;
			ca.show(cards,"point6");
			}

		if(out)
			ca.show(cards, "out");
	}		
			
	public void mouseReleased(MouseEvent e){}//mouse Released
	public void mousePressed(MouseEvent e){} //mousePressed
	public void mouseEntered(MouseEvent e){}//mouseEntered
	public void mouseExited(MouseEvent e){}	//mouseExited
	

}
	
class PointsCard6 extends JPanel implements ActionListener{
private JButton mainScreen;
private boolean pressedPC;
private String pointteller;
	PointsCard6(){
		pressedPC = false;
		mainScreen = new JButton("Go back to Main Screen!");
		mainScreen.addActionListener(this);//add Action Listener
		add(mainScreen);//add Button
		pointteller = counter + "";
	}
public void paintComponent(Graphics g){//paintComponent header
	setBackground(Color.BLUE);
	super.paintComponent(g);
	g.setColor(Color.WHITE);
	g.drawString("You have earned", 325, 125);
	g.drawString("6",350,150);
	g.drawString("points", 375,175);
 }

public void actionPerformed (ActionEvent e) {
	pressedPC = true;
	if(pressedPC)
	ca.show(cards, "p");
}

}

class PointsCard1 extends JPanel implements ActionListener{
private JButton mainScreen;
private boolean pressedPC;
private String pointteller;
	PointsCard1(){
		pressedPC = false;
		mainScreen = new JButton("Go back to Main Screen!");
		mainScreen.addActionListener(this);//add Action Listener
		add(mainScreen);//add Button
		pointteller = counter + "";
	}
public void paintComponent(Graphics g){//paintComponent header
	setBackground(Color.BLUE);
	super.paintComponent(g);
	g.setColor(Color.WHITE);
	g.drawString("You earned", 325, 125);
	g.drawString("1",350,150);
	g.drawString("point", 375,175);
 }

public void actionPerformed (ActionEvent e) {
	pressedPC = true;
	if(pressedPC)
	ca.show(cards, "p");
}

}

class PointsCard2 extends JPanel implements ActionListener{
private JButton mainScreen;
private boolean pressedPC;
private String pointteller;
	PointsCard2(){
		pressedPC = false;
		mainScreen = new JButton("Go back to Main Screen!");
		mainScreen.addActionListener(this);//add Action Listener
		add(mainScreen);//add Button
		pointteller = counter + "";
	}
public void paintComponent(Graphics g){//paintComponent header
	setBackground(Color.BLUE);
	super.paintComponent(g);
	g.setColor(Color.WHITE);
	g.drawString("You have", 325, 125);
	g.drawString("earned 2",350,150);
	g.drawString("points", 375,175);
 }

public void actionPerformed (ActionEvent e) {
	pressedPC = true;
	if(pressedPC)
	ca.show(cards, "p");
}

}


class PointsCard4 extends JPanel implements ActionListener{
private JButton mainScreen;
private boolean pressedPC;
private String pointteller;
	PointsCard4(){
		pressedPC = false;
		mainScreen = new JButton("Go back to Main Screen!");
		mainScreen.addActionListener(this);//add Action Listener
		add(mainScreen);//add Button
		pointteller = counter + "";
	}
public void paintComponent(Graphics g){//paintComponent header
	setBackground(Color.BLUE);
	super.paintComponent(g);
	g.setColor(Color.WHITE);
	g.drawString("You have earned", 325, 125);
	g.drawString("4",350,150);
	g.drawString("points", 375,175);
 }

public void actionPerformed (ActionEvent e) {
	pressedPC = true;
	if(pressedPC)
	ca.show(cards, "p");
}

}



class Out extends JPanel implements ActionListener{
private JButton mainScreen;
private boolean pressedOut;
	Out(){
	pressedOut = false;
	mainScreen = new JButton("Go back to Main Screen!");
	mainScreen.addActionListener(this);//add Action Listener
	add(mainScreen);//add Button
}
	public void actionPerformed (ActionEvent e) {
		pressedOut = true;
		if(pressedOut)
		ca.show(cards, "p");
	}
	public void paintComponent(Graphics g){//paintComponent header
		setBackground(Color.RED);
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawString("You are out!",50,50);
 }

}
}