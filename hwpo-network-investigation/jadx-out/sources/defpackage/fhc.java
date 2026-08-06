package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fhc {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    public final vnc a;

    public fhc(vnc vncVar) {
        this.a = vncVar;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        a78.g(atomicReference);
        a78.b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.a()) {
            return str;
        }
        return g(str, oh7.f, oh7.a, b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.a()) {
            return str;
        }
        return g(str, m40.b, m40.a, c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (this.a.a()) {
            return str.startsWith("_exp_") ? sk0.c("experiment_id(", str, ")") : g(str, bw5.c, bw5.b, d);
        }
        return str;
    }

    public final String d(z9c z9cVar) {
        String string;
        vnc vncVar = this.a;
        if (!vncVar.a()) {
            return z9cVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(z9cVar.v);
        sb.append(",name=");
        sb.append(a(z9cVar.t));
        sb.append(",params=");
        v9c v9cVar = z9cVar.u;
        if (v9cVar == null) {
            string = null;
        } else {
            string = !vncVar.a() ? v9cVar.t.toString() : e(v9cVar.v());
        }
        sb.append(string);
        return sb.toString();
    }

    public final String e(Bundle bundle) {
        String strF;
        if (bundle == null) {
            return null;
        }
        if (!this.a.a()) {
            return bundle.toString();
        }
        StringBuilder sbA = bl2.a("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbA.length() != 8) {
                sbA.append(", ");
            }
            sbA.append(b(str));
            sbA.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strF = f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strF = f((Object[]) obj);
            } else {
                strF = obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbA.append(strF);
        }
        sbA.append("}]");
        return sbA.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbA = bl2.a("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sbA.length() != 1) {
                    sbA.append(", ");
                }
                sbA.append(strE);
            }
        }
        sbA.append("]");
        return sbA.toString();
    }
}
