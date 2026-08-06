package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wm3 {
    public final String a;
    public final long b;
    public final Map<String, String> c;

    public wm3(String str, long j, Map<String, String> map) {
        map.getClass();
        this.a = str;
        this.b = j;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm3)) {
            return false;
        }
        wm3 wm3Var = (wm3) obj;
        return this.a.equals(wm3Var.a) && this.b == wm3Var.b && xj5.a(this.c, wm3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + al.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.a + ", timestamp=" + this.b + ", additionalCustomKeys=" + this.c + ')';
    }
}
