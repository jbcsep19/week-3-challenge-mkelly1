import java.util.ArrayList;

public class Skill {
    //private String skillName;
    //private String rating;
    private String skillRating;
    protected static int count = 0;

    public Skill(){}

    public Skill(String sNameRating){
        this.skillRating = sNameRating;
        count = count + 1 ;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Skill.count = count;
    }

    public String toString(){
        return skillRating;
    }
}
