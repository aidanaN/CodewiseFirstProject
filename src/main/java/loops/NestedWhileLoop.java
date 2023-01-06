package loops;

public class NestedWhileLoop {
    public static void main(String[] args) {
        int r = 1;
        while ( r <= 3){
            System.out.println("Year: 202" + r);
            r++;
            int t = 1;
            while ( t <= 12){
                System.out.println("    month " + t);
                t++;

            }
            int y = 2000;
            while ( y<=5000) {
                System.out.println(y);
                int p = y + 1;
                while (p <= y + 49) {
                    System.out.println(" " + p);
                    p++;
                }
                y += 1000;
                }
                System.out.println(" Wohoo, I'm done");
            }



        int i = 1;
        while ( i <= 6) {

            int p = 1;
            while ( p <= i ){
                System.out.print(i);
                p++;

            }
            System.out.println();
            i++;
        }

        int g = 1;
        while ( g < 10){
            System.out.println("Multiplication table for: " + g);

            int v = 1;
            while ( v < 10){
                v++;
                System.out.println(g + "*" + v + "=" + (g*v));


            }
            g++;
        }

        for (int d = 1; d < 10; d++){
            System.out.println("Multiplication table for: " + d);
            for (int w = 1; w < 10; w++){
                System.out.println(d + "*"+ w + "=" + (d*w));

            }
        }
        System.out.println();

        int num1 = 1;

         do {
             int num2 = 1;
             if (num1%2==0){
                 do{
                     System.out.print(num1);
                         num2++;
                 }while (num1 >= num2);
                 System.out.println();
             }else {
                 System.out.println(num1 + "  -odd");
             }
             num1++;
         } while (num1 <= 10);


    }


    }

