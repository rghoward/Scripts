package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nad extends cyb {
    public final ln4 b;
    public final ln4 c;
    public final int[] d;
    public final int e;

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    public nad(ln4 ln4Var, ln4 ln4Var2) {
        this.b = ln4Var;
        this.c = ln4Var2;
        int iB1 = ln4Var2.b1();
        if (!(iB1 <= 28)) {
            z90.a("metadata size too large");
            throw null;
        }
        int[] iArr = new int[iB1];
        this.d = iArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < iB1) {
            d9d d9dVarD = d(i);
            long j2 = d9dVarD.e | j;
            if (j2 == j) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    } else if (d9dVarD.equals(d(iArr[i3] & 31))) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    iArr[i3] = d9dVarD.c ? iArr[i3] | (1 << (i + 4)) : i;
                } else {
                    iArr[i2] = i;
                    i2++;
                }
            } else {
                iArr[i2] = i;
                i2++;
            }
            i++;
            j = j2;
        }
        this.e = i2;
    }

    @Override // defpackage.cyb
    public final void a(ead eadVar, y9d y9dVar) {
        for (int i = 0; i < this.e; i++) {
            int i2 = this.d[i];
            d9d d9dVarD = d(i2 & 31);
            if (d9dVarD.c) {
                eadVar.b(d9dVarD, new mad(this, d9dVarD, i2), y9dVar);
            } else {
                ln4 ln4Var = this.b;
                int iB1 = ln4Var.b1();
                if (i2 >= iB1) {
                    ln4Var = this.c;
                    i2 -= iB1;
                }
                eadVar.a(d9dVarD, d9dVarD.b.cast(ln4Var.e1(i2)), y9dVar);
            }
        }
    }

    @Override // defpackage.cyb
    public final int b() {
        return this.e;
    }

    @Override // defpackage.cyb
    public final Set c() {
        return new lad(this);
    }

    public final d9d d(int i) {
        ln4 ln4Var = this.b;
        int iB1 = ln4Var.b1();
        return i >= iB1 ? this.c.d1(i - iB1) : ln4Var.d1(i);
    }
}
