package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.f;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ke4 implements ak4<Object> {
    public volatile ce2 t;
    public final Object u = new Object();
    public final f v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        be2 d();
    }

    public ke4(f fVar) {
        this.v = fVar;
    }

    public static final Context c(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // defpackage.ak4
    public final Object a() {
        if (this.t == null) {
            synchronized (this.u) {
                try {
                    if (this.t == null) {
                        this.t = b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.t;
    }

    public final ce2 b() {
        f fVar = this.v;
        if (fVar.getHost() == null) {
            ac4.c("Hilt Fragments must be attached before creating the component.");
            return null;
        }
        dx0.b(fVar.getHost() instanceof bk4, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", fVar.getHost().getClass());
        be2 be2VarD = ((a) kl3.b(a.class, fVar.getHost())).d();
        return new ce2(be2VarD.a, be2VarD.b, be2VarD.c);
    }
}
