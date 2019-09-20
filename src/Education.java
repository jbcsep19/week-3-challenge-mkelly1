public class Education {
    String degreeType;
    String major;
    String univName;
    String gradYear;

    public Education(){
    }
    public Education(String degree, String major, String uName, String gYear){
        this.degreeType = degree;
        this.major = major;
        this.univName = uName;
        this.gradYear = gYear;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUnivName() {
        return univName;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

    public String getGradYear() {
        return gradYear;
    }

    public void setGradYear(String gradYear) {
        this.gradYear = gradYear;
    }

    public String toString(){
        return getDegreeType() +" in "+getMajor()+"\n" +
                getUnivName()+" "+getGradYear()+"\n";

    }
}
