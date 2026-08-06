package defpackage;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ukb implements Closeable {
    public boolean A;
    public ot6 B;
    public final byte[] C;
    public final tx0.b D;
    public final fy0 t;
    public final Random u;
    public final boolean v;
    public final boolean w;
    public final long x;
    public final tx0 y;
    public final tx0 z;

    public ukb(fy0 fy0Var, Random random, boolean z, boolean z2, long j) {
        fy0Var.getClass();
        this.t = fy0Var;
        this.u = random;
        this.v = z;
        this.w = z2;
        this.x = j;
        this.y = new tx0();
        this.z = fy0Var.j();
        this.C = new byte[4];
        this.D = new tx0.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ot6 ot6Var = this.B;
        if (ot6Var != null) {
            vtb.b(ot6Var);
        }
        vtb.b(this.t);
    }

    public final void h(int i, g01 g01Var) throws IOException {
        if (this.A) {
            o03.a(MetricTracker.Action.CLOSED);
            return;
        }
        int iG = g01Var.g();
        if (iG > 125) {
            z90.a("Payload size must be less than or equal to 125");
            return;
        }
        tx0 tx0Var = this.z;
        tx0Var.Z(i | 128);
        tx0Var.Z(iG | 128);
        byte[] bArr = this.C;
        bArr.getClass();
        this.u.nextBytes(bArr);
        tx0Var.m884write(bArr, 0, bArr.length);
        if (iG > 0) {
            long j = tx0Var.u;
            tx0Var.Y(g01Var);
            tx0.b bVar = this.D;
            bVar.getClass();
            tx0Var.E(bVar);
            bVar.k(j);
            skb.a(bVar, bArr);
            bVar.close();
        }
        this.t.flush();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0136  */
    public final void k(int i, g01 g01Var) throws IOException {
        byte[] bArr;
        if (this.A) {
            o03.a(MetricTracker.Action.CLOSED);
            return;
        }
        tx0 tx0Var = this.y;
        tx0Var.Y(g01Var);
        int i2 = i | 128;
        if (this.v && g01Var.t.length >= this.x) {
            ot6 ot6Var = this.B;
            if (ot6Var == null) {
                ot6Var = new ot6(this.w);
                this.B = ot6Var;
            }
            yv2 yv2Var = ot6Var.w;
            tx0 tx0Var2 = ot6Var.u;
            if (tx0Var2.u != 0) {
                z90.a("Failed requirement.");
                return;
            }
            if (ot6Var.t) {
                ot6Var.v.reset();
            }
            yv2Var.i0(tx0Var, tx0Var.u);
            yv2Var.flush();
            g01 g01Var2 = pt6.a;
            if (tx0Var2.B(g01Var2.g(), tx0Var2.u - ((long) g01Var2.t.length), g01Var2)) {
                long j = tx0Var2.u - 4;
                tx0.b bVarE = tx0Var2.E(t.a);
                try {
                    bVarE.h(j);
                    bVarE.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        fg1.a(bVarE, th);
                        throw th2;
                    }
                }
            } else {
                tx0Var2.Z(0);
            }
            tx0Var.i0(tx0Var2, tx0Var2.u);
            i2 = i | 192;
        }
        long j2 = tx0Var.u;
        tx0 tx0Var3 = this.z;
        tx0Var3.Z(i2);
        if (j2 > 125) {
            if (j2 <= 65535) {
                tx0Var3.Z(254);
                tx0Var3.e0((int) j2);
            } else {
                tx0Var3.Z(255);
                f99 f99VarW = tx0Var3.W(8);
                byte[] bArr2 = f99VarW.a;
                int i3 = f99VarW.c;
                bArr2[i3] = (byte) ((j2 >>> 56) & 255);
                bArr2[i3 + 1] = (byte) ((j2 >>> 48) & 255);
                bArr2[i3 + 2] = (byte) ((j2 >>> 40) & 255);
                bArr2[i3 + 3] = (byte) ((j2 >>> 32) & 255);
                bArr2[i3 + 4] = (byte) ((j2 >>> 24) & 255);
                bArr2[i3 + 5] = (byte) ((j2 >>> 16) & 255);
                bArr2[i3 + 6] = (byte) ((j2 >>> 8) & 255);
                bArr2[i3 + 7] = (byte) (j2 & 255);
                f99VarW.c = i3 + 8;
                tx0Var3.u += 8;
            }
            bArr = this.C;
            bArr.getClass();
            this.u.nextBytes(bArr);
            tx0Var3.m884write(bArr, 0, bArr.length);
            if (j2 > r7) {
                tx0.b bVar = this.D;
                bVar.getClass();
                tx0Var.E(bVar);
                bVar.k(0L);
                skb.a(bVar, bArr);
                bVar.close();
            }
            tx0Var3.i0(tx0Var, j2);
            this.t.flush();
        }
        tx0Var3.Z(((int) j2) | 128);
        bArr = this.C;
        bArr.getClass();
        this.u.nextBytes(bArr);
        tx0Var3.m884write(bArr, 0, bArr.length);
        if (j2 > r7) {
            tx0.b bVar2 = this.D;
            bVar2.getClass();
            tx0Var.E(bVar2);
            bVar2.k(0L);
            skb.a(bVar2, bArr);
            bVar2.close();
        }
        tx0Var3.i0(tx0Var, j2);
        this.t.flush();
    }
}
