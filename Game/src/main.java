import java.awt.Canvas;
import javax.swing.JFrame;

public class main extends Canvas implements Runnable {
	
	public static int height = 400;
	public static int width = 600;
	public static String title = "Minecraft 0.0.1";
	public boolean run = false;
	public Thread thread;
	
	public static void main(String args[]){
		main game = new main();
		
		
		JFrame f = new JFrame();
		
		f.setSize(width, height);
		f.setVisible(true);
		f.setTitle(title);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.add(game);
		
		game.start();
	}
	
	public void start(){
		if(run){
			return;
		}
		run = true;
		thread = new Thread();
		thread.start();
	}
	
	public void run(){
		while(run){
			System.out.println("HELLO!");
		}
	}
	
}

