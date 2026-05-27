import book_suggestion_system

while True:
    print("==== Welcome to the Book Suggestion System! ====")
    print("1. Get Suggestions")
    print("2. Add Book")
    print("3. Remove Book")
    print("4. Update book")
    print("5. Show all books")
    print("0. Exit")
    
    user_option = input("Enter Operation: ").strip()
    print()

    if user_option == "1":
        while True:
            print(book_suggestion_system.book_suggestions())
            again = input("Would you like to get another suggestion? (yes/no): ").strip().lower()
            print()
            if again == "no":
                break
            elif again != "yes":
                print("Please type yes or no.")

    elif user_option == "2":
        new_title = input("Enter the title of the new book: ")
        print(book_suggestion_system.add_book(new_title))
        print()

    elif user_option == "3":
        remove_title = input("Enter the title of the book to remove: ")
        print(book_suggestion_system.remove_book(remove_title))
        print()

    elif user_option == "4":
        old_title = input("Enter the current book title: ")
        updated_title = input("Enter the new book title: ")
        print(book_suggestion_system.update_book(old_title, updated_title))
        print()

    elif user_option == "5":
        print("Available Books:\n" + "-"*15)
        print(book_suggestion_system.books_available())
        print()

    elif user_option == "0":
        print("Exiting... Goodbye!")
        break

    else:
        print("Invalid option, please try again.")
        print()