package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d93 implements l68 {
    public final long a;
    public final tx2 b;
    public final int c;
    public final gp d;
    public final bj e;
    public final bj f;
    public final fmb g;
    public final fmb h;
    public final cj i;
    public final cj j;
    public final cj k;
    public final gmb l;
    public final gmb m;

    public d93() {
        throw null;
    }

    public d93(long j, tx2 tx2Var, gp gpVar) {
        int iN1 = tx2Var.n1(48.0f);
        this.a = j;
        this.b = tx2Var;
        this.c = iN1;
        this.d = gpVar;
        int iN2 = tx2Var.n1(b53.a(j));
        sp0.a aVar = di.a.m;
        this.e = new bj(aVar, aVar, iN2);
        sp0.a aVar2 = di.a.o;
        this.f = new bj(aVar2, aVar2, iN2);
        this.g = new fmb(g0.c);
        this.h = new fmb(g0.d);
        int iN3 = tx2Var.n1(b53.b(j));
        sp0.b bVar = di.a.j;
        sp0.b bVar2 = di.a.l;
        this.i = new cj(bVar, bVar2, iN3);
        this.j = new cj(bVar2, bVar, iN3);
        this.k = new cj(di.a.k, bVar, iN3);
        this.l = new gmb(bVar, iN1);
        this.m = new gmb(bVar2, iN1);
    }

    @Override // defpackage.l68
    public final long a(gg5 gg5Var, long j, tq5 tq5Var, long j2) {
        gg5 gg5Var2;
        long j3;
        char c;
        int iA;
        int i;
        int i2;
        char c2 = ' ';
        int i3 = (int) (j >> 32);
        boolean z = true;
        List listI = ws0.i(this.e, this.f, ((int) (gg5Var.a() >> 32)) < i3 / 2 ? this.g : this.h);
        int size = listI.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                gg5Var2 = gg5Var;
                j3 = j;
                c = c2;
                iA = 0;
                break;
            }
            as6 as6Var = (as6) listI.get(i4);
            int i5 = (int) (j2 >> c2);
            int i6 = size;
            c = c2;
            j3 = j;
            int i7 = i4;
            gg5Var2 = gg5Var;
            iA = as6Var.a(gg5Var2, j3, i5, tq5Var);
            if (i7 == listI.size() - 1 || (iA >= 0 && i5 + iA <= i3)) {
                break;
            }
            i4 = i7 + 1;
            size = i6;
            c2 = c;
        }
        int i8 = (int) (j3 & 4294967295L);
        List listI2 = ws0.i(this.i, this.j, this.k, ((int) (gg5Var2.a() & 4294967295L)) < i8 / 2 ? this.l : this.m);
        int size2 = listI2.size();
        int i9 = 0;
        while (i9 < size2) {
            boolean z2 = z;
            int i10 = (int) (j2 & 4294967295L);
            int iA2 = ((bs6) listI2.get(i9)).a(gg5Var2, j3, i10);
            if (i9 == listI2.size() - 1 || (iA2 >= (i2 = this.c) && i10 + iA2 <= i8 - i2)) {
                i = iA2;
                long j4 = (((long) iA) << c) | (((long) i) & 4294967295L);
                this.d.invoke(gg5Var2, qk1.a(j4, j2));
                return j4;
            }
            i9++;
            z = z2;
        }
        i = 0;
        long j5 = (((long) iA) << c) | (((long) i) & 4294967295L);
        this.d.invoke(gg5Var2, qk1.a(j5, j2));
        return j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d93) {
            d93 d93Var = (d93) obj;
            if (this.a == d93Var.a && xj5.a(this.b, d93Var.b) && this.c == d93Var.c && xj5.a(this.d, d93Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + os2.a(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) b53.c(this.a)) + ", density=" + this.b + ", verticalMargin=" + this.c + ", onPositionCalculated=" + this.d + ')';
    }
}
