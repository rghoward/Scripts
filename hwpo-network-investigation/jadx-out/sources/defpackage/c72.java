package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c72 {
    public static final /* synthetic */ int a = 0;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            z90.a("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String c(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + ds6.c(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + ds6.c(Float.intBitsToFloat(i)) + ", " + ds6.c(Float.intBitsToFloat(i2)) + ')';
    }
}
