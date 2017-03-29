package by.htp.home.launch;

import by.htp.home.actions.*;
import by.htp.home.entity.*;
/*
 * ������� ����������, ��������������� �����������, 
 * ����������� � �������. ������������ ���������
 *  ������ � ��� ��������, � ������� ��� ���������
 *  ����������. ��������������� ��������������
 *  ������ ������� ������������ ������ � 
 *  ��������� �������������� ��� ������� ������ 
 *  ������ equals(), hashCode(), toString().
 *  
 *  15. ������� ������ ������ ���, ��������� ������ ����, �����. 
 *  ������: ������� �� ����, ������� �� ������� ���������� ����, ������.
 */
public class MainHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Door door1 = new Door("inner", 100, 150);
		Door door2 = new Door("inner", 100, 150);
		Door door3 = new Door("outer", 110, 150);
		
		Window window1 = new Window(220, 110);
		Window window2 = new Window(70, 100);
		Window window3 = new Window(150, 95);
		Window window4 = new Window(50, 70);
		
		HouseBuild house = new HouseBuild();
		house.addDoor(door1);
		house.addDoor(door2);
		house.addDoor(door3);
		house.addWindow(window1);
		house.addWindow(window2);
		house.addWindow(window3);
		house.addWindow(window4);
		
		HouseActions houseAction = new HouseActions();
		houseAction.lockHouse(house);
		houseAction.printWindowsCount(house);
		houseAction.printDoorsCount(house);
	}

}
