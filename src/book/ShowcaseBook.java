package book;

public class ShowcaseBook extends Book {

    public ShowcaseBook(String ISBN , String title , int publicationYear , double price)
    {
        super(ISBN,title,publicationYear,price) ;
    }

    @Override
    public void buy(int quantity, String email, String address) {
        throw new RuntimeException("This book not for sale\n--------------------------------------------------------------") ;
    }
}
