package by.htp.home.entity;

public class Door extends Aperture{
	
	private String type;
	private int lock;
	public final static String[] types = new String[]{"outer", "inner"};
	
	public Door(String type, int width, int height) {
		this.setType(type);
		this.setWidth(width);
		this.setHeight(height);
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setLock() {
		lock = 1;
	}
	
	public void unlock() {
		lock = 0;
	}
	
	public int getLock() {
		return lock;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Door other = (Door) obj;
		if (this.getHeight() != other.getHeight())
			return false;
		if (this.getWidth() != other.getWidth())
			return false;
		if (this.getLock() != other.getLock())
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
				return false;
		
		return true;
	}
	
	public String toString() {
		return getClass().getName() + "@type:" + type + " width:" + getWidth() + " height:" + getHeight();
	}
	
	public int hashCode() {
		return (int)(31 * getHeight() + getWidth() + ((type == null) ? 0 : type.hashCode()));
	}
}
