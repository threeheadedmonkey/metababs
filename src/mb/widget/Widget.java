package mb.widget;

public abstract class Widget {
	String id = "";
	String description = "";
	
	public void setDescription(String description){
		this.description = description;
	}
	public void setId(String id) {
		this.id = id;
	}
}
