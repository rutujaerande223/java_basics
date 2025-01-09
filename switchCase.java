// public class switchCase {
//     public static void main(String[] args) {
//         int n = 1;
//         switch (n) {
//             case 0:
//                 System.out.println("Monday");
//                 break;
//             case 1:
//                 System.out.println("Tuesday");
//                 break;
//             case 2:
//                 System.out.println("Wednseday");
//                 break;
//             case 3:
//                 System.out.println("Thursday");
//                 break;
//             case 4:
//                 System.out.println("Friday");
//                 break;
//             case 5:
//                 System.out.println("Saturday");
//                 break;
//             default:
//             System.out.println("Sunday");
//                 break;
//         }
//     }
// }

//Updated

public class switchCase {
    public static void main(String[] args) {
        String day = "Sunday";
        String result="";
        switch (day) {
            case "Monday","Tuesday","Thursday" -> result = "wake up 6PM";
            case "Wednesday","Friday" -> result = "wke up 7PM";
            default -> result = "Wake up 9PM";
        }
        System.out.println(result);
    }
}


// public class switchCase {
//     public static void main(String[] args) {
//         String day = "Sunday";
//         String result="";
//         result=switch (day) {
//             case "Monday","Tuesday","Thursday" ->  "wake up 6PM";
//             case "Wednesday","Friday" ->"wke up 7PM";
//             default -> "Wake up 9PM";
//         };
//         System.out.println(result);
//     }
// }