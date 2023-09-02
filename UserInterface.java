import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UserInterface extends JPanel implements MouseListener, MouseMotionListener {
	static int x=0,y=0;
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		this.setBackground(Color.red);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
		g.setColor(Color.BLUE);
		g.fillRect(x-20, y-20, 20, 20);
		g.drawString("Maksim",x,y);
		
		Image chessPieceImage;
		chessPieceImage = new ImageIcon("ChessPieces.png").getImage();
		g.drawImage(chessPieceImage, x,0,x+100,100,x,0,x+100,100,this);

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		x=e.getX();
		y=e.getY();
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

