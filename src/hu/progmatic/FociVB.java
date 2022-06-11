package hu.progmatic;

public class FociVB {
    private String year;
    private String stage;
    private String date;
    private String teamA;
    private String teamB;
    private int goalsA;
    private int goalsB;
    private int penaltiesA;
    private int penaltiesB;

    public FociVB() {
    }
    public FociVB(String csvSor) {
        String[] adatok=csvSor.split(";");

      /* if(adatok.length > 5) {
            return new FociVB(adatok);
        }else {
            return
        }
        /*

         */
        this.year=adatok[0];
        this.stage=adatok[1];
        this.date=adatok[2];
        this.teamA=adatok[3];
        this.teamB=adatok[4];
        this.goalsA=Integer.parseInt(adatok[5]);
        this.goalsB=Integer.parseInt(adatok[6]);
        this.penaltiesA=Integer.parseInt(adatok[7]);
        this.penaltiesB=Integer.parseInt(adatok[8]);

    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTeamA() {
        return teamA;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    public int getGoalsA() {
        return goalsA;
    }

    public void setGoalsA(int goalsA) {
        this.goalsA = goalsA;
    }

    public int getGoalsB() {
        return goalsB;
    }

    public void setGoalsB(int goalsB) {
        this.goalsB = goalsB;
    }

    public int getPenaltiesA() {
        return penaltiesA;
    }

    public void setPenaltiesA(int penaltiesA) {
        this.penaltiesA = penaltiesA;
    }

    public int getPenaltiesB() {
        return penaltiesB;
    }

    public void setPenaltiesB(int penaltiesB) {
        this.penaltiesB = penaltiesB;
    }
}
