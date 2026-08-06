package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class UploadMetadata {
    public static final int $stable = 0;

    @SerializedName("safe_app_id")
    private final String safeAppId;

    public /* synthetic */ UploadMetadata(String str, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str);
    }

    public static /* synthetic */ UploadMetadata copy$default(UploadMetadata uploadMetadata, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadMetadata.safeAppId;
        }
        return uploadMetadata.copy(str);
    }

    public final String component1() {
        return this.safeAppId;
    }

    public final UploadMetadata copy(String str) {
        str.getClass();
        return new UploadMetadata(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UploadMetadata) && xj5.a(this.safeAppId, ((UploadMetadata) obj).safeAppId);
    }

    public final String getSafeAppId() {
        return this.safeAppId;
    }

    public int hashCode() {
        return this.safeAppId.hashCode();
    }

    public String toString() {
        return wu0.a(new StringBuilder("UploadMetadata(safeAppId="), this.safeAppId, ')');
    }

    public UploadMetadata(String str) {
        str.getClass();
        this.safeAppId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UploadMetadata() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
