package _03_jars._3_magic_box;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MagicBox extends JPanel implements Runnable, MouseListener {

	
	 // We are going to hide secrets within the magic box. 
	 // When the user clicks on a secret place, stuff will happen.
	 
	 // 1. Make the frame respond to mouse clicks.
	
	 // 2. When the mouse is clicked, use the Media Palace (read the code in the magic_box package) to play sounds, 
	 //    show images or speak.
	 
	 /* 3. Choose 3 different locations on the background image.You can either use the mouse position, 
	 *    or the color of the image, then decide what action the Media Palace should take in each case. 
	 *     backgroundImage.getRGB(e.getX(), e.getY()) will give you the color of the current pixel.
*/    
	 

	BufferedImage backgroundImage;


	@Override
	public void run() {
		try {
			loadBackgroundImage();
			createUI();
		} catch (Exception w) {
			System.err.println(w.getMessage());
		}
	}
	JFrame frame = new JFrame("The Magic Box contains many secrets...");
	private void createUI() {
		
		frame.add(this);
		setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.addMouseListener(this);
	}

	private void loadBackgroundImage() throws Exception {
		String imageFile = "src/_03_jars/_3_magic_box/magic-box.jpg";
		try {
			backgroundImage = ImageIO.read(new File(imageFile));
		} catch (IOException e) {
			throw new Exception("Could not load image: " + imageFile);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
		try {
			JLabel image2= MediaPalace.loadImageFromTheInternet("http://assets.stickpng.com/images/580b57fcd9996e24bc43c32a.png");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
MediaPalace mp=new MediaPalace();
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(backgroundImage.getRGB(e.getX(), e.getY()));
		if(backgroundImage.getRGB(e.getX(), e.getY())==-13458771) {
			frame.dispose();
			frame=new JFrame();
			frame.setVisible(true);
			JLabel l= new JLabel ();
			l=mp.loadImageFromWithinProject("src/_03_jars/_3_magic_box/ScreenShot2020-06-21at12.21.39PM.png");
			frame.add(l);
			frame.pack();
		}
		else if(backgroundImage.getRGB(e.getX(), e.getY())==-2113411) {
			JLabel l= new JLabel ();
			l.add(mp.loadImageFromWithinProject("Screen Shot 2020-06-20 at 4.40.03 PM.png"));
			frame.add(l);
			frame.pack();
		}
		else if(backgroundImage.getRGB(e.getX(), e.getY())==-9675196) {
			JLabel l= new JLabel ();
			l.add(mp.loadImageFromWithinProject("Screen Shot 2020-06-30 at 9.13.48 AM.png"));
			frame.add(l);
			frame.pack();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(backgroundImage.getRGB(e.getX(), e.getY())==13458771) {
			mp.playMusicOnComputer("labrador-barking-daniel_simon.mp3");
		}
		else if(backgroundImage.getRGB(e.getX(), e.getY())==2113411) {
			mp.playMusicOnComputer("SoundBible.com Must Credit.mp3");
		}
		else if(backgroundImage.getRGB(e.getX(), e.getY())==9675196) {
			mp.playMusicOnComputer("SoundBible.com Must Credit.mp3");
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


		
	}







//JLabel image1= loadImageFromTheInternet("http://www.pngmart.com/files/2/Pikachu-Transparent-Background.png");

//JLabel image1=loadImageFromWithinProject("pikachu.png");
