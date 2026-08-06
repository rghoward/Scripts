package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t9a<TResult> {
    public final q6d a = new q6d();

    public t9a(y8c y8cVar) {
        t2d t2dVar = new t2d(this);
        y8cVar.getClass();
        y8cVar.a.f(u9a.a, new kxb(y8cVar, t2dVar));
    }

    public final void a(Exception exc) {
        this.a.r(exc);
    }

    public final void b(TResult tresult) {
        this.a.p(tresult);
    }

    public final boolean c(Exception exc) {
        q6d q6dVar = this.a;
        q6dVar.getClass();
        a78.h(exc, "Exception must not be null");
        synchronized (q6dVar.a) {
            try {
                if (q6dVar.c) {
                    return false;
                }
                q6dVar.c = true;
                q6dVar.f = exc;
                q6dVar.b.b(q6dVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        this.a.q(obj);
    }

    public t9a() {
    }
}
