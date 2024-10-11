public class Director {
    // Private instance variables
    private String name;
    private String surname;
    private int numOfMoviesDirected;
    private Date dateOfBirth;  // this shows Date class as shown earlier

    // Constructor
    public Director(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.numOfMoviesDirected = 0; // Default value
        this.dateOfBirth = null; // Default value
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for surname
    public String getSurname() {
        return surname;
    }

    // Getter for date of birth
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    // Getter for number of movies directed
    public int getNumOfMoviesDirected() {
        return numOfMoviesDirected;
    }

    // Setter for date of birth
    public void setDoB(Date date) {
        this.dateOfBirth = date;
    }

    // Setter for number of movies directed
    public void setNumOfMoviesDirected(int num) {
        this.numOfMoviesDirected = num;
    }

    @Override
    public String toString() {
        String dobString = (dateOfBirth != null)
                ? dateOfBirth.getDay() + "/" + dateOfBirth.getMonth() + "/" + dateOfBirth.getYear()
                : "N/A";

        return "Director [name = " + name + ", surname = " + surname +
                ", dob = " + dobString + ", movies Directed = " + numOfMoviesDirected + "]";
    }
}








// toString() method to return a string representation of the director

