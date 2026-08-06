package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ed5 {
    public static void a(iw.b bVar, String str) {
        if ("�".length() <= 0) {
            xc5.a("alternateText can't be an empty string.");
        }
        iw.b.a aVar = new iw.b.a(new d2a(str), bVar.t.length(), 0, 4);
        ArrayList arrayList = bVar.u;
        arrayList.add(aVar);
        bVar.v.add(aVar);
        arrayList.size();
        bVar.c("�");
        bVar.d();
    }
}
