package defpackage;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xnc {
    public final Context a;
    public final Boolean b;
    public final long c;
    public final jcc d;
    public final boolean e;
    public final Long f;
    public final Long g;
    public final String h;

    public xnc(Context context, jcc jccVar, Long l, Long l2) {
        this.e = true;
        a78.g(context);
        Context applicationContext = context.getApplicationContext();
        a78.g(applicationContext);
        this.a = applicationContext;
        this.f = l;
        this.g = l2;
        if (jccVar != null) {
            this.d = jccVar;
            this.e = jccVar.v;
            this.c = jccVar.u;
            this.h = jccVar.x;
            Bundle bundle = jccVar.w;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
