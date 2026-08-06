package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class re2 extends vc1 {
    public byte[] j;
    public volatile boolean k;

    @Override // yb6.d
    public final void a() {
        try {
            this.i.c(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.k) {
                byte[] bArr = this.j;
                if (bArr.length < i2 + 16384) {
                    this.j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.i.read(this.j, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.k) {
                ((wy4.a) this).l = Arrays.copyOf(this.j, i2);
            }
        } finally {
            nf2.a(this.i);
        }
    }

    @Override // yb6.d
    public final void b() {
        this.k = true;
    }
}
