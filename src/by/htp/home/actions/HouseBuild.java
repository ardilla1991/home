package by.htp.home.actions;

import by.htp.home.entity.Door;
import by.htp.home.entity.Window;

public class HouseBuild {

	private Door doors[] = new Door[0];
	private Window windows[] = new Window[0];
	
	public void addDoor(Door door){
		if ( (door.getType() == "outer" && !issetType() ) || door.getType() == "inner") {
			Door[] serv = new Door[doors.length + 1];
			for (int i = 0; i < doors.length; i++){
				serv[i] = doors[i];
			}
			serv[doors.length] = door;
			
			this.doors = serv;
		}
		else
			System.out.println("This dors type already exist!");
	}
	
	public void addWindow(Window window){
		Window[] serv = new Window[windows.length + 1];
		for (int i = 0; i < windows.length; i++){
			serv[i] = windows[i];
		}
		serv[windows.length] = window;
		
		this.windows = serv;
	}
	
	public Window[] getWindows() {
		return windows;
	}
	
	public Door[] getDoors() {
		return doors;
	}
	
	public String toString() {
		String str = "";
		for ( int i = 0; i < getWindows().length; i++ ) {
		    str += getClass().getName() + "@width:" + getWindows()[i].getWidth() 
		    		+ " height:" + getWindows()[i].getHeight() + "\n";
		}
		for ( int j = 0; j < getDoors().length; j++ ) {
		    str += getClass().getName() + "@width:" + getDoors()[j].getWidth() 
		    		+ " height:" + getDoors()[j].getHeight() + "\n";
		}
		
		return str;
	}
	
	private boolean issetType() {
		for ( int i = 0; i < doors.length; i++ ) {
			if ( doors[i].getType() == "outer" )
				return true;
		}
		
		return false;
	}
	
}
