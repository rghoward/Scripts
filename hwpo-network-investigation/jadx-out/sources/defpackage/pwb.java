package defpackage;

import android.content.Context;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pwb {
    public final SparseIntArray a = new SparseIntArray();
    public final xn4 b;

    public pwb(xn4 xn4Var) {
        a78.g(xn4Var);
        this.b = xn4Var;
    }

    public final int a(Context context, zw.e eVar) {
        int i;
        a78.g(context);
        a78.g(eVar);
        int iB = 0;
        if (!eVar.j()) {
            return 0;
        }
        int iL = eVar.l();
        SparseIntArray sparseIntArray = this.a;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(iL, -1);
        }
        if (i != -1) {
            return i;
        }
        SparseIntArray sparseIntArray2 = this.a;
        synchronized (sparseIntArray2) {
            int i2 = 0;
            while (true) {
                try {
                    if (i2 >= sparseIntArray2.size()) {
                        iB = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray2.keyAt(i2);
                    if (iKeyAt > iL && sparseIntArray2.get(iKeyAt) == 0) {
                        break;
                    }
                    i2++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (iB == -1) {
                iB = this.b.b(context, iL);
            }
            sparseIntArray2.put(iL, iB);
        }
        return iB;
    }
}
