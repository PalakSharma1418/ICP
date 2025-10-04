public class hello {
    public static void main(String[] args) {
        // print hello world without using ;
        if(System.out.printf("Hello%nworld%n")==null){}

        // you dont directly have to use the vowels in your name and print your name
        System.out.printf("%cnk%ct ",65,105);

        // by deafult long dekr bhi long nhi ata int aajata hai to L lagado last me
        long num1=100*24*12*60*60L;
        System.out.println(num1);

        

        // WE HAVE 3 variable if c=1 display a and if c=0 display b only with the help of arithmetic operator
        int a=23;
        int b=324;
        int c=1;
        int res=a*(c) +b*(1-c);
        System.out.println(res);
    }
}