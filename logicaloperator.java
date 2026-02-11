class logicaloperatorexample{
    public static void main(String[]args) {
        int age=25;
        boolean hasTicket=true;
        if(age >= 18 && hasTicket) {
            System.out.println("you can enter the movie");
        }
        boolean isWeekend=true;
        boolean isHoliday=false;

        if(isWeekend || isHoliday) {
            System.out.println("you can relax1");
        }
        boolean isRaining=false;

        if(!isRaining) {
            System.out.println("you dont't need an umbrella");
        }
    }
}