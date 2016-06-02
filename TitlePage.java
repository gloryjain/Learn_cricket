//This is the title page for the game. It will have buttons that will takeyou

//to the game, as well as directions. The buttons will light up when you move your mouse over it.
//maroon = 144, ,62, 70



import javax.swing.*;

import javax.swing.JFrame;

import java.awt.Graphics;

import javax.swing.JPanel;

import java.awt.Color;

import java.awt.*;

import java.awt.GraphicsEnvironment;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;


public class TitlePage extends JFrame{
BowlGame bg;
CardLayout cc;
Blank b;
Holder h;
HowToPlay htp;
Directions d;
BMain f;
CardLayout c;//CardLayout declared as global
FirstGame pp;//declare class instance for FirstGame
HitterHits q;
Test test;
    public static void main(String [] sfsd){

        TitlePage t = new TitlePage();

    }

    public TitlePage(){
		  super("Title");
		bg = new BowlGame();
		b = new Blank();
		htp = new HowToPlay();
		d = new Directions();
		 test = new Test();
		f = new BMain();
       
        h = new Holder();
		
        setSize(1000,1000);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setContentPane(h);

setVisible(true);

    }

class Holder extends JPanel{
	Holder(){
		cc = new CardLayout();
		setLayout(cc);
		add(b, "TitlePage");
		add(bg, "BowlerGame");
		add(htp, "HowToPlay");
		add(d, "Directions");
		add(f, "BMain");
		add(test, "Test");
	}
}

class Blank extends JPanel implements MouseListener{//implements MouseListener
boolean over = false;


    Blank(){
		addMouseListener(this);
		

    }

    public void paintComponent(Graphics g){

        Color x = new Color(51, 153, 255);

        setBackground(x);

        super.paintComponent(g);

        Color a = new Color(255,255, 51);

        g.setColor(a);

        Font f = new Font("Garamond", Font.BOLD, 60);

        g.setFont(f);

        g.drawString("Virtual Cricket", 265, 150);

        g.setColor(Color.GREEN);//change to dark green (make color scheme like a cricket field)


        Color b = new Color(255,102,102);

        g.setColor(Color.WHITE);

        g.drawString("Choose a Perspective", 200, 250);

        Color z = new Color(255,153,31);//wicket



        g.setColor(Color.RED);

        g.fillRect(190, 300, 280, 80);

        g.setColor(z);//change to color of wicket



        g.fillRect(520, 300, 280, 80);

        Color y = new Color(102, 204,0);

        g.setColor(y);

        g.fillRect(0, 400, 1000, 600);
        
        g.setColor(new Color(220, 158, 80));
        g.fillRect(0, 400, 1000, 100);

        g.setColor(Color.WHITE);

 g.drawString("Bowler", 230, 363);

        g.drawString("Batsman", 535, 363);

        g.drawString("How to Play Cricket", 205, 463);

    }

     public void mouseClicked(MouseEvent e){
		if(e.getX() > 190 && e.getX() < 370 && e.getY() > 300 && e.getY() < 380){ //if mouse is on a button, change a boolean to make it a different color
				cc.show(h, "BowlerGame");
			}
		if(e.getY()>400)
			cc.show(h, "HowToPlay");

	}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
}
class BowlGame extends JPanel implements ActionListener{
JTextField title;
JButton directions;
JButton play;
JButton test;
JButton back;
	BowlGame(){
		title = new JTextField("           Bowler Cricket Hangman", 24);
		Font p = new Font("Serif", Font.BOLD, 50);
		title. setFont(p);
		setLayout(new GridLayout(5,1));
		directions = new JButton("Directions");
		play = new JButton("Play");
		test = new JButton("Test");
		back = new JButton("Back");
		directions.setFont(p);
			play.setFont(p);
				test.setFont(p);
					back.setFont(p);
		add(title);
		add(directions);
		add(play);
		add(test);
		add(back);
		directions.addActionListener(this);
		play.addActionListener(this);
		test.addActionListener(this);
		back.addActionListener(this);
	title.setBackground(new Color(0, 255, 128));
	directions.setBackground(new Color(51, 255, 51));
	play.setBackground(new Color(153, 255, 153));
	test.setBackground(new Color(178, 255, 102));
	back.setBackground(new Color(0, 204, 0));
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == directions)
			cc.show(h, "Directions");
		if(e.getSource() == play)
			cc.show(h, "BMain");
		if(e.getSource() == test)
			cc.show(h, "Test");
		if(e.getSource() == back)
			cc.show(h, "TitlePage");
		}
}
	
