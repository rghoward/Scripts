package defpackage;

import androidx.emoji2.text.d;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ur2 {
    public yz9<Boolean> a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends d.f {
        public final /* synthetic */ dt7 t;
        public final /* synthetic */ ur2 u;

        public a(dt7 dt7Var, ur2 ur2Var) {
            this.t = dt7Var;
            this.u = ur2Var;
        }

        @Override // androidx.emoji2.text.d.f
        public final void a() {
            this.u.a = ie3.a;
        }

        @Override // androidx.emoji2.text.d.f
        public final void b() {
            this.t.setValue(Boolean.TRUE);
            this.u.a = new y85(true);
        }
    }

    public final yz9<Boolean> a() {
        d dVarA = d.a();
        if (dVarA.c() == 1) {
            return new y85(true);
        }
        dt7 dt7VarI = bl7.i(Boolean.FALSE);
        dVarA.h(new a(dt7VarI, this));
        return dt7VarI;
    }
}
