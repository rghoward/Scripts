package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sv8 implements ro4 {
    public float A;
    public float B;
    public long C;
    public jl9 D;
    public boolean E;
    public long F;
    public tx2 G;
    public tq5 H;
    public int I;
    public dm7 J;
    public int t;
    public float u = 1.0f;
    public float v = 1.0f;
    public float w = 1.0f;
    public float x;
    public long y;
    public long z;

    public sv8() {
        long j = so4.a;
        this.y = j;
        this.z = j;
        this.B = 8.0f;
        this.C = ava.b;
        this.D = al8.a;
        this.F = 9205357640488583168L;
        this.G = yx2.a();
        this.H = tq5.t;
        this.I = 3;
    }

    @Override // defpackage.tx2
    public final float N0() {
        return this.G.N0();
    }

    @Override // defpackage.ro4
    public final void R0(jl9 jl9Var) {
        if (xj5.a(this.D, jl9Var)) {
            return;
        }
        this.t |= 8192;
        this.D = jl9Var;
    }

    @Override // defpackage.ro4
    public final void b(float f) {
        if (this.w == f) {
            return;
        }
        this.t |= 4;
        this.w = f;
    }

    @Override // defpackage.ro4
    public final long c() {
        return this.F;
    }

    @Override // defpackage.ro4
    public final void d(float f) {
        if (this.x == f) {
            return;
        }
        this.t |= 32;
        this.x = f;
    }

    public final void e() {
        r(1.0f);
        k(1.0f);
        b(1.0f);
        d(0.0f);
        long j = so4.a;
        p(j);
        u(j);
        h(0.0f);
        w(8.0f);
        o1(ava.b);
        R0(al8.a);
        s(false);
        i(3);
        this.F = 9205357640488583168L;
        this.J = null;
        this.t = 0;
    }

    @Override // defpackage.tx2
    public final float getDensity() {
        return this.G.getDensity();
    }

    @Override // defpackage.ro4
    public final void h(float f) {
        if (this.A == f) {
            return;
        }
        this.t |= 1024;
        this.A = f;
    }

    @Override // defpackage.ro4
    public final void i(int i) {
        if (this.I == i) {
            return;
        }
        this.t |= 524288;
        this.I = i;
    }

    @Override // defpackage.ro4
    public final void k(float f) {
        if (this.v == f) {
            return;
        }
        this.t |= 2;
        this.v = f;
    }

    @Override // defpackage.ro4
    public final void o1(long j) {
        if (ava.a(this.C, j)) {
            return;
        }
        this.t |= 4096;
        this.C = j;
    }

    @Override // defpackage.ro4
    public final void p(long j) {
        if (uh1.c(this.y, j)) {
            return;
        }
        this.t |= 64;
        this.y = j;
    }

    @Override // defpackage.ro4
    public final void r(float f) {
        if (this.u == f) {
            return;
        }
        this.t |= 1;
        this.u = f;
    }

    @Override // defpackage.ro4
    public final void s(boolean z) {
        if (this.E != z) {
            this.t |= 16384;
            this.E = z;
        }
    }

    @Override // defpackage.ro4
    public final void u(long j) {
        if (uh1.c(this.z, j)) {
            return;
        }
        this.t |= 128;
        this.z = j;
    }

    @Override // defpackage.ro4
    public final void w(float f) {
        if (this.B == f) {
            return;
        }
        this.t |= AudioConstants.AUDIO_FILE_BUFFER_SIZE;
        this.B = f;
    }

    @Override // defpackage.ro4
    public final void B1() {
    }

    @Override // defpackage.ro4
    public final void L() {
    }

    @Override // defpackage.ro4
    public final void d1() {
    }

    @Override // defpackage.ro4
    public final void m() {
    }

    @Override // defpackage.ro4
    public final void n() {
    }

    @Override // defpackage.ro4
    public final void W(float f) {
    }

    @Override // defpackage.ro4
    public final void p1(float f) {
    }
}