class HowToPlay extends JPanel implements ActionListener{
	JButton back;
	JTextArea how;
	HowToPlay(){
			back = new JButton("Back");
			add(back);
			back.addActionListener(this);
			Font p = new Font("Serif", Font.BOLD, 20);
	
			how =  new JTextArea( "A match is played between two teams with each team having eleven players (junior cricket teams sometimes have eight players). One player from each team is the designated captain.One team fields while the other team is the batting side. The fielding team bowls the cricket ball at the wickets, held up by stumps (pictured below) who tries to hit the ball with their bat. The fielding team is trying to get the batsmen out whilst the batting team is trying to score as many runs as they can without getting out. One bowler will bowl what is called an over. On over consists of six balls. Off each delivery a batsmen can either not score or score 1 through to 6. The object of the game is to score more runs than the opposing team." , 15,53);
			how. setFont(p);
			Color x = new Color(51, 153, 255);
			how.setBackground(x);
			add(how);
			how.setLineWrap(true);
			how.setWrapStyleWord(true);
	}
	public void paintComponent(Graphics g){
		 Color x = new Color(51, 153, 255);

        setBackground(x);

        super.paintComponent(g);
        Color y = new Color(102, 204,0);

        g.setColor(y);

        g.fillRect(0, 400, 1000, 600);
        
        Color wicket = new Color( 250, 190, 0);
        g.setColor(wicket);
		g.fillRect(230+220, 380, 50, 10);
		g.fillRect(230+220, 390, 10, 80);
		g.fillRect(250+220, 390, 10, 80);
		g.fillRect(270+220, 390, 10, 80);
		g.fillRect(230+220, 470, 50, 10);//wickets
		}
	public void actionPerformed(ActionEvent e){	
		if(e.getSource() == back)
			cc.show(h, "TitlePage");
	}
}
class Directions extends JPanel implements ActionListener{
	JButton back;
	JTextArea how;
	Directions(){
			back = new JButton("Back");
			add(back);
			back.addActionListener(this);
			Font p = new Font("Serif", Font.BOLD, 22);
	
			how =  new JTextArea("This is cricket from the bowler's perspective. The bowler (you) will move the position of the ball to shoot at the wickets. However, there is a batsman in the way. He will move around, trying to get in the way of the ball and the wickets. The batsman wants to hit the ball so that his teammates can run back and forth a certain distance to score runs. You are trying to knock the wickets over so that the batsman will not get any points. When you hit the wickets, the batsman becomes out (or in this case, loses a body part) and scores no points. If the batsman hits the ball, then he gets a certain score from 1 through 6 based on how many runs his team makes. YOUR GOAL IS TO MAKE THE BATSMAN LOSE ALL HIS BODY PARTS BEFORE THE BATSMAN'S TEAM REACHES A SCORE OF 30.", 15,50);
			how. setFont(p);
			Color x = new Color(51, 153, 255);
			how.setBackground(x);
			add(how);
			how.setLineWrap(true);
			how.setWrapStyleWord(true);
	}
	public void paintComponent(Graphics g){
		Color x = new Color(51, 153, 255);

        setBackground(x);

        super.paintComponent(g);
        Color y = new Color(102, 204,0);

        g.setColor(y);

        g.fillRect(0, 400, 1000, 600);
        
		}
	public void actionPerformed(ActionEvent e){	
		if(e.getSource() == back)
			cc.show(h, "BowlerGame");
	}	
}	
class Test extends JPanel implements ActionListener{//ADD TEST HERE
	JButton back;
	ButtonGroup bg1;
	JTextField q1;
	JRadioButton a11;
	JRadioButton a12;
	JRadioButton a13;
	JRadioButton a14;
	ButtonGroup bg2;
	JTextField q2;
	JRadioButton a21;
	JRadioButton a22;
	JRadioButton a23;
	JRadioButton a24;
	ButtonGroup bg3;
	JTextField q3;
	JRadioButton a31;
	JRadioButton a32;
	JRadioButton a33;
	JRadioButton a34;
	ButtonGroup bg4;
	JTextField q4;
	JRadioButton a41;
	JRadioButton a42;
	JRadioButton a43;
	JRadioButton a44;
	
