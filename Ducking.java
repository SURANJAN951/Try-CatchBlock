public class Ducking {
    public void a() throws Exception{ //throws exception likh ke ham...exception ko
        //solve karne se bach rahe hai, means taal rahe hai.
        b();
    }
    public void b() throws Exception{ //yaha bhi ham exception ko solve karne ke bajay
        //taal rahe hai.
        int num1 = 6;
        int num2=0;
        int result=num1/num2;
    }
    public static void main(String[] args) { //we can also write throws Exception here
        //but that will not be a good practise
     Ducking obj = new Ducking();
     try{
         obj.a();
     } catch (Exception e){
         System.out.println("you have got some error");
     }
    }
}
