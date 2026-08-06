package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qtc implements x40 {
    public static final /* synthetic */ qtc a = new qtc();

    @Override // defpackage.x40
    public final ListenableFuture apply(Object obj) {
        rx rxVar = (rx) obj;
        throw new otc(rxVar.t.t, rxVar.getMessage(), rxVar);
    }
}
