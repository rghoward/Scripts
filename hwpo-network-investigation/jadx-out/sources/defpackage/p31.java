package defpackage;

import androidx.media3.exoplayer.a;
import androidx.media3.exoplayer.l;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p31 extends a {
    public final nn2 L;
    public final pt7 M;
    public o31 N;
    public long O;

    public p31() {
        super(6);
        this.L = new nn2(1);
        this.M = new pt7();
    }

    @Override // androidx.media3.exoplayer.a
    public final void H() {
        o31 o31Var = this.N;
        if (o31Var != null) {
            o31Var.e();
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void J(long j, boolean z, boolean z2) {
        this.O = Long.MIN_VALUE;
        o31 o31Var = this.N;
        if (o31Var != null) {
            o31Var.e();
        }
    }

    @Override // androidx.media3.exoplayer.k
    public final boolean b() {
        return true;
    }

    @Override // androidx.media3.exoplayer.l
    public final int f(id4 id4Var) {
        return "application/x-camera-motion".equals(id4Var.o) ? l.r(4, 0, 0, 0) : l.r(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.k, androidx.media3.exoplayer.l
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.k
    public final void h(long j, long j2) {
        float[] fArr;
        while (!k() && this.O < 100000 + j) {
            nn2 nn2Var = this.L;
            nn2Var.j();
            jd4 jd4Var = this.v;
            jd4Var.a();
            if (Q(jd4Var, nn2Var, 0) != -4 || nn2Var.i(4)) {
                return;
            }
            long j3 = nn2Var.y;
            this.O = j3;
            boolean z = j3 < this.E;
            if (this.N != null && !z) {
                nn2Var.m();
                ByteBuffer byteBuffer = nn2Var.w;
                String str = n6b.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    pt7 pt7Var = this.M;
                    pt7Var.K(bArrArray, iLimit);
                    pt7Var.M(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(pt7Var.o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.N.c(this.O - this.D, fArr);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.j.b
    public final void y(int i, Object obj) {
        if (i == 8) {
            this.N = (o31) obj;
        }
    }
}
