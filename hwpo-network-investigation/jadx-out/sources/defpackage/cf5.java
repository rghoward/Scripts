package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class cf5 {
    public static final int[] a = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    public static final int[] b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] c = {3, 6};
    public static final int[] d = {1, 2, 4, 5, 7, 8};

    public static final void a(StringBuilder sb, StringBuilder sb2, int i) {
        if (i < 10) {
            sb.append('0');
        }
        sb2.append(i);
    }

    public static final df5.a b(String str, String str2, int i, oh4 oh4Var) {
        char cCharAt = str.charAt(i);
        if (((Boolean) oh4Var.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return c(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i);
    }

    public static final df5.a c(String str, String str2) {
        StringBuilder sbB = tn2.b(str2, " when parsing an Instant from \"");
        sbB.append(e(64, str));
        sbB.append('\"');
        return new df5.a(sbB.toString(), str);
    }

    public static final int d(int i, String str) {
        return (str.charAt(i + 1) - '0') + ((str.charAt(i) - '0') * 10);
    }

    public static final String e(int i, String str) {
        if (str.length() <= i) {
            return str.toString();
        }
        return str.subSequence(0, i).toString() + "...";
    }
}
