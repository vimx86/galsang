package org.galsang.util.view;

import java.io.Serializable;

/**
 * Description： Custom Define Json Result View
 * <br /> Author： vimx86
 */
public class ApiResult implements Serializable {

    public final static ApiResult ERROR = new ApiResult(ResultStatus.ERROR.getValue(), ResultStatus.ERROR.getReasonPhrase(), null);

    public final static ApiResult SUCCESS = new ApiResult(ResultStatus.SUCCESS.getValue(), ResultStatus.SUCCESS.getReasonPhrase(), null);

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private int status;
    private String message;
    private Object data;

    private ApiResult(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static ApiResult error(String message) {
        return new ApiResult(ResultStatus.ERROR.getValue(), message, null);
    }

    public static ApiResult success(Object data) {
        return new ApiResult(ResultStatus.ERROR.getValue(), ResultStatus.SUCCESS.getReasonPhrase(), data);
    }

    public static ApiResult success(String message, Object data) {
        return new ApiResult(ResultStatus.ERROR.getValue(), message, data);
    }

    @Override
    public String toString() {
        return "ApiResult{" + "status=" + status + ", message='" + message + '\'' + ", data=" + data + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ApiResult)) return false;

        ApiResult apiResult = (ApiResult) o;

        if (status != apiResult.status) return false;
        if (!message.equals(apiResult.message)) return false;
        return data.equals(apiResult.data);
    }

    @Override
    public int hashCode() {
        int result = status;
        result = 31 * result + message.hashCode();
        result = 31 * result + data.hashCode();
        return result;
    }

    public static class ApiResultBuilder {

        private int status;

        private String message;

        private Object data;

        public ApiResultBuilder status(int status) {
            this.status = status;
            return this;
        }

        public ApiResultBuilder message(String message) {
            this.message = message;
            return this;
        }

        @Override
        public String toString() {
            return "ApiResultBuilder{" + "status=" + status + ", message='" + message + '\'' + ", data=" + data + '}';
        }

        public ApiResultBuilder data(Object data) {
            this.data = data;
            return this;
        }

        public ApiResult build() {
            return new ApiResult(this.status, this.message, this.data);
        }

    }

}
