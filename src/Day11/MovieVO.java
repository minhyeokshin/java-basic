package Day11;

public class MovieVO {

    //영화제목
    private String title;
    //개봉일
    private int startDate;
    //주인공
    private String actor;
    //장르
    private String gener;
    //러닝타임
    private String runningTime;
    //등급
    private String grade;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(String runningTime) {
        this.runningTime = runningTime;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", startDate=" + startDate +
                ", actor='" + actor + '\'' +
                ", gener='" + gener + '\'' +
                ", runningTime='" + runningTime + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }




    public MovieVO(){}
    public MovieVO(String title,String grade,String gener){
        this.title = title;
        this.grade = grade;
        this.gener = gener;
    }
}
