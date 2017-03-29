package by.htp.home.actions;

import by.htp.home.entity.HouseBuild;

public class HouseActions {
	
	public void lockHouse(HouseBuild house) {
		
		for ( int i = 0; i < house.getDoors().length; i++ ) {
			if ( "outer".equals(house.getDoors()[i].getType()) ) {
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
