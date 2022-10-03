public class Author {
    private String name;
    private String surName;
    public Author ( String authorName, String authorSurname){
        this.name = authorName;
        this.surName = authorSurname;
    }
    public String getAuthor(){
        return this.name;
    }
    public String getSurName(){
        return this.surName;
    }
    public void setName (String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
