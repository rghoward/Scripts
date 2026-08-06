package okhttp3.internal.platform;

import android.content.Context;
import defpackage.gc5;
import defpackage.hf3;
import defpackage.uz1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PlatformInitializer implements gc5<c> {
    @Override // defpackage.gc5
    public final List<Class<gc5<?>>> a() {
        return hf3.t;
    }

    @Override // defpackage.gc5
    public final c b(Context context) {
        context.getClass();
        c cVar = c.a;
        Object obj = c.a;
        uz1 uz1Var = obj != null ? (uz1) obj : null;
        if (uz1Var != null) {
            uz1Var.a(context);
        }
        return c.a;
    }
}
