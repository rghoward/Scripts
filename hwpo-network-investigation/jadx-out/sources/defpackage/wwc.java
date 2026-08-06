package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wwc implements Runnable {
    public final /* synthetic */ r9a t;
    public final /* synthetic */ zyc u;

    public wwc(zyc zycVar, r9a r9aVar) {
        this.t = r9aVar;
        this.u = zycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zyc zycVar = this.u;
        try {
            r9a r9aVarB = zycVar.u.b(this.t.j());
            if (r9aVarB == null) {
                zycVar.v.r(new NullPointerException("Continuation returned null"));
            } else {
                r3d r3dVar = u9a.b;
                r9aVarB.f(r3dVar, zycVar);
                r9aVarB.e(r3dVar, zycVar);
                r9aVarB.a(r3dVar, zycVar);
            }
        } catch (az8 e) {
            if (e.getCause() instanceof Exception) {
                zycVar.d((Exception) e.getCause());
            } else {
                zycVar.v.r(e);
            }
        } catch (CancellationException unused) {
            zycVar.b();
        } catch (Exception e2) {
            zycVar.v.r(e2);
        }
    }
}
