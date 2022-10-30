public class Author {
     private final String authorName;
      private final String authorSurname;

    public Author (String authorName, String authorSurname){
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName () {
        return authorName;
    }
    public String getAuthorSurname () {
        return authorSurname;
    }
    public String toString () {
        return " Имя писателя  " + authorName + "\n  Фамилия писателя  " + authorSurname;
    }


}
