class CommandlineDemo1
{
    
    public static void main(String[] args)  
    {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        int r1 = n1 + n2;
        int r2 = n1 - n2;
        int r3 = n1 * n2;
        int r4 = n1 / n2;

        System.out.println("The sum is: " + r1);
        System.out.println("The difference is: " + r2);
        System.out.println("The product is: " + r3);
        System.out.println("The division is: " + r4);
    }
}

