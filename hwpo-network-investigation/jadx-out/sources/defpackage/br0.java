package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class br0 extends ox6.c implements lr5, qb9 {
    public oh4<? super ro4, g2b> H;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<jz7.a, g2b> {
        public final /* synthetic */ jz7 u;
        public final /* synthetic */ br0 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jz7 jz7Var, br0 br0Var) {
            super(1);
            this.u = jz7Var;
            this.v = br0Var;
        }

        @Override // defpackage.oh4
        public final g2b invoke(jz7.a aVar) {
            jz7.a.z(aVar, this.u, 0, 0, this.v.H);
            return g2b.a;
        }
    }

    public br0(oh4<? super ro4, g2b> oh4Var) {
        this.H = oh4Var;
    }

    @Override // defpackage.qb9
    public final boolean A() {
        return false;
    }

    @Override // defpackage.qb9
    public final void E1(hc9 hc9Var) {
        jl9 jl9Var;
        boolean z;
        mb7 mb7VarD = ew2.d(this, 2);
        if (mb7VarD.a0) {
            jl9Var = mb7VarD.Y;
            z = mb7VarD.Z;
        } else {
            sv8 sv8Var = po4.a;
            if (sv8Var == null) {
                po4.a = new sv8();
            } else {
                sv8Var.e();
            }
            sv8 sv8Var2 = po4.a;
            sv8Var2.getClass();
            sv8Var2.G = mb7VarD.H.R;
            sv8Var2.F = c43.c(mb7VarD.v);
            hu9 hu9VarA = hu9.a.a();
            oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
            hu9 hu9VarB = hu9.a.b(hu9VarA);
            try {
                this.H.invoke(sv8Var2);
                g2b g2bVar = g2b.a;
                hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
                jl9Var = sv8Var2.D;
                z = sv8Var2.E;
            } catch (Throwable th) {
                hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
                throw th;
            }
        }
        if (z) {
            ec9.g(hc9Var, jl9Var);
        }
    }

    @Override // ox6.c
    public final boolean R1() {
        return false;
    }

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        jz7 jz7VarE = cl6Var.E(j);
        return hl6Var.y0(jz7VarE.t, jz7VarE.u, if3.t, new a(jz7VarE, this));
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.H + ')';
    }
}
