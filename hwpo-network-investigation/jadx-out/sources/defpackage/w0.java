package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w0 extends toa {
    public static final /* synthetic */ int d = 0;
    public final int b;
    public final bo9 c;

    public w0(bo9 bo9Var) {
        this.c = bo9Var;
        this.b = bo9Var.a();
    }

    @Override // defpackage.toa
    public final int a(boolean z) {
        if (this.b != 0) {
            int iB = z ? this.c.b() : 0;
            do {
                n48 n48Var = (n48) this;
                toa[] toaVarArr = n48Var.i;
                if (!toaVarArr[iB].p()) {
                    return toaVarArr[iB].a(z) + n48Var.h[iB];
                }
                iB = q(iB, z);
            } while (iB != -1);
        }
        return -1;
    }

    @Override // defpackage.toa
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            n48 n48Var = (n48) this;
            Integer num = n48Var.k.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = n48Var.i[iIntValue].b(obj3)) != -1) {
                return n48Var.g[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // defpackage.toa
    public final int c(boolean z) {
        int i = this.b;
        if (i != 0) {
            bo9 bo9Var = this.c;
            int iG = z ? bo9Var.g() : i - 1;
            do {
                n48 n48Var = (n48) this;
                toa[] toaVarArr = n48Var.i;
                if (!toaVarArr[iG].p()) {
                    return toaVarArr[iG].c(z) + n48Var.h[iG];
                }
                if (z) {
                    iG = bo9Var.d(iG);
                } else {
                    iG = iG > 0 ? iG - 1 : -1;
                }
            } while (iG != -1);
        }
        return -1;
    }

    @Override // defpackage.toa
    public final int e(int i, boolean z, int i2) {
        n48 n48Var = (n48) this;
        int[] iArr = n48Var.h;
        int iE = n6b.e(iArr, i + 1, false, false);
        int i3 = iArr[iE];
        toa[] toaVarArr = n48Var.i;
        int iE2 = toaVarArr[iE].e(i - i3, z, i2 != 2 ? i2 : 0);
        if (iE2 != -1) {
            return i3 + iE2;
        }
        int iQ = q(iE, z);
        while (iQ != -1 && toaVarArr[iQ].p()) {
            iQ = q(iQ, z);
        }
        if (iQ != -1) {
            return toaVarArr[iQ].a(z) + iArr[iQ];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // defpackage.toa
    public final toa.b f(int i, toa.b bVar, boolean z) {
        n48 n48Var = (n48) this;
        int[] iArr = n48Var.g;
        int iE = n6b.e(iArr, i + 1, false, false);
        int i2 = n48Var.h[iE];
        n48Var.i[iE].f(i - iArr[iE], bVar, z);
        bVar.c += i2;
        if (z) {
            Object obj = n48Var.j[iE];
            Object obj2 = bVar.b;
            obj2.getClass();
            bVar.b = Pair.create(obj, obj2);
        }
        return bVar;
    }

    @Override // defpackage.toa
    public final toa.b g(Object obj, toa.b bVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        n48 n48Var = (n48) this;
        Integer num = n48Var.k.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = n48Var.h[iIntValue];
        n48Var.i[iIntValue].g(obj3, bVar);
        bVar.c += i;
        bVar.b = obj;
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0030, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0030, code lost:
    
        r1 = r1 - 1;
     */
    @Override // defpackage.toa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(int r8, boolean r9, int r10) {
        /*
            r7 = this;
            r0 = r7
            n48 r0 = (defpackage.n48) r0
            int r1 = r8 + 1
            int[] r2 = r0.h
            r3 = 0
            int r1 = defpackage.n6b.e(r2, r1, r3, r3)
            r4 = r2[r1]
            toa[] r0 = r0.i
            r5 = r0[r1]
            int r8 = r8 - r4
            r6 = 2
            if (r10 != r6) goto L17
            goto L18
        L17:
            r3 = r10
        L18:
            int r8 = r5.k(r8, r9, r3)
            r3 = -1
            if (r8 == r3) goto L21
            int r4 = r4 + r8
            return r4
        L21:
            bo9 r8 = r7.c
            if (r9 == 0) goto L2a
            int r1 = r8.d(r1)
            goto L30
        L2a:
            if (r1 <= 0) goto L2f
        L2c:
            int r1 = r1 + (-1)
            goto L30
        L2f:
            r1 = r3
        L30:
            if (r1 == r3) goto L44
            r4 = r0[r1]
            boolean r4 = r4.p()
            if (r4 == 0) goto L44
            if (r9 == 0) goto L41
            int r1 = r8.d(r1)
            goto L30
        L41:
            if (r1 <= 0) goto L2f
            goto L2c
        L44:
            if (r1 == r3) goto L50
            r7 = r2[r1]
            r8 = r0[r1]
            int r8 = r8.c(r9)
            int r8 = r8 + r7
            return r8
        L50:
            if (r10 != r6) goto L57
            int r7 = r7.c(r9)
            return r7
        L57:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w0.k(int, boolean, int):int");
    }

    @Override // defpackage.toa
    public final Object l(int i) {
        n48 n48Var = (n48) this;
        int[] iArr = n48Var.g;
        int iE = n6b.e(iArr, i + 1, false, false);
        return Pair.create(n48Var.j[iE], n48Var.i[iE].l(i - iArr[iE]));
    }

    @Override // defpackage.toa
    public final toa.c m(int i, toa.c cVar, long j) {
        n48 n48Var = (n48) this;
        int[] iArr = n48Var.h;
        int iE = n6b.e(iArr, i + 1, false, false);
        int i2 = iArr[iE];
        int i3 = n48Var.g[iE];
        n48Var.i[iE].m(i - i2, cVar, j);
        Object objCreate = n48Var.j[iE];
        Object obj = toa.c.q;
        Object obj2 = cVar.a;
        if (obj != obj2) {
            objCreate = Pair.create(objCreate, obj2);
        }
        cVar.a = objCreate;
        cVar.n += i3;
        cVar.o += i3;
        return cVar;
    }

    public final int q(int i, boolean z) {
        if (z) {
            return this.c.e(i);
        }
        if (i < this.b - 1) {
            return i + 1;
        }
        return -1;
    }
}
