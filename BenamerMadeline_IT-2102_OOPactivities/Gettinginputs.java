import java.util.Scanner;
public class Gettinginputs 
{
    public static void main(String[]args) 
    {
        Scanner input = new Scanner(System.in);
        int Year;
        String Genre, Album, Title, Artist;
        System.out.print("Enter the year: ");
        Year = input.nextInt();
        System.out.print("Enter the genre: ");
        Genre  = input.nextLine();
        System.out.print("Enter the album: ");
        Album  = input.nextLine();
        System.out.print("Enter the song title: ");
        Title  = input.nextLine();
        System.out.println ("Enter the artist: ");
        Artist  = input.nextLine();
        System.out.println ("--------------------------");
        System.out.println ("SONG DETAILS");
        System.out.println ("--------------------------");
        System.out.println ("Year Released: " + Year);
        System.out.println ("Genre: " + Genre);
        System.out.println ("Album: " + Album);
        System.out.println ("Title: " + " " + Title);
        System.out.println ("Artist: " + Artist);

    }
    
}