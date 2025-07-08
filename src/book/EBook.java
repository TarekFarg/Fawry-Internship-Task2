package book;

import service.MailService;

public class EBook extends Book{
    private String fileType ;

    public EBook(String ISBN , String title , int publicationYear , double price , String fileType)
    {
        super(ISBN, title, publicationYear, price);
        this.fileType = fileType ;
    }

    @Override
    public void buy(int quantity, String email, String address) {
        MailService.sendTo(email);
        System.out.println("Paid amount: " + price);
    }
}
