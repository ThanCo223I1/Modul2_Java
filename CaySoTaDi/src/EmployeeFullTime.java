public class EmployeeFullTime extends Employee {
   private final double SALARY = (10.000000/30);
   private int number;
   private static int count;
   private int workDay;
   private int dayOff;

   public EmployeeFullTime() {
   }

   public EmployeeFullTime(String name, int age, String phone, String address, String email, int workDay, int dayOff) {
      super(name, age, phone, address, email);
      this.number = count++;
      this.workDay = workDay;
      this.dayOff = dayOff;
   }

   public int getDayOff() {
      return dayOff;
   }

   public void setDayOff(int dayOff) {
      this.dayOff = dayOff;
   }

   public int getNumber() {
      return number;
   }

   public void setNumber(int number) {
      this.number = number;
   }

   public int getWorkDay() {
      return workDay;
   }

   public void setWorkDay(int workDay) {
      this.workDay = workDay;
   }

   public double Salary(){
      return  SALARY * (getWorkDay() - getDayOff());
   }

}
