public class Job {
    String company;
    String jobTitile;
    String startDate;
    String endDate;
    String description;

    public Job(){}

    public Job(String company, String jTitle, String sDate, String eDate, String descrip){
        this .company = company;
        this.jobTitile = jTitle;
        this.startDate = sDate;
        this.endDate = eDate;
        this.description = descrip;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitile() {
        return jobTitile;
    }

    public void setJobTitile(String jobTitile) {
        this.jobTitile = jobTitile;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return getJobTitile()+"\n"+getCompany()+", "+getStartDate()+" - "+getEndDate()+"\n"+
        getDescription()+"\n";
    }
}
