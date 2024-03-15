

public class datermain {
    public static int highestnumber = 0;
    public static int lowernumber = 0;
    public static int hightNumber(int number) {
        if(highestnumber==0){
            highestnumber =number;
        }else if(number>highestnumber){
            highestnumber =number;
        }
        return  highestnumber;
    }
    public static int lowerNumber(int number) {
        if(lowernumber ==0){
            lowernumber =number;
        }else if(number<lowernumber){
            lowernumber = number;
        }
        return  lowernumber;
    }

}