	GoodJob gj;
	
	boolean right;
	boolean action;
	Test(){
		setLayout(new GridLayout(22, 1));
		
		bg1 = new ButtonGroup();
			bg2= new ButtonGroup();
				bg3 = new ButtonGroup();
					bg4 = new ButtonGroup();
		
		q1 = new JTextField("What is the name of the item you are trying to knock over?", 70);
		a11 = new JRadioButton("stumps");
		a12 = new JRadioButton("sticks");
		a13 = new JRadioButton("wickets");
		a14 = new JRadioButton("legs");
		
		q2 = new JTextField("What are the possible scores the batsman's team can get?(if the batsman hits the ball)", 70);
		a21 = new JRadioButton("0 to 100");
		a22 = new JRadioButton("1 to 7");
		a23 = new JRadioButton("0 to 6");
		a24 = new JRadioButton("1 to 6");
		
		q3 = new JTextField("How does the batsman's team score runs?", 70);
		a31 = new JRadioButton("How far the ball goes");
		a32 = new JRadioButton("Based on how many stumps are knocked over");
		a33 = new JRadioButton("How many times the batsman's team runs a certain distance before the ball is caught and returned");
		a34 = new JRadioButton("How happy the batsman is");
		
		q4 = new JTextField("What sport is cricket most similar to?", 70);
		a41 = new JRadioButton("Baseball");
		a42 = new JRadioButton("Badminton");
		a43 = new JRadioButton("Hockey");
		a44 = new JRadioButton("Basketball");
		
		
		add(q1);
		add( a11);
		add (a12);
		add( a13);
		add (a14);
		
		add( q2);
		add (a21);
		add (a22);
		add (a23);
		add (a24);
		
		add (q3);
		add (a31);
		add (a32);
		add (a33);
		add (a34);
		
		add (q4);
		add (a41);
		add (a42);
		add (a43);
		add (a44);
		
		bg1.add( a11);
		bg1.add (a12);
		bg1.add( a13);
		bg1.add (a14);
		
		bg2.add (a21);
		bg2.add (a22);
		bg2.add (a23);
		bg2.add (a24);

		bg3.add (a31);
		bg3.add (a32);
		bg3.add (a33);
		bg3.add (a34);
		
		bg4.add (a41);
		bg4.add (a42);
		bg4.add (a43);
		bg4.add (a44);
		
		a13.addActionListener(this);
		a24.addActionListener(this);
		a33.addActionListener(this);
		a41.addActionListener(this);
		
		a11.setBackground(new Color(51, 153, 255));
		a12.setBackground(new Color(51, 153, 255));
		a13.setBackground(new Color(51, 153, 255));
		a14.setBackground(new Color(51, 153, 255));
		
		a21.setBackground(new Color(51, 153, 255));
		a22.setBackground(new Color(51, 153, 255));
		a23.setBackground(new Color(51, 153, 255));
		a24.setBackground(new Color(51, 153, 255));
		
		a31.setBackground(new Color(51, 153, 255));
		a32.setBackground(new Color(51, 153, 255));
		a33.setBackground(new Color(51, 153, 255));
		a34.setBackground(new Color(51, 153, 255));
		
		a41.setBackground(new Color(51, 153, 255));
		a42.setBackground(new Color(51, 153, 255));
		a43.setBackground(new Color(51, 153, 255));
		a44.setBackground(new Color(51, 153, 255));
		
		q1.setBackground(new Color( 250, 220, 0));
		q2.setBackground(new Color( 250, 220, 0));
		q3.setBackground(new Color( 250, 220, 0));
		q4.setBackground(new Color( 250, 220, 0));
		
		gj = new GoodJob();
		add(gj);
		back = new JButton("Back");
		back.setBackground(new Color(102, 204,0));
		
		add(back);
		back.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == back)
			cc.show(h, "BowlerGame");
			
