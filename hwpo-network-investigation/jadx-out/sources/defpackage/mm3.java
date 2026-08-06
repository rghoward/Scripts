package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mm3 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a {
        public final void a(String str, String str2) {
            HashMap map = ((be0.a) this).f;
            if (map != null) {
                map.put(str, str2);
            } else {
                aa0.c("Property \"autoMetadata\" has not been set");
            }
        }
    }

    public final String a(String str) {
        String str2 = b().get(str);
        return str2 == null ? BuildConfig.FLAVOR : str2;
    }

    public abstract Map<String, String> b();

    public abstract Integer c();

    public abstract vf3 d();

    public abstract long e();

    public abstract byte[] f();

    public abstract byte[] g();

    public final int h(String str) {
        String str2 = b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract Integer i();

    public abstract String j();

    public abstract String k();

    public abstract long l();

    public final be0.a m() {
        be0.a aVar = new be0.a();
        String strK = k();
        if (strK == null) {
            ac4.c("Null transportName");
            return null;
        }
        aVar.a = strK;
        aVar.b = c();
        aVar.g = i();
        aVar.h = j();
        aVar.i = f();
        aVar.j = g();
        vf3 vf3VarD = d();
        if (vf3VarD == null) {
            ac4.c("Null encodedPayload");
            return null;
        }
        aVar.c = vf3VarD;
        aVar.d = Long.valueOf(e());
        aVar.e = Long.valueOf(l());
        aVar.f = new HashMap(b());
        return aVar;
    }
}
