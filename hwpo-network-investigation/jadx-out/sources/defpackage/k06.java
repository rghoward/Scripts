package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k06 implements m09, f09 {
    public final n09 t;
    public final f09 u;
    public final d37<Object> v;

    public k06(m09 m09Var, Map<String, ? extends List<? extends Object>> map, f09 f09Var) {
        g06 g06Var = new g06(0, m09Var);
        y0a y0aVar = o09.a;
        this.t = new n09(map, g06Var);
        this.u = f09Var;
        this.v = a49.a();
    }

    @Override // defpackage.m09
    public final boolean a(Object obj) {
        return this.t.a(obj);
    }

    @Override // defpackage.m09
    public final m09.a b(mh4 mh4Var, String str) {
        return this.t.b(mh4Var, str);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // defpackage.m09
    public final Map<String, List<Object>> c() {
        d37<Object> d37Var = this.v;
        Object[] objArr = d37Var.b;
        long[] jArr = d37Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.u.f(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.t.c();
    }

    @Override // defpackage.m09
    public final Object d(String str) {
        return this.t.d(str);
    }

    @Override // defpackage.f09
    public final void e(final Object obj, final fr1 fr1Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-858296452);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(fr1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(this) ? 256 : 128;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 147) != 146)) {
            this.u.e(obj, fr1Var, bj4VarO, i2 & 126);
            boolean zJ = bj4VarO.j(this) | bj4VarO.j(obj);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = new oh4() { // from class: e06
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        k06 k06Var = this.t;
                        d37<Object> d37Var = k06Var.v;
                        Object obj3 = obj;
                        d37Var.i(obj3);
                        return new j06(k06Var, obj3);
                    }
                };
                bj4VarO.C(objF);
            }
            wd3.a(obj, (oh4) objF, bj4VarO);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: f06
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iS = gz3.s(i | 1);
                    this.t.e(obj, fr1Var, (jt1) obj2, iS);
                    return g2b.a;
                }
            };
        }
    }

    @Override // defpackage.f09
    public final void f(Object obj) {
        this.u.f(obj);
    }
}
