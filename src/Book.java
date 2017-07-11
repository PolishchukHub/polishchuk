
public class Book {
	private String title;
	private int yearsOfpublic;
	private int pages;
	public Book(String title, int yearsOfpublic, int pages) {
		super();
		this.title = title;
		this.yearsOfpublic = yearsOfpublic;
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", yearsOfpublic=" + yearsOfpublic + ", pages=" + pages + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYearsOfpublic() {
		return yearsOfpublic;
	}
	public void setYearsOfpublic(int yearsOfpublic) {
		this.yearsOfpublic = yearsOfpublic;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pages;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + yearsOfpublic;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (pages != other.pages)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (yearsOfpublic != other.yearsOfpublic)
			return false;
		return true;
	}
	
}
