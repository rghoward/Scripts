package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y21<T> {
    public Object a;
    public a31<T> b;
    public it8<Void> c = new it8<>();
    public boolean d;

    public final void finalize() {
        it8<Void> it8Var;
        a31<T> a31Var = this.b;
        if (a31Var != null) {
            a31.a aVar = a31Var.u;
            if (!aVar.isDone()) {
                aVar.m(new z21("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
            }
        }
        if (this.d || (it8Var = this.c) == null) {
            return;
        }
        it8Var.l(null);
    }
}
