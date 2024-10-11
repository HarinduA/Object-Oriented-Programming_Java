public class Test {
    public static void main(String[] args) {
        Date date = new Date(5,10,2004);
        System.out.println(date);


        Director director = new Director("James", "Cameron");
        director.setNumOfMoviesDirected(10);
        director.setDoB(date);
        System.out.println(director);

        Movie avatar = new Movie("Avatar", "Fantasy", director);
        avatar.setNumAwards(3); // Set the number of awards

        // Print the movie's details
        System.out.println(avatar);
    }
}
