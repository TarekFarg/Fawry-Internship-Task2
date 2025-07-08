import book.EBook;
import book.PaperBook;
import book.ShowcaseBook;

// TEST CLASS

public class BookStore {
    public static void main(String[] args) {
        Inventory inventory = new Inventory() ;
        inventory.addBook(new PaperBook("book1","java" , 2020 ,100,10));
        inventory.addBook(new PaperBook("book2","python" , 2019 ,100,10));

        inventory.addBook(new EBook("book3","Math" , 2021 ,100,"pdf"));
        inventory.addBook(new EBook("book4","C++" , 2022 ,100,"word"));

        inventory.addBook(new ShowcaseBook("book5","C#" , 2024 ,0));
        inventory.addBook(new ShowcaseBook("book6","SQL" , 2018 ,0));
        System.out.println("--------------------------------------------------------------");


        try{
            inventory.buy("book2",11,"tarekfarg01@gmail.com","Cairo");
        }catch (RuntimeException e)
        {
            System.out.println(e.getMessage());
        }

        try{
            inventory.buy("book4" ,1,"tarekfarg01@gmail.com","Cairo");
        }catch (RuntimeException e)
        {
            System.out.println(e.getMessage());
        }

        try{
            inventory.buy("book6" ,1,"tarekfarg01@gmail.com","Cairo");
        }catch (RuntimeException e)
        {
            System.out.println(e.getMessage());
        }


        inventory.removeOutdated(3,2025);
    }
}