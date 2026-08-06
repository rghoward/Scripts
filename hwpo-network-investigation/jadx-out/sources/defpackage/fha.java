package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fha {
    public tq5 a;
    public tx2 b;
    public qa4.a c;
    public wja d;
    public Object e;
    public final dt7 f = bl7.i(Boolean.TRUE);
    public long g;

    public fha(tq5 tq5Var, tx2 tx2Var, qa4.a aVar, wja wjaVar, Object obj) {
        this.a = tq5Var;
        this.b = tx2Var;
        this.c = aVar;
        this.d = wjaVar;
        this.e = obj;
        this.g = bea.a(this.d, this.b, this.c, bea.a, 1);
    }

    public static void a(fha fhaVar, tq5 tq5Var, tx2 tx2Var, wja wjaVar, int i) {
        if ((i & 1) != 0) {
            tq5Var = fhaVar.a;
        }
        if ((i & 2) != 0) {
            tx2Var = fhaVar.b;
        }
        qa4.a aVar = fhaVar.c;
        if ((i & 8) != 0) {
            wjaVar = fhaVar.d;
        }
        Object obj = fhaVar.e;
        tq5 tq5Var2 = fhaVar.a;
        dt7 dt7Var = fhaVar.f;
        if (tq5Var == tq5Var2 && xj5.a(tx2Var, fhaVar.b) && xj5.a(aVar, fhaVar.c) && xj5.a(wjaVar, fhaVar.d)) {
            if (xj5.a(obj, fhaVar.e)) {
                return;
            }
            fhaVar.e = obj;
            dt7Var.setValue(Boolean.TRUE);
            return;
        }
        fhaVar.a = tq5Var;
        fhaVar.b = tx2Var;
        fhaVar.c = aVar;
        fhaVar.d = wjaVar;
        dt7Var.setValue(Boolean.TRUE);
    }
}
