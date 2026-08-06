package io.intercom.android.sdk.ui.component;

import defpackage.g2b;
import defpackage.mh4;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomTopBarIcon {
    public static final int $stable = 0;
    private final String contentDescription;
    private final int iconRes;
    private final mh4<g2b> onClick;

    public IntercomTopBarIcon(int i, String str, mh4<g2b> mh4Var) {
        mh4Var.getClass();
        this.iconRes = i;
        this.contentDescription = str;
        this.onClick = mh4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntercomTopBarIcon copy$default(IntercomTopBarIcon intercomTopBarIcon, int i, String str, mh4 mh4Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = intercomTopBarIcon.iconRes;
        }
        if ((i2 & 2) != 0) {
            str = intercomTopBarIcon.contentDescription;
        }
        if ((i2 & 4) != 0) {
            mh4Var = intercomTopBarIcon.onClick;
        }
        return intercomTopBarIcon.copy(i, str, mh4Var);
    }

    public final int component1() {
        return this.iconRes;
    }

    public final String component2() {
        return this.contentDescription;
    }

    public final mh4<g2b> component3() {
        return this.onClick;
    }

    public final IntercomTopBarIcon copy(int i, String str, mh4<g2b> mh4Var) {
        mh4Var.getClass();
        return new IntercomTopBarIcon(i, str, mh4Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomTopBarIcon)) {
            return false;
        }
        IntercomTopBarIcon intercomTopBarIcon = (IntercomTopBarIcon) obj;
        return this.iconRes == intercomTopBarIcon.iconRes && xj5.a(this.contentDescription, intercomTopBarIcon.contentDescription) && xj5.a(this.onClick, intercomTopBarIcon.onClick);
    }

    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final mh4<g2b> getOnClick() {
        return this.onClick;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.iconRes) * 31;
        String str = this.contentDescription;
        return this.onClick.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return "IntercomTopBarIcon(iconRes=" + this.iconRes + ", contentDescription=" + this.contentDescription + ", onClick=" + this.onClick + ')';
    }
}
