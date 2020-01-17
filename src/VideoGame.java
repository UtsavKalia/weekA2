import java.util.Arrays;
import java.util.List;

public class VideoGame {
      private String name, type,platform;

    private double rating;

    public VideoGame(String name, String type, String platform, double rating) {
        setName(name);
        setType(type);
        setPlatform(platform);

        setRating(rating);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        List<String> gamename = Arrays.asList("Call of Duty","Mario","Spiderman","Skyrim");
        if (gamename.contains(name))
        this.name = name;
        else
            throw new IllegalArgumentException("name must be"+gamename);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        List<String> gameType = Arrays.asList("Action","Sports","Adventure","Puzzle");
        if (gameType.contains(type))
        this.type = type;
        else
            throw new IllegalArgumentException("game type must be"+gameType);
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        List<String> platformNeeded = Arrays.asList("Playstation","Xbox","PC","VR");
        if (platformNeeded.contains(platform))
        this.platform = platform;
        else throw new  IllegalArgumentException("the platform must be these"+platformNeeded);
    }



    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating>=0 && rating<=5)
        this.rating = rating;

        else
            throw  new  IllegalArgumentException("the rating must be in between 0 to 5");
    }

    public String toString(){

        return String.format("this super cool game is %s %n its type is %s platform %s rating %s",name,type,platform,rating);
    }

}