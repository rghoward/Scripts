package defpackage;

import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iya {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(hsa hsaVar, hsa.a aVar) {
        if (this.c > 0) {
            hsaVar.a(this.d, this.e, this.f, this.g, aVar);
            this.c = 0;
        }
    }

    public final void b(hsa hsaVar, long j, int i, int i2, int i3, hsa.a aVar) {
        xl7.q("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(hsaVar, aVar);
            }
        }
    }

    public final void c(ks3 ks3Var) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        int i = 0;
        ks3Var.n(bArr, 0, 10);
        ks3Var.l();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[((b & MessagePack.Code.EXT_TIMESTAMP) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.b = true;
    }
}
