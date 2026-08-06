package io.intercom.android.sdk.errorreporting;

import com.google.gson.annotations.SerializedName;
import defpackage.pi1;
import defpackage.xj5;
import io.intercom.android.sdk.metrics.MetricTracker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class StackFrame {
    public static final int $stable = 0;
    private final String filename;
    private final String function;

    @SerializedName(MetricTracker.Place.IN_APP)
    private final boolean inApp;
    private final Integer lineno;
    private final String module;

    public StackFrame(String str, String str2, String str3, Integer num, boolean z) {
        this.module = str;
        this.function = str2;
        this.filename = str3;
        this.lineno = num;
        this.inApp = z;
    }

    public static /* synthetic */ StackFrame copy$default(StackFrame stackFrame, String str, String str2, String str3, Integer num, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stackFrame.module;
        }
        if ((i & 2) != 0) {
            str2 = stackFrame.function;
        }
        if ((i & 4) != 0) {
            str3 = stackFrame.filename;
        }
        if ((i & 8) != 0) {
            num = stackFrame.lineno;
        }
        if ((i & 16) != 0) {
            z = stackFrame.inApp;
        }
        boolean z2 = z;
        String str4 = str3;
        return stackFrame.copy(str, str2, str4, num, z2);
    }

    public final String component1() {
        return this.module;
    }

    public final String component2() {
        return this.function;
    }

    public final String component3() {
        return this.filename;
    }

    public final Integer component4() {
        return this.lineno;
    }

    public final boolean component5() {
        return this.inApp;
    }

    public final StackFrame copy(String str, String str2, String str3, Integer num, boolean z) {
        return new StackFrame(str, str2, str3, num, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StackFrame)) {
            return false;
        }
        StackFrame stackFrame = (StackFrame) obj;
        return xj5.a(this.module, stackFrame.module) && xj5.a(this.function, stackFrame.function) && xj5.a(this.filename, stackFrame.filename) && xj5.a(this.lineno, stackFrame.lineno) && this.inApp == stackFrame.inApp;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getFunction() {
        return this.function;
    }

    public final boolean getInApp() {
        return this.inApp;
    }

    public final Integer getLineno() {
        return this.lineno;
    }

    public final String getModule() {
        return this.module;
    }

    public int hashCode() {
        String str = this.module;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.function;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.filename;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.lineno;
        return Boolean.hashCode(this.inApp) + ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StackFrame(module=");
        sb.append(this.module);
        sb.append(", function=");
        sb.append(this.function);
        sb.append(", filename=");
        sb.append(this.filename);
        sb.append(", lineno=");
        sb.append(this.lineno);
        sb.append(", inApp=");
        return pi1.a(sb, this.inApp, ')');
    }
}
