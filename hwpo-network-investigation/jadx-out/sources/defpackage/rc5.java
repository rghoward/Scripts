package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class rc5 implements jac {
    public static final /* synthetic */ rc5 t = new rc5();

    public static final pc5 b(String str, KSerializer kSerializer) {
        return new pc5(str, new qc5(kSerializer));
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Integer.valueOf((int) u4c.u.get().w0());
    }
}
