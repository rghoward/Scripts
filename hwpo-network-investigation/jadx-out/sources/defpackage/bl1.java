package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bl1 extends gm3<g2b> {
    public final File b;
    public final String c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl1(File file, String str) {
        super(g2b.a);
        str.getClass();
        this.b = file;
        this.c = str;
        this.d = "com.hwpo_training_app";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl1)) {
            return false;
        }
        bl1 bl1Var = (bl1) obj;
        return xj5.a(this.b, bl1Var.b) && xj5.a(this.c, bl1Var.c) && xj5.a(this.d, bl1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ru3.c(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenFile(file=");
        sb.append(this.b);
        sb.append(", contentType=");
        sb.append(this.c);
        sb.append(", appId=");
        return av.a(sb, this.d, ")");
    }
}
