package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yr5 extends qr5.e {
    public final /* synthetic */ xr5 b;
    public final /* synthetic */ ci4<g4a, xx1, gl6> c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements gl6 {
        public final /* synthetic */ gl6 a;
        public final /* synthetic */ xr5 b;
        public final /* synthetic */ int c;
        public final /* synthetic */ gl6 d;

        public a(gl6 gl6Var, xr5 xr5Var, int i, gl6 gl6Var2) {
            this.b = xr5Var;
            this.c = i;
            this.d = gl6Var2;
            this.a = gl6Var;
        }

        @Override // defpackage.gl6
        public final int h() {
            return this.a.h();
        }

        @Override // defpackage.gl6
        public final int j() {
            return this.a.j();
        }

        @Override // defpackage.gl6
        public final Map<ei, Integer> l() {
            return this.a.l();
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0073 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:24:0x0075 A[LOOP:0: B:5:0x0019->B:24:0x0075, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:28:0x0078 A[EDGE_INSN: B:28:0x0078->B:25:0x0078 BREAK  A[LOOP:0: B:5:0x0019->B:24:0x0075], SYNTHETIC] */
        @Override // defpackage.gl6
        public final void m() {
            int i = this.c;
            xr5 xr5Var = this.b;
            xr5Var.x = i;
            this.d.m();
            k37<Object> k37Var = xr5Var.F;
            c37<Object, f4a.b> c37Var = xr5Var.E;
            long[] jArr = c37Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = c37Var.b[i5];
                                f4a.b bVar = (f4a.b) c37Var.c[i5];
                                int iM = k37Var.m(obj);
                                if (iM < 0 || iM >= xr5Var.x) {
                                    if (iM >= 0) {
                                        Object[] objArr = k37Var.t;
                                        Object obj2 = objArr[iM];
                                        objArr[iM] = c4a.b;
                                    }
                                    if (xr5Var.C.a(obj)) {
                                        bVar.dispose();
                                    }
                                    c37Var.l(i5);
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            xr5Var.f(xr5Var.w);
        }

        @Override // defpackage.gl6
        public final oh4<wy8, g2b> n() {
            return this.a.n();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements gl6 {
        public final /* synthetic */ gl6 a;
        public final /* synthetic */ xr5 b;
        public final /* synthetic */ int c;
        public final /* synthetic */ gl6 d;

        public b(gl6 gl6Var, xr5 xr5Var, int i, gl6 gl6Var2) {
            this.b = xr5Var;
            this.c = i;
            this.d = gl6Var2;
            this.a = gl6Var;
        }

        @Override // defpackage.gl6
        public final int h() {
            return this.a.h();
        }

        @Override // defpackage.gl6
        public final int j() {
            return this.a.j();
        }

        @Override // defpackage.gl6
        public final Map<ei, Integer> l() {
            return this.a.l();
        }

        @Override // defpackage.gl6
        public final void m() {
            int i = this.c;
            xr5 xr5Var = this.b;
            xr5Var.w = i;
            this.d.m();
            if (xr5Var.t.A == null) {
                xr5Var.f(xr5Var.w);
            }
        }

        @Override // defpackage.gl6
        public final oh4<wy8, g2b> n() {
            return this.a.n();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yr5(xr5 xr5Var, ci4<? super g4a, ? super xx1, ? extends gl6> ci4Var, String str) {
        super(str);
        this.b = xr5Var;
        this.c = ci4Var;
    }

    @Override // defpackage.fl6
    public final gl6 d(hl6 hl6Var, List<? extends cl6> list, long j) {
        xr5 xr5Var = this.b;
        xr5.c cVar = xr5Var.A;
        cVar.t = hl6Var.getLayoutDirection();
        cVar.u = hl6Var.getDensity();
        cVar.v = hl6Var.N0();
        boolean zP0 = hl6Var.P0();
        ci4<g4a, xx1, gl6> ci4Var = this.c;
        if (zP0 || xr5Var.t.A == null) {
            xr5Var.w = 0;
            gl6 gl6VarInvoke = ci4Var.invoke(cVar, new xx1(j));
            return new b(gl6VarInvoke, xr5Var, xr5Var.w, gl6VarInvoke);
        }
        xr5Var.x = 0;
        gl6 gl6VarInvoke2 = ci4Var.invoke(xr5Var.B, new xx1(j));
        return new a(gl6VarInvoke2, xr5Var, xr5Var.x, gl6VarInvoke2);
    }
}
