import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class CountWord {
    public static void main(String[] args) {
        Map<String,Integer> wordCount = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input word:");
        String input = sc.nextLine();

        input = input.toLowerCase();

        String [] words = input.split("\\s");

        for(String word:words){
            if(wordCount.containsKey(word)){
                wordCount.put(word,wordCount.get(word)+1);
            } else{
                wordCount.put(word,1);
            }
        }
        System.out.println("Tần suất xuất hiện của các từ ");
        for(Map.Entry<String,Integer> entry :wordCount.entrySet()){
            System.out.println(entry.getKey()+ ":" + entry.getValue());
        }
    }


}
