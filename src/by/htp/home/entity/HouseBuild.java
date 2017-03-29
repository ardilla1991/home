package by.htp.home.entity;

public class HouseBuild {

	private Door doors[] = new Door[10];
	private Window windows[] = new Window[10];
	
	public void addDoor(Door door){
		if ( door != null ) {
			if ( (Door.types[0].equals(door.getType()) && !issetOuterType() ) || Door.types[1].equals(door.getType()) ) {
				addDoorRecord(door);
			}
			else
				System.out.println("This dors type already exist!");
		}
	}
	
	private void addDoorRecord(Door door) {
		int emptyIndex = -1;
		while ( (emptyIndex = getEmptyDoorsIndex()) == -1 ) {
			System.out.println("1");
			Door[] serv = new Door[doors.length + 5];
			for (int i = 0; i < doors.length; i++){
				serv[i] = doors[i];
			}
			this.doors = serv;
		}
		this.doors[emptyIndex] = door;
	}
	
	private int getEmptyDoorsIndex() {
		for ( int i = 0; i < doors.length; i++ ) {
			if ( doors[i] == null ) {
				return i;
			}
		}
		
		return -1;
	}
	
	public void addWindow(Window window){
		if ( window != null ) {
			addWindowRecord(window);
		}
	}
	
	private void addWindowRecord(Window window) {
		int emptyIndex = -1;
		while ( (emptyIndex = getEmptyWindowsIndex()) == -1 ) {
			System.out.println("1");
			Window[] serv = new Window[windows.length + 5];
			for (int i = 0; i < windows.length; i++){
				serv[i] = windows[i];
			}
			this.windows = serv;
		}
		this.windows[emptyIndex] = window;
	}
	
	private int getEmptyWindowsIndex() {
		for ( int i = 0; i < windows.length; i++ ) {
			if ( windows[i] == null ) {
				return i;
			}
		}
		
		return -1;
	}
	
	public Window[] getWindows() {
		return windows;
	}
	
	public Door[] getDoors() {
		return doors;
	}
	
	public String toString() {
		String str = "";
		for ( int i = 0; i < getWindowsArraySize(); i++ ) {
			str += getWindows()[i].toString() + "\n";
		}
		for ( int j = 0; j < getDoorsArraySize(); j++ ) {
			str += getDoors()[j].toString() + "\n";
		}
		
		return str;
	}
	
	private boolean issetOuterType() {
		System.out.println(doors);
		for ( int i = 0; i < getDoorsArraySize(); i++ ) {
			System.out.println();
			System.out.println(doors[i]);
			if ( (Door.types[0]).equals(doors[i].getType()) )
				return true;
		}
		
		return false;
	}
	
	public int getDoorsArraySize() {
		for ( int i = 0; i < doors.length; i++ ) {
			if ( doors[i] == null ) {
				return i;
			}
		}
		
		return 0;
	}
	
	public int getWindowsArraySize() {
		for ( int i = 0; i < windows.length; i++ ) {
			if ( windows[i] == null ) {
				return i;
			}
		}
		
		return 0;
	}
}
