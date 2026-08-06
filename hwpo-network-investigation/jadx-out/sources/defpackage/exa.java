package defpackage;

import android.util.Base64;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class exa {
    public abstract String a();

    public abstract byte[] b();

    public abstract o98 c();

    public final ef0 d(o98 o98Var) {
        String strA = a();
        if (strA == null) {
            ac4.c("Null backendName");
            return null;
        }
        if (o98Var != null) {
            return new ef0(strA, b(), o98Var);
        }
        ac4.c("Null priority");
        return null;
    }

    public final String toString() {
        String strA = a();
        o98 o98VarC = c();
        String strEncodeToString = b() == null ? BuildConfig.FLAVOR : Base64.encodeToString(b(), 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(strA);
        sb.append(", ");
        sb.append(o98VarC);
        sb.append(", ");
        return av.a(sb, strEncodeToString, ")");
    }
}
