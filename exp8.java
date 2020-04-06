import java.util.Scanner;
//18BCA1004
class Main{

    public static void main(String arg[]){
        Main obj = new Main();
        int a=obj.setData();
        int b=obj.setData();
        obj.showResult(a,b);
    }

    int setData(){
        Scanner scan=new Scanner(System.in);
        try {
            System.out.print("Enter Number : ");
            String x=scan.next();
            int y = Integer.parseInt(x);
            return y;
        }catch (NumberFormatException e) {
            System.out.println ("Enter only numbers");
        }
        return 1;
    }
        
    void showResult(int x,int y){
        try{
            int result=x/y;
            System.out.println ("Result : "+result);
        }catch(ArithmeticException e){
            System.out.println ("Division by 0 not possible");
        }
   }
}
