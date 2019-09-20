import java.util.ArrayList;

public class Resumee {
    public String name;
    public String emailAdress;
    public ArrayList<Education> educationArray;
    public ArrayList<Job> jobArray;
    public ArrayList<Skill> skillsArray;

    public Resumee(){}

    public Resumee(String name, String emailAdress, ArrayList<Education> edu, ArrayList<Job> jobs, ArrayList<Skill> skills){
        this.name = name;
        this.emailAdress = emailAdress;
        this.educationArray = edu;
        this.jobArray = jobs;
        this.skillsArray = skills;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public ArrayList<Education> getEducation() {
        return educationArray;
    }

    public void setEducation(ArrayList<Education> educations) {
        this.educationArray = educations;
    }

    public ArrayList<Job> getJob() {
        return jobArray;
    }

    public void setJobArray(ArrayList<Job> jobs) {
        this.jobArray = jobs;
    }

    public ArrayList<Skill> getSkill() {
        return skillsArray;
    }

    public void setSkill(ArrayList<Skill> skills) {
        this.skillsArray = skills;
    }

    public String toString(){
        System.out.println("\nResumee" +getName()+"\n"+getEmailAdress()+"\n");
        System.out.println("Education");
        for(Education education : educationArray){
            System.out.println(education.toString());
        }
        System.out.println("Experience");
        for(Job job : jobArray){
            System.out.println(job.toString());
        }
        System.out.println("Skills");
        for(Skill skill : skillsArray){
            System.out.println(skill.toString());
        }
        return "";
    }
}
