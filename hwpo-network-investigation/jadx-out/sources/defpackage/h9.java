package defpackage;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@p87.a("activity")
public class h9 extends p87<a> {
    public final Activity c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends c67 {
        public a() {
            throw null;
        }

        @Override // defpackage.c67
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof a) && super.equals(obj);
        }

        @Override // defpackage.c67
        public final int hashCode() {
            return super.hashCode() * 961;
        }
    }

    public h9(Context context) {
        context.getClass();
        for (Object obj : ed9.d(context, new g9(0))) {
            if (((Context) obj) instanceof Activity) {
                this.c = (Activity) obj;
            }
        }
        obj = null;
        this.c = (Activity) obj;
    }

    @Override // defpackage.p87
    public final c67 a() {
        return new a(this);
    }

    @Override // defpackage.p87
    public final c67 c(c67 c67Var) {
        throw new IllegalStateException(i34.b(((a) c67Var).u.d, " does not have an Intent set.", new StringBuilder("Destination ")).toString());
    }

    @Override // defpackage.p87
    public final boolean f() {
        Activity activity = this.c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
