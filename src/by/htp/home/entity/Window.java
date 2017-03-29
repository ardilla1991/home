package by.htp.home.entity;

public class Window extends Aperture{
	
	public Window(int width, int height) {
		this.setWidth(width);
		this.setHeight(height);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Window other = (Window) obj;
		if (this.getHeight() != other.getHeight())
			return false;
		if (this.getWidth() != other.getWidth())
			return false;
		
		return true;
	}
	
	public String toString() {
		return getClass().getName() + "@width:" + getWidth() + " height:" + getHeight();
	}
	
	public int hashCode() {
		return (int)(31 * getHeight() + getWidth());
	}

}
