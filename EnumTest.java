public class EnumTest {
   Day day;
   
   public EnumTest(Day day) 
   {
        this.day = day;
   }
    
   public void week() 
   {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
   }
    
   public static void main(String[] args) 
   {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.week();
        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.week();
        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
        fifthDay.week();
        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.week();
        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.week();
   }
}