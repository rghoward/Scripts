package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nt2 implements iq9 {
    public static final nt2 a = new nt2();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements PointerInputEventHandler {
        public static final a a = new a();

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(i58 i58Var, r02<? super g2b> r02Var) {
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ jq9 t;

        public b(jq9 jq9Var) {
            this.t = jq9Var;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                ei4<oy8, jt1, Integer, g2b> ei4Var = this.t.g;
                ny8 ny8VarA = ly8.a(c30.b, di.a.k, jt1Var2, 54);
                int iD = jt1Var2.D();
                kw7 kw7VarY = jt1Var2.y();
                ox6 ox6VarC = it1.c(jt1Var2, ox6.a.t);
                bt1.c.getClass();
                qr5.a aVar = bt1.a.b;
                if (jt1Var2.s() == null) {
                    ml5.c();
                    throw null;
                }
                jt1Var2.q();
                if (jt1Var2.l()) {
                    jt1Var2.k(aVar);
                } else {
                    jt1Var2.z();
                }
                rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                bt1.a.b bVar = bt1.a.g;
                if (jt1Var2.l() || !xj5.a(jt1Var2.f(), Integer.valueOf(iD))) {
                    rh.b(iD, jt1Var2, iD, bVar);
                }
                rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                ei4Var.invoke(py8.a, jt1Var2, 6);
                jt1Var2.I();
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements mh4<uh1> {
        public final /* synthetic */ jq9 t;

        public c(jq9 jq9Var) {
            this.t = jq9Var;
        }

        @Override // defpackage.mh4
        public final uh1 invoke() {
            kra kraVar = this.t.j;
            return new uh1(u7d.j(ca3.b.a(0.0f), kraVar.a, kraVar.b));
        }
    }

    @Override // defpackage.iq9
    public final void a(final jq9 jq9Var, jt1 jt1Var, final int i) {
        float f = jq9Var.h;
        bj4 bj4VarO = jt1Var.o(2137486921);
        int i2 = (bj4VarO.J(jq9Var) ? 4 : 2) | i;
        int i3 = 1;
        if (bj4VarO.A(i2 & 1, (i2 & 3) != 2)) {
            kra kraVar = jq9Var.j;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) >= 2139095040) {
                z90.a("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean zJ = bj4VarO.J(kraVar) | bj4VarO.J(null);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ || objF == c0187a) {
                objF = bl7.f(new c(jq9Var));
                bj4VarO.C(objF);
            }
            yz9 yz9VarA = tq9.a(((uh1) ((yz9) objF).getValue()).a, zs4.e(wy6.v, bj4VarO), null, bj4VarO, 0, 12);
            fr1 fr1VarB = gr1.b(-1658896622, new b(jq9Var), bj4VarO);
            bj4VarO.K(690108113);
            bj4VarO.U(false);
            ox6 ox6Var = jq9Var.a;
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarH = ox6Var.H(aVar);
            boolean zJ2 = bj4VarO.J(yz9VarA);
            Object objF2 = bj4VarO.f();
            if (zJ2 || objF2 == c0187a) {
                objF2 = new z00(i3, yz9VarA);
                bj4VarO.C(objF2);
            }
            ox6 ox6VarC = z63.c(ox6VarH, (oh4) objF2);
            Object objF3 = bj4VarO.f();
            if (objF3 == c0187a) {
                objF3 = new h91(i3);
                bj4VarO.C(objF3);
            }
            ox6 ox6VarB = pb9.b(ox6VarC, false, (oh4) objF3);
            g2b g2bVar = g2b.a;
            Object objF4 = bj4VarO.f();
            if (objF4 == c0187a) {
                objF4 = a.a;
                bj4VarO.C(objF4);
            }
            ox6 ox6VarB2 = t6a.b(ox6VarB, g2bVar, (PointerInputEventHandler) objF4);
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarB2);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
            ox6 ox6VarB3 = uma.b(hnb.c(aVar, jq9Var.i));
            u93 u93Var = py.a;
            boolean z = (i2 & 14) == 4;
            Object objF5 = bj4VarO.f();
            if (z || objF5 == c0187a) {
                objF5 = new kt2();
                bj4VarO.C(objF5);
            }
            v44 v44Var = (v44) objF5;
            long j = kraVar.c;
            long j2 = kraVar.d;
            long j3 = kraVar.e;
            long j4 = kraVar.f;
            fr1 fr1Var = jq9Var.b;
            wja wjaVar = jq9Var.c;
            wja wjaVar2 = jq9Var.d;
            sp0.a aVar3 = jq9Var.e;
            fr1 fr1Var2 = jq9Var.f;
            float f2 = jq9Var.h;
            Object objF6 = bj4VarO.f();
            if (objF6 == c0187a) {
                objF6 = new lt2(0);
                bj4VarO.C(objF6);
            }
            py.c(ox6VarB3, v44Var, j, j2, j4, j3, fr1Var, wjaVar, wjaVar2, (mh4) objF6, aVar3, fr1Var2, fr1VarB, f2, bj4VarO, 0);
            bj4VarO = bj4VarO;
            bj4VarO.U(true);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(jq9Var, i) { // from class: mt2
                public final /* synthetic */ jq9 u;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    this.t.a(this.u, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
