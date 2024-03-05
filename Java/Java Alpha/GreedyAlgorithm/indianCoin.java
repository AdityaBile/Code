import java.util.*;
public class indianCoin {
    public static void main(String args[]){
        Integer coinsSet[] = {1,2,5,10,20,50,100,500,2000};
        int money = 598;

        //sort
        Arrays.sort(coinsSet, Comparator.reverseOrder());

        ArrayList<Integer> coin = new ArrayList<>();

        int countOfCoins = 0;
        for(int i =0; i<coinsSet.length; i++){
            if(coinsSet[i] <= money){
                while(coinsSet[i] <= money){
                    countOfCoins++;
                    coin.add(coinsSet[i]);
                    money -= coinsSet[i];
                }
            }
        }
        System.out.println("Total coins required : "+countOfCoins);
        for(int i=0; i<coin.size(); i++){
            System.out.print(coin.get(i)+" ");
        }
    }
}
