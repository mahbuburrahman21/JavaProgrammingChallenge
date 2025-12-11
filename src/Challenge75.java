public class Challenge75 {
    static void main(String[] args) {
        String[] array = new String[] {"This", "is", "the", "best", "course", "for", "java", "on the", "online"};
        StringBuilder sentence = new StringBuilder();
        for (String str : array){
            sentence.append(str).append(" ");
        }
        System.out.println(sentence);
    }
}
