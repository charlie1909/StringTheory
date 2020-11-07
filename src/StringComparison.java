public class StringComparison {

    public String concatString(char c, int n){
        String answer = "";
        for(int i = 0; i< n; i++){
            answer += c;
        }
        return answer;
    }

    public String stringBuilder(char c, int n){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i< n; i++){
            sb.append(c);
        }
        return sb.toString();
    }
}
