package defpackage;

import java.util.Arrays;
import zw.c;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ux<O extends zw.c> {
    public final int a;
    public final zw b;
    public final zw.c c;
    public final String d;

    public ux(zw zwVar, zw.c cVar, String str) {
        this.b = zwVar;
        this.c = cVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{zwVar, cVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ux)) {
            return false;
        }
        ux uxVar = (ux) obj;
        return te7.a(this.b, uxVar.b) && te7.a(this.c, uxVar.c) && te7.a(this.d, uxVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
