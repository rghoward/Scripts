package io.intercom.android.sdk.ui.component;

import defpackage.ay8;
import defpackage.bj4;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv0;
import defpackage.dw3;
import defpackage.ei4;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.jl9;
import defpackage.jt1;
import defpackage.jv0;
import defpackage.ov0;
import defpackage.ox6;
import defpackage.po4;
import defpackage.pv0;
import defpackage.pw3;
import defpackage.qt;
import defpackage.ut;
import defpackage.wd3;
import defpackage.xj8;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.ui.component.PulsatingBoxKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PulsatingBoxKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0131  */
    /* JADX WARN: Code duplicated, block: B:104:0x0153  */
    /* JADX WARN: Code duplicated, block: B:107:0x015c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x015e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0197  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x011c  */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x00c9, please report this as an issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: PulsatingBox-FU0evQE, reason: not valid java name */
    public static final void m593PulsatingBoxFU0evQE(ox6 ox6Var, final float f, long j, jl9 jl9Var, boolean z, final ei4<? super jv0, ? super jt1, ? super Integer, g2b> ei4Var, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        long jM751getAction0d7_KjU;
        jl9 jl9Var2;
        boolean z2;
        ei4<? super jv0, ? super jt1, ? super Integer, g2b> ei4Var2;
        int i4;
        ox6 ox6Var3;
        jl9 jl9VarA;
        ox6 ox6Var4;
        final jl9 jl9Var3;
        final long j2;
        final boolean z3;
        Object objF;
        jt1.a.C0187a c0187a;
        final qt qtVar;
        boolean zJ;
        Object objF2;
        final boolean z4;
        final jl9 jl9Var4;
        final long j3;
        xj8 xj8VarW;
        ei4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-63498318);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.g(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            jM751getAction0d7_KjU = j;
            i3 |= ((i2 & 4) == 0 && bj4VarO.i(jM751getAction0d7_KjU)) ? 256 : 128;
        } else {
            jM751getAction0d7_KjU = j;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                jl9Var2 = jl9Var;
                int i6 = bj4VarO.J(jl9Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
                i3 |= i6;
            } else {
                jl9Var2 = jl9Var;
            }
            i3 |= i6;
        } else {
            jl9Var2 = jl9Var;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                i3 |= bj4VarO.c(z2) ? 16384 : 8192;
            }
            if ((i2 & 32) != 0) {
                if ((i & 196608) == 0) {
                    ei4Var2 = ei4Var;
                    if (bj4VarO.j(ei4Var2)) {
                        i4 = 131072;
                    } else {
                        i4 = 65536;
                    }
                    i3 |= i4;
                }
                if ((74899 & i3) == 74898 || !bj4VarO.r()) {
                    bj4VarO.v0();
                    if ((i & 1) != 0 || bj4VarO.c0()) {
                        if (i5 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if ((i2 & 4) != 0) {
                            jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jl9VarA = ay8.a(50);
                            i3 &= -7169;
                        } else {
                            jl9VarA = jl9Var2;
                        }
                        if (i7 != 0) {
                            ox6Var4 = ox6Var3;
                            jl9Var3 = jl9VarA;
                            j2 = jM751getAction0d7_KjU;
                            z3 = true;
                        } else {
                            ox6Var4 = ox6Var3;
                            jl9Var3 = jl9VarA;
                        }
                        bj4VarO.V();
                        bj4VarO.K(-1108114118);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = ut.a(1.0f);
                            bj4VarO.C(objF);
                        }
                        qtVar = (qt) objF;
                        bj4VarO.U(false);
                        Float fValueOf = Float.valueOf(f);
                        bj4VarO.K(-1108111889);
                        zJ = bj4VarO.j(qtVar) | ((i3 & 112) == 32);
                        objF2 = bj4VarO.f();
                        if (zJ || objF2 == c0187a) {
                            objF2 = new PulsatingBoxKt$PulsatingBox$1$1(qtVar, f, null);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        wd3.d(bj4VarO, (ci4) objF2, fValueOf);
                        final ei4<? super jv0, ? super jt1, ? super Integer, g2b> ei4Var3 = ei4Var2;
                        ov0.a(ox6Var4, di.a.e, false, gr1.b(526284572, new ei4<pv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                            public final void invoke(pv0 pv0Var, jt1 jt1Var2, int i8) {
                                pv0Var.getClass();
                                if ((i8 & 6) == 0) {
                                    i8 |= jt1Var2.J(pv0Var) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                jt1Var2.K(1154915079);
                                if (z3) {
                                    ox6 ox6VarK = ir9.k(pv0Var.d(), pv0Var.i(), ox6.a.t);
                                    float fFloatValue = qtVar.d().floatValue();
                                    if (fFloatValue != 1.0f || fFloatValue != 1.0f) {
                                        ox6VarK = po4.c(ox6VarK, fFloatValue, fFloatValue, 0.0f, 0.0f, null, 524284);
                                    }
                                    dv0.a(pv0Var.f(gi0.c(pw3.c(ox6VarK, 2.0f, jl9Var3, 0L, 0L, 28), j2, jl9Var3), di.a.e), jt1Var2, 0);
                                }
                                jt1Var2.B();
                                ei4Var3.invoke(pv0Var, jt1Var2, Integer.valueOf(i8 & 14));
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(pv0 pv0Var, jt1 jt1Var2, Integer num) {
                                invoke(pv0Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), bj4VarO, (i3 & 14) | 3120, 4);
                        z4 = z3;
                        ox6Var2 = ox6Var4;
                        jl9Var4 = jl9Var3;
                        j3 = j2;
                    } else {
                        bj4VarO.u();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        ox6Var4 = ox6Var2;
                        jl9Var3 = jl9Var2;
                    }
                    j2 = jM751getAction0d7_KjU;
                    z3 = z2;
                    bj4VarO.V();
                    bj4VarO.K(-1108114118);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = ut.a(1.0f);
                        bj4VarO.C(objF);
                    }
                    qtVar = (qt) objF;
                    bj4VarO.U(false);
                    Float fValueOf2 = Float.valueOf(f);
                    bj4VarO.K(-1108111889);
                    zJ = bj4VarO.j(qtVar) | ((i3 & 112) == 32);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new PulsatingBoxKt$PulsatingBox$1$1(qtVar, f, null);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new PulsatingBoxKt$PulsatingBox$1$1(qtVar, f, null);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    wd3.d(bj4VarO, (ci4) objF2, fValueOf2);
                    final ei4<? super jv0, ? super jt1, ? super Integer, g2b> ei4Var4 = ei4Var2;
                    ov0.a(ox6Var4, di.a.e, false, gr1.b(526284572, new ei4<pv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                        public final void invoke(pv0 pv0Var, jt1 jt1Var2, int i8) {
                            pv0Var.getClass();
                            if ((i8 & 6) == 0) {
                                i8 |= jt1Var2.J(pv0Var) ? 4 : 2;
                            }
                            if ((i8 & 19) == 18 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            jt1Var2.K(1154915079);
                            if (z3) {
                                ox6 ox6VarK = ir9.k(pv0Var.d(), pv0Var.i(), ox6.a.t);
                                float fFloatValue = qtVar.d().floatValue();
                                if (fFloatValue != 1.0f || fFloatValue != 1.0f) {
                                    ox6VarK = po4.c(ox6VarK, fFloatValue, fFloatValue, 0.0f, 0.0f, null, 524284);
                                }
                                dv0.a(pv0Var.f(gi0.c(pw3.c(ox6VarK, 2.0f, jl9Var3, 0L, 0L, 28), j2, jl9Var3), di.a.e), jt1Var2, 0);
                            }
                            jt1Var2.B();
                            ei4Var4.invoke(pv0Var, jt1Var2, Integer.valueOf(i8 & 14));
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(pv0 pv0Var, jt1 jt1Var2, Integer num) {
                            invoke(pv0Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, (i3 & 14) | 3120, 4);
                    z4 = z3;
                    ox6Var2 = ox6Var4;
                    jl9Var4 = jl9Var3;
                    j3 = j2;
                } else {
                    bj4VarO.u();
                    jl9Var4 = jl9Var2;
                    j3 = jM751getAction0d7_KjU;
                    z4 = z2;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: xf8
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return PulsatingBoxKt.PulsatingBox_FU0evQE$lambda$2(ox6Var2, f, j3, jl9Var4, z4, ei4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            ei4Var2 = ei4Var;
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jl9VarA = ay8.a(50);
                        i3 &= -7169;
                    } else {
                        jl9VarA = jl9Var2;
                    }
                    if (i7 != 0) {
                        ox6Var4 = ox6Var3;
                        jl9Var3 = jl9VarA;
                        j2 = jM751getAction0d7_KjU;
                        z3 = true;
                    } else {
                        ox6Var4 = ox6Var3;
                        jl9Var3 = jl9VarA;
                        j2 = jM751getAction0d7_KjU;
                        z3 = z2;
                    }
                } else {
                    if (i5 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jl9VarA = ay8.a(50);
                        i3 &= -7169;
                    } else {
                        jl9VarA = jl9Var2;
                    }
                    if (i7 != 0) {
                        ox6Var4 = ox6Var3;
                        jl9Var3 = jl9VarA;
                        j2 = jM751getAction0d7_KjU;
                        z3 = true;
                    } else {
                        ox6Var4 = ox6Var3;
                        jl9Var3 = jl9VarA;
                        j2 = jM751getAction0d7_KjU;
                        z3 = z2;
                    }
                }
                bj4VarO.V();
                bj4VarO.K(-1108114118);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = ut.a(1.0f);
                    bj4VarO.C(objF);
                }
                qtVar = (qt) objF;
                bj4VarO.U(false);
                Float fValueOf3 = Float.valueOf(f);
                bj4VarO.K(-1108111889);
                zJ = bj4VarO.j(qtVar) | ((i3 & 112) == 32);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new PulsatingBoxKt$PulsatingBox$1$1(qtVar, f, null);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new PulsatingBoxKt$PulsatingBox$1$1(qtVar, f, null);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF2, fValueOf3);
                final ei4<? super jv0, ? super jt1, ? super Integer, g2b> ei4Var5 = ei4Var2;
                ov0.a(ox6Var4, di.a.e, false, gr1.b(526284572, new ei4<pv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                    public final void invoke(pv0 pv0Var, jt1 jt1Var2, int i8) {
                        pv0Var.getClass();
                        if ((i8 & 6) == 0) {
                            i8 |= jt1Var2.J(pv0Var) ? 4 : 2;
                        }
                        if ((i8 & 19) == 18 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        jt1Var2.K(1154915079);
                        if (z3) {
                            ox6 ox6VarK = ir9.k(pv0Var.d(), pv0Var.i(), ox6.a.t);
                            float fFloatValue = qtVar.d().floatValue();
                            if (fFloatValue != 1.0f || fFloatValue != 1.0f) {
                                ox6VarK = po4.c(ox6VarK, fFloatValue, fFloatValue, 0.0f, 0.0f, null, 524284);
                            }
                            dv0.a(pv0Var.f(gi0.c(pw3.c(ox6VarK, 2.0f, jl9Var3, 0L, 0L, 28), j2, jl9Var3), di.a.e), jt1Var2, 0);
                        }
                        jt1Var2.B();
                        ei4Var5.invoke(pv0Var, jt1Var2, Integer.valueOf(i8 & 14));
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(pv0 pv0Var, jt1 jt1Var2, Integer num) {
                        invoke(pv0Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, (i3 & 14) | 3120, 4);
                z4 = z3;
                ox6Var2 = ox6Var4;
                jl9Var4 = jl9Var3;
                j3 = j2;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jl9VarA = ay8.a(50);
                        i3 &= -7169;
                    } else {
                        jl9VarA = jl9Var2;
                    }
                    if (i7 != 0) {
                        ox6Var4 = ox6Var3;
                        jl9Var3 = jl9VarA;
                        j2 = jM751getAction0d7_KjU;
                        z3 = true;
                    } else {
                        ox6Var4 = ox6Var3;
                        jl9Var3 = jl9VarA;
                        j2 = jM751getAction0d7_KjU;
                        z3 = z2;
                    }
                } else {
                    if (i5 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jl9VarA = ay8.a(50);
                        i3 &= -7169;
                    } else {
                        jl9VarA = jl9Var2;
                    }
                    if (i7 != 0) {
                        ox6Var4 = ox6Var3;
                        jl9Var3 = jl9VarA;
                        j2 = jM751getAction0d7_KjU;
                        z3 = true;
                    } else {
                        ox6Var4 = ox6Var3;
                        jl9Var3 = jl9VarA;
                        j2 = jM751getAction0d7_KjU;
                        z3 = z2;
                    }
                }
                bj4VarO.V();
                bj4VarO.K(-1108114118);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = ut.a(1.0f);
                    bj4VarO.C(objF);
                }
                qtVar = (qt) objF;
                bj4VarO.U(false);
                Float fValueOf4 = Float.valueOf(f);
                bj4VarO.K(-1108111889);
                zJ = bj4VarO.j(qtVar) | ((i3 & 112) == 32);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new PulsatingBoxKt$PulsatingBox$1$1(qtVar, f, null);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new PulsatingBoxKt$PulsatingBox$1$1(qtVar, f, null);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF2, fValueOf4);
                final ei4<? super jv0, ? super jt1, ? super Integer, g2b> ei4Var6 = ei4Var2;
                ov0.a(ox6Var4, di.a.e, false, gr1.b(526284572, new ei4<pv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                    public final void invoke(pv0 pv0Var, jt1 jt1Var2, int i8) {
                        pv0Var.getClass();
                        if ((i8 & 6) == 0) {
                            i8 |= jt1Var2.J(pv0Var) ? 4 : 2;
                        }
                        if ((i8 & 19) == 18 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        jt1Var2.K(1154915079);
                        if (z3) {
                            ox6 ox6VarK = ir9.k(pv0Var.d(), pv0Var.i(), ox6.a.t);
                            float fFloatValue = qtVar.d().floatValue();
                            if (fFloatValue != 1.0f || fFloatValue != 1.0f) {
                                ox6VarK = po4.c(ox6VarK, fFloatValue, fFloatValue, 0.0f, 0.0f, null, 524284);
                            }
                            dv0.a(pv0Var.f(gi0.c(pw3.c(ox6VarK, 2.0f, jl9Var3, 0L, 0L, 28), j2, jl9Var3), di.a.e), jt1Var2, 0);
                        }
                        jt1Var2.B();
                        ei4Var6.invoke(pv0Var, jt1Var2, Integer.valueOf(i8 & 14));
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(pv0 pv0Var, jt1 jt1Var2, Integer num) {
                        invoke(pv0Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, (i3 & 14) | 3120, 4);
                z4 = z3;
                ox6Var2 = ox6Var4;
                jl9Var4 = jl9Var3;
                j3 = j2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: xf8
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PulsatingBoxKt.PulsatingBox_FU0evQE$lambda$2(ox6Var2, f, j3, jl9Var4, z4, ei4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        z2 = z;
        if ((i2 & 32) != 0) {
            if ((i & 196608) == 0) {
                ei4Var2 = ei4Var;
                if (bj4VarO.j(ei4Var2)) {
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                i3 |= i4;
            }
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jl9VarA = ay8.a(50);
                        i3 &= -7169;
                    } else {
                        jl9VarA = jl9Var2;
                    }
                    if (i7 != 0) {
                        ox6Var4 = ox6Var3;
                        jl9Var3 = jl9VarA;
                        j2 = jM751getAction0d7_KjU;
                        z3 = true;
                    } else {
                        ox6Var4 = ox6Var3;
                        jl9Var3 = jl9VarA;
                        j2 = jM751getAction0d7_KjU;
                        z3 = z2;
                    }
                } else {
                    if (i5 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jl9VarA = ay8.a(50);
                        i3 &= -7169;
                    } else {
                        jl9VarA = jl9Var2;
                    }
                    if (i7 != 0) {
                        ox6Var4 = ox6Var3;
                        jl9Var3 = jl9VarA;
                        j2 = jM751getAction0d7_KjU;
                        z3 = true;
                    } else {
                        ox6Var4 = ox6Var3;
                        jl9Var3 = jl9VarA;
                        j2 = jM751getAction0d7_KjU;
                        z3 = z2;
                    }
                }
                bj4VarO.V();
                bj4VarO.K(-1108114118);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = ut.a(1.0f);
                    bj4VarO.C(objF);
                }
                qtVar = (qt) objF;
                bj4VarO.U(false);
                Float fValueOf5 = Float.valueOf(f);
                bj4VarO.K(-1108111889);
                zJ = bj4VarO.j(qtVar) | ((i3 & 112) == 32);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new PulsatingBoxKt$PulsatingBox$1$1(qtVar, f, null);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new PulsatingBoxKt$PulsatingBox$1$1(qtVar, f, null);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF2, fValueOf5);
                final ei4<? super jv0, ? super jt1, ? super Integer, g2b> ei4Var7 = ei4Var2;
                ov0.a(ox6Var4, di.a.e, false, gr1.b(526284572, new ei4<pv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                    public final void invoke(pv0 pv0Var, jt1 jt1Var2, int i8) {
                        pv0Var.getClass();
                        if ((i8 & 6) == 0) {
                            i8 |= jt1Var2.J(pv0Var) ? 4 : 2;
                        }
                        if ((i8 & 19) == 18 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        jt1Var2.K(1154915079);
                        if (z3) {
                            ox6 ox6VarK = ir9.k(pv0Var.d(), pv0Var.i(), ox6.a.t);
                            float fFloatValue = qtVar.d().floatValue();
                            if (fFloatValue != 1.0f || fFloatValue != 1.0f) {
                                ox6VarK = po4.c(ox6VarK, fFloatValue, fFloatValue, 0.0f, 0.0f, null, 524284);
                            }
                            dv0.a(pv0Var.f(gi0.c(pw3.c(ox6VarK, 2.0f, jl9Var3, 0L, 0L, 28), j2, jl9Var3), di.a.e), jt1Var2, 0);
                        }
                        jt1Var2.B();
                        ei4Var7.invoke(pv0Var, jt1Var2, Integer.valueOf(i8 & 14));
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(pv0 pv0Var, jt1 jt1Var2, Integer num) {
                        invoke(pv0Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, (i3 & 14) | 3120, 4);
                z4 = z3;
                ox6Var2 = ox6Var4;
                jl9Var4 = jl9Var3;
                j3 = j2;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jl9VarA = ay8.a(50);
                        i3 &= -7169;
                    } else {
                        jl9VarA = jl9Var2;
                    }
                    if (i7 != 0) {
                        ox6Var4 = ox6Var3;
                        jl9Var3 = jl9VarA;
                        j2 = jM751getAction0d7_KjU;
                        z3 = true;
                    } else {
                        ox6Var4 = ox6Var3;
                        jl9Var3 = jl9VarA;
                        j2 = jM751getAction0d7_KjU;
                        z3 = z2;
                    }
                } else {
                    if (i5 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        jl9VarA = ay8.a(50);
                        i3 &= -7169;
                    } else {
                        jl9VarA = jl9Var2;
                    }
                    if (i7 != 0) {
                        ox6Var4 = ox6Var3;
                        jl9Var3 = jl9VarA;
                        j2 = jM751getAction0d7_KjU;
                        z3 = true;
                    } else {
                        ox6Var4 = ox6Var3;
                        jl9Var3 = jl9VarA;
                        j2 = jM751getAction0d7_KjU;
                        z3 = z2;
                    }
                }
                bj4VarO.V();
                bj4VarO.K(-1108114118);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = ut.a(1.0f);
                    bj4VarO.C(objF);
                }
                qtVar = (qt) objF;
                bj4VarO.U(false);
                Float fValueOf6 = Float.valueOf(f);
                bj4VarO.K(-1108111889);
                zJ = bj4VarO.j(qtVar) | ((i3 & 112) == 32);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new PulsatingBoxKt$PulsatingBox$1$1(qtVar, f, null);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new PulsatingBoxKt$PulsatingBox$1$1(qtVar, f, null);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF2, fValueOf6);
                final ei4<? super jv0, ? super jt1, ? super Integer, g2b> ei4Var8 = ei4Var2;
                ov0.a(ox6Var4, di.a.e, false, gr1.b(526284572, new ei4<pv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                    public final void invoke(pv0 pv0Var, jt1 jt1Var2, int i8) {
                        pv0Var.getClass();
                        if ((i8 & 6) == 0) {
                            i8 |= jt1Var2.J(pv0Var) ? 4 : 2;
                        }
                        if ((i8 & 19) == 18 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        jt1Var2.K(1154915079);
                        if (z3) {
                            ox6 ox6VarK = ir9.k(pv0Var.d(), pv0Var.i(), ox6.a.t);
                            float fFloatValue = qtVar.d().floatValue();
                            if (fFloatValue != 1.0f || fFloatValue != 1.0f) {
                                ox6VarK = po4.c(ox6VarK, fFloatValue, fFloatValue, 0.0f, 0.0f, null, 524284);
                            }
                            dv0.a(pv0Var.f(gi0.c(pw3.c(ox6VarK, 2.0f, jl9Var3, 0L, 0L, 28), j2, jl9Var3), di.a.e), jt1Var2, 0);
                        }
                        jt1Var2.B();
                        ei4Var8.invoke(pv0Var, jt1Var2, Integer.valueOf(i8 & 14));
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(pv0 pv0Var, jt1 jt1Var2, Integer num) {
                        invoke(pv0Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, (i3 & 14) | 3120, 4);
                z4 = z3;
                ox6Var2 = ox6Var4;
                jl9Var4 = jl9Var3;
                j3 = j2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: xf8
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PulsatingBoxKt.PulsatingBox_FU0evQE$lambda$2(ox6Var2, f, j3, jl9Var4, z4, ei4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 196608;
        ei4Var2 = ei4Var;
        if ((74899 & i3) == 74898) {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 4) != 0) {
                    jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jl9VarA = ay8.a(50);
                    i3 &= -7169;
                } else {
                    jl9VarA = jl9Var2;
                }
                if (i7 != 0) {
                    ox6Var4 = ox6Var3;
                    jl9Var3 = jl9VarA;
                    j2 = jM751getAction0d7_KjU;
                    z3 = true;
                } else {
                    ox6Var4 = ox6Var3;
                    jl9Var3 = jl9VarA;
                    j2 = jM751getAction0d7_KjU;
                    z3 = z2;
                }
            } else {
                if (i5 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 4) != 0) {
                    jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jl9VarA = ay8.a(50);
                    i3 &= -7169;
                } else {
                    jl9VarA = jl9Var2;
                }
                if (i7 != 0) {
                    ox6Var4 = ox6Var3;
                    jl9Var3 = jl9VarA;
                    j2 = jM751getAction0d7_KjU;
                    z3 = true;
                } else {
                    ox6Var4 = ox6Var3;
                    jl9Var3 = jl9VarA;
                    j2 = jM751getAction0d7_KjU;
                    z3 = z2;
                }
            }
            bj4VarO.V();
            bj4VarO.K(-1108114118);
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = ut.a(1.0f);
                bj4VarO.C(objF);
            }
            qtVar = (qt) objF;
            bj4VarO.U(false);
            Float fValueOf7 = Float.valueOf(f);
            bj4VarO.K(-1108111889);
            zJ = bj4VarO.j(qtVar) | ((i3 & 112) == 32);
            objF2 = bj4VarO.f();
            if (zJ) {
                objF2 = new PulsatingBoxKt$PulsatingBox$1$1(qtVar, f, null);
                bj4VarO.C(objF2);
            } else {
                objF2 = new PulsatingBoxKt$PulsatingBox$1$1(qtVar, f, null);
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            wd3.d(bj4VarO, (ci4) objF2, fValueOf7);
            final ei4<? super jv0, ? super jt1, ? super Integer, g2b> ei4Var9 = ei4Var2;
            ov0.a(ox6Var4, di.a.e, false, gr1.b(526284572, new ei4<pv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                public final void invoke(pv0 pv0Var, jt1 jt1Var2, int i8) {
                    pv0Var.getClass();
                    if ((i8 & 6) == 0) {
                        i8 |= jt1Var2.J(pv0Var) ? 4 : 2;
                    }
                    if ((i8 & 19) == 18 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    jt1Var2.K(1154915079);
                    if (z3) {
                        ox6 ox6VarK = ir9.k(pv0Var.d(), pv0Var.i(), ox6.a.t);
                        float fFloatValue = qtVar.d().floatValue();
                        if (fFloatValue != 1.0f || fFloatValue != 1.0f) {
                            ox6VarK = po4.c(ox6VarK, fFloatValue, fFloatValue, 0.0f, 0.0f, null, 524284);
                        }
                        dv0.a(pv0Var.f(gi0.c(pw3.c(ox6VarK, 2.0f, jl9Var3, 0L, 0L, 28), j2, jl9Var3), di.a.e), jt1Var2, 0);
                    }
                    jt1Var2.B();
                    ei4Var9.invoke(pv0Var, jt1Var2, Integer.valueOf(i8 & 14));
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(pv0 pv0Var, jt1 jt1Var2, Integer num) {
                    invoke(pv0Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, (i3 & 14) | 3120, 4);
            z4 = z3;
            ox6Var2 = ox6Var4;
            jl9Var4 = jl9Var3;
            j3 = j2;
        } else {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 4) != 0) {
                    jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jl9VarA = ay8.a(50);
                    i3 &= -7169;
                } else {
                    jl9VarA = jl9Var2;
                }
                if (i7 != 0) {
                    ox6Var4 = ox6Var3;
                    jl9Var3 = jl9VarA;
                    j2 = jM751getAction0d7_KjU;
                    z3 = true;
                } else {
                    ox6Var4 = ox6Var3;
                    jl9Var3 = jl9VarA;
                    j2 = jM751getAction0d7_KjU;
                    z3 = z2;
                }
            } else {
                if (i5 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 4) != 0) {
                    jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jl9VarA = ay8.a(50);
                    i3 &= -7169;
                } else {
                    jl9VarA = jl9Var2;
                }
                if (i7 != 0) {
                    ox6Var4 = ox6Var3;
                    jl9Var3 = jl9VarA;
                    j2 = jM751getAction0d7_KjU;
                    z3 = true;
                } else {
                    ox6Var4 = ox6Var3;
                    jl9Var3 = jl9VarA;
                    j2 = jM751getAction0d7_KjU;
                    z3 = z2;
                }
            }
            bj4VarO.V();
            bj4VarO.K(-1108114118);
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = ut.a(1.0f);
                bj4VarO.C(objF);
            }
            qtVar = (qt) objF;
            bj4VarO.U(false);
            Float fValueOf8 = Float.valueOf(f);
            bj4VarO.K(-1108111889);
            zJ = bj4VarO.j(qtVar) | ((i3 & 112) == 32);
            objF2 = bj4VarO.f();
            if (zJ) {
                objF2 = new PulsatingBoxKt$PulsatingBox$1$1(qtVar, f, null);
                bj4VarO.C(objF2);
            } else {
                objF2 = new PulsatingBoxKt$PulsatingBox$1$1(qtVar, f, null);
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            wd3.d(bj4VarO, (ci4) objF2, fValueOf8);
            final ei4<? super jv0, ? super jt1, ? super Integer, g2b> ei4Var10 = ei4Var2;
            ov0.a(ox6Var4, di.a.e, false, gr1.b(526284572, new ei4<pv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                public final void invoke(pv0 pv0Var, jt1 jt1Var2, int i8) {
                    pv0Var.getClass();
                    if ((i8 & 6) == 0) {
                        i8 |= jt1Var2.J(pv0Var) ? 4 : 2;
                    }
                    if ((i8 & 19) == 18 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    jt1Var2.K(1154915079);
                    if (z3) {
                        ox6 ox6VarK = ir9.k(pv0Var.d(), pv0Var.i(), ox6.a.t);
                        float fFloatValue = qtVar.d().floatValue();
                        if (fFloatValue != 1.0f || fFloatValue != 1.0f) {
                            ox6VarK = po4.c(ox6VarK, fFloatValue, fFloatValue, 0.0f, 0.0f, null, 524284);
                        }
                        dv0.a(pv0Var.f(gi0.c(pw3.c(ox6VarK, 2.0f, jl9Var3, 0L, 0L, 28), j2, jl9Var3), di.a.e), jt1Var2, 0);
                    }
                    jt1Var2.B();
                    ei4Var10.invoke(pv0Var, jt1Var2, Integer.valueOf(i8 & 14));
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(pv0 pv0Var, jt1 jt1Var2, Integer num) {
                    invoke(pv0Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, (i3 & 14) | 3120, 4);
            z4 = z3;
            ox6Var2 = ox6Var4;
            jl9Var4 = jl9Var3;
            j3 = j2;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: xf8
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PulsatingBoxKt.PulsatingBox_FU0evQE$lambda$2(ox6Var2, f, j3, jl9Var4, z4, ei4Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    private static final void PulsatingBoxPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-2057763747);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PulsatingBoxKt.INSTANCE.m568getLambda2$intercom_sdk_ui_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new dw3(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PulsatingBoxPreview$lambda$3(int i, jt1 jt1Var, int i2) {
        PulsatingBoxPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PulsatingBox_FU0evQE$lambda$2(ox6 ox6Var, float f, long j, jl9 jl9Var, boolean z, ei4 ei4Var, int i, int i2, jt1 jt1Var, int i3) {
        m593PulsatingBoxFU0evQE(ox6Var, f, j, jl9Var, z, ei4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
