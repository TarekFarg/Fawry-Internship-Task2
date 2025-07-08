package book;

import service.ShippingService;

public class PaperBook extends Book{

    private int stock ;
    public PaperBook(String ISBN , String title , int publicationYear , double price , int stock)
    {
        super(ISBN,title,publicationYear,price);
        this.stock = stock ;
    }

    @Override
    public void buy(int quantity, String email, String address) {
        if(quantity > stock)
        {
            throw new RuntimeException("Not enough stock\n--------------------------------------------------------------") ;
        }
        ShippingService.ShipTo(address);
        System.out.println("Paid amount: " + quantity*price);
        System.out.println("--------------------------------------------------------------");
        stock -= quantity ;
    }


}
