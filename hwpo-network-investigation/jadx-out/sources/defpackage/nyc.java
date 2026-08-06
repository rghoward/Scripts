package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nyc implements xhc {
    public final /* synthetic */ String a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ lzc c;

    public nyc(lzc lzcVar, String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = lzcVar;
    }

    @Override // defpackage.xhc
    public final void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.c.z(true, i, th, bArr, this.a, this.b, map);
    }
}
