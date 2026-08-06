package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bo implements in7 {
    public final tx2 a;
    public long b = 9205357640488583168L;
    public final ga3 c;
    public final dt7 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final gw2 i;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: bo$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", f = "AndroidOverscroll.android.kt", l = {788, 792}, m = "invokeSuspend", v = 1)
        public static final class C0032a extends zu8 implements ci4<yg0, r02<? super g2b>, Object> {
            public int u;
            public /* synthetic */ Object v;
            public final /* synthetic */ bo w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0032a(bo boVar, r02<? super C0032a> r02Var) {
                super(2, r02Var);
                this.w = boVar;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C0032a c0032a = new C0032a(this.w, r02Var);
                c0032a.v = obj;
                return c0032a;
            }

            @Override // defpackage.ci4
            public final Object invoke(yg0 yg0Var, r02<? super g2b> r02Var) {
                return ((C0032a) create(yg0Var, r02Var)).invokeSuspend(g2b.a);
            }

            /* JADX WARN: Code duplicated, block: B:25:0x007b  */
            /* JADX WARN: Code duplicated, block: B:28:0x008d A[LOOP:1: B:24:0x0079->B:28:0x008d, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:43:0x0091 A[EDGE_INSN: B:43:0x0091->B:30:0x0091 BREAK  A[LOOP:1: B:24:0x0079->B:28:0x008d], SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:17:0x004f). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.ak0
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    int r0 = r12.u
                    r1 = 2
                    r2 = 0
                    bo r3 = r12.w
                    r4 = 1
                    v72 r5 = defpackage.v72.t
                    if (r0 == 0) goto L25
                    if (r0 == r4) goto L1d
                    if (r0 != r1) goto L17
                    java.lang.Object r0 = r12.v
                    yg0 r0 = (defpackage.yg0) r0
                    defpackage.dv8.b(r13)
                    goto L4f
                L17:
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.aa0.c(r12)
                    return r2
                L1d:
                    java.lang.Object r0 = r12.v
                    yg0 r0 = (defpackage.yg0) r0
                    defpackage.dv8.b(r13)
                    goto L38
                L25:
                    defpackage.dv8.b(r13)
                    java.lang.Object r13 = r12.v
                    r0 = r13
                    yg0 r0 = (defpackage.yg0) r0
                    r12.v = r0
                    r12.u = r4
                    java.lang.Object r13 = defpackage.o8a.b(r0, r12, r1)
                    if (r13 != r5) goto L38
                    goto L4e
                L38:
                    a58 r13 = (defpackage.a58) r13
                    long r6 = r13.a
                    r3.h = r6
                    long r6 = r13.c
                    r3.b = r6
                L42:
                    r12.v = r0
                    r12.u = r1
                    s48 r13 = defpackage.s48.u
                    java.lang.Object r13 = r0.h1(r13, r12)
                    if (r13 != r5) goto L4f
                L4e:
                    return r5
                L4f:
                    r48 r13 = (defpackage.r48) r13
                    java.util.List<a58> r13 = r13.a
                    java.util.ArrayList r4 = new java.util.ArrayList
                    int r6 = r13.size()
                    r4.<init>(r6)
                    int r6 = r13.size()
                    r7 = 0
                    r8 = r7
                L62:
                    if (r8 >= r6) goto L75
                    java.lang.Object r9 = r13.get(r8)
                    r10 = r9
                    a58 r10 = (defpackage.a58) r10
                    boolean r10 = r10.d
                    if (r10 == 0) goto L72
                    r4.add(r9)
                L72:
                    int r8 = r8 + 1
                    goto L62
                L75:
                    int r13 = r4.size()
                L79:
                    if (r7 >= r13) goto L90
                    java.lang.Object r6 = r4.get(r7)
                    r8 = r6
                    a58 r8 = (defpackage.a58) r8
                    long r8 = r8.a
                    long r10 = r3.h
                    boolean r8 = defpackage.zj7.a(r8, r10)
                    if (r8 == 0) goto L8d
                    goto L91
                L8d:
                    int r7 = r7 + 1
                    goto L79
                L90:
                    r6 = r2
                L91:
                    a58 r6 = (defpackage.a58) r6
                    if (r6 != 0) goto L9c
                    java.lang.Object r13 = defpackage.th1.A(r4)
                    r6 = r13
                    a58 r6 = (defpackage.a58) r6
                L9c:
                    if (r6 == 0) goto La6
                    long r7 = r6.a
                    r3.h = r7
                    long r6 = r6.c
                    r3.b = r6
                La6:
                    boolean r13 = r4.isEmpty()
                    if (r13 == 0) goto L42
                    r12 = -1
                    r3.h = r12
                    g2b r12 = defpackage.g2b.a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: bo.a.C0032a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(i58 i58Var, r02<? super g2b> r02Var) {
            Object objB = cc4.b(i58Var, new C0032a(bo.this, null), r02Var);
            return objB == v72.t ? objB : g2b.a;
        }
    }

    public bo(Context context, tx2 tx2Var, long j, go7 go7Var) {
        this.a = tx2Var;
        ga3 ga3Var = new ga3(context, u7d.l(j));
        this.c = ga3Var;
        this.d = new dt7(g2b.a, ha7.u);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        z6a z6aVarA = t6a.a(new a());
        this.i = Build.VERSION.SDK_INT >= 31 ? new b2a(z6aVarA, this, ga3Var) : new jn4(z6aVarA, this, ga3Var, go7Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r0.invokeSuspend(defpackage.g2b.a) == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0139, code lost:
    
        if (r4 == r6) goto L51;
     */
    @Override // defpackage.in7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r18, defpackage.x79 r20, defpackage.u02 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo.a(long, x79, u02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0200  */
    /* JADX WARN: Code duplicated, block: B:102:0x020b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0215  */
    /* JADX WARN: Code duplicated, block: B:105:0x0219  */
    /* JADX WARN: Code duplicated, block: B:108:0x0229  */
    /* JADX WARN: Code duplicated, block: B:110:0x022e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0236  */
    /* JADX WARN: Code duplicated, block: B:113:0x023a  */
    /* JADX WARN: Code duplicated, block: B:115:0x023d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x0243  */
    /* JADX WARN: Code duplicated, block: B:121:0x024b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0286  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:142:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:148:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:155:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:157:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:158:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:164:0x030a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0327  */
    /* JADX WARN: Code duplicated, block: B:173:0x0338  */
    /* JADX WARN: Code duplicated, block: B:174:0x033c  */
    /* JADX WARN: Code duplicated, block: B:180:0x034c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0356  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:64:0x0131 A[PHI: r7
      0x0131: PHI (r7v9 float) = (r7v8 float), (r7v12 float) binds: [B:73:0x015f, B:62:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0134  */
    /* JADX WARN: Code duplicated, block: B:67:0x013c  */
    /* JADX WARN: Code duplicated, block: B:77:0x017d  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f1  */
    @Override // defpackage.in7
    public final long b(long j, int i, m5 m5Var) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fI;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jD;
        long jD2;
        boolean z;
        boolean zF;
        EdgeEffect edgeEffectB;
        float fIntBitsToFloat3;
        in4 in4Var;
        float f;
        EdgeEffect edgeEffectE;
        float fIntBitsToFloat4;
        in4 in4Var2;
        float f2;
        EdgeEffect edgeEffectD;
        float fIntBitsToFloat5;
        in4 in4Var3;
        float f3;
        int i3;
        long j3;
        boolean z2;
        int i4;
        boolean z3;
        if (cr9.e(this.g)) {
            z79 z79Var = (z79) m5Var.u;
            return new vf7(z79Var.c(z79Var.k, j, z79Var.j)).a;
        }
        boolean z4 = this.f;
        boolean z5 = true;
        ga3 ga3Var = this.c;
        if (!z4) {
            if (ga3.g(ga3Var.f)) {
                h(0L);
            }
            if (ga3.g(ga3Var.g)) {
                i(0L);
            }
            if (ga3.g(ga3Var.d)) {
                j(0L);
            }
            if (ga3.g(ga3Var.e)) {
                g(0L);
            }
            this.f = true;
        }
        int i5 = mp.a;
        float f4 = i == 2 ? 4.0f : 1.0f;
        long jF = vf7.f(f4, j);
        int i6 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i6) != 0.0f) {
            if (!ga3.g(ga3Var.d) || Float.intBitsToFloat(i6) >= 0.0f) {
                j2 = 4294967295L;
                if (ga3.g(ga3Var.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    float fG = g(jF);
                    if (!ga3.g(ga3Var.e)) {
                        ga3Var.b().finish();
                    }
                    fIntBitsToFloat = fG == Float.intBitsToFloat((int) (jF & 4294967295L)) ? Float.intBitsToFloat(i6) : fG / f4;
                }
            } else {
                float fJ = j(jF);
                j2 = 4294967295L;
                if (!ga3.g(ga3Var.d)) {
                    ga3Var.e().finish();
                }
                fIntBitsToFloat = fJ == Float.intBitsToFloat((int) (jF & 4294967295L)) ? Float.intBitsToFloat(i6) : fJ / f4;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else if (!ga3.g(ga3Var.f) && Float.intBitsToFloat(i2) < 0.0f) {
                fI = h(jF);
                if (!ga3.g(ga3Var.f)) {
                    ga3Var.c().finish();
                }
                if (fI == Float.intBitsToFloat((int) (jF >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fI / f4;
                }
            } else if (ga3.g(ga3Var.g) || Float.intBitsToFloat(i2) <= 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fI = i(jF);
                if (!ga3.g(ga3Var.g)) {
                    ga3Var.d().finish();
                }
                if (fI == Float.intBitsToFloat((int) (jF >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fI / f4;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!vf7.b(jFloatToRawIntBits, 0L)) {
                f();
            }
            jD = vf7.d(j, jFloatToRawIntBits);
            z79 z79Var2 = (z79) m5Var.u;
            long j4 = new vf7(z79Var2.c(z79Var2.k, jD, z79Var2.j)).a;
            jD2 = vf7.d(jD, j4);
            if ((Float.intBitsToFloat((int) (jD >> 32)) == 0.0f || Float.intBitsToFloat((int) (jD & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j4 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j4 & j2)) != 0.0f) && (ga3.g(ga3Var.f) || ga3.g(ga3Var.d) || ga3.g(ga3Var.g) || ga3.g(ga3Var.e)))) {
                d();
            }
            if (i == 1) {
                i3 = (int) (jD2 >> 32);
                if (Float.intBitsToFloat(i3) > 0.5f) {
                    j3 = jD2;
                    h(j3);
                } else {
                    j3 = jD2;
                    if (Float.intBitsToFloat(i3) < -0.5f) {
                        i(j3);
                    } else {
                        z2 = false;
                    }
                    i4 = (int) (j3 & j2);
                    if (Float.intBitsToFloat(i4) > 1056964608) {
                        j(j3);
                    } else {
                        if (Float.intBitsToFloat(i4) < -1090519040) {
                            g(j3);
                        } else {
                            z3 = false;
                        }
                        if (!z2 || z3) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    z3 = true;
                    if (z2) {
                    }
                    z = true;
                }
                z2 = true;
                i4 = (int) (j3 & j2);
                if (Float.intBitsToFloat(i4) > 1056964608) {
                    j(j3);
                } else {
                    if (Float.intBitsToFloat(i4) < -1090519040) {
                        g(j3);
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                    }
                    z = true;
                }
                z3 = true;
                if (z2) {
                }
                z = true;
            } else {
                z = false;
            }
            if (!vf7.b(jD, 0L)) {
                if (ga3.f(ga3Var.f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zF = false;
                } else {
                    EdgeEffect edgeEffectC = ga3Var.c();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    if (edgeEffectC instanceof in4) {
                        in4 in4Var4 = (in4) edgeEffectC;
                        float f5 = in4Var4.b + fIntBitsToFloat6;
                        in4Var4.b = f5;
                        if (Math.abs(f5) > in4Var4.a) {
                            in4Var4.onRelease();
                        }
                    } else {
                        edgeEffectC.onRelease();
                    }
                    zF = ga3.f(ga3Var.f);
                }
                if (ga3.f(ga3Var.g) && Float.intBitsToFloat(i2) > 0.0f) {
                    edgeEffectD = ga3Var.d();
                    fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                    if (edgeEffectD instanceof in4) {
                        in4Var3 = (in4) edgeEffectD;
                        f3 = in4Var3.b + fIntBitsToFloat5;
                        in4Var3.b = f3;
                        if (Math.abs(f3) > in4Var3.a) {
                            in4Var3.onRelease();
                        }
                    } else {
                        edgeEffectD.onRelease();
                    }
                    if (!zF || ga3.f(ga3Var.g)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (ga3.f(ga3Var.d) && Float.intBitsToFloat(i6) < 0.0f) {
                    edgeEffectE = ga3Var.e();
                    fIntBitsToFloat4 = Float.intBitsToFloat(i6);
                    if (edgeEffectE instanceof in4) {
                        in4Var2 = (in4) edgeEffectE;
                        f2 = in4Var2.b + fIntBitsToFloat4;
                        in4Var2.b = f2;
                        if (Math.abs(f2) > in4Var2.a) {
                            in4Var2.onRelease();
                        }
                    } else {
                        edgeEffectE.onRelease();
                    }
                    if (!zF || ga3.f(ga3Var.d)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (ga3.f(ga3Var.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    edgeEffectB = ga3Var.b();
                    fIntBitsToFloat3 = Float.intBitsToFloat(i6);
                    if (edgeEffectB instanceof in4) {
                        in4Var = (in4) edgeEffectB;
                        f = in4Var.b + fIntBitsToFloat3;
                        in4Var.b = f;
                        if (Math.abs(f) > in4Var.a) {
                            in4Var.onRelease();
                        }
                    } else {
                        edgeEffectB.onRelease();
                    }
                    if (!zF || ga3.f(ga3Var.e)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (!zF && !z) {
                    z5 = false;
                }
                z = z5;
            }
            if (z) {
                f();
            }
            return vf7.e(jFloatToRawIntBits, j4);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (!ga3.g(ga3Var.f)) {
            if (ga3.g(ga3Var.g)) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        } else if (ga3.g(ga3Var.g)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fIntBitsToFloat2 = 0.0f;
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!vf7.b(jFloatToRawIntBits, 0L)) {
            f();
        }
        jD = vf7.d(j, jFloatToRawIntBits);
        z79 z79Var3 = (z79) m5Var.u;
        long j5 = new vf7(z79Var3.c(z79Var3.k, jD, z79Var3.j)).a;
        jD2 = vf7.d(jD, j5);
        if (Float.intBitsToFloat((int) (jD >> 32)) == 0.0f) {
            d();
        } else {
            d();
        }
        if (i == 1) {
            i3 = (int) (jD2 >> 32);
            if (Float.intBitsToFloat(i3) > 0.5f) {
                j3 = jD2;
                h(j3);
            } else {
                j3 = jD2;
                if (Float.intBitsToFloat(i3) < -0.5f) {
                    i(j3);
                } else {
                    z2 = false;
                }
                i4 = (int) (j3 & j2);
                if (Float.intBitsToFloat(i4) > 1056964608) {
                    j(j3);
                } else {
                    if (Float.intBitsToFloat(i4) < -1090519040) {
                        g(j3);
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                    }
                    z = true;
                }
                z3 = true;
                if (z2) {
                }
                z = true;
            }
            z2 = true;
            i4 = (int) (j3 & j2);
            if (Float.intBitsToFloat(i4) > 1056964608) {
                j(j3);
            } else {
                if (Float.intBitsToFloat(i4) < -1090519040) {
                    g(j3);
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                z = true;
            }
            z3 = true;
            if (z2) {
            }
            z = true;
        } else {
            z = false;
        }
        if (!vf7.b(jD, 0L)) {
            if (ga3.f(ga3Var.f)) {
                zF = false;
            } else {
                zF = false;
            }
            if (ga3.f(ga3Var.g)) {
                edgeEffectD = ga3Var.d();
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                if (edgeEffectD instanceof in4) {
                    in4Var3 = (in4) edgeEffectD;
                    f3 = in4Var3.b + fIntBitsToFloat5;
                    in4Var3.b = f3;
                    if (Math.abs(f3) > in4Var3.a) {
                        in4Var3.onRelease();
                    }
                } else {
                    edgeEffectD.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (ga3.f(ga3Var.d)) {
                edgeEffectE = ga3Var.e();
                fIntBitsToFloat4 = Float.intBitsToFloat(i6);
                if (edgeEffectE instanceof in4) {
                    in4Var2 = (in4) edgeEffectE;
                    f2 = in4Var2.b + fIntBitsToFloat4;
                    in4Var2.b = f2;
                    if (Math.abs(f2) > in4Var2.a) {
                        in4Var2.onRelease();
                    }
                } else {
                    edgeEffectE.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (ga3.f(ga3Var.e)) {
                edgeEffectB = ga3Var.b();
                fIntBitsToFloat3 = Float.intBitsToFloat(i6);
                if (edgeEffectB instanceof in4) {
                    in4Var = (in4) edgeEffectB;
                    f = in4Var.b + fIntBitsToFloat3;
                    in4Var.b = f;
                    if (Math.abs(f) > in4Var.a) {
                        in4Var.onRelease();
                    }
                } else {
                    edgeEffectB.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (!zF) {
                z5 = false;
            }
            z = z5;
        }
        if (z) {
            f();
        }
        return vf7.e(jFloatToRawIntBits, j5);
    }

    @Override // defpackage.in7
    public final boolean c() {
        ga3 ga3Var = this.c;
        EdgeEffect edgeEffect = ga3Var.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? ix.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = ga3Var.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? ix.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = ga3Var.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? ix.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = ga3Var.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? ix.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final void d() {
        boolean z;
        ga3 ga3Var = this.c;
        EdgeEffect edgeEffect = ga3Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = ga3Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = ga3Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = ga3Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            f();
        }
    }

    public final long e() {
        long jC = this.b;
        if ((9223372034707292159L & jC) == 9205357640488583168L) {
            jC = p50.c(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jC >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jC & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void f() {
        if (this.e) {
            this.d.setValue(g2b.a);
        }
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.c.b();
        float fC = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fC = ix.c(edgeEffectB, fC, f);
        } else {
            edgeEffectB.onPull(fC, f);
        }
        return (i2 >= 31 ? ix.b(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-fC) : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.c.c();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = ix.c(edgeEffectC, fIntBitsToFloat2, f);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? ix.b(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.c.d();
        float fC = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fC = ix.c(edgeEffectD, fC, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fC, fIntBitsToFloat);
        }
        return (i2 >= 31 ? ix.b(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-fC) : Float.intBitsToFloat(i);
    }

    public final float j(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = ix.c(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? ix.b(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void k(long j) {
        boolean zA = cr9.a(this.g, 0L);
        boolean zA2 = cr9.a(j, this.g);
        this.g = j;
        if (!zA2) {
            int iB = wk6.b(Float.intBitsToFloat((int) (j >> 32)));
            long jB = (((long) wk6.b(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iB) << 32);
            ga3 ga3Var = this.c;
            ga3Var.c = jB;
            EdgeEffect edgeEffect = ga3Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect2 = ga3Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect3 = ga3Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect4 = ga3Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect5 = ga3Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect6 = ga3Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect7 = ga3Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect8 = ga3Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jB), (int) (jB >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        d();
    }

    @Override // defpackage.in7
    public final dw2 q() {
        return this.i;
    }
}
