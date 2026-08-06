package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s3 extends o3 {
    public static s3 c;

    @Override // defpackage.o3
    public final int[] b(int i) {
        int length = d().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && d().charAt(i) == '\n' && (d().charAt(i) == '\n' || (i != 0 && d().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !g(i2)) {
            i2++;
        }
        return c(i, i2);
    }

    @Override // defpackage.o3
    public final int[] e(int i) {
        int length = d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && d().charAt(i - 1) == '\n' && !g(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (d().charAt(i2) == '\n' || (i2 != 0 && d().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return c(i2, i);
    }

    public final boolean g(int i) {
        if (i <= 0 || d().charAt(i - 1) == '\n') {
            return false;
        }
        return i == d().length() || d().charAt(i) == '\n';
    }
}
