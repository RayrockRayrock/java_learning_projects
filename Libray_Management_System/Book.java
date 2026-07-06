public class Book{
  String author_name;
  String book_name;
  boolean have;

  Book(String author_name, String book_name){
    this.author_name = author_name;
    this.book_name = book_name;
    this.have = true;
  }

  public String get_book_name(){
    return book_name;
  }
  public String get_author_name(){
    return author_name;
  }
}
