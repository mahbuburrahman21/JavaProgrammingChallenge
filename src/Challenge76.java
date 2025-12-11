public class Challenge76 {
    public final String NAME;
    public final int AGE;

    public Challenge76(String NAME, int AGE) {
        this.NAME = NAME;
        this.AGE = AGE;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person :");
        sb.append("NAME='").append(NAME).append('\'');
        sb.append(", AGE=").append(AGE);
        sb.append('}');
        return sb.toString();
    }

    static void main(String[] args) {
        Challenge76 person = new Challenge76("Mahbub", 25);
        System.out.println(person);
    }
}
