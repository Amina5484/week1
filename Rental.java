public class Rental {
    private String date;
    private Book book;
    private Person person;

    public Rental(String date,Book book,Person person) {
        this.book = book;
        this.date = date;
        this.person = person;
        book.addRental(this);
        person.addRental(this);


    }
    public String getDate() {
        return date;
    }


    public Book getBook() {
        return book;
    }

    public Person getPerson() {
        return person;
    }

}