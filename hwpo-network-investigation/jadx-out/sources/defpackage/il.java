package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class il implements nva {
    public static StringBuilder a(String str, String str2, String str3, String str4, int i) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    @Override // defpackage.nva
    public Object apply(Object obj) {
        sg2.b.getClass();
        return aa2.a.a((u92) obj).getBytes(Charset.forName("UTF-8"));
    }
}
