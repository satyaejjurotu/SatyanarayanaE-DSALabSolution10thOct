package exceptions;

public class UnBalencedBracketException extends Exception {
    public UnBalencedBracketException() {
        super();
    }

    @Override
    public String toString() {
        return "Brackets are unbalenced";
    }
}
