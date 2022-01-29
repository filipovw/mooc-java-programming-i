public class Book {
    private final String author;
    private final String name;
    private final int pages;
    
    public Book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getName() {
        return this.name;
    }
    public int getPages() {
        return this.pages;
    }
    @Override
    public String toString() {
    return (this.author + ", " + this.name + ", " + this.pages + " pages");
    }
}
