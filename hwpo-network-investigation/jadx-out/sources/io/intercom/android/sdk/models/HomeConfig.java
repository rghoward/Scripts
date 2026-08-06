package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.qq2;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeConfig {
    public static final int $stable = 8;

    @SerializedName("header")
    private final HeaderConfig header;

    @SerializedName("open_config")
    private final OpenConfig openConfig;

    public /* synthetic */ HomeConfig(HeaderConfig headerConfig, OpenConfig openConfig, int i, qq2 qq2Var) {
        if ((i & 1) != 0) {
            headerConfig = new HeaderConfig(null, null, false, 7, null);
        }
        if ((i & 2) != 0) {
            openConfig = new OpenConfig(null, null, null, 7, null);
        }
        this(headerConfig, openConfig);
    }

    public static /* synthetic */ HomeConfig copy$default(HomeConfig homeConfig, HeaderConfig headerConfig, OpenConfig openConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            headerConfig = homeConfig.header;
        }
        if ((i & 2) != 0) {
            openConfig = homeConfig.openConfig;
        }
        return homeConfig.copy(headerConfig, openConfig);
    }

    public final HeaderConfig component1() {
        return this.header;
    }

    public final OpenConfig component2() {
        return this.openConfig;
    }

    public final HomeConfig copy(HeaderConfig headerConfig, OpenConfig openConfig) {
        headerConfig.getClass();
        openConfig.getClass();
        return new HomeConfig(headerConfig, openConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeConfig)) {
            return false;
        }
        HomeConfig homeConfig = (HomeConfig) obj;
        return xj5.a(this.header, homeConfig.header) && xj5.a(this.openConfig, homeConfig.openConfig);
    }

    public final HeaderConfig getHeader() {
        return this.header;
    }

    public final OpenConfig getOpenConfig() {
        return this.openConfig;
    }

    public int hashCode() {
        return this.openConfig.hashCode() + (this.header.hashCode() * 31);
    }

    public String toString() {
        return "HomeConfig(header=" + this.header + ", openConfig=" + this.openConfig + ')';
    }

    public HomeConfig(HeaderConfig headerConfig, OpenConfig openConfig) {
        headerConfig.getClass();
        openConfig.getClass();
        this.header = headerConfig;
        this.openConfig = openConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
