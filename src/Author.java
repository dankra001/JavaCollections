public class Author {

    private String authorName;
    private String authorSurname;
    private String authorSex;

   public Author(String authorName,
                 String authorSurname,
                 String authorSex){
       this.authorName = authorName;
       this.authorSurname = authorSurname;
       this.authorSex = authorSex;
   }


   //gettery
    public String getAuthorName() { return authorName; }

    public String getAuthorSurname() { return authorSurname; }

    public String getAuthorSex() { return  authorSex; }

    //settery
    public void setAuthorName(String newAuthorName) { this.authorName = newAuthorName; }

    public void setAuthorSurname(String newAuthorSurname) { this.authorSurname = newAuthorSurname; }

    public void setAuthorSex(String newAuthorSex) { this.authorSex = newAuthorSex; }

    @Override
    public String toString(){
        String output = "";
        output += "Author Name = " + authorName + '\n';
        output += "Author Surname = " + authorSurname + '\n';
        output += "Author Sex = " + authorSex + '\n';
        return output;
    }
}


