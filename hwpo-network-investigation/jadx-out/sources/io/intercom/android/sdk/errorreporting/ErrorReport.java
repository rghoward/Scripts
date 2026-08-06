package io.intercom.android.sdk.errorreporting;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ErrorReport {

    @SerializedName("exception_reports")
    private final List<ExceptionReport> exceptionReports;
    private final boolean handled;

    @SerializedName("session_id")
    private final String sessionId;
    private final long timestamp;

    public ErrorReport(List<ExceptionReport> list, long j, String str, boolean z) {
        this.exceptionReports = list;
        this.timestamp = j;
        this.sessionId = str;
        this.handled = z;
    }

    public List<ExceptionReport> getExceptionReports() {
        return this.exceptionReports;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public long getTimestamp() {
        return this.timestamp;
    }
}
