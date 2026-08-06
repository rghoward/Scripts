package defpackage;

import io.ably.lib.types.AblyException;
import io.ably.lib.types.ErrorInfo;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sk0 implements gb6.a, s02 {
    public static AblyException b(int i, int i2, String str) {
        return AblyException.fromErrorInfo(new ErrorInfo(str, i, i2));
    }

    public static String c(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    @Override // defpackage.s02
    public Object a(r9a r9aVar) {
        return 403;
    }

    @Override // gb6.a
    public void invoke(Object obj) {
        ((aj) obj).getClass();
    }
}
