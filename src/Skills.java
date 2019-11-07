public class Skills {
    private String skillName;
    private String skillRating;

    public Skills() {
    }

    public Skills(String skillName, String skillRating) {
        this.skillName = skillName;
        this.skillRating = skillRating;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillRating() {
        return skillRating;
    }

    public void setSkillRating(String skillRating) {
        this.skillRating = skillRating;
    }
}
