package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zd0 extends ib2 {
    public final Context a;
    public final uf1 b;
    public final uf1 c;
    public final String d;

    public zd0(Context context, uf1 uf1Var, uf1 uf1Var2, String str) {
        if (context == null) {
            ac4.c("Null applicationContext");
            throw null;
        }
        this.a = context;
        if (uf1Var == null) {
            ac4.c("Null wallClock");
            throw null;
        }
        this.b = uf1Var;
        if (uf1Var2 == null) {
            ac4.c("Null monotonicClock");
            throw null;
        }
        this.c = uf1Var2;
        if (str != null) {
            this.d = str;
        } else {
            ac4.c("Null backendName");
            throw null;
        }
    }

    @Override // defpackage.ib2
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.ib2
    public final String b() {
        return this.d;
    }

    @Override // defpackage.ib2
    public final uf1 c() {
        return this.c;
    }

    @Override // defpackage.ib2
    public final uf1 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ib2)) {
            return false;
        }
        ib2 ib2Var = (ib2) obj;
        return this.a.equals(ib2Var.a()) && this.b.equals(ib2Var.d()) && this.c.equals(ib2Var.c()) && this.d.equals(ib2Var.b());
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return av.a(sb, this.d, "}");
    }
}