		if(a13.isSelected())
			if(a24.isSelected())
				if(a33.isSelected())
					if(a41.isSelected()){
						action = true;
						right = true;
					}
						gj.repaint();
					
						
		}
	public void paintComponent(Graphics g){
	Color x = new Color(51, 153, 255);

        setBackground(x);

        super.paintComponent(g);
	}

	class GoodJob extends JPanel{
		GoodJob(){}
		public void paintComponent(Graphics g){
			g.setFont(new Font("Serif", Font.BOLD, 15));
			g.setColor(Color.RED);
		if(action){	
			if(right)
				g.drawString("Good Job!",450, 30);
			else
				g.drawString("Try again", 20, 30);
			}
		}
	}
}
	
class BMain extends JPanel{//**BMain class header**
Win e;
Lose g;
BallerHitsWickets bhw;//declare class instance for BallerHitsWickets
	public BMain(){//constructor
		c = new CardLayout();
		setLayout(c);// set CardLayout
		pp = new FirstGame();//initialize class instance for FirstGame
		bhw = new BallerHitsWickets();//initialize class instance for BallerHitsWickets
		q = new HitterHits();//initialize class instance for HitterHits
		e = new Win();
		g = new Lose();
		add(pp, "FirstGame");//add FirstGame to cardLayout
		add(bhw, "Bowler");//add BallerHitsWickets to cardLayout
		add(q, "Hitter");//add HitterHits to cardLayout
		add(e, "Win");
		add(g, "Lose");
	}
	
}

public class FirstGame extends JPanel implements ActionListener, ChangeListener{//**FirstGame class header extends JPanel implements MouseListener, ActionListener, nested in Baller**ADD MOUSE LISTENER IN LATER
int sliderValue = 275;//declare int sliderValue
int score = 0;//declare int score
JTextArea ta;//declare TextArea
JSlider slide;
GraphicsPanel gp;
String hs = "Batsman's Score: ";
String scoreS = hs;
SliderClass s;
JButton go;
int hangman = 0;
	FirstGame(){//constructor
		setLayout(new BorderLayout());//set border layout
		Font f = new Font ("Italic", Font.BOLD, 20);
		ta = new JTextArea(scoreS, 2,10);//initialize TextField, will contain score of the hitter
		ta.setFont(f);
		ta.setWrapStyleWord(true);
		ta.setEditable(false);
		add(ta, BorderLayout.EAST);
		s = new SliderClass();
		add(s, BorderLayout.SOUTH);
		gp = new GraphicsPanel();
		add(gp, BorderLayout.CENTER);//add panel that will contain graphics to center
		
	}
	public void actionPerformed(ActionEvent e){
	}
	public void stateChanged(ChangeEvent e){//stateChanged method header
		sliderValue = slide.getValue();//sliderValue = value of the slider
		sliderValue = sliderValue * 65;//sliderValue = sliderValue *10
		gp.repaint();
	}
	public void recieveScore(int runs){//recieveScore method header, parameter int runs
		score = score + runs;//score = score + runs
		scoreS = hs + score;//make the int a string
		ta.setText(scoreS);//set text of text field to ("Score" + score)
		ta.repaint();
		if(score > 29){
			c.show(f, "Lose");
		}
		if(hangman >= 7)
			c.show(f, "Win");
	}

