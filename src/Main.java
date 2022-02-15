import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.awt.AWTException;
import java.awt.Rectangle;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		try {
			Robot rb = new Robot();
			for(int i=0;i<100;i++){
				rb.mouseMove(i, i);
				Thread.sleep(100);
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}	
	}
}
