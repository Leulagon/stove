
public enum Setting {
	OFF("---"),
	LOW("--+"),
	MEDIUM("-++"), 
	HIGH("+++");
	
	public String name;

	private Setting(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
}
