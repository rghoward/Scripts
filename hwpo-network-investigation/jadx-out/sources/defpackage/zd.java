package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zd implements js3 {
    public final pt7 c;
    public final ot7 d;
    public ls3 e;
    public long f;
    public boolean h;
    public boolean i;
    public final ae a = new ae(null, "audio/mp4a-latm", 0, true);
    public final pt7 b = new pt7(AudioConstants.AUDIO_FILE_BUFFER_SIZE);
    public long g = -1;

    public zd(int i) {
        pt7 pt7Var = new pt7(10);
        this.c = pt7Var;
        byte[] bArr = pt7Var.a;
        this.d = new ot7(bArr, bArr.length);
    }

    @Override // defpackage.js3
    public final int c(ks3 ks3Var, o68 o68Var) {
        this.e.getClass();
        ks3Var.a();
        pt7 pt7Var = this.b;
        int i = ks3Var.read(pt7Var.a, 0, AudioConstants.AUDIO_FILE_BUFFER_SIZE);
        boolean z = i == -1;
        if (!this.i) {
            this.e.t(new t89.b(-9223372036854775807L));
            this.i = true;
        }
        if (z) {
            return -1;
        }
        pt7Var.M(0);
        pt7Var.L(i);
        boolean z2 = this.h;
        ae aeVar = this.a;
        if (!z2) {
            aeVar.u = this.f;
            this.h = true;
        }
        aeVar.a(pt7Var);
        return 0;
    }

    @Override // defpackage.js3
    public final boolean d(ks3 ks3Var) {
        pt7 pt7Var;
        int i = 0;
        while (true) {
            pt7Var = this.c;
            ks3Var.n(pt7Var.a, 0, 10);
            pt7Var.M(0);
            if (pt7Var.C() != 4801587) {
                break;
            }
            pt7Var.N(3);
            int iY = pt7Var.y();
            i += iY + 10;
            ks3Var.h(iY);
        }
        ks3Var.l();
        ks3Var.h(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            zq2 zq2Var = (zq2) ks3Var;
            zq2Var.f(pt7Var.a, 0, 2, false);
            pt7Var.M(0);
            if ((pt7Var.G() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                zq2Var.f(pt7Var.a, 0, 4, false);
                ot7 ot7Var = this.d;
                ot7Var.m(14);
                int iG = ot7Var.g(13);
                if (iG <= 6) {
                    i4++;
                    zq2Var.f = 0;
                    zq2Var.o(i4, false);
                } else {
                    zq2Var.o(iG - 6, false);
                    i3 += iG;
                }
            } else {
                i4++;
                zq2Var.f = 0;
                zq2Var.o(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // defpackage.js3
    public final void e(long j, long j2) {
        this.h = false;
        this.a.c();
        this.f = j2;
    }

    @Override // defpackage.js3
    public final void g(ls3 ls3Var) {
        this.e = ls3Var;
        this.a.f(ls3Var, new pya.c(0, 1));
        ls3Var.k();
    }

    @Override // defpackage.js3
    public final void a() {
    }
}
