import java.util.HashMap;

public class TrackList {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("OMG", "Oh my, oh my God I was really hoping that he will come through");
        map.put("Ditto", "Stay in the middle Like you a little Don't want no riddle");
        map.put("Super Shy", "I'm super shy, super shy But wait a minute while I make you mine, make you mine");
        map.put("Hype Boy", "'Cause I know what you like boy (ah-ah) You're my chemical hype boy (ah-ah)");
        System.out.println(map.get("OMG"));

        for (String key : map.keySet()){
            System.out.println("Track: " + key + " , Lyrics " + map.get(key));
        }
    }
}