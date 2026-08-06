package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;
import android.view.Surface;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bfb {
    public final pn6 a;
    public final dfb b;
    public final long c;
    public boolean d;
    public long g;
    public boolean j;
    public boolean m;
    public boolean n;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public float k = 1.0f;
    public vf1 l = vf1.a;
    public final boolean o = true;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public long a = -9223372036854775807L;
        public long b = -9223372036854775807L;
    }

    public bfb(Context context, pn6 pn6Var, long j) {
        this.a = pn6Var;
        this.c = j;
        this.b = new dfb(context);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01df  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:115:0x0201  */
    /* JADX WARN: Code duplicated, block: B:116:0x0205  */
    /* JADX WARN: Code duplicated, block: B:119:0x0217  */
    /* JADX WARN: Code duplicated, block: B:120:0x021b  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:155:0x02ae A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:157:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:166:0x02c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code duplicated, block: B:91:0x017c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x017d  */
    /* JADX WARN: Code duplicated, block: B:99:0x019c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int a(long j, long j2, long j3, long j4, boolean z, boolean z2, a aVar) {
        long j5;
        long j6;
        long j7;
        int i;
        int i2;
        boolean z3;
        long jD;
        dfb dfbVar;
        long j8;
        int i3;
        int i4;
        dfb.b bVar;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        boolean z4;
        long j14;
        float f;
        float f2;
        long j15;
        h34 h34Var;
        long j16;
        h34.a aVar2;
        long j17;
        aVar.a = -9223372036854775807L;
        aVar.b = -9223372036854775807L;
        if (this.d && this.f == -9223372036854775807L) {
            this.f = j2;
        }
        if (this.h != j) {
            dfb dfbVar2 = this.b;
            j5 = -9223372036854775807L;
            long j18 = dfbVar2.n;
            if (j18 != -1) {
                dfbVar2.q = j18;
                dfbVar2.r = dfbVar2.o;
                dfbVar2.s = dfbVar2.p;
                dfbVar2.k = dfbVar2.l;
            }
            dfbVar2.m++;
            h34 h34Var2 = dfbVar2.a;
            j6 = 1000;
            long j19 = j * 1000;
            h34Var2.a.b(j19);
            if (h34Var2.a.a()) {
                h34Var2.c = false;
                j7 = 0;
            } else {
                j7 = 0;
                if (h34Var2.d != -9223372036854775807L) {
                    if (h34Var2.c) {
                        h34.a aVar3 = h34Var2.b;
                        long j20 = aVar3.d;
                        if (j20 == 0 ? false : aVar3.g[(int) ((j20 - 1) % 15)]) {
                            h34Var2.b.c();
                            h34Var2.b.b(h34Var2.d);
                        }
                    } else {
                        h34Var2.b.c();
                        h34Var2.b.b(h34Var2.d);
                    }
                    h34Var2.c = true;
                    h34Var2.b.b(j19);
                }
            }
            if (h34Var2.c && h34Var2.b.a()) {
                h34.a aVar4 = h34Var2.a;
                h34Var2.a = h34Var2.b;
                h34Var2.b = aVar4;
                h34Var2.c = false;
            }
            h34Var2.d = j19;
            h34Var2.e = h34Var2.a.a() ? 0 : h34Var2.e + 1;
            dfbVar2.c();
            this.h = j;
        } else {
            j5 = -9223372036854775807L;
            j6 = 1000;
            j7 = 0;
        }
        long jN = (long) ((j - j2) / ((double) this.k));
        if (this.d) {
            jN -= n6b.N(this.l.c()) - j3;
        }
        aVar.a = jN;
        if (!z || z2) {
            if (this.m || !this.o) {
                if (!this.o) {
                    this.n = true;
                }
                long j21 = -30000;
                if (this.i == j5 || this.j) {
                    int i5 = this.e;
                    if (i5 != 0) {
                        if (i5 == 1) {
                            i = 3;
                            i2 = 5;
                        } else if (i5 == 2) {
                            i = 3;
                            i2 = 5;
                            if (j2 >= j4) {
                            }
                        } else {
                            if (i5 != 3) {
                                d43.c();
                                return 0;
                            }
                            i = 3;
                            i2 = 5;
                            long jN2 = n6b.N(this.l.c()) - this.g;
                            if (this.d) {
                                long j22 = this.f;
                                if (j22 == j5 || j22 == j2 || jN >= -30000 || jN2 <= 100000) {
                                }
                            }
                        }
                        z3 = true;
                    } else {
                        i = 3;
                        i2 = 5;
                        z3 = this.d;
                    }
                    if (z3) {
                        return 0;
                    }
                    if (this.d && j2 != this.f) {
                        jD = this.l.d();
                        dfbVar = this.b;
                        j8 = (aVar.a * j6) + jD;
                        if (dfbVar.q != -1) {
                            if (dfbVar.a.a.a()) {
                                h34Var = dfbVar.a;
                                if (h34Var.a.a()) {
                                    aVar2 = h34Var.a;
                                    i4 = 2;
                                    j17 = aVar2.e;
                                    i3 = 1;
                                    if (j17 == j7) {
                                        j16 = j7;
                                    } else {
                                        j16 = aVar2.f / j17;
                                    }
                                } else {
                                    i3 = 1;
                                    i4 = 2;
                                    j16 = j5;
                                }
                                f = (dfbVar.m - dfbVar.q) * j16;
                                f2 = dfbVar.i;
                            } else {
                                i3 = 1;
                                i4 = 2;
                                f = (j - dfbVar.s) * j6;
                                f2 = dfbVar.i;
                            }
                            j15 = dfbVar.r + ((long) (f / f2));
                            if (Math.abs(j8 - j15) <= 20000000) {
                                j8 = j15;
                            } else {
                                dfbVar.b();
                            }
                        } else {
                            i3 = 1;
                            i4 = 2;
                            j21 = -30000;
                        }
                        dfbVar.n = dfbVar.m;
                        dfbVar.o = j8;
                        dfbVar.p = j;
                        bVar = dfbVar.c;
                        if (bVar == null) {
                            j12 = jD;
                        } else {
                            j9 = bVar.v;
                            long j23 = dfbVar.c.w;
                            if (j9 != j5 || j23 == j5) {
                                j12 = jD;
                            } else {
                                long j24 = (((j8 - j9) / j23) * j23) + j9;
                                if (j8 <= j24) {
                                    j10 = j24 - j23;
                                } else {
                                    j24 += j23;
                                    j10 = j24;
                                }
                                long j25 = j24 - j8;
                                long j26 = j8 - j10;
                                long jAbs = Math.abs(j25 - j26);
                                if (jAbs < j23 / 2) {
                                    j11 = j10;
                                    long j27 = j23 / 4;
                                    if (jAbs < j27) {
                                        j12 = jD;
                                        long j28 = dfbVar.k;
                                        if (j28 != j7) {
                                            dfbVar.l = j28;
                                        } else {
                                            if (j25 < j26) {
                                                j27 = -j27;
                                            }
                                            dfbVar.l = j27;
                                        }
                                    } else {
                                        j12 = jD;
                                        dfbVar.l = j7;
                                    }
                                } else {
                                    j11 = j10;
                                    j12 = jD;
                                    dfbVar.l = dfbVar.k;
                                }
                                if (j25 + dfbVar.l >= j26) {
                                    j24 = j11;
                                }
                                j8 = j24 - ((j23 * 80) / 100);
                            }
                        }
                        aVar.b = j8;
                        j13 = (j8 - j12) / j6;
                        aVar.a = j13;
                        if (this.i != j5 || this.j) {
                            z4 = 0;
                        } else {
                            z4 = i3;
                        }
                        if (this.a.a1(j13, j2, z2, z4)) {
                            return 4;
                        }
                        j14 = aVar.a;
                        if (j14 >= j21 && !z2) {
                            return z4 != 0 ? i : i4;
                        }
                        if (j14 > 50000) {
                            return i3;
                        }
                    }
                    return i2;
                }
                i = 3;
                i2 = 5;
                z3 = false;
                if (z3) {
                    return 0;
                }
                if (this.d) {
                    jD = this.l.d();
                    dfbVar = this.b;
                    j8 = (aVar.a * j6) + jD;
                    if (dfbVar.q != -1) {
                        if (dfbVar.a.a.a()) {
                            h34Var = dfbVar.a;
                            if (h34Var.a.a()) {
                                aVar2 = h34Var.a;
                                i4 = 2;
                                j17 = aVar2.e;
                                i3 = 1;
                                if (j17 == j7) {
                                    j16 = j7;
                                } else {
                                    j16 = aVar2.f / j17;
                                }
                            } else {
                                i3 = 1;
                                i4 = 2;
                                j16 = j5;
                            }
                            f = (dfbVar.m - dfbVar.q) * j16;
                            f2 = dfbVar.i;
                        } else {
                            i3 = 1;
                            i4 = 2;
                            f = (j - dfbVar.s) * j6;
                            f2 = dfbVar.i;
                        }
                        j15 = dfbVar.r + ((long) (f / f2));
                        if (Math.abs(j8 - j15) <= 20000000) {
                            j8 = j15;
                        } else {
                            dfbVar.b();
                        }
                    } else {
                        i3 = 1;
                        i4 = 2;
                        j21 = -30000;
                    }
                    dfbVar.n = dfbVar.m;
                    dfbVar.o = j8;
                    dfbVar.p = j;
                    bVar = dfbVar.c;
                    if (bVar == null) {
                        j12 = jD;
                    } else {
                        j9 = bVar.v;
                        long j29 = dfbVar.c.w;
                        if (j9 != j5) {
                            j12 = jD;
                        } else {
                            j12 = jD;
                        }
                    }
                    aVar.b = j8;
                    j13 = (j8 - j12) / j6;
                    aVar.a = j13;
                    if (this.i != j5) {
                        z4 = 0;
                    } else {
                        z4 = 0;
                    }
                    if (this.a.a1(j13, j2, z2, z4)) {
                        return 4;
                    }
                    j14 = aVar.a;
                    if (j14 >= j21) {
                    }
                    if (j14 > 50000) {
                        return i3;
                    }
                }
                return i2;
            }
            if (this.a.a1(jN, j2, z2, true)) {
                return 4;
            }
            if (!this.d || aVar.a >= AudioConstants.TRANSCRIPTION_TIMEOUT_MS) {
                this.n = true;
                return 5;
            }
        }
        return 3;
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (this.n && (!this.m || !this.o)))) {
            this.i = -9223372036854775807L;
            return true;
        }
        if (this.i == -9223372036854775807L) {
            return false;
        }
        if (this.l.c() < this.i) {
            return true;
        }
        this.i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z) {
        this.j = z;
        long j = this.c;
        this.i = j > 0 ? this.l.c() + j : -9223372036854775807L;
    }

    public final void d() {
        this.d = true;
        this.g = n6b.N(this.l.c());
        dfb dfbVar = this.b;
        dfbVar.d = true;
        dfbVar.b();
        DisplayManager displayManager = (DisplayManager) dfbVar.b.getSystemService("display");
        dfb.b dVar = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                dVar = Build.VERSION.SDK_INT >= 33 ? new dfb.d(choreographer, displayManager) : new dfb.c(choreographer, displayManager);
            } catch (RuntimeException e) {
                md6.h("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }
        dfbVar.c = dVar;
        if (dVar != null) {
            dVar.a();
        }
        dfbVar.d(false);
    }

    public final void e(int i) {
        if (i == 0) {
            this.e = 1;
        } else if (i == 1) {
            this.e = 0;
        } else {
            if (i != 2) {
                d43.c();
                return;
            }
            this.e = Math.min(this.e, 2);
        }
        this.b.b();
    }

    public final void f(float f) {
        dfb dfbVar = this.b;
        dfbVar.f = f;
        h34 h34Var = dfbVar.a;
        h34Var.a.c();
        h34Var.b.c();
        h34Var.c = false;
        h34Var.d = -9223372036854775807L;
        h34Var.e = 0;
        dfbVar.c();
    }

    public final void g(Surface surface) {
        this.m = surface != null;
        this.n = false;
        dfb dfbVar = this.b;
        if (dfbVar.e != surface) {
            dfbVar.a();
            dfbVar.e = surface;
            dfbVar.d(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void h(float f) {
        xl7.g(f > 0.0f);
        if (f == this.k) {
            return;
        }
        this.k = f;
        dfb dfbVar = this.b;
        dfbVar.i = f;
        dfbVar.d(false);
    }
}
