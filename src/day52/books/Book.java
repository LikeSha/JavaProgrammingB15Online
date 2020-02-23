package day52.books;

public abstract class Book implements KnowledgeBank {

    /**
     * Book--abstract
     *
     *   String name;
     *   String author;
     *
     *   --add constructor to set the fields
     *
     *  --abstract void method
     *   displayBookInfo();
     *
     *
     *
     * ---concrete
     * PaperBook
     *
     *     int weight;
     *
     *     -- add constructor to set all the fields
     *     implement abstract method
     *
     *     instance method
     *        read();
     *        toString();
     *
     * AudioBook
     *     double duration;
     *
     *      instance method
     *         listen();
     *         toString();
     *
     * Create an interface KnowledgeBank
     *
     *      abstract method takeNote();
     *      default method showTableOfContent(){
     *
     *      }
     * Create another interface called Readable
     *        abstract method read();
     *
     *
     *  Book implements KnowledgeBank
     *  AudioBook, PaperBook extends Book
     *  PaperBook implements Readable
     *
     *  AudioBook IS-A Book
     *  PaperBook IS-A Book
     *  PaperBook IS-A KnowledgeBank
     *  Book IS-A KnowledgeBank
     *  PaperBook IS-A Readable
     *  AudioBook IS-A Readable NO!!!!
     *
     *  Create List<Book> add all your books
     *   displayInfo on all of them
     *   find out how many PaperBook is there
     */


      String name;
      String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public abstract void displayInfo();

    // public abstract void takeNotes();

}
