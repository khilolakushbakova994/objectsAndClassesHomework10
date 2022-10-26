public class Book {
     String authorName;
     int publishingYear;
    public Book (String authorName, int publishingYear){
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }
        public String getAuthorName () {
        return authorName;

        }
    public int getPublishingYear (){
        return publishingYear;
    }
    public void setPublishingYear () {
        this.publishingYear = 2022;
    }


}
