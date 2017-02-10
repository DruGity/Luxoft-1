package dublicate.lygo.timemanager;

import java.sql.Date;

public class CallRout {
    public static int getSecondsBetvwen(Date d1, Date d2) {
        if (d1.before(d2)) {
            int sec1 = d1.getSeconds();
            int sec2 = d2.getSeconds();
            int min1 = d1.getMinutes();
            int min2 = d2.getMinutes();
            int h1 = d1.getHours();
            int h2 = d2.getHours();
            int day1 = d1.getDate();
            int day2 = d2.getDate();
            int res = (sec2 - sec1) + (min2 - min1) * 60 + (h2 - h1) * 60 * 60
                    + (day2 - day1) * 60 * 60 * 24;
            if (res > 172800) {
                return -2;// слишком долго был занят одним делом врядли такое
                // возможно
            } else {
                return res;
            }
        } else {
            return -1;
        }
    }

}

