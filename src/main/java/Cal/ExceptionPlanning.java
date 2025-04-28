package Cal;

public class ExceptionPlanning extends Exception {
    private int chCodeErrur;

    public int getChCodeErrur(int parCodeErrur) {
        chCodeErrur = parCodeErrur;
    }
    public ExceptionPlanning(int parCodeErrur) {
        chCodeErrur = parCodeErrur;
    }
    public int getChCodeErrur() {
        return chCodeErrur;
    }
}
