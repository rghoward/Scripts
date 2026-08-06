package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j3a {
    public final androidx.media3.exoplayer.d a;
    public final i3a b;
    public final a c;
    public final vf1 d;
    public final toa.b e = new toa.b();
    public final kt4 f;
    public final b g;
    public final c h;
    public final d i;
    public final e j;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b {
        public final int a;
        public Object b;
        public int c;
        public int d;
        public long e;
        public long f;
        public boolean g;
        public long h;

        public b(int i) {
            this.a = i;
        }

        public final void a() {
            long jR;
            Object obj;
            int i = this.a;
            j3a j3aVar = j3a.this;
            if (j3aVar.a.A() != 2 || !j3aVar.a.k() || j3aVar.a.L() != 0) {
                if (this.g) {
                    j3aVar.f.l(1);
                }
                this.g = false;
                return;
            }
            toa toaVarN = j3aVar.a.N();
            Object objL = toaVarN.p() ? null : toaVarN.l(j3aVar.a.p());
            int iF = j3aVar.a.F();
            int iT = j3aVar.a.t();
            androidx.media3.exoplayer.d dVar = j3aVar.a;
            dVar.E0();
            if (dVar.g()) {
                i28 i28Var = dVar.o0;
                jR = i28Var.k.equals(i28Var.b) ? n6b.Z(dVar.o0.q) : dVar.o0();
            } else {
                jR = dVar.R();
            }
            long jMax = Math.max(0L, j3aVar.a.i() - Math.max(0L, jR - j3aVar.a.X()));
            if (objL != null && iF == -1) {
                jR -= n6b.Z(toaVarN.g(objL, j3aVar.e).e);
            }
            long jC = j3aVar.d.c();
            if (this.g && Objects.equals(objL, this.b) && iF == this.c && iT == this.d) {
                obj = objL;
                if (jR == this.e && jMax == this.f) {
                    if (jC - this.h >= i) {
                        androidx.media3.exoplayer.d.this.z0(new lo3(2, new k3a(1, i), 1003));
                        return;
                    }
                    return;
                }
            } else {
                obj = objL;
            }
            this.g = true;
            this.h = jC;
            this.b = obj;
            this.c = iF;
            this.d = iT;
            this.e = jR;
            this.f = jMax;
            j3aVar.f.l(1);
            j3aVar.f.d(1, i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c {
        public final int a;
        public Object b;
        public int c;
        public int d;
        public long e;
        public boolean f;
        public long g;

        public c(int i) {
            this.a = i;
        }

        public final void a() {
            j3a j3aVar = j3a.this;
            kt4 kt4Var = j3aVar.f;
            androidx.media3.exoplayer.d dVar = j3aVar.a;
            if (!dVar.C()) {
                if (this.f) {
                    kt4Var.l(2);
                }
                this.f = false;
                return;
            }
            toa toaVarN = dVar.N();
            Object objL = toaVarN.p() ? null : toaVarN.l(dVar.p());
            int iF = dVar.F();
            int iT = dVar.t();
            long jX = dVar.X();
            if (objL != null && iF == -1) {
                jX -= n6b.Z(toaVarN.g(objL, j3aVar.e).e);
            }
            long jC = j3aVar.d.c();
            boolean z = this.f;
            int i = this.a;
            if (z && Objects.equals(objL, this.b) && iF == this.c && iT == this.d && jX == this.e) {
                if (jC - this.g >= i) {
                    androidx.media3.exoplayer.d.this.z0(new lo3(2, new k3a(2, i), 1003));
                    return;
                }
                return;
            }
            this.f = true;
            this.g = jC;
            this.b = objL;
            this.c = iF;
            this.d = iT;
            this.e = jX;
            kt4Var.l(2);
            kt4Var.d(2, i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class d {
        public final int a;
        public Object b;
        public int c;
        public int d;
        public boolean e;
        public long f;

        public d(int i) {
            this.a = i;
        }

        public final void a() {
            long jO0;
            j3a j3aVar = j3a.this;
            toa.b bVar = j3aVar.e;
            kt4 kt4Var = j3aVar.f;
            androidx.media3.exoplayer.d dVar = j3aVar.a;
            toa toaVarN = dVar.N();
            Object objL = toaVarN.p() ? null : toaVarN.l(dVar.p());
            int iF = dVar.F();
            int iT = dVar.t();
            long jX = dVar.X();
            if (objL == null || iF != -1) {
                jO0 = iF != -1 ? dVar.o0() : -9223372036854775807L;
            } else {
                toaVarN.g(objL, bVar);
                jX -= n6b.Z(bVar.e);
                jO0 = n6b.Z(bVar.d);
            }
            boolean zC = dVar.C();
            if (!zC || jO0 == -9223372036854775807L || jX < jO0) {
                kt4Var.l(3);
                if (zC && jO0 != -9223372036854775807L) {
                    kt4Var.d(3, (int) Math.ceil((jO0 - jX) / dVar.e().a));
                }
                this.e = false;
                return;
            }
            long jC = j3aVar.d.c();
            boolean z = this.e;
            int i = this.a;
            if (z && Objects.equals(objL, this.b) && iF == this.c && iT == this.d) {
                if (jC - this.f >= i) {
                    androidx.media3.exoplayer.d.this.z0(new lo3(2, new k3a(3, i), 1003));
                    return;
                }
                return;
            }
            this.e = true;
            this.f = jC;
            this.b = objL;
            this.c = iF;
            this.d = iT;
            kt4Var.l(3);
            kt4Var.d(3, i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class e {
        public final int a;
        public int b;
        public boolean c;
        public long d;

        public e(int i) {
            this.a = i;
        }

        public final void a() {
            j3a j3aVar = j3a.this;
            kt4 kt4Var = j3aVar.f;
            androidx.media3.exoplayer.d dVar = j3aVar.a;
            int iL = dVar.L();
            if (!dVar.k() || dVar.A() == 1 || dVar.A() == 4 || iL == 0 || iL == 1) {
                if (this.c) {
                    kt4Var.l(4);
                }
                this.c = false;
                return;
            }
            long jC = j3aVar.d.c();
            boolean z = this.c;
            int i = this.a;
            if (z && this.b == iL) {
                if (jC - this.d >= i) {
                    androidx.media3.exoplayer.d.this.z0(new lo3(2, new k3a(4, i), 1003));
                    return;
                }
                return;
            }
            this.c = true;
            this.d = jC;
            this.b = iL;
            kt4Var.l(4);
            kt4Var.d(4, i);
        }
    }

    public j3a(androidx.media3.exoplayer.d dVar, a aVar, z7a z7aVar, int i, int i2, int i3, int i4) {
        this.a = dVar;
        this.c = aVar;
        this.d = z7aVar;
        this.f = z7aVar.b(dVar.t, new Handler.Callback() { // from class: h3a
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i5 = message.what;
                j3a j3aVar = this.t;
                if (i5 == 1) {
                    j3aVar.g.a();
                    return true;
                }
                if (i5 == 2) {
                    j3aVar.h.a();
                    return true;
                }
                if (i5 == 3) {
                    j3aVar.i.a();
                    return true;
                }
                if (i5 != 4) {
                    return false;
                }
                j3aVar.j.a();
                return true;
            }
        });
        this.g = new b(i);
        this.h = new c(i2);
        this.i = new d(i3);
        this.j = new e(i4);
        i3a i3aVar = new i3a(this);
        this.b = i3aVar;
        dVar.m.a(i3aVar);
    }
}
