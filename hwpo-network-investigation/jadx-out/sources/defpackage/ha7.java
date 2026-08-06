package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ha7 implements wu9, jac {
    public static final ha7 u = new ha7(0);
    public static final /* synthetic */ ha7 v = new ha7(3);
    public final /* synthetic */ int t;

    public /* synthetic */ ha7(int i) {
        this.t = i;
    }

    public static final pm5 c(SerialDescriptor serialDescriptor) {
        String str = "Value of type '" + serialDescriptor.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.e() + '\'';
        serialDescriptor.a();
        return new pm5(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final String d(String str, String str2, String str3, String str4, int i) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !z2a.w(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !z2a.w(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    public static final void e(h2a h2aVar, String str) {
        h2aVar.l(h2aVar.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static /* synthetic */ void f(h2a h2aVar) {
        e(h2aVar, "object");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00ba A[RETURN] */
    public static final boolean g(dd8 dd8Var, v59 v59Var, int i) {
        dd8Var.getClass();
        String str = dd8Var.v;
        int i2 = dd8Var.x;
        double d = dd8Var.u;
        int i3 = dd8Var.y;
        List<dd8> list = dd8Var.w;
        v59Var.getClass();
        switch (v59Var.ordinal()) {
            case 0:
                if (d > 0.0d) {
                    return true;
                }
                return false;
            case 1:
                if (d <= 0.0d || str.length() != 5) {
                    return false;
                }
                return true;
            case 2:
                if (i2 == -1 || i3 == -1) {
                    if (i2 == -1 || i != 0) {
                        if (d > 0.0d && str.length() == 5) {
                            return true;
                        }
                    } else if (i3 > 0) {
                        return true;
                    }
                } else if (i2 > 0 || i3 > 0) {
                    return true;
                }
                return false;
            case 3:
                if (i2 > 0 || i3 > 0) {
                    return true;
                }
                return false;
            case 4:
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (g((dd8) it.next(), v59.t, i)) {
                            return true;
                        }
                    }
                }
                return false;
            case 5:
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (g((dd8) it2.next(), v59.u, i)) {
                            return true;
                        }
                    }
                }
                return false;
            case 6:
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (g((dd8) it3.next(), v59.w, i)) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                u.b();
                return false;
        }
    }

    public static final CharSequence h(CharSequence charSequence, int i) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? BuildConfig.FLAVOR : ".....";
                String str2 = i3 >= charSequence.length() ? BuildConfig.FLAVOR : ".....";
                StringBuilder sbA = bl2.a(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sbA.append(charSequence.subSequence(i2, i3).toString());
                sbA.append(str2);
                return sbA.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final String i(String str, Number number) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return av.a(sb, str != null ? sk0.c(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    @Override // defpackage.jac
    public Object a() {
        return new Boolean(((a6c) z5c.u.t.t).b());
    }

    @Override // defpackage.wu9
    public boolean b(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        switch (this.t) {
            case 0:
                return "NeverEqualPolicy";
            default:
                return super.toString();
        }
    }
}
