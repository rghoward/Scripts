package io.ably.lib.network;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class HttpResponse {
    private final HttpBody body;
    private final int code;
    private final Map<String, List<String>> headers;
    private final String message;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class HttpResponseBuilder {
        private HttpBody body;
        private int code;
        private Map<String, List<String>> headers;
        private String message;

        public HttpResponseBuilder body(HttpBody httpBody) {
            this.body = httpBody;
            return this;
        }

        public HttpResponse build() {
            return new HttpResponse(this.code, this.message, this.body, this.headers);
        }

        public HttpResponseBuilder code(int i) {
            this.code = i;
            return this;
        }

        public HttpResponseBuilder headers(Map<String, List<String>> map) {
            this.headers = map;
            return this;
        }

        public HttpResponseBuilder message(String str) {
            this.message = str;
            return this;
        }

        public String toString() {
            return "HttpResponse.HttpResponseBuilder(code=" + this.code + ", message=" + this.message + ", body=" + this.body + ", headers=" + this.headers + ")";
        }
    }

    public HttpResponse(int i, String str, HttpBody httpBody, Map<String, List<String>> map) {
        this.code = i;
        this.message = str;
        this.body = httpBody;
        this.headers = map;
    }

    public static HttpResponseBuilder builder() {
        return new HttpResponseBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof HttpResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        if (!httpResponse.canEqual(this) || getCode() != httpResponse.getCode()) {
            return false;
        }
        String message = getMessage();
        String message2 = httpResponse.getMessage();
        if (message != null ? !message.equals(message2) : message2 != null) {
            return false;
        }
        HttpBody body = getBody();
        HttpBody body2 = httpResponse.getBody();
        if (body != null ? !body.equals(body2) : body2 != null) {
            return false;
        }
        Map<String, List<String>> headers = getHeaders();
        Map<String, List<String>> headers2 = httpResponse.getHeaders();
        return headers != null ? headers.equals(headers2) : headers2 == null;
    }

    public HttpBody getBody() {
        return this.body;
    }

    public int getCode() {
        return this.code;
    }

    public Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int code = getCode() + 59;
        String message = getMessage();
        int iHashCode = (code * 59) + (message == null ? 43 : message.hashCode());
        HttpBody body = getBody();
        int i = iHashCode * 59;
        int iHashCode2 = body == null ? 43 : body.hashCode();
        Map<String, List<String>> headers = getHeaders();
        return ((i + iHashCode2) * 59) + (headers != null ? headers.hashCode() : 43);
    }

    public String toString() {
        return "HttpResponse(code=" + getCode() + ", message=" + getMessage() + ", body=" + getBody() + ", headers=" + getHeaders() + ")";
    }
}
