package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v9d implements s02 {
    public final /* synthetic */ List t;

    public v9d(List list) {
        this.t = list;
    }

    @Override // defpackage.s02
    public final /* bridge */ /* synthetic */ Object a(r9a r9aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.t);
        return caa.e(arrayList);
    }
}
