package defpackage;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p3 extends o3 {
    public static p3 d;
    public BreakIterator c;

    @Override // defpackage.o3
    public final int[] b(int i) {
        int length = d().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        do {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                xj5.e("impl");
                throw null;
            }
            boolean zIsBoundary = breakIterator.isBoundary(i);
            BreakIterator breakIterator2 = this.c;
            if (zIsBoundary) {
                if (breakIterator2 == null) {
                    xj5.e("impl");
                    throw null;
                }
                int iFollowing = breakIterator2.following(i);
                if (iFollowing == -1) {
                    return null;
                }
                return c(i, iFollowing);
            }
            if (breakIterator2 == null) {
                xj5.e("impl");
                throw null;
            }
            i = breakIterator2.following(i);
        } while (i != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                xj5.e("impl");
                throw null;
            }
            boolean zIsBoundary = breakIterator.isBoundary(i);
            BreakIterator breakIterator2 = this.c;
            if (zIsBoundary) {
                if (breakIterator2 == null) {
                    xj5.e("impl");
                    throw null;
                }
                int iPreceding = breakIterator2.preceding(i);
                if (iPreceding == -1) {
                    return null;
                }
                return c(iPreceding, i);
            }
            if (breakIterator2 == null) {
                xj5.e("impl");
                throw null;
            }
            i = breakIterator2.preceding(i);
        } while (i != -1);
        return null;
    }
}
