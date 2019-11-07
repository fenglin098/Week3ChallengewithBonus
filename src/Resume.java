import java.util.ArrayList;

public class Resume {
    private ArrayList<JobSeeker> arrUser;
    private ArrayList<Education> arrEducation;
    private ArrayList<WorkExperience> arrWorkExperience;
    private ArrayList<Skills> arrSkills;

    public Resume() {
    }

    public Resume(ArrayList<JobSeeker> arrUser, ArrayList<Education> arrEducation, ArrayList<WorkExperience> arrWorkExperience, ArrayList<Skills> arrSkills) {
        this.arrUser = arrUser;
        this.arrEducation = arrEducation;
        this.arrWorkExperience = arrWorkExperience;
        this.arrSkills = arrSkills;
    }

    public ArrayList<JobSeeker> getArrUser() {
        return arrUser;
    }

    public void setArrUser(ArrayList<JobSeeker> arrUser) {
        this.arrUser = arrUser;
    }

    public ArrayList<Education> getArrEducation() {
        return arrEducation;
    }

    public void setArrEducation(ArrayList<Education> arrEducation) {
        this.arrEducation = arrEducation;
    }

    public ArrayList<WorkExperience> getArrWorkExperience() {
        return arrWorkExperience;
    }

    public void setArrWorkExperience(ArrayList<WorkExperience> arrWorkExperience) {
        this.arrWorkExperience = arrWorkExperience;
    }

    public ArrayList<Skills> getArrSkills() {
        return arrSkills;
    }

    public void setArrSkills(ArrayList<Skills> arrSkills) {
        this.arrSkills = arrSkills;
    }
}