	class GraphicsPanel extends JPanel{//**GraphicsPanel class header extends JPanel, nested in FirstGame**
		public void paintComponent(Graphics g){//paintComponent header
			//paint graphics of ball, wicket, hitter
			//draw String with directions: "Move the slider to move the position of the ball. When you finish choosing the position of the ball, press 'GO' to shoot the ball"
			//x-coordinate position of ball is determined by sliderValue
				int n = 500;
				n = (int)(Math.random()*650);
				int [] x = {n-30 , n + 10, n +20, n +15, n+40, n + 35, n +13, n+10, n-50, n-30};
				int [] y = {30, 60, 80, 85, 100, 105, 95, 100, 40, 40};
				
				int [] x2 = {n + 50, n +80 , n+ 30, n+30 , n+60, n+ 50};
				int [] y2 = {60, 100, 100, 90, 90, 60};
				
				int [] x3 = {n + 10, n+30, n+30, n+10, n-10, n+10};
				int [] y3 = {140, 140, 160, 220, 220, 140};
				
				int [] x4 = {n+30, n +50, n+70, n+50, n+30, n+30};
				int [] y4 = {140, 140, 220, 220, 160, 140};
				
				Color wicket = new Color( 250, 190, 0);
				Color shoes = new Color(240, 100,240);
				Color face = new Color(255, 204, 153);
				Color ground = new Color(220, 158, 80);
				
			//	Image i = Toolkit.getDefaultToolkit().getImage("Animated_Cricket_Player_Hits_Ball-1dsm.gif");
				//g.drawImage(i,0,0,this);   //get Image
				setBackground(Color.GREEN);
				super.paintComponent(g);
				
				g.setColor(ground);
				g.fillRect(220, 0, 330, 1000);
				
				g.setColor(wicket);
				g.fillRect(130+220, 80, 50, 10);
				g.fillRect(130+220, 90, 10, 80);
				g.fillRect(150+220, 90, 10, 80);
				g.fillRect(170+220, 90, 10, 80);
				g.fillRect(130+220, 170, 50, 10);//wickets
				
				g.setColor(Color.WHITE);
				if(hangman<3)
				g.fillPolygon (x3, y3, 6);//one leg of pants
				if(hangman < 4)
				g.fillPolygon(x4, y4, 6); //another leg of pants
				if(hangman < 5)
				g.fillRect(n + 10, 60, 40 , 80);//body
				
				if (hangman < 3){
				g.setColor(Color.BLACK);
				g.drawLine( n + 10, 140, n + 50, 140);
				g.drawLine( n + 10, 139, n + 50, 139);
				}
				
				g.setColor(face);
				if(hangman<7)
				g.fillOval(n, 10, 50,50);//head
				if(hangman<6)
				g.fillPolygon(x2,y2,6);//arm
				
				g.setColor(wicket);
				g.fillPolygon(x, y, 9);//cricket bat
				
				
				g.setColor(shoes);
				if(hangman<1)
				g.fillOval( n + 45, 220, 35, 15);//shoe
				if(hangman < 2)
				g.fillOval(n-15, 220, 35, 15);//shoe
				
				g.setColor(Color.RED);
				g.fillOval(sliderValue, 400, 200, 200);//ball
			
				
		}
	}//close bracket for GraphicsPanel class	
	public class SliderClass extends JPanel implements ChangeListener, ActionListener{
		JButton back;
		SliderClass(){
			
			setBackground(Color.WHITE);
			this.setPreferredSize(new Dimension(100,200));
			go = new JButton("GO");
			
			setLayout(null);
			slide = new JSlider(JSlider.HORIZONTAL, 1, 10, 5);//at the south, there is a slider to determine inital position of baller
			slide.addChangeListener(this);
			slide.setBounds(0,70, 830, 100);
			
			go.setBounds(830,70, 170, 100);
			go.addActionListener(this);
			add(go);
			add(slide);
			back = new JButton("Back");
			back.setBounds(0, 170, 1000, 30);
			add(back);
			back.addActionListener(this);
			
		}
		public void stateChanged(ChangeEvent e){
			sliderValue = slide.getValue();//sliderValue = value of the slider
			sliderValue = sliderValue * 55;//sliderValue = sliderValue *10
			gp.repaint();}
		public void paintComponent(Graphics g){
			Font q = new Font ("Italic", Font.BOLD, 20);
			super.paintComponent(g);
			g.setFont(q);
			g.setColor(Color.BLACK);
			g.drawString("Move the slider to move the position of the ball so that the hitter won't hit the ball. Press go to throw!", 10, 40);
			
		}
		public void actionPerformed(ActionEvent e){//actionPerformed method header - ig "GO" button is clicked
			if(e.getSource() == back)
			cc.show(h, "BowlerGame");
			int x = 0;
			x = (int)(Math.random()*100);//x becomes a random integer given by Math.Random
			if(x %3== 0){//if x is even{
				//f.showBallerHitsCard();//show the card where the baller hits the wickets (call showBallerHitsCard() in BMain)
				c.show(f,"Bowler");
				hangman++;//increase count of hangman to make the batsman lose a body part
				gp.repaint();//repaint
			}
			else{//else
				//f.showHitterHitsCard();//show the card where hitter hits (call showHitterHits() in BMain)
				c.show(f,"Hitter");
				q.calculateScore();
				//~ //this should also happen if the hitter (use variable n) is within a certain range near the wickets bc it is likely that he will hit it if he is close to the wickets
			
			}
		
		}
			
	}//close bracket for Slider class	
}//close bracket for FirstGame class

