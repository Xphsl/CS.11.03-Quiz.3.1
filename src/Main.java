public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int num) {
        if (num >= 90) {
            return 'A';
        }
        if (num >= 80 && num <= 89) {
            return 'B';
        }
        if (num >= 70 && num <= 79) {
            return 'C';
        }
        if (num >= 60 && num <= 69) {
            return 'D';
        }
        if (num >= 50 && num <= 59) {
            return 'E';
        }

        return 'F';

    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int numb) {

    if(numb%3==0)

    {
        return "Fizz";
    }
    if(numb%5==0)

    {
        return "Buzz";
    }
    return "Unlucky";
}

    // Question 3 - frontBack
    public static String frontBack(String he) {
        //if (he)
        return "";
    }
    // Question 4 - twoAsOne
    public static boolean twoAsOne( int a, int b, int c)
    {
        if ((a + b == c) || (b + c == a) || (a + c == b)) {
            return true;
        }
        return false;
    }
    // Question 5 - endUp
    public static String endUp(String a){
    //if ()
        return "";
    }
}