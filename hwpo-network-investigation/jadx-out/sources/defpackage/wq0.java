package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wq0 extends wh1 {
    public final long b;
    public final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    public wq0(int i, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            yq0.a();
            porterDuffColorFilter = xq0.a(u7d.l(j), nl.a(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(u7d.l(j), nl.b(i));
        }
        super(porterDuffColorFilter);
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq0)) {
            return false;
        }
        wq0 wq0Var = (wq0) obj;
        return uh1.c(this.b, wq0Var.b) && this.c == wq0Var.c;
    }

    public final int hashCode() {
        int i = uh1.l;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        a83.b(this.b, ", blendMode=", sb);
        sb.append((Object) g28.d(this.c));
        sb.append(')');
        return sb.toString();
    }
}
