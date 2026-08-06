package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ab6 {
    public static String a(List list, String str, af5 af5Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        int i2 = i & 2;
        String str2 = BuildConfig.FLAVOR;
        String str3 = i2 != 0 ? BuildConfig.FLAVOR : "[\n\t";
        if ((i & 4) == 0) {
            str2 = "\n]";
        }
        if ((i & 32) != 0) {
            af5Var = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str3);
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            if (af5Var != null) {
                sb.append((CharSequence) af5Var.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    public static final Void b(String str) {
        throw new NoSuchElementException(str);
    }

    public static final void c(String str) {
        throw new UnsupportedOperationException(str);
    }
}
