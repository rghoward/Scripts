package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class be3 {
    public static final long[] e = new long[0];
    public final SerialDescriptor a;
    public final im5.a b;
    public long c;
    public final long[] d;

    public be3(SerialDescriptor serialDescriptor, im5.a aVar) {
        serialDescriptor.getClass();
        this.a = serialDescriptor;
        this.b = aVar;
        int iF = serialDescriptor.f();
        if (iF <= 64) {
            this.c = iF != 64 ? (-1) << iF : 0L;
            this.d = e;
            return;
        }
        this.c = 0L;
        int i = (iF - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iF & 63) != 0) {
            jArr[i - 1] = (-1) << iF;
        }
        this.d = jArr;
    }
}
