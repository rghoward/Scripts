package defpackage;

import android.text.TextUtils;
import com.intercom.twig.BuildConfig;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class esa {
    public final int a;
    public final String b;
    public final int c;
    public final id4[] d;
    public int e;

    static {
        n6b.H(0);
        n6b.H(1);
    }

    public esa(String str, id4... id4VarArr) {
        xl7.g(id4VarArr.length > 0);
        this.b = str;
        this.d = id4VarArr;
        this.a = id4VarArr.length;
        String str2 = id4VarArr[0].o;
        this.c = TextUtils.isEmpty(str2) ? fv6.h(id4VarArr[0].n) : fv6.h(str2);
        String str3 = id4VarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? BuildConfig.FLAVOR : str3;
        int i = id4VarArr[0].f | 16384;
        for (int i2 = 1; i2 < id4VarArr.length; i2++) {
            String str4 = id4VarArr[i2].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? BuildConfig.FLAVOR : str4)) {
                b("languages", id4VarArr[0].d, id4VarArr[i2].d, i2);
                return;
            } else {
                if (i != (id4VarArr[i2].f | 16384)) {
                    b("role flags", Integer.toBinaryString(id4VarArr[0].f), Integer.toBinaryString(id4VarArr[i2].f), i2);
                    return;
                }
            }
        }
    }

    public static void b(String str, String str2, String str3, int i) {
        StringBuilder sbA = vb0.a("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbA.append(str3);
        sbA.append("' (track ");
        sbA.append(i);
        sbA.append(")");
        md6.e("TrackGroup", BuildConfig.FLAVOR, new IllegalStateException(sbA.toString()));
    }

    public final int a(id4 id4Var) {
        int i = 0;
        while (true) {
            id4[] id4VarArr = this.d;
            if (i >= id4VarArr.length) {
                return -1;
            }
            if (id4Var == id4VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && esa.class == obj.getClass()) {
            esa esaVar = (esa) obj;
            if (this.b.equals(esaVar.b) && Arrays.equals(this.d, esaVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + ru3.c(527, 31, this.b);
        }
        return this.e;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
