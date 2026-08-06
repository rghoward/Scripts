package defpackage;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t3 extends o3 {
    public static t3 d;
    public BreakIterator c;

    @Override // defpackage.o3
    public final int[] b(int i) {
        if (d().length() > 0 && i < d().length()) {
            if (i < 0) {
                i = 0;
            }
            while (!h(i) && (!h(i) || (i != 0 && h(i - 1)))) {
                BreakIterator breakIterator = this.c;
                if (breakIterator == null) {
                    xj5.e("impl");
                    throw null;
                }
                i = breakIterator.following(i);
                if (i == -1) {
                }
            }
            BreakIterator breakIterator2 = this.c;
            if (breakIterator2 == null) {
                xj5.e("impl");
                throw null;
            }
            int iFollowing = breakIterator2.following(i);
            if (iFollowing != -1 && g(iFollowing)) {
                return c(i, iFollowing);
            }
        }
        return null;
    }

    @Override // defpackage.o3
    public final int[] e(int i) {
        int length = d().length();
        if (length > 0 && i > 0) {
            if (i > length) {
                i = length;
            }
            while (i > 0 && !h(i - 1) && !g(i)) {
                BreakIterator breakIterator = this.c;
                if (breakIterator == null) {
                    xj5.e("impl");
                    throw null;
                }
                i = breakIterator.preceding(i);
                if (i == -1) {
                }
            }
            BreakIterator breakIterator2 = this.c;
            if (breakIterator2 == null) {
                xj5.e("impl");
                throw null;
            }
            int iPreceding = breakIterator2.preceding(i);
            if (iPreceding != -1 && h(iPreceding) && (iPreceding == 0 || !h(iPreceding - 1))) {
                return c(iPreceding, i);
            }
        }
        return null;
    }

    public final boolean g(int i) {
        if (i <= 0 || !h(i - 1)) {
            return false;
        }
        return i == d().length() || !h(i);
    }

    public final boolean h(int i) {
        if (i < 0 || i >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i));
    }
}
