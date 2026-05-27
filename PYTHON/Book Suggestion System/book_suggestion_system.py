import random


books_list = [
    "why Kayode is bald",
    "Why venture into tech",
    "Why miracle is short",
    "Azeez Autobiography",
]


def book_suggestions() -> str:
    book = random.choice(books_list)
    page = random.randint(1, 100)
    return f"Book for the day:\n\tBook Title: {book}\n\tpage: {page}\n"


def add_book(new_book: str) -> str:
    new_book = new_book.strip()
    if not new_book:
        return "Book title cannot be empty."

    if new_book in books_list:
        return "Book already exists in the list."

    books_list.append(new_book)
    return "Book added successfully."


def remove_book(title: str) -> str:
    try:
        books_list.remove(title)
        return "Book removed successfully."
    except ValueError:
        return "Error: Book not found."


def update_book(old_title: str, new_title: str) -> str:
    new_title = new_title.strip()
    if not new_title:
        return "Error: New book title cannot be empty."

    try:
        index = books_list.index(old_title)
    except ValueError:
        return "Error: Current book not found."

    books_list[index] = new_title
    return "Success: Book updated successfully."


def books_available() -> str:
    if not books_list:
        return "No books available."
    return "\n".join(books_list)