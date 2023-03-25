//If Else
//Relational operator
/*public class Conditionals {
    public static void main(String[] args) {
        int age=26;
        if(age>18){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}*/

//Logical operator &&->And,!->Not,||->Or
/*
 * And operator:
 * T&&T=T                T=true,F=false
 * T&&F=F
 * F&&T=F
 * F&&F=F
 */
/*
 * public class Conditionals {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=true;
        if (a && b)
        {
            System.out.println("T");
        }
        else
        {
            System.out.println("F");
        }
    }
}
 */
/*
 * OR operator:
 * T&&T=T                T=true,F=false
 * T&&F=T
 * F&&T=T
 * F&&F=F
 */
/*public class Conditionals {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=true;
        if (a || b)
        {
            System.out.println("T");
        }
        else
        {
            System.out.println("F");
        }
    }
}*/
//Switch Case
/**
 * Conditionals
 * public class Conditionals {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age: ");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();

        switch (age) {
            case 18:
            System.out.println("You are going to be adult");
            break;
            case 23:
            System.out.println("You are getting your job");
            break;
            case 60:
            System.out.println("You are going to get a job");
            break;
            default:
            System.out.println("Enjoy your life");
        }
    }
}
 */
/*
 * public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int comp_choice = rand.nextInt(3); // taking computer input (random)

        System.out.println("0 --> Rock\n1--> Paper\n2--> Scissors\n");
        System.out.print("What do you chose:\t");
        int user_choice = sc.nextInt(); // taking user input

        // Game Logic
        System.out.printf("You chose %d\n", user_choice);
        System.out.printf("Computer chose %d\n", comp_choice);


        if (comp_choice == user_choice) {
            System.out.println("Its a draw!");
        } else if (comp_choice == 0) {
            if (user_choice == 1) {
                System.out.println("You Won");
            } else if (user_choice == 2) {
                System.out.println("Computer Won");
            }
        } else if (comp_choice == 1) {
            if (user_choice == 0) {
                System.out.println("Computer Won");
            } else if (user_choice == 2) {
                System.out.println("You Won");
            }
        } else if (comp_choice == 2) {
            if (user_choice == 0) {
                System.out.println("You Won");
            } else if (user_choice == 1) {
                System.out.println("Computer Won");
            }
        }

    }
}
 */
//LOOPS
//While loop:
/**
 * Conditionals
 */
/*public class Conditionals {
   public static void main(String[] args) {
       System.out.println("Using Loops:");
       int i=1;
       while(i<=3)
       {
           System.out.println(i);
           i++;
       }
   }
}*/
//Write a program to print natural numbers from 100 to 200
/**
 * Conditionals
  public class Conditionals {

   public static void main(String[] args) {
       int i=100;
       while(i<=200)
       {
           System.out.println(i);
           i++;
       }
   }
}
 */
//Do-While loop:
/*
 * 
 */
/**
 * Conditionals
 * public class Conditionals {

    public static void main(String[] args) {
        int b=0;
        do{
            System.out.println(b);
            b++;
        }
        while(b<5);
    }
}
 */
//Write a program to print first n natural numbers using do-while loop
/*
 * 
 */
/**
 * Conditionals
 * public class Conditionals {

    public static void main(String[] args) {
        int n=1;
        do{
            System.out.println(n);
            n++;
        }
        while(n<=45);
    }
}*/
//For loop:
/**
 * Conditionals
 * public class Conditionals {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
 */
//Write a program to print first n odd numbers using a for loop:
/**
 * Conditionals
 * 2i=even;
 * 2i+1=odd;
 * public class Conditionals {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        System.out.println(2*i+1);
    }
}*/
//Decrementing for loop:
/**
 * Conditionals
 * public class Conditionals {

    public static void main(String[] args) {
        for(int i=5;i!=0;i--)
        System.out.println(i);
    }
}*/
//Write a program to print first n natural numbers in reverse order
/**
 * Conditionals
 * public class Conditionals {
    public static void main(String[] args) {
        int n=30;
        for(int i=n;i!=0;i--)
        System.out.println(i);
    }
}
public class Conditionals {
    public static void main(String[] args) {
    System.out.println("Enter the number upto which you want your odd numbers: ");
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    for (int i=1; i<n; i=i+2){
        System.out.println(i);
    } 
    }}
 */
//Break and continue:
/**
 * Conditionals
 * //Using for loop:
 * public class Conditionals {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println("Java is great");
            if (i == 3) {
                System.out.println("Ending the loop");
                break;
            }
        }
    }
}
//using while loop:
public class Conditionals {

    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            System.out.println("Java is great");
            if (i == 3) {
                System.out.println("Ending the loop");
                break;
            }
            i++;
        }
    }
}
 */

/**
 * Conditionals
 * public class Conditionals {

    public static void main(String[] args) {
        int p, q;
        System.out.println("The right angle triangle is:");
        for (p = 1; p <= 9; p++) {
            for (q = 1; q <= p; q++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
 */
