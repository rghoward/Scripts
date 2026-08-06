package io.intercom.android.sdk.survey.model;

import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SurveySenderAvatar {
    public static final int $stable = 0;

    @SerializedName("square_128")
    private final String squareImg128;

    public /* synthetic */ SurveySenderAvatar(String str, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str);
    }

    public static /* synthetic */ SurveySenderAvatar copy$default(SurveySenderAvatar surveySenderAvatar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = surveySenderAvatar.squareImg128;
        }
        return surveySenderAvatar.copy(str);
    }

    public final String component1() {
        return this.squareImg128;
    }

    public final SurveySenderAvatar copy(String str) {
        str.getClass();
        return new SurveySenderAvatar(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SurveySenderAvatar) && xj5.a(this.squareImg128, ((SurveySenderAvatar) obj).squareImg128);
    }

    public final String getSquareImg128() {
        return this.squareImg128;
    }

    public int hashCode() {
        return this.squareImg128.hashCode();
    }

    public String toString() {
        return wu0.a(new StringBuilder("SurveySenderAvatar(squareImg128="), this.squareImg128, ')');
    }

    public SurveySenderAvatar(String str) {
        str.getClass();
        this.squareImg128 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SurveySenderAvatar() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
