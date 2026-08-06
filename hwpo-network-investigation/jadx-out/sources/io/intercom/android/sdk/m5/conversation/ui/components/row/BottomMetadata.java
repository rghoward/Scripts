package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.h44;
import defpackage.pi1;
import defpackage.qq2;
import defpackage.xj5;
import defpackage.y43;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class BottomMetadata {
    public static final int $stable = 0;
    private final boolean alwaysShow;
    private final float padding;
    private final String text;

    public BottomMetadata(String str, float f, boolean z, int i, qq2 qq2Var) {
        this(str, (i & 2) != 0 ? 4.0f : f, (i & 4) != 0 ? false : z, null);
    }

    /* JADX INFO: renamed from: copy-lG28NQ4$default, reason: not valid java name */
    public static /* synthetic */ BottomMetadata m196copylG28NQ4$default(BottomMetadata bottomMetadata, String str, float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bottomMetadata.text;
        }
        if ((i & 2) != 0) {
            f = bottomMetadata.padding;
        }
        if ((i & 4) != 0) {
            z = bottomMetadata.alwaysShow;
        }
        return bottomMetadata.m198copylG28NQ4(str, f, z);
    }

    public final String component1() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m197component2D9Ej5fM() {
        return this.padding;
    }

    public final boolean component3() {
        return this.alwaysShow;
    }

    /* JADX INFO: renamed from: copy-lG28NQ4, reason: not valid java name */
    public final BottomMetadata m198copylG28NQ4(String str, float f, boolean z) {
        str.getClass();
        return new BottomMetadata(str, f, z, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomMetadata)) {
            return false;
        }
        BottomMetadata bottomMetadata = (BottomMetadata) obj;
        return xj5.a(this.text, bottomMetadata.text) && y43.e(this.padding, bottomMetadata.padding) && this.alwaysShow == bottomMetadata.alwaysShow;
    }

    public final boolean getAlwaysShow() {
        return this.alwaysShow;
    }

    /* JADX INFO: renamed from: getPadding-D9Ej5fM, reason: not valid java name */
    public final float m199getPaddingD9Ej5fM() {
        return this.padding;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return Boolean.hashCode(this.alwaysShow) + h44.a(this.text.hashCode() * 31, this.padding, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BottomMetadata(text=");
        sb.append(this.text);
        sb.append(", padding=");
        sb.append((Object) y43.f(this.padding));
        sb.append(", alwaysShow=");
        return pi1.a(sb, this.alwaysShow, ')');
    }

    private BottomMetadata(String str, float f, boolean z) {
        str.getClass();
        this.text = str;
        this.padding = f;
        this.alwaysShow = z;
    }

    public /* synthetic */ BottomMetadata(String str, float f, boolean z, qq2 qq2Var) {
        this(str, f, z);
    }
}
