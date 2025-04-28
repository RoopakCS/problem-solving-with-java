public class Complement {
    public static void main(String[] args) {
        int num=00001010;
        int res=00000000;
        int last;

        while(num>0) {
            last = num&1;
            num = num>>1;
            res = (res<<1) | last;
        }

        System.out.println(res);
    }    
}

