//package TrainingSessions;
import java.util.*;
class Playlist{
    String song;
    ArrayList<String> al = new ArrayList<String>();
    public void addSong(String song){
        al.add(song);
        System.out.println("Song "+song+" added successfully..");

    }
    public void removeSong(String song){
        if(al.contains(song)){
            al.remove(song);
            System.out.println("Song "+song+" removed successfully..");
        }
        else{
            System.out.println("Song does not exist in playlist");
        }

    }
    public void getSongs(){
        if(al.isEmpty()){
            System.out.println("Songs list is empty");
        }
        else{
        System.out.println("Playlist: ");
        System.out.print(al);
        }
    }
}

public class MusicPlayer {
    public static void main(String[] args){
        Playlist p= new Playlist();
        p.addSong("Pefect");
        p.addSong("Dynamite");
        p.addSong("Die with a smile");
        p.addSong("Lover");
        p.removeSong("Dynamite");
        p.getSongs();

    }
    
    
}
