public class NextDay {
    public static String ngayTiepTheo(int day, int month, int year) {
        if (year < 0) {
            return "Sai Nam";
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (day < 1 && day > 31) return "Sai Ngay";
                    else {
                        int maxDay = 31;
                        if (day == maxDay) {
                            day = 1;
                            if (month == 12) {
                                month = 1;
                                year++;
                            } else {
                                month++;
                            }
                        } else day++;
                        return day + "/" + month + "/" + year;
                    }
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day < 1 && day > 30) return "Sai Ngay";
                    else {
                        int maxDay1 = 30;
                        if (day == maxDay1) {
                            day = 1;
                            month++;
                        } else {
                            day++;
                        }
                        return day + "/" + month + "/" + year;
                    }
                case 2:
                    boolean leepYear = isLeapYear(year);
                    if (leepYear) {
                        if (day < 1 && day > 29) return "Sai Ngay";
                        else {
                            int maxDay2 = 29;
                            if (day == maxDay2) {
                                day = 1;
                                month++;
                            } else day++;
                            return day + "/" + month + "/" + year;
                        }
                    } else {
                        if (day < 1 && day > 28) return "Sai Ngay";
                        else {
                            int maxDay2 = 28;
                            if (day == maxDay2) {
                                day = 1;
                                month++;
                            } else day++;
                            return day + "/" + month + "/" + year;
                        }
                    }
                default:
                    return "Sai Thang";
            }
        }
    }

    private static boolean isLeapYear(int year) {
        boolean isLeapYearBy4 = year % 4 == 0;
        if (isLeapYearBy4) {
            boolean isLeapYear100 = year % 100 == 0;
            if (isLeapYear100) {
                boolean isLeapYear400 = year % 400 == 0;
                if (isLeapYear400) return true;
            } else return true;
        }
        return false;
    }
}