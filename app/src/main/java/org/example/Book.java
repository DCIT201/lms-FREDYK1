public class Book {

    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String gettitle(){
        return title;
    }

    public String getauthor(){
        return author;
    }
    
    public int getyearPublished(){
        return yearPublished;
    }

    public void settitle(String title){
        this.title = title;
    }

    public void setauthor(String author){
        this.author = author;
    }

    public void setyearPublished(int yearPublished){
        this.yearPublished = yearPublished;
    }
    
}
