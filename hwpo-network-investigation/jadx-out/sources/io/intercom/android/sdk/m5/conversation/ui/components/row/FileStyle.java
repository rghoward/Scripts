package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.a83;
import defpackage.al;
import defpackage.qq2;
import defpackage.uh1;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FileStyle {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final int icon;
    private final long iconColor;
    private final String type;

    private FileStyle(int i, long j, long j2, String str) {
        str.getClass();
        this.icon = i;
        this.backgroundColor = j;
        this.iconColor = j2;
        this.type = str;
    }

    /* JADX INFO: renamed from: copy-IbeAmgk$default, reason: not valid java name */
    public static /* synthetic */ FileStyle m274copyIbeAmgk$default(FileStyle fileStyle, int i, long j, long j2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fileStyle.icon;
        }
        if ((i2 & 2) != 0) {
            j = fileStyle.backgroundColor;
        }
        if ((i2 & 4) != 0) {
            j2 = fileStyle.iconColor;
        }
        if ((i2 & 8) != 0) {
            str = fileStyle.type;
        }
        String str2 = str;
        return fileStyle.m277copyIbeAmgk(i, j, j2, str2);
    }

    public final int component1() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m275component20d7_KjU() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m276component30d7_KjU() {
        return this.iconColor;
    }

    public final String component4() {
        return this.type;
    }

    /* JADX INFO: renamed from: copy-IbeAmgk, reason: not valid java name */
    public final FileStyle m277copyIbeAmgk(int i, long j, long j2, String str) {
        str.getClass();
        return new FileStyle(i, j, j2, str, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileStyle)) {
            return false;
        }
        FileStyle fileStyle = (FileStyle) obj;
        return this.icon == fileStyle.icon && uh1.c(this.backgroundColor, fileStyle.backgroundColor) && uh1.c(this.iconColor, fileStyle.iconColor) && xj5.a(this.type, fileStyle.type);
    }

    /* JADX INFO: renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m278getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: getIconColor-0d7_KjU, reason: not valid java name */
    public final long m279getIconColor0d7_KjU() {
        return this.iconColor;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.icon) * 31;
        long j = this.backgroundColor;
        int i = uh1.l;
        return this.type.hashCode() + al.c(this.iconColor, al.c(j, iHashCode, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FileStyle(icon=");
        sb.append(this.icon);
        sb.append(", backgroundColor=");
        a83.b(this.backgroundColor, ", iconColor=", sb);
        a83.b(this.iconColor, ", type=", sb);
        return wu0.a(sb, this.type, ')');
    }

    public /* synthetic */ FileStyle(int i, long j, long j2, String str, qq2 qq2Var) {
        this(i, j, j2, str);
    }
}
