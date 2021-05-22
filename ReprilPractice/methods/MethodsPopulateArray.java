package ReprilPractice.methods;

public class MethodsPopulateArray {
    public static void main(String[] args) {
        String s = "02:55:00PM";
        String time = "";
        String minAndSec = s.substring(2,8);
        char hour0 = s.charAt(0);
        char hour1 = s.charAt(1);
        if(s.contains("AM")){
            if(hour0 == '1' && hour1=='2'){
                time = "00"+minAndSec;
            }else{
                time=s.substring(0, 8);
            }
        }else if(s.contains("PM")){
            hour0 += 1;
            hour1 += 2;
                time=hour0 + ""+ hour1+minAndSec;

        }
        System.out.println(time);
        /*if (s.contains("AM") && s.charAt(0) == 1 && s.charAt(1) == 2) {
            time = "00" + minAndSec;
        } else if (s.contains("PM")) {
            if (s.charAt(0) == 0 && s.charAt(1) >=0 && s.charAt(1) <=9) {
                time += ((s.charAt(0) + 1) +"" + (s.charAt(1)+2))+minAndSec;
            } else if (s.charAt(0) == '1' && s.charAt(1) >= '0' && s.charAt(1) <= '2') {
                time += (s.charAt(0) + 1) + "" + (s.charAt(1) + 2)+minAndSec;
            }
        } else {
            time = s.substring(0, 8);
        }
        System.out.println(time);*/
    }
}
