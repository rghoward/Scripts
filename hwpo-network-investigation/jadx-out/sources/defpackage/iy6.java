package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iy6 {
    public final String a;
    public final a b;
    public a c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public Object a;
        public a b;
    }

    public iy6(String str) {
        a aVar = new a();
        this.b = aVar;
        this.c = aVar;
        this.a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        a aVar = this.b.b;
        String str = BuildConfig.FLAVOR;
        while (aVar != null) {
            Object obj = aVar.a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            aVar = aVar.b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
