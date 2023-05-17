import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayTest {
    NextDay nextDay = new NextDay();

    @Test
    void ngayTiepTheo1() {
        int day = 31;
        int month = 12;
        int year = 2020;
        String kqTT = nextDay.ngayTiepTheo(day, month, year);
        String kqMM = "1/1/2021";
        assertEquals(kqMM,kqTT);
    }
    @Test
    void ngayTiepTheo2(){
        int day = 29;
        int month = 2;
        int year = 2020;
        String kqTT = nextDay.ngayTiepTheo(day, month, year);
        String kqMM = "1/3/2020";
        assertEquals(kqMM,kqTT);
    }
    @Test
    void ngayTiepTheo3(){
        int day = 28;
        int month = 2;
        int year = 2021;
        String kqTT = nextDay.ngayTiepTheo(day, month, year);
        String kqMM = "1/3/2021";
        assertEquals(kqMM,kqTT);
    }

    @Test
    void ngayTiepTheo4(){
        int day = 29;
        int month = 13;
        int year = -2021;
        String kqTT = nextDay.ngayTiepTheo(day, month, year);
        String kqMM = "Ban Nhap Sai";
        assertEquals(kqMM,kqTT);
    }
    @Test
    void ngayTiepTheo5(){
        int day = 29;
        int month = 13;
        int year = 2021;
        String kqTT = nextDay.ngayTiepTheo(day, month, year);
        String kqMM = "Ban Nhap Sai";
        assertEquals(kqMM,kqTT);
    }
}