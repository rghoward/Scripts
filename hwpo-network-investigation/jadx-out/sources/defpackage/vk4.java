package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vk4 implements l0a {
    public final t9a<String> a;

    public vk4(t9a<String> t9aVar) {
        this.a = t9aVar;
    }

    @Override // defpackage.l0a
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.l0a
    public final boolean b(qe0 qe0Var) {
        if (qe0Var.f() != hw7.a.v && qe0Var.f() != hw7.a.w && qe0Var.f() != hw7.a.x) {
            return false;
        }
        this.a.d(qe0Var.b);
        return true;
    }
}
