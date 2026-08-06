package io.intercom.android.sdk.lightcompressor.video;

import defpackage.al;
import defpackage.qq2;
import defpackage.uo2;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Result {
    private final String failureMessage;
    private final int index;
    private final String path;
    private final long size;
    private final boolean success;

    public /* synthetic */ Result(int i, boolean z, String str, long j, String str2, int i2, qq2 qq2Var) {
        this(i, z, str, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? null : str2);
    }

    public static /* synthetic */ Result copy$default(Result result, int i, boolean z, String str, long j, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = result.index;
        }
        if ((i2 & 2) != 0) {
            z = result.success;
        }
        if ((i2 & 4) != 0) {
            str = result.failureMessage;
        }
        if ((i2 & 8) != 0) {
            j = result.size;
        }
        if ((i2 & 16) != 0) {
            str2 = result.path;
        }
        String str3 = str2;
        String str4 = str;
        return result.copy(i, z, str4, j, str3);
    }

    public final int component1() {
        return this.index;
    }

    public final boolean component2() {
        return this.success;
    }

    public final String component3() {
        return this.failureMessage;
    }

    public final long component4() {
        return this.size;
    }

    public final String component5() {
        return this.path;
    }

    public final Result copy(int i, boolean z, String str, long j, String str2) {
        return new Result(i, z, str, j, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Result)) {
            return false;
        }
        Result result = (Result) obj;
        return this.index == result.index && this.success == result.success && xj5.a(this.failureMessage, result.failureMessage) && this.size == result.size && xj5.a(this.path, result.path);
    }

    public final String getFailureMessage() {
        return this.failureMessage;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getPath() {
        return this.path;
    }

    public final long getSize() {
        return this.size;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iA = uo2.a(Integer.hashCode(this.index) * 31, this.success, 31);
        String str = this.failureMessage;
        int iC = al.c(this.size, (iA + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.path;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Result(index=");
        sb.append(this.index);
        sb.append(", success=");
        sb.append(this.success);
        sb.append(", failureMessage=");
        sb.append(this.failureMessage);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", path=");
        return wu0.a(sb, this.path, ')');
    }

    public Result(int i, boolean z, String str, long j, String str2) {
        this.index = i;
        this.success = z;
        this.failureMessage = str;
        this.size = j;
        this.path = str2;
    }
}
