package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hp1<R> {
    public final R a;
    public final v31 b;
    public final ei4<Throwable, R, h72, g2b> c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ hp1(Object obj, v31 v31Var, ei4 ei4Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : v31Var, (ei4<? super Throwable, ? super Object, ? super h72, g2b>) ((i & 4) != 0 ? null : ei4Var), (Object) null, (i & 16) != 0 ? null : th);
    }

    public static hp1 a(hp1 hp1Var, v31 v31Var, Throwable th, int i) {
        R r = hp1Var.a;
        if ((i & 2) != 0) {
            v31Var = hp1Var.b;
        }
        v31 v31Var2 = v31Var;
        ei4<Throwable, R, h72, g2b> ei4Var = hp1Var.c;
        Object obj = hp1Var.d;
        if ((i & 16) != 0) {
            th = hp1Var.e;
        }
        return new hp1(r, v31Var2, ei4Var, obj, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp1)) {
            return false;
        }
        hp1 hp1Var = (hp1) obj;
        return xj5.a(this.a, hp1Var.a) && xj5.a(this.b, hp1Var.b) && xj5.a(this.c, hp1Var.c) && xj5.a(this.d, hp1Var.d) && xj5.a(this.e, hp1Var.e);
    }

    public final int hashCode() {
        R r = this.a;
        int iHashCode = (r == null ? 0 : r.hashCode()) * 31;
        v31 v31Var = this.b;
        int iHashCode2 = (iHashCode + (v31Var == null ? 0 : v31Var.hashCode())) * 31;
        ei4<Throwable, R, h72, g2b> ei4Var = this.c;
        int iHashCode3 = (iHashCode2 + (ei4Var == null ? 0 : ei4Var.hashCode())) * 31;
        Object obj = this.d;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hp1(R r, v31 v31Var, ei4<? super Throwable, ? super R, ? super h72, g2b> ei4Var, Object obj, Throwable th) {
        this.a = r;
        this.b = v31Var;
        this.c = ei4Var;
        this.d = obj;
        this.e = th;
    }
}
