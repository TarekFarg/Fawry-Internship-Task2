package book;

public abstract class Book {
    protected String ISBN ;
    protected String title ;
    protected int publicationYear ;
    protected double price ;

    public Book(String ISBN , String title , int publicationYear , double price)
    {
        this.ISBN = ISBN ;
        this.title = title ;
        this.publicationYear = publicationYear ;
        this. price = price ;
    }

    public String getISBN()
    {
        return ISBN ;
    }

    public String getTitle()
    {
        return title ;
    }

    public int getPublicationYear()
    {
        return publicationYear ;
    }
     public abstract void buy(int quantity , String email , String address) ;
}
