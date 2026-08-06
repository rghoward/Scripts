package defpackage;

import android.util.StateSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g0a {
    public int a;
    public d72 b;
    public int[][] c;
    public d72[] d;

    public final d72 a(int[] iArr) {
        int i;
        int[][] iArr2 = this.c;
        int i2 = 0;
        while (true) {
            i = -1;
            if (i2 >= this.a) {
                i2 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                break;
            }
            i2++;
        }
        if (i2 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.c;
            for (int i3 = 0; i3 < this.a; i3++) {
                if (StateSet.stateSetMatches(iArr4[i3], iArr3)) {
                    i = i3;
                    break;
                }
            }
            i2 = i;
        }
        return i2 < 0 ? this.b : this.d[i2];
    }
}
