package project.jing.concurrent.base_api;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RequestIdGeneratorSafe {

    private final static RequestIdGeneratorSafe INSTANCE = new RequestIdGeneratorSafe();
    private final static short SEQ_UPPER_LIMIT = 999;
    //共享资源
    private short sequence = 0;

    private RequestIdGeneratorSafe() {

    }

    public synchronized short nextSequence() {
        if (sequence >= SEQ_UPPER_LIMIT) {
            sequence = 0;
        }else {
            sequence++;
        }

        return sequence;
    }

    public String nextId() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
        String timeStamp = sdf.format(new Date());
        DecimalFormat df = new DecimalFormat("000");

        short sequenceNo = nextSequence();
        return timeStamp + df.format(sequenceNo);
    }

    public static RequestIdGeneratorSafe getInstance() {
        return INSTANCE;
    }
}
