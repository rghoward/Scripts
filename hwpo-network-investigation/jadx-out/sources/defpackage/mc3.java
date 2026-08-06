package defpackage;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponseAdapterFactory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mc3 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ mc3(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                pc3.b bVar = pc3.Companion;
                List<l89> list = ((pc3.c) obj).c.v;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((l89) obj2).v == u60.w) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 1:
                return NetworkResponseAdapterFactory._init_$lambda$0((Throwable) obj);
            default:
                return obj;
        }
    }
}
