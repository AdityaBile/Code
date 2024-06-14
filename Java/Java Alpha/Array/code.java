import java.util.Arrays;

public class code {
    public static void main(String args[]){
        int ener[] = {9,-3,8,6,-7,8,10};
        
    }
    public static int maxEnergy(int[] ener){
        int answer =0 ;
        Arrays.sort(ener);
        int len = ener.length;
        answer = ener[len-1] + ener[len-2];
        return answer;

    }
}
