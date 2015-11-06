package yuchen.ipSolver;

import java.awt.*;
import java.awt.event.*;

/**
	* Hello world!
	*
*/
public class App extends Frame implements WindowListener
{
	public App(){
		super("Ip Solver - in developing");
		this.add(new TextField("", 20));
		setSize(250, 100); 
		setVisible(true);
		addWindowListener(this);
	}
	
    public static void main( String[] args )
    {
        App app = new App();
		
		
	}
	
	@Override 
	public void windowClosed(WindowEvent e){
		System.out.println("windowClosed");
		try {
			Thread.sleep(1000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	
	public void windowOpened(WindowEvent e){
		System.out.println("windowOpened");
		try {
			Thread.sleep(1000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	public void windowClosing(WindowEvent e){
		System.out.println("windowClosing");
		try {
			Thread.sleep(1000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		System.exit(0);
	}
	public void windowIconified(WindowEvent e){
		System.out.println("windowIconified");
		try {
			Thread.sleep(1000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	public void windowDeiconified(WindowEvent e){
		System.out.println("windowDeiconified");
		try {
			Thread.sleep(1000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	public void windowActivated(WindowEvent e){
		System.out.println("windowActivated");
		try {
			Thread.sleep(1000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	public void windowDeactivated(WindowEvent e){
		System.out.println("windowDeactivated");
		try {
			Thread.sleep(1000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	
	
}
