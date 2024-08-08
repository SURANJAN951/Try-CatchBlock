public class ExceptionH {

    public static void main(String[] args) {
        int num1=6;
        int num2=2;
        int result;
        int value[]={3,4,5,6};
        try //try block need catch or finally block
        {
            result = num1/num2;
            System.out.println(result);
            System.out.println(value[5]);
        }catch (ArithmeticException ee)// this is for handling arithmetic exceptions.
        {
            System.out.println("Can't divide by zero ");
        }
        catch (ArrayIndexOutOfBoundsException e){ //This is for handling array limits exception.
            System.out.println("Stay in your Limits");
        }
        catch (Exception e){ // this is for handling all other exceptions other than above two exceptions.
            System.out.println("Something went wrong");
        }
        finally {
            //code that will always run.The finally block in Java is used to execute code that must run regardless
            // of whether an exception was thrown or caught in the try block. It's primarily used for cleanup activities,
            // such as releasing resources (e.g., closing files, releasing database connections, etc.).
        }
    }
}
