package book_catalogue;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import book_catalogue.query.Condition;

public class BookCatalogue extends ArrayList<Book> {
    public void sort() {
        Collections.sort(this);
    }

    public List<Book> filter(Condition cond) {
        List<Book> results = new ArrayList<Book>();

        for (Book book : this) {
            if (cond.isMatch(book)) {
                results.add(book);
            }
        }

        return results;
    }
}