public class BallerHitsWickets extends JPanel implements KeyListener{//**BallerHitsWickets class header extends JPanel implements KeyListener, MouseListener nested in Baller**

Image i;
	BallerHitsWickets(){//constructor
		 i = Toolkit.getDefaultToolkit().getImage("cricket.gif");
		//initialize class instance of BMain
		addKeyListener(this);//add KeyListener
	}
	public void paintComponent(Graphics g){//paintComponent
		Color green = new Color(0, 155, 0);
		setBackground(green);
		super.paintComponent(g);
		g.drawImage(i,200,200,600, 450,this);  //get Image
		//draw animated gif on screen
		Font q = new Font ("Italic", Font.BOLD, 50);
		g.setFont(q);
		g.setColor(Color.BLACK);
		g.drawString("Batsman Out! Nice Job!", 250, 800);//draw String with big font "Hitter out! Nice Job! Click on this to continue"
		g.setColor(Color.RED);
		g.drawString("Press any key to continue", 190, 850);
		requestFocus();
	}
	public void keyPressed(KeyEvent e){//keyPressed method header
		c.show(f,"FirstGame");//call showFirstCard in BMain to show the first card where the user plays the game
	}
	public void keyTyped(KeyEvent e){}//keyTyped
	public void keyReleased(KeyEvent e){}//keyReleased
	
}//close bracket for BallerHitsWickets class	
public class HitterHits extends JPanel implements KeyListener{//**HitterHits class header extends JPanel implements KeyListener, MouseListener, nested in Baller**
	Image i;
	HitterHits(){//constructor
		 i = Toolkit.getDefaultToolkit().getImage("Animated_Cricket_Player_Hits_Ball-1sm.gif");
		//initialize class instance of BMain
		addKeyListener(this);//add KeyListener
	}
	public void paintComponent(Graphics g){//paintComponent
		setBackground(Color.WHITE);
		super.paintComponent(g);
		g.setColor(Color.GREEN); 
		g.fillRect(0, 464, 1000, 225);
		g.drawImage(i,200,200,600, 450,this);  //get Image
		//draw animated gif on screen
		Font q = new Font ("Italic", Font.BOLD, 50);
		g.setFont(q);
		g.setColor(Color.BLACK);
		g.drawString("Oh no! The batsman hit the ball!", 125, 800);//draw String with big font "Hitter out! Nice Job! Click on this to continue"
		g.setColor(Color.RED);
		g.drawString("Press any button to continue", 170, 850);
		requestFocus();
	}
	public void keyPressed(KeyEvent e){//keyPressed method header
		c.show(f,"FirstGame");//call showFirstCard in BMain to show the first card where the user plays the game
	}
	public void keyTyped(KeyEvent e){}//keyTyped
	public void keyReleased(KeyEvent e){}//keyReleased
	public void calculateScore(){//calculateScore method header
		int p = 0;
		p = (int)(Math.random()*100);//x becomes a random integer given by Math.Random
		if( p <=25)
			p = 1;
		if( p>25 && p <=50)
			p = 2;
		if( p>50 && p <= 75)
			p = 4;
		if( p>75)
			p = 6;
		pp.recieveScore(p);
		//determine random number from 1,2,4,6 - the most frequently occuring amount of cricket runs
		//call recieveScore() in FirstGame with this number as a parameter
	}
}//close bracket for HitterHits class


class Win extends JPanel{
	public void paintComponent(Graphics g){
		setBackground(Color.YELLOW);
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		Font q = new Font ("Italic", Font.BOLD, 100);
		g.setFont(q);
		g.drawString("YOU WIN",200,300);
	}
}

class Lose extends JPanel{
	public void paintComponent(Graphics g){
		setBackground(Color.YELLOW);
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		Font q = new Font ("Italic", Font.BOLD, 100);
		g.setFont(q);
		g.drawString("YOU LOSE",200,300);
	}
}



}//close for Titlepage