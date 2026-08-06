package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oy3 {
    public final a70 a;
    public final py3 b;
    public final ContentResolver c;
    public final ji8 d;
    public final LinkedHashMap e;

    public oy3(a70 a70Var, py3 py3Var, ContentResolver contentResolver) {
        a70Var.getClass();
        py3Var.getClass();
        this.a = a70Var;
        this.b = py3Var;
        this.c = contentResolver;
        this.d = py3Var.b;
        this.e = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, u02 u02Var) throws Throwable {
        ny3 ny3Var;
        if (u02Var instanceof ny3) {
            ny3Var = (ny3) u02Var;
            int i = ny3Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                ny3Var.w = i - Integer.MIN_VALUE;
            } else {
                ny3Var = new ny3(this, u02Var);
            }
        } else {
            ny3Var = new ny3(this, u02Var);
        }
        Object obj = ny3Var.u;
        int i2 = ny3Var.w;
        LinkedHashMap linkedHashMap = this.e;
        if (i2 == 0) {
            dv8.b(obj);
            k4b k4bVar = (k4b) linkedHashMap.get(str);
            if (k4bVar != null) {
                ny3Var.t = str;
                ny3Var.w = 1;
                k4bVar.b.k(null);
                Object objA = k4bVar.a.a(new fx3.a(str), ny3Var);
                v72 v72Var = v72.t;
                if (objA != v72Var) {
                    objA = g2b.a;
                }
                if (objA == v72Var) {
                    return v72Var;
                }
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = ny3Var.t;
            dv8.b(obj);
        }
        linkedHashMap.remove(str);
        return g2b.a;
    }

    public final Object b(String str, u02 u02Var) {
        a70 a70Var = this.a;
        py3 py3Var = this.b;
        ContentResolver contentResolver = this.c;
        a55 a55Var = new a55(a70Var, py3Var, contentResolver);
        String strA = wy3.a(contentResolver, Uri.parse(str));
        this.e.put(str, a55Var);
        a55Var.b.k(null);
        a55Var.b = oy0.d(a55Var.c, null, null, new j4b(a55Var, str, strA, null), 3);
        Object objA = py3Var.a(new fx3.d(str), u02Var);
        v72 v72Var = v72.t;
        if (objA != v72Var) {
            objA = g2b.a;
        }
        return objA == v72Var ? objA : g2b.a;
    }
}
