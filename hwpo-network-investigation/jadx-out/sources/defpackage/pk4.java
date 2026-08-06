package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pk4 implements l0a {
    public final q6b a;
    public final t9a<te5> b;

    public pk4(q6b q6bVar, t9a<te5> t9aVar) {
        this.a = q6bVar;
        this.b = t9aVar;
    }

    @Override // defpackage.l0a
    public final boolean a(Exception exc) {
        this.b.c(exc);
        return true;
    }

    @Override // defpackage.l0a
    public final boolean b(qe0 qe0Var) {
        if (qe0Var.f() == hw7.a.w && !this.a.a(qe0Var)) {
            String str = qe0Var.d;
            if (str != null) {
                this.b.b(new je0(str, qe0Var.f, qe0Var.g));
                return true;
            }
            ac4.c("Null token");
        }
        return false;
    }
}
