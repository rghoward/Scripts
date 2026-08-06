package defpackage;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z57 implements oh4 {
    public final /* synthetic */ int t;

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                return null;
            default:
                ew ewVar = (ew) obj;
                return new sk8(ewVar.a, ewVar.b, ewVar.c, ewVar.d);
        }
    }
}
