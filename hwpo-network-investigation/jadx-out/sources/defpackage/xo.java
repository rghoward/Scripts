package defpackage;

import com.google.gson.JsonElement;
import io.intercom.android.sdk.api.ErrorStringExtractorKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xo implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ xo(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                ((Long) obj).longValue();
                return g2b.a;
            default:
                return ErrorStringExtractorKt.extractErrorFromJsonArray$lambda$0((JsonElement) obj);
        }
    }
}
