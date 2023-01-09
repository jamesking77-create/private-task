package reflection;

public class Problem {
    private String problemName;
    private enum problemType {Financial, Spiritual, Educational, Business}
    private final boolean isSolved;

    public Problem(String problemName, boolean isSolved) {
        this.problemName = problemName;
        this.isSolved = isSolved;
    }


    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public String getProblemName() {
        return problemName;
    }

    public boolean isSolved() {
        return isSolved;
    }
}
