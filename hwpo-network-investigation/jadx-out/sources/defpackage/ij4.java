package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ij4 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final e27<bp4> e;
    public final o7a f;

    public ij4(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            c78.a("Invalid start index");
        }
        this.d = new ArrayList();
        e27<bp4> e27Var = new e27<>();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            po5 po5Var = (po5) this.a.get(i3);
            int i4 = po5Var.c;
            int i5 = po5Var.d;
            e27Var.i(i4, new bp4(i3, i2, i5));
            i2 += i5;
        }
        this.e = e27Var;
        this.f = new o7a(new hj4(this));
    }

    public final boolean a(int i, int i2) {
        bp4 bp4Var;
        int i3;
        int i4;
        e27<bp4> e27Var = this.e;
        bp4 bp4VarB = e27Var.b(i);
        if (bp4VarB == null) {
            return false;
        }
        int i5 = bp4VarB.b;
        int i6 = i2 - bp4VarB.c;
        bp4VarB.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = e27Var.c;
        long[] jArr = e27Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (bp4Var = (bp4) objArr[(i7 << 3) + i9]).b) >= i5 && bp4Var != bp4VarB && (i4 = i3 + i6) >= 0) {
                        bp4Var.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
