package defpackage;

import io.intercom.android.sdk.utilities.commons.TimeProvider;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qi1 implements l43, u65.a, TimeProvider {
    @Override // u65.a
    public boolean a(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @Override // defpackage.l43
    public double c(double d) {
        float[] fArr = si1.a;
        return si1.d(si1.d, d);
    }

    @Override // io.intercom.android.sdk.utilities.commons.TimeProvider
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
