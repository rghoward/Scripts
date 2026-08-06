package defpackage;

import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sl5 implements f2a {
    public static final a d = new a(new xl5(false, false, false, true, "    ", "type", true, rd1.v, true), yd9.a);
    public final xl5 a;
    public final ln4 b;
    public final ry2 c = new ry2();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends sl5 {
    }

    public sl5(xl5 xl5Var, ln4 ln4Var) {
        this.a = xl5Var;
        this.b = ln4Var;
    }

    public final <T> T a(sy2<? extends T> sy2Var, JsonElement jsonElement) {
        Decoder dn5Var;
        sy2Var.getClass();
        jsonElement.getClass();
        String str = null;
        if (jsonElement instanceof JsonObject) {
            dn5Var = new hn5(this, (JsonObject) jsonElement, str, 12);
        } else if (jsonElement instanceof JsonArray) {
            dn5Var = new in5(this, (JsonArray) jsonElement);
        } else {
            if (!(jsonElement instanceof um5) && !jsonElement.equals(JsonNull.INSTANCE)) {
                u.b();
                return null;
            }
            dn5Var = new dn5(this, (JsonPrimitive) jsonElement, null);
        }
        return (T) dn5Var.C(sy2Var);
    }

    public final <T> T b(sy2<? extends T> sy2Var, String str) {
        sy2Var.getClass();
        str.getClass();
        h2a h2aVarC = th0.c(this, str);
        T t = (T) new x1a(this, zqb.OBJ, h2aVarC, sy2Var.getDescriptor(), null).C(sy2Var);
        if (h2aVarC.e() == 10) {
            return t;
        }
        h2a.m(h2aVarC, "Expected EOF after parsing, but had " + h2aVarC.f.charAt(h2aVarC.b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final <T> String c(ud9<? super T> ud9Var, T t) {
        char[] cArr;
        ud9Var.getClass();
        gn5 gn5Var = new gn5();
        ma1 ma1Var = ma1.c;
        synchronized (ma1Var) {
            h30 h30Var = ma1Var.a;
            cArr = null;
            char[] cArr2 = (char[]) (h30Var.isEmpty() ? null : h30Var.removeLast());
            if (cArr2 != null) {
                ma1Var.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        gn5Var.c = cArr;
        try {
            new y1a(new kt1(gn5Var), this, zqb.OBJ, new y1a[zqb.A.d()]).j(ud9Var, t);
            return gn5Var.toString();
        } finally {
            gn5Var.b();
        }
    }

    public final ln4 d() {
        return this.b;
    }
}
