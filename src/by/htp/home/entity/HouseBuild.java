package by.htp.home.entity;

public class HouseBuild {

	private Door doors[] = new Door[0];
	private Window windows[] = new Window[0];
	
	public void addDoor(Door door){
		if ( door != null ) {
			if ( (Door.types[0].equals(door.getType()) && !issetOuterType() ) || Door.types[1].equals(door.getType()) ) {
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
	}
	
	public void addWindow(Window window){
		if ( window != null ) {
			Window[] serv = new Window[windows.length + 1];
			for (int i = 0; i < windows.length; i++){
				serv[i] = windows[i];
			}
			serv[windows.length] = window;
			
			this.windows = serv;
		}
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
			str += getWindows()[i].toString() + "\n";
		}
		for ( int j = 0; j < getDoors().length; j++ ) {
			str += getDoors()[j].toString() + "\n";
		}
		
		return str;
	}
	
	private boolean issetOuterType() {
		for ( int i = 0; i < doors.length; i++ ) {
			if ( Door.types[0].equals(doors[i].getType()) )
				return true;
		}
		
		return false;
	}
	
}
