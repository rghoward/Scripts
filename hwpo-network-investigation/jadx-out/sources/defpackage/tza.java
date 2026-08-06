package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tza {
    public final yz9<Object> a;
    public final tza b;
    public final Object c;

    public tza(yz9<? extends Object> yz9Var, tza tzaVar) {
        this.a = yz9Var;
        this.b = tzaVar;
        this.c = yz9Var.getValue();
    }

    public final boolean a() {
        if (this.a.getValue() != this.c) {
            return true;
        }
        tza tzaVar = this.b;
        return tzaVar != null && tzaVar.a();
    }
}
