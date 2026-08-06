package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xr2 {
    public boolean c;
    public float e;
    public int a = -1;
    public final k37<lx5.b> b = new k37<>(new lx5.b[16]);
    public int d = -1;

    public static int a(cu5 cu5Var, boolean z) {
        return z ? ((kt5) th1.G(cu5Var.g())).getIndex() + 1 : ((kt5) th1.y(cu5Var.g())).getIndex() - 1;
    }

    public static int b(cu5 cu5Var, boolean z) {
        fl7 fl7Var = fl7.t;
        if (z) {
            kt5 kt5Var = (kt5) th1.G(cu5Var.g());
            return (cu5Var.c() == fl7Var ? kt5Var.k() : kt5Var.o()) + 1;
        }
        kt5 kt5Var2 = (kt5) th1.y(cu5Var.g());
        return (cu5Var.c() == fl7Var ? kt5Var2.k() : kt5Var2.o()) - 1;
    }
}
