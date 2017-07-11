import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library library = new Library();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			
		
		System.out.println("Enter 1 to add author");
		System.out.println("Enter 2 to fixed  the book by this author");
		System.out.println("Enter 3 to remove book this author ");
		System.out.println("Enter 4 to remove author and others books");
		System.out.println("Enter 5 to Remove all the books that are fixed by the author; ");
		System.out.println("Enter 6 to sort books by years of public ");
		System.out.println("Enter 7 to sort books by pages");
		System.out.println("Enter 8 to out all library");
		System.out.println("Enter 9 to exit");

		String choise = scanner.next();
		
		
		switch (choise) {
		case "1":
			library.addAuthor();
			break;

		case "2":
			library.addBookForAuthor();
			break;
		case "3":
			library.removeBookForAuthor();
			break;
		case "4":
			library.removeAuthorAndBook();
			break;
		case "5":
			library.removeBookFromAuthor();// Виправити
			break;
		case "6":
			library.sortByYearsOfPublic();
			break;
			case "7":
				library.sortByPages();
				break;
		case "8":
			library.outAll();
			break;
		case "9":
			System.exit(0);
			break;
		default:
			break;
		}
		
		
		
	}

}
}
