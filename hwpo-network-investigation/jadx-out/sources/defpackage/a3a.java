package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class a3a extends z2a {
    public static char S(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        px1.b("Char sequence is empty.");
        return (char) 0;
    }

    public static char T(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        px1.b("Char sequence is empty.");
        return (char) 0;
    }

    public static String U(int i, String str) {
        str.getClass();
        if (i < 0) {
            ca0.a(pk.d(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }
}
