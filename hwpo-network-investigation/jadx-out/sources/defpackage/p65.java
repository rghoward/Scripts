package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p65 implements if2 {
    public final if2 a;
    public final int b;
    public final ge8.b c;
    public final byte[] d;
    public int e;

    public p65(if2 if2Var, int i, ge8.b bVar) {
        xl7.g(i > 0);
        this.a = if2Var;
        this.b = i;
        this.c = bVar;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // defpackage.if2
    public final long c(of2 of2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.if2
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.if2
    public final void d(yua yuaVar) {
        yuaVar.getClass();
        this.a.d(yuaVar);
    }

    @Override // defpackage.if2
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.if2
    public final Map<String, List<String>> k() {
        return this.a.k();
    }

    @Override // defpackage.ef2
    public final int read(byte[] bArr, int i, int i2) {
        long jMax;
        int i3 = this.e;
        if2 if2Var = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (if2Var.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int i7 = if2Var.read(bArr3, i4, i6);
                        if (i7 != -1) {
                            i4 += i7;
                            i6 -= i7;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        pt7 pt7Var = new pt7(bArr3, i5);
                        ge8.b bVar = this.c;
                        if (bVar.l) {
                            ge8 ge8Var = ge8.this;
                            Map<String, String> map = ge8.k0;
                            jMax = Math.max(ge8Var.y(true), bVar.i);
                        } else {
                            jMax = bVar.i;
                        }
                        long j = jMax;
                        int iA = pt7Var.a();
                        hsa hsaVar = bVar.k;
                        hsaVar.getClass();
                        hsaVar.e(iA, pt7Var);
                        hsaVar.a(j, 1, iA, 0, null);
                        bVar.l = true;
                    }
                }
                this.e = this.b;
            }
            return -1;
        }
        int i8 = if2Var.read(bArr, i, Math.min(this.e, i2));
        if (i8 != -1) {
            this.e -= i8;
        }
        return i8;
    }
}
