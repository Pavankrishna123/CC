package mnc;
public class FindEvenOrOddNumber {
 
        public static void main(String[] args) {
               
                //create an array of 10 numbers
                int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,188,31,76,8778,739,3873,28847,8388,3893487,88976,887799,98997,298656};
               
                for(int i=0; i < numbers.length; i++){
                       
                        /*
                         * use modulus operator to check if the number is even or odd. 
                         * If we divide any number by 2 and reminder is 0 then the number is
                         * even, otherwise it is odd.
                         */
                         
                         if(numbers[i]%2 == 0)
                                System.out.println(numbers[i] + " is even number.");
                         else
                                System.out.println(numbers[i] + " is odd number.");
                               
                }
               
        }
}