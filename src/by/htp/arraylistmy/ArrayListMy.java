package by.htp.arraylistmy;

public class ArrayListMy {

	public static Object[] addRecord(Object[] coppiedArray, Object elem) {
		Object[] serv = new Object[coppiedArray.length + 1];
		for (int i = 0; i < coppiedArray.length; i++){
			serv[i] = coppiedArray[i];
		}
		serv[coppiedArray.length] = elem;
		
		return serv;
	}	
}
