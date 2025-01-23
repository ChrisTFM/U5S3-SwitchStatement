package partC;

public class AlgoChallenge {
        /* Problem 12
     It's a nice day, and you're at the park and see two dogs, bulldog and lab.
     The parameters bulldogGrowl and labGrowl indicates if each dog is growling.
     Surrounding people are in a bit of trouble if both dogs are growling or if neither are growling but are in a stare down.

     Return true if those people are in trouble.

     Example:
     dogTrouble(true, true) --> true
     dogTrouble(false, false) --> true
     dogTrouble(true, false) --> false
    */

    /* Problem 13
    We have a loud crying puppy in an apartment building. The "hour" parameter is the current hour time
     in the range 0...23. We will get in trouble if the puppy is crying and the time is before 7 or after 20.

     Return true if we will get in trouble based on if the puppy is crying during a specfic time of day.

     Example:
     puppyCry(true, 6) --> true
     puppyCry(true, 7) --> false
     puppyCry(false, 6) --> false
     */

    public static Boolean dogTrouble(boolean bulldogGrowl, boolean labGrowl) {
        if (bulldogGrowl == labGrowl) {return Boolean.TRUE;}
        return Boolean.FALSE;
    }


    public static Boolean puppyCry(boolean crying, int hour) {
        if (crying == Boolean.FALSE) {return Boolean.FALSE;}
        if (hour < 7 || hour > 20){return Boolean.TRUE;}
        return Boolean.FALSE;
    }

    public static void main(String[] args){
        System.out.println(dogTrouble(Boolean.FALSE,Boolean.TRUE));
        System.out.println(puppyCry(Boolean.TRUE, 12));
    }
}
