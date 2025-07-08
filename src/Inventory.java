import book.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    private Map<String, Book> inventory ;

    public Inventory()
    {
        inventory = new HashMap<>() ;
    }
    public void addBook(Book book )
    {
        inventory.put(book.getISBN(),book) ;
        System.out.println("Add "+ book.getTitle() + " to the store");
    }
    public void removeOutdated(int numOfYears , int currentYear ){
        List<String> toRemove = new ArrayList<>() ;
        // collect the book that will be removed
        for(Book book : inventory.values())
        {
            if(currentYear - book.getPublicationYear() >= numOfYears)
            {
                toRemove.add(book.getISBN()) ;
            }
        }

        for(String ISBN : toRemove)
        {
            System.out.println("Remove " + inventory.get(ISBN).getTitle());
            inventory.remove(ISBN) ;
        }
    }

    public void buy(String ISBN , int quantity , String email , String address)
    {
        if(!inventory.containsKey(ISBN))
        {
            // do something
            return;
        }
        inventory.get(ISBN).buy(quantity,email,address);
    }

}
