import java.util.Comparator;

public class SortByYearsOfPublic implements Comparator<Book> {

	@Override
	public int compare(Book arg0, Book arg1) {
		// TODO Auto-generated method stub
		return arg0.getYearsOfpublic() - arg1.getYearsOfpublic();
	}

}
