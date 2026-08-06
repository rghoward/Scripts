package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uga {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements cg7 {
        public final /* synthetic */ qga a;
        public final /* synthetic */ boolean b;

        public a(qga qgaVar, boolean z) {
            this.a = qgaVar;
            this.b = z;
        }

        @Override // defpackage.cg7
        public final long a() {
            return this.a.l(this.b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements PointerInputEventHandler {
        public final /* synthetic */ lda a;

        public b(lda ldaVar) {
            this.a = ldaVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(i58 i58Var, r02<? super g2b> r02Var) {
            Object objD = u72.d(new se6(i58Var, this.a, null), r02Var);
            v72 v72Var = v72.t;
            if (objD != v72Var) {
                objD = g2b.a;
            }
            return objD == v72Var ? objD : g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ys4.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final void a(final boolean z, final jt8 jt8Var, final qga qgaVar, jt1 jt1Var, final int i) {
        int i2;
        sia siaVarD;
        bj4 bj4VarO = jt1Var.o(-1344558920);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.c(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.h(jt8Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(qgaVar) ? 256 : 128;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean zJ = (i3 == 4) | bj4VarO.J(qgaVar);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ || objF == c0187a) {
                objF = new oga(qgaVar, z);
                bj4VarO.C(objF);
            }
            lda ldaVar = (lda) objF;
            boolean zJ2 = (i3 == 4) | bj4VarO.j(qgaVar);
            Object objF2 = bj4VarO.f();
            if (zJ2 || objF2 == c0187a) {
                objF2 = new a(qgaVar, z);
                bj4VarO.C(objF2);
            }
            cg7 cg7Var = (cg7) objF2;
            boolean zG = lja.g(qgaVar.n().b);
            int i4 = (int) (z ? qgaVar.n().b >> 32 : qgaVar.n().b & 4294967295L);
            u56 u56Var = qgaVar.d;
            float fE = 0.0f;
            if (u56Var != null && (siaVarD = u56Var.d()) != null) {
                ria riaVar = siaVarD.a;
                if (i4 >= 0) {
                    qia qiaVar = riaVar.a;
                    l07 l07Var = riaVar.b;
                    if (qiaVar.a.u.length() != 0) {
                        int iMin = Math.min(l07Var.d(i4), Math.min(l07Var.b - 1, l07Var.f - 1));
                        if (i4 <= l07Var.c(iMin, false)) {
                            l07Var.m(iMin);
                            ArrayList arrayList = l07Var.h;
                            ns7 ns7Var = (ns7) arrayList.get(sm3.c(iMin, arrayList));
                            qp qpVar = ns7Var.a;
                            int i5 = iMin - ns7Var.d;
                            nia niaVar = qpVar.d;
                            fE = niaVar.e(i5) - niaVar.g(i5);
                        }
                    }
                }
            }
            float f = fE;
            boolean zJ3 = bj4VarO.j(ldaVar);
            Object objF3 = bj4VarO.f();
            if (zJ3 || objF3 == c0187a) {
                objF3 = new b(ldaVar);
                bj4VarO.C(objF3);
            }
            mr.b(cg7Var, z, jt8Var, zG, 0L, f, t6a.b(ox6.a.t, ldaVar, (PointerInputEventHandler) objF3), bj4VarO, (i2 << 3) & 1008);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: tga
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    uga.a(z, jt8Var, qgaVar, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
