package divisibleSumPairs;

public class Answer {

	static int divisibleSumPairs(int n, int k, int[] ar) {
        int cont=0;

        for(int i=0;i<n; i++){
            for(int j=i+1;j<n; j++){
            	
                if ((ar[i]+ar[j]) % k == 0){
                    cont++;
                }
                
            }

        }
        return cont;
    }
}
