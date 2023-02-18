import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;


public class Main {

  // ArrayList for movie options
  ArrayList<String> movies = new ArrayList<>();

  // ArrayList for show options
  ArrayList<String> shows = new ArrayList<>();
  
  // Method that returns a random movie from the list
  public String getRandomMovie() {
    if (movies.isEmpty()) {
      return "No movies to choose from";
    }
    int x = (int) Math.max(movies.size() - 1, Math.random() * movies.size());
    return "You should watch " + movies.get(x);
  }

  // Method that returns a random show from the list
  public String getRandomShow() {
    if (shows.isEmpty()) {
      return "No shows to choose from";
    }
    int x = (int) Math.max(movies.size() - 1, Math.random() * movies.size());
    return "You should watch " + shows.get(x);
  }

  // Method that returns a random movie or show from the list
  public String getRandomMovieOrShow() {
    int w = (int)Math.random() * 100;
    if (w <= 50) {
      return getRandomMovie();
    }
    return getRandomShow();
  }

  public void displayMovies() {
    System.out.println(movies);
  }

  public void displayShows() {
    System.out.println(shows);
  }
  
  // Method that adds a movie to the list
  // Parameter: String movie - show to be added to list
  public void addMovie(String movie) {
    movies.add(movie);
  }

  // Method that adds a show to the list
  // Parameter: String show - show to be added to list
  public void addShow(String show) {
    shows.add(show);
  }

  
  public static void main(String[] args) {

    Main list = new Main();
    
    Scanner scanner = new Scanner(System.in);
    boolean doingSomething = true;
    
    while (doingSomething) {
      System.out.println("What do you want to do?");
    System.out.println("RandomMovie  RandomShow  RandomMovieOrShow  AddMovie  AddShow  DisplayMovies  DisplayShows  Exit");
    String command = scanner.nextLine();
    if (command.equals("RandomMovie")) {
        
      System.out.println(list.getRandomMovie());
      
    } else if (command.equals("RandomShow")) {
        
      System.out.println(list.getRandomShow());
      
    } else if (command.equals("RandomMovieOrShow")) {
        
      System.out.println(list.getRandomMovieOrShow());
      
    } else if (command.equals("AddMovie")) {
      
      System.out.println("What movie would you like to add?");
      String movie = scanner.nextLine();
      list.addMovie(movie);
      
    } else if (command.equals("AddShow")) {
      
      System.out.println("What show would you like to add?");
      String show = scanner.nextLine();
      list.addShow(show);
      
    } else if (command.equals("DisplayMovies")) {
      
      list.displayMovies();
      
    } else if (command.equals("DisplayShows")) {
      
      list.displayShows();

    } else if (command.equals("Exit")) {
     
      doingSomething = false;
      
    } else {
     
      System.out.println("Please type one of the options exactly as shown");
      System.out.println("This program is case sensitive and sensitive to spaces");
      continue;
      
    }
    }

  scanner.close();
    
  }
}
