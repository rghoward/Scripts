package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w87 {
    public final c37<Object, Object> a = y07.b();
    public final c37<Object, Object> b = y07.b();

    public final void a(mz6 mz6Var) {
        Object objD = this.b.d(mz6Var);
        if (objD != null) {
            boolean z = objD instanceof t27;
            c37<Object, Object> c37Var = this.a;
            if (!z) {
                y07.d(c37Var, (kz6) objD, new v87(0, mz6Var));
                return;
            }
            le7 le7Var = (le7) objD;
            Object[] objArr = le7Var.a;
            int i = le7Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                obj.getClass();
                y07.d(c37Var, (kz6) obj, new v87(0, mz6Var));
            }
        }
    }
}
