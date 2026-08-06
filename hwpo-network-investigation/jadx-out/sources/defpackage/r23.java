package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r23 implements lr9 {
    public final Context t;

    public r23(Context context) {
        this.t = context;
    }

    @Override // defpackage.lr9
    public final Object b(wi8 wi8Var) {
        DisplayMetrics displayMetrics = this.t.getResources().getDisplayMetrics();
        s03.a aVar = new s03.a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new br9(aVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r23) {
            return xj5.a(this.t, ((r23) obj).t);
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
