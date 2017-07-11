
public class Author extends Person{
	private String name;
	private String sourName;
	public Author(int lenght, int weight, int age, String name, String sourName) {
		super(lenght, weight, age);
		this.name = name;
		this.sourName = sourName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourName() {
		return sourName;
	}
	public void setSourName(String sourName) {
		this.sourName = sourName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sourName == null) ? 0 : sourName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sourName == null) {
			if (other.sourName != null)
				return false;
		} else if (!sourName.equals(other.sourName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", sourName=" + sourName + "]";
	}
	
}
