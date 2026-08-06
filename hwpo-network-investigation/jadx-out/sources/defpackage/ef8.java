package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ef8 {
    public final HashMap a;
    public final HashMap b;
    public final ge7<Object> c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements yf3<a> {
        public static final df8 a = new df8();
    }

    public ef8(HashMap map, HashMap map2, df8 df8Var) {
        this.a = map;
        this.b = map2;
        this.c = df8Var;
    }

    public final void a(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = this.b;
        ge7<Object> ge7Var = this.c;
        HashMap map2 = this.a;
        cf8 cf8Var = new cf8(byteArrayOutputStream, map2, map, ge7Var);
        if (obj == null) {
            return;
        }
        ge7 ge7Var2 = (ge7) map2.get(obj.getClass());
        if (ge7Var2 != null) {
            ge7Var2.a(obj, cf8Var);
            return;
        }
        throw new cg3("No encoder for " + obj.getClass());
    }
}
