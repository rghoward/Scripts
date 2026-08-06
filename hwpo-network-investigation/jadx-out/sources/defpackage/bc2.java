package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bc2 implements xva {
    public final uwa a;
    public final l85 b;
    public final int c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements xva.a {
        public final int b;

        public a(int i, int i2) {
            i = (i2 & 1) != 0 ? 100 : i;
            this.b = i;
            if (i > 0) {
                return;
            }
            z90.a("durationMillis must be > 0.");
            throw null;
        }

        @Override // xva.a
        public final xva a(uwa uwaVar, l85 l85Var) {
            if (l85Var instanceof f5a) {
                return ((f5a) l85Var).c == jf2.t ? new ic7(uwaVar, l85Var) : new bc2(uwaVar, l85Var, this.b);
            }
            return new ic7(uwaVar, l85Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.b == ((a) obj).b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (this.b * 31);
        }
    }

    public bc2(uwa uwaVar, l85 l85Var, int i) {
        this.a = uwaVar;
        this.b = l85Var;
        this.c = i;
        if (i > 0) {
            return;
        }
        z90.a("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.xva
    public final void a() {
        uwa uwaVar = this.a;
        Drawable drawableB = uwaVar.b();
        l85 l85Var = this.b;
        boolean z = l85Var instanceof f5a;
        qb2 qb2Var = new qb2(drawableB, l85Var.a(), l85Var.b().z, this.c, (z && ((f5a) l85Var).g) ? false : true);
        if (z) {
            uwaVar.onSuccess(qb2Var);
        } else if (l85Var instanceof dm3) {
            uwaVar.onError(qb2Var);
        } else {
            u.b();
        }
    }
}
