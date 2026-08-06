package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gs2 implements an6.b {
    public final Context a;

    public gs2(Context context) {
        this.a = context;
    }

    @Override // an6.b
    public final an6 a(an6.a aVar) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && ((context = this.a) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new q7a.a().a(aVar);
        }
        int iH = fv6.h(aVar.c.o);
        md6.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(n6b.D(iH)));
        u50.a aVar2 = new u50.a(new s50(iH), new t50(iH));
        aVar2.c = true;
        return aVar2.a(aVar);
    }
}
