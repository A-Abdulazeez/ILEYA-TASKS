import unittest
import book_suggestion_system as bss


DEFAULT_BOOKS = [
    "why Kayode is bald",
    "Why venture into tech",
    "Why miracle is short",
    "Azeez Autobiography",
]


class TestBookSuggestionSystem(unittest.TestCase):
    def setUp(self):
        bss.books_list.clear()
        bss.books_list.extend(DEFAULT_BOOKS.copy())

    def test_book_suggestions_not_null(self):
        expected = bss.book_suggestions()
        self.assertIsNotNone(expected, "Suggestion should not be null.")

    def test_that_add_book_is_success(self):
        expected = bss.add_book("Skibo the Programmer")
        self.assertEqual("Book added successfully.", expected)

    def test_that_adding_empty_throws_error(self):
        expected = bss.add_book("")
        self.assertEqual("Book title cannot be empty.", expected)

    def test_that_adding_duplicate_book_says_already_exists(self):
        bss.add_book("The Clean Code")
        expected = bss.add_book("The Clean Code")
        self.assertEqual("Book already exists in the list.", expected)

    def test_that_removing_book_is_success(self):
        bss.add_book("Simbi and her cat")
        expected = bss.remove_book("Simbi and her cat")
        self.assertEqual("Book removed successfully.", expected)

    def test_that_remove_book_not_in_list_not_found(self):
        expected = bss.remove_book("Simbi and her cat2")
        self.assertEqual("Error: Book not found.", expected)

    def test_that_updating_book_is_success(self):
        bss.add_book("Old Java")
        expected = bss.update_book("Old Java", "New Java")
        self.assertEqual("Success: Book updated successfully.", expected)

    def test_that_update_book_not_found(self):
        expected = bss.update_book("NonExistent Old Book", "Brand New Book")
        self.assertEqual("Error: Current book not found.", expected)

    def test_that_updating_empty_book_new_title_throws_error(self):
        bss.add_book("Valid Core Book")
        expected = bss.update_book("Valid Core Book", "")
        self.assertEqual("Error: New book title cannot be empty.", expected)

    def test_that_books_available_list_is_not_empty(self):
        expected = bss.books_available()
        self.assertNotEqual("", expected, "Books expected list should not be empty.")

    def test_books_available_contains_default_books(self):
        expected = bss.books_available()
        self.assertIn("why Kayode is bald", expected)
        self.assertIn("Why venture into tech", expected)

    def test_books_available_reflects_new_additions(self):
        bss.add_book("Book")
        expected = bss.books_available()
        self.assertIn("Book", expected)
