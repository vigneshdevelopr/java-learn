
//initiate the class
class main {

    public static void main(String args[]){
        // code
        variables(args);
        typeconversion_and_casting(args);
        demo(args);
    }
        public static void variables(String args[]){
               String name = "Vignesh";
               byte min = Byte.MAX_VALUE; 
               long a = 1910l;
               long max = Long.MIN_VALUE;
               System.out.println(max);
               
               long b = a;
               float num1 = 5.6f;
               System.out.println(num1);
               
               double num = 5.60923823491239;
               for(int i=0; i<=10;i++){
                   // System.out.println(i);
               }
               char character = 'v';
               boolean tf = true;
               System.out.println(character);
               System.out.println(tf);
               System.out.println(name);
               System.out.println(num);
               System.out.println(min);
               System.out.println(b);
    }

        public static void typeconversion_and_casting(String args[]){
            byte small = 127;
            int large = 12;
            
            small = (byte)large;
            System.out.println("typecasting and conversion");
            System.out.println(small);

    }



        public static void demo(String args[]){
            int num1 = 957;
            byte k = (byte)num1;
            System.out.println(k);
        }
}