public class fibonacci{
  public static int fac(int n){
    if (n<=1){
        System.out.println(1);
        return 0;
    }else{
        int a=fac(n-1);
        System.out.println(a);
        return 1;
    }
  }
    public static void main(String[] args) {
        fac(4);
    }
}