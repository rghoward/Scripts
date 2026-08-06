package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ll6 implements kp7 {
    public final int a;
    public final List<jz7> b;
    public final long c;
    public final Object d;
    public final sp0.a e;
    public final di.c f;
    public final tq5 g;
    public final boolean h;
    public final int i;
    public final int[] j;
    public int k;
    public int l;

    public ll6() {
        throw null;
    }

    public ll6(int i, int i2, List list, long j, Object obj, di.c cVar, tq5 tq5Var) {
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = di.a.n;
        this.f = cVar;
        this.g = tq5Var;
        this.h = false;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jz7 jz7Var = (jz7) list.get(i3);
            iMax = Math.max(iMax, !this.h ? jz7Var.u : jz7Var.t);
        }
        this.i = iMax;
        this.j = new int[this.b.size() * 2];
        this.l = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.k += i;
        int[] iArr = this.j;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.h;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        this.k = i;
        boolean z = this.h;
        this.l = z ? i3 : i2;
        List<jz7> list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            jz7 jz7Var = list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.j;
            if (z) {
                sp0.a aVar = this.e;
                if (aVar == null) {
                    throw x70.a("null horizontalAlignment");
                }
                iArr[i6] = aVar.a(jz7Var.t, i2, this.g);
                iArr[i6 + 1] = i;
                i4 = jz7Var.u;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                di.c cVar = this.f;
                if (cVar == null) {
                    throw x70.a("null verticalAlignment");
                }
                iArr[i7] = cVar.a(jz7Var.u, i3);
                i4 = jz7Var.t;
            }
            i += i4;
        }
    }

    @Override // defpackage.kp7
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.kp7
    public final int getOffset() {
        return this.k;
    }
}
