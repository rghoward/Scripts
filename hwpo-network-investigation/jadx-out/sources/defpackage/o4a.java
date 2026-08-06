package defpackage;

import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class o4a implements yd6 {
    public final String t;
    public volatile yd6 u;
    public Boolean v;
    public Method w;
    public xm3 x;
    public final Queue<q4a> y;
    public final boolean z;

    public o4a(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.t = str;
        this.y = linkedBlockingQueue;
        this.z = z;
    }

    @Override // defpackage.yd6
    public final void a(Object obj, String str) {
        d().a(obj, str);
    }

    @Override // defpackage.yd6
    public final void b(String str, Object... objArr) {
        d().b(str, objArr);
    }

    @Override // defpackage.yd6
    public final void c(String str) {
        d().c(str);
    }

    public final yd6 d() {
        if (this.u != null) {
            return this.u;
        }
        if (this.z) {
            return c47.t;
        }
        if (this.x == null) {
            Queue<q4a> queue = this.y;
            xm3 xm3Var = new xm3();
            xm3Var.u = this;
            xm3Var.t = this.t;
            xm3Var.v = queue;
            this.x = xm3Var;
        }
        return this.x;
    }

    public final boolean e() {
        Boolean bool = this.v;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.w = this.u.getClass().getMethod("log", ce6.class);
            this.v = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.v = Boolean.FALSE;
        }
        return this.v.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && o4a.class == obj.getClass() && this.t.equals(((o4a) obj).t);
    }

    @Override // defpackage.yd6
    public final String getName() {
        return this.t;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
