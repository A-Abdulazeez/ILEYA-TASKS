import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookSuggestionSystemTest {
        // 1. TESTS FOR: bookSuggestions() 

    @Test
    public void testBookSuggestionsNotNull() {
        String expected = BookSuggestionSystem.bookSuggestions();
        assertNotNull(expected, "Suggestion should not be null.");
    }


    // 2. TESTS FOR: addBook() 
    @Test
    public void testThatAddBookisSuccess() {
        String expected = BookSuggestionSystem.addBook("Skibo the Programmer");
        assertEquals("Book added successfully.", expected);
    }

    @Test
    public void testThatAddingEmptyTHrowsError() {
        String expected = BookSuggestionSystem.addBook("");
        assertEquals("Book title cannot be empty.", expected);
    }

    @Test
    public void testThatAddingDuplicateBooksaysAlreadyExist() {
        BookSuggestionSystem.addBook("The Clean Code"); 
        String expected = BookSuggestionSystem.addBook("The Clean Code"); 
        assertEquals("Book already exists in the list.", expected);
    }

    // 3. TESTS FOR: removeBook()

    @Test
    public void testThatRemovingBookIsSuccess() {
        BookSuggestionSystem.addBook("Simbi and her cat");
        String expected = BookSuggestionSystem.removeBook("Simbi and her cat");
        assertEquals("Book removed successfully.", expected);
    }

    @Test
    public void testThhatRemoveBookNotInListNotFound() {
        String expected = BookSuggestionSystem.removeBook("Simbi and her cat2");
        assertEquals("Error: Book not found.", expected);
    }

    // 4. TESTS FOR: updateBook()

    @Test
    public void testThatUpdatingBookIsSuccess() {
        BookSuggestionSystem.addBook("Old Java");
        String expected = BookSuggestionSystem.updateBook("Old Java", "New Java");
        assertEquals("Success: Book updated successfully.", expected);
    }

    @Test
    public void testThatUpdateBookNotFound() {
        String expected = BookSuggestionSystem.updateBook("NonExistent Old Book", "Brand New Book");
        assertEquals("Error: Current book not found.", expected);
    }

    @Test
    public void testThatUpdatingEmptyBookNewTitleThrowsError() {
        BookSuggestionSystem.addBook("Valid Core Book");
        String expected = BookSuggestionSystem.updateBook("Valid Core Book", "");
        assertEquals("Error: New book title cannot be empty.", expected);
    }

    // 5. TESTS FOR: booksAvailable()

    @Test
    public void testThatBooksAvailableListISNotEmpty() {
        String expected = BookSuggestionSystem.booksAvailable();
        assertFalse(expected.isEmpty(), "Books expected list should not be empty.");
    }

    @Test
    public void testBooksAvailableContainsDefaultBooks() {
        String expected = BookSuggestionSystem.booksAvailable();
        assertTrue(expected.contains("why Kayode is bald"), "Should contain the first default book.");
        assertTrue(expected.contains("Why venture into tech"), "Should contain the second default book.");
    }

    @Test
    public void testBooksAvailableReflectsNewAdditions() {
        BookSuggestionSystem.addBook("Book");
        String expected = BookSuggestionSystem.booksAvailable();
        assertTrue(expected.contains("Book"), "Available books should show newly added books.");
    }
}