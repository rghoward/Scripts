package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j27<T> {
    public final k37<lj5<T>> a = new k37<>(new lj5[16]);
    public int b;
    public lj5<? extends T> c;

    public final void a(int i, rv5.a aVar) {
        if (i < 0) {
            xc5.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        lj5 lj5Var = new lj5(this.b, i, aVar);
        this.b += i;
        this.a.d(lj5Var);
    }

    public final lj5<T> b(int i) {
        if (i < 0 || i >= this.b) {
            StringBuilder sbB = t43.b(i, "Index ", ", size ");
            sbB.append(this.b);
            xc5.e(sbB.toString());
        }
        lj5<? extends T> lj5Var = this.c;
        if (lj5Var != null) {
            int i2 = lj5Var.a;
            if (i < lj5Var.b + i2 && i2 <= i) {
                return lj5Var;
            }
        }
        k37<lj5<T>> k37Var = this.a;
        lj5 lj5Var2 = (lj5<? extends T>) k37Var.t[gw.a(i, k37Var)];
        this.c = lj5Var2;
        return lj5Var2;
    }
}
