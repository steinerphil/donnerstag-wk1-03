public class MainArray {

    static String[] myArray = new String[2];

    public static String[] fillArray(){
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = "Student " + i;
        }
        return myArray;
    }





}
