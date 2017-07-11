import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Library {
	Map<Author, List<Book>> map = new HashMap<>();
	Scanner scan = new Scanner(System.in);

	public void addAuthor() {
		
	
		System.out.println("Enter name: ");
		String name = scan.next();
		System.out.println("Enter sour name: ");
		String sourName = scan.next();
		System.out.println("Enter lenght: ");
		int lenght = scan.nextInt();
		System.out.println("Enter weight: ");
		int weight = scan.nextInt();
		System.out.println("Enter age: ");
		int age = scan.nextInt();
		map.put(new Author(lenght, weight, age, name, sourName), new ArrayList<>());
	}

	public void addBookForAuthor() {
		
	
		System.out.println("Enter name to author: ");
		String nameAuthor = scan.next();
		System.out.println("Enter sour name to author: ");
		String sourName = scan.next();
		Set<Entry<Author, List<Book>>> set = map.entrySet();
		for (Entry<Author, List<Book>> entry : set) {
			if (entry.getKey().getName().equals(nameAuthor) && entry.getKey().getSourName().equals(sourName)) {
				System.out.println("Enter title: ");
				String title = scan.next();
				System.out.println("Enter  years of public: ");
				int years = scan.nextInt();
				System.out.println("Enter pages: ");
				int pages = scan.nextInt();
				entry.getValue().add(new Book(title, years, pages));
			}
		}

	}

	public void removeBookForAuthor() {
		
		
		System.out.println("Enter name to author: ");
		String nameAuthor = scan.next();
		System.out.println("Enter sour name to author: ");
		String sourName = scan.next();
	
		Set<Entry<Author, List<Book>>> set = map.entrySet();
		for (Entry<Author, List<Book>> entry : set) {
			if (entry.getKey().getName().equals(nameAuthor) && entry.getKey().getSourName().equals(sourName)) {
				System.out.println("Enter title: ");
				String title = scan.next();
				Iterator<Book> iterator = entry.getValue().iterator();
				while (iterator.hasNext()) {
					Book book = iterator.next();
					if(book.getTitle().equals(title)){
					iterator.remove();
					}
				}

			}
		}
		
	}
	public void removeAuthorAndBook(){
		
		
		System.out.println("Enter name to author: ");
		String nameAuthor = scan.next();
		System.out.println("Enter sourname to author: ");
		String sourName = scan.next();
		Set<Entry<Author, List<Book>>> set = map.entrySet();
		for (Entry<Author, List<Book>> entry : set) {
			if (entry.getKey().getName().equals(nameAuthor) && entry.getKey().getSourName().equals(sourName)) {
				map.remove(entry.getKey());
				
		
	}
}
}
	public void removeBookFromAuthor(){

		
		System.out.println("Enter name to author");
		String nameAuthor = scan.next();
		System.out.println("Enter sourname to author");
		String sourName = scan.next();
		Set<Entry<Author, List<Book>>> set = map.entrySet();
		for (Entry<Author, List<Book>> entry : set) {
			if(entry.getKey().getName().equals(nameAuthor)&& entry.getKey().getSourName().equals(sourName)){
				
				entry.getValue().clear();
			}
		}
	}
	public void sortByYearsOfPublic(){

		System.out.println("Enter name to author");
		String nameAuthor = scan.next();
		System.out.println("Enter sourname to author");
		String sourName = scan.next();
		Set<Entry<Author, List<Book>>> set = map.entrySet();
		for (Entry<Author, List<Book>> entry : set) {
			if(entry.getKey().getName().equals(nameAuthor)&& entry.getKey().getSourName().equals(sourName)){
		Collections.sort(entry.getValue(),new SortByYearsOfPublic());
		System.out.println(entry.getValue());
		
}
		}
	}
	public void sortByPages(){

		
		System.out.println("Enter name to author");
		String nameAuthor = scan.next();
		System.out.println("Enter sourname to author");
		String sourName = scan.next();
		Set<Entry<Author, List<Book>>> set = map.entrySet();
		for (Entry<Author, List<Book>> entry : set) {
			if(entry.getKey().getName().equals(nameAuthor)&& entry.getKey().getSourName().equals(sourName)){
				Collections.sort(entry.getValue(), new SortByPages());
				System.out.println(entry.getValue());
	}
		}
	}
	public void outAll(){
	
		Set<Entry<Author, List<Book>>> set = map.entrySet();
		for (Entry<Author, List<Book>> entry : set) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
}
}