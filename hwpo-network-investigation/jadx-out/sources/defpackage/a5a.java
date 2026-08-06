package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a5a implements ls3 {
    public final ls3 t;
    public final z4a.a u;
    public final SparseArray<c5a> v = new SparseArray<>();
    public boolean w;

    public a5a(ls3 ls3Var, z4a.a aVar) {
        this.t = ls3Var;
        this.u = aVar;
    }

    @Override // defpackage.ls3
    public final void k() {
        this.t.k();
        if (!this.w) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray<c5a> sparseArray = this.v;
            if (i >= sparseArray.size()) {
                return;
            }
            sparseArray.valueAt(i).i = true;
            i++;
        }
    }

    @Override // defpackage.ls3
    public final hsa p(int i, int i2) {
        if (i2 != 3 && i2 != 5) {
            this.w = true;
        }
        ls3 ls3Var = this.t;
        if (i2 != 3) {
            return ls3Var.p(i, i2);
        }
        SparseArray<c5a> sparseArray = this.v;
        c5a c5aVar = sparseArray.get(i);
        if (c5aVar != null) {
            return c5aVar;
        }
        c5a c5aVar2 = new c5a(ls3Var.p(i, i2), this.u);
        sparseArray.put(i, c5aVar2);
        return c5aVar2;
    }

    @Override // defpackage.ls3
    public final void t(t89 t89Var) {
        this.t.t(t89Var);
    }
}
