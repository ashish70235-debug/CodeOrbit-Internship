import java.util.ArrayList;

class Library{

    ArrayList<Book> books = new ArrayList<>();

    void addBook( int id, String title, String author){

        for( Book book : books){
            if( book.bookId == id){
                System.out.println("Book Id already exists!");
                return;
            }
        }

        Book book = new Book(id , title, author);
        books.add(book);

        System.out.println("Book added successfully");
    }


    void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No Books available.");
            return;
        }

        System.out.println("\n=============Book List================");

        for (Book book : books) {
            System.out.println("ID     : " + book.bookId);
            System.out.println("Title  : " + book.title);
            System.out.println("Author : " + book.author);
            System.out.println("Status : " + (book.availability ? "Available" : "Issued"));
            System.out.println("----------------------------------------");
        }

    }

        void searchBook(int id){

            for( Book book : books){
                if(book.bookId == id){
                    System.out.println("\nBook Found!");
                    System.out.println("Id     : "+book.bookId);
                    System.out.println("Title  : "+book.title);
                    System.out.println("Author : "+book.author);

                    if(book.availability){
                        System.out.println("Status : Available");
                    }
                    else{
                        System.out.println("Status : Issued");
                    }

                    return;
                }
            }

            System.out.println("Book not found!");
        }


        void issueBook(int id){
        for(Book book : books){
            if( book.bookId == id){
                if( !book.availability){
                    System.out.println("Book is already Issue.");
                    return;
                }

                book.availability = false;
                System.out.println("Book Issued Successfully!");

                return;
            }
        }
            System.out.println("Book not found.");
    }

    void returnBook(int id){

        for( Book book : books){
            if( book.bookId == id){
                if(book.availability){
                    System.out.println("Book is already Available.");
                    return;
                }

                book.availability = true;
                System.out.println("Book Returned Successfully!");
                return;
            }
        }
        System.out.println("Book not found!");
    }
}
