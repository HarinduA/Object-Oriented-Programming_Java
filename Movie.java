public class Movie {
    // Private instance variables
    private String title;
    private String category;
    private int numAwards;
    private Director director;

    // Constructor
    public Movie(String title, String category, Director director) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.numAwards = 0;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for category
    public String getCategory() {
        return category;
    }

    // Getter for director
    public Director getDirector() {
        return director;
    }

    // Setter for number of awards
    public void setNumAwards(int numAwards) {
        this.numAwards = numAwards;
    }

    // Getter for number of awards
    public int getNumAwards() {
        return numAwards;
    }

    @Override
    public String toString() {
        return "Movie [title = " + title +
                ", category = " + category +
                ", director name = " + director.getName() +
                ", director surname = " + director.getSurname() +
                ", number of awards = " + numAwards + "]";
    }
}
