package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kj1 implements ox6 {
    public final ox6 t;
    public final ox6 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements ci4<String, ox6.b, String> {
        public static final a u = new a(2);

        @Override // defpackage.ci4
        public final String invoke(String str, ox6.b bVar) {
            String str2 = str;
            ox6.b bVar2 = bVar;
            if (str2.length() == 0) {
                return bVar2.toString();
            }
            return str2 + ", " + bVar2;
        }
    }

    public kj1(ox6 ox6Var, ox6 ox6Var2) {
        this.t = ox6Var;
        this.u = ox6Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kj1)) {
            return false;
        }
        kj1 kj1Var = (kj1) obj;
        return this.t.equals(kj1Var.t) && xj5.a(this.u, kj1Var.u);
    }

    public final int hashCode() {
        return (this.u.hashCode() * 31) + this.t.hashCode();
    }

    @Override // defpackage.ox6
    public final boolean l(oh4<? super ox6.b, Boolean> oh4Var) {
        return this.t.l(oh4Var) && this.u.l(oh4Var);
    }

    @Override // defpackage.ox6
    public final Object p(ci4 ci4Var, Object obj) {
        return this.u.p(ci4Var, this.t.p(ci4Var, obj));
    }

    public final String toString() {
        return wu0.a(new StringBuilder("["), (String) p(a.u, BuildConfig.FLAVOR), ']');
    }
}
