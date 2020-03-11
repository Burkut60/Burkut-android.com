package DateTime;

import java.util.Date;

public class DateT extends Date {

    public DateT(long readLong) {
        super(readLong);
    }

    public DateT(Date date) {
        super(date.getTime());
    }
}
