package io.intercom.android.sdk;

import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomError {
    public static final int $stable = 0;
    private final int errorCode;
    private final String errorMessage;

    public /* synthetic */ IntercomError(int i, String str, int i2, qq2 qq2Var) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? com.intercom.twig.BuildConfig.FLAVOR : str);
    }

    public static /* synthetic */ IntercomError copy$default(IntercomError intercomError, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = intercomError.errorCode;
        }
        if ((i2 & 2) != 0) {
            str = intercomError.errorMessage;
        }
        return intercomError.copy(i, str);
    }

    public final int component1() {
        return this.errorCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final IntercomError copy(int i, String str) {
        str.getClass();
        return new IntercomError(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomError)) {
            return false;
        }
        IntercomError intercomError = (IntercomError) obj;
        return this.errorCode == intercomError.errorCode && xj5.a(this.errorMessage, intercomError.errorMessage);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        return this.errorMessage.hashCode() + (Integer.hashCode(this.errorCode) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IntercomError(errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorMessage=");
        return wu0.a(sb, this.errorMessage, ')');
    }

    public IntercomError(int i, String str) {
        str.getClass();
        this.errorCode = i;
        this.errorMessage = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IntercomError() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }
}
