package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xq3 {
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final boolean z, final mh4 mh4Var, ox6 ox6Var, x69 x69Var, boolean z2, final jl9 jl9Var, final long j, final float f, final fr1 fr1Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        xq3 xq3Var;
        final ox6 ox6Var2;
        final x69 x69Var2;
        final boolean z3;
        ox6 ox6Var3;
        x69 x69Var3;
        boolean z4;
        ox6 ox6Var4;
        bj4 bj4VarO = jt1Var.o(-126848451);
        int i4 = 2;
        int i5 = i | (bj4VarO.c(z) ? 4 : 2) | 25984 | (bj4VarO.J(jl9Var) ? 131072 : 65536) | (bj4VarO.i(j) ? 1048576 : 524288) | 817889280;
        if ((i2 & 6) == 0) {
            i3 = i2 | (bj4VarO.j(fr1Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            xq3Var = this;
            i3 |= bj4VarO.J(xq3Var) ? 32 : 16;
        } else {
            xq3Var = this;
        }
        if (bj4VarO.A(i5 & 1, ((306783379 & i5) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            bj4VarO.v0();
            if ((i & 1) == 0 || bj4VarO.c0()) {
                x69 x69VarF = q69.f(bj4VarO);
                ko7 ko7Var = ir6.a;
                ox6Var3 = ox6.a.t;
                x69Var3 = x69VarF;
                z4 = true;
            } else {
                bj4VarO.u();
                ox6Var3 = ox6Var;
                x69Var3 = x69Var;
                z4 = z2;
            }
            bj4VarO.V();
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                dt7 dt7Var = new dt7(g2b.a, ha7.u);
                bj4VarO.C(dt7Var);
                objF = dt7Var;
            }
            h37 h37Var = (h37) objF;
            tx2 tx2Var = (tx2) bj4VarO.F(qu1.h);
            WeakHashMap<View, fnb> weakHashMap = fnb.w;
            int i6 = fnb.a.c(bj4VarO).f.e().b;
            if (z) {
                bj4VarO.K(629991660);
                Object objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new bq1(i4, h37Var);
                    bj4VarO.C(objF2);
                }
                pr3.a((mh4) objF2, bj4VarO, 6);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(630077189);
                bj4VarO.U(false);
            }
            Object objF3 = bj4VarO.f();
            if (objF3 == c0187a) {
                objF3 = new j37(Boolean.FALSE);
                bj4VarO.C(objF3);
            }
            j37 j37Var = (j37) objF3;
            j37Var.u(Boolean.valueOf(z));
            if (((Boolean) j37Var.b.getValue()).booleanValue() || ((Boolean) j37Var.c.getValue()).booleanValue()) {
                bj4VarO.K(630396489);
                Object objF4 = bj4VarO.f();
                if (objF4 == c0187a) {
                    objF4 = bl7.i(new ava(ava.b));
                    bj4VarO.C(objF4);
                }
                h37 h37Var2 = (h37) objF4;
                boolean zJ = bj4VarO.J(tx2Var) | bj4VarO.h(i6);
                Object objF5 = bj4VarO.f();
                if (zJ || objF5 == c0187a) {
                    objF5 = new lr3(tx2Var, i6, h37Var, new uq3(h37Var2));
                    bj4VarO.C(objF5);
                }
                lr3 lr3Var = (lr3) objF5;
                String strD = xq3Var.d();
                boolean zC = xq3Var.c();
                cb6 cb6VarB = r4.b(0, bj4VarO, 7);
                int i7 = !((Boolean) cb6VarB.getValue()).booleanValue() ? 393248 : 393216;
                if ((xj5.a(strD, "PrimaryEditable") || (xj5.a(strD, "SecondaryEditable") && !((Boolean) cb6VarB.getValue()).booleanValue())) && !zC) {
                    i7 |= 8;
                }
                z4 = z4;
                ox6Var4 = ox6Var3;
                fq.a(lr3Var, mh4Var, new m68(i7, true), gr1.b(2063119149, new wq3(xq3Var, ox6Var4, z4, j37Var, h37Var2, x69Var3, jl9Var, j, f, fr1Var), bj4VarO), bj4VarO, 3120, 0);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(631807237);
                bj4VarO.U(false);
                ox6Var4 = ox6Var3;
            }
            ox6Var2 = ox6Var4;
            z3 = z4;
            x69Var2 = x69Var3;
        } else {
            bj4VarO.u();
            ox6Var2 = ox6Var;
            x69Var2 = x69Var;
            z3 = z2;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(z, mh4Var, ox6Var2, x69Var2, z3, jl9Var, j, f, fr1Var, i, i2) { // from class: vq3
                public final /* synthetic */ long A;
                public final /* synthetic */ float B;
                public final /* synthetic */ fr1 C;
                public final /* synthetic */ int D;
                public final /* synthetic */ boolean u;
                public final /* synthetic */ mh4 v;
                public final /* synthetic */ ox6 w;
                public final /* synthetic */ x69 x;
                public final /* synthetic */ boolean y;
                public final /* synthetic */ jl9 z;

                {
                    this.D = i2;
                }

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(100663345);
                    int iS2 = gz3.s(this.D);
                    this.t.a(this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, (jt1) obj, iS, iS2);
                    return g2b.a;
                }
            };
        }
    }

    public abstract ox6 b(ox6 ox6Var, boolean z);

    public abstract boolean c();

    public abstract String d();

    public abstract ox6 e(ox6 ox6Var);
}
