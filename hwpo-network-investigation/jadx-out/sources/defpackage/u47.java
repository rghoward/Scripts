package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u47 {
    public final r47 a;
    public final c67 b;
    public final Bundle c;
    public s66.b d;
    public final o77 e;
    public final String f;
    public final Bundle g;
    public final c19 h;
    public boolean i;
    public final n76 j;
    public s66.b k;
    public final g19 l;
    public final o7a m;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class a extends mhb {
        public final q09 t;

        public a(q09 q09Var) {
            q09Var.getClass();
            this.t = q09Var;
        }
    }

    public u47(r47 r47Var) {
        this.a = r47Var;
        this.b = r47Var.u;
        this.c = r47Var.v;
        this.d = r47Var.w;
        this.e = r47Var.x;
        this.f = r47Var.y;
        this.g = r47Var.z;
        this.h = new c19(new e19(r47Var, new s97(1, r47Var)));
        o7a o7aVar = new o7a(new s47());
        this.j = new n76(r47Var, true);
        this.k = s66.b.u;
        this.l = (g19) o7aVar.getValue();
        this.m = new o7a(new qh5(1));
    }

    public final Bundle a() {
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle bundleC = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
        bundleC.putAll(bundle);
        return bundleC;
    }

    public final void b() {
        if (!this.i) {
            c19 c19Var = this.h;
            c19Var.a();
            this.i = true;
            if (this.e != null) {
                x09.b(this.a);
            }
            c19Var.b(this.g);
        }
        int iOrdinal = this.d.ordinal();
        int iOrdinal2 = this.k.ordinal();
        n76 n76Var = this.j;
        if (iOrdinal < iOrdinal2) {
            n76Var.h(this.d);
        } else {
            n76Var.h(this.k);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ll8.a(r47.class).c());
        sb.append("(" + this.f + ')');
        sb.append(" destination=");
        sb.append(this.b);
        return sb.toString();
    }
}
