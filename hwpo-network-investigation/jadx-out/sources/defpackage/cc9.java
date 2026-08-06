package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cc9 extends wp5 implements ci4<k3<di4<? extends Boolean>>, k3<di4<? extends Boolean>>, k3<di4<? extends Boolean>>> {
    public static final cc9 u = new cc9(2);

    @Override // defpackage.ci4
    public final k3<di4<? extends Boolean>> invoke(k3<di4<? extends Boolean>> k3Var, k3<di4<? extends Boolean>> k3Var2) {
        String str;
        di4 di4Var;
        k3<di4<? extends Boolean>> k3Var3 = k3Var;
        k3<di4<? extends Boolean>> k3Var4 = k3Var2;
        if (k3Var3 == null || (str = k3Var3.a) == null) {
            str = k3Var4.a;
        }
        if (k3Var3 == null || (di4Var = k3Var3.b) == null) {
            di4Var = k3Var4.b;
        }
        return new k3<>(str, di4Var);
    }
}
