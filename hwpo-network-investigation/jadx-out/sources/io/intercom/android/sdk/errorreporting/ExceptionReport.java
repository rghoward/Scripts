package io.intercom.android.sdk.errorreporting;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ExceptionReport {

    @SerializedName("class_name")
    private final String className;
    private final List<StackFrame> frames;
    private final String message;
    private final String stacktrace;

    public ExceptionReport(String str, String str2, String str3, List<StackFrame> list) {
        this.className = str;
        this.message = str2;
        this.stacktrace = str3;
        this.frames = list;
    }

    public String getClassName() {
        return this.className;
    }

    public List<StackFrame> getFrames() {
        return this.frames;
    }

    public String getMessage() {
        return this.message;
    }

    public String getStacktrace() {
        return this.stacktrace;
    }
}
