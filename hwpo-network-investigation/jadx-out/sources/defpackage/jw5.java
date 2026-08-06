package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jw5 implements h4a {
    public final ew5 a;
    public final s27<Object> b = je7.a();

    public jw5(ew5 ew5Var) {
        this.a = ew5Var;
    }

    @Override // defpackage.h4a
    public final void a(h4a.a aVar) {
        s27<Object> s27Var = this.b;
        s27Var.a();
        u27<Object> u27Var = aVar.t;
        Object[] objArr = u27Var.b;
        long[] jArr = u27Var.c;
        int i = u27Var.e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objB = this.a.b(obj);
            int iD = s27Var.d(objB);
            int i3 = iD >= 0 ? s27Var.c[iD] : 0;
            if (i3 == 7) {
                aVar.remove(obj);
            } else {
                s27Var.h(i3 + 1, objB);
            }
            i = i2;
        }
    }

    @Override // defpackage.h4a
    public final boolean b(Object obj, Object obj2) {
        ew5 ew5Var = this.a;
        return xj5.a(ew5Var.b(obj), ew5Var.b(obj2));
    }
}
