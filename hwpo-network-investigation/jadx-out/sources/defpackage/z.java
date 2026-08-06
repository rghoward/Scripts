package defpackage;

import io.intercom.android.sdk.Injector;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z {
    public static Object a() {
        return Injector.get().getAppConfigProvider().get();
    }

    public static /* synthetic */ void b(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }
}
