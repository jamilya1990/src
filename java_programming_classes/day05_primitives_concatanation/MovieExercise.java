package java_programming_classes.day05_primitives_concatanation;

public class MovieExercise {
    public static void main (String[] args) {
          /*  ==============================================================================

        2) Create a class Movie
    create a main method

        - Each the datatype you feel is most appropriate for each variable.

        - Create the following variables:
        name, genre, duration, release date, rating(G, PG, R, etc..), is a sequels or not,
        rotten tomatoes rating (out of 100), is on dvd.

                - Print out the Movie information using concatenations and print statements

                ------ Welcome to the Cinema ------

                Tonight we are streaming "$movieName" which was released on $releaseDate
        This $genre movie got a $rottenTomatoesRating rating on Rotten Tomatoes.
        The rating is $rating and it runs for $duration hours.
        This is a sequel $isSequel and is on dvd $isOnDvd.
*/
        String movieName = "\"Avatar\"";
        String movieGenre = "Action, Adventure, Fantasy";
        short movieDuration = 168;
        String releaseDate = "18 December 2009 (USA)";
        String movieRating = "PG-13";
        boolean sequel = false;
        byte rottenTomatoesRating = 82;
        boolean isOnDVD = true;

        System.out.println("------ Welcome to the Cinema ------" + "\nTonight we are streaming " + movieName
        + " which was released on " + releaseDate + "\nThis " + movieGenre + " movie got a " + rottenTomatoesRating + "% rating on \"Rotten Tomatoes\"."
        + "\nThe rating is " + movieRating + " and it runs for " + movieDuration + " minutes."
        + "\nThis is a sequel?\t" + sequel + "\nIs movie on DVD?\t" + isOnDVD);

    }
}
