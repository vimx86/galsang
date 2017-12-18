package org.galsang.util.view;

/**
 * Description： Enumeration of Request Result status codes.
 * <br /> Author： vimx86
 */
public enum ResultStatus {

    SUCCESS(1, "请求成功"),
    ERROR(0, "系统繁忙");

    private final int value;

    private final String reasonPhrase;

    ResultStatus(int value, String reasonPhrase) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }

    public static ResultStatus valueOf(int statusCode) {
        for (ResultStatus value : values()) {
            if (value.value == statusCode) {
                return value;
            }
        }
        throw new IllegalArgumentException("No matching constant for [" + statusCode + "]");
    }

    public int getValue() {
        return value;
    }

    public String getReasonPhrase() {
        return reasonPhrase;
    }

    @Override
    public String toString() {
        return Integer.toString(this.value);
    }
}
