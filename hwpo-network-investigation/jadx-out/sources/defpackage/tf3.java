package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tf3 {
    public Parcel a;

    public final void a(byte b) {
        this.a.writeByte(b);
    }

    public final void b(float f) {
        this.a.writeFloat(f);
    }

    public final void c(long j) {
        long jB = bka.b(j);
        byte b = 0;
        if (!dka.a(jB, 0L)) {
            if (dka.a(jB, 4294967296L)) {
                b = 1;
            } else if (dka.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        a(b);
        if (dka.a(bka.b(j), 0L)) {
            return;
        }
        b(bka.c(j));
    }

    public final void d(long j) {
        long j2 = 63 & j;
        if (Long.compare(Long.MIN_VALUE ^ j2, -9223372036854775792L) >= 0) {
            j = (j & (-64)) | (j2 - 1);
        }
        this.a.writeLong(j);
    }
}
