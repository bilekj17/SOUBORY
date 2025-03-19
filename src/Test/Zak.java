package Test;

public class Zak {
    private String lastName;
    private String firstName;
    private String ssn;
    private float[] znamky;
    private String grade;

    public Zak(String text) {
        String[] split = text.split(",");
        this.lastName = parseString(split[0]);
        this.firstName = parseString(split[1]);
        this.ssn = parseString(split[2]);
        this.znamky = new float[]{
                parseFloat(split[3]),
                parseFloat(split[4]),
                parseFloat(split[5]),
                parseFloat(split[6]),
                parseFloat(split[7])
        };
        this.grade = parseString(split[8]);
    }

    private String parseString(String text) {
        return text.trim().substring(1,  text.trim().length() - 1);
    }
    private float parseFloat(String text) {
        return Float.parseFloat(text);
    }

    public String getCleanGrade() {
        return grade.substring(0, 1);
    }
    public int getNumberGrade() {
        grade = getCleanGrade();
        switch (grade) {
            case "A"-> {return 1;}
            case "B"-> {return 2;}
            case "C"-> {return 3;}
            case "D"-> {return 4;}
            case "E"-> {return 5;}
            case "F"-> {return 6;}
        }
        return 0;
    }

    public float[] getZnamky() {
        return this.znamky;
    }

    public String getName() {
        return firstName+" "+lastName;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + " - " + grade;
    }
}
