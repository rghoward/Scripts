package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lr3 implements l68 {
    public final tx2 a;
    public final int b;
    public final h37 c;
    public final uq3 d;
    public final bj e;
    public final bj f;
    public final fmb g;
    public final fmb h;
    public final cj i;
    public final cj j;
    public final gmb k;
    public final gmb l;

    public lr3() {
        throw null;
    }

    public lr3(tx2 tx2Var, int i, h37 h37Var, uq3 uq3Var) {
        int iN1 = tx2Var.n1(48.0f);
        this.a = tx2Var;
        this.b = i;
        this.c = h37Var;
        this.d = uq3Var;
        sp0.a aVar = di.a.m;
        this.e = new bj(aVar, aVar, 0);
        sp0.a aVar2 = di.a.o;
        this.f = new bj(aVar2, aVar2, 0);
        this.g = new fmb(g0.c);
        this.h = new fmb(g0.d);
        sp0.b bVar = di.a.j;
        sp0.b bVar2 = di.a.l;
        this.i = new cj(bVar, bVar2, 0);
        this.j = new cj(bVar2, bVar, 0);
        this.k = new gmb(bVar, iN1);
        this.l = new gmb(bVar2, iN1);
    }

    @Override // defpackage.l68
    public final long a(gg5 gg5Var, long j, tq5 tq5Var, long j2) {
        gg5 gg5Var2;
        char c;
        long j3;
        int iA;
        h37 h37Var = this.c;
        if (h37Var != null) {
            h37Var.getValue();
        }
        char c2 = ' ';
        long j4 = 4294967295L;
        long j5 = (((long) ((int) (j >> 32))) << 32) | (((long) (((int) (j & 4294967295L)) + this.b)) & 4294967295L);
        int i = (int) (j5 >> 32);
        int i2 = 0;
        List listI = ws0.i(this.e, this.f, ((int) (gg5Var.a() >> 32)) < i / 2 ? this.g : this.h);
        int size = listI.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                gg5Var2 = gg5Var;
                c = c2;
                j3 = j4;
                iA = 0;
                break;
            }
            c = c2;
            j3 = j4;
            int i4 = (int) (j2 >> c);
            int i5 = size;
            int i6 = i3;
            gg5Var2 = gg5Var;
            List list = listI;
            iA = ((as6) listI.get(i3)).a(gg5Var2, j5, i4, tq5Var);
            if (i6 == list.size() - 1 || (iA >= 0 && i4 + iA <= i)) {
                break;
            }
            i3 = i6 + 1;
            listI = list;
            size = i5;
            c2 = c;
            j4 = j3;
        }
        int i7 = (int) (j5 & j3);
        List listI2 = ws0.i(this.i, this.j, ((int) (gg5Var2.a() & j3)) < i7 / 2 ? this.k : this.l);
        int size2 = listI2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            int i9 = (int) (j2 & j3);
            int iA2 = ((bs6) listI2.get(i8)).a(gg5Var2, j5, i9);
            if (i8 == listI2.size() - 1 || (iA2 >= 0 && i9 + iA2 <= i7)) {
                i2 = iA2;
                break;
            }
        }
        long j6 = (((long) iA) << c) | (((long) i2) & j3);
        this.d.invoke(gg5Var2, qk1.a(j6, j2));
        return j6;
    }
}
