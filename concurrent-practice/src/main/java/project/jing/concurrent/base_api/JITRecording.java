package project.jing.concurrent.base_api;

/**
 * 测试乱序问题
 */
public class JITRecording {

    private int externalData = 1;
    private Helper helper;

    public void createHelper() {
        helper = new Helper(externalData);
    }

    public int consume() {
        int sum;

        final Helper observerHelper = helper;
        if (null == observerHelper) {
            sum = -1;
        }else {
            sum = helper.payloadA + helper.payloadB + helper.payloadC + helper.payloadD;
        }

        return sum;
    }

    static class Helper{
        int payloadA;
        int payloadB;
        int payloadC;
        int payloadD;

        public Helper(int externalData) {
            payloadA = externalData;
            payloadB = externalData;
            payloadC = externalData;
            payloadD = externalData;
        }
    }

    public static void main(String[] args) {

    }


}
