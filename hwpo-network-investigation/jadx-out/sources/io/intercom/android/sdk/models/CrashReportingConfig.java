package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.pi1;
import defpackage.qq2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CrashReportingConfig {
    public static final int $stable = 0;

    @SerializedName("enabled")
    private final boolean enabled;

    public /* synthetic */ CrashReportingConfig(boolean z, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? true : z);
    }

    public static /* synthetic */ CrashReportingConfig copy$default(CrashReportingConfig crashReportingConfig, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = crashReportingConfig.enabled;
        }
        return crashReportingConfig.copy(z);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final CrashReportingConfig copy(boolean z) {
        return new CrashReportingConfig(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CrashReportingConfig) && this.enabled == ((CrashReportingConfig) obj).enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return pi1.a(new StringBuilder("CrashReportingConfig(enabled="), this.enabled, ')');
    }

    public CrashReportingConfig(boolean z) {
        this.enabled = z;
    }

    public CrashReportingConfig() {
        this(false, 1, null);
    }
}
