import java.util.*;

public class BookSuggestionSystem {

    public static  List<String> booksList = new ArrayList<>(Arrays.asList(
        "why Kayode is bald", 
        "Why venture into tech", 
        "Why miracle is short", 
        "Azeez Autobiography"
    ));

    public static String bookSuggestions() {
        java.util.Random random = new java.util.Random();
        String book = booksList.get(random.nextInt(booksList.size()));
        int page = random.nextInt(100) + 1; 

        return String.format("Book for the day:\n\tBook Title: %s\n\tpage: %d%n", book, page);
    } 

    public static String addBook(String newBook) {
        if (newBook.isEmpty()) {
            return "Book title cannot be empty.";
        }
     
        if (booksList.contains(newBook)) {
            return "Book already exists in the list.";
        }
        booksList.add(newBook);
        return "Book added successfully.";
    }

    public static String removeBook(String title) {
     
        if (booksList.remove(title)) {
            return "Book removed successfully.";
        } else {
            return "Error: Book not found.";
        }
    }

    public static String updateBook(String oldTitle, String newTitle) {
       
        int index = booksList.indexOf(oldTitle);
        
        if (index == -1) {
            return "Error: Current book not found.";
        }
        if (newTitle.isEmpty()) {
            return "Error: New book title cannot be empty.";
        }

        booksList.set(index, newTitle);
        return "Success: Book updated successfully.";
    }

    public static String booksAvailable() {
        if (booksList.isEmpty()) {
            return "No books available.";
        }
        StringBuilder list = new StringBuilder();
        for (String book : booksList) {
            list.append(book).append("\n");
        }
        return list.toString().trim();
    }

    public static void main(String... azeez) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print(""" 
==== Welcome to the Book Suggestion System! ====
1. Get Suggestions
2. Add Book
3. Remove Book
4. Update book
5. Show all books 
0. Exit
""");

            System.out.print("Enter Operation: ");
            String useroption = input.nextLine();
            System.out.println();

            switch (useroption) { 
                case "1":
                    while (true) {
                        System.out.println(bookSuggestions());
                        System.out.print("Would you like to get another suggestion? (yes/no): ");
                        String again = input.nextLine();
                        System.out.println();
                        if (again.equalsIgnoreCase("no")) {
                            break;
                        } 
                        else if (!again.equalsIgnoreCase("yes")) {
                            System.out.println("Please type yes or no.");
                        }
                    }
                    break;

                case "2":
                    System.out.print("Enter the title of the new book: ");
                    String newTitle = input.nextLine();
                    System.out.println(addBook(newTitle));
                    System.out.println();
                    break;

                case "3":
                    System.out.print("Enter the title of the book to remove: ");
                    String removeTitle = input.nextLine();
                    System.out.println(removeBook(removeTitle));
                    System.out.println();
                    break;

                case "4":
                    System.out.print("Enter the current book title: ");
                    String oldTitle = input.nextLine();
                    System.out.print("Enter the new book title: ");
                    String updatedTitle = input.nextLine();
                    System.out.println(updateBook(oldTitle, updatedTitle));
                    System.out.println();
                    break;

                case "5":
                    System.out.println(booksAvailable());
                    System.out.println();
                    break;

                case "0":
                    return;

                default:
                    System.out.println("Invalid option");
                    System.out.println();
                    continue;
            }
        }
    }
}