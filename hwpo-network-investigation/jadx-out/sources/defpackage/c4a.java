package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c4a {
    public static final a a = new a();
    public static final Object b = new Object();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final String toString() {
            return "ReusedSlotId";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ ox6 u;
        public final /* synthetic */ ci4<g4a, xx1, gl6> v;
        public final /* synthetic */ int w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ox6 ox6Var, ci4<? super g4a, ? super xx1, ? extends gl6> ci4Var, int i, int i2) {
            super(2);
            this.u = ox6Var;
            this.v = ci4Var;
            this.w = i;
            this.x = i2;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            num.intValue();
            int iS = gz3.s(this.w | 1);
            int i = this.x;
            c4a.a(this.u, this.v, jt1Var, iS, i);
            return g2b.a;
        }
    }

    public static final void a(ox6 ox6Var, ci4<? super g4a, ? super xx1, ? extends gl6> ci4Var, jt1 jt1Var, int i, int i2) {
        int i3;
        bj4 bj4VarO = jt1Var.o(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bj4VarO.j(ci4Var) ? 32 : 16;
        }
        if (bj4VarO.A(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = new f4a();
                bj4VarO.C(objF);
            }
            b((f4a) objF, ox6Var, ci4Var, bj4VarO, (i3 << 3) & 1008);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new b(ox6Var, ci4Var, i, i2);
        }
    }

    public static final void b(f4a f4aVar, ox6 ox6Var, ci4 ci4Var, jt1 jt1Var, int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-511989831);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(f4aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(ox6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(ci4Var) ? 256 : 128;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 147) != 146)) {
            int iHashCode = Long.hashCode(bj4VarO.T);
            bj4.b bVarE = bj4VarO.E();
            ox6 ox6VarC = it1.c(bj4VarO, ox6Var);
            kw7 kw7VarP = bj4VarO.P();
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(qr5.a.u);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, f4aVar.c, f4aVar);
            rd7.d(bj4VarO, f4aVar.d, bVarE);
            rd7.d(bj4VarO, f4aVar.e, ci4Var);
            bt1.c.getClass();
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            bj4VarO.U(true);
            if (bj4VarO.r()) {
                bj4VarO.K(-1259187287);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(-1259245908);
                boolean zJ = bj4VarO.j(f4aVar);
                Object objF = bj4VarO.f();
                if (zJ || objF == jt1.a.a) {
                    objF = new d4a(f4aVar);
                    bj4VarO.C(objF);
                }
                c33 c33Var = wd3.a;
                bj4VarO.w((mh4) objF);
                bj4VarO.U(false);
            }
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new e4a(f4aVar, ox6Var, ci4Var, i);
        }
    }
}
