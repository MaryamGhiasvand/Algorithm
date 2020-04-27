public class GenerateSequence {
    //generates the following sequence of numbers:  a = ⟨0,1,1,2,3,5,8,...
    //is generated by the following formula: a0 =0; a1 =1 an =an−1 +an−2.
    public static long generate(int n) {
        String series = "0";
        int sum = 1;
        int temp = 0;
        if (n == 0) return 0;
        if (n == 1) return 1;
        //implement
//        else if(n>1)
//            series= String.valueOf(generate(n-1)) +String.valueOf(generate((n-2)));
//        return Integer.parseInt(series);
//    }
        for (int i = 1; i <= n; i++) {
            series += String.valueOf(sum);
            int temp2=temp;
            temp = sum;
            sum += temp2 ;
        }
        return Integer.parseInt(series);
    }
}