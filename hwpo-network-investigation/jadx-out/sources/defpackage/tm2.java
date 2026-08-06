package defpackage;

import android.content.Context;
import io.intercom.android.sdk.api.DeDuperStore;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tm2 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ tm2(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return DeDuperStore.deDuperDataStore_delegate$lambda$0((Context) obj);
            case 1:
                List list = (List) obj;
                return new c26((int[]) list.get(0), (int[]) list.get(1));
            default:
                Iterable iterable = (Iterable) obj;
                iterable.getClass();
                return iterable.iterator();
        }
    }
}
