package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jq7 extends rv5<xp7> {
    public final fi4<qq7, Integer, jt1, Integer, g2b> a;
    public final oh4<Integer, Object> b;
    public final j27 c;

    /* JADX WARN: Multi-variable type inference failed */
    public jq7(fi4<? super qq7, ? super Integer, ? super jt1, ? super Integer, g2b> fi4Var, oh4<? super Integer, ? extends Object> oh4Var, int i) {
        this.a = fi4Var;
        this.b = oh4Var;
        j27 j27Var = new j27();
        j27Var.a(i, new xp7(oh4Var, fi4Var));
        this.c = j27Var;
    }

    @Override // defpackage.rv5
    public final j27 g() {
        return this.c;
    }
}
