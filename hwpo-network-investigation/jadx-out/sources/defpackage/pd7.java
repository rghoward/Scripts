package defpackage;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pd7 {
    public static final pd7 b = new pd7(0);
    public final /* synthetic */ int a;

    public /* synthetic */ pd7(int i) {
        this.a = i;
    }

    public static final float a(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "coil.request.NullRequestData";
            default:
                return super.toString();
        }
    }
}
