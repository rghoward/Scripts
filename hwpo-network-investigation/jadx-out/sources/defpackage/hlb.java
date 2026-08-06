package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hlb {
    public int f;
    public int h;
    public float o;
    public String a = BuildConfig.FLAVOR;
    public String b = BuildConfig.FLAVOR;
    public Set<String> c = Collections.EMPTY_SET;
    public String d = BuildConfig.FLAVOR;
    public String e = null;
    public boolean g = false;
    public boolean i = false;
    public final int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int p = -1;
    public boolean q = false;

    public static int a(int i, int i2, String str, String str2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
