package by.htp.rom4a16.actions;

public class HouseActions {
	
	public void lockHouse(HouseBuild house) {
		
		for ( int i = 0; i < house.getDoors().length; i++ ) {
			if ( house.getDoors()[i].getType() == "outer" ) {
				house.getDoors()[i].setLock();
				System.out.println("House " + house + " is lock");
			}
		}
	}
	
	public void printWindowsCount(HouseBuild house) {
		System.out.println(house.getWindows().length);
	}
	
	public void printDoorsCount(HouseBuild house) {
		System.out.println(house.getDoors().length);
	}
}
