package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class glb {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final pt7 a = new pt7();
    public final StringBuilder b = new StringBuilder();

    public static String a(pt7 pt7Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = pt7Var.b;
        int i2 = pt7Var.c;
        while (i < i2 && !z) {
            char c2 = (char) pt7Var.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        pt7Var.N(i - pt7Var.b);
        return sb.toString();
    }

    public static String b(pt7 pt7Var, StringBuilder sb) {
        c(pt7Var);
        if (pt7Var.a() == 0) {
            return null;
        }
        String strA = a(pt7Var, sb);
        if (!strA.isEmpty()) {
            return strA;
        }
        return BuildConfig.FLAVOR + ((char) pt7Var.z());
    }

    public static void c(pt7 pt7Var) {
        while (true) {
            for (boolean z = true; pt7Var.a() > 0 && z; z = false) {
                int i = pt7Var.b;
                byte[] bArr = pt7Var.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    pt7Var.N(1);
                } else {
                    int i2 = pt7Var.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            pt7Var.N(i2 - pt7Var.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
