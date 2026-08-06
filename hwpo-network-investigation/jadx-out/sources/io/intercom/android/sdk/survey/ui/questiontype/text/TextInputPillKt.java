package io.intercom.android.sdk.survey.ui.questiontype.text;

import com.intercom.twig.BuildConfig;
import defpackage.aa0;
import defpackage.ac4;
import defpackage.ap5;
import defpackage.b72;
import defpackage.bj4;
import defpackage.bp5;
import defpackage.c33;
import defpackage.ci4;
import defpackage.dp5;
import defpackage.eo7;
import defpackage.fi1;
import defpackage.fw0;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.hi1;
import defpackage.ifa;
import defpackage.ir9;
import defpackage.is7;
import defpackage.jt1;
import defpackage.jw0;
import defpackage.kw0;
import defpackage.m65;
import defpackage.m78;
import defpackage.mia;
import defpackage.ns0;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.oy0;
import defpackage.p84;
import defpackage.pda;
import defpackage.qja;
import defpackage.rja;
import defpackage.t05;
import defpackage.t72;
import defpackage.u05;
import defpackage.uh1;
import defpackage.uma;
import defpackage.v94;
import defpackage.w05;
import defpackage.w62;
import defpackage.wd3;
import defpackage.xda;
import defpackage.xj8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TextInputPillKt {
    /* JADX WARN: Code duplicated, block: B:101:0x012c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0130  */
    /* JADX WARN: Code duplicated, block: B:105:0x013a  */
    /* JADX WARN: Code duplicated, block: B:106:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0145  */
    /* JADX WARN: Code duplicated, block: B:111:0x014e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0152  */
    /* JADX WARN: Code duplicated, block: B:115:0x015c  */
    /* JADX WARN: Code duplicated, block: B:116:0x015f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0164  */
    /* JADX WARN: Code duplicated, block: B:121:0x016e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0175  */
    /* JADX WARN: Code duplicated, block: B:125:0x0179  */
    /* JADX WARN: Code duplicated, block: B:127:0x0183  */
    /* JADX WARN: Code duplicated, block: B:128:0x0186  */
    /* JADX WARN: Code duplicated, block: B:130:0x018b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0196  */
    /* JADX WARN: Code duplicated, block: B:134:0x0199  */
    /* JADX WARN: Code duplicated, block: B:136:0x019f  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:139:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:146:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:150:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:161:0x0207  */
    /* JADX WARN: Code duplicated, block: B:163:0x020b  */
    /* JADX WARN: Code duplicated, block: B:166:0x020f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0213  */
    /* JADX WARN: Code duplicated, block: B:170:0x0216  */
    /* JADX WARN: Code duplicated, block: B:171:0x021c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0221  */
    /* JADX WARN: Code duplicated, block: B:177:0x0226  */
    /* JADX WARN: Code duplicated, block: B:179:0x0232  */
    /* JADX WARN: Code duplicated, block: B:182:0x0242  */
    /* JADX WARN: Code duplicated, block: B:183:0x0244  */
    /* JADX WARN: Code duplicated, block: B:185:0x0248  */
    /* JADX WARN: Code duplicated, block: B:186:0x024a  */
    /* JADX WARN: Code duplicated, block: B:188:0x024e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0251  */
    /* JADX WARN: Code duplicated, block: B:191:0x0255  */
    /* JADX WARN: Code duplicated, block: B:192:0x0258  */
    /* JADX WARN: Code duplicated, block: B:194:0x025c  */
    /* JADX WARN: Code duplicated, block: B:195:0x025f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0263  */
    /* JADX WARN: Code duplicated, block: B:198:0x0266  */
    /* JADX WARN: Code duplicated, block: B:201:0x0270  */
    /* JADX WARN: Code duplicated, block: B:202:0x028a  */
    /* JADX WARN: Code duplicated, block: B:205:0x029a  */
    /* JADX WARN: Code duplicated, block: B:208:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:211:0x0305 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x0307  */
    /* JADX WARN: Code duplicated, block: B:216:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x0103  */
    /* JADX WARN: Code duplicated, block: B:90:0x010a  */
    /* JADX WARN: Code duplicated, block: B:92:0x010e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x011b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0125  */
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
    /* JADX INFO: renamed from: TextInputPill-g5ZjG94, reason: not valid java name */
    public static final void m507TextInputPillg5ZjG94(String str, String str2, final oh4<? super String, g2b> oh4Var, uh1 uh1Var, final long j, int i, boolean z, oh4<? super ap5, g2b> oh4Var2, int i2, int i3, boolean z2, ci4<? super jt1, ? super Integer, g2b> ci4Var, boolean z3, float f, jt1 jt1Var, final int i4, final int i5, final int i6) {
        String str3;
        int i7;
        int i8;
        int i9;
        uh1 uh1Var2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z4;
        int i16;
        int i17;
        oh4<? super ap5, g2b> oh4Var3;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        final String str4;
        int i36;
        jt1.a.C0187a c0187a;
        int i37;
        int i38;
        boolean z5;
        ci4<? super jt1, ? super Integer, g2b> ci4Var2;
        boolean z6;
        float f2;
        long jB;
        Object objB;
        fw0 fw0Var;
        Object objF;
        t72 t72Var;
        boolean zJ;
        Object objF2;
        bj4 bj4Var;
        final oh4<? super ap5, g2b> oh4Var4;
        final uh1 uh1Var3;
        final boolean z7;
        final ci4<? super jt1, ? super Integer, g2b> ci4Var3;
        final boolean z8;
        final int i39;
        final int i40;
        final boolean z9;
        final float f3;
        final String str5;
        final int i41;
        final String str6;
        Object objF3;
        xj8 xj8VarW;
        oh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(701760197);
        int i42 = i6 & 1;
        if (i42 != 0) {
            i7 = i4 | 6;
            str3 = str;
        } else if ((i4 & 6) == 0) {
            str3 = str;
            i7 = (bj4VarO.J(str3) ? 4 : 2) | i4;
        } else {
            str3 = str;
            i7 = i4;
        }
        int i43 = i6 & 2;
        if (i43 == 0) {
            if ((i4 & 48) == 0) {
                i7 |= bj4VarO.J(str2) ? 32 : 16;
            }
            if ((i6 & 4) != 0) {
                if ((i4 & 384) == 0) {
                    if (bj4VarO.j(oh4Var)) {
                        i8 = 256;
                    } else {
                        i8 = 128;
                    }
                    i7 |= i8;
                }
                i9 = i6 & 8;
                if (i9 != 0) {
                    if ((i4 & 3072) == 0) {
                        uh1Var2 = uh1Var;
                        if (bj4VarO.J(uh1Var2)) {
                            i10 = 2048;
                        } else {
                            i10 = 1024;
                        }
                        i7 |= i10;
                    }
                    if ((i6 & 16) != 0) {
                        i7 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        if (bj4VarO.i(j)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i7 |= i11;
                    }
                    i12 = i6 & 32;
                    if (i12 != 0) {
                        i7 |= 196608;
                        i13 = i;
                    } else {
                        i13 = i;
                        if ((i4 & 196608) == 0) {
                            if (bj4VarO.h(i13)) {
                                i14 = 131072;
                            } else {
                                i14 = 65536;
                            }
                            i7 |= i14;
                        }
                    }
                    i15 = i6 & 64;
                    if (i15 != 0) {
                        i7 |= 1572864;
                        z4 = z;
                    } else {
                        z4 = z;
                        if ((i4 & 1572864) == 0) {
                            if (bj4VarO.c(z4)) {
                                i16 = 1048576;
                            } else {
                                i16 = 524288;
                            }
                            i7 |= i16;
                        }
                    }
                    i17 = i6 & 128;
                    if (i17 != 0) {
                        i7 |= 12582912;
                        oh4Var3 = oh4Var2;
                    } else {
                        oh4Var3 = oh4Var2;
                        if ((i4 & 12582912) == 0) {
                            if (bj4VarO.j(oh4Var3)) {
                                i18 = 8388608;
                            } else {
                                i18 = 4194304;
                            }
                            i7 |= i18;
                        }
                    }
                    i19 = i6 & 256;
                    if (i19 != 0) {
                        if ((i4 & 100663296) == 0) {
                            if (bj4VarO.h(i2)) {
                                i20 = 67108864;
                            } else {
                                i20 = 33554432;
                            }
                            i7 |= i20;
                        }
                        i21 = i6 & 512;
                        if (i21 != 0) {
                            if ((i4 & 805306368) == 0) {
                                if (bj4VarO.h(i3)) {
                                    i22 = 536870912;
                                } else {
                                    i22 = 268435456;
                                }
                                i7 |= i22;
                            }
                            i23 = i6 & 1024;
                            if (i23 != 0) {
                                i24 = i5 | 6;
                            } else if ((i5 & 6) == 0) {
                                if (bj4VarO.c(z2)) {
                                    i25 = 4;
                                } else {
                                    i25 = 2;
                                }
                                i24 = i5 | i25;
                            } else {
                                i24 = i5;
                            }
                            i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                            if (i26 != 0) {
                                i24 |= 48;
                            } else if ((i5 & 48) != 0) {
                                if (bj4VarO.j(ci4Var)) {
                                    i27 = 32;
                                } else {
                                    i27 = 16;
                                }
                                i24 |= i27;
                            }
                            i28 = i24;
                            i29 = i6 & 4096;
                            if (i29 != 0) {
                                i31 = i28 | 384;
                            } else {
                                i30 = i28;
                                if ((i5 & 384) != 0) {
                                    if (bj4VarO.c(z3)) {
                                        i32 = 256;
                                    } else {
                                        i32 = 128;
                                    }
                                    i30 |= i32;
                                }
                                i31 = i30;
                            }
                            i33 = i6 & 8192;
                            if (i33 != 0) {
                                i35 = i31 | 3072;
                            } else {
                                i34 = i31;
                                if ((i5 & 3072) == 0) {
                                    i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                                } else {
                                    i35 = i34;
                                }
                            }
                            if ((i7 & 306783379) != 306783378 && (i35 & 1171) == 1170 && bj4VarO.r()) {
                                bj4VarO.u();
                                str5 = str2;
                                i40 = i3;
                                z9 = z2;
                                ci4Var3 = ci4Var;
                                f3 = f;
                                bj4Var = bj4VarO;
                                oh4Var4 = oh4Var3;
                                uh1Var3 = uh1Var2;
                                str6 = str3;
                                i39 = i13;
                                z8 = z4;
                                i41 = i2;
                                z7 = z3;
                            } else {
                                str4 = BuildConfig.FLAVOR;
                                if (i42 != 0) {
                                    str3 = BuildConfig.FLAVOR;
                                }
                                if (i43 == 0) {
                                    str4 = str2;
                                }
                                if (i9 != 0) {
                                    uh1Var2 = null;
                                }
                                if (i12 != 0) {
                                    i36 = Integer.MAX_VALUE;
                                } else {
                                    i36 = i13;
                                }
                                if (i15 != 0) {
                                    z4 = false;
                                }
                                c0187a = jt1.a.a;
                                if (i17 != 0) {
                                    bj4VarO.K(-652118101);
                                    objF3 = bj4VarO.f();
                                    if (objF3 == c0187a) {
                                        objF3 = new w05(2);
                                        bj4VarO.C(objF3);
                                    }
                                    oh4Var3 = (oh4) objF3;
                                    bj4VarO.U(false);
                                }
                                if (i19 != 0) {
                                    i37 = 1;
                                } else {
                                    i37 = i2;
                                }
                                if (i21 != 0) {
                                    i38 = 1;
                                } else {
                                    i38 = i3;
                                }
                                if (i23 != 0) {
                                    z5 = false;
                                } else {
                                    z5 = z2;
                                }
                                if (i26 != 0) {
                                    ci4Var2 = null;
                                } else {
                                    ci4Var2 = ci4Var;
                                }
                                if (i29 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z3;
                                }
                                if (i33 != 0) {
                                    f2 = Float.NaN;
                                } else {
                                    f2 = f;
                                }
                                bj4VarO.K(-652108692);
                                if (uh1Var2 == null) {
                                    jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                                } else {
                                    jB = uh1Var2.a;
                                }
                                objB = aa0.b(bj4VarO, false, -652103026);
                                if (objB == c0187a) {
                                    objB = new jw0();
                                    bj4VarO.C(objB);
                                }
                                fw0Var = (fw0) objB;
                                int i44 = i35;
                                bj4VarO.U(false);
                                objF = bj4VarO.f();
                                if (objF == c0187a) {
                                    c33 c33Var = wd3.a;
                                    objF = m78.a(bj4VarO.x(), bj4VarO);
                                }
                                t72Var = (t72) objF;
                                uh1 uh1Var4 = uh1Var2;
                                String str7 = str3;
                                int i45 = i7;
                                ox6 ox6VarB = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                int i46 = IntercomTheme.$stable;
                                float f4 = f2;
                                ox6 ox6VarA = kw0.a(uma.a(ns0.a(ox6VarB, 1.0f, jB, intercomTheme.getShapes(bj4VarO, i46).b), intercomTheme.getShapes(bj4VarO, i46).b), fw0Var);
                                bj4VarO.K(-652085201);
                                zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                                objF2 = bj4VarO.f();
                                if (zJ || objF2 == c0187a) {
                                    objF2 = new w62(1, t72Var, fw0Var);
                                    bj4VarO.C(objF2);
                                }
                                bj4VarO.U(false);
                                ox6 ox6VarB2 = p84.b(ox6VarA, (oh4) objF2);
                                pda pdaVarD = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                                long j2 = uh1.j;
                                pda pdaVarA = pdaVarD.a(((-14837) & 1) != 0 ? pdaVarD.a : 0L, ((-14837) & 2) != 0 ? pdaVarD.b : 0L, ((-14837) & 4) != 0 ? pdaVarD.c : ac4.b(intercomTheme, bj4VarO, i46), pdaVarD.d, ((-14837) & 16) != 0 ? pdaVarD.e : intercomTheme.getColors(bj4VarO, i46).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD.f : intercomTheme.getColors(bj4VarO, i46).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD.g : intercomTheme.getColors(bj4VarO, i46).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD.h : intercomTheme.getColors(bj4VarO, i46).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD.i : j, pdaVarD.j, ((-14837) & 1024) != 0 ? pdaVarD.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD.l : j2, ((-14837) & 4096) != 0 ? pdaVarD.m : j2, ((-14837) & 8192) != 0 ? pdaVarD.n : j2, pdaVarD.o, pdaVarD.p, pdaVarD.q, pdaVarD.r, pdaVarD.s, pdaVarD.t, pdaVarD.u, pdaVarD.v, pdaVarD.w, pdaVarD.x, pdaVarD.y, pdaVarD.z, pdaVarD.A, pdaVarD.B, pdaVarD.C, pdaVarD.D, pdaVarD.E, pdaVarD.F, pdaVarD.G, pdaVarD.H, pdaVarD.I, pdaVarD.J, pdaVarD.K, pdaVarD.L, pdaVarD.M, pdaVarD.N, pdaVarD.O, pdaVarD.P, pdaVarD.Q);
                                dp5 dp5Var = new dp5(i37, i38, 115);
                                boolean z10 = z4;
                                bp5 bp5Var = new bp5(oh4Var3, null, 59);
                                b72 b72Var = intercomTheme.getShapes(bj4VarO, i46).b;
                                final boolean z11 = z5;
                                int i47 = i37;
                                ci4<? super jt1, ? super Integer, g2b> ci4Var4 = ci4Var2;
                                bj4Var = bj4VarO;
                                boolean z12 = z6;
                                ifa.a(str7, oh4Var, ox6VarB2, z12, intercomTheme.getTypography(bj4VarO, i46).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                                    public final void invoke(jt1 jt1Var2, int i48) {
                                        if ((i48 & 3) == 2 && jt1Var2.r()) {
                                            jt1Var2.u();
                                        } else {
                                            mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                        }
                                    }

                                    @Override // defpackage.ci4
                                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                        invoke(jt1Var2, num.intValue());
                                        return g2b.a;
                                    }
                                }, bj4VarO), ci4Var4, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                                    public final void invoke(jt1 jt1Var2, int i48) {
                                        if ((i48 & 3) == 2 && jt1Var2.r()) {
                                            jt1Var2.u();
                                        } else if (z11) {
                                            m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                        }
                                    }

                                    @Override // defpackage.ci4
                                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                        invoke(jt1Var2, num.intValue());
                                        return g2b.a;
                                    }
                                }, bj4VarO), null, dp5Var, bp5Var, z10, i36, 0, b72Var, pdaVarA, bj4Var, ((i44 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & 112) | ((i44 << 21) & 234881024), (29360128 & (i45 << 3)) | ((i45 << 9) & 234881024), 1604688);
                                oh4Var4 = oh4Var3;
                                uh1Var3 = uh1Var4;
                                z7 = z12;
                                ci4Var3 = ci4Var4;
                                z8 = z10;
                                i39 = i36;
                                i40 = i38;
                                z9 = z11;
                                f3 = f4;
                                str5 = str4;
                                i41 = i47;
                                str6 = str7;
                            }
                            xj8VarW = bj4Var.W();
                            if (xj8VarW != null) {
                                xj8VarW.d = new ci4() { // from class: vha
                                    @Override // defpackage.ci4
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                                    }
                                };
                            }
                        }
                        i7 |= 805306368;
                        i23 = i6 & 1024;
                        if (i23 != 0) {
                            i24 = i5 | 6;
                        } else if ((i5 & 6) == 0) {
                            if (bj4VarO.c(z2)) {
                                i25 = 4;
                            } else {
                                i25 = 2;
                            }
                            i24 = i5 | i25;
                        } else {
                            i24 = i5;
                        }
                        i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                        if (i26 != 0) {
                            i24 |= 48;
                        } else if ((i5 & 48) != 0) {
                            if (bj4VarO.j(ci4Var)) {
                                i27 = 32;
                            } else {
                                i27 = 16;
                            }
                            i24 |= i27;
                        }
                        i28 = i24;
                        i29 = i6 & 4096;
                        if (i29 != 0) {
                            i31 = i28 | 384;
                        } else {
                            i30 = i28;
                            if ((i5 & 384) != 0) {
                                if (bj4VarO.c(z3)) {
                                    i32 = 256;
                                } else {
                                    i32 = 128;
                                }
                                i30 |= i32;
                            }
                            i31 = i30;
                        }
                        i33 = i6 & 8192;
                        if (i33 != 0) {
                            i35 = i31 | 3072;
                        } else {
                            i34 = i31;
                            if ((i5 & 3072) == 0) {
                                i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                            } else {
                                i35 = i34;
                            }
                        }
                        if ((i7 & 306783379) != 306783378) {
                            str4 = BuildConfig.FLAVOR;
                            if (i42 != 0) {
                                str3 = BuildConfig.FLAVOR;
                            }
                            if (i43 == 0) {
                                str4 = str2;
                            }
                            if (i9 != 0) {
                                uh1Var2 = null;
                            }
                            if (i12 != 0) {
                                i36 = Integer.MAX_VALUE;
                            } else {
                                i36 = i13;
                            }
                            if (i15 != 0) {
                                z4 = false;
                            }
                            c0187a = jt1.a.a;
                            if (i17 != 0) {
                                bj4VarO.K(-652118101);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new w05(2);
                                    bj4VarO.C(objF3);
                                }
                                oh4Var3 = (oh4) objF3;
                                bj4VarO.U(false);
                            }
                            if (i19 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i2;
                            }
                            if (i21 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i3;
                            }
                            if (i23 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            if (i26 != 0) {
                                ci4Var2 = null;
                            } else {
                                ci4Var2 = ci4Var;
                            }
                            if (i29 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i33 != 0) {
                                f2 = Float.NaN;
                            } else {
                                f2 = f;
                            }
                            bj4VarO.K(-652108692);
                            if (uh1Var2 == null) {
                                jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                            } else {
                                jB = uh1Var2.a;
                            }
                            objB = aa0.b(bj4VarO, false, -652103026);
                            if (objB == c0187a) {
                                objB = new jw0();
                                bj4VarO.C(objB);
                            }
                            fw0Var = (fw0) objB;
                            int i48 = i35;
                            bj4VarO.U(false);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                c33 c33Var2 = wd3.a;
                                objF = m78.a(bj4VarO.x(), bj4VarO);
                            }
                            t72Var = (t72) objF;
                            uh1 uh1Var5 = uh1Var2;
                            String str8 = str3;
                            int i49 = i7;
                            ox6 ox6VarB3 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                            int i410 = IntercomTheme.$stable;
                            float f5 = f2;
                            ox6 ox6VarA2 = kw0.a(uma.a(ns0.a(ox6VarB3, 1.0f, jB, intercomTheme2.getShapes(bj4VarO, i410).b), intercomTheme2.getShapes(bj4VarO, i410).b), fw0Var);
                            bj4VarO.K(-652085201);
                            zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                            objF2 = bj4VarO.f();
                            if (zJ) {
                                objF2 = new w62(1, t72Var, fw0Var);
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new w62(1, t72Var, fw0Var);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarB4 = p84.b(ox6VarA2, (oh4) objF2);
                            pda pdaVarD2 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                            long j3 = uh1.j;
                            pda pdaVarA2 = pdaVarD2.a(((-14837) & 1) != 0 ? pdaVarD2.a : 0L, ((-14837) & 2) != 0 ? pdaVarD2.b : 0L, ((-14837) & 4) != 0 ? pdaVarD2.c : ac4.b(intercomTheme2, bj4VarO, i410), pdaVarD2.d, ((-14837) & 16) != 0 ? pdaVarD2.e : intercomTheme2.getColors(bj4VarO, i410).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD2.f : intercomTheme2.getColors(bj4VarO, i410).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD2.g : intercomTheme2.getColors(bj4VarO, i410).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD2.h : intercomTheme2.getColors(bj4VarO, i410).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD2.i : j, pdaVarD2.j, ((-14837) & 1024) != 0 ? pdaVarD2.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD2.l : j3, ((-14837) & 4096) != 0 ? pdaVarD2.m : j3, ((-14837) & 8192) != 0 ? pdaVarD2.n : j3, pdaVarD2.o, pdaVarD2.p, pdaVarD2.q, pdaVarD2.r, pdaVarD2.s, pdaVarD2.t, pdaVarD2.u, pdaVarD2.v, pdaVarD2.w, pdaVarD2.x, pdaVarD2.y, pdaVarD2.z, pdaVarD2.A, pdaVarD2.B, pdaVarD2.C, pdaVarD2.D, pdaVarD2.E, pdaVarD2.F, pdaVarD2.G, pdaVarD2.H, pdaVarD2.I, pdaVarD2.J, pdaVarD2.K, pdaVarD2.L, pdaVarD2.M, pdaVarD2.N, pdaVarD2.O, pdaVarD2.P, pdaVarD2.Q);
                            dp5 dp5Var2 = new dp5(i37, i38, 115);
                            boolean z13 = z4;
                            bp5 bp5Var2 = new bp5(oh4Var3, null, 59);
                            b72 b72Var2 = intercomTheme2.getShapes(bj4VarO, i410).b;
                            final boolean z14 = z5;
                            int i411 = i37;
                            ci4<? super jt1, ? super Integer, g2b> ci4Var5 = ci4Var2;
                            bj4Var = bj4VarO;
                            boolean z15 = z6;
                            ifa.a(str8, oh4Var, ox6VarB4, z15, intercomTheme2.getTypography(bj4VarO, i410).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                                public final void invoke(jt1 jt1Var2, int i412) {
                                    if ((i412 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else {
                                        mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), ci4Var5, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                                public final void invoke(jt1 jt1Var2, int i412) {
                                    if ((i412 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else if (z14) {
                                        m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), null, dp5Var2, bp5Var2, z13, i36, 0, b72Var2, pdaVarA2, bj4Var, ((i48 << 3) & 7168) | (i49 & 14) | 817889280 | ((i49 >> 3) & 112) | ((i48 << 21) & 234881024), (29360128 & (i49 << 3)) | ((i49 << 9) & 234881024), 1604688);
                            oh4Var4 = oh4Var3;
                            uh1Var3 = uh1Var5;
                            z7 = z15;
                            ci4Var3 = ci4Var5;
                            z8 = z13;
                            i39 = i36;
                            i40 = i38;
                            z9 = z14;
                            f3 = f5;
                            str5 = str4;
                            i41 = i411;
                            str6 = str8;
                        } else {
                            str4 = BuildConfig.FLAVOR;
                            if (i42 != 0) {
                                str3 = BuildConfig.FLAVOR;
                            }
                            if (i43 == 0) {
                                str4 = str2;
                            }
                            if (i9 != 0) {
                                uh1Var2 = null;
                            }
                            if (i12 != 0) {
                                i36 = Integer.MAX_VALUE;
                            } else {
                                i36 = i13;
                            }
                            if (i15 != 0) {
                                z4 = false;
                            }
                            c0187a = jt1.a.a;
                            if (i17 != 0) {
                                bj4VarO.K(-652118101);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new w05(2);
                                    bj4VarO.C(objF3);
                                }
                                oh4Var3 = (oh4) objF3;
                                bj4VarO.U(false);
                            }
                            if (i19 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i2;
                            }
                            if (i21 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i3;
                            }
                            if (i23 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            if (i26 != 0) {
                                ci4Var2 = null;
                            } else {
                                ci4Var2 = ci4Var;
                            }
                            if (i29 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i33 != 0) {
                                f2 = Float.NaN;
                            } else {
                                f2 = f;
                            }
                            bj4VarO.K(-652108692);
                            if (uh1Var2 == null) {
                                jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                            } else {
                                jB = uh1Var2.a;
                            }
                            objB = aa0.b(bj4VarO, false, -652103026);
                            if (objB == c0187a) {
                                objB = new jw0();
                                bj4VarO.C(objB);
                            }
                            fw0Var = (fw0) objB;
                            int i412 = i35;
                            bj4VarO.U(false);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                c33 c33Var3 = wd3.a;
                                objF = m78.a(bj4VarO.x(), bj4VarO);
                            }
                            t72Var = (t72) objF;
                            uh1 uh1Var6 = uh1Var2;
                            String str9 = str3;
                            int i413 = i7;
                            ox6 ox6VarB5 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                            int i414 = IntercomTheme.$stable;
                            float f6 = f2;
                            ox6 ox6VarA3 = kw0.a(uma.a(ns0.a(ox6VarB5, 1.0f, jB, intercomTheme3.getShapes(bj4VarO, i414).b), intercomTheme3.getShapes(bj4VarO, i414).b), fw0Var);
                            bj4VarO.K(-652085201);
                            zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                            objF2 = bj4VarO.f();
                            if (zJ) {
                                objF2 = new w62(1, t72Var, fw0Var);
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new w62(1, t72Var, fw0Var);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarB6 = p84.b(ox6VarA3, (oh4) objF2);
                            pda pdaVarD3 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                            long j4 = uh1.j;
                            pda pdaVarA3 = pdaVarD3.a(((-14837) & 1) != 0 ? pdaVarD3.a : 0L, ((-14837) & 2) != 0 ? pdaVarD3.b : 0L, ((-14837) & 4) != 0 ? pdaVarD3.c : ac4.b(intercomTheme3, bj4VarO, i414), pdaVarD3.d, ((-14837) & 16) != 0 ? pdaVarD3.e : intercomTheme3.getColors(bj4VarO, i414).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD3.f : intercomTheme3.getColors(bj4VarO, i414).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD3.g : intercomTheme3.getColors(bj4VarO, i414).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD3.h : intercomTheme3.getColors(bj4VarO, i414).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD3.i : j, pdaVarD3.j, ((-14837) & 1024) != 0 ? pdaVarD3.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD3.l : j4, ((-14837) & 4096) != 0 ? pdaVarD3.m : j4, ((-14837) & 8192) != 0 ? pdaVarD3.n : j4, pdaVarD3.o, pdaVarD3.p, pdaVarD3.q, pdaVarD3.r, pdaVarD3.s, pdaVarD3.t, pdaVarD3.u, pdaVarD3.v, pdaVarD3.w, pdaVarD3.x, pdaVarD3.y, pdaVarD3.z, pdaVarD3.A, pdaVarD3.B, pdaVarD3.C, pdaVarD3.D, pdaVarD3.E, pdaVarD3.F, pdaVarD3.G, pdaVarD3.H, pdaVarD3.I, pdaVarD3.J, pdaVarD3.K, pdaVarD3.L, pdaVarD3.M, pdaVarD3.N, pdaVarD3.O, pdaVarD3.P, pdaVarD3.Q);
                            dp5 dp5Var3 = new dp5(i37, i38, 115);
                            boolean z16 = z4;
                            bp5 bp5Var3 = new bp5(oh4Var3, null, 59);
                            b72 b72Var3 = intercomTheme3.getShapes(bj4VarO, i414).b;
                            final boolean z17 = z5;
                            int i415 = i37;
                            ci4<? super jt1, ? super Integer, g2b> ci4Var6 = ci4Var2;
                            bj4Var = bj4VarO;
                            boolean z18 = z6;
                            ifa.a(str9, oh4Var, ox6VarB6, z18, intercomTheme3.getTypography(bj4VarO, i414).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                                public final void invoke(jt1 jt1Var2, int i416) {
                                    if ((i416 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else {
                                        mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), ci4Var6, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                                public final void invoke(jt1 jt1Var2, int i416) {
                                    if ((i416 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else if (z17) {
                                        m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), null, dp5Var3, bp5Var3, z16, i36, 0, b72Var3, pdaVarA3, bj4Var, ((i412 << 3) & 7168) | (i413 & 14) | 817889280 | ((i413 >> 3) & 112) | ((i412 << 21) & 234881024), (29360128 & (i413 << 3)) | ((i413 << 9) & 234881024), 1604688);
                            oh4Var4 = oh4Var3;
                            uh1Var3 = uh1Var6;
                            z7 = z18;
                            ci4Var3 = ci4Var6;
                            z8 = z16;
                            i39 = i36;
                            i40 = i38;
                            z9 = z17;
                            f3 = f6;
                            str5 = str4;
                            i41 = i415;
                            str6 = str9;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: vha
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i7 |= 100663296;
                    i21 = i6 & 512;
                    if (i21 != 0) {
                        if ((i4 & 805306368) == 0) {
                            if (bj4VarO.h(i3)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i7 |= i22;
                        }
                        i23 = i6 & 1024;
                        if (i23 != 0) {
                            i24 = i5 | 6;
                        } else if ((i5 & 6) == 0) {
                            if (bj4VarO.c(z2)) {
                                i25 = 4;
                            } else {
                                i25 = 2;
                            }
                            i24 = i5 | i25;
                        } else {
                            i24 = i5;
                        }
                        i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                        if (i26 != 0) {
                            i24 |= 48;
                        } else if ((i5 & 48) != 0) {
                            if (bj4VarO.j(ci4Var)) {
                                i27 = 32;
                            } else {
                                i27 = 16;
                            }
                            i24 |= i27;
                        }
                        i28 = i24;
                        i29 = i6 & 4096;
                        if (i29 != 0) {
                            i31 = i28 | 384;
                        } else {
                            i30 = i28;
                            if ((i5 & 384) != 0) {
                                if (bj4VarO.c(z3)) {
                                    i32 = 256;
                                } else {
                                    i32 = 128;
                                }
                                i30 |= i32;
                            }
                            i31 = i30;
                        }
                        i33 = i6 & 8192;
                        if (i33 != 0) {
                            i35 = i31 | 3072;
                        } else {
                            i34 = i31;
                            if ((i5 & 3072) == 0) {
                                i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                            } else {
                                i35 = i34;
                            }
                        }
                        if ((i7 & 306783379) != 306783378) {
                            str4 = BuildConfig.FLAVOR;
                            if (i42 != 0) {
                                str3 = BuildConfig.FLAVOR;
                            }
                            if (i43 == 0) {
                                str4 = str2;
                            }
                            if (i9 != 0) {
                                uh1Var2 = null;
                            }
                            if (i12 != 0) {
                                i36 = Integer.MAX_VALUE;
                            } else {
                                i36 = i13;
                            }
                            if (i15 != 0) {
                                z4 = false;
                            }
                            c0187a = jt1.a.a;
                            if (i17 != 0) {
                                bj4VarO.K(-652118101);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new w05(2);
                                    bj4VarO.C(objF3);
                                }
                                oh4Var3 = (oh4) objF3;
                                bj4VarO.U(false);
                            }
                            if (i19 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i2;
                            }
                            if (i21 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i3;
                            }
                            if (i23 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            if (i26 != 0) {
                                ci4Var2 = null;
                            } else {
                                ci4Var2 = ci4Var;
                            }
                            if (i29 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i33 != 0) {
                                f2 = Float.NaN;
                            } else {
                                f2 = f;
                            }
                            bj4VarO.K(-652108692);
                            if (uh1Var2 == null) {
                                jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                            } else {
                                jB = uh1Var2.a;
                            }
                            objB = aa0.b(bj4VarO, false, -652103026);
                            if (objB == c0187a) {
                                objB = new jw0();
                                bj4VarO.C(objB);
                            }
                            fw0Var = (fw0) objB;
                            int i416 = i35;
                            bj4VarO.U(false);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                c33 c33Var4 = wd3.a;
                                objF = m78.a(bj4VarO.x(), bj4VarO);
                            }
                            t72Var = (t72) objF;
                            uh1 uh1Var7 = uh1Var2;
                            String str10 = str3;
                            int i417 = i7;
                            ox6 ox6VarB7 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                            IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                            int i418 = IntercomTheme.$stable;
                            float f7 = f2;
                            ox6 ox6VarA4 = kw0.a(uma.a(ns0.a(ox6VarB7, 1.0f, jB, intercomTheme4.getShapes(bj4VarO, i418).b), intercomTheme4.getShapes(bj4VarO, i418).b), fw0Var);
                            bj4VarO.K(-652085201);
                            zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                            objF2 = bj4VarO.f();
                            if (zJ) {
                                objF2 = new w62(1, t72Var, fw0Var);
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new w62(1, t72Var, fw0Var);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarB8 = p84.b(ox6VarA4, (oh4) objF2);
                            pda pdaVarD4 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                            long j5 = uh1.j;
                            pda pdaVarA4 = pdaVarD4.a(((-14837) & 1) != 0 ? pdaVarD4.a : 0L, ((-14837) & 2) != 0 ? pdaVarD4.b : 0L, ((-14837) & 4) != 0 ? pdaVarD4.c : ac4.b(intercomTheme4, bj4VarO, i418), pdaVarD4.d, ((-14837) & 16) != 0 ? pdaVarD4.e : intercomTheme4.getColors(bj4VarO, i418).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD4.f : intercomTheme4.getColors(bj4VarO, i418).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD4.g : intercomTheme4.getColors(bj4VarO, i418).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD4.h : intercomTheme4.getColors(bj4VarO, i418).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD4.i : j, pdaVarD4.j, ((-14837) & 1024) != 0 ? pdaVarD4.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD4.l : j5, ((-14837) & 4096) != 0 ? pdaVarD4.m : j5, ((-14837) & 8192) != 0 ? pdaVarD4.n : j5, pdaVarD4.o, pdaVarD4.p, pdaVarD4.q, pdaVarD4.r, pdaVarD4.s, pdaVarD4.t, pdaVarD4.u, pdaVarD4.v, pdaVarD4.w, pdaVarD4.x, pdaVarD4.y, pdaVarD4.z, pdaVarD4.A, pdaVarD4.B, pdaVarD4.C, pdaVarD4.D, pdaVarD4.E, pdaVarD4.F, pdaVarD4.G, pdaVarD4.H, pdaVarD4.I, pdaVarD4.J, pdaVarD4.K, pdaVarD4.L, pdaVarD4.M, pdaVarD4.N, pdaVarD4.O, pdaVarD4.P, pdaVarD4.Q);
                            dp5 dp5Var4 = new dp5(i37, i38, 115);
                            boolean z19 = z4;
                            bp5 bp5Var4 = new bp5(oh4Var3, null, 59);
                            b72 b72Var4 = intercomTheme4.getShapes(bj4VarO, i418).b;
                            final boolean z110 = z5;
                            int i419 = i37;
                            ci4<? super jt1, ? super Integer, g2b> ci4Var7 = ci4Var2;
                            bj4Var = bj4VarO;
                            boolean z111 = z6;
                            ifa.a(str10, oh4Var, ox6VarB8, z111, intercomTheme4.getTypography(bj4VarO, i418).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                                public final void invoke(jt1 jt1Var2, int i4110) {
                                    if ((i4110 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else {
                                        mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), ci4Var7, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                                public final void invoke(jt1 jt1Var2, int i4110) {
                                    if ((i4110 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else if (z110) {
                                        m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), null, dp5Var4, bp5Var4, z19, i36, 0, b72Var4, pdaVarA4, bj4Var, ((i416 << 3) & 7168) | (i417 & 14) | 817889280 | ((i417 >> 3) & 112) | ((i416 << 21) & 234881024), (29360128 & (i417 << 3)) | ((i417 << 9) & 234881024), 1604688);
                            oh4Var4 = oh4Var3;
                            uh1Var3 = uh1Var7;
                            z7 = z111;
                            ci4Var3 = ci4Var7;
                            z8 = z19;
                            i39 = i36;
                            i40 = i38;
                            z9 = z110;
                            f3 = f7;
                            str5 = str4;
                            i41 = i419;
                            str6 = str10;
                        } else {
                            str4 = BuildConfig.FLAVOR;
                            if (i42 != 0) {
                                str3 = BuildConfig.FLAVOR;
                            }
                            if (i43 == 0) {
                                str4 = str2;
                            }
                            if (i9 != 0) {
                                uh1Var2 = null;
                            }
                            if (i12 != 0) {
                                i36 = Integer.MAX_VALUE;
                            } else {
                                i36 = i13;
                            }
                            if (i15 != 0) {
                                z4 = false;
                            }
                            c0187a = jt1.a.a;
                            if (i17 != 0) {
                                bj4VarO.K(-652118101);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new w05(2);
                                    bj4VarO.C(objF3);
                                }
                                oh4Var3 = (oh4) objF3;
                                bj4VarO.U(false);
                            }
                            if (i19 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i2;
                            }
                            if (i21 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i3;
                            }
                            if (i23 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            if (i26 != 0) {
                                ci4Var2 = null;
                            } else {
                                ci4Var2 = ci4Var;
                            }
                            if (i29 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i33 != 0) {
                                f2 = Float.NaN;
                            } else {
                                f2 = f;
                            }
                            bj4VarO.K(-652108692);
                            if (uh1Var2 == null) {
                                jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                            } else {
                                jB = uh1Var2.a;
                            }
                            objB = aa0.b(bj4VarO, false, -652103026);
                            if (objB == c0187a) {
                                objB = new jw0();
                                bj4VarO.C(objB);
                            }
                            fw0Var = (fw0) objB;
                            int i4110 = i35;
                            bj4VarO.U(false);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                c33 c33Var5 = wd3.a;
                                objF = m78.a(bj4VarO.x(), bj4VarO);
                            }
                            t72Var = (t72) objF;
                            uh1 uh1Var8 = uh1Var2;
                            String str11 = str3;
                            int i4111 = i7;
                            ox6 ox6VarB9 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                            IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                            int i4112 = IntercomTheme.$stable;
                            float f8 = f2;
                            ox6 ox6VarA5 = kw0.a(uma.a(ns0.a(ox6VarB9, 1.0f, jB, intercomTheme5.getShapes(bj4VarO, i4112).b), intercomTheme5.getShapes(bj4VarO, i4112).b), fw0Var);
                            bj4VarO.K(-652085201);
                            zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                            objF2 = bj4VarO.f();
                            if (zJ) {
                                objF2 = new w62(1, t72Var, fw0Var);
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new w62(1, t72Var, fw0Var);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarB10 = p84.b(ox6VarA5, (oh4) objF2);
                            pda pdaVarD5 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                            long j6 = uh1.j;
                            pda pdaVarA5 = pdaVarD5.a(((-14837) & 1) != 0 ? pdaVarD5.a : 0L, ((-14837) & 2) != 0 ? pdaVarD5.b : 0L, ((-14837) & 4) != 0 ? pdaVarD5.c : ac4.b(intercomTheme5, bj4VarO, i4112), pdaVarD5.d, ((-14837) & 16) != 0 ? pdaVarD5.e : intercomTheme5.getColors(bj4VarO, i4112).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD5.f : intercomTheme5.getColors(bj4VarO, i4112).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD5.g : intercomTheme5.getColors(bj4VarO, i4112).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD5.h : intercomTheme5.getColors(bj4VarO, i4112).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD5.i : j, pdaVarD5.j, ((-14837) & 1024) != 0 ? pdaVarD5.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD5.l : j6, ((-14837) & 4096) != 0 ? pdaVarD5.m : j6, ((-14837) & 8192) != 0 ? pdaVarD5.n : j6, pdaVarD5.o, pdaVarD5.p, pdaVarD5.q, pdaVarD5.r, pdaVarD5.s, pdaVarD5.t, pdaVarD5.u, pdaVarD5.v, pdaVarD5.w, pdaVarD5.x, pdaVarD5.y, pdaVarD5.z, pdaVarD5.A, pdaVarD5.B, pdaVarD5.C, pdaVarD5.D, pdaVarD5.E, pdaVarD5.F, pdaVarD5.G, pdaVarD5.H, pdaVarD5.I, pdaVarD5.J, pdaVarD5.K, pdaVarD5.L, pdaVarD5.M, pdaVarD5.N, pdaVarD5.O, pdaVarD5.P, pdaVarD5.Q);
                            dp5 dp5Var5 = new dp5(i37, i38, 115);
                            boolean z112 = z4;
                            bp5 bp5Var5 = new bp5(oh4Var3, null, 59);
                            b72 b72Var5 = intercomTheme5.getShapes(bj4VarO, i4112).b;
                            final boolean z113 = z5;
                            int i4113 = i37;
                            ci4<? super jt1, ? super Integer, g2b> ci4Var8 = ci4Var2;
                            bj4Var = bj4VarO;
                            boolean z114 = z6;
                            ifa.a(str11, oh4Var, ox6VarB10, z114, intercomTheme5.getTypography(bj4VarO, i4112).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                                public final void invoke(jt1 jt1Var2, int i4114) {
                                    if ((i4114 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else {
                                        mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), ci4Var8, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                                public final void invoke(jt1 jt1Var2, int i4114) {
                                    if ((i4114 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else if (z113) {
                                        m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), null, dp5Var5, bp5Var5, z112, i36, 0, b72Var5, pdaVarA5, bj4Var, ((i4110 << 3) & 7168) | (i4111 & 14) | 817889280 | ((i4111 >> 3) & 112) | ((i4110 << 21) & 234881024), (29360128 & (i4111 << 3)) | ((i4111 << 9) & 234881024), 1604688);
                            oh4Var4 = oh4Var3;
                            uh1Var3 = uh1Var8;
                            z7 = z114;
                            ci4Var3 = ci4Var8;
                            z8 = z112;
                            i39 = i36;
                            i40 = i38;
                            z9 = z113;
                            f3 = f8;
                            str5 = str4;
                            i41 = i4113;
                            str6 = str11;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: vha
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i7 |= 805306368;
                    i23 = i6 & 1024;
                    if (i23 != 0) {
                        i24 = i5 | 6;
                    } else if ((i5 & 6) == 0) {
                        if (bj4VarO.c(z2)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i5 | i25;
                    } else {
                        i24 = i5;
                    }
                    i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    if (i26 != 0) {
                        i24 |= 48;
                    } else if ((i5 & 48) != 0) {
                        if (bj4VarO.j(ci4Var)) {
                            i27 = 32;
                        } else {
                            i27 = 16;
                        }
                        i24 |= i27;
                    }
                    i28 = i24;
                    i29 = i6 & 4096;
                    if (i29 != 0) {
                        i31 = i28 | 384;
                    } else {
                        i30 = i28;
                        if ((i5 & 384) != 0) {
                            if (bj4VarO.c(z3)) {
                                i32 = 256;
                            } else {
                                i32 = 128;
                            }
                            i30 |= i32;
                        }
                        i31 = i30;
                    }
                    i33 = i6 & 8192;
                    if (i33 != 0) {
                        i35 = i31 | 3072;
                    } else {
                        i34 = i31;
                        if ((i5 & 3072) == 0) {
                            i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                        } else {
                            i35 = i34;
                        }
                    }
                    if ((i7 & 306783379) != 306783378) {
                        str4 = BuildConfig.FLAVOR;
                        if (i42 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        if (i43 == 0) {
                            str4 = str2;
                        }
                        if (i9 != 0) {
                            uh1Var2 = null;
                        }
                        if (i12 != 0) {
                            i36 = Integer.MAX_VALUE;
                        } else {
                            i36 = i13;
                        }
                        if (i15 != 0) {
                            z4 = false;
                        }
                        c0187a = jt1.a.a;
                        if (i17 != 0) {
                            bj4VarO.K(-652118101);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new w05(2);
                                bj4VarO.C(objF3);
                            }
                            oh4Var3 = (oh4) objF3;
                            bj4VarO.U(false);
                        }
                        if (i19 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i2;
                        }
                        if (i21 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i3;
                        }
                        if (i23 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i26 != 0) {
                            ci4Var2 = null;
                        } else {
                            ci4Var2 = ci4Var;
                        }
                        if (i29 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i33 != 0) {
                            f2 = Float.NaN;
                        } else {
                            f2 = f;
                        }
                        bj4VarO.K(-652108692);
                        if (uh1Var2 == null) {
                            jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        } else {
                            jB = uh1Var2.a;
                        }
                        objB = aa0.b(bj4VarO, false, -652103026);
                        if (objB == c0187a) {
                            objB = new jw0();
                            bj4VarO.C(objB);
                        }
                        fw0Var = (fw0) objB;
                        int i4114 = i35;
                        bj4VarO.U(false);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var6 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72Var = (t72) objF;
                        uh1 uh1Var9 = uh1Var2;
                        String str12 = str3;
                        int i4115 = i7;
                        ox6 ox6VarB11 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                        IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                        int i4116 = IntercomTheme.$stable;
                        float f9 = f2;
                        ox6 ox6VarA6 = kw0.a(uma.a(ns0.a(ox6VarB11, 1.0f, jB, intercomTheme6.getShapes(bj4VarO, i4116).b), intercomTheme6.getShapes(bj4VarO, i4116).b), fw0Var);
                        bj4VarO.K(-652085201);
                        zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarB12 = p84.b(ox6VarA6, (oh4) objF2);
                        pda pdaVarD6 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                        long j7 = uh1.j;
                        pda pdaVarA6 = pdaVarD6.a(((-14837) & 1) != 0 ? pdaVarD6.a : 0L, ((-14837) & 2) != 0 ? pdaVarD6.b : 0L, ((-14837) & 4) != 0 ? pdaVarD6.c : ac4.b(intercomTheme6, bj4VarO, i4116), pdaVarD6.d, ((-14837) & 16) != 0 ? pdaVarD6.e : intercomTheme6.getColors(bj4VarO, i4116).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD6.f : intercomTheme6.getColors(bj4VarO, i4116).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD6.g : intercomTheme6.getColors(bj4VarO, i4116).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD6.h : intercomTheme6.getColors(bj4VarO, i4116).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD6.i : j, pdaVarD6.j, ((-14837) & 1024) != 0 ? pdaVarD6.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD6.l : j7, ((-14837) & 4096) != 0 ? pdaVarD6.m : j7, ((-14837) & 8192) != 0 ? pdaVarD6.n : j7, pdaVarD6.o, pdaVarD6.p, pdaVarD6.q, pdaVarD6.r, pdaVarD6.s, pdaVarD6.t, pdaVarD6.u, pdaVarD6.v, pdaVarD6.w, pdaVarD6.x, pdaVarD6.y, pdaVarD6.z, pdaVarD6.A, pdaVarD6.B, pdaVarD6.C, pdaVarD6.D, pdaVarD6.E, pdaVarD6.F, pdaVarD6.G, pdaVarD6.H, pdaVarD6.I, pdaVarD6.J, pdaVarD6.K, pdaVarD6.L, pdaVarD6.M, pdaVarD6.N, pdaVarD6.O, pdaVarD6.P, pdaVarD6.Q);
                        dp5 dp5Var6 = new dp5(i37, i38, 115);
                        boolean z115 = z4;
                        bp5 bp5Var6 = new bp5(oh4Var3, null, 59);
                        b72 b72Var6 = intercomTheme6.getShapes(bj4VarO, i4116).b;
                        final boolean z116 = z5;
                        int i4117 = i37;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var9 = ci4Var2;
                        bj4Var = bj4VarO;
                        boolean z117 = z6;
                        ifa.a(str12, oh4Var, ox6VarB12, z117, intercomTheme6.getTypography(bj4VarO, i4116).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            public final void invoke(jt1 jt1Var2, int i4118) {
                                if ((i4118 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ci4Var9, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            public final void invoke(jt1 jt1Var2, int i4118) {
                                if ((i4118 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else if (z116) {
                                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, dp5Var6, bp5Var6, z115, i36, 0, b72Var6, pdaVarA6, bj4Var, ((i4114 << 3) & 7168) | (i4115 & 14) | 817889280 | ((i4115 >> 3) & 112) | ((i4114 << 21) & 234881024), (29360128 & (i4115 << 3)) | ((i4115 << 9) & 234881024), 1604688);
                        oh4Var4 = oh4Var3;
                        uh1Var3 = uh1Var9;
                        z7 = z117;
                        ci4Var3 = ci4Var9;
                        z8 = z115;
                        i39 = i36;
                        i40 = i38;
                        z9 = z116;
                        f3 = f9;
                        str5 = str4;
                        i41 = i4117;
                        str6 = str12;
                    } else {
                        str4 = BuildConfig.FLAVOR;
                        if (i42 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        if (i43 == 0) {
                            str4 = str2;
                        }
                        if (i9 != 0) {
                            uh1Var2 = null;
                        }
                        if (i12 != 0) {
                            i36 = Integer.MAX_VALUE;
                        } else {
                            i36 = i13;
                        }
                        if (i15 != 0) {
                            z4 = false;
                        }
                        c0187a = jt1.a.a;
                        if (i17 != 0) {
                            bj4VarO.K(-652118101);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new w05(2);
                                bj4VarO.C(objF3);
                            }
                            oh4Var3 = (oh4) objF3;
                            bj4VarO.U(false);
                        }
                        if (i19 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i2;
                        }
                        if (i21 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i3;
                        }
                        if (i23 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i26 != 0) {
                            ci4Var2 = null;
                        } else {
                            ci4Var2 = ci4Var;
                        }
                        if (i29 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i33 != 0) {
                            f2 = Float.NaN;
                        } else {
                            f2 = f;
                        }
                        bj4VarO.K(-652108692);
                        if (uh1Var2 == null) {
                            jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        } else {
                            jB = uh1Var2.a;
                        }
                        objB = aa0.b(bj4VarO, false, -652103026);
                        if (objB == c0187a) {
                            objB = new jw0();
                            bj4VarO.C(objB);
                        }
                        fw0Var = (fw0) objB;
                        int i4118 = i35;
                        bj4VarO.U(false);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var7 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72Var = (t72) objF;
                        uh1 uh1Var10 = uh1Var2;
                        String str13 = str3;
                        int i4119 = i7;
                        ox6 ox6VarB13 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                        IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
                        int i41110 = IntercomTheme.$stable;
                        float f10 = f2;
                        ox6 ox6VarA7 = kw0.a(uma.a(ns0.a(ox6VarB13, 1.0f, jB, intercomTheme7.getShapes(bj4VarO, i41110).b), intercomTheme7.getShapes(bj4VarO, i41110).b), fw0Var);
                        bj4VarO.K(-652085201);
                        zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarB14 = p84.b(ox6VarA7, (oh4) objF2);
                        pda pdaVarD7 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                        long j8 = uh1.j;
                        pda pdaVarA7 = pdaVarD7.a(((-14837) & 1) != 0 ? pdaVarD7.a : 0L, ((-14837) & 2) != 0 ? pdaVarD7.b : 0L, ((-14837) & 4) != 0 ? pdaVarD7.c : ac4.b(intercomTheme7, bj4VarO, i41110), pdaVarD7.d, ((-14837) & 16) != 0 ? pdaVarD7.e : intercomTheme7.getColors(bj4VarO, i41110).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD7.f : intercomTheme7.getColors(bj4VarO, i41110).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD7.g : intercomTheme7.getColors(bj4VarO, i41110).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD7.h : intercomTheme7.getColors(bj4VarO, i41110).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD7.i : j, pdaVarD7.j, ((-14837) & 1024) != 0 ? pdaVarD7.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD7.l : j8, ((-14837) & 4096) != 0 ? pdaVarD7.m : j8, ((-14837) & 8192) != 0 ? pdaVarD7.n : j8, pdaVarD7.o, pdaVarD7.p, pdaVarD7.q, pdaVarD7.r, pdaVarD7.s, pdaVarD7.t, pdaVarD7.u, pdaVarD7.v, pdaVarD7.w, pdaVarD7.x, pdaVarD7.y, pdaVarD7.z, pdaVarD7.A, pdaVarD7.B, pdaVarD7.C, pdaVarD7.D, pdaVarD7.E, pdaVarD7.F, pdaVarD7.G, pdaVarD7.H, pdaVarD7.I, pdaVarD7.J, pdaVarD7.K, pdaVarD7.L, pdaVarD7.M, pdaVarD7.N, pdaVarD7.O, pdaVarD7.P, pdaVarD7.Q);
                        dp5 dp5Var7 = new dp5(i37, i38, 115);
                        boolean z118 = z4;
                        bp5 bp5Var7 = new bp5(oh4Var3, null, 59);
                        b72 b72Var7 = intercomTheme7.getShapes(bj4VarO, i41110).b;
                        final boolean z119 = z5;
                        int i41111 = i37;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var10 = ci4Var2;
                        bj4Var = bj4VarO;
                        boolean z1110 = z6;
                        ifa.a(str13, oh4Var, ox6VarB14, z1110, intercomTheme7.getTypography(bj4VarO, i41110).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            public final void invoke(jt1 jt1Var2, int i41112) {
                                if ((i41112 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ci4Var10, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            public final void invoke(jt1 jt1Var2, int i41112) {
                                if ((i41112 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else if (z119) {
                                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, dp5Var7, bp5Var7, z118, i36, 0, b72Var7, pdaVarA7, bj4Var, ((i4118 << 3) & 7168) | (i4119 & 14) | 817889280 | ((i4119 >> 3) & 112) | ((i4118 << 21) & 234881024), (29360128 & (i4119 << 3)) | ((i4119 << 9) & 234881024), 1604688);
                        oh4Var4 = oh4Var3;
                        uh1Var3 = uh1Var10;
                        z7 = z1110;
                        ci4Var3 = ci4Var10;
                        z8 = z118;
                        i39 = i36;
                        i40 = i38;
                        z9 = z119;
                        f3 = f10;
                        str5 = str4;
                        i41 = i41111;
                        str6 = str13;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: vha
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i7 |= 3072;
                uh1Var2 = uh1Var;
                if ((i6 & 16) != 0) {
                    i7 |= 24576;
                } else if ((i4 & 24576) == 0) {
                    if (bj4VarO.i(j)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i7 |= i11;
                }
                i12 = i6 & 32;
                if (i12 != 0) {
                    i7 |= 196608;
                    i13 = i;
                } else {
                    i13 = i;
                    if ((i4 & 196608) == 0) {
                        if (bj4VarO.h(i13)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i7 |= i14;
                    }
                }
                i15 = i6 & 64;
                if (i15 != 0) {
                    i7 |= 1572864;
                    z4 = z;
                } else {
                    z4 = z;
                    if ((i4 & 1572864) == 0) {
                        if (bj4VarO.c(z4)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i7 |= i16;
                    }
                }
                i17 = i6 & 128;
                if (i17 != 0) {
                    i7 |= 12582912;
                    oh4Var3 = oh4Var2;
                } else {
                    oh4Var3 = oh4Var2;
                    if ((i4 & 12582912) == 0) {
                        if (bj4VarO.j(oh4Var3)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i7 |= i18;
                    }
                }
                i19 = i6 & 256;
                if (i19 != 0) {
                    if ((i4 & 100663296) == 0) {
                        if (bj4VarO.h(i2)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i7 |= i20;
                    }
                    i21 = i6 & 512;
                    if (i21 != 0) {
                        if ((i4 & 805306368) == 0) {
                            if (bj4VarO.h(i3)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i7 |= i22;
                        }
                        i23 = i6 & 1024;
                        if (i23 != 0) {
                            i24 = i5 | 6;
                        } else if ((i5 & 6) == 0) {
                            if (bj4VarO.c(z2)) {
                                i25 = 4;
                            } else {
                                i25 = 2;
                            }
                            i24 = i5 | i25;
                        } else {
                            i24 = i5;
                        }
                        i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                        if (i26 != 0) {
                            i24 |= 48;
                        } else if ((i5 & 48) != 0) {
                            if (bj4VarO.j(ci4Var)) {
                                i27 = 32;
                            } else {
                                i27 = 16;
                            }
                            i24 |= i27;
                        }
                        i28 = i24;
                        i29 = i6 & 4096;
                        if (i29 != 0) {
                            i31 = i28 | 384;
                        } else {
                            i30 = i28;
                            if ((i5 & 384) != 0) {
                                if (bj4VarO.c(z3)) {
                                    i32 = 256;
                                } else {
                                    i32 = 128;
                                }
                                i30 |= i32;
                            }
                            i31 = i30;
                        }
                        i33 = i6 & 8192;
                        if (i33 != 0) {
                            i35 = i31 | 3072;
                        } else {
                            i34 = i31;
                            if ((i5 & 3072) == 0) {
                                i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                            } else {
                                i35 = i34;
                            }
                        }
                        if ((i7 & 306783379) != 306783378) {
                            str4 = BuildConfig.FLAVOR;
                            if (i42 != 0) {
                                str3 = BuildConfig.FLAVOR;
                            }
                            if (i43 == 0) {
                                str4 = str2;
                            }
                            if (i9 != 0) {
                                uh1Var2 = null;
                            }
                            if (i12 != 0) {
                                i36 = Integer.MAX_VALUE;
                            } else {
                                i36 = i13;
                            }
                            if (i15 != 0) {
                                z4 = false;
                            }
                            c0187a = jt1.a.a;
                            if (i17 != 0) {
                                bj4VarO.K(-652118101);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new w05(2);
                                    bj4VarO.C(objF3);
                                }
                                oh4Var3 = (oh4) objF3;
                                bj4VarO.U(false);
                            }
                            if (i19 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i2;
                            }
                            if (i21 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i3;
                            }
                            if (i23 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            if (i26 != 0) {
                                ci4Var2 = null;
                            } else {
                                ci4Var2 = ci4Var;
                            }
                            if (i29 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i33 != 0) {
                                f2 = Float.NaN;
                            } else {
                                f2 = f;
                            }
                            bj4VarO.K(-652108692);
                            if (uh1Var2 == null) {
                                jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                            } else {
                                jB = uh1Var2.a;
                            }
                            objB = aa0.b(bj4VarO, false, -652103026);
                            if (objB == c0187a) {
                                objB = new jw0();
                                bj4VarO.C(objB);
                            }
                            fw0Var = (fw0) objB;
                            int i41112 = i35;
                            bj4VarO.U(false);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                c33 c33Var8 = wd3.a;
                                objF = m78.a(bj4VarO.x(), bj4VarO);
                            }
                            t72Var = (t72) objF;
                            uh1 uh1Var11 = uh1Var2;
                            String str14 = str3;
                            int i41113 = i7;
                            ox6 ox6VarB15 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                            IntercomTheme intercomTheme8 = IntercomTheme.INSTANCE;
                            int i41114 = IntercomTheme.$stable;
                            float f11 = f2;
                            ox6 ox6VarA8 = kw0.a(uma.a(ns0.a(ox6VarB15, 1.0f, jB, intercomTheme8.getShapes(bj4VarO, i41114).b), intercomTheme8.getShapes(bj4VarO, i41114).b), fw0Var);
                            bj4VarO.K(-652085201);
                            zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                            objF2 = bj4VarO.f();
                            if (zJ) {
                                objF2 = new w62(1, t72Var, fw0Var);
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new w62(1, t72Var, fw0Var);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarB16 = p84.b(ox6VarA8, (oh4) objF2);
                            pda pdaVarD8 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                            long j9 = uh1.j;
                            pda pdaVarA8 = pdaVarD8.a(((-14837) & 1) != 0 ? pdaVarD8.a : 0L, ((-14837) & 2) != 0 ? pdaVarD8.b : 0L, ((-14837) & 4) != 0 ? pdaVarD8.c : ac4.b(intercomTheme8, bj4VarO, i41114), pdaVarD8.d, ((-14837) & 16) != 0 ? pdaVarD8.e : intercomTheme8.getColors(bj4VarO, i41114).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD8.f : intercomTheme8.getColors(bj4VarO, i41114).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD8.g : intercomTheme8.getColors(bj4VarO, i41114).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD8.h : intercomTheme8.getColors(bj4VarO, i41114).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD8.i : j, pdaVarD8.j, ((-14837) & 1024) != 0 ? pdaVarD8.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD8.l : j9, ((-14837) & 4096) != 0 ? pdaVarD8.m : j9, ((-14837) & 8192) != 0 ? pdaVarD8.n : j9, pdaVarD8.o, pdaVarD8.p, pdaVarD8.q, pdaVarD8.r, pdaVarD8.s, pdaVarD8.t, pdaVarD8.u, pdaVarD8.v, pdaVarD8.w, pdaVarD8.x, pdaVarD8.y, pdaVarD8.z, pdaVarD8.A, pdaVarD8.B, pdaVarD8.C, pdaVarD8.D, pdaVarD8.E, pdaVarD8.F, pdaVarD8.G, pdaVarD8.H, pdaVarD8.I, pdaVarD8.J, pdaVarD8.K, pdaVarD8.L, pdaVarD8.M, pdaVarD8.N, pdaVarD8.O, pdaVarD8.P, pdaVarD8.Q);
                            dp5 dp5Var8 = new dp5(i37, i38, 115);
                            boolean z1111 = z4;
                            bp5 bp5Var8 = new bp5(oh4Var3, null, 59);
                            b72 b72Var8 = intercomTheme8.getShapes(bj4VarO, i41114).b;
                            final boolean z1112 = z5;
                            int i41115 = i37;
                            ci4<? super jt1, ? super Integer, g2b> ci4Var11 = ci4Var2;
                            bj4Var = bj4VarO;
                            boolean z1113 = z6;
                            ifa.a(str14, oh4Var, ox6VarB16, z1113, intercomTheme8.getTypography(bj4VarO, i41114).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                                public final void invoke(jt1 jt1Var2, int i41116) {
                                    if ((i41116 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else {
                                        mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), ci4Var11, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                                public final void invoke(jt1 jt1Var2, int i41116) {
                                    if ((i41116 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else if (z1112) {
                                        m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), null, dp5Var8, bp5Var8, z1111, i36, 0, b72Var8, pdaVarA8, bj4Var, ((i41112 << 3) & 7168) | (i41113 & 14) | 817889280 | ((i41113 >> 3) & 112) | ((i41112 << 21) & 234881024), (29360128 & (i41113 << 3)) | ((i41113 << 9) & 234881024), 1604688);
                            oh4Var4 = oh4Var3;
                            uh1Var3 = uh1Var11;
                            z7 = z1113;
                            ci4Var3 = ci4Var11;
                            z8 = z1111;
                            i39 = i36;
                            i40 = i38;
                            z9 = z1112;
                            f3 = f11;
                            str5 = str4;
                            i41 = i41115;
                            str6 = str14;
                        } else {
                            str4 = BuildConfig.FLAVOR;
                            if (i42 != 0) {
                                str3 = BuildConfig.FLAVOR;
                            }
                            if (i43 == 0) {
                                str4 = str2;
                            }
                            if (i9 != 0) {
                                uh1Var2 = null;
                            }
                            if (i12 != 0) {
                                i36 = Integer.MAX_VALUE;
                            } else {
                                i36 = i13;
                            }
                            if (i15 != 0) {
                                z4 = false;
                            }
                            c0187a = jt1.a.a;
                            if (i17 != 0) {
                                bj4VarO.K(-652118101);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new w05(2);
                                    bj4VarO.C(objF3);
                                }
                                oh4Var3 = (oh4) objF3;
                                bj4VarO.U(false);
                            }
                            if (i19 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i2;
                            }
                            if (i21 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i3;
                            }
                            if (i23 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            if (i26 != 0) {
                                ci4Var2 = null;
                            } else {
                                ci4Var2 = ci4Var;
                            }
                            if (i29 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i33 != 0) {
                                f2 = Float.NaN;
                            } else {
                                f2 = f;
                            }
                            bj4VarO.K(-652108692);
                            if (uh1Var2 == null) {
                                jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                            } else {
                                jB = uh1Var2.a;
                            }
                            objB = aa0.b(bj4VarO, false, -652103026);
                            if (objB == c0187a) {
                                objB = new jw0();
                                bj4VarO.C(objB);
                            }
                            fw0Var = (fw0) objB;
                            int i41116 = i35;
                            bj4VarO.U(false);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                c33 c33Var9 = wd3.a;
                                objF = m78.a(bj4VarO.x(), bj4VarO);
                            }
                            t72Var = (t72) objF;
                            uh1 uh1Var12 = uh1Var2;
                            String str15 = str3;
                            int i41117 = i7;
                            ox6 ox6VarB17 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                            IntercomTheme intercomTheme9 = IntercomTheme.INSTANCE;
                            int i41118 = IntercomTheme.$stable;
                            float f12 = f2;
                            ox6 ox6VarA9 = kw0.a(uma.a(ns0.a(ox6VarB17, 1.0f, jB, intercomTheme9.getShapes(bj4VarO, i41118).b), intercomTheme9.getShapes(bj4VarO, i41118).b), fw0Var);
                            bj4VarO.K(-652085201);
                            zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                            objF2 = bj4VarO.f();
                            if (zJ) {
                                objF2 = new w62(1, t72Var, fw0Var);
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new w62(1, t72Var, fw0Var);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarB18 = p84.b(ox6VarA9, (oh4) objF2);
                            pda pdaVarD9 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                            long j10 = uh1.j;
                            pda pdaVarA9 = pdaVarD9.a(((-14837) & 1) != 0 ? pdaVarD9.a : 0L, ((-14837) & 2) != 0 ? pdaVarD9.b : 0L, ((-14837) & 4) != 0 ? pdaVarD9.c : ac4.b(intercomTheme9, bj4VarO, i41118), pdaVarD9.d, ((-14837) & 16) != 0 ? pdaVarD9.e : intercomTheme9.getColors(bj4VarO, i41118).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD9.f : intercomTheme9.getColors(bj4VarO, i41118).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD9.g : intercomTheme9.getColors(bj4VarO, i41118).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD9.h : intercomTheme9.getColors(bj4VarO, i41118).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD9.i : j, pdaVarD9.j, ((-14837) & 1024) != 0 ? pdaVarD9.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD9.l : j10, ((-14837) & 4096) != 0 ? pdaVarD9.m : j10, ((-14837) & 8192) != 0 ? pdaVarD9.n : j10, pdaVarD9.o, pdaVarD9.p, pdaVarD9.q, pdaVarD9.r, pdaVarD9.s, pdaVarD9.t, pdaVarD9.u, pdaVarD9.v, pdaVarD9.w, pdaVarD9.x, pdaVarD9.y, pdaVarD9.z, pdaVarD9.A, pdaVarD9.B, pdaVarD9.C, pdaVarD9.D, pdaVarD9.E, pdaVarD9.F, pdaVarD9.G, pdaVarD9.H, pdaVarD9.I, pdaVarD9.J, pdaVarD9.K, pdaVarD9.L, pdaVarD9.M, pdaVarD9.N, pdaVarD9.O, pdaVarD9.P, pdaVarD9.Q);
                            dp5 dp5Var9 = new dp5(i37, i38, 115);
                            boolean z1114 = z4;
                            bp5 bp5Var9 = new bp5(oh4Var3, null, 59);
                            b72 b72Var9 = intercomTheme9.getShapes(bj4VarO, i41118).b;
                            final boolean z1115 = z5;
                            int i41119 = i37;
                            ci4<? super jt1, ? super Integer, g2b> ci4Var12 = ci4Var2;
                            bj4Var = bj4VarO;
                            boolean z1116 = z6;
                            ifa.a(str15, oh4Var, ox6VarB18, z1116, intercomTheme9.getTypography(bj4VarO, i41118).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                                public final void invoke(jt1 jt1Var2, int i411110) {
                                    if ((i411110 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else {
                                        mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), ci4Var12, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                                public final void invoke(jt1 jt1Var2, int i411110) {
                                    if ((i411110 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else if (z1115) {
                                        m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), null, dp5Var9, bp5Var9, z1114, i36, 0, b72Var9, pdaVarA9, bj4Var, ((i41116 << 3) & 7168) | (i41117 & 14) | 817889280 | ((i41117 >> 3) & 112) | ((i41116 << 21) & 234881024), (29360128 & (i41117 << 3)) | ((i41117 << 9) & 234881024), 1604688);
                            oh4Var4 = oh4Var3;
                            uh1Var3 = uh1Var12;
                            z7 = z1116;
                            ci4Var3 = ci4Var12;
                            z8 = z1114;
                            i39 = i36;
                            i40 = i38;
                            z9 = z1115;
                            f3 = f12;
                            str5 = str4;
                            i41 = i41119;
                            str6 = str15;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: vha
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i7 |= 805306368;
                    i23 = i6 & 1024;
                    if (i23 != 0) {
                        i24 = i5 | 6;
                    } else if ((i5 & 6) == 0) {
                        if (bj4VarO.c(z2)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i5 | i25;
                    } else {
                        i24 = i5;
                    }
                    i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    if (i26 != 0) {
                        i24 |= 48;
                    } else if ((i5 & 48) != 0) {
                        if (bj4VarO.j(ci4Var)) {
                            i27 = 32;
                        } else {
                            i27 = 16;
                        }
                        i24 |= i27;
                    }
                    i28 = i24;
                    i29 = i6 & 4096;
                    if (i29 != 0) {
                        i31 = i28 | 384;
                    } else {
                        i30 = i28;
                        if ((i5 & 384) != 0) {
                            if (bj4VarO.c(z3)) {
                                i32 = 256;
                            } else {
                                i32 = 128;
                            }
                            i30 |= i32;
                        }
                        i31 = i30;
                    }
                    i33 = i6 & 8192;
                    if (i33 != 0) {
                        i35 = i31 | 3072;
                    } else {
                        i34 = i31;
                        if ((i5 & 3072) == 0) {
                            i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                        } else {
                            i35 = i34;
                        }
                    }
                    if ((i7 & 306783379) != 306783378) {
                        str4 = BuildConfig.FLAVOR;
                        if (i42 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        if (i43 == 0) {
                            str4 = str2;
                        }
                        if (i9 != 0) {
                            uh1Var2 = null;
                        }
                        if (i12 != 0) {
                            i36 = Integer.MAX_VALUE;
                        } else {
                            i36 = i13;
                        }
                        if (i15 != 0) {
                            z4 = false;
                        }
                        c0187a = jt1.a.a;
                        if (i17 != 0) {
                            bj4VarO.K(-652118101);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new w05(2);
                                bj4VarO.C(objF3);
                            }
                            oh4Var3 = (oh4) objF3;
                            bj4VarO.U(false);
                        }
                        if (i19 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i2;
                        }
                        if (i21 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i3;
                        }
                        if (i23 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i26 != 0) {
                            ci4Var2 = null;
                        } else {
                            ci4Var2 = ci4Var;
                        }
                        if (i29 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i33 != 0) {
                            f2 = Float.NaN;
                        } else {
                            f2 = f;
                        }
                        bj4VarO.K(-652108692);
                        if (uh1Var2 == null) {
                            jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        } else {
                            jB = uh1Var2.a;
                        }
                        objB = aa0.b(bj4VarO, false, -652103026);
                        if (objB == c0187a) {
                            objB = new jw0();
                            bj4VarO.C(objB);
                        }
                        fw0Var = (fw0) objB;
                        int i411110 = i35;
                        bj4VarO.U(false);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var10 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72Var = (t72) objF;
                        uh1 uh1Var13 = uh1Var2;
                        String str16 = str3;
                        int i411111 = i7;
                        ox6 ox6VarB19 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                        IntercomTheme intercomTheme10 = IntercomTheme.INSTANCE;
                        int i411112 = IntercomTheme.$stable;
                        float f13 = f2;
                        ox6 ox6VarA10 = kw0.a(uma.a(ns0.a(ox6VarB19, 1.0f, jB, intercomTheme10.getShapes(bj4VarO, i411112).b), intercomTheme10.getShapes(bj4VarO, i411112).b), fw0Var);
                        bj4VarO.K(-652085201);
                        zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarB110 = p84.b(ox6VarA10, (oh4) objF2);
                        pda pdaVarD10 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                        long j11 = uh1.j;
                        pda pdaVarA10 = pdaVarD10.a(((-14837) & 1) != 0 ? pdaVarD10.a : 0L, ((-14837) & 2) != 0 ? pdaVarD10.b : 0L, ((-14837) & 4) != 0 ? pdaVarD10.c : ac4.b(intercomTheme10, bj4VarO, i411112), pdaVarD10.d, ((-14837) & 16) != 0 ? pdaVarD10.e : intercomTheme10.getColors(bj4VarO, i411112).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD10.f : intercomTheme10.getColors(bj4VarO, i411112).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD10.g : intercomTheme10.getColors(bj4VarO, i411112).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD10.h : intercomTheme10.getColors(bj4VarO, i411112).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD10.i : j, pdaVarD10.j, ((-14837) & 1024) != 0 ? pdaVarD10.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD10.l : j11, ((-14837) & 4096) != 0 ? pdaVarD10.m : j11, ((-14837) & 8192) != 0 ? pdaVarD10.n : j11, pdaVarD10.o, pdaVarD10.p, pdaVarD10.q, pdaVarD10.r, pdaVarD10.s, pdaVarD10.t, pdaVarD10.u, pdaVarD10.v, pdaVarD10.w, pdaVarD10.x, pdaVarD10.y, pdaVarD10.z, pdaVarD10.A, pdaVarD10.B, pdaVarD10.C, pdaVarD10.D, pdaVarD10.E, pdaVarD10.F, pdaVarD10.G, pdaVarD10.H, pdaVarD10.I, pdaVarD10.J, pdaVarD10.K, pdaVarD10.L, pdaVarD10.M, pdaVarD10.N, pdaVarD10.O, pdaVarD10.P, pdaVarD10.Q);
                        dp5 dp5Var10 = new dp5(i37, i38, 115);
                        boolean z1117 = z4;
                        bp5 bp5Var10 = new bp5(oh4Var3, null, 59);
                        b72 b72Var10 = intercomTheme10.getShapes(bj4VarO, i411112).b;
                        final boolean z1118 = z5;
                        int i411113 = i37;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var13 = ci4Var2;
                        bj4Var = bj4VarO;
                        boolean z1119 = z6;
                        ifa.a(str16, oh4Var, ox6VarB110, z1119, intercomTheme10.getTypography(bj4VarO, i411112).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            public final void invoke(jt1 jt1Var2, int i411114) {
                                if ((i411114 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ci4Var13, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            public final void invoke(jt1 jt1Var2, int i411114) {
                                if ((i411114 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else if (z1118) {
                                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, dp5Var10, bp5Var10, z1117, i36, 0, b72Var10, pdaVarA10, bj4Var, ((i411110 << 3) & 7168) | (i411111 & 14) | 817889280 | ((i411111 >> 3) & 112) | ((i411110 << 21) & 234881024), (29360128 & (i411111 << 3)) | ((i411111 << 9) & 234881024), 1604688);
                        oh4Var4 = oh4Var3;
                        uh1Var3 = uh1Var13;
                        z7 = z1119;
                        ci4Var3 = ci4Var13;
                        z8 = z1117;
                        i39 = i36;
                        i40 = i38;
                        z9 = z1118;
                        f3 = f13;
                        str5 = str4;
                        i41 = i411113;
                        str6 = str16;
                    } else {
                        str4 = BuildConfig.FLAVOR;
                        if (i42 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        if (i43 == 0) {
                            str4 = str2;
                        }
                        if (i9 != 0) {
                            uh1Var2 = null;
                        }
                        if (i12 != 0) {
                            i36 = Integer.MAX_VALUE;
                        } else {
                            i36 = i13;
                        }
                        if (i15 != 0) {
                            z4 = false;
                        }
                        c0187a = jt1.a.a;
                        if (i17 != 0) {
                            bj4VarO.K(-652118101);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new w05(2);
                                bj4VarO.C(objF3);
                            }
                            oh4Var3 = (oh4) objF3;
                            bj4VarO.U(false);
                        }
                        if (i19 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i2;
                        }
                        if (i21 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i3;
                        }
                        if (i23 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i26 != 0) {
                            ci4Var2 = null;
                        } else {
                            ci4Var2 = ci4Var;
                        }
                        if (i29 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i33 != 0) {
                            f2 = Float.NaN;
                        } else {
                            f2 = f;
                        }
                        bj4VarO.K(-652108692);
                        if (uh1Var2 == null) {
                            jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        } else {
                            jB = uh1Var2.a;
                        }
                        objB = aa0.b(bj4VarO, false, -652103026);
                        if (objB == c0187a) {
                            objB = new jw0();
                            bj4VarO.C(objB);
                        }
                        fw0Var = (fw0) objB;
                        int i411114 = i35;
                        bj4VarO.U(false);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var11 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72Var = (t72) objF;
                        uh1 uh1Var14 = uh1Var2;
                        String str17 = str3;
                        int i411115 = i7;
                        ox6 ox6VarB111 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                        IntercomTheme intercomTheme11 = IntercomTheme.INSTANCE;
                        int i411116 = IntercomTheme.$stable;
                        float f14 = f2;
                        ox6 ox6VarA11 = kw0.a(uma.a(ns0.a(ox6VarB111, 1.0f, jB, intercomTheme11.getShapes(bj4VarO, i411116).b), intercomTheme11.getShapes(bj4VarO, i411116).b), fw0Var);
                        bj4VarO.K(-652085201);
                        zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarB112 = p84.b(ox6VarA11, (oh4) objF2);
                        pda pdaVarD11 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                        long j12 = uh1.j;
                        pda pdaVarA11 = pdaVarD11.a(((-14837) & 1) != 0 ? pdaVarD11.a : 0L, ((-14837) & 2) != 0 ? pdaVarD11.b : 0L, ((-14837) & 4) != 0 ? pdaVarD11.c : ac4.b(intercomTheme11, bj4VarO, i411116), pdaVarD11.d, ((-14837) & 16) != 0 ? pdaVarD11.e : intercomTheme11.getColors(bj4VarO, i411116).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD11.f : intercomTheme11.getColors(bj4VarO, i411116).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD11.g : intercomTheme11.getColors(bj4VarO, i411116).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD11.h : intercomTheme11.getColors(bj4VarO, i411116).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD11.i : j, pdaVarD11.j, ((-14837) & 1024) != 0 ? pdaVarD11.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD11.l : j12, ((-14837) & 4096) != 0 ? pdaVarD11.m : j12, ((-14837) & 8192) != 0 ? pdaVarD11.n : j12, pdaVarD11.o, pdaVarD11.p, pdaVarD11.q, pdaVarD11.r, pdaVarD11.s, pdaVarD11.t, pdaVarD11.u, pdaVarD11.v, pdaVarD11.w, pdaVarD11.x, pdaVarD11.y, pdaVarD11.z, pdaVarD11.A, pdaVarD11.B, pdaVarD11.C, pdaVarD11.D, pdaVarD11.E, pdaVarD11.F, pdaVarD11.G, pdaVarD11.H, pdaVarD11.I, pdaVarD11.J, pdaVarD11.K, pdaVarD11.L, pdaVarD11.M, pdaVarD11.N, pdaVarD11.O, pdaVarD11.P, pdaVarD11.Q);
                        dp5 dp5Var11 = new dp5(i37, i38, 115);
                        boolean z11110 = z4;
                        bp5 bp5Var11 = new bp5(oh4Var3, null, 59);
                        b72 b72Var11 = intercomTheme11.getShapes(bj4VarO, i411116).b;
                        final boolean z11111 = z5;
                        int i411117 = i37;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var14 = ci4Var2;
                        bj4Var = bj4VarO;
                        boolean z11112 = z6;
                        ifa.a(str17, oh4Var, ox6VarB112, z11112, intercomTheme11.getTypography(bj4VarO, i411116).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            public final void invoke(jt1 jt1Var2, int i411118) {
                                if ((i411118 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ci4Var14, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            public final void invoke(jt1 jt1Var2, int i411118) {
                                if ((i411118 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else if (z11111) {
                                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, dp5Var11, bp5Var11, z11110, i36, 0, b72Var11, pdaVarA11, bj4Var, ((i411114 << 3) & 7168) | (i411115 & 14) | 817889280 | ((i411115 >> 3) & 112) | ((i411114 << 21) & 234881024), (29360128 & (i411115 << 3)) | ((i411115 << 9) & 234881024), 1604688);
                        oh4Var4 = oh4Var3;
                        uh1Var3 = uh1Var14;
                        z7 = z11112;
                        ci4Var3 = ci4Var14;
                        z8 = z11110;
                        i39 = i36;
                        i40 = i38;
                        z9 = z11111;
                        f3 = f14;
                        str5 = str4;
                        i41 = i411117;
                        str6 = str17;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: vha
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i7 |= 100663296;
                i21 = i6 & 512;
                if (i21 != 0) {
                    if ((i4 & 805306368) == 0) {
                        if (bj4VarO.h(i3)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i7 |= i22;
                    }
                    i23 = i6 & 1024;
                    if (i23 != 0) {
                        i24 = i5 | 6;
                    } else if ((i5 & 6) == 0) {
                        if (bj4VarO.c(z2)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i5 | i25;
                    } else {
                        i24 = i5;
                    }
                    i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    if (i26 != 0) {
                        i24 |= 48;
                    } else if ((i5 & 48) != 0) {
                        if (bj4VarO.j(ci4Var)) {
                            i27 = 32;
                        } else {
                            i27 = 16;
                        }
                        i24 |= i27;
                    }
                    i28 = i24;
                    i29 = i6 & 4096;
                    if (i29 != 0) {
                        i31 = i28 | 384;
                    } else {
                        i30 = i28;
                        if ((i5 & 384) != 0) {
                            if (bj4VarO.c(z3)) {
                                i32 = 256;
                            } else {
                                i32 = 128;
                            }
                            i30 |= i32;
                        }
                        i31 = i30;
                    }
                    i33 = i6 & 8192;
                    if (i33 != 0) {
                        i35 = i31 | 3072;
                    } else {
                        i34 = i31;
                        if ((i5 & 3072) == 0) {
                            i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                        } else {
                            i35 = i34;
                        }
                    }
                    if ((i7 & 306783379) != 306783378) {
                        str4 = BuildConfig.FLAVOR;
                        if (i42 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        if (i43 == 0) {
                            str4 = str2;
                        }
                        if (i9 != 0) {
                            uh1Var2 = null;
                        }
                        if (i12 != 0) {
                            i36 = Integer.MAX_VALUE;
                        } else {
                            i36 = i13;
                        }
                        if (i15 != 0) {
                            z4 = false;
                        }
                        c0187a = jt1.a.a;
                        if (i17 != 0) {
                            bj4VarO.K(-652118101);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new w05(2);
                                bj4VarO.C(objF3);
                            }
                            oh4Var3 = (oh4) objF3;
                            bj4VarO.U(false);
                        }
                        if (i19 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i2;
                        }
                        if (i21 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i3;
                        }
                        if (i23 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i26 != 0) {
                            ci4Var2 = null;
                        } else {
                            ci4Var2 = ci4Var;
                        }
                        if (i29 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i33 != 0) {
                            f2 = Float.NaN;
                        } else {
                            f2 = f;
                        }
                        bj4VarO.K(-652108692);
                        if (uh1Var2 == null) {
                            jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        } else {
                            jB = uh1Var2.a;
                        }
                        objB = aa0.b(bj4VarO, false, -652103026);
                        if (objB == c0187a) {
                            objB = new jw0();
                            bj4VarO.C(objB);
                        }
                        fw0Var = (fw0) objB;
                        int i411118 = i35;
                        bj4VarO.U(false);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var12 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72Var = (t72) objF;
                        uh1 uh1Var15 = uh1Var2;
                        String str18 = str3;
                        int i411119 = i7;
                        ox6 ox6VarB113 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                        IntercomTheme intercomTheme12 = IntercomTheme.INSTANCE;
                        int i4111110 = IntercomTheme.$stable;
                        float f15 = f2;
                        ox6 ox6VarA12 = kw0.a(uma.a(ns0.a(ox6VarB113, 1.0f, jB, intercomTheme12.getShapes(bj4VarO, i4111110).b), intercomTheme12.getShapes(bj4VarO, i4111110).b), fw0Var);
                        bj4VarO.K(-652085201);
                        zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarB114 = p84.b(ox6VarA12, (oh4) objF2);
                        pda pdaVarD12 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                        long j13 = uh1.j;
                        pda pdaVarA12 = pdaVarD12.a(((-14837) & 1) != 0 ? pdaVarD12.a : 0L, ((-14837) & 2) != 0 ? pdaVarD12.b : 0L, ((-14837) & 4) != 0 ? pdaVarD12.c : ac4.b(intercomTheme12, bj4VarO, i4111110), pdaVarD12.d, ((-14837) & 16) != 0 ? pdaVarD12.e : intercomTheme12.getColors(bj4VarO, i4111110).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD12.f : intercomTheme12.getColors(bj4VarO, i4111110).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD12.g : intercomTheme12.getColors(bj4VarO, i4111110).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD12.h : intercomTheme12.getColors(bj4VarO, i4111110).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD12.i : j, pdaVarD12.j, ((-14837) & 1024) != 0 ? pdaVarD12.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD12.l : j13, ((-14837) & 4096) != 0 ? pdaVarD12.m : j13, ((-14837) & 8192) != 0 ? pdaVarD12.n : j13, pdaVarD12.o, pdaVarD12.p, pdaVarD12.q, pdaVarD12.r, pdaVarD12.s, pdaVarD12.t, pdaVarD12.u, pdaVarD12.v, pdaVarD12.w, pdaVarD12.x, pdaVarD12.y, pdaVarD12.z, pdaVarD12.A, pdaVarD12.B, pdaVarD12.C, pdaVarD12.D, pdaVarD12.E, pdaVarD12.F, pdaVarD12.G, pdaVarD12.H, pdaVarD12.I, pdaVarD12.J, pdaVarD12.K, pdaVarD12.L, pdaVarD12.M, pdaVarD12.N, pdaVarD12.O, pdaVarD12.P, pdaVarD12.Q);
                        dp5 dp5Var12 = new dp5(i37, i38, 115);
                        boolean z11113 = z4;
                        bp5 bp5Var12 = new bp5(oh4Var3, null, 59);
                        b72 b72Var12 = intercomTheme12.getShapes(bj4VarO, i4111110).b;
                        final boolean z11114 = z5;
                        int i4111111 = i37;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var15 = ci4Var2;
                        bj4Var = bj4VarO;
                        boolean z11115 = z6;
                        ifa.a(str18, oh4Var, ox6VarB114, z11115, intercomTheme12.getTypography(bj4VarO, i4111110).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            public final void invoke(jt1 jt1Var2, int i4111112) {
                                if ((i4111112 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ci4Var15, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            public final void invoke(jt1 jt1Var2, int i4111112) {
                                if ((i4111112 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else if (z11114) {
                                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, dp5Var12, bp5Var12, z11113, i36, 0, b72Var12, pdaVarA12, bj4Var, ((i411118 << 3) & 7168) | (i411119 & 14) | 817889280 | ((i411119 >> 3) & 112) | ((i411118 << 21) & 234881024), (29360128 & (i411119 << 3)) | ((i411119 << 9) & 234881024), 1604688);
                        oh4Var4 = oh4Var3;
                        uh1Var3 = uh1Var15;
                        z7 = z11115;
                        ci4Var3 = ci4Var15;
                        z8 = z11113;
                        i39 = i36;
                        i40 = i38;
                        z9 = z11114;
                        f3 = f15;
                        str5 = str4;
                        i41 = i4111111;
                        str6 = str18;
                    } else {
                        str4 = BuildConfig.FLAVOR;
                        if (i42 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        if (i43 == 0) {
                            str4 = str2;
                        }
                        if (i9 != 0) {
                            uh1Var2 = null;
                        }
                        if (i12 != 0) {
                            i36 = Integer.MAX_VALUE;
                        } else {
                            i36 = i13;
                        }
                        if (i15 != 0) {
                            z4 = false;
                        }
                        c0187a = jt1.a.a;
                        if (i17 != 0) {
                            bj4VarO.K(-652118101);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new w05(2);
                                bj4VarO.C(objF3);
                            }
                            oh4Var3 = (oh4) objF3;
                            bj4VarO.U(false);
                        }
                        if (i19 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i2;
                        }
                        if (i21 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i3;
                        }
                        if (i23 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i26 != 0) {
                            ci4Var2 = null;
                        } else {
                            ci4Var2 = ci4Var;
                        }
                        if (i29 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i33 != 0) {
                            f2 = Float.NaN;
                        } else {
                            f2 = f;
                        }
                        bj4VarO.K(-652108692);
                        if (uh1Var2 == null) {
                            jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        } else {
                            jB = uh1Var2.a;
                        }
                        objB = aa0.b(bj4VarO, false, -652103026);
                        if (objB == c0187a) {
                            objB = new jw0();
                            bj4VarO.C(objB);
                        }
                        fw0Var = (fw0) objB;
                        int i4111112 = i35;
                        bj4VarO.U(false);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var13 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72Var = (t72) objF;
                        uh1 uh1Var16 = uh1Var2;
                        String str19 = str3;
                        int i4111113 = i7;
                        ox6 ox6VarB115 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                        IntercomTheme intercomTheme13 = IntercomTheme.INSTANCE;
                        int i4111114 = IntercomTheme.$stable;
                        float f16 = f2;
                        ox6 ox6VarA13 = kw0.a(uma.a(ns0.a(ox6VarB115, 1.0f, jB, intercomTheme13.getShapes(bj4VarO, i4111114).b), intercomTheme13.getShapes(bj4VarO, i4111114).b), fw0Var);
                        bj4VarO.K(-652085201);
                        zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarB116 = p84.b(ox6VarA13, (oh4) objF2);
                        pda pdaVarD13 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                        long j14 = uh1.j;
                        pda pdaVarA13 = pdaVarD13.a(((-14837) & 1) != 0 ? pdaVarD13.a : 0L, ((-14837) & 2) != 0 ? pdaVarD13.b : 0L, ((-14837) & 4) != 0 ? pdaVarD13.c : ac4.b(intercomTheme13, bj4VarO, i4111114), pdaVarD13.d, ((-14837) & 16) != 0 ? pdaVarD13.e : intercomTheme13.getColors(bj4VarO, i4111114).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD13.f : intercomTheme13.getColors(bj4VarO, i4111114).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD13.g : intercomTheme13.getColors(bj4VarO, i4111114).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD13.h : intercomTheme13.getColors(bj4VarO, i4111114).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD13.i : j, pdaVarD13.j, ((-14837) & 1024) != 0 ? pdaVarD13.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD13.l : j14, ((-14837) & 4096) != 0 ? pdaVarD13.m : j14, ((-14837) & 8192) != 0 ? pdaVarD13.n : j14, pdaVarD13.o, pdaVarD13.p, pdaVarD13.q, pdaVarD13.r, pdaVarD13.s, pdaVarD13.t, pdaVarD13.u, pdaVarD13.v, pdaVarD13.w, pdaVarD13.x, pdaVarD13.y, pdaVarD13.z, pdaVarD13.A, pdaVarD13.B, pdaVarD13.C, pdaVarD13.D, pdaVarD13.E, pdaVarD13.F, pdaVarD13.G, pdaVarD13.H, pdaVarD13.I, pdaVarD13.J, pdaVarD13.K, pdaVarD13.L, pdaVarD13.M, pdaVarD13.N, pdaVarD13.O, pdaVarD13.P, pdaVarD13.Q);
                        dp5 dp5Var13 = new dp5(i37, i38, 115);
                        boolean z11116 = z4;
                        bp5 bp5Var13 = new bp5(oh4Var3, null, 59);
                        b72 b72Var13 = intercomTheme13.getShapes(bj4VarO, i4111114).b;
                        final boolean z11117 = z5;
                        int i4111115 = i37;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var16 = ci4Var2;
                        bj4Var = bj4VarO;
                        boolean z11118 = z6;
                        ifa.a(str19, oh4Var, ox6VarB116, z11118, intercomTheme13.getTypography(bj4VarO, i4111114).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            public final void invoke(jt1 jt1Var2, int i4111116) {
                                if ((i4111116 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ci4Var16, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            public final void invoke(jt1 jt1Var2, int i4111116) {
                                if ((i4111116 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else if (z11117) {
                                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, dp5Var13, bp5Var13, z11116, i36, 0, b72Var13, pdaVarA13, bj4Var, ((i4111112 << 3) & 7168) | (i4111113 & 14) | 817889280 | ((i4111113 >> 3) & 112) | ((i4111112 << 21) & 234881024), (29360128 & (i4111113 << 3)) | ((i4111113 << 9) & 234881024), 1604688);
                        oh4Var4 = oh4Var3;
                        uh1Var3 = uh1Var16;
                        z7 = z11118;
                        ci4Var3 = ci4Var16;
                        z8 = z11116;
                        i39 = i36;
                        i40 = i38;
                        z9 = z11117;
                        f3 = f16;
                        str5 = str4;
                        i41 = i4111115;
                        str6 = str19;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: vha
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i7 |= 805306368;
                i23 = i6 & 1024;
                if (i23 != 0) {
                    i24 = i5 | 6;
                } else if ((i5 & 6) == 0) {
                    if (bj4VarO.c(z2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i5 | i25;
                } else {
                    i24 = i5;
                }
                i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                if (i26 != 0) {
                    i24 |= 48;
                } else if ((i5 & 48) != 0) {
                    if (bj4VarO.j(ci4Var)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i24 |= i27;
                }
                i28 = i24;
                i29 = i6 & 4096;
                if (i29 != 0) {
                    i31 = i28 | 384;
                } else {
                    i30 = i28;
                    if ((i5 & 384) != 0) {
                        if (bj4VarO.c(z3)) {
                            i32 = 256;
                        } else {
                            i32 = 128;
                        }
                        i30 |= i32;
                    }
                    i31 = i30;
                }
                i33 = i6 & 8192;
                if (i33 != 0) {
                    i35 = i31 | 3072;
                } else {
                    i34 = i31;
                    if ((i5 & 3072) == 0) {
                        i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                    } else {
                        i35 = i34;
                    }
                }
                if ((i7 & 306783379) != 306783378) {
                    str4 = BuildConfig.FLAVOR;
                    if (i42 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (i43 == 0) {
                        str4 = str2;
                    }
                    if (i9 != 0) {
                        uh1Var2 = null;
                    }
                    if (i12 != 0) {
                        i36 = Integer.MAX_VALUE;
                    } else {
                        i36 = i13;
                    }
                    if (i15 != 0) {
                        z4 = false;
                    }
                    c0187a = jt1.a.a;
                    if (i17 != 0) {
                        bj4VarO.K(-652118101);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new w05(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var3 = (oh4) objF3;
                        bj4VarO.U(false);
                    }
                    if (i19 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i2;
                    }
                    if (i21 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i3;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i26 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i29 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i33 != 0) {
                        f2 = Float.NaN;
                    } else {
                        f2 = f;
                    }
                    bj4VarO.K(-652108692);
                    if (uh1Var2 == null) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    } else {
                        jB = uh1Var2.a;
                    }
                    objB = aa0.b(bj4VarO, false, -652103026);
                    if (objB == c0187a) {
                        objB = new jw0();
                        bj4VarO.C(objB);
                    }
                    fw0Var = (fw0) objB;
                    int i4111116 = i35;
                    bj4VarO.U(false);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var14 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF;
                    uh1 uh1Var17 = uh1Var2;
                    String str110 = str3;
                    int i4111117 = i7;
                    ox6 ox6VarB117 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                    IntercomTheme intercomTheme14 = IntercomTheme.INSTANCE;
                    int i4111118 = IntercomTheme.$stable;
                    float f17 = f2;
                    ox6 ox6VarA14 = kw0.a(uma.a(ns0.a(ox6VarB117, 1.0f, jB, intercomTheme14.getShapes(bj4VarO, i4111118).b), intercomTheme14.getShapes(bj4VarO, i4111118).b), fw0Var);
                    bj4VarO.K(-652085201);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB118 = p84.b(ox6VarA14, (oh4) objF2);
                    pda pdaVarD14 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                    long j15 = uh1.j;
                    pda pdaVarA14 = pdaVarD14.a(((-14837) & 1) != 0 ? pdaVarD14.a : 0L, ((-14837) & 2) != 0 ? pdaVarD14.b : 0L, ((-14837) & 4) != 0 ? pdaVarD14.c : ac4.b(intercomTheme14, bj4VarO, i4111118), pdaVarD14.d, ((-14837) & 16) != 0 ? pdaVarD14.e : intercomTheme14.getColors(bj4VarO, i4111118).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD14.f : intercomTheme14.getColors(bj4VarO, i4111118).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD14.g : intercomTheme14.getColors(bj4VarO, i4111118).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD14.h : intercomTheme14.getColors(bj4VarO, i4111118).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD14.i : j, pdaVarD14.j, ((-14837) & 1024) != 0 ? pdaVarD14.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD14.l : j15, ((-14837) & 4096) != 0 ? pdaVarD14.m : j15, ((-14837) & 8192) != 0 ? pdaVarD14.n : j15, pdaVarD14.o, pdaVarD14.p, pdaVarD14.q, pdaVarD14.r, pdaVarD14.s, pdaVarD14.t, pdaVarD14.u, pdaVarD14.v, pdaVarD14.w, pdaVarD14.x, pdaVarD14.y, pdaVarD14.z, pdaVarD14.A, pdaVarD14.B, pdaVarD14.C, pdaVarD14.D, pdaVarD14.E, pdaVarD14.F, pdaVarD14.G, pdaVarD14.H, pdaVarD14.I, pdaVarD14.J, pdaVarD14.K, pdaVarD14.L, pdaVarD14.M, pdaVarD14.N, pdaVarD14.O, pdaVarD14.P, pdaVarD14.Q);
                    dp5 dp5Var14 = new dp5(i37, i38, 115);
                    boolean z11119 = z4;
                    bp5 bp5Var14 = new bp5(oh4Var3, null, 59);
                    b72 b72Var14 = intercomTheme14.getShapes(bj4VarO, i4111118).b;
                    final boolean z111110 = z5;
                    int i4111119 = i37;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var17 = ci4Var2;
                    bj4Var = bj4VarO;
                    boolean z111111 = z6;
                    ifa.a(str110, oh4Var, ox6VarB118, z111111, intercomTheme14.getTypography(bj4VarO, i4111118).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        public final void invoke(jt1 jt1Var2, int i41111110) {
                            if ((i41111110 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ci4Var17, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        public final void invoke(jt1 jt1Var2, int i41111110) {
                            if ((i41111110 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else if (z111110) {
                                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, dp5Var14, bp5Var14, z11119, i36, 0, b72Var14, pdaVarA14, bj4Var, ((i4111116 << 3) & 7168) | (i4111117 & 14) | 817889280 | ((i4111117 >> 3) & 112) | ((i4111116 << 21) & 234881024), (29360128 & (i4111117 << 3)) | ((i4111117 << 9) & 234881024), 1604688);
                    oh4Var4 = oh4Var3;
                    uh1Var3 = uh1Var17;
                    z7 = z111111;
                    ci4Var3 = ci4Var17;
                    z8 = z11119;
                    i39 = i36;
                    i40 = i38;
                    z9 = z111110;
                    f3 = f17;
                    str5 = str4;
                    i41 = i4111119;
                    str6 = str110;
                } else {
                    str4 = BuildConfig.FLAVOR;
                    if (i42 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (i43 == 0) {
                        str4 = str2;
                    }
                    if (i9 != 0) {
                        uh1Var2 = null;
                    }
                    if (i12 != 0) {
                        i36 = Integer.MAX_VALUE;
                    } else {
                        i36 = i13;
                    }
                    if (i15 != 0) {
                        z4 = false;
                    }
                    c0187a = jt1.a.a;
                    if (i17 != 0) {
                        bj4VarO.K(-652118101);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new w05(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var3 = (oh4) objF3;
                        bj4VarO.U(false);
                    }
                    if (i19 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i2;
                    }
                    if (i21 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i3;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i26 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i29 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i33 != 0) {
                        f2 = Float.NaN;
                    } else {
                        f2 = f;
                    }
                    bj4VarO.K(-652108692);
                    if (uh1Var2 == null) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    } else {
                        jB = uh1Var2.a;
                    }
                    objB = aa0.b(bj4VarO, false, -652103026);
                    if (objB == c0187a) {
                        objB = new jw0();
                        bj4VarO.C(objB);
                    }
                    fw0Var = (fw0) objB;
                    int i41111110 = i35;
                    bj4VarO.U(false);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var15 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF;
                    uh1 uh1Var18 = uh1Var2;
                    String str111 = str3;
                    int i41111111 = i7;
                    ox6 ox6VarB119 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                    IntercomTheme intercomTheme15 = IntercomTheme.INSTANCE;
                    int i41111112 = IntercomTheme.$stable;
                    float f18 = f2;
                    ox6 ox6VarA15 = kw0.a(uma.a(ns0.a(ox6VarB119, 1.0f, jB, intercomTheme15.getShapes(bj4VarO, i41111112).b), intercomTheme15.getShapes(bj4VarO, i41111112).b), fw0Var);
                    bj4VarO.K(-652085201);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB1110 = p84.b(ox6VarA15, (oh4) objF2);
                    pda pdaVarD15 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                    long j16 = uh1.j;
                    pda pdaVarA15 = pdaVarD15.a(((-14837) & 1) != 0 ? pdaVarD15.a : 0L, ((-14837) & 2) != 0 ? pdaVarD15.b : 0L, ((-14837) & 4) != 0 ? pdaVarD15.c : ac4.b(intercomTheme15, bj4VarO, i41111112), pdaVarD15.d, ((-14837) & 16) != 0 ? pdaVarD15.e : intercomTheme15.getColors(bj4VarO, i41111112).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD15.f : intercomTheme15.getColors(bj4VarO, i41111112).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD15.g : intercomTheme15.getColors(bj4VarO, i41111112).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD15.h : intercomTheme15.getColors(bj4VarO, i41111112).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD15.i : j, pdaVarD15.j, ((-14837) & 1024) != 0 ? pdaVarD15.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD15.l : j16, ((-14837) & 4096) != 0 ? pdaVarD15.m : j16, ((-14837) & 8192) != 0 ? pdaVarD15.n : j16, pdaVarD15.o, pdaVarD15.p, pdaVarD15.q, pdaVarD15.r, pdaVarD15.s, pdaVarD15.t, pdaVarD15.u, pdaVarD15.v, pdaVarD15.w, pdaVarD15.x, pdaVarD15.y, pdaVarD15.z, pdaVarD15.A, pdaVarD15.B, pdaVarD15.C, pdaVarD15.D, pdaVarD15.E, pdaVarD15.F, pdaVarD15.G, pdaVarD15.H, pdaVarD15.I, pdaVarD15.J, pdaVarD15.K, pdaVarD15.L, pdaVarD15.M, pdaVarD15.N, pdaVarD15.O, pdaVarD15.P, pdaVarD15.Q);
                    dp5 dp5Var15 = new dp5(i37, i38, 115);
                    boolean z111112 = z4;
                    bp5 bp5Var15 = new bp5(oh4Var3, null, 59);
                    b72 b72Var15 = intercomTheme15.getShapes(bj4VarO, i41111112).b;
                    final boolean z111113 = z5;
                    int i41111113 = i37;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var18 = ci4Var2;
                    bj4Var = bj4VarO;
                    boolean z111114 = z6;
                    ifa.a(str111, oh4Var, ox6VarB1110, z111114, intercomTheme15.getTypography(bj4VarO, i41111112).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        public final void invoke(jt1 jt1Var2, int i41111114) {
                            if ((i41111114 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ci4Var18, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        public final void invoke(jt1 jt1Var2, int i41111114) {
                            if ((i41111114 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else if (z111113) {
                                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, dp5Var15, bp5Var15, z111112, i36, 0, b72Var15, pdaVarA15, bj4Var, ((i41111110 << 3) & 7168) | (i41111111 & 14) | 817889280 | ((i41111111 >> 3) & 112) | ((i41111110 << 21) & 234881024), (29360128 & (i41111111 << 3)) | ((i41111111 << 9) & 234881024), 1604688);
                    oh4Var4 = oh4Var3;
                    uh1Var3 = uh1Var18;
                    z7 = z111114;
                    ci4Var3 = ci4Var18;
                    z8 = z111112;
                    i39 = i36;
                    i40 = i38;
                    z9 = z111113;
                    f3 = f18;
                    str5 = str4;
                    i41 = i41111113;
                    str6 = str111;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: vha
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i7 |= 384;
            i9 = i6 & 8;
            if (i9 != 0) {
                if ((i4 & 3072) == 0) {
                    uh1Var2 = uh1Var;
                    if (bj4VarO.J(uh1Var2)) {
                        i10 = 2048;
                    } else {
                        i10 = 1024;
                    }
                    i7 |= i10;
                }
                if ((i6 & 16) != 0) {
                    i7 |= 24576;
                } else if ((i4 & 24576) == 0) {
                    if (bj4VarO.i(j)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i7 |= i11;
                }
                i12 = i6 & 32;
                if (i12 != 0) {
                    i7 |= 196608;
                    i13 = i;
                } else {
                    i13 = i;
                    if ((i4 & 196608) == 0) {
                        if (bj4VarO.h(i13)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i7 |= i14;
                    }
                }
                i15 = i6 & 64;
                if (i15 != 0) {
                    i7 |= 1572864;
                    z4 = z;
                } else {
                    z4 = z;
                    if ((i4 & 1572864) == 0) {
                        if (bj4VarO.c(z4)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i7 |= i16;
                    }
                }
                i17 = i6 & 128;
                if (i17 != 0) {
                    i7 |= 12582912;
                    oh4Var3 = oh4Var2;
                } else {
                    oh4Var3 = oh4Var2;
                    if ((i4 & 12582912) == 0) {
                        if (bj4VarO.j(oh4Var3)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i7 |= i18;
                    }
                }
                i19 = i6 & 256;
                if (i19 != 0) {
                    if ((i4 & 100663296) == 0) {
                        if (bj4VarO.h(i2)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i7 |= i20;
                    }
                    i21 = i6 & 512;
                    if (i21 != 0) {
                        if ((i4 & 805306368) == 0) {
                            if (bj4VarO.h(i3)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i7 |= i22;
                        }
                        i23 = i6 & 1024;
                        if (i23 != 0) {
                            i24 = i5 | 6;
                        } else if ((i5 & 6) == 0) {
                            if (bj4VarO.c(z2)) {
                                i25 = 4;
                            } else {
                                i25 = 2;
                            }
                            i24 = i5 | i25;
                        } else {
                            i24 = i5;
                        }
                        i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                        if (i26 != 0) {
                            i24 |= 48;
                        } else if ((i5 & 48) != 0) {
                            if (bj4VarO.j(ci4Var)) {
                                i27 = 32;
                            } else {
                                i27 = 16;
                            }
                            i24 |= i27;
                        }
                        i28 = i24;
                        i29 = i6 & 4096;
                        if (i29 != 0) {
                            i31 = i28 | 384;
                        } else {
                            i30 = i28;
                            if ((i5 & 384) != 0) {
                                if (bj4VarO.c(z3)) {
                                    i32 = 256;
                                } else {
                                    i32 = 128;
                                }
                                i30 |= i32;
                            }
                            i31 = i30;
                        }
                        i33 = i6 & 8192;
                        if (i33 != 0) {
                            i35 = i31 | 3072;
                        } else {
                            i34 = i31;
                            if ((i5 & 3072) == 0) {
                                i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                            } else {
                                i35 = i34;
                            }
                        }
                        if ((i7 & 306783379) != 306783378) {
                            str4 = BuildConfig.FLAVOR;
                            if (i42 != 0) {
                                str3 = BuildConfig.FLAVOR;
                            }
                            if (i43 == 0) {
                                str4 = str2;
                            }
                            if (i9 != 0) {
                                uh1Var2 = null;
                            }
                            if (i12 != 0) {
                                i36 = Integer.MAX_VALUE;
                            } else {
                                i36 = i13;
                            }
                            if (i15 != 0) {
                                z4 = false;
                            }
                            c0187a = jt1.a.a;
                            if (i17 != 0) {
                                bj4VarO.K(-652118101);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new w05(2);
                                    bj4VarO.C(objF3);
                                }
                                oh4Var3 = (oh4) objF3;
                                bj4VarO.U(false);
                            }
                            if (i19 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i2;
                            }
                            if (i21 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i3;
                            }
                            if (i23 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            if (i26 != 0) {
                                ci4Var2 = null;
                            } else {
                                ci4Var2 = ci4Var;
                            }
                            if (i29 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i33 != 0) {
                                f2 = Float.NaN;
                            } else {
                                f2 = f;
                            }
                            bj4VarO.K(-652108692);
                            if (uh1Var2 == null) {
                                jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                            } else {
                                jB = uh1Var2.a;
                            }
                            objB = aa0.b(bj4VarO, false, -652103026);
                            if (objB == c0187a) {
                                objB = new jw0();
                                bj4VarO.C(objB);
                            }
                            fw0Var = (fw0) objB;
                            int i41111114 = i35;
                            bj4VarO.U(false);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                c33 c33Var16 = wd3.a;
                                objF = m78.a(bj4VarO.x(), bj4VarO);
                            }
                            t72Var = (t72) objF;
                            uh1 uh1Var19 = uh1Var2;
                            String str112 = str3;
                            int i41111115 = i7;
                            ox6 ox6VarB1111 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                            IntercomTheme intercomTheme16 = IntercomTheme.INSTANCE;
                            int i41111116 = IntercomTheme.$stable;
                            float f19 = f2;
                            ox6 ox6VarA16 = kw0.a(uma.a(ns0.a(ox6VarB1111, 1.0f, jB, intercomTheme16.getShapes(bj4VarO, i41111116).b), intercomTheme16.getShapes(bj4VarO, i41111116).b), fw0Var);
                            bj4VarO.K(-652085201);
                            zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                            objF2 = bj4VarO.f();
                            if (zJ) {
                                objF2 = new w62(1, t72Var, fw0Var);
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new w62(1, t72Var, fw0Var);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarB1112 = p84.b(ox6VarA16, (oh4) objF2);
                            pda pdaVarD16 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                            long j17 = uh1.j;
                            pda pdaVarA16 = pdaVarD16.a(((-14837) & 1) != 0 ? pdaVarD16.a : 0L, ((-14837) & 2) != 0 ? pdaVarD16.b : 0L, ((-14837) & 4) != 0 ? pdaVarD16.c : ac4.b(intercomTheme16, bj4VarO, i41111116), pdaVarD16.d, ((-14837) & 16) != 0 ? pdaVarD16.e : intercomTheme16.getColors(bj4VarO, i41111116).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD16.f : intercomTheme16.getColors(bj4VarO, i41111116).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD16.g : intercomTheme16.getColors(bj4VarO, i41111116).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD16.h : intercomTheme16.getColors(bj4VarO, i41111116).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD16.i : j, pdaVarD16.j, ((-14837) & 1024) != 0 ? pdaVarD16.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD16.l : j17, ((-14837) & 4096) != 0 ? pdaVarD16.m : j17, ((-14837) & 8192) != 0 ? pdaVarD16.n : j17, pdaVarD16.o, pdaVarD16.p, pdaVarD16.q, pdaVarD16.r, pdaVarD16.s, pdaVarD16.t, pdaVarD16.u, pdaVarD16.v, pdaVarD16.w, pdaVarD16.x, pdaVarD16.y, pdaVarD16.z, pdaVarD16.A, pdaVarD16.B, pdaVarD16.C, pdaVarD16.D, pdaVarD16.E, pdaVarD16.F, pdaVarD16.G, pdaVarD16.H, pdaVarD16.I, pdaVarD16.J, pdaVarD16.K, pdaVarD16.L, pdaVarD16.M, pdaVarD16.N, pdaVarD16.O, pdaVarD16.P, pdaVarD16.Q);
                            dp5 dp5Var16 = new dp5(i37, i38, 115);
                            boolean z111115 = z4;
                            bp5 bp5Var16 = new bp5(oh4Var3, null, 59);
                            b72 b72Var16 = intercomTheme16.getShapes(bj4VarO, i41111116).b;
                            final boolean z111116 = z5;
                            int i41111117 = i37;
                            ci4<? super jt1, ? super Integer, g2b> ci4Var19 = ci4Var2;
                            bj4Var = bj4VarO;
                            boolean z111117 = z6;
                            ifa.a(str112, oh4Var, ox6VarB1112, z111117, intercomTheme16.getTypography(bj4VarO, i41111116).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                                public final void invoke(jt1 jt1Var2, int i41111118) {
                                    if ((i41111118 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else {
                                        mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), ci4Var19, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                                public final void invoke(jt1 jt1Var2, int i41111118) {
                                    if ((i41111118 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else if (z111116) {
                                        m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), null, dp5Var16, bp5Var16, z111115, i36, 0, b72Var16, pdaVarA16, bj4Var, ((i41111114 << 3) & 7168) | (i41111115 & 14) | 817889280 | ((i41111115 >> 3) & 112) | ((i41111114 << 21) & 234881024), (29360128 & (i41111115 << 3)) | ((i41111115 << 9) & 234881024), 1604688);
                            oh4Var4 = oh4Var3;
                            uh1Var3 = uh1Var19;
                            z7 = z111117;
                            ci4Var3 = ci4Var19;
                            z8 = z111115;
                            i39 = i36;
                            i40 = i38;
                            z9 = z111116;
                            f3 = f19;
                            str5 = str4;
                            i41 = i41111117;
                            str6 = str112;
                        } else {
                            str4 = BuildConfig.FLAVOR;
                            if (i42 != 0) {
                                str3 = BuildConfig.FLAVOR;
                            }
                            if (i43 == 0) {
                                str4 = str2;
                            }
                            if (i9 != 0) {
                                uh1Var2 = null;
                            }
                            if (i12 != 0) {
                                i36 = Integer.MAX_VALUE;
                            } else {
                                i36 = i13;
                            }
                            if (i15 != 0) {
                                z4 = false;
                            }
                            c0187a = jt1.a.a;
                            if (i17 != 0) {
                                bj4VarO.K(-652118101);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new w05(2);
                                    bj4VarO.C(objF3);
                                }
                                oh4Var3 = (oh4) objF3;
                                bj4VarO.U(false);
                            }
                            if (i19 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i2;
                            }
                            if (i21 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i3;
                            }
                            if (i23 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            if (i26 != 0) {
                                ci4Var2 = null;
                            } else {
                                ci4Var2 = ci4Var;
                            }
                            if (i29 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i33 != 0) {
                                f2 = Float.NaN;
                            } else {
                                f2 = f;
                            }
                            bj4VarO.K(-652108692);
                            if (uh1Var2 == null) {
                                jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                            } else {
                                jB = uh1Var2.a;
                            }
                            objB = aa0.b(bj4VarO, false, -652103026);
                            if (objB == c0187a) {
                                objB = new jw0();
                                bj4VarO.C(objB);
                            }
                            fw0Var = (fw0) objB;
                            int i41111118 = i35;
                            bj4VarO.U(false);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                c33 c33Var17 = wd3.a;
                                objF = m78.a(bj4VarO.x(), bj4VarO);
                            }
                            t72Var = (t72) objF;
                            uh1 uh1Var110 = uh1Var2;
                            String str113 = str3;
                            int i41111119 = i7;
                            ox6 ox6VarB1113 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                            IntercomTheme intercomTheme17 = IntercomTheme.INSTANCE;
                            int i411111110 = IntercomTheme.$stable;
                            float f110 = f2;
                            ox6 ox6VarA17 = kw0.a(uma.a(ns0.a(ox6VarB1113, 1.0f, jB, intercomTheme17.getShapes(bj4VarO, i411111110).b), intercomTheme17.getShapes(bj4VarO, i411111110).b), fw0Var);
                            bj4VarO.K(-652085201);
                            zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                            objF2 = bj4VarO.f();
                            if (zJ) {
                                objF2 = new w62(1, t72Var, fw0Var);
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new w62(1, t72Var, fw0Var);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarB1114 = p84.b(ox6VarA17, (oh4) objF2);
                            pda pdaVarD17 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                            long j18 = uh1.j;
                            pda pdaVarA17 = pdaVarD17.a(((-14837) & 1) != 0 ? pdaVarD17.a : 0L, ((-14837) & 2) != 0 ? pdaVarD17.b : 0L, ((-14837) & 4) != 0 ? pdaVarD17.c : ac4.b(intercomTheme17, bj4VarO, i411111110), pdaVarD17.d, ((-14837) & 16) != 0 ? pdaVarD17.e : intercomTheme17.getColors(bj4VarO, i411111110).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD17.f : intercomTheme17.getColors(bj4VarO, i411111110).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD17.g : intercomTheme17.getColors(bj4VarO, i411111110).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD17.h : intercomTheme17.getColors(bj4VarO, i411111110).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD17.i : j, pdaVarD17.j, ((-14837) & 1024) != 0 ? pdaVarD17.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD17.l : j18, ((-14837) & 4096) != 0 ? pdaVarD17.m : j18, ((-14837) & 8192) != 0 ? pdaVarD17.n : j18, pdaVarD17.o, pdaVarD17.p, pdaVarD17.q, pdaVarD17.r, pdaVarD17.s, pdaVarD17.t, pdaVarD17.u, pdaVarD17.v, pdaVarD17.w, pdaVarD17.x, pdaVarD17.y, pdaVarD17.z, pdaVarD17.A, pdaVarD17.B, pdaVarD17.C, pdaVarD17.D, pdaVarD17.E, pdaVarD17.F, pdaVarD17.G, pdaVarD17.H, pdaVarD17.I, pdaVarD17.J, pdaVarD17.K, pdaVarD17.L, pdaVarD17.M, pdaVarD17.N, pdaVarD17.O, pdaVarD17.P, pdaVarD17.Q);
                            dp5 dp5Var17 = new dp5(i37, i38, 115);
                            boolean z111118 = z4;
                            bp5 bp5Var17 = new bp5(oh4Var3, null, 59);
                            b72 b72Var17 = intercomTheme17.getShapes(bj4VarO, i411111110).b;
                            final boolean z111119 = z5;
                            int i411111111 = i37;
                            ci4<? super jt1, ? super Integer, g2b> ci4Var110 = ci4Var2;
                            bj4Var = bj4VarO;
                            boolean z1111110 = z6;
                            ifa.a(str113, oh4Var, ox6VarB1114, z1111110, intercomTheme17.getTypography(bj4VarO, i411111110).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                                public final void invoke(jt1 jt1Var2, int i411111112) {
                                    if ((i411111112 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else {
                                        mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), ci4Var110, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                                public final void invoke(jt1 jt1Var2, int i411111112) {
                                    if ((i411111112 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else if (z111119) {
                                        m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), null, dp5Var17, bp5Var17, z111118, i36, 0, b72Var17, pdaVarA17, bj4Var, ((i41111118 << 3) & 7168) | (i41111119 & 14) | 817889280 | ((i41111119 >> 3) & 112) | ((i41111118 << 21) & 234881024), (29360128 & (i41111119 << 3)) | ((i41111119 << 9) & 234881024), 1604688);
                            oh4Var4 = oh4Var3;
                            uh1Var3 = uh1Var110;
                            z7 = z1111110;
                            ci4Var3 = ci4Var110;
                            z8 = z111118;
                            i39 = i36;
                            i40 = i38;
                            z9 = z111119;
                            f3 = f110;
                            str5 = str4;
                            i41 = i411111111;
                            str6 = str113;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: vha
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i7 |= 805306368;
                    i23 = i6 & 1024;
                    if (i23 != 0) {
                        i24 = i5 | 6;
                    } else if ((i5 & 6) == 0) {
                        if (bj4VarO.c(z2)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i5 | i25;
                    } else {
                        i24 = i5;
                    }
                    i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    if (i26 != 0) {
                        i24 |= 48;
                    } else if ((i5 & 48) != 0) {
                        if (bj4VarO.j(ci4Var)) {
                            i27 = 32;
                        } else {
                            i27 = 16;
                        }
                        i24 |= i27;
                    }
                    i28 = i24;
                    i29 = i6 & 4096;
                    if (i29 != 0) {
                        i31 = i28 | 384;
                    } else {
                        i30 = i28;
                        if ((i5 & 384) != 0) {
                            if (bj4VarO.c(z3)) {
                                i32 = 256;
                            } else {
                                i32 = 128;
                            }
                            i30 |= i32;
                        }
                        i31 = i30;
                    }
                    i33 = i6 & 8192;
                    if (i33 != 0) {
                        i35 = i31 | 3072;
                    } else {
                        i34 = i31;
                        if ((i5 & 3072) == 0) {
                            i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                        } else {
                            i35 = i34;
                        }
                    }
                    if ((i7 & 306783379) != 306783378) {
                        str4 = BuildConfig.FLAVOR;
                        if (i42 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        if (i43 == 0) {
                            str4 = str2;
                        }
                        if (i9 != 0) {
                            uh1Var2 = null;
                        }
                        if (i12 != 0) {
                            i36 = Integer.MAX_VALUE;
                        } else {
                            i36 = i13;
                        }
                        if (i15 != 0) {
                            z4 = false;
                        }
                        c0187a = jt1.a.a;
                        if (i17 != 0) {
                            bj4VarO.K(-652118101);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new w05(2);
                                bj4VarO.C(objF3);
                            }
                            oh4Var3 = (oh4) objF3;
                            bj4VarO.U(false);
                        }
                        if (i19 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i2;
                        }
                        if (i21 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i3;
                        }
                        if (i23 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i26 != 0) {
                            ci4Var2 = null;
                        } else {
                            ci4Var2 = ci4Var;
                        }
                        if (i29 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i33 != 0) {
                            f2 = Float.NaN;
                        } else {
                            f2 = f;
                        }
                        bj4VarO.K(-652108692);
                        if (uh1Var2 == null) {
                            jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        } else {
                            jB = uh1Var2.a;
                        }
                        objB = aa0.b(bj4VarO, false, -652103026);
                        if (objB == c0187a) {
                            objB = new jw0();
                            bj4VarO.C(objB);
                        }
                        fw0Var = (fw0) objB;
                        int i411111112 = i35;
                        bj4VarO.U(false);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var18 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72Var = (t72) objF;
                        uh1 uh1Var111 = uh1Var2;
                        String str114 = str3;
                        int i411111113 = i7;
                        ox6 ox6VarB1115 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                        IntercomTheme intercomTheme18 = IntercomTheme.INSTANCE;
                        int i411111114 = IntercomTheme.$stable;
                        float f111 = f2;
                        ox6 ox6VarA18 = kw0.a(uma.a(ns0.a(ox6VarB1115, 1.0f, jB, intercomTheme18.getShapes(bj4VarO, i411111114).b), intercomTheme18.getShapes(bj4VarO, i411111114).b), fw0Var);
                        bj4VarO.K(-652085201);
                        zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarB1116 = p84.b(ox6VarA18, (oh4) objF2);
                        pda pdaVarD18 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                        long j19 = uh1.j;
                        pda pdaVarA18 = pdaVarD18.a(((-14837) & 1) != 0 ? pdaVarD18.a : 0L, ((-14837) & 2) != 0 ? pdaVarD18.b : 0L, ((-14837) & 4) != 0 ? pdaVarD18.c : ac4.b(intercomTheme18, bj4VarO, i411111114), pdaVarD18.d, ((-14837) & 16) != 0 ? pdaVarD18.e : intercomTheme18.getColors(bj4VarO, i411111114).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD18.f : intercomTheme18.getColors(bj4VarO, i411111114).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD18.g : intercomTheme18.getColors(bj4VarO, i411111114).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD18.h : intercomTheme18.getColors(bj4VarO, i411111114).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD18.i : j, pdaVarD18.j, ((-14837) & 1024) != 0 ? pdaVarD18.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD18.l : j19, ((-14837) & 4096) != 0 ? pdaVarD18.m : j19, ((-14837) & 8192) != 0 ? pdaVarD18.n : j19, pdaVarD18.o, pdaVarD18.p, pdaVarD18.q, pdaVarD18.r, pdaVarD18.s, pdaVarD18.t, pdaVarD18.u, pdaVarD18.v, pdaVarD18.w, pdaVarD18.x, pdaVarD18.y, pdaVarD18.z, pdaVarD18.A, pdaVarD18.B, pdaVarD18.C, pdaVarD18.D, pdaVarD18.E, pdaVarD18.F, pdaVarD18.G, pdaVarD18.H, pdaVarD18.I, pdaVarD18.J, pdaVarD18.K, pdaVarD18.L, pdaVarD18.M, pdaVarD18.N, pdaVarD18.O, pdaVarD18.P, pdaVarD18.Q);
                        dp5 dp5Var18 = new dp5(i37, i38, 115);
                        boolean z1111111 = z4;
                        bp5 bp5Var18 = new bp5(oh4Var3, null, 59);
                        b72 b72Var18 = intercomTheme18.getShapes(bj4VarO, i411111114).b;
                        final boolean z1111112 = z5;
                        int i411111115 = i37;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var111 = ci4Var2;
                        bj4Var = bj4VarO;
                        boolean z1111113 = z6;
                        ifa.a(str114, oh4Var, ox6VarB1116, z1111113, intercomTheme18.getTypography(bj4VarO, i411111114).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            public final void invoke(jt1 jt1Var2, int i411111116) {
                                if ((i411111116 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ci4Var111, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            public final void invoke(jt1 jt1Var2, int i411111116) {
                                if ((i411111116 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else if (z1111112) {
                                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, dp5Var18, bp5Var18, z1111111, i36, 0, b72Var18, pdaVarA18, bj4Var, ((i411111112 << 3) & 7168) | (i411111113 & 14) | 817889280 | ((i411111113 >> 3) & 112) | ((i411111112 << 21) & 234881024), (29360128 & (i411111113 << 3)) | ((i411111113 << 9) & 234881024), 1604688);
                        oh4Var4 = oh4Var3;
                        uh1Var3 = uh1Var111;
                        z7 = z1111113;
                        ci4Var3 = ci4Var111;
                        z8 = z1111111;
                        i39 = i36;
                        i40 = i38;
                        z9 = z1111112;
                        f3 = f111;
                        str5 = str4;
                        i41 = i411111115;
                        str6 = str114;
                    } else {
                        str4 = BuildConfig.FLAVOR;
                        if (i42 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        if (i43 == 0) {
                            str4 = str2;
                        }
                        if (i9 != 0) {
                            uh1Var2 = null;
                        }
                        if (i12 != 0) {
                            i36 = Integer.MAX_VALUE;
                        } else {
                            i36 = i13;
                        }
                        if (i15 != 0) {
                            z4 = false;
                        }
                        c0187a = jt1.a.a;
                        if (i17 != 0) {
                            bj4VarO.K(-652118101);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new w05(2);
                                bj4VarO.C(objF3);
                            }
                            oh4Var3 = (oh4) objF3;
                            bj4VarO.U(false);
                        }
                        if (i19 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i2;
                        }
                        if (i21 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i3;
                        }
                        if (i23 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i26 != 0) {
                            ci4Var2 = null;
                        } else {
                            ci4Var2 = ci4Var;
                        }
                        if (i29 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i33 != 0) {
                            f2 = Float.NaN;
                        } else {
                            f2 = f;
                        }
                        bj4VarO.K(-652108692);
                        if (uh1Var2 == null) {
                            jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        } else {
                            jB = uh1Var2.a;
                        }
                        objB = aa0.b(bj4VarO, false, -652103026);
                        if (objB == c0187a) {
                            objB = new jw0();
                            bj4VarO.C(objB);
                        }
                        fw0Var = (fw0) objB;
                        int i411111116 = i35;
                        bj4VarO.U(false);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var19 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72Var = (t72) objF;
                        uh1 uh1Var112 = uh1Var2;
                        String str115 = str3;
                        int i411111117 = i7;
                        ox6 ox6VarB1117 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                        IntercomTheme intercomTheme19 = IntercomTheme.INSTANCE;
                        int i411111118 = IntercomTheme.$stable;
                        float f112 = f2;
                        ox6 ox6VarA19 = kw0.a(uma.a(ns0.a(ox6VarB1117, 1.0f, jB, intercomTheme19.getShapes(bj4VarO, i411111118).b), intercomTheme19.getShapes(bj4VarO, i411111118).b), fw0Var);
                        bj4VarO.K(-652085201);
                        zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarB1118 = p84.b(ox6VarA19, (oh4) objF2);
                        pda pdaVarD19 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                        long j110 = uh1.j;
                        pda pdaVarA19 = pdaVarD19.a(((-14837) & 1) != 0 ? pdaVarD19.a : 0L, ((-14837) & 2) != 0 ? pdaVarD19.b : 0L, ((-14837) & 4) != 0 ? pdaVarD19.c : ac4.b(intercomTheme19, bj4VarO, i411111118), pdaVarD19.d, ((-14837) & 16) != 0 ? pdaVarD19.e : intercomTheme19.getColors(bj4VarO, i411111118).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD19.f : intercomTheme19.getColors(bj4VarO, i411111118).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD19.g : intercomTheme19.getColors(bj4VarO, i411111118).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD19.h : intercomTheme19.getColors(bj4VarO, i411111118).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD19.i : j, pdaVarD19.j, ((-14837) & 1024) != 0 ? pdaVarD19.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD19.l : j110, ((-14837) & 4096) != 0 ? pdaVarD19.m : j110, ((-14837) & 8192) != 0 ? pdaVarD19.n : j110, pdaVarD19.o, pdaVarD19.p, pdaVarD19.q, pdaVarD19.r, pdaVarD19.s, pdaVarD19.t, pdaVarD19.u, pdaVarD19.v, pdaVarD19.w, pdaVarD19.x, pdaVarD19.y, pdaVarD19.z, pdaVarD19.A, pdaVarD19.B, pdaVarD19.C, pdaVarD19.D, pdaVarD19.E, pdaVarD19.F, pdaVarD19.G, pdaVarD19.H, pdaVarD19.I, pdaVarD19.J, pdaVarD19.K, pdaVarD19.L, pdaVarD19.M, pdaVarD19.N, pdaVarD19.O, pdaVarD19.P, pdaVarD19.Q);
                        dp5 dp5Var19 = new dp5(i37, i38, 115);
                        boolean z1111114 = z4;
                        bp5 bp5Var19 = new bp5(oh4Var3, null, 59);
                        b72 b72Var19 = intercomTheme19.getShapes(bj4VarO, i411111118).b;
                        final boolean z1111115 = z5;
                        int i411111119 = i37;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var112 = ci4Var2;
                        bj4Var = bj4VarO;
                        boolean z1111116 = z6;
                        ifa.a(str115, oh4Var, ox6VarB1118, z1111116, intercomTheme19.getTypography(bj4VarO, i411111118).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            public final void invoke(jt1 jt1Var2, int i4111111110) {
                                if ((i4111111110 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ci4Var112, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            public final void invoke(jt1 jt1Var2, int i4111111110) {
                                if ((i4111111110 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else if (z1111115) {
                                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, dp5Var19, bp5Var19, z1111114, i36, 0, b72Var19, pdaVarA19, bj4Var, ((i411111116 << 3) & 7168) | (i411111117 & 14) | 817889280 | ((i411111117 >> 3) & 112) | ((i411111116 << 21) & 234881024), (29360128 & (i411111117 << 3)) | ((i411111117 << 9) & 234881024), 1604688);
                        oh4Var4 = oh4Var3;
                        uh1Var3 = uh1Var112;
                        z7 = z1111116;
                        ci4Var3 = ci4Var112;
                        z8 = z1111114;
                        i39 = i36;
                        i40 = i38;
                        z9 = z1111115;
                        f3 = f112;
                        str5 = str4;
                        i41 = i411111119;
                        str6 = str115;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: vha
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i7 |= 100663296;
                i21 = i6 & 512;
                if (i21 != 0) {
                    if ((i4 & 805306368) == 0) {
                        if (bj4VarO.h(i3)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i7 |= i22;
                    }
                    i23 = i6 & 1024;
                    if (i23 != 0) {
                        i24 = i5 | 6;
                    } else if ((i5 & 6) == 0) {
                        if (bj4VarO.c(z2)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i5 | i25;
                    } else {
                        i24 = i5;
                    }
                    i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    if (i26 != 0) {
                        i24 |= 48;
                    } else if ((i5 & 48) != 0) {
                        if (bj4VarO.j(ci4Var)) {
                            i27 = 32;
                        } else {
                            i27 = 16;
                        }
                        i24 |= i27;
                    }
                    i28 = i24;
                    i29 = i6 & 4096;
                    if (i29 != 0) {
                        i31 = i28 | 384;
                    } else {
                        i30 = i28;
                        if ((i5 & 384) != 0) {
                            if (bj4VarO.c(z3)) {
                                i32 = 256;
                            } else {
                                i32 = 128;
                            }
                            i30 |= i32;
                        }
                        i31 = i30;
                    }
                    i33 = i6 & 8192;
                    if (i33 != 0) {
                        i35 = i31 | 3072;
                    } else {
                        i34 = i31;
                        if ((i5 & 3072) == 0) {
                            i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                        } else {
                            i35 = i34;
                        }
                    }
                    if ((i7 & 306783379) != 306783378) {
                        str4 = BuildConfig.FLAVOR;
                        if (i42 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        if (i43 == 0) {
                            str4 = str2;
                        }
                        if (i9 != 0) {
                            uh1Var2 = null;
                        }
                        if (i12 != 0) {
                            i36 = Integer.MAX_VALUE;
                        } else {
                            i36 = i13;
                        }
                        if (i15 != 0) {
                            z4 = false;
                        }
                        c0187a = jt1.a.a;
                        if (i17 != 0) {
                            bj4VarO.K(-652118101);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new w05(2);
                                bj4VarO.C(objF3);
                            }
                            oh4Var3 = (oh4) objF3;
                            bj4VarO.U(false);
                        }
                        if (i19 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i2;
                        }
                        if (i21 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i3;
                        }
                        if (i23 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i26 != 0) {
                            ci4Var2 = null;
                        } else {
                            ci4Var2 = ci4Var;
                        }
                        if (i29 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i33 != 0) {
                            f2 = Float.NaN;
                        } else {
                            f2 = f;
                        }
                        bj4VarO.K(-652108692);
                        if (uh1Var2 == null) {
                            jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        } else {
                            jB = uh1Var2.a;
                        }
                        objB = aa0.b(bj4VarO, false, -652103026);
                        if (objB == c0187a) {
                            objB = new jw0();
                            bj4VarO.C(objB);
                        }
                        fw0Var = (fw0) objB;
                        int i4111111110 = i35;
                        bj4VarO.U(false);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var110 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72Var = (t72) objF;
                        uh1 uh1Var113 = uh1Var2;
                        String str116 = str3;
                        int i4111111111 = i7;
                        ox6 ox6VarB1119 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                        IntercomTheme intercomTheme110 = IntercomTheme.INSTANCE;
                        int i4111111112 = IntercomTheme.$stable;
                        float f113 = f2;
                        ox6 ox6VarA110 = kw0.a(uma.a(ns0.a(ox6VarB1119, 1.0f, jB, intercomTheme110.getShapes(bj4VarO, i4111111112).b), intercomTheme110.getShapes(bj4VarO, i4111111112).b), fw0Var);
                        bj4VarO.K(-652085201);
                        zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarB11110 = p84.b(ox6VarA110, (oh4) objF2);
                        pda pdaVarD110 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                        long j111 = uh1.j;
                        pda pdaVarA110 = pdaVarD110.a(((-14837) & 1) != 0 ? pdaVarD110.a : 0L, ((-14837) & 2) != 0 ? pdaVarD110.b : 0L, ((-14837) & 4) != 0 ? pdaVarD110.c : ac4.b(intercomTheme110, bj4VarO, i4111111112), pdaVarD110.d, ((-14837) & 16) != 0 ? pdaVarD110.e : intercomTheme110.getColors(bj4VarO, i4111111112).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD110.f : intercomTheme110.getColors(bj4VarO, i4111111112).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD110.g : intercomTheme110.getColors(bj4VarO, i4111111112).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD110.h : intercomTheme110.getColors(bj4VarO, i4111111112).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD110.i : j, pdaVarD110.j, ((-14837) & 1024) != 0 ? pdaVarD110.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD110.l : j111, ((-14837) & 4096) != 0 ? pdaVarD110.m : j111, ((-14837) & 8192) != 0 ? pdaVarD110.n : j111, pdaVarD110.o, pdaVarD110.p, pdaVarD110.q, pdaVarD110.r, pdaVarD110.s, pdaVarD110.t, pdaVarD110.u, pdaVarD110.v, pdaVarD110.w, pdaVarD110.x, pdaVarD110.y, pdaVarD110.z, pdaVarD110.A, pdaVarD110.B, pdaVarD110.C, pdaVarD110.D, pdaVarD110.E, pdaVarD110.F, pdaVarD110.G, pdaVarD110.H, pdaVarD110.I, pdaVarD110.J, pdaVarD110.K, pdaVarD110.L, pdaVarD110.M, pdaVarD110.N, pdaVarD110.O, pdaVarD110.P, pdaVarD110.Q);
                        dp5 dp5Var110 = new dp5(i37, i38, 115);
                        boolean z1111117 = z4;
                        bp5 bp5Var110 = new bp5(oh4Var3, null, 59);
                        b72 b72Var110 = intercomTheme110.getShapes(bj4VarO, i4111111112).b;
                        final boolean z1111118 = z5;
                        int i4111111113 = i37;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var113 = ci4Var2;
                        bj4Var = bj4VarO;
                        boolean z1111119 = z6;
                        ifa.a(str116, oh4Var, ox6VarB11110, z1111119, intercomTheme110.getTypography(bj4VarO, i4111111112).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            public final void invoke(jt1 jt1Var2, int i4111111114) {
                                if ((i4111111114 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ci4Var113, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            public final void invoke(jt1 jt1Var2, int i4111111114) {
                                if ((i4111111114 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else if (z1111118) {
                                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, dp5Var110, bp5Var110, z1111117, i36, 0, b72Var110, pdaVarA110, bj4Var, ((i4111111110 << 3) & 7168) | (i4111111111 & 14) | 817889280 | ((i4111111111 >> 3) & 112) | ((i4111111110 << 21) & 234881024), (29360128 & (i4111111111 << 3)) | ((i4111111111 << 9) & 234881024), 1604688);
                        oh4Var4 = oh4Var3;
                        uh1Var3 = uh1Var113;
                        z7 = z1111119;
                        ci4Var3 = ci4Var113;
                        z8 = z1111117;
                        i39 = i36;
                        i40 = i38;
                        z9 = z1111118;
                        f3 = f113;
                        str5 = str4;
                        i41 = i4111111113;
                        str6 = str116;
                    } else {
                        str4 = BuildConfig.FLAVOR;
                        if (i42 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        if (i43 == 0) {
                            str4 = str2;
                        }
                        if (i9 != 0) {
                            uh1Var2 = null;
                        }
                        if (i12 != 0) {
                            i36 = Integer.MAX_VALUE;
                        } else {
                            i36 = i13;
                        }
                        if (i15 != 0) {
                            z4 = false;
                        }
                        c0187a = jt1.a.a;
                        if (i17 != 0) {
                            bj4VarO.K(-652118101);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new w05(2);
                                bj4VarO.C(objF3);
                            }
                            oh4Var3 = (oh4) objF3;
                            bj4VarO.U(false);
                        }
                        if (i19 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i2;
                        }
                        if (i21 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i3;
                        }
                        if (i23 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i26 != 0) {
                            ci4Var2 = null;
                        } else {
                            ci4Var2 = ci4Var;
                        }
                        if (i29 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i33 != 0) {
                            f2 = Float.NaN;
                        } else {
                            f2 = f;
                        }
                        bj4VarO.K(-652108692);
                        if (uh1Var2 == null) {
                            jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        } else {
                            jB = uh1Var2.a;
                        }
                        objB = aa0.b(bj4VarO, false, -652103026);
                        if (objB == c0187a) {
                            objB = new jw0();
                            bj4VarO.C(objB);
                        }
                        fw0Var = (fw0) objB;
                        int i4111111114 = i35;
                        bj4VarO.U(false);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var111 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72Var = (t72) objF;
                        uh1 uh1Var114 = uh1Var2;
                        String str117 = str3;
                        int i4111111115 = i7;
                        ox6 ox6VarB11111 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                        IntercomTheme intercomTheme111 = IntercomTheme.INSTANCE;
                        int i4111111116 = IntercomTheme.$stable;
                        float f114 = f2;
                        ox6 ox6VarA111 = kw0.a(uma.a(ns0.a(ox6VarB11111, 1.0f, jB, intercomTheme111.getShapes(bj4VarO, i4111111116).b), intercomTheme111.getShapes(bj4VarO, i4111111116).b), fw0Var);
                        bj4VarO.K(-652085201);
                        zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarB11112 = p84.b(ox6VarA111, (oh4) objF2);
                        pda pdaVarD111 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                        long j112 = uh1.j;
                        pda pdaVarA111 = pdaVarD111.a(((-14837) & 1) != 0 ? pdaVarD111.a : 0L, ((-14837) & 2) != 0 ? pdaVarD111.b : 0L, ((-14837) & 4) != 0 ? pdaVarD111.c : ac4.b(intercomTheme111, bj4VarO, i4111111116), pdaVarD111.d, ((-14837) & 16) != 0 ? pdaVarD111.e : intercomTheme111.getColors(bj4VarO, i4111111116).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD111.f : intercomTheme111.getColors(bj4VarO, i4111111116).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD111.g : intercomTheme111.getColors(bj4VarO, i4111111116).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD111.h : intercomTheme111.getColors(bj4VarO, i4111111116).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD111.i : j, pdaVarD111.j, ((-14837) & 1024) != 0 ? pdaVarD111.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD111.l : j112, ((-14837) & 4096) != 0 ? pdaVarD111.m : j112, ((-14837) & 8192) != 0 ? pdaVarD111.n : j112, pdaVarD111.o, pdaVarD111.p, pdaVarD111.q, pdaVarD111.r, pdaVarD111.s, pdaVarD111.t, pdaVarD111.u, pdaVarD111.v, pdaVarD111.w, pdaVarD111.x, pdaVarD111.y, pdaVarD111.z, pdaVarD111.A, pdaVarD111.B, pdaVarD111.C, pdaVarD111.D, pdaVarD111.E, pdaVarD111.F, pdaVarD111.G, pdaVarD111.H, pdaVarD111.I, pdaVarD111.J, pdaVarD111.K, pdaVarD111.L, pdaVarD111.M, pdaVarD111.N, pdaVarD111.O, pdaVarD111.P, pdaVarD111.Q);
                        dp5 dp5Var111 = new dp5(i37, i38, 115);
                        boolean z11111110 = z4;
                        bp5 bp5Var111 = new bp5(oh4Var3, null, 59);
                        b72 b72Var111 = intercomTheme111.getShapes(bj4VarO, i4111111116).b;
                        final boolean z11111111 = z5;
                        int i4111111117 = i37;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var114 = ci4Var2;
                        bj4Var = bj4VarO;
                        boolean z11111112 = z6;
                        ifa.a(str117, oh4Var, ox6VarB11112, z11111112, intercomTheme111.getTypography(bj4VarO, i4111111116).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            public final void invoke(jt1 jt1Var2, int i4111111118) {
                                if ((i4111111118 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ci4Var114, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            public final void invoke(jt1 jt1Var2, int i4111111118) {
                                if ((i4111111118 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else if (z11111111) {
                                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, dp5Var111, bp5Var111, z11111110, i36, 0, b72Var111, pdaVarA111, bj4Var, ((i4111111114 << 3) & 7168) | (i4111111115 & 14) | 817889280 | ((i4111111115 >> 3) & 112) | ((i4111111114 << 21) & 234881024), (29360128 & (i4111111115 << 3)) | ((i4111111115 << 9) & 234881024), 1604688);
                        oh4Var4 = oh4Var3;
                        uh1Var3 = uh1Var114;
                        z7 = z11111112;
                        ci4Var3 = ci4Var114;
                        z8 = z11111110;
                        i39 = i36;
                        i40 = i38;
                        z9 = z11111111;
                        f3 = f114;
                        str5 = str4;
                        i41 = i4111111117;
                        str6 = str117;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: vha
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i7 |= 805306368;
                i23 = i6 & 1024;
                if (i23 != 0) {
                    i24 = i5 | 6;
                } else if ((i5 & 6) == 0) {
                    if (bj4VarO.c(z2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i5 | i25;
                } else {
                    i24 = i5;
                }
                i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                if (i26 != 0) {
                    i24 |= 48;
                } else if ((i5 & 48) != 0) {
                    if (bj4VarO.j(ci4Var)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i24 |= i27;
                }
                i28 = i24;
                i29 = i6 & 4096;
                if (i29 != 0) {
                    i31 = i28 | 384;
                } else {
                    i30 = i28;
                    if ((i5 & 384) != 0) {
                        if (bj4VarO.c(z3)) {
                            i32 = 256;
                        } else {
                            i32 = 128;
                        }
                        i30 |= i32;
                    }
                    i31 = i30;
                }
                i33 = i6 & 8192;
                if (i33 != 0) {
                    i35 = i31 | 3072;
                } else {
                    i34 = i31;
                    if ((i5 & 3072) == 0) {
                        i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                    } else {
                        i35 = i34;
                    }
                }
                if ((i7 & 306783379) != 306783378) {
                    str4 = BuildConfig.FLAVOR;
                    if (i42 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (i43 == 0) {
                        str4 = str2;
                    }
                    if (i9 != 0) {
                        uh1Var2 = null;
                    }
                    if (i12 != 0) {
                        i36 = Integer.MAX_VALUE;
                    } else {
                        i36 = i13;
                    }
                    if (i15 != 0) {
                        z4 = false;
                    }
                    c0187a = jt1.a.a;
                    if (i17 != 0) {
                        bj4VarO.K(-652118101);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new w05(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var3 = (oh4) objF3;
                        bj4VarO.U(false);
                    }
                    if (i19 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i2;
                    }
                    if (i21 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i3;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i26 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i29 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i33 != 0) {
                        f2 = Float.NaN;
                    } else {
                        f2 = f;
                    }
                    bj4VarO.K(-652108692);
                    if (uh1Var2 == null) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    } else {
                        jB = uh1Var2.a;
                    }
                    objB = aa0.b(bj4VarO, false, -652103026);
                    if (objB == c0187a) {
                        objB = new jw0();
                        bj4VarO.C(objB);
                    }
                    fw0Var = (fw0) objB;
                    int i4111111118 = i35;
                    bj4VarO.U(false);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var112 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF;
                    uh1 uh1Var115 = uh1Var2;
                    String str118 = str3;
                    int i4111111119 = i7;
                    ox6 ox6VarB11113 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                    IntercomTheme intercomTheme112 = IntercomTheme.INSTANCE;
                    int i41111111110 = IntercomTheme.$stable;
                    float f115 = f2;
                    ox6 ox6VarA112 = kw0.a(uma.a(ns0.a(ox6VarB11113, 1.0f, jB, intercomTheme112.getShapes(bj4VarO, i41111111110).b), intercomTheme112.getShapes(bj4VarO, i41111111110).b), fw0Var);
                    bj4VarO.K(-652085201);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB11114 = p84.b(ox6VarA112, (oh4) objF2);
                    pda pdaVarD112 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                    long j113 = uh1.j;
                    pda pdaVarA112 = pdaVarD112.a(((-14837) & 1) != 0 ? pdaVarD112.a : 0L, ((-14837) & 2) != 0 ? pdaVarD112.b : 0L, ((-14837) & 4) != 0 ? pdaVarD112.c : ac4.b(intercomTheme112, bj4VarO, i41111111110), pdaVarD112.d, ((-14837) & 16) != 0 ? pdaVarD112.e : intercomTheme112.getColors(bj4VarO, i41111111110).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD112.f : intercomTheme112.getColors(bj4VarO, i41111111110).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD112.g : intercomTheme112.getColors(bj4VarO, i41111111110).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD112.h : intercomTheme112.getColors(bj4VarO, i41111111110).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD112.i : j, pdaVarD112.j, ((-14837) & 1024) != 0 ? pdaVarD112.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD112.l : j113, ((-14837) & 4096) != 0 ? pdaVarD112.m : j113, ((-14837) & 8192) != 0 ? pdaVarD112.n : j113, pdaVarD112.o, pdaVarD112.p, pdaVarD112.q, pdaVarD112.r, pdaVarD112.s, pdaVarD112.t, pdaVarD112.u, pdaVarD112.v, pdaVarD112.w, pdaVarD112.x, pdaVarD112.y, pdaVarD112.z, pdaVarD112.A, pdaVarD112.B, pdaVarD112.C, pdaVarD112.D, pdaVarD112.E, pdaVarD112.F, pdaVarD112.G, pdaVarD112.H, pdaVarD112.I, pdaVarD112.J, pdaVarD112.K, pdaVarD112.L, pdaVarD112.M, pdaVarD112.N, pdaVarD112.O, pdaVarD112.P, pdaVarD112.Q);
                    dp5 dp5Var112 = new dp5(i37, i38, 115);
                    boolean z11111113 = z4;
                    bp5 bp5Var112 = new bp5(oh4Var3, null, 59);
                    b72 b72Var112 = intercomTheme112.getShapes(bj4VarO, i41111111110).b;
                    final boolean z11111114 = z5;
                    int i41111111111 = i37;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var115 = ci4Var2;
                    bj4Var = bj4VarO;
                    boolean z11111115 = z6;
                    ifa.a(str118, oh4Var, ox6VarB11114, z11111115, intercomTheme112.getTypography(bj4VarO, i41111111110).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        public final void invoke(jt1 jt1Var2, int i41111111112) {
                            if ((i41111111112 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ci4Var115, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        public final void invoke(jt1 jt1Var2, int i41111111112) {
                            if ((i41111111112 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else if (z11111114) {
                                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, dp5Var112, bp5Var112, z11111113, i36, 0, b72Var112, pdaVarA112, bj4Var, ((i4111111118 << 3) & 7168) | (i4111111119 & 14) | 817889280 | ((i4111111119 >> 3) & 112) | ((i4111111118 << 21) & 234881024), (29360128 & (i4111111119 << 3)) | ((i4111111119 << 9) & 234881024), 1604688);
                    oh4Var4 = oh4Var3;
                    uh1Var3 = uh1Var115;
                    z7 = z11111115;
                    ci4Var3 = ci4Var115;
                    z8 = z11111113;
                    i39 = i36;
                    i40 = i38;
                    z9 = z11111114;
                    f3 = f115;
                    str5 = str4;
                    i41 = i41111111111;
                    str6 = str118;
                } else {
                    str4 = BuildConfig.FLAVOR;
                    if (i42 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (i43 == 0) {
                        str4 = str2;
                    }
                    if (i9 != 0) {
                        uh1Var2 = null;
                    }
                    if (i12 != 0) {
                        i36 = Integer.MAX_VALUE;
                    } else {
                        i36 = i13;
                    }
                    if (i15 != 0) {
                        z4 = false;
                    }
                    c0187a = jt1.a.a;
                    if (i17 != 0) {
                        bj4VarO.K(-652118101);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new w05(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var3 = (oh4) objF3;
                        bj4VarO.U(false);
                    }
                    if (i19 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i2;
                    }
                    if (i21 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i3;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i26 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i29 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i33 != 0) {
                        f2 = Float.NaN;
                    } else {
                        f2 = f;
                    }
                    bj4VarO.K(-652108692);
                    if (uh1Var2 == null) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    } else {
                        jB = uh1Var2.a;
                    }
                    objB = aa0.b(bj4VarO, false, -652103026);
                    if (objB == c0187a) {
                        objB = new jw0();
                        bj4VarO.C(objB);
                    }
                    fw0Var = (fw0) objB;
                    int i41111111112 = i35;
                    bj4VarO.U(false);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var113 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF;
                    uh1 uh1Var116 = uh1Var2;
                    String str119 = str3;
                    int i41111111113 = i7;
                    ox6 ox6VarB11115 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                    IntercomTheme intercomTheme113 = IntercomTheme.INSTANCE;
                    int i41111111114 = IntercomTheme.$stable;
                    float f116 = f2;
                    ox6 ox6VarA113 = kw0.a(uma.a(ns0.a(ox6VarB11115, 1.0f, jB, intercomTheme113.getShapes(bj4VarO, i41111111114).b), intercomTheme113.getShapes(bj4VarO, i41111111114).b), fw0Var);
                    bj4VarO.K(-652085201);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB11116 = p84.b(ox6VarA113, (oh4) objF2);
                    pda pdaVarD113 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                    long j114 = uh1.j;
                    pda pdaVarA113 = pdaVarD113.a(((-14837) & 1) != 0 ? pdaVarD113.a : 0L, ((-14837) & 2) != 0 ? pdaVarD113.b : 0L, ((-14837) & 4) != 0 ? pdaVarD113.c : ac4.b(intercomTheme113, bj4VarO, i41111111114), pdaVarD113.d, ((-14837) & 16) != 0 ? pdaVarD113.e : intercomTheme113.getColors(bj4VarO, i41111111114).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD113.f : intercomTheme113.getColors(bj4VarO, i41111111114).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD113.g : intercomTheme113.getColors(bj4VarO, i41111111114).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD113.h : intercomTheme113.getColors(bj4VarO, i41111111114).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD113.i : j, pdaVarD113.j, ((-14837) & 1024) != 0 ? pdaVarD113.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD113.l : j114, ((-14837) & 4096) != 0 ? pdaVarD113.m : j114, ((-14837) & 8192) != 0 ? pdaVarD113.n : j114, pdaVarD113.o, pdaVarD113.p, pdaVarD113.q, pdaVarD113.r, pdaVarD113.s, pdaVarD113.t, pdaVarD113.u, pdaVarD113.v, pdaVarD113.w, pdaVarD113.x, pdaVarD113.y, pdaVarD113.z, pdaVarD113.A, pdaVarD113.B, pdaVarD113.C, pdaVarD113.D, pdaVarD113.E, pdaVarD113.F, pdaVarD113.G, pdaVarD113.H, pdaVarD113.I, pdaVarD113.J, pdaVarD113.K, pdaVarD113.L, pdaVarD113.M, pdaVarD113.N, pdaVarD113.O, pdaVarD113.P, pdaVarD113.Q);
                    dp5 dp5Var113 = new dp5(i37, i38, 115);
                    boolean z11111116 = z4;
                    bp5 bp5Var113 = new bp5(oh4Var3, null, 59);
                    b72 b72Var113 = intercomTheme113.getShapes(bj4VarO, i41111111114).b;
                    final boolean z11111117 = z5;
                    int i41111111115 = i37;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var116 = ci4Var2;
                    bj4Var = bj4VarO;
                    boolean z11111118 = z6;
                    ifa.a(str119, oh4Var, ox6VarB11116, z11111118, intercomTheme113.getTypography(bj4VarO, i41111111114).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        public final void invoke(jt1 jt1Var2, int i41111111116) {
                            if ((i41111111116 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ci4Var116, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        public final void invoke(jt1 jt1Var2, int i41111111116) {
                            if ((i41111111116 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else if (z11111117) {
                                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, dp5Var113, bp5Var113, z11111116, i36, 0, b72Var113, pdaVarA113, bj4Var, ((i41111111112 << 3) & 7168) | (i41111111113 & 14) | 817889280 | ((i41111111113 >> 3) & 112) | ((i41111111112 << 21) & 234881024), (29360128 & (i41111111113 << 3)) | ((i41111111113 << 9) & 234881024), 1604688);
                    oh4Var4 = oh4Var3;
                    uh1Var3 = uh1Var116;
                    z7 = z11111118;
                    ci4Var3 = ci4Var116;
                    z8 = z11111116;
                    i39 = i36;
                    i40 = i38;
                    z9 = z11111117;
                    f3 = f116;
                    str5 = str4;
                    i41 = i41111111115;
                    str6 = str119;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: vha
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i7 |= 3072;
            uh1Var2 = uh1Var;
            if ((i6 & 16) != 0) {
                i7 |= 24576;
            } else if ((i4 & 24576) == 0) {
                if (bj4VarO.i(j)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i7 |= i11;
            }
            i12 = i6 & 32;
            if (i12 != 0) {
                i7 |= 196608;
                i13 = i;
            } else {
                i13 = i;
                if ((i4 & 196608) == 0) {
                    if (bj4VarO.h(i13)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i7 |= i14;
                }
            }
            i15 = i6 & 64;
            if (i15 != 0) {
                i7 |= 1572864;
                z4 = z;
            } else {
                z4 = z;
                if ((i4 & 1572864) == 0) {
                    if (bj4VarO.c(z4)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i7 |= i16;
                }
            }
            i17 = i6 & 128;
            if (i17 != 0) {
                i7 |= 12582912;
                oh4Var3 = oh4Var2;
            } else {
                oh4Var3 = oh4Var2;
                if ((i4 & 12582912) == 0) {
                    if (bj4VarO.j(oh4Var3)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i7 |= i18;
                }
            }
            i19 = i6 & 256;
            if (i19 != 0) {
                if ((i4 & 100663296) == 0) {
                    if (bj4VarO.h(i2)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i7 |= i20;
                }
                i21 = i6 & 512;
                if (i21 != 0) {
                    if ((i4 & 805306368) == 0) {
                        if (bj4VarO.h(i3)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i7 |= i22;
                    }
                    i23 = i6 & 1024;
                    if (i23 != 0) {
                        i24 = i5 | 6;
                    } else if ((i5 & 6) == 0) {
                        if (bj4VarO.c(z2)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i5 | i25;
                    } else {
                        i24 = i5;
                    }
                    i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    if (i26 != 0) {
                        i24 |= 48;
                    } else if ((i5 & 48) != 0) {
                        if (bj4VarO.j(ci4Var)) {
                            i27 = 32;
                        } else {
                            i27 = 16;
                        }
                        i24 |= i27;
                    }
                    i28 = i24;
                    i29 = i6 & 4096;
                    if (i29 != 0) {
                        i31 = i28 | 384;
                    } else {
                        i30 = i28;
                        if ((i5 & 384) != 0) {
                            if (bj4VarO.c(z3)) {
                                i32 = 256;
                            } else {
                                i32 = 128;
                            }
                            i30 |= i32;
                        }
                        i31 = i30;
                    }
                    i33 = i6 & 8192;
                    if (i33 != 0) {
                        i35 = i31 | 3072;
                    } else {
                        i34 = i31;
                        if ((i5 & 3072) == 0) {
                            i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                        } else {
                            i35 = i34;
                        }
                    }
                    if ((i7 & 306783379) != 306783378) {
                        str4 = BuildConfig.FLAVOR;
                        if (i42 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        if (i43 == 0) {
                            str4 = str2;
                        }
                        if (i9 != 0) {
                            uh1Var2 = null;
                        }
                        if (i12 != 0) {
                            i36 = Integer.MAX_VALUE;
                        } else {
                            i36 = i13;
                        }
                        if (i15 != 0) {
                            z4 = false;
                        }
                        c0187a = jt1.a.a;
                        if (i17 != 0) {
                            bj4VarO.K(-652118101);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new w05(2);
                                bj4VarO.C(objF3);
                            }
                            oh4Var3 = (oh4) objF3;
                            bj4VarO.U(false);
                        }
                        if (i19 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i2;
                        }
                        if (i21 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i3;
                        }
                        if (i23 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i26 != 0) {
                            ci4Var2 = null;
                        } else {
                            ci4Var2 = ci4Var;
                        }
                        if (i29 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i33 != 0) {
                            f2 = Float.NaN;
                        } else {
                            f2 = f;
                        }
                        bj4VarO.K(-652108692);
                        if (uh1Var2 == null) {
                            jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        } else {
                            jB = uh1Var2.a;
                        }
                        objB = aa0.b(bj4VarO, false, -652103026);
                        if (objB == c0187a) {
                            objB = new jw0();
                            bj4VarO.C(objB);
                        }
                        fw0Var = (fw0) objB;
                        int i41111111116 = i35;
                        bj4VarO.U(false);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var114 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72Var = (t72) objF;
                        uh1 uh1Var117 = uh1Var2;
                        String str1110 = str3;
                        int i41111111117 = i7;
                        ox6 ox6VarB11117 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                        IntercomTheme intercomTheme114 = IntercomTheme.INSTANCE;
                        int i41111111118 = IntercomTheme.$stable;
                        float f117 = f2;
                        ox6 ox6VarA114 = kw0.a(uma.a(ns0.a(ox6VarB11117, 1.0f, jB, intercomTheme114.getShapes(bj4VarO, i41111111118).b), intercomTheme114.getShapes(bj4VarO, i41111111118).b), fw0Var);
                        bj4VarO.K(-652085201);
                        zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarB11118 = p84.b(ox6VarA114, (oh4) objF2);
                        pda pdaVarD114 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                        long j115 = uh1.j;
                        pda pdaVarA114 = pdaVarD114.a(((-14837) & 1) != 0 ? pdaVarD114.a : 0L, ((-14837) & 2) != 0 ? pdaVarD114.b : 0L, ((-14837) & 4) != 0 ? pdaVarD114.c : ac4.b(intercomTheme114, bj4VarO, i41111111118), pdaVarD114.d, ((-14837) & 16) != 0 ? pdaVarD114.e : intercomTheme114.getColors(bj4VarO, i41111111118).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD114.f : intercomTheme114.getColors(bj4VarO, i41111111118).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD114.g : intercomTheme114.getColors(bj4VarO, i41111111118).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD114.h : intercomTheme114.getColors(bj4VarO, i41111111118).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD114.i : j, pdaVarD114.j, ((-14837) & 1024) != 0 ? pdaVarD114.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD114.l : j115, ((-14837) & 4096) != 0 ? pdaVarD114.m : j115, ((-14837) & 8192) != 0 ? pdaVarD114.n : j115, pdaVarD114.o, pdaVarD114.p, pdaVarD114.q, pdaVarD114.r, pdaVarD114.s, pdaVarD114.t, pdaVarD114.u, pdaVarD114.v, pdaVarD114.w, pdaVarD114.x, pdaVarD114.y, pdaVarD114.z, pdaVarD114.A, pdaVarD114.B, pdaVarD114.C, pdaVarD114.D, pdaVarD114.E, pdaVarD114.F, pdaVarD114.G, pdaVarD114.H, pdaVarD114.I, pdaVarD114.J, pdaVarD114.K, pdaVarD114.L, pdaVarD114.M, pdaVarD114.N, pdaVarD114.O, pdaVarD114.P, pdaVarD114.Q);
                        dp5 dp5Var114 = new dp5(i37, i38, 115);
                        boolean z11111119 = z4;
                        bp5 bp5Var114 = new bp5(oh4Var3, null, 59);
                        b72 b72Var114 = intercomTheme114.getShapes(bj4VarO, i41111111118).b;
                        final boolean z111111110 = z5;
                        int i41111111119 = i37;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var117 = ci4Var2;
                        bj4Var = bj4VarO;
                        boolean z111111111 = z6;
                        ifa.a(str1110, oh4Var, ox6VarB11118, z111111111, intercomTheme114.getTypography(bj4VarO, i41111111118).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            public final void invoke(jt1 jt1Var2, int i411111111110) {
                                if ((i411111111110 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ci4Var117, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            public final void invoke(jt1 jt1Var2, int i411111111110) {
                                if ((i411111111110 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else if (z111111110) {
                                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, dp5Var114, bp5Var114, z11111119, i36, 0, b72Var114, pdaVarA114, bj4Var, ((i41111111116 << 3) & 7168) | (i41111111117 & 14) | 817889280 | ((i41111111117 >> 3) & 112) | ((i41111111116 << 21) & 234881024), (29360128 & (i41111111117 << 3)) | ((i41111111117 << 9) & 234881024), 1604688);
                        oh4Var4 = oh4Var3;
                        uh1Var3 = uh1Var117;
                        z7 = z111111111;
                        ci4Var3 = ci4Var117;
                        z8 = z11111119;
                        i39 = i36;
                        i40 = i38;
                        z9 = z111111110;
                        f3 = f117;
                        str5 = str4;
                        i41 = i41111111119;
                        str6 = str1110;
                    } else {
                        str4 = BuildConfig.FLAVOR;
                        if (i42 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        if (i43 == 0) {
                            str4 = str2;
                        }
                        if (i9 != 0) {
                            uh1Var2 = null;
                        }
                        if (i12 != 0) {
                            i36 = Integer.MAX_VALUE;
                        } else {
                            i36 = i13;
                        }
                        if (i15 != 0) {
                            z4 = false;
                        }
                        c0187a = jt1.a.a;
                        if (i17 != 0) {
                            bj4VarO.K(-652118101);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new w05(2);
                                bj4VarO.C(objF3);
                            }
                            oh4Var3 = (oh4) objF3;
                            bj4VarO.U(false);
                        }
                        if (i19 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i2;
                        }
                        if (i21 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i3;
                        }
                        if (i23 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i26 != 0) {
                            ci4Var2 = null;
                        } else {
                            ci4Var2 = ci4Var;
                        }
                        if (i29 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i33 != 0) {
                            f2 = Float.NaN;
                        } else {
                            f2 = f;
                        }
                        bj4VarO.K(-652108692);
                        if (uh1Var2 == null) {
                            jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        } else {
                            jB = uh1Var2.a;
                        }
                        objB = aa0.b(bj4VarO, false, -652103026);
                        if (objB == c0187a) {
                            objB = new jw0();
                            bj4VarO.C(objB);
                        }
                        fw0Var = (fw0) objB;
                        int i411111111110 = i35;
                        bj4VarO.U(false);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var115 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72Var = (t72) objF;
                        uh1 uh1Var118 = uh1Var2;
                        String str1111 = str3;
                        int i411111111111 = i7;
                        ox6 ox6VarB11119 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                        IntercomTheme intercomTheme115 = IntercomTheme.INSTANCE;
                        int i411111111112 = IntercomTheme.$stable;
                        float f118 = f2;
                        ox6 ox6VarA115 = kw0.a(uma.a(ns0.a(ox6VarB11119, 1.0f, jB, intercomTheme115.getShapes(bj4VarO, i411111111112).b), intercomTheme115.getShapes(bj4VarO, i411111111112).b), fw0Var);
                        bj4VarO.K(-652085201);
                        zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarB111110 = p84.b(ox6VarA115, (oh4) objF2);
                        pda pdaVarD115 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                        long j116 = uh1.j;
                        pda pdaVarA115 = pdaVarD115.a(((-14837) & 1) != 0 ? pdaVarD115.a : 0L, ((-14837) & 2) != 0 ? pdaVarD115.b : 0L, ((-14837) & 4) != 0 ? pdaVarD115.c : ac4.b(intercomTheme115, bj4VarO, i411111111112), pdaVarD115.d, ((-14837) & 16) != 0 ? pdaVarD115.e : intercomTheme115.getColors(bj4VarO, i411111111112).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD115.f : intercomTheme115.getColors(bj4VarO, i411111111112).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD115.g : intercomTheme115.getColors(bj4VarO, i411111111112).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD115.h : intercomTheme115.getColors(bj4VarO, i411111111112).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD115.i : j, pdaVarD115.j, ((-14837) & 1024) != 0 ? pdaVarD115.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD115.l : j116, ((-14837) & 4096) != 0 ? pdaVarD115.m : j116, ((-14837) & 8192) != 0 ? pdaVarD115.n : j116, pdaVarD115.o, pdaVarD115.p, pdaVarD115.q, pdaVarD115.r, pdaVarD115.s, pdaVarD115.t, pdaVarD115.u, pdaVarD115.v, pdaVarD115.w, pdaVarD115.x, pdaVarD115.y, pdaVarD115.z, pdaVarD115.A, pdaVarD115.B, pdaVarD115.C, pdaVarD115.D, pdaVarD115.E, pdaVarD115.F, pdaVarD115.G, pdaVarD115.H, pdaVarD115.I, pdaVarD115.J, pdaVarD115.K, pdaVarD115.L, pdaVarD115.M, pdaVarD115.N, pdaVarD115.O, pdaVarD115.P, pdaVarD115.Q);
                        dp5 dp5Var115 = new dp5(i37, i38, 115);
                        boolean z111111112 = z4;
                        bp5 bp5Var115 = new bp5(oh4Var3, null, 59);
                        b72 b72Var115 = intercomTheme115.getShapes(bj4VarO, i411111111112).b;
                        final boolean z111111113 = z5;
                        int i411111111113 = i37;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var118 = ci4Var2;
                        bj4Var = bj4VarO;
                        boolean z111111114 = z6;
                        ifa.a(str1111, oh4Var, ox6VarB111110, z111111114, intercomTheme115.getTypography(bj4VarO, i411111111112).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            public final void invoke(jt1 jt1Var2, int i411111111114) {
                                if ((i411111111114 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ci4Var118, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            public final void invoke(jt1 jt1Var2, int i411111111114) {
                                if ((i411111111114 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else if (z111111113) {
                                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, dp5Var115, bp5Var115, z111111112, i36, 0, b72Var115, pdaVarA115, bj4Var, ((i411111111110 << 3) & 7168) | (i411111111111 & 14) | 817889280 | ((i411111111111 >> 3) & 112) | ((i411111111110 << 21) & 234881024), (29360128 & (i411111111111 << 3)) | ((i411111111111 << 9) & 234881024), 1604688);
                        oh4Var4 = oh4Var3;
                        uh1Var3 = uh1Var118;
                        z7 = z111111114;
                        ci4Var3 = ci4Var118;
                        z8 = z111111112;
                        i39 = i36;
                        i40 = i38;
                        z9 = z111111113;
                        f3 = f118;
                        str5 = str4;
                        i41 = i411111111113;
                        str6 = str1111;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: vha
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i7 |= 805306368;
                i23 = i6 & 1024;
                if (i23 != 0) {
                    i24 = i5 | 6;
                } else if ((i5 & 6) == 0) {
                    if (bj4VarO.c(z2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i5 | i25;
                } else {
                    i24 = i5;
                }
                i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                if (i26 != 0) {
                    i24 |= 48;
                } else if ((i5 & 48) != 0) {
                    if (bj4VarO.j(ci4Var)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i24 |= i27;
                }
                i28 = i24;
                i29 = i6 & 4096;
                if (i29 != 0) {
                    i31 = i28 | 384;
                } else {
                    i30 = i28;
                    if ((i5 & 384) != 0) {
                        if (bj4VarO.c(z3)) {
                            i32 = 256;
                        } else {
                            i32 = 128;
                        }
                        i30 |= i32;
                    }
                    i31 = i30;
                }
                i33 = i6 & 8192;
                if (i33 != 0) {
                    i35 = i31 | 3072;
                } else {
                    i34 = i31;
                    if ((i5 & 3072) == 0) {
                        i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                    } else {
                        i35 = i34;
                    }
                }
                if ((i7 & 306783379) != 306783378) {
                    str4 = BuildConfig.FLAVOR;
                    if (i42 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (i43 == 0) {
                        str4 = str2;
                    }
                    if (i9 != 0) {
                        uh1Var2 = null;
                    }
                    if (i12 != 0) {
                        i36 = Integer.MAX_VALUE;
                    } else {
                        i36 = i13;
                    }
                    if (i15 != 0) {
                        z4 = false;
                    }
                    c0187a = jt1.a.a;
                    if (i17 != 0) {
                        bj4VarO.K(-652118101);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new w05(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var3 = (oh4) objF3;
                        bj4VarO.U(false);
                    }
                    if (i19 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i2;
                    }
                    if (i21 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i3;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i26 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i29 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i33 != 0) {
                        f2 = Float.NaN;
                    } else {
                        f2 = f;
                    }
                    bj4VarO.K(-652108692);
                    if (uh1Var2 == null) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    } else {
                        jB = uh1Var2.a;
                    }
                    objB = aa0.b(bj4VarO, false, -652103026);
                    if (objB == c0187a) {
                        objB = new jw0();
                        bj4VarO.C(objB);
                    }
                    fw0Var = (fw0) objB;
                    int i411111111114 = i35;
                    bj4VarO.U(false);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var116 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF;
                    uh1 uh1Var119 = uh1Var2;
                    String str1112 = str3;
                    int i411111111115 = i7;
                    ox6 ox6VarB111111 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                    IntercomTheme intercomTheme116 = IntercomTheme.INSTANCE;
                    int i411111111116 = IntercomTheme.$stable;
                    float f119 = f2;
                    ox6 ox6VarA116 = kw0.a(uma.a(ns0.a(ox6VarB111111, 1.0f, jB, intercomTheme116.getShapes(bj4VarO, i411111111116).b), intercomTheme116.getShapes(bj4VarO, i411111111116).b), fw0Var);
                    bj4VarO.K(-652085201);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB111112 = p84.b(ox6VarA116, (oh4) objF2);
                    pda pdaVarD116 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                    long j117 = uh1.j;
                    pda pdaVarA116 = pdaVarD116.a(((-14837) & 1) != 0 ? pdaVarD116.a : 0L, ((-14837) & 2) != 0 ? pdaVarD116.b : 0L, ((-14837) & 4) != 0 ? pdaVarD116.c : ac4.b(intercomTheme116, bj4VarO, i411111111116), pdaVarD116.d, ((-14837) & 16) != 0 ? pdaVarD116.e : intercomTheme116.getColors(bj4VarO, i411111111116).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD116.f : intercomTheme116.getColors(bj4VarO, i411111111116).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD116.g : intercomTheme116.getColors(bj4VarO, i411111111116).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD116.h : intercomTheme116.getColors(bj4VarO, i411111111116).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD116.i : j, pdaVarD116.j, ((-14837) & 1024) != 0 ? pdaVarD116.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD116.l : j117, ((-14837) & 4096) != 0 ? pdaVarD116.m : j117, ((-14837) & 8192) != 0 ? pdaVarD116.n : j117, pdaVarD116.o, pdaVarD116.p, pdaVarD116.q, pdaVarD116.r, pdaVarD116.s, pdaVarD116.t, pdaVarD116.u, pdaVarD116.v, pdaVarD116.w, pdaVarD116.x, pdaVarD116.y, pdaVarD116.z, pdaVarD116.A, pdaVarD116.B, pdaVarD116.C, pdaVarD116.D, pdaVarD116.E, pdaVarD116.F, pdaVarD116.G, pdaVarD116.H, pdaVarD116.I, pdaVarD116.J, pdaVarD116.K, pdaVarD116.L, pdaVarD116.M, pdaVarD116.N, pdaVarD116.O, pdaVarD116.P, pdaVarD116.Q);
                    dp5 dp5Var116 = new dp5(i37, i38, 115);
                    boolean z111111115 = z4;
                    bp5 bp5Var116 = new bp5(oh4Var3, null, 59);
                    b72 b72Var116 = intercomTheme116.getShapes(bj4VarO, i411111111116).b;
                    final boolean z111111116 = z5;
                    int i411111111117 = i37;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var119 = ci4Var2;
                    bj4Var = bj4VarO;
                    boolean z111111117 = z6;
                    ifa.a(str1112, oh4Var, ox6VarB111112, z111111117, intercomTheme116.getTypography(bj4VarO, i411111111116).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        public final void invoke(jt1 jt1Var2, int i411111111118) {
                            if ((i411111111118 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ci4Var119, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        public final void invoke(jt1 jt1Var2, int i411111111118) {
                            if ((i411111111118 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else if (z111111116) {
                                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, dp5Var116, bp5Var116, z111111115, i36, 0, b72Var116, pdaVarA116, bj4Var, ((i411111111114 << 3) & 7168) | (i411111111115 & 14) | 817889280 | ((i411111111115 >> 3) & 112) | ((i411111111114 << 21) & 234881024), (29360128 & (i411111111115 << 3)) | ((i411111111115 << 9) & 234881024), 1604688);
                    oh4Var4 = oh4Var3;
                    uh1Var3 = uh1Var119;
                    z7 = z111111117;
                    ci4Var3 = ci4Var119;
                    z8 = z111111115;
                    i39 = i36;
                    i40 = i38;
                    z9 = z111111116;
                    f3 = f119;
                    str5 = str4;
                    i41 = i411111111117;
                    str6 = str1112;
                } else {
                    str4 = BuildConfig.FLAVOR;
                    if (i42 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (i43 == 0) {
                        str4 = str2;
                    }
                    if (i9 != 0) {
                        uh1Var2 = null;
                    }
                    if (i12 != 0) {
                        i36 = Integer.MAX_VALUE;
                    } else {
                        i36 = i13;
                    }
                    if (i15 != 0) {
                        z4 = false;
                    }
                    c0187a = jt1.a.a;
                    if (i17 != 0) {
                        bj4VarO.K(-652118101);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new w05(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var3 = (oh4) objF3;
                        bj4VarO.U(false);
                    }
                    if (i19 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i2;
                    }
                    if (i21 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i3;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i26 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i29 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i33 != 0) {
                        f2 = Float.NaN;
                    } else {
                        f2 = f;
                    }
                    bj4VarO.K(-652108692);
                    if (uh1Var2 == null) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    } else {
                        jB = uh1Var2.a;
                    }
                    objB = aa0.b(bj4VarO, false, -652103026);
                    if (objB == c0187a) {
                        objB = new jw0();
                        bj4VarO.C(objB);
                    }
                    fw0Var = (fw0) objB;
                    int i411111111118 = i35;
                    bj4VarO.U(false);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var117 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF;
                    uh1 uh1Var1110 = uh1Var2;
                    String str1113 = str3;
                    int i411111111119 = i7;
                    ox6 ox6VarB111113 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                    IntercomTheme intercomTheme117 = IntercomTheme.INSTANCE;
                    int i4111111111110 = IntercomTheme.$stable;
                    float f1110 = f2;
                    ox6 ox6VarA117 = kw0.a(uma.a(ns0.a(ox6VarB111113, 1.0f, jB, intercomTheme117.getShapes(bj4VarO, i4111111111110).b), intercomTheme117.getShapes(bj4VarO, i4111111111110).b), fw0Var);
                    bj4VarO.K(-652085201);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB111114 = p84.b(ox6VarA117, (oh4) objF2);
                    pda pdaVarD117 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                    long j118 = uh1.j;
                    pda pdaVarA117 = pdaVarD117.a(((-14837) & 1) != 0 ? pdaVarD117.a : 0L, ((-14837) & 2) != 0 ? pdaVarD117.b : 0L, ((-14837) & 4) != 0 ? pdaVarD117.c : ac4.b(intercomTheme117, bj4VarO, i4111111111110), pdaVarD117.d, ((-14837) & 16) != 0 ? pdaVarD117.e : intercomTheme117.getColors(bj4VarO, i4111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD117.f : intercomTheme117.getColors(bj4VarO, i4111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD117.g : intercomTheme117.getColors(bj4VarO, i4111111111110).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD117.h : intercomTheme117.getColors(bj4VarO, i4111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD117.i : j, pdaVarD117.j, ((-14837) & 1024) != 0 ? pdaVarD117.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD117.l : j118, ((-14837) & 4096) != 0 ? pdaVarD117.m : j118, ((-14837) & 8192) != 0 ? pdaVarD117.n : j118, pdaVarD117.o, pdaVarD117.p, pdaVarD117.q, pdaVarD117.r, pdaVarD117.s, pdaVarD117.t, pdaVarD117.u, pdaVarD117.v, pdaVarD117.w, pdaVarD117.x, pdaVarD117.y, pdaVarD117.z, pdaVarD117.A, pdaVarD117.B, pdaVarD117.C, pdaVarD117.D, pdaVarD117.E, pdaVarD117.F, pdaVarD117.G, pdaVarD117.H, pdaVarD117.I, pdaVarD117.J, pdaVarD117.K, pdaVarD117.L, pdaVarD117.M, pdaVarD117.N, pdaVarD117.O, pdaVarD117.P, pdaVarD117.Q);
                    dp5 dp5Var117 = new dp5(i37, i38, 115);
                    boolean z111111118 = z4;
                    bp5 bp5Var117 = new bp5(oh4Var3, null, 59);
                    b72 b72Var117 = intercomTheme117.getShapes(bj4VarO, i4111111111110).b;
                    final boolean z111111119 = z5;
                    int i4111111111111 = i37;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var1110 = ci4Var2;
                    bj4Var = bj4VarO;
                    boolean z1111111110 = z6;
                    ifa.a(str1113, oh4Var, ox6VarB111114, z1111111110, intercomTheme117.getTypography(bj4VarO, i4111111111110).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        public final void invoke(jt1 jt1Var2, int i4111111111112) {
                            if ((i4111111111112 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ci4Var1110, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        public final void invoke(jt1 jt1Var2, int i4111111111112) {
                            if ((i4111111111112 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else if (z111111119) {
                                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, dp5Var117, bp5Var117, z111111118, i36, 0, b72Var117, pdaVarA117, bj4Var, ((i411111111118 << 3) & 7168) | (i411111111119 & 14) | 817889280 | ((i411111111119 >> 3) & 112) | ((i411111111118 << 21) & 234881024), (29360128 & (i411111111119 << 3)) | ((i411111111119 << 9) & 234881024), 1604688);
                    oh4Var4 = oh4Var3;
                    uh1Var3 = uh1Var1110;
                    z7 = z1111111110;
                    ci4Var3 = ci4Var1110;
                    z8 = z111111118;
                    i39 = i36;
                    i40 = i38;
                    z9 = z111111119;
                    f3 = f1110;
                    str5 = str4;
                    i41 = i4111111111111;
                    str6 = str1113;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: vha
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i7 |= 100663296;
            i21 = i6 & 512;
            if (i21 != 0) {
                if ((i4 & 805306368) == 0) {
                    if (bj4VarO.h(i3)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i7 |= i22;
                }
                i23 = i6 & 1024;
                if (i23 != 0) {
                    i24 = i5 | 6;
                } else if ((i5 & 6) == 0) {
                    if (bj4VarO.c(z2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i5 | i25;
                } else {
                    i24 = i5;
                }
                i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                if (i26 != 0) {
                    i24 |= 48;
                } else if ((i5 & 48) != 0) {
                    if (bj4VarO.j(ci4Var)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i24 |= i27;
                }
                i28 = i24;
                i29 = i6 & 4096;
                if (i29 != 0) {
                    i31 = i28 | 384;
                } else {
                    i30 = i28;
                    if ((i5 & 384) != 0) {
                        if (bj4VarO.c(z3)) {
                            i32 = 256;
                        } else {
                            i32 = 128;
                        }
                        i30 |= i32;
                    }
                    i31 = i30;
                }
                i33 = i6 & 8192;
                if (i33 != 0) {
                    i35 = i31 | 3072;
                } else {
                    i34 = i31;
                    if ((i5 & 3072) == 0) {
                        i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                    } else {
                        i35 = i34;
                    }
                }
                if ((i7 & 306783379) != 306783378) {
                    str4 = BuildConfig.FLAVOR;
                    if (i42 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (i43 == 0) {
                        str4 = str2;
                    }
                    if (i9 != 0) {
                        uh1Var2 = null;
                    }
                    if (i12 != 0) {
                        i36 = Integer.MAX_VALUE;
                    } else {
                        i36 = i13;
                    }
                    if (i15 != 0) {
                        z4 = false;
                    }
                    c0187a = jt1.a.a;
                    if (i17 != 0) {
                        bj4VarO.K(-652118101);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new w05(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var3 = (oh4) objF3;
                        bj4VarO.U(false);
                    }
                    if (i19 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i2;
                    }
                    if (i21 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i3;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i26 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i29 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i33 != 0) {
                        f2 = Float.NaN;
                    } else {
                        f2 = f;
                    }
                    bj4VarO.K(-652108692);
                    if (uh1Var2 == null) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    } else {
                        jB = uh1Var2.a;
                    }
                    objB = aa0.b(bj4VarO, false, -652103026);
                    if (objB == c0187a) {
                        objB = new jw0();
                        bj4VarO.C(objB);
                    }
                    fw0Var = (fw0) objB;
                    int i4111111111112 = i35;
                    bj4VarO.U(false);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var118 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF;
                    uh1 uh1Var1111 = uh1Var2;
                    String str1114 = str3;
                    int i4111111111113 = i7;
                    ox6 ox6VarB111115 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                    IntercomTheme intercomTheme118 = IntercomTheme.INSTANCE;
                    int i4111111111114 = IntercomTheme.$stable;
                    float f1111 = f2;
                    ox6 ox6VarA118 = kw0.a(uma.a(ns0.a(ox6VarB111115, 1.0f, jB, intercomTheme118.getShapes(bj4VarO, i4111111111114).b), intercomTheme118.getShapes(bj4VarO, i4111111111114).b), fw0Var);
                    bj4VarO.K(-652085201);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB111116 = p84.b(ox6VarA118, (oh4) objF2);
                    pda pdaVarD118 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                    long j119 = uh1.j;
                    pda pdaVarA118 = pdaVarD118.a(((-14837) & 1) != 0 ? pdaVarD118.a : 0L, ((-14837) & 2) != 0 ? pdaVarD118.b : 0L, ((-14837) & 4) != 0 ? pdaVarD118.c : ac4.b(intercomTheme118, bj4VarO, i4111111111114), pdaVarD118.d, ((-14837) & 16) != 0 ? pdaVarD118.e : intercomTheme118.getColors(bj4VarO, i4111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD118.f : intercomTheme118.getColors(bj4VarO, i4111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD118.g : intercomTheme118.getColors(bj4VarO, i4111111111114).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD118.h : intercomTheme118.getColors(bj4VarO, i4111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD118.i : j, pdaVarD118.j, ((-14837) & 1024) != 0 ? pdaVarD118.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD118.l : j119, ((-14837) & 4096) != 0 ? pdaVarD118.m : j119, ((-14837) & 8192) != 0 ? pdaVarD118.n : j119, pdaVarD118.o, pdaVarD118.p, pdaVarD118.q, pdaVarD118.r, pdaVarD118.s, pdaVarD118.t, pdaVarD118.u, pdaVarD118.v, pdaVarD118.w, pdaVarD118.x, pdaVarD118.y, pdaVarD118.z, pdaVarD118.A, pdaVarD118.B, pdaVarD118.C, pdaVarD118.D, pdaVarD118.E, pdaVarD118.F, pdaVarD118.G, pdaVarD118.H, pdaVarD118.I, pdaVarD118.J, pdaVarD118.K, pdaVarD118.L, pdaVarD118.M, pdaVarD118.N, pdaVarD118.O, pdaVarD118.P, pdaVarD118.Q);
                    dp5 dp5Var118 = new dp5(i37, i38, 115);
                    boolean z1111111111 = z4;
                    bp5 bp5Var118 = new bp5(oh4Var3, null, 59);
                    b72 b72Var118 = intercomTheme118.getShapes(bj4VarO, i4111111111114).b;
                    final boolean z1111111112 = z5;
                    int i4111111111115 = i37;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var1111 = ci4Var2;
                    bj4Var = bj4VarO;
                    boolean z1111111113 = z6;
                    ifa.a(str1114, oh4Var, ox6VarB111116, z1111111113, intercomTheme118.getTypography(bj4VarO, i4111111111114).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        public final void invoke(jt1 jt1Var2, int i4111111111116) {
                            if ((i4111111111116 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ci4Var1111, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        public final void invoke(jt1 jt1Var2, int i4111111111116) {
                            if ((i4111111111116 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else if (z1111111112) {
                                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, dp5Var118, bp5Var118, z1111111111, i36, 0, b72Var118, pdaVarA118, bj4Var, ((i4111111111112 << 3) & 7168) | (i4111111111113 & 14) | 817889280 | ((i4111111111113 >> 3) & 112) | ((i4111111111112 << 21) & 234881024), (29360128 & (i4111111111113 << 3)) | ((i4111111111113 << 9) & 234881024), 1604688);
                    oh4Var4 = oh4Var3;
                    uh1Var3 = uh1Var1111;
                    z7 = z1111111113;
                    ci4Var3 = ci4Var1111;
                    z8 = z1111111111;
                    i39 = i36;
                    i40 = i38;
                    z9 = z1111111112;
                    f3 = f1111;
                    str5 = str4;
                    i41 = i4111111111115;
                    str6 = str1114;
                } else {
                    str4 = BuildConfig.FLAVOR;
                    if (i42 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (i43 == 0) {
                        str4 = str2;
                    }
                    if (i9 != 0) {
                        uh1Var2 = null;
                    }
                    if (i12 != 0) {
                        i36 = Integer.MAX_VALUE;
                    } else {
                        i36 = i13;
                    }
                    if (i15 != 0) {
                        z4 = false;
                    }
                    c0187a = jt1.a.a;
                    if (i17 != 0) {
                        bj4VarO.K(-652118101);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new w05(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var3 = (oh4) objF3;
                        bj4VarO.U(false);
                    }
                    if (i19 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i2;
                    }
                    if (i21 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i3;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i26 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i29 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i33 != 0) {
                        f2 = Float.NaN;
                    } else {
                        f2 = f;
                    }
                    bj4VarO.K(-652108692);
                    if (uh1Var2 == null) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    } else {
                        jB = uh1Var2.a;
                    }
                    objB = aa0.b(bj4VarO, false, -652103026);
                    if (objB == c0187a) {
                        objB = new jw0();
                        bj4VarO.C(objB);
                    }
                    fw0Var = (fw0) objB;
                    int i4111111111116 = i35;
                    bj4VarO.U(false);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var119 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF;
                    uh1 uh1Var1112 = uh1Var2;
                    String str1115 = str3;
                    int i4111111111117 = i7;
                    ox6 ox6VarB111117 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                    IntercomTheme intercomTheme119 = IntercomTheme.INSTANCE;
                    int i4111111111118 = IntercomTheme.$stable;
                    float f1112 = f2;
                    ox6 ox6VarA119 = kw0.a(uma.a(ns0.a(ox6VarB111117, 1.0f, jB, intercomTheme119.getShapes(bj4VarO, i4111111111118).b), intercomTheme119.getShapes(bj4VarO, i4111111111118).b), fw0Var);
                    bj4VarO.K(-652085201);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB111118 = p84.b(ox6VarA119, (oh4) objF2);
                    pda pdaVarD119 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                    long j1110 = uh1.j;
                    pda pdaVarA119 = pdaVarD119.a(((-14837) & 1) != 0 ? pdaVarD119.a : 0L, ((-14837) & 2) != 0 ? pdaVarD119.b : 0L, ((-14837) & 4) != 0 ? pdaVarD119.c : ac4.b(intercomTheme119, bj4VarO, i4111111111118), pdaVarD119.d, ((-14837) & 16) != 0 ? pdaVarD119.e : intercomTheme119.getColors(bj4VarO, i4111111111118).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD119.f : intercomTheme119.getColors(bj4VarO, i4111111111118).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD119.g : intercomTheme119.getColors(bj4VarO, i4111111111118).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD119.h : intercomTheme119.getColors(bj4VarO, i4111111111118).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD119.i : j, pdaVarD119.j, ((-14837) & 1024) != 0 ? pdaVarD119.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD119.l : j1110, ((-14837) & 4096) != 0 ? pdaVarD119.m : j1110, ((-14837) & 8192) != 0 ? pdaVarD119.n : j1110, pdaVarD119.o, pdaVarD119.p, pdaVarD119.q, pdaVarD119.r, pdaVarD119.s, pdaVarD119.t, pdaVarD119.u, pdaVarD119.v, pdaVarD119.w, pdaVarD119.x, pdaVarD119.y, pdaVarD119.z, pdaVarD119.A, pdaVarD119.B, pdaVarD119.C, pdaVarD119.D, pdaVarD119.E, pdaVarD119.F, pdaVarD119.G, pdaVarD119.H, pdaVarD119.I, pdaVarD119.J, pdaVarD119.K, pdaVarD119.L, pdaVarD119.M, pdaVarD119.N, pdaVarD119.O, pdaVarD119.P, pdaVarD119.Q);
                    dp5 dp5Var119 = new dp5(i37, i38, 115);
                    boolean z1111111114 = z4;
                    bp5 bp5Var119 = new bp5(oh4Var3, null, 59);
                    b72 b72Var119 = intercomTheme119.getShapes(bj4VarO, i4111111111118).b;
                    final boolean z1111111115 = z5;
                    int i4111111111119 = i37;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var1112 = ci4Var2;
                    bj4Var = bj4VarO;
                    boolean z1111111116 = z6;
                    ifa.a(str1115, oh4Var, ox6VarB111118, z1111111116, intercomTheme119.getTypography(bj4VarO, i4111111111118).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        public final void invoke(jt1 jt1Var2, int i41111111111110) {
                            if ((i41111111111110 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ci4Var1112, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        public final void invoke(jt1 jt1Var2, int i41111111111110) {
                            if ((i41111111111110 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else if (z1111111115) {
                                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, dp5Var119, bp5Var119, z1111111114, i36, 0, b72Var119, pdaVarA119, bj4Var, ((i4111111111116 << 3) & 7168) | (i4111111111117 & 14) | 817889280 | ((i4111111111117 >> 3) & 112) | ((i4111111111116 << 21) & 234881024), (29360128 & (i4111111111117 << 3)) | ((i4111111111117 << 9) & 234881024), 1604688);
                    oh4Var4 = oh4Var3;
                    uh1Var3 = uh1Var1112;
                    z7 = z1111111116;
                    ci4Var3 = ci4Var1112;
                    z8 = z1111111114;
                    i39 = i36;
                    i40 = i38;
                    z9 = z1111111115;
                    f3 = f1112;
                    str5 = str4;
                    i41 = i4111111111119;
                    str6 = str1115;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: vha
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i7 |= 805306368;
            i23 = i6 & 1024;
            if (i23 != 0) {
                i24 = i5 | 6;
            } else if ((i5 & 6) == 0) {
                if (bj4VarO.c(z2)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i5 | i25;
            } else {
                i24 = i5;
            }
            i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
            if (i26 != 0) {
                i24 |= 48;
            } else if ((i5 & 48) != 0) {
                if (bj4VarO.j(ci4Var)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i24 |= i27;
            }
            i28 = i24;
            i29 = i6 & 4096;
            if (i29 != 0) {
                i31 = i28 | 384;
            } else {
                i30 = i28;
                if ((i5 & 384) != 0) {
                    if (bj4VarO.c(z3)) {
                        i32 = 256;
                    } else {
                        i32 = 128;
                    }
                    i30 |= i32;
                }
                i31 = i30;
            }
            i33 = i6 & 8192;
            if (i33 != 0) {
                i35 = i31 | 3072;
            } else {
                i34 = i31;
                if ((i5 & 3072) == 0) {
                    i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                } else {
                    i35 = i34;
                }
            }
            if ((i7 & 306783379) != 306783378) {
                str4 = BuildConfig.FLAVOR;
                if (i42 != 0) {
                    str3 = BuildConfig.FLAVOR;
                }
                if (i43 == 0) {
                    str4 = str2;
                }
                if (i9 != 0) {
                    uh1Var2 = null;
                }
                if (i12 != 0) {
                    i36 = Integer.MAX_VALUE;
                } else {
                    i36 = i13;
                }
                if (i15 != 0) {
                    z4 = false;
                }
                c0187a = jt1.a.a;
                if (i17 != 0) {
                    bj4VarO.K(-652118101);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new w05(2);
                        bj4VarO.C(objF3);
                    }
                    oh4Var3 = (oh4) objF3;
                    bj4VarO.U(false);
                }
                if (i19 != 0) {
                    i37 = 1;
                } else {
                    i37 = i2;
                }
                if (i21 != 0) {
                    i38 = 1;
                } else {
                    i38 = i3;
                }
                if (i23 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i26 != 0) {
                    ci4Var2 = null;
                } else {
                    ci4Var2 = ci4Var;
                }
                if (i29 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i33 != 0) {
                    f2 = Float.NaN;
                } else {
                    f2 = f;
                }
                bj4VarO.K(-652108692);
                if (uh1Var2 == null) {
                    jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                } else {
                    jB = uh1Var2.a;
                }
                objB = aa0.b(bj4VarO, false, -652103026);
                if (objB == c0187a) {
                    objB = new jw0();
                    bj4VarO.C(objB);
                }
                fw0Var = (fw0) objB;
                int i41111111111110 = i35;
                bj4VarO.U(false);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    c33 c33Var1110 = wd3.a;
                    objF = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72Var = (t72) objF;
                uh1 uh1Var1113 = uh1Var2;
                String str1116 = str3;
                int i41111111111111 = i7;
                ox6 ox6VarB111119 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                IntercomTheme intercomTheme1110 = IntercomTheme.INSTANCE;
                int i41111111111112 = IntercomTheme.$stable;
                float f1113 = f2;
                ox6 ox6VarA1110 = kw0.a(uma.a(ns0.a(ox6VarB111119, 1.0f, jB, intercomTheme1110.getShapes(bj4VarO, i41111111111112).b), intercomTheme1110.getShapes(bj4VarO, i41111111111112).b), fw0Var);
                bj4VarO.K(-652085201);
                zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new w62(1, t72Var, fw0Var);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new w62(1, t72Var, fw0Var);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ox6 ox6VarB1111110 = p84.b(ox6VarA1110, (oh4) objF2);
                pda pdaVarD1110 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                long j1111 = uh1.j;
                pda pdaVarA1110 = pdaVarD1110.a(((-14837) & 1) != 0 ? pdaVarD1110.a : 0L, ((-14837) & 2) != 0 ? pdaVarD1110.b : 0L, ((-14837) & 4) != 0 ? pdaVarD1110.c : ac4.b(intercomTheme1110, bj4VarO, i41111111111112), pdaVarD1110.d, ((-14837) & 16) != 0 ? pdaVarD1110.e : intercomTheme1110.getColors(bj4VarO, i41111111111112).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD1110.f : intercomTheme1110.getColors(bj4VarO, i41111111111112).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD1110.g : intercomTheme1110.getColors(bj4VarO, i41111111111112).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD1110.h : intercomTheme1110.getColors(bj4VarO, i41111111111112).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD1110.i : j, pdaVarD1110.j, ((-14837) & 1024) != 0 ? pdaVarD1110.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD1110.l : j1111, ((-14837) & 4096) != 0 ? pdaVarD1110.m : j1111, ((-14837) & 8192) != 0 ? pdaVarD1110.n : j1111, pdaVarD1110.o, pdaVarD1110.p, pdaVarD1110.q, pdaVarD1110.r, pdaVarD1110.s, pdaVarD1110.t, pdaVarD1110.u, pdaVarD1110.v, pdaVarD1110.w, pdaVarD1110.x, pdaVarD1110.y, pdaVarD1110.z, pdaVarD1110.A, pdaVarD1110.B, pdaVarD1110.C, pdaVarD1110.D, pdaVarD1110.E, pdaVarD1110.F, pdaVarD1110.G, pdaVarD1110.H, pdaVarD1110.I, pdaVarD1110.J, pdaVarD1110.K, pdaVarD1110.L, pdaVarD1110.M, pdaVarD1110.N, pdaVarD1110.O, pdaVarD1110.P, pdaVarD1110.Q);
                dp5 dp5Var1110 = new dp5(i37, i38, 115);
                boolean z1111111117 = z4;
                bp5 bp5Var1110 = new bp5(oh4Var3, null, 59);
                b72 b72Var1110 = intercomTheme1110.getShapes(bj4VarO, i41111111111112).b;
                final boolean z1111111118 = z5;
                int i41111111111113 = i37;
                ci4<? super jt1, ? super Integer, g2b> ci4Var1113 = ci4Var2;
                bj4Var = bj4VarO;
                boolean z1111111119 = z6;
                ifa.a(str1116, oh4Var, ox6VarB1111110, z1111111119, intercomTheme1110.getTypography(bj4VarO, i41111111111112).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    public final void invoke(jt1 jt1Var2, int i41111111111114) {
                        if ((i41111111111114 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ci4Var1113, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    public final void invoke(jt1 jt1Var2, int i41111111111114) {
                        if ((i41111111111114 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else if (z1111111118) {
                            m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, dp5Var1110, bp5Var1110, z1111111117, i36, 0, b72Var1110, pdaVarA1110, bj4Var, ((i41111111111110 << 3) & 7168) | (i41111111111111 & 14) | 817889280 | ((i41111111111111 >> 3) & 112) | ((i41111111111110 << 21) & 234881024), (29360128 & (i41111111111111 << 3)) | ((i41111111111111 << 9) & 234881024), 1604688);
                oh4Var4 = oh4Var3;
                uh1Var3 = uh1Var1113;
                z7 = z1111111119;
                ci4Var3 = ci4Var1113;
                z8 = z1111111117;
                i39 = i36;
                i40 = i38;
                z9 = z1111111118;
                f3 = f1113;
                str5 = str4;
                i41 = i41111111111113;
                str6 = str1116;
            } else {
                str4 = BuildConfig.FLAVOR;
                if (i42 != 0) {
                    str3 = BuildConfig.FLAVOR;
                }
                if (i43 == 0) {
                    str4 = str2;
                }
                if (i9 != 0) {
                    uh1Var2 = null;
                }
                if (i12 != 0) {
                    i36 = Integer.MAX_VALUE;
                } else {
                    i36 = i13;
                }
                if (i15 != 0) {
                    z4 = false;
                }
                c0187a = jt1.a.a;
                if (i17 != 0) {
                    bj4VarO.K(-652118101);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new w05(2);
                        bj4VarO.C(objF3);
                    }
                    oh4Var3 = (oh4) objF3;
                    bj4VarO.U(false);
                }
                if (i19 != 0) {
                    i37 = 1;
                } else {
                    i37 = i2;
                }
                if (i21 != 0) {
                    i38 = 1;
                } else {
                    i38 = i3;
                }
                if (i23 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i26 != 0) {
                    ci4Var2 = null;
                } else {
                    ci4Var2 = ci4Var;
                }
                if (i29 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i33 != 0) {
                    f2 = Float.NaN;
                } else {
                    f2 = f;
                }
                bj4VarO.K(-652108692);
                if (uh1Var2 == null) {
                    jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                } else {
                    jB = uh1Var2.a;
                }
                objB = aa0.b(bj4VarO, false, -652103026);
                if (objB == c0187a) {
                    objB = new jw0();
                    bj4VarO.C(objB);
                }
                fw0Var = (fw0) objB;
                int i41111111111114 = i35;
                bj4VarO.U(false);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    c33 c33Var1111 = wd3.a;
                    objF = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72Var = (t72) objF;
                uh1 uh1Var1114 = uh1Var2;
                String str1117 = str3;
                int i41111111111115 = i7;
                ox6 ox6VarB1111111 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                IntercomTheme intercomTheme1111 = IntercomTheme.INSTANCE;
                int i41111111111116 = IntercomTheme.$stable;
                float f1114 = f2;
                ox6 ox6VarA1111 = kw0.a(uma.a(ns0.a(ox6VarB1111111, 1.0f, jB, intercomTheme1111.getShapes(bj4VarO, i41111111111116).b), intercomTheme1111.getShapes(bj4VarO, i41111111111116).b), fw0Var);
                bj4VarO.K(-652085201);
                zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new w62(1, t72Var, fw0Var);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new w62(1, t72Var, fw0Var);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ox6 ox6VarB1111112 = p84.b(ox6VarA1111, (oh4) objF2);
                pda pdaVarD1111 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                long j1112 = uh1.j;
                pda pdaVarA1111 = pdaVarD1111.a(((-14837) & 1) != 0 ? pdaVarD1111.a : 0L, ((-14837) & 2) != 0 ? pdaVarD1111.b : 0L, ((-14837) & 4) != 0 ? pdaVarD1111.c : ac4.b(intercomTheme1111, bj4VarO, i41111111111116), pdaVarD1111.d, ((-14837) & 16) != 0 ? pdaVarD1111.e : intercomTheme1111.getColors(bj4VarO, i41111111111116).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD1111.f : intercomTheme1111.getColors(bj4VarO, i41111111111116).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD1111.g : intercomTheme1111.getColors(bj4VarO, i41111111111116).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD1111.h : intercomTheme1111.getColors(bj4VarO, i41111111111116).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD1111.i : j, pdaVarD1111.j, ((-14837) & 1024) != 0 ? pdaVarD1111.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD1111.l : j1112, ((-14837) & 4096) != 0 ? pdaVarD1111.m : j1112, ((-14837) & 8192) != 0 ? pdaVarD1111.n : j1112, pdaVarD1111.o, pdaVarD1111.p, pdaVarD1111.q, pdaVarD1111.r, pdaVarD1111.s, pdaVarD1111.t, pdaVarD1111.u, pdaVarD1111.v, pdaVarD1111.w, pdaVarD1111.x, pdaVarD1111.y, pdaVarD1111.z, pdaVarD1111.A, pdaVarD1111.B, pdaVarD1111.C, pdaVarD1111.D, pdaVarD1111.E, pdaVarD1111.F, pdaVarD1111.G, pdaVarD1111.H, pdaVarD1111.I, pdaVarD1111.J, pdaVarD1111.K, pdaVarD1111.L, pdaVarD1111.M, pdaVarD1111.N, pdaVarD1111.O, pdaVarD1111.P, pdaVarD1111.Q);
                dp5 dp5Var1111 = new dp5(i37, i38, 115);
                boolean z11111111110 = z4;
                bp5 bp5Var1111 = new bp5(oh4Var3, null, 59);
                b72 b72Var1111 = intercomTheme1111.getShapes(bj4VarO, i41111111111116).b;
                final boolean z11111111111 = z5;
                int i41111111111117 = i37;
                ci4<? super jt1, ? super Integer, g2b> ci4Var1114 = ci4Var2;
                bj4Var = bj4VarO;
                boolean z11111111112 = z6;
                ifa.a(str1117, oh4Var, ox6VarB1111112, z11111111112, intercomTheme1111.getTypography(bj4VarO, i41111111111116).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    public final void invoke(jt1 jt1Var2, int i41111111111118) {
                        if ((i41111111111118 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ci4Var1114, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    public final void invoke(jt1 jt1Var2, int i41111111111118) {
                        if ((i41111111111118 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else if (z11111111111) {
                            m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, dp5Var1111, bp5Var1111, z11111111110, i36, 0, b72Var1111, pdaVarA1111, bj4Var, ((i41111111111114 << 3) & 7168) | (i41111111111115 & 14) | 817889280 | ((i41111111111115 >> 3) & 112) | ((i41111111111114 << 21) & 234881024), (29360128 & (i41111111111115 << 3)) | ((i41111111111115 << 9) & 234881024), 1604688);
                oh4Var4 = oh4Var3;
                uh1Var3 = uh1Var1114;
                z7 = z11111111112;
                ci4Var3 = ci4Var1114;
                z8 = z11111111110;
                i39 = i36;
                i40 = i38;
                z9 = z11111111111;
                f3 = f1114;
                str5 = str4;
                i41 = i41111111111117;
                str6 = str1117;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: vha
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i7 |= 48;
        if ((i6 & 4) != 0) {
            if ((i4 & 384) == 0) {
                if (bj4VarO.j(oh4Var)) {
                    i8 = 256;
                } else {
                    i8 = 128;
                }
                i7 |= i8;
            }
            i9 = i6 & 8;
            if (i9 != 0) {
                if ((i4 & 3072) == 0) {
                    uh1Var2 = uh1Var;
                    if (bj4VarO.J(uh1Var2)) {
                        i10 = 2048;
                    } else {
                        i10 = 1024;
                    }
                    i7 |= i10;
                }
                if ((i6 & 16) != 0) {
                    i7 |= 24576;
                } else if ((i4 & 24576) == 0) {
                    if (bj4VarO.i(j)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i7 |= i11;
                }
                i12 = i6 & 32;
                if (i12 != 0) {
                    i7 |= 196608;
                    i13 = i;
                } else {
                    i13 = i;
                    if ((i4 & 196608) == 0) {
                        if (bj4VarO.h(i13)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i7 |= i14;
                    }
                }
                i15 = i6 & 64;
                if (i15 != 0) {
                    i7 |= 1572864;
                    z4 = z;
                } else {
                    z4 = z;
                    if ((i4 & 1572864) == 0) {
                        if (bj4VarO.c(z4)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i7 |= i16;
                    }
                }
                i17 = i6 & 128;
                if (i17 != 0) {
                    i7 |= 12582912;
                    oh4Var3 = oh4Var2;
                } else {
                    oh4Var3 = oh4Var2;
                    if ((i4 & 12582912) == 0) {
                        if (bj4VarO.j(oh4Var3)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i7 |= i18;
                    }
                }
                i19 = i6 & 256;
                if (i19 != 0) {
                    if ((i4 & 100663296) == 0) {
                        if (bj4VarO.h(i2)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i7 |= i20;
                    }
                    i21 = i6 & 512;
                    if (i21 != 0) {
                        if ((i4 & 805306368) == 0) {
                            if (bj4VarO.h(i3)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i7 |= i22;
                        }
                        i23 = i6 & 1024;
                        if (i23 != 0) {
                            i24 = i5 | 6;
                        } else if ((i5 & 6) == 0) {
                            if (bj4VarO.c(z2)) {
                                i25 = 4;
                            } else {
                                i25 = 2;
                            }
                            i24 = i5 | i25;
                        } else {
                            i24 = i5;
                        }
                        i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                        if (i26 != 0) {
                            i24 |= 48;
                        } else if ((i5 & 48) != 0) {
                            if (bj4VarO.j(ci4Var)) {
                                i27 = 32;
                            } else {
                                i27 = 16;
                            }
                            i24 |= i27;
                        }
                        i28 = i24;
                        i29 = i6 & 4096;
                        if (i29 != 0) {
                            i31 = i28 | 384;
                        } else {
                            i30 = i28;
                            if ((i5 & 384) != 0) {
                                if (bj4VarO.c(z3)) {
                                    i32 = 256;
                                } else {
                                    i32 = 128;
                                }
                                i30 |= i32;
                            }
                            i31 = i30;
                        }
                        i33 = i6 & 8192;
                        if (i33 != 0) {
                            i35 = i31 | 3072;
                        } else {
                            i34 = i31;
                            if ((i5 & 3072) == 0) {
                                i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                            } else {
                                i35 = i34;
                            }
                        }
                        if ((i7 & 306783379) != 306783378) {
                            str4 = BuildConfig.FLAVOR;
                            if (i42 != 0) {
                                str3 = BuildConfig.FLAVOR;
                            }
                            if (i43 == 0) {
                                str4 = str2;
                            }
                            if (i9 != 0) {
                                uh1Var2 = null;
                            }
                            if (i12 != 0) {
                                i36 = Integer.MAX_VALUE;
                            } else {
                                i36 = i13;
                            }
                            if (i15 != 0) {
                                z4 = false;
                            }
                            c0187a = jt1.a.a;
                            if (i17 != 0) {
                                bj4VarO.K(-652118101);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new w05(2);
                                    bj4VarO.C(objF3);
                                }
                                oh4Var3 = (oh4) objF3;
                                bj4VarO.U(false);
                            }
                            if (i19 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i2;
                            }
                            if (i21 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i3;
                            }
                            if (i23 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            if (i26 != 0) {
                                ci4Var2 = null;
                            } else {
                                ci4Var2 = ci4Var;
                            }
                            if (i29 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i33 != 0) {
                                f2 = Float.NaN;
                            } else {
                                f2 = f;
                            }
                            bj4VarO.K(-652108692);
                            if (uh1Var2 == null) {
                                jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                            } else {
                                jB = uh1Var2.a;
                            }
                            objB = aa0.b(bj4VarO, false, -652103026);
                            if (objB == c0187a) {
                                objB = new jw0();
                                bj4VarO.C(objB);
                            }
                            fw0Var = (fw0) objB;
                            int i41111111111118 = i35;
                            bj4VarO.U(false);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                c33 c33Var1112 = wd3.a;
                                objF = m78.a(bj4VarO.x(), bj4VarO);
                            }
                            t72Var = (t72) objF;
                            uh1 uh1Var1115 = uh1Var2;
                            String str1118 = str3;
                            int i41111111111119 = i7;
                            ox6 ox6VarB1111113 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                            IntercomTheme intercomTheme1112 = IntercomTheme.INSTANCE;
                            int i411111111111110 = IntercomTheme.$stable;
                            float f1115 = f2;
                            ox6 ox6VarA1112 = kw0.a(uma.a(ns0.a(ox6VarB1111113, 1.0f, jB, intercomTheme1112.getShapes(bj4VarO, i411111111111110).b), intercomTheme1112.getShapes(bj4VarO, i411111111111110).b), fw0Var);
                            bj4VarO.K(-652085201);
                            zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                            objF2 = bj4VarO.f();
                            if (zJ) {
                                objF2 = new w62(1, t72Var, fw0Var);
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new w62(1, t72Var, fw0Var);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarB1111114 = p84.b(ox6VarA1112, (oh4) objF2);
                            pda pdaVarD1112 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                            long j1113 = uh1.j;
                            pda pdaVarA1112 = pdaVarD1112.a(((-14837) & 1) != 0 ? pdaVarD1112.a : 0L, ((-14837) & 2) != 0 ? pdaVarD1112.b : 0L, ((-14837) & 4) != 0 ? pdaVarD1112.c : ac4.b(intercomTheme1112, bj4VarO, i411111111111110), pdaVarD1112.d, ((-14837) & 16) != 0 ? pdaVarD1112.e : intercomTheme1112.getColors(bj4VarO, i411111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD1112.f : intercomTheme1112.getColors(bj4VarO, i411111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD1112.g : intercomTheme1112.getColors(bj4VarO, i411111111111110).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD1112.h : intercomTheme1112.getColors(bj4VarO, i411111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD1112.i : j, pdaVarD1112.j, ((-14837) & 1024) != 0 ? pdaVarD1112.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD1112.l : j1113, ((-14837) & 4096) != 0 ? pdaVarD1112.m : j1113, ((-14837) & 8192) != 0 ? pdaVarD1112.n : j1113, pdaVarD1112.o, pdaVarD1112.p, pdaVarD1112.q, pdaVarD1112.r, pdaVarD1112.s, pdaVarD1112.t, pdaVarD1112.u, pdaVarD1112.v, pdaVarD1112.w, pdaVarD1112.x, pdaVarD1112.y, pdaVarD1112.z, pdaVarD1112.A, pdaVarD1112.B, pdaVarD1112.C, pdaVarD1112.D, pdaVarD1112.E, pdaVarD1112.F, pdaVarD1112.G, pdaVarD1112.H, pdaVarD1112.I, pdaVarD1112.J, pdaVarD1112.K, pdaVarD1112.L, pdaVarD1112.M, pdaVarD1112.N, pdaVarD1112.O, pdaVarD1112.P, pdaVarD1112.Q);
                            dp5 dp5Var1112 = new dp5(i37, i38, 115);
                            boolean z11111111113 = z4;
                            bp5 bp5Var1112 = new bp5(oh4Var3, null, 59);
                            b72 b72Var1112 = intercomTheme1112.getShapes(bj4VarO, i411111111111110).b;
                            final boolean z11111111114 = z5;
                            int i411111111111111 = i37;
                            ci4<? super jt1, ? super Integer, g2b> ci4Var1115 = ci4Var2;
                            bj4Var = bj4VarO;
                            boolean z11111111115 = z6;
                            ifa.a(str1118, oh4Var, ox6VarB1111114, z11111111115, intercomTheme1112.getTypography(bj4VarO, i411111111111110).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                                public final void invoke(jt1 jt1Var2, int i411111111111112) {
                                    if ((i411111111111112 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else {
                                        mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), ci4Var1115, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                                public final void invoke(jt1 jt1Var2, int i411111111111112) {
                                    if ((i411111111111112 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else if (z11111111114) {
                                        m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), null, dp5Var1112, bp5Var1112, z11111111113, i36, 0, b72Var1112, pdaVarA1112, bj4Var, ((i41111111111118 << 3) & 7168) | (i41111111111119 & 14) | 817889280 | ((i41111111111119 >> 3) & 112) | ((i41111111111118 << 21) & 234881024), (29360128 & (i41111111111119 << 3)) | ((i41111111111119 << 9) & 234881024), 1604688);
                            oh4Var4 = oh4Var3;
                            uh1Var3 = uh1Var1115;
                            z7 = z11111111115;
                            ci4Var3 = ci4Var1115;
                            z8 = z11111111113;
                            i39 = i36;
                            i40 = i38;
                            z9 = z11111111114;
                            f3 = f1115;
                            str5 = str4;
                            i41 = i411111111111111;
                            str6 = str1118;
                        } else {
                            str4 = BuildConfig.FLAVOR;
                            if (i42 != 0) {
                                str3 = BuildConfig.FLAVOR;
                            }
                            if (i43 == 0) {
                                str4 = str2;
                            }
                            if (i9 != 0) {
                                uh1Var2 = null;
                            }
                            if (i12 != 0) {
                                i36 = Integer.MAX_VALUE;
                            } else {
                                i36 = i13;
                            }
                            if (i15 != 0) {
                                z4 = false;
                            }
                            c0187a = jt1.a.a;
                            if (i17 != 0) {
                                bj4VarO.K(-652118101);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new w05(2);
                                    bj4VarO.C(objF3);
                                }
                                oh4Var3 = (oh4) objF3;
                                bj4VarO.U(false);
                            }
                            if (i19 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i2;
                            }
                            if (i21 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i3;
                            }
                            if (i23 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            if (i26 != 0) {
                                ci4Var2 = null;
                            } else {
                                ci4Var2 = ci4Var;
                            }
                            if (i29 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i33 != 0) {
                                f2 = Float.NaN;
                            } else {
                                f2 = f;
                            }
                            bj4VarO.K(-652108692);
                            if (uh1Var2 == null) {
                                jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                            } else {
                                jB = uh1Var2.a;
                            }
                            objB = aa0.b(bj4VarO, false, -652103026);
                            if (objB == c0187a) {
                                objB = new jw0();
                                bj4VarO.C(objB);
                            }
                            fw0Var = (fw0) objB;
                            int i411111111111112 = i35;
                            bj4VarO.U(false);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                c33 c33Var1113 = wd3.a;
                                objF = m78.a(bj4VarO.x(), bj4VarO);
                            }
                            t72Var = (t72) objF;
                            uh1 uh1Var1116 = uh1Var2;
                            String str1119 = str3;
                            int i411111111111113 = i7;
                            ox6 ox6VarB1111115 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                            IntercomTheme intercomTheme1113 = IntercomTheme.INSTANCE;
                            int i411111111111114 = IntercomTheme.$stable;
                            float f1116 = f2;
                            ox6 ox6VarA1113 = kw0.a(uma.a(ns0.a(ox6VarB1111115, 1.0f, jB, intercomTheme1113.getShapes(bj4VarO, i411111111111114).b), intercomTheme1113.getShapes(bj4VarO, i411111111111114).b), fw0Var);
                            bj4VarO.K(-652085201);
                            zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                            objF2 = bj4VarO.f();
                            if (zJ) {
                                objF2 = new w62(1, t72Var, fw0Var);
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new w62(1, t72Var, fw0Var);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarB1111116 = p84.b(ox6VarA1113, (oh4) objF2);
                            pda pdaVarD1113 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                            long j1114 = uh1.j;
                            pda pdaVarA1113 = pdaVarD1113.a(((-14837) & 1) != 0 ? pdaVarD1113.a : 0L, ((-14837) & 2) != 0 ? pdaVarD1113.b : 0L, ((-14837) & 4) != 0 ? pdaVarD1113.c : ac4.b(intercomTheme1113, bj4VarO, i411111111111114), pdaVarD1113.d, ((-14837) & 16) != 0 ? pdaVarD1113.e : intercomTheme1113.getColors(bj4VarO, i411111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD1113.f : intercomTheme1113.getColors(bj4VarO, i411111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD1113.g : intercomTheme1113.getColors(bj4VarO, i411111111111114).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD1113.h : intercomTheme1113.getColors(bj4VarO, i411111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD1113.i : j, pdaVarD1113.j, ((-14837) & 1024) != 0 ? pdaVarD1113.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD1113.l : j1114, ((-14837) & 4096) != 0 ? pdaVarD1113.m : j1114, ((-14837) & 8192) != 0 ? pdaVarD1113.n : j1114, pdaVarD1113.o, pdaVarD1113.p, pdaVarD1113.q, pdaVarD1113.r, pdaVarD1113.s, pdaVarD1113.t, pdaVarD1113.u, pdaVarD1113.v, pdaVarD1113.w, pdaVarD1113.x, pdaVarD1113.y, pdaVarD1113.z, pdaVarD1113.A, pdaVarD1113.B, pdaVarD1113.C, pdaVarD1113.D, pdaVarD1113.E, pdaVarD1113.F, pdaVarD1113.G, pdaVarD1113.H, pdaVarD1113.I, pdaVarD1113.J, pdaVarD1113.K, pdaVarD1113.L, pdaVarD1113.M, pdaVarD1113.N, pdaVarD1113.O, pdaVarD1113.P, pdaVarD1113.Q);
                            dp5 dp5Var1113 = new dp5(i37, i38, 115);
                            boolean z11111111116 = z4;
                            bp5 bp5Var1113 = new bp5(oh4Var3, null, 59);
                            b72 b72Var1113 = intercomTheme1113.getShapes(bj4VarO, i411111111111114).b;
                            final boolean z11111111117 = z5;
                            int i411111111111115 = i37;
                            ci4<? super jt1, ? super Integer, g2b> ci4Var1116 = ci4Var2;
                            bj4Var = bj4VarO;
                            boolean z11111111118 = z6;
                            ifa.a(str1119, oh4Var, ox6VarB1111116, z11111111118, intercomTheme1113.getTypography(bj4VarO, i411111111111114).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                                public final void invoke(jt1 jt1Var2, int i411111111111116) {
                                    if ((i411111111111116 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else {
                                        mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), ci4Var1116, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                                public final void invoke(jt1 jt1Var2, int i411111111111116) {
                                    if ((i411111111111116 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else if (z11111111117) {
                                        m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), null, dp5Var1113, bp5Var1113, z11111111116, i36, 0, b72Var1113, pdaVarA1113, bj4Var, ((i411111111111112 << 3) & 7168) | (i411111111111113 & 14) | 817889280 | ((i411111111111113 >> 3) & 112) | ((i411111111111112 << 21) & 234881024), (29360128 & (i411111111111113 << 3)) | ((i411111111111113 << 9) & 234881024), 1604688);
                            oh4Var4 = oh4Var3;
                            uh1Var3 = uh1Var1116;
                            z7 = z11111111118;
                            ci4Var3 = ci4Var1116;
                            z8 = z11111111116;
                            i39 = i36;
                            i40 = i38;
                            z9 = z11111111117;
                            f3 = f1116;
                            str5 = str4;
                            i41 = i411111111111115;
                            str6 = str1119;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: vha
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i7 |= 805306368;
                    i23 = i6 & 1024;
                    if (i23 != 0) {
                        i24 = i5 | 6;
                    } else if ((i5 & 6) == 0) {
                        if (bj4VarO.c(z2)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i5 | i25;
                    } else {
                        i24 = i5;
                    }
                    i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    if (i26 != 0) {
                        i24 |= 48;
                    } else if ((i5 & 48) != 0) {
                        if (bj4VarO.j(ci4Var)) {
                            i27 = 32;
                        } else {
                            i27 = 16;
                        }
                        i24 |= i27;
                    }
                    i28 = i24;
                    i29 = i6 & 4096;
                    if (i29 != 0) {
                        i31 = i28 | 384;
                    } else {
                        i30 = i28;
                        if ((i5 & 384) != 0) {
                            if (bj4VarO.c(z3)) {
                                i32 = 256;
                            } else {
                                i32 = 128;
                            }
                            i30 |= i32;
                        }
                        i31 = i30;
                    }
                    i33 = i6 & 8192;
                    if (i33 != 0) {
                        i35 = i31 | 3072;
                    } else {
                        i34 = i31;
                        if ((i5 & 3072) == 0) {
                            i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                        } else {
                            i35 = i34;
                        }
                    }
                    if ((i7 & 306783379) != 306783378) {
                        str4 = BuildConfig.FLAVOR;
                        if (i42 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        if (i43 == 0) {
                            str4 = str2;
                        }
                        if (i9 != 0) {
                            uh1Var2 = null;
                        }
                        if (i12 != 0) {
                            i36 = Integer.MAX_VALUE;
                        } else {
                            i36 = i13;
                        }
                        if (i15 != 0) {
                            z4 = false;
                        }
                        c0187a = jt1.a.a;
                        if (i17 != 0) {
                            bj4VarO.K(-652118101);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new w05(2);
                                bj4VarO.C(objF3);
                            }
                            oh4Var3 = (oh4) objF3;
                            bj4VarO.U(false);
                        }
                        if (i19 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i2;
                        }
                        if (i21 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i3;
                        }
                        if (i23 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i26 != 0) {
                            ci4Var2 = null;
                        } else {
                            ci4Var2 = ci4Var;
                        }
                        if (i29 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i33 != 0) {
                            f2 = Float.NaN;
                        } else {
                            f2 = f;
                        }
                        bj4VarO.K(-652108692);
                        if (uh1Var2 == null) {
                            jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        } else {
                            jB = uh1Var2.a;
                        }
                        objB = aa0.b(bj4VarO, false, -652103026);
                        if (objB == c0187a) {
                            objB = new jw0();
                            bj4VarO.C(objB);
                        }
                        fw0Var = (fw0) objB;
                        int i411111111111116 = i35;
                        bj4VarO.U(false);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var1114 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72Var = (t72) objF;
                        uh1 uh1Var1117 = uh1Var2;
                        String str11110 = str3;
                        int i411111111111117 = i7;
                        ox6 ox6VarB1111117 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                        IntercomTheme intercomTheme1114 = IntercomTheme.INSTANCE;
                        int i411111111111118 = IntercomTheme.$stable;
                        float f1117 = f2;
                        ox6 ox6VarA1114 = kw0.a(uma.a(ns0.a(ox6VarB1111117, 1.0f, jB, intercomTheme1114.getShapes(bj4VarO, i411111111111118).b), intercomTheme1114.getShapes(bj4VarO, i411111111111118).b), fw0Var);
                        bj4VarO.K(-652085201);
                        zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarB1111118 = p84.b(ox6VarA1114, (oh4) objF2);
                        pda pdaVarD1114 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                        long j1115 = uh1.j;
                        pda pdaVarA1114 = pdaVarD1114.a(((-14837) & 1) != 0 ? pdaVarD1114.a : 0L, ((-14837) & 2) != 0 ? pdaVarD1114.b : 0L, ((-14837) & 4) != 0 ? pdaVarD1114.c : ac4.b(intercomTheme1114, bj4VarO, i411111111111118), pdaVarD1114.d, ((-14837) & 16) != 0 ? pdaVarD1114.e : intercomTheme1114.getColors(bj4VarO, i411111111111118).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD1114.f : intercomTheme1114.getColors(bj4VarO, i411111111111118).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD1114.g : intercomTheme1114.getColors(bj4VarO, i411111111111118).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD1114.h : intercomTheme1114.getColors(bj4VarO, i411111111111118).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD1114.i : j, pdaVarD1114.j, ((-14837) & 1024) != 0 ? pdaVarD1114.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD1114.l : j1115, ((-14837) & 4096) != 0 ? pdaVarD1114.m : j1115, ((-14837) & 8192) != 0 ? pdaVarD1114.n : j1115, pdaVarD1114.o, pdaVarD1114.p, pdaVarD1114.q, pdaVarD1114.r, pdaVarD1114.s, pdaVarD1114.t, pdaVarD1114.u, pdaVarD1114.v, pdaVarD1114.w, pdaVarD1114.x, pdaVarD1114.y, pdaVarD1114.z, pdaVarD1114.A, pdaVarD1114.B, pdaVarD1114.C, pdaVarD1114.D, pdaVarD1114.E, pdaVarD1114.F, pdaVarD1114.G, pdaVarD1114.H, pdaVarD1114.I, pdaVarD1114.J, pdaVarD1114.K, pdaVarD1114.L, pdaVarD1114.M, pdaVarD1114.N, pdaVarD1114.O, pdaVarD1114.P, pdaVarD1114.Q);
                        dp5 dp5Var1114 = new dp5(i37, i38, 115);
                        boolean z11111111119 = z4;
                        bp5 bp5Var1114 = new bp5(oh4Var3, null, 59);
                        b72 b72Var1114 = intercomTheme1114.getShapes(bj4VarO, i411111111111118).b;
                        final boolean z111111111110 = z5;
                        int i411111111111119 = i37;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var1117 = ci4Var2;
                        bj4Var = bj4VarO;
                        boolean z111111111111 = z6;
                        ifa.a(str11110, oh4Var, ox6VarB1111118, z111111111111, intercomTheme1114.getTypography(bj4VarO, i411111111111118).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            public final void invoke(jt1 jt1Var2, int i4111111111111110) {
                                if ((i4111111111111110 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ci4Var1117, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            public final void invoke(jt1 jt1Var2, int i4111111111111110) {
                                if ((i4111111111111110 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else if (z111111111110) {
                                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, dp5Var1114, bp5Var1114, z11111111119, i36, 0, b72Var1114, pdaVarA1114, bj4Var, ((i411111111111116 << 3) & 7168) | (i411111111111117 & 14) | 817889280 | ((i411111111111117 >> 3) & 112) | ((i411111111111116 << 21) & 234881024), (29360128 & (i411111111111117 << 3)) | ((i411111111111117 << 9) & 234881024), 1604688);
                        oh4Var4 = oh4Var3;
                        uh1Var3 = uh1Var1117;
                        z7 = z111111111111;
                        ci4Var3 = ci4Var1117;
                        z8 = z11111111119;
                        i39 = i36;
                        i40 = i38;
                        z9 = z111111111110;
                        f3 = f1117;
                        str5 = str4;
                        i41 = i411111111111119;
                        str6 = str11110;
                    } else {
                        str4 = BuildConfig.FLAVOR;
                        if (i42 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        if (i43 == 0) {
                            str4 = str2;
                        }
                        if (i9 != 0) {
                            uh1Var2 = null;
                        }
                        if (i12 != 0) {
                            i36 = Integer.MAX_VALUE;
                        } else {
                            i36 = i13;
                        }
                        if (i15 != 0) {
                            z4 = false;
                        }
                        c0187a = jt1.a.a;
                        if (i17 != 0) {
                            bj4VarO.K(-652118101);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new w05(2);
                                bj4VarO.C(objF3);
                            }
                            oh4Var3 = (oh4) objF3;
                            bj4VarO.U(false);
                        }
                        if (i19 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i2;
                        }
                        if (i21 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i3;
                        }
                        if (i23 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i26 != 0) {
                            ci4Var2 = null;
                        } else {
                            ci4Var2 = ci4Var;
                        }
                        if (i29 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i33 != 0) {
                            f2 = Float.NaN;
                        } else {
                            f2 = f;
                        }
                        bj4VarO.K(-652108692);
                        if (uh1Var2 == null) {
                            jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        } else {
                            jB = uh1Var2.a;
                        }
                        objB = aa0.b(bj4VarO, false, -652103026);
                        if (objB == c0187a) {
                            objB = new jw0();
                            bj4VarO.C(objB);
                        }
                        fw0Var = (fw0) objB;
                        int i4111111111111110 = i35;
                        bj4VarO.U(false);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var1115 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72Var = (t72) objF;
                        uh1 uh1Var1118 = uh1Var2;
                        String str11111 = str3;
                        int i4111111111111111 = i7;
                        ox6 ox6VarB1111119 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                        IntercomTheme intercomTheme1115 = IntercomTheme.INSTANCE;
                        int i4111111111111112 = IntercomTheme.$stable;
                        float f1118 = f2;
                        ox6 ox6VarA1115 = kw0.a(uma.a(ns0.a(ox6VarB1111119, 1.0f, jB, intercomTheme1115.getShapes(bj4VarO, i4111111111111112).b), intercomTheme1115.getShapes(bj4VarO, i4111111111111112).b), fw0Var);
                        bj4VarO.K(-652085201);
                        zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarB11111110 = p84.b(ox6VarA1115, (oh4) objF2);
                        pda pdaVarD1115 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                        long j1116 = uh1.j;
                        pda pdaVarA1115 = pdaVarD1115.a(((-14837) & 1) != 0 ? pdaVarD1115.a : 0L, ((-14837) & 2) != 0 ? pdaVarD1115.b : 0L, ((-14837) & 4) != 0 ? pdaVarD1115.c : ac4.b(intercomTheme1115, bj4VarO, i4111111111111112), pdaVarD1115.d, ((-14837) & 16) != 0 ? pdaVarD1115.e : intercomTheme1115.getColors(bj4VarO, i4111111111111112).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD1115.f : intercomTheme1115.getColors(bj4VarO, i4111111111111112).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD1115.g : intercomTheme1115.getColors(bj4VarO, i4111111111111112).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD1115.h : intercomTheme1115.getColors(bj4VarO, i4111111111111112).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD1115.i : j, pdaVarD1115.j, ((-14837) & 1024) != 0 ? pdaVarD1115.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD1115.l : j1116, ((-14837) & 4096) != 0 ? pdaVarD1115.m : j1116, ((-14837) & 8192) != 0 ? pdaVarD1115.n : j1116, pdaVarD1115.o, pdaVarD1115.p, pdaVarD1115.q, pdaVarD1115.r, pdaVarD1115.s, pdaVarD1115.t, pdaVarD1115.u, pdaVarD1115.v, pdaVarD1115.w, pdaVarD1115.x, pdaVarD1115.y, pdaVarD1115.z, pdaVarD1115.A, pdaVarD1115.B, pdaVarD1115.C, pdaVarD1115.D, pdaVarD1115.E, pdaVarD1115.F, pdaVarD1115.G, pdaVarD1115.H, pdaVarD1115.I, pdaVarD1115.J, pdaVarD1115.K, pdaVarD1115.L, pdaVarD1115.M, pdaVarD1115.N, pdaVarD1115.O, pdaVarD1115.P, pdaVarD1115.Q);
                        dp5 dp5Var1115 = new dp5(i37, i38, 115);
                        boolean z111111111112 = z4;
                        bp5 bp5Var1115 = new bp5(oh4Var3, null, 59);
                        b72 b72Var1115 = intercomTheme1115.getShapes(bj4VarO, i4111111111111112).b;
                        final boolean z111111111113 = z5;
                        int i4111111111111113 = i37;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var1118 = ci4Var2;
                        bj4Var = bj4VarO;
                        boolean z111111111114 = z6;
                        ifa.a(str11111, oh4Var, ox6VarB11111110, z111111111114, intercomTheme1115.getTypography(bj4VarO, i4111111111111112).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            public final void invoke(jt1 jt1Var2, int i4111111111111114) {
                                if ((i4111111111111114 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ci4Var1118, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            public final void invoke(jt1 jt1Var2, int i4111111111111114) {
                                if ((i4111111111111114 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else if (z111111111113) {
                                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, dp5Var1115, bp5Var1115, z111111111112, i36, 0, b72Var1115, pdaVarA1115, bj4Var, ((i4111111111111110 << 3) & 7168) | (i4111111111111111 & 14) | 817889280 | ((i4111111111111111 >> 3) & 112) | ((i4111111111111110 << 21) & 234881024), (29360128 & (i4111111111111111 << 3)) | ((i4111111111111111 << 9) & 234881024), 1604688);
                        oh4Var4 = oh4Var3;
                        uh1Var3 = uh1Var1118;
                        z7 = z111111111114;
                        ci4Var3 = ci4Var1118;
                        z8 = z111111111112;
                        i39 = i36;
                        i40 = i38;
                        z9 = z111111111113;
                        f3 = f1118;
                        str5 = str4;
                        i41 = i4111111111111113;
                        str6 = str11111;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: vha
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i7 |= 100663296;
                i21 = i6 & 512;
                if (i21 != 0) {
                    if ((i4 & 805306368) == 0) {
                        if (bj4VarO.h(i3)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i7 |= i22;
                    }
                    i23 = i6 & 1024;
                    if (i23 != 0) {
                        i24 = i5 | 6;
                    } else if ((i5 & 6) == 0) {
                        if (bj4VarO.c(z2)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i5 | i25;
                    } else {
                        i24 = i5;
                    }
                    i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    if (i26 != 0) {
                        i24 |= 48;
                    } else if ((i5 & 48) != 0) {
                        if (bj4VarO.j(ci4Var)) {
                            i27 = 32;
                        } else {
                            i27 = 16;
                        }
                        i24 |= i27;
                    }
                    i28 = i24;
                    i29 = i6 & 4096;
                    if (i29 != 0) {
                        i31 = i28 | 384;
                    } else {
                        i30 = i28;
                        if ((i5 & 384) != 0) {
                            if (bj4VarO.c(z3)) {
                                i32 = 256;
                            } else {
                                i32 = 128;
                            }
                            i30 |= i32;
                        }
                        i31 = i30;
                    }
                    i33 = i6 & 8192;
                    if (i33 != 0) {
                        i35 = i31 | 3072;
                    } else {
                        i34 = i31;
                        if ((i5 & 3072) == 0) {
                            i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                        } else {
                            i35 = i34;
                        }
                    }
                    if ((i7 & 306783379) != 306783378) {
                        str4 = BuildConfig.FLAVOR;
                        if (i42 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        if (i43 == 0) {
                            str4 = str2;
                        }
                        if (i9 != 0) {
                            uh1Var2 = null;
                        }
                        if (i12 != 0) {
                            i36 = Integer.MAX_VALUE;
                        } else {
                            i36 = i13;
                        }
                        if (i15 != 0) {
                            z4 = false;
                        }
                        c0187a = jt1.a.a;
                        if (i17 != 0) {
                            bj4VarO.K(-652118101);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new w05(2);
                                bj4VarO.C(objF3);
                            }
                            oh4Var3 = (oh4) objF3;
                            bj4VarO.U(false);
                        }
                        if (i19 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i2;
                        }
                        if (i21 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i3;
                        }
                        if (i23 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i26 != 0) {
                            ci4Var2 = null;
                        } else {
                            ci4Var2 = ci4Var;
                        }
                        if (i29 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i33 != 0) {
                            f2 = Float.NaN;
                        } else {
                            f2 = f;
                        }
                        bj4VarO.K(-652108692);
                        if (uh1Var2 == null) {
                            jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        } else {
                            jB = uh1Var2.a;
                        }
                        objB = aa0.b(bj4VarO, false, -652103026);
                        if (objB == c0187a) {
                            objB = new jw0();
                            bj4VarO.C(objB);
                        }
                        fw0Var = (fw0) objB;
                        int i4111111111111114 = i35;
                        bj4VarO.U(false);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var1116 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72Var = (t72) objF;
                        uh1 uh1Var1119 = uh1Var2;
                        String str11112 = str3;
                        int i4111111111111115 = i7;
                        ox6 ox6VarB11111111 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                        IntercomTheme intercomTheme1116 = IntercomTheme.INSTANCE;
                        int i4111111111111116 = IntercomTheme.$stable;
                        float f1119 = f2;
                        ox6 ox6VarA1116 = kw0.a(uma.a(ns0.a(ox6VarB11111111, 1.0f, jB, intercomTheme1116.getShapes(bj4VarO, i4111111111111116).b), intercomTheme1116.getShapes(bj4VarO, i4111111111111116).b), fw0Var);
                        bj4VarO.K(-652085201);
                        zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarB11111112 = p84.b(ox6VarA1116, (oh4) objF2);
                        pda pdaVarD1116 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                        long j1117 = uh1.j;
                        pda pdaVarA1116 = pdaVarD1116.a(((-14837) & 1) != 0 ? pdaVarD1116.a : 0L, ((-14837) & 2) != 0 ? pdaVarD1116.b : 0L, ((-14837) & 4) != 0 ? pdaVarD1116.c : ac4.b(intercomTheme1116, bj4VarO, i4111111111111116), pdaVarD1116.d, ((-14837) & 16) != 0 ? pdaVarD1116.e : intercomTheme1116.getColors(bj4VarO, i4111111111111116).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD1116.f : intercomTheme1116.getColors(bj4VarO, i4111111111111116).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD1116.g : intercomTheme1116.getColors(bj4VarO, i4111111111111116).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD1116.h : intercomTheme1116.getColors(bj4VarO, i4111111111111116).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD1116.i : j, pdaVarD1116.j, ((-14837) & 1024) != 0 ? pdaVarD1116.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD1116.l : j1117, ((-14837) & 4096) != 0 ? pdaVarD1116.m : j1117, ((-14837) & 8192) != 0 ? pdaVarD1116.n : j1117, pdaVarD1116.o, pdaVarD1116.p, pdaVarD1116.q, pdaVarD1116.r, pdaVarD1116.s, pdaVarD1116.t, pdaVarD1116.u, pdaVarD1116.v, pdaVarD1116.w, pdaVarD1116.x, pdaVarD1116.y, pdaVarD1116.z, pdaVarD1116.A, pdaVarD1116.B, pdaVarD1116.C, pdaVarD1116.D, pdaVarD1116.E, pdaVarD1116.F, pdaVarD1116.G, pdaVarD1116.H, pdaVarD1116.I, pdaVarD1116.J, pdaVarD1116.K, pdaVarD1116.L, pdaVarD1116.M, pdaVarD1116.N, pdaVarD1116.O, pdaVarD1116.P, pdaVarD1116.Q);
                        dp5 dp5Var1116 = new dp5(i37, i38, 115);
                        boolean z111111111115 = z4;
                        bp5 bp5Var1116 = new bp5(oh4Var3, null, 59);
                        b72 b72Var1116 = intercomTheme1116.getShapes(bj4VarO, i4111111111111116).b;
                        final boolean z111111111116 = z5;
                        int i4111111111111117 = i37;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var1119 = ci4Var2;
                        bj4Var = bj4VarO;
                        boolean z111111111117 = z6;
                        ifa.a(str11112, oh4Var, ox6VarB11111112, z111111111117, intercomTheme1116.getTypography(bj4VarO, i4111111111111116).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            public final void invoke(jt1 jt1Var2, int i4111111111111118) {
                                if ((i4111111111111118 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ci4Var1119, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            public final void invoke(jt1 jt1Var2, int i4111111111111118) {
                                if ((i4111111111111118 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else if (z111111111116) {
                                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, dp5Var1116, bp5Var1116, z111111111115, i36, 0, b72Var1116, pdaVarA1116, bj4Var, ((i4111111111111114 << 3) & 7168) | (i4111111111111115 & 14) | 817889280 | ((i4111111111111115 >> 3) & 112) | ((i4111111111111114 << 21) & 234881024), (29360128 & (i4111111111111115 << 3)) | ((i4111111111111115 << 9) & 234881024), 1604688);
                        oh4Var4 = oh4Var3;
                        uh1Var3 = uh1Var1119;
                        z7 = z111111111117;
                        ci4Var3 = ci4Var1119;
                        z8 = z111111111115;
                        i39 = i36;
                        i40 = i38;
                        z9 = z111111111116;
                        f3 = f1119;
                        str5 = str4;
                        i41 = i4111111111111117;
                        str6 = str11112;
                    } else {
                        str4 = BuildConfig.FLAVOR;
                        if (i42 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        if (i43 == 0) {
                            str4 = str2;
                        }
                        if (i9 != 0) {
                            uh1Var2 = null;
                        }
                        if (i12 != 0) {
                            i36 = Integer.MAX_VALUE;
                        } else {
                            i36 = i13;
                        }
                        if (i15 != 0) {
                            z4 = false;
                        }
                        c0187a = jt1.a.a;
                        if (i17 != 0) {
                            bj4VarO.K(-652118101);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new w05(2);
                                bj4VarO.C(objF3);
                            }
                            oh4Var3 = (oh4) objF3;
                            bj4VarO.U(false);
                        }
                        if (i19 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i2;
                        }
                        if (i21 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i3;
                        }
                        if (i23 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i26 != 0) {
                            ci4Var2 = null;
                        } else {
                            ci4Var2 = ci4Var;
                        }
                        if (i29 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i33 != 0) {
                            f2 = Float.NaN;
                        } else {
                            f2 = f;
                        }
                        bj4VarO.K(-652108692);
                        if (uh1Var2 == null) {
                            jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        } else {
                            jB = uh1Var2.a;
                        }
                        objB = aa0.b(bj4VarO, false, -652103026);
                        if (objB == c0187a) {
                            objB = new jw0();
                            bj4VarO.C(objB);
                        }
                        fw0Var = (fw0) objB;
                        int i4111111111111118 = i35;
                        bj4VarO.U(false);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var1117 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72Var = (t72) objF;
                        uh1 uh1Var11110 = uh1Var2;
                        String str11113 = str3;
                        int i4111111111111119 = i7;
                        ox6 ox6VarB11111113 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                        IntercomTheme intercomTheme1117 = IntercomTheme.INSTANCE;
                        int i41111111111111110 = IntercomTheme.$stable;
                        float f11110 = f2;
                        ox6 ox6VarA1117 = kw0.a(uma.a(ns0.a(ox6VarB11111113, 1.0f, jB, intercomTheme1117.getShapes(bj4VarO, i41111111111111110).b), intercomTheme1117.getShapes(bj4VarO, i41111111111111110).b), fw0Var);
                        bj4VarO.K(-652085201);
                        zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarB11111114 = p84.b(ox6VarA1117, (oh4) objF2);
                        pda pdaVarD1117 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                        long j1118 = uh1.j;
                        pda pdaVarA1117 = pdaVarD1117.a(((-14837) & 1) != 0 ? pdaVarD1117.a : 0L, ((-14837) & 2) != 0 ? pdaVarD1117.b : 0L, ((-14837) & 4) != 0 ? pdaVarD1117.c : ac4.b(intercomTheme1117, bj4VarO, i41111111111111110), pdaVarD1117.d, ((-14837) & 16) != 0 ? pdaVarD1117.e : intercomTheme1117.getColors(bj4VarO, i41111111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD1117.f : intercomTheme1117.getColors(bj4VarO, i41111111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD1117.g : intercomTheme1117.getColors(bj4VarO, i41111111111111110).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD1117.h : intercomTheme1117.getColors(bj4VarO, i41111111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD1117.i : j, pdaVarD1117.j, ((-14837) & 1024) != 0 ? pdaVarD1117.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD1117.l : j1118, ((-14837) & 4096) != 0 ? pdaVarD1117.m : j1118, ((-14837) & 8192) != 0 ? pdaVarD1117.n : j1118, pdaVarD1117.o, pdaVarD1117.p, pdaVarD1117.q, pdaVarD1117.r, pdaVarD1117.s, pdaVarD1117.t, pdaVarD1117.u, pdaVarD1117.v, pdaVarD1117.w, pdaVarD1117.x, pdaVarD1117.y, pdaVarD1117.z, pdaVarD1117.A, pdaVarD1117.B, pdaVarD1117.C, pdaVarD1117.D, pdaVarD1117.E, pdaVarD1117.F, pdaVarD1117.G, pdaVarD1117.H, pdaVarD1117.I, pdaVarD1117.J, pdaVarD1117.K, pdaVarD1117.L, pdaVarD1117.M, pdaVarD1117.N, pdaVarD1117.O, pdaVarD1117.P, pdaVarD1117.Q);
                        dp5 dp5Var1117 = new dp5(i37, i38, 115);
                        boolean z111111111118 = z4;
                        bp5 bp5Var1117 = new bp5(oh4Var3, null, 59);
                        b72 b72Var1117 = intercomTheme1117.getShapes(bj4VarO, i41111111111111110).b;
                        final boolean z111111111119 = z5;
                        int i41111111111111111 = i37;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var11110 = ci4Var2;
                        bj4Var = bj4VarO;
                        boolean z1111111111110 = z6;
                        ifa.a(str11113, oh4Var, ox6VarB11111114, z1111111111110, intercomTheme1117.getTypography(bj4VarO, i41111111111111110).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            public final void invoke(jt1 jt1Var2, int i41111111111111112) {
                                if ((i41111111111111112 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ci4Var11110, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            public final void invoke(jt1 jt1Var2, int i41111111111111112) {
                                if ((i41111111111111112 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else if (z111111111119) {
                                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, dp5Var1117, bp5Var1117, z111111111118, i36, 0, b72Var1117, pdaVarA1117, bj4Var, ((i4111111111111118 << 3) & 7168) | (i4111111111111119 & 14) | 817889280 | ((i4111111111111119 >> 3) & 112) | ((i4111111111111118 << 21) & 234881024), (29360128 & (i4111111111111119 << 3)) | ((i4111111111111119 << 9) & 234881024), 1604688);
                        oh4Var4 = oh4Var3;
                        uh1Var3 = uh1Var11110;
                        z7 = z1111111111110;
                        ci4Var3 = ci4Var11110;
                        z8 = z111111111118;
                        i39 = i36;
                        i40 = i38;
                        z9 = z111111111119;
                        f3 = f11110;
                        str5 = str4;
                        i41 = i41111111111111111;
                        str6 = str11113;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: vha
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i7 |= 805306368;
                i23 = i6 & 1024;
                if (i23 != 0) {
                    i24 = i5 | 6;
                } else if ((i5 & 6) == 0) {
                    if (bj4VarO.c(z2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i5 | i25;
                } else {
                    i24 = i5;
                }
                i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                if (i26 != 0) {
                    i24 |= 48;
                } else if ((i5 & 48) != 0) {
                    if (bj4VarO.j(ci4Var)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i24 |= i27;
                }
                i28 = i24;
                i29 = i6 & 4096;
                if (i29 != 0) {
                    i31 = i28 | 384;
                } else {
                    i30 = i28;
                    if ((i5 & 384) != 0) {
                        if (bj4VarO.c(z3)) {
                            i32 = 256;
                        } else {
                            i32 = 128;
                        }
                        i30 |= i32;
                    }
                    i31 = i30;
                }
                i33 = i6 & 8192;
                if (i33 != 0) {
                    i35 = i31 | 3072;
                } else {
                    i34 = i31;
                    if ((i5 & 3072) == 0) {
                        i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                    } else {
                        i35 = i34;
                    }
                }
                if ((i7 & 306783379) != 306783378) {
                    str4 = BuildConfig.FLAVOR;
                    if (i42 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (i43 == 0) {
                        str4 = str2;
                    }
                    if (i9 != 0) {
                        uh1Var2 = null;
                    }
                    if (i12 != 0) {
                        i36 = Integer.MAX_VALUE;
                    } else {
                        i36 = i13;
                    }
                    if (i15 != 0) {
                        z4 = false;
                    }
                    c0187a = jt1.a.a;
                    if (i17 != 0) {
                        bj4VarO.K(-652118101);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new w05(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var3 = (oh4) objF3;
                        bj4VarO.U(false);
                    }
                    if (i19 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i2;
                    }
                    if (i21 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i3;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i26 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i29 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i33 != 0) {
                        f2 = Float.NaN;
                    } else {
                        f2 = f;
                    }
                    bj4VarO.K(-652108692);
                    if (uh1Var2 == null) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    } else {
                        jB = uh1Var2.a;
                    }
                    objB = aa0.b(bj4VarO, false, -652103026);
                    if (objB == c0187a) {
                        objB = new jw0();
                        bj4VarO.C(objB);
                    }
                    fw0Var = (fw0) objB;
                    int i41111111111111112 = i35;
                    bj4VarO.U(false);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var1118 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF;
                    uh1 uh1Var11111 = uh1Var2;
                    String str11114 = str3;
                    int i41111111111111113 = i7;
                    ox6 ox6VarB11111115 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                    IntercomTheme intercomTheme1118 = IntercomTheme.INSTANCE;
                    int i41111111111111114 = IntercomTheme.$stable;
                    float f11111 = f2;
                    ox6 ox6VarA1118 = kw0.a(uma.a(ns0.a(ox6VarB11111115, 1.0f, jB, intercomTheme1118.getShapes(bj4VarO, i41111111111111114).b), intercomTheme1118.getShapes(bj4VarO, i41111111111111114).b), fw0Var);
                    bj4VarO.K(-652085201);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB11111116 = p84.b(ox6VarA1118, (oh4) objF2);
                    pda pdaVarD1118 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                    long j1119 = uh1.j;
                    pda pdaVarA1118 = pdaVarD1118.a(((-14837) & 1) != 0 ? pdaVarD1118.a : 0L, ((-14837) & 2) != 0 ? pdaVarD1118.b : 0L, ((-14837) & 4) != 0 ? pdaVarD1118.c : ac4.b(intercomTheme1118, bj4VarO, i41111111111111114), pdaVarD1118.d, ((-14837) & 16) != 0 ? pdaVarD1118.e : intercomTheme1118.getColors(bj4VarO, i41111111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD1118.f : intercomTheme1118.getColors(bj4VarO, i41111111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD1118.g : intercomTheme1118.getColors(bj4VarO, i41111111111111114).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD1118.h : intercomTheme1118.getColors(bj4VarO, i41111111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD1118.i : j, pdaVarD1118.j, ((-14837) & 1024) != 0 ? pdaVarD1118.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD1118.l : j1119, ((-14837) & 4096) != 0 ? pdaVarD1118.m : j1119, ((-14837) & 8192) != 0 ? pdaVarD1118.n : j1119, pdaVarD1118.o, pdaVarD1118.p, pdaVarD1118.q, pdaVarD1118.r, pdaVarD1118.s, pdaVarD1118.t, pdaVarD1118.u, pdaVarD1118.v, pdaVarD1118.w, pdaVarD1118.x, pdaVarD1118.y, pdaVarD1118.z, pdaVarD1118.A, pdaVarD1118.B, pdaVarD1118.C, pdaVarD1118.D, pdaVarD1118.E, pdaVarD1118.F, pdaVarD1118.G, pdaVarD1118.H, pdaVarD1118.I, pdaVarD1118.J, pdaVarD1118.K, pdaVarD1118.L, pdaVarD1118.M, pdaVarD1118.N, pdaVarD1118.O, pdaVarD1118.P, pdaVarD1118.Q);
                    dp5 dp5Var1118 = new dp5(i37, i38, 115);
                    boolean z1111111111111 = z4;
                    bp5 bp5Var1118 = new bp5(oh4Var3, null, 59);
                    b72 b72Var1118 = intercomTheme1118.getShapes(bj4VarO, i41111111111111114).b;
                    final boolean z1111111111112 = z5;
                    int i41111111111111115 = i37;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var11111 = ci4Var2;
                    bj4Var = bj4VarO;
                    boolean z1111111111113 = z6;
                    ifa.a(str11114, oh4Var, ox6VarB11111116, z1111111111113, intercomTheme1118.getTypography(bj4VarO, i41111111111111114).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        public final void invoke(jt1 jt1Var2, int i41111111111111116) {
                            if ((i41111111111111116 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ci4Var11111, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        public final void invoke(jt1 jt1Var2, int i41111111111111116) {
                            if ((i41111111111111116 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else if (z1111111111112) {
                                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, dp5Var1118, bp5Var1118, z1111111111111, i36, 0, b72Var1118, pdaVarA1118, bj4Var, ((i41111111111111112 << 3) & 7168) | (i41111111111111113 & 14) | 817889280 | ((i41111111111111113 >> 3) & 112) | ((i41111111111111112 << 21) & 234881024), (29360128 & (i41111111111111113 << 3)) | ((i41111111111111113 << 9) & 234881024), 1604688);
                    oh4Var4 = oh4Var3;
                    uh1Var3 = uh1Var11111;
                    z7 = z1111111111113;
                    ci4Var3 = ci4Var11111;
                    z8 = z1111111111111;
                    i39 = i36;
                    i40 = i38;
                    z9 = z1111111111112;
                    f3 = f11111;
                    str5 = str4;
                    i41 = i41111111111111115;
                    str6 = str11114;
                } else {
                    str4 = BuildConfig.FLAVOR;
                    if (i42 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (i43 == 0) {
                        str4 = str2;
                    }
                    if (i9 != 0) {
                        uh1Var2 = null;
                    }
                    if (i12 != 0) {
                        i36 = Integer.MAX_VALUE;
                    } else {
                        i36 = i13;
                    }
                    if (i15 != 0) {
                        z4 = false;
                    }
                    c0187a = jt1.a.a;
                    if (i17 != 0) {
                        bj4VarO.K(-652118101);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new w05(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var3 = (oh4) objF3;
                        bj4VarO.U(false);
                    }
                    if (i19 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i2;
                    }
                    if (i21 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i3;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i26 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i29 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i33 != 0) {
                        f2 = Float.NaN;
                    } else {
                        f2 = f;
                    }
                    bj4VarO.K(-652108692);
                    if (uh1Var2 == null) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    } else {
                        jB = uh1Var2.a;
                    }
                    objB = aa0.b(bj4VarO, false, -652103026);
                    if (objB == c0187a) {
                        objB = new jw0();
                        bj4VarO.C(objB);
                    }
                    fw0Var = (fw0) objB;
                    int i41111111111111116 = i35;
                    bj4VarO.U(false);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var1119 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF;
                    uh1 uh1Var11112 = uh1Var2;
                    String str11115 = str3;
                    int i41111111111111117 = i7;
                    ox6 ox6VarB11111117 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                    IntercomTheme intercomTheme1119 = IntercomTheme.INSTANCE;
                    int i41111111111111118 = IntercomTheme.$stable;
                    float f11112 = f2;
                    ox6 ox6VarA1119 = kw0.a(uma.a(ns0.a(ox6VarB11111117, 1.0f, jB, intercomTheme1119.getShapes(bj4VarO, i41111111111111118).b), intercomTheme1119.getShapes(bj4VarO, i41111111111111118).b), fw0Var);
                    bj4VarO.K(-652085201);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB11111118 = p84.b(ox6VarA1119, (oh4) objF2);
                    pda pdaVarD1119 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                    long j11110 = uh1.j;
                    pda pdaVarA1119 = pdaVarD1119.a(((-14837) & 1) != 0 ? pdaVarD1119.a : 0L, ((-14837) & 2) != 0 ? pdaVarD1119.b : 0L, ((-14837) & 4) != 0 ? pdaVarD1119.c : ac4.b(intercomTheme1119, bj4VarO, i41111111111111118), pdaVarD1119.d, ((-14837) & 16) != 0 ? pdaVarD1119.e : intercomTheme1119.getColors(bj4VarO, i41111111111111118).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD1119.f : intercomTheme1119.getColors(bj4VarO, i41111111111111118).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD1119.g : intercomTheme1119.getColors(bj4VarO, i41111111111111118).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD1119.h : intercomTheme1119.getColors(bj4VarO, i41111111111111118).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD1119.i : j, pdaVarD1119.j, ((-14837) & 1024) != 0 ? pdaVarD1119.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD1119.l : j11110, ((-14837) & 4096) != 0 ? pdaVarD1119.m : j11110, ((-14837) & 8192) != 0 ? pdaVarD1119.n : j11110, pdaVarD1119.o, pdaVarD1119.p, pdaVarD1119.q, pdaVarD1119.r, pdaVarD1119.s, pdaVarD1119.t, pdaVarD1119.u, pdaVarD1119.v, pdaVarD1119.w, pdaVarD1119.x, pdaVarD1119.y, pdaVarD1119.z, pdaVarD1119.A, pdaVarD1119.B, pdaVarD1119.C, pdaVarD1119.D, pdaVarD1119.E, pdaVarD1119.F, pdaVarD1119.G, pdaVarD1119.H, pdaVarD1119.I, pdaVarD1119.J, pdaVarD1119.K, pdaVarD1119.L, pdaVarD1119.M, pdaVarD1119.N, pdaVarD1119.O, pdaVarD1119.P, pdaVarD1119.Q);
                    dp5 dp5Var1119 = new dp5(i37, i38, 115);
                    boolean z1111111111114 = z4;
                    bp5 bp5Var1119 = new bp5(oh4Var3, null, 59);
                    b72 b72Var1119 = intercomTheme1119.getShapes(bj4VarO, i41111111111111118).b;
                    final boolean z1111111111115 = z5;
                    int i41111111111111119 = i37;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var11112 = ci4Var2;
                    bj4Var = bj4VarO;
                    boolean z1111111111116 = z6;
                    ifa.a(str11115, oh4Var, ox6VarB11111118, z1111111111116, intercomTheme1119.getTypography(bj4VarO, i41111111111111118).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        public final void invoke(jt1 jt1Var2, int i411111111111111110) {
                            if ((i411111111111111110 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ci4Var11112, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        public final void invoke(jt1 jt1Var2, int i411111111111111110) {
                            if ((i411111111111111110 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else if (z1111111111115) {
                                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, dp5Var1119, bp5Var1119, z1111111111114, i36, 0, b72Var1119, pdaVarA1119, bj4Var, ((i41111111111111116 << 3) & 7168) | (i41111111111111117 & 14) | 817889280 | ((i41111111111111117 >> 3) & 112) | ((i41111111111111116 << 21) & 234881024), (29360128 & (i41111111111111117 << 3)) | ((i41111111111111117 << 9) & 234881024), 1604688);
                    oh4Var4 = oh4Var3;
                    uh1Var3 = uh1Var11112;
                    z7 = z1111111111116;
                    ci4Var3 = ci4Var11112;
                    z8 = z1111111111114;
                    i39 = i36;
                    i40 = i38;
                    z9 = z1111111111115;
                    f3 = f11112;
                    str5 = str4;
                    i41 = i41111111111111119;
                    str6 = str11115;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: vha
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i7 |= 3072;
            uh1Var2 = uh1Var;
            if ((i6 & 16) != 0) {
                i7 |= 24576;
            } else if ((i4 & 24576) == 0) {
                if (bj4VarO.i(j)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i7 |= i11;
            }
            i12 = i6 & 32;
            if (i12 != 0) {
                i7 |= 196608;
                i13 = i;
            } else {
                i13 = i;
                if ((i4 & 196608) == 0) {
                    if (bj4VarO.h(i13)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i7 |= i14;
                }
            }
            i15 = i6 & 64;
            if (i15 != 0) {
                i7 |= 1572864;
                z4 = z;
            } else {
                z4 = z;
                if ((i4 & 1572864) == 0) {
                    if (bj4VarO.c(z4)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i7 |= i16;
                }
            }
            i17 = i6 & 128;
            if (i17 != 0) {
                i7 |= 12582912;
                oh4Var3 = oh4Var2;
            } else {
                oh4Var3 = oh4Var2;
                if ((i4 & 12582912) == 0) {
                    if (bj4VarO.j(oh4Var3)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i7 |= i18;
                }
            }
            i19 = i6 & 256;
            if (i19 != 0) {
                if ((i4 & 100663296) == 0) {
                    if (bj4VarO.h(i2)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i7 |= i20;
                }
                i21 = i6 & 512;
                if (i21 != 0) {
                    if ((i4 & 805306368) == 0) {
                        if (bj4VarO.h(i3)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i7 |= i22;
                    }
                    i23 = i6 & 1024;
                    if (i23 != 0) {
                        i24 = i5 | 6;
                    } else if ((i5 & 6) == 0) {
                        if (bj4VarO.c(z2)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i5 | i25;
                    } else {
                        i24 = i5;
                    }
                    i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    if (i26 != 0) {
                        i24 |= 48;
                    } else if ((i5 & 48) != 0) {
                        if (bj4VarO.j(ci4Var)) {
                            i27 = 32;
                        } else {
                            i27 = 16;
                        }
                        i24 |= i27;
                    }
                    i28 = i24;
                    i29 = i6 & 4096;
                    if (i29 != 0) {
                        i31 = i28 | 384;
                    } else {
                        i30 = i28;
                        if ((i5 & 384) != 0) {
                            if (bj4VarO.c(z3)) {
                                i32 = 256;
                            } else {
                                i32 = 128;
                            }
                            i30 |= i32;
                        }
                        i31 = i30;
                    }
                    i33 = i6 & 8192;
                    if (i33 != 0) {
                        i35 = i31 | 3072;
                    } else {
                        i34 = i31;
                        if ((i5 & 3072) == 0) {
                            i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                        } else {
                            i35 = i34;
                        }
                    }
                    if ((i7 & 306783379) != 306783378) {
                        str4 = BuildConfig.FLAVOR;
                        if (i42 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        if (i43 == 0) {
                            str4 = str2;
                        }
                        if (i9 != 0) {
                            uh1Var2 = null;
                        }
                        if (i12 != 0) {
                            i36 = Integer.MAX_VALUE;
                        } else {
                            i36 = i13;
                        }
                        if (i15 != 0) {
                            z4 = false;
                        }
                        c0187a = jt1.a.a;
                        if (i17 != 0) {
                            bj4VarO.K(-652118101);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new w05(2);
                                bj4VarO.C(objF3);
                            }
                            oh4Var3 = (oh4) objF3;
                            bj4VarO.U(false);
                        }
                        if (i19 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i2;
                        }
                        if (i21 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i3;
                        }
                        if (i23 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i26 != 0) {
                            ci4Var2 = null;
                        } else {
                            ci4Var2 = ci4Var;
                        }
                        if (i29 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i33 != 0) {
                            f2 = Float.NaN;
                        } else {
                            f2 = f;
                        }
                        bj4VarO.K(-652108692);
                        if (uh1Var2 == null) {
                            jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        } else {
                            jB = uh1Var2.a;
                        }
                        objB = aa0.b(bj4VarO, false, -652103026);
                        if (objB == c0187a) {
                            objB = new jw0();
                            bj4VarO.C(objB);
                        }
                        fw0Var = (fw0) objB;
                        int i411111111111111110 = i35;
                        bj4VarO.U(false);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var11110 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72Var = (t72) objF;
                        uh1 uh1Var11113 = uh1Var2;
                        String str11116 = str3;
                        int i411111111111111111 = i7;
                        ox6 ox6VarB11111119 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                        IntercomTheme intercomTheme11110 = IntercomTheme.INSTANCE;
                        int i411111111111111112 = IntercomTheme.$stable;
                        float f11113 = f2;
                        ox6 ox6VarA11110 = kw0.a(uma.a(ns0.a(ox6VarB11111119, 1.0f, jB, intercomTheme11110.getShapes(bj4VarO, i411111111111111112).b), intercomTheme11110.getShapes(bj4VarO, i411111111111111112).b), fw0Var);
                        bj4VarO.K(-652085201);
                        zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarB111111110 = p84.b(ox6VarA11110, (oh4) objF2);
                        pda pdaVarD11110 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                        long j11111 = uh1.j;
                        pda pdaVarA11110 = pdaVarD11110.a(((-14837) & 1) != 0 ? pdaVarD11110.a : 0L, ((-14837) & 2) != 0 ? pdaVarD11110.b : 0L, ((-14837) & 4) != 0 ? pdaVarD11110.c : ac4.b(intercomTheme11110, bj4VarO, i411111111111111112), pdaVarD11110.d, ((-14837) & 16) != 0 ? pdaVarD11110.e : intercomTheme11110.getColors(bj4VarO, i411111111111111112).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD11110.f : intercomTheme11110.getColors(bj4VarO, i411111111111111112).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD11110.g : intercomTheme11110.getColors(bj4VarO, i411111111111111112).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD11110.h : intercomTheme11110.getColors(bj4VarO, i411111111111111112).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD11110.i : j, pdaVarD11110.j, ((-14837) & 1024) != 0 ? pdaVarD11110.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD11110.l : j11111, ((-14837) & 4096) != 0 ? pdaVarD11110.m : j11111, ((-14837) & 8192) != 0 ? pdaVarD11110.n : j11111, pdaVarD11110.o, pdaVarD11110.p, pdaVarD11110.q, pdaVarD11110.r, pdaVarD11110.s, pdaVarD11110.t, pdaVarD11110.u, pdaVarD11110.v, pdaVarD11110.w, pdaVarD11110.x, pdaVarD11110.y, pdaVarD11110.z, pdaVarD11110.A, pdaVarD11110.B, pdaVarD11110.C, pdaVarD11110.D, pdaVarD11110.E, pdaVarD11110.F, pdaVarD11110.G, pdaVarD11110.H, pdaVarD11110.I, pdaVarD11110.J, pdaVarD11110.K, pdaVarD11110.L, pdaVarD11110.M, pdaVarD11110.N, pdaVarD11110.O, pdaVarD11110.P, pdaVarD11110.Q);
                        dp5 dp5Var11110 = new dp5(i37, i38, 115);
                        boolean z1111111111117 = z4;
                        bp5 bp5Var11110 = new bp5(oh4Var3, null, 59);
                        b72 b72Var11110 = intercomTheme11110.getShapes(bj4VarO, i411111111111111112).b;
                        final boolean z1111111111118 = z5;
                        int i411111111111111113 = i37;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var11113 = ci4Var2;
                        bj4Var = bj4VarO;
                        boolean z1111111111119 = z6;
                        ifa.a(str11116, oh4Var, ox6VarB111111110, z1111111111119, intercomTheme11110.getTypography(bj4VarO, i411111111111111112).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            public final void invoke(jt1 jt1Var2, int i411111111111111114) {
                                if ((i411111111111111114 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ci4Var11113, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            public final void invoke(jt1 jt1Var2, int i411111111111111114) {
                                if ((i411111111111111114 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else if (z1111111111118) {
                                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, dp5Var11110, bp5Var11110, z1111111111117, i36, 0, b72Var11110, pdaVarA11110, bj4Var, ((i411111111111111110 << 3) & 7168) | (i411111111111111111 & 14) | 817889280 | ((i411111111111111111 >> 3) & 112) | ((i411111111111111110 << 21) & 234881024), (29360128 & (i411111111111111111 << 3)) | ((i411111111111111111 << 9) & 234881024), 1604688);
                        oh4Var4 = oh4Var3;
                        uh1Var3 = uh1Var11113;
                        z7 = z1111111111119;
                        ci4Var3 = ci4Var11113;
                        z8 = z1111111111117;
                        i39 = i36;
                        i40 = i38;
                        z9 = z1111111111118;
                        f3 = f11113;
                        str5 = str4;
                        i41 = i411111111111111113;
                        str6 = str11116;
                    } else {
                        str4 = BuildConfig.FLAVOR;
                        if (i42 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        if (i43 == 0) {
                            str4 = str2;
                        }
                        if (i9 != 0) {
                            uh1Var2 = null;
                        }
                        if (i12 != 0) {
                            i36 = Integer.MAX_VALUE;
                        } else {
                            i36 = i13;
                        }
                        if (i15 != 0) {
                            z4 = false;
                        }
                        c0187a = jt1.a.a;
                        if (i17 != 0) {
                            bj4VarO.K(-652118101);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new w05(2);
                                bj4VarO.C(objF3);
                            }
                            oh4Var3 = (oh4) objF3;
                            bj4VarO.U(false);
                        }
                        if (i19 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i2;
                        }
                        if (i21 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i3;
                        }
                        if (i23 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i26 != 0) {
                            ci4Var2 = null;
                        } else {
                            ci4Var2 = ci4Var;
                        }
                        if (i29 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i33 != 0) {
                            f2 = Float.NaN;
                        } else {
                            f2 = f;
                        }
                        bj4VarO.K(-652108692);
                        if (uh1Var2 == null) {
                            jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        } else {
                            jB = uh1Var2.a;
                        }
                        objB = aa0.b(bj4VarO, false, -652103026);
                        if (objB == c0187a) {
                            objB = new jw0();
                            bj4VarO.C(objB);
                        }
                        fw0Var = (fw0) objB;
                        int i411111111111111114 = i35;
                        bj4VarO.U(false);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var11111 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72Var = (t72) objF;
                        uh1 uh1Var11114 = uh1Var2;
                        String str11117 = str3;
                        int i411111111111111115 = i7;
                        ox6 ox6VarB111111111 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                        IntercomTheme intercomTheme11111 = IntercomTheme.INSTANCE;
                        int i411111111111111116 = IntercomTheme.$stable;
                        float f11114 = f2;
                        ox6 ox6VarA11111 = kw0.a(uma.a(ns0.a(ox6VarB111111111, 1.0f, jB, intercomTheme11111.getShapes(bj4VarO, i411111111111111116).b), intercomTheme11111.getShapes(bj4VarO, i411111111111111116).b), fw0Var);
                        bj4VarO.K(-652085201);
                        zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarB111111112 = p84.b(ox6VarA11111, (oh4) objF2);
                        pda pdaVarD11111 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                        long j11112 = uh1.j;
                        pda pdaVarA11111 = pdaVarD11111.a(((-14837) & 1) != 0 ? pdaVarD11111.a : 0L, ((-14837) & 2) != 0 ? pdaVarD11111.b : 0L, ((-14837) & 4) != 0 ? pdaVarD11111.c : ac4.b(intercomTheme11111, bj4VarO, i411111111111111116), pdaVarD11111.d, ((-14837) & 16) != 0 ? pdaVarD11111.e : intercomTheme11111.getColors(bj4VarO, i411111111111111116).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD11111.f : intercomTheme11111.getColors(bj4VarO, i411111111111111116).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD11111.g : intercomTheme11111.getColors(bj4VarO, i411111111111111116).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD11111.h : intercomTheme11111.getColors(bj4VarO, i411111111111111116).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD11111.i : j, pdaVarD11111.j, ((-14837) & 1024) != 0 ? pdaVarD11111.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD11111.l : j11112, ((-14837) & 4096) != 0 ? pdaVarD11111.m : j11112, ((-14837) & 8192) != 0 ? pdaVarD11111.n : j11112, pdaVarD11111.o, pdaVarD11111.p, pdaVarD11111.q, pdaVarD11111.r, pdaVarD11111.s, pdaVarD11111.t, pdaVarD11111.u, pdaVarD11111.v, pdaVarD11111.w, pdaVarD11111.x, pdaVarD11111.y, pdaVarD11111.z, pdaVarD11111.A, pdaVarD11111.B, pdaVarD11111.C, pdaVarD11111.D, pdaVarD11111.E, pdaVarD11111.F, pdaVarD11111.G, pdaVarD11111.H, pdaVarD11111.I, pdaVarD11111.J, pdaVarD11111.K, pdaVarD11111.L, pdaVarD11111.M, pdaVarD11111.N, pdaVarD11111.O, pdaVarD11111.P, pdaVarD11111.Q);
                        dp5 dp5Var11111 = new dp5(i37, i38, 115);
                        boolean z11111111111110 = z4;
                        bp5 bp5Var11111 = new bp5(oh4Var3, null, 59);
                        b72 b72Var11111 = intercomTheme11111.getShapes(bj4VarO, i411111111111111116).b;
                        final boolean z11111111111111 = z5;
                        int i411111111111111117 = i37;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var11114 = ci4Var2;
                        bj4Var = bj4VarO;
                        boolean z11111111111112 = z6;
                        ifa.a(str11117, oh4Var, ox6VarB111111112, z11111111111112, intercomTheme11111.getTypography(bj4VarO, i411111111111111116).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            public final void invoke(jt1 jt1Var2, int i411111111111111118) {
                                if ((i411111111111111118 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ci4Var11114, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            public final void invoke(jt1 jt1Var2, int i411111111111111118) {
                                if ((i411111111111111118 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else if (z11111111111111) {
                                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, dp5Var11111, bp5Var11111, z11111111111110, i36, 0, b72Var11111, pdaVarA11111, bj4Var, ((i411111111111111114 << 3) & 7168) | (i411111111111111115 & 14) | 817889280 | ((i411111111111111115 >> 3) & 112) | ((i411111111111111114 << 21) & 234881024), (29360128 & (i411111111111111115 << 3)) | ((i411111111111111115 << 9) & 234881024), 1604688);
                        oh4Var4 = oh4Var3;
                        uh1Var3 = uh1Var11114;
                        z7 = z11111111111112;
                        ci4Var3 = ci4Var11114;
                        z8 = z11111111111110;
                        i39 = i36;
                        i40 = i38;
                        z9 = z11111111111111;
                        f3 = f11114;
                        str5 = str4;
                        i41 = i411111111111111117;
                        str6 = str11117;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: vha
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i7 |= 805306368;
                i23 = i6 & 1024;
                if (i23 != 0) {
                    i24 = i5 | 6;
                } else if ((i5 & 6) == 0) {
                    if (bj4VarO.c(z2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i5 | i25;
                } else {
                    i24 = i5;
                }
                i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                if (i26 != 0) {
                    i24 |= 48;
                } else if ((i5 & 48) != 0) {
                    if (bj4VarO.j(ci4Var)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i24 |= i27;
                }
                i28 = i24;
                i29 = i6 & 4096;
                if (i29 != 0) {
                    i31 = i28 | 384;
                } else {
                    i30 = i28;
                    if ((i5 & 384) != 0) {
                        if (bj4VarO.c(z3)) {
                            i32 = 256;
                        } else {
                            i32 = 128;
                        }
                        i30 |= i32;
                    }
                    i31 = i30;
                }
                i33 = i6 & 8192;
                if (i33 != 0) {
                    i35 = i31 | 3072;
                } else {
                    i34 = i31;
                    if ((i5 & 3072) == 0) {
                        i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                    } else {
                        i35 = i34;
                    }
                }
                if ((i7 & 306783379) != 306783378) {
                    str4 = BuildConfig.FLAVOR;
                    if (i42 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (i43 == 0) {
                        str4 = str2;
                    }
                    if (i9 != 0) {
                        uh1Var2 = null;
                    }
                    if (i12 != 0) {
                        i36 = Integer.MAX_VALUE;
                    } else {
                        i36 = i13;
                    }
                    if (i15 != 0) {
                        z4 = false;
                    }
                    c0187a = jt1.a.a;
                    if (i17 != 0) {
                        bj4VarO.K(-652118101);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new w05(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var3 = (oh4) objF3;
                        bj4VarO.U(false);
                    }
                    if (i19 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i2;
                    }
                    if (i21 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i3;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i26 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i29 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i33 != 0) {
                        f2 = Float.NaN;
                    } else {
                        f2 = f;
                    }
                    bj4VarO.K(-652108692);
                    if (uh1Var2 == null) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    } else {
                        jB = uh1Var2.a;
                    }
                    objB = aa0.b(bj4VarO, false, -652103026);
                    if (objB == c0187a) {
                        objB = new jw0();
                        bj4VarO.C(objB);
                    }
                    fw0Var = (fw0) objB;
                    int i411111111111111118 = i35;
                    bj4VarO.U(false);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var11112 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF;
                    uh1 uh1Var11115 = uh1Var2;
                    String str11118 = str3;
                    int i411111111111111119 = i7;
                    ox6 ox6VarB111111113 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                    IntercomTheme intercomTheme11112 = IntercomTheme.INSTANCE;
                    int i4111111111111111110 = IntercomTheme.$stable;
                    float f11115 = f2;
                    ox6 ox6VarA11112 = kw0.a(uma.a(ns0.a(ox6VarB111111113, 1.0f, jB, intercomTheme11112.getShapes(bj4VarO, i4111111111111111110).b), intercomTheme11112.getShapes(bj4VarO, i4111111111111111110).b), fw0Var);
                    bj4VarO.K(-652085201);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB111111114 = p84.b(ox6VarA11112, (oh4) objF2);
                    pda pdaVarD11112 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                    long j11113 = uh1.j;
                    pda pdaVarA11112 = pdaVarD11112.a(((-14837) & 1) != 0 ? pdaVarD11112.a : 0L, ((-14837) & 2) != 0 ? pdaVarD11112.b : 0L, ((-14837) & 4) != 0 ? pdaVarD11112.c : ac4.b(intercomTheme11112, bj4VarO, i4111111111111111110), pdaVarD11112.d, ((-14837) & 16) != 0 ? pdaVarD11112.e : intercomTheme11112.getColors(bj4VarO, i4111111111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD11112.f : intercomTheme11112.getColors(bj4VarO, i4111111111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD11112.g : intercomTheme11112.getColors(bj4VarO, i4111111111111111110).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD11112.h : intercomTheme11112.getColors(bj4VarO, i4111111111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD11112.i : j, pdaVarD11112.j, ((-14837) & 1024) != 0 ? pdaVarD11112.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD11112.l : j11113, ((-14837) & 4096) != 0 ? pdaVarD11112.m : j11113, ((-14837) & 8192) != 0 ? pdaVarD11112.n : j11113, pdaVarD11112.o, pdaVarD11112.p, pdaVarD11112.q, pdaVarD11112.r, pdaVarD11112.s, pdaVarD11112.t, pdaVarD11112.u, pdaVarD11112.v, pdaVarD11112.w, pdaVarD11112.x, pdaVarD11112.y, pdaVarD11112.z, pdaVarD11112.A, pdaVarD11112.B, pdaVarD11112.C, pdaVarD11112.D, pdaVarD11112.E, pdaVarD11112.F, pdaVarD11112.G, pdaVarD11112.H, pdaVarD11112.I, pdaVarD11112.J, pdaVarD11112.K, pdaVarD11112.L, pdaVarD11112.M, pdaVarD11112.N, pdaVarD11112.O, pdaVarD11112.P, pdaVarD11112.Q);
                    dp5 dp5Var11112 = new dp5(i37, i38, 115);
                    boolean z11111111111113 = z4;
                    bp5 bp5Var11112 = new bp5(oh4Var3, null, 59);
                    b72 b72Var11112 = intercomTheme11112.getShapes(bj4VarO, i4111111111111111110).b;
                    final boolean z11111111111114 = z5;
                    int i4111111111111111111 = i37;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var11115 = ci4Var2;
                    bj4Var = bj4VarO;
                    boolean z11111111111115 = z6;
                    ifa.a(str11118, oh4Var, ox6VarB111111114, z11111111111115, intercomTheme11112.getTypography(bj4VarO, i4111111111111111110).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        public final void invoke(jt1 jt1Var2, int i4111111111111111112) {
                            if ((i4111111111111111112 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ci4Var11115, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        public final void invoke(jt1 jt1Var2, int i4111111111111111112) {
                            if ((i4111111111111111112 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else if (z11111111111114) {
                                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, dp5Var11112, bp5Var11112, z11111111111113, i36, 0, b72Var11112, pdaVarA11112, bj4Var, ((i411111111111111118 << 3) & 7168) | (i411111111111111119 & 14) | 817889280 | ((i411111111111111119 >> 3) & 112) | ((i411111111111111118 << 21) & 234881024), (29360128 & (i411111111111111119 << 3)) | ((i411111111111111119 << 9) & 234881024), 1604688);
                    oh4Var4 = oh4Var3;
                    uh1Var3 = uh1Var11115;
                    z7 = z11111111111115;
                    ci4Var3 = ci4Var11115;
                    z8 = z11111111111113;
                    i39 = i36;
                    i40 = i38;
                    z9 = z11111111111114;
                    f3 = f11115;
                    str5 = str4;
                    i41 = i4111111111111111111;
                    str6 = str11118;
                } else {
                    str4 = BuildConfig.FLAVOR;
                    if (i42 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (i43 == 0) {
                        str4 = str2;
                    }
                    if (i9 != 0) {
                        uh1Var2 = null;
                    }
                    if (i12 != 0) {
                        i36 = Integer.MAX_VALUE;
                    } else {
                        i36 = i13;
                    }
                    if (i15 != 0) {
                        z4 = false;
                    }
                    c0187a = jt1.a.a;
                    if (i17 != 0) {
                        bj4VarO.K(-652118101);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new w05(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var3 = (oh4) objF3;
                        bj4VarO.U(false);
                    }
                    if (i19 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i2;
                    }
                    if (i21 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i3;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i26 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i29 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i33 != 0) {
                        f2 = Float.NaN;
                    } else {
                        f2 = f;
                    }
                    bj4VarO.K(-652108692);
                    if (uh1Var2 == null) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    } else {
                        jB = uh1Var2.a;
                    }
                    objB = aa0.b(bj4VarO, false, -652103026);
                    if (objB == c0187a) {
                        objB = new jw0();
                        bj4VarO.C(objB);
                    }
                    fw0Var = (fw0) objB;
                    int i4111111111111111112 = i35;
                    bj4VarO.U(false);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var11113 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF;
                    uh1 uh1Var11116 = uh1Var2;
                    String str11119 = str3;
                    int i4111111111111111113 = i7;
                    ox6 ox6VarB111111115 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                    IntercomTheme intercomTheme11113 = IntercomTheme.INSTANCE;
                    int i4111111111111111114 = IntercomTheme.$stable;
                    float f11116 = f2;
                    ox6 ox6VarA11113 = kw0.a(uma.a(ns0.a(ox6VarB111111115, 1.0f, jB, intercomTheme11113.getShapes(bj4VarO, i4111111111111111114).b), intercomTheme11113.getShapes(bj4VarO, i4111111111111111114).b), fw0Var);
                    bj4VarO.K(-652085201);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB111111116 = p84.b(ox6VarA11113, (oh4) objF2);
                    pda pdaVarD11113 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                    long j11114 = uh1.j;
                    pda pdaVarA11113 = pdaVarD11113.a(((-14837) & 1) != 0 ? pdaVarD11113.a : 0L, ((-14837) & 2) != 0 ? pdaVarD11113.b : 0L, ((-14837) & 4) != 0 ? pdaVarD11113.c : ac4.b(intercomTheme11113, bj4VarO, i4111111111111111114), pdaVarD11113.d, ((-14837) & 16) != 0 ? pdaVarD11113.e : intercomTheme11113.getColors(bj4VarO, i4111111111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD11113.f : intercomTheme11113.getColors(bj4VarO, i4111111111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD11113.g : intercomTheme11113.getColors(bj4VarO, i4111111111111111114).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD11113.h : intercomTheme11113.getColors(bj4VarO, i4111111111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD11113.i : j, pdaVarD11113.j, ((-14837) & 1024) != 0 ? pdaVarD11113.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD11113.l : j11114, ((-14837) & 4096) != 0 ? pdaVarD11113.m : j11114, ((-14837) & 8192) != 0 ? pdaVarD11113.n : j11114, pdaVarD11113.o, pdaVarD11113.p, pdaVarD11113.q, pdaVarD11113.r, pdaVarD11113.s, pdaVarD11113.t, pdaVarD11113.u, pdaVarD11113.v, pdaVarD11113.w, pdaVarD11113.x, pdaVarD11113.y, pdaVarD11113.z, pdaVarD11113.A, pdaVarD11113.B, pdaVarD11113.C, pdaVarD11113.D, pdaVarD11113.E, pdaVarD11113.F, pdaVarD11113.G, pdaVarD11113.H, pdaVarD11113.I, pdaVarD11113.J, pdaVarD11113.K, pdaVarD11113.L, pdaVarD11113.M, pdaVarD11113.N, pdaVarD11113.O, pdaVarD11113.P, pdaVarD11113.Q);
                    dp5 dp5Var11113 = new dp5(i37, i38, 115);
                    boolean z11111111111116 = z4;
                    bp5 bp5Var11113 = new bp5(oh4Var3, null, 59);
                    b72 b72Var11113 = intercomTheme11113.getShapes(bj4VarO, i4111111111111111114).b;
                    final boolean z11111111111117 = z5;
                    int i4111111111111111115 = i37;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var11116 = ci4Var2;
                    bj4Var = bj4VarO;
                    boolean z11111111111118 = z6;
                    ifa.a(str11119, oh4Var, ox6VarB111111116, z11111111111118, intercomTheme11113.getTypography(bj4VarO, i4111111111111111114).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        public final void invoke(jt1 jt1Var2, int i4111111111111111116) {
                            if ((i4111111111111111116 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ci4Var11116, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        public final void invoke(jt1 jt1Var2, int i4111111111111111116) {
                            if ((i4111111111111111116 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else if (z11111111111117) {
                                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, dp5Var11113, bp5Var11113, z11111111111116, i36, 0, b72Var11113, pdaVarA11113, bj4Var, ((i4111111111111111112 << 3) & 7168) | (i4111111111111111113 & 14) | 817889280 | ((i4111111111111111113 >> 3) & 112) | ((i4111111111111111112 << 21) & 234881024), (29360128 & (i4111111111111111113 << 3)) | ((i4111111111111111113 << 9) & 234881024), 1604688);
                    oh4Var4 = oh4Var3;
                    uh1Var3 = uh1Var11116;
                    z7 = z11111111111118;
                    ci4Var3 = ci4Var11116;
                    z8 = z11111111111116;
                    i39 = i36;
                    i40 = i38;
                    z9 = z11111111111117;
                    f3 = f11116;
                    str5 = str4;
                    i41 = i4111111111111111115;
                    str6 = str11119;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: vha
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i7 |= 100663296;
            i21 = i6 & 512;
            if (i21 != 0) {
                if ((i4 & 805306368) == 0) {
                    if (bj4VarO.h(i3)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i7 |= i22;
                }
                i23 = i6 & 1024;
                if (i23 != 0) {
                    i24 = i5 | 6;
                } else if ((i5 & 6) == 0) {
                    if (bj4VarO.c(z2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i5 | i25;
                } else {
                    i24 = i5;
                }
                i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                if (i26 != 0) {
                    i24 |= 48;
                } else if ((i5 & 48) != 0) {
                    if (bj4VarO.j(ci4Var)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i24 |= i27;
                }
                i28 = i24;
                i29 = i6 & 4096;
                if (i29 != 0) {
                    i31 = i28 | 384;
                } else {
                    i30 = i28;
                    if ((i5 & 384) != 0) {
                        if (bj4VarO.c(z3)) {
                            i32 = 256;
                        } else {
                            i32 = 128;
                        }
                        i30 |= i32;
                    }
                    i31 = i30;
                }
                i33 = i6 & 8192;
                if (i33 != 0) {
                    i35 = i31 | 3072;
                } else {
                    i34 = i31;
                    if ((i5 & 3072) == 0) {
                        i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                    } else {
                        i35 = i34;
                    }
                }
                if ((i7 & 306783379) != 306783378) {
                    str4 = BuildConfig.FLAVOR;
                    if (i42 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (i43 == 0) {
                        str4 = str2;
                    }
                    if (i9 != 0) {
                        uh1Var2 = null;
                    }
                    if (i12 != 0) {
                        i36 = Integer.MAX_VALUE;
                    } else {
                        i36 = i13;
                    }
                    if (i15 != 0) {
                        z4 = false;
                    }
                    c0187a = jt1.a.a;
                    if (i17 != 0) {
                        bj4VarO.K(-652118101);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new w05(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var3 = (oh4) objF3;
                        bj4VarO.U(false);
                    }
                    if (i19 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i2;
                    }
                    if (i21 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i3;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i26 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i29 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i33 != 0) {
                        f2 = Float.NaN;
                    } else {
                        f2 = f;
                    }
                    bj4VarO.K(-652108692);
                    if (uh1Var2 == null) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    } else {
                        jB = uh1Var2.a;
                    }
                    objB = aa0.b(bj4VarO, false, -652103026);
                    if (objB == c0187a) {
                        objB = new jw0();
                        bj4VarO.C(objB);
                    }
                    fw0Var = (fw0) objB;
                    int i4111111111111111116 = i35;
                    bj4VarO.U(false);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var11114 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF;
                    uh1 uh1Var11117 = uh1Var2;
                    String str111110 = str3;
                    int i4111111111111111117 = i7;
                    ox6 ox6VarB111111117 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                    IntercomTheme intercomTheme11114 = IntercomTheme.INSTANCE;
                    int i4111111111111111118 = IntercomTheme.$stable;
                    float f11117 = f2;
                    ox6 ox6VarA11114 = kw0.a(uma.a(ns0.a(ox6VarB111111117, 1.0f, jB, intercomTheme11114.getShapes(bj4VarO, i4111111111111111118).b), intercomTheme11114.getShapes(bj4VarO, i4111111111111111118).b), fw0Var);
                    bj4VarO.K(-652085201);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB111111118 = p84.b(ox6VarA11114, (oh4) objF2);
                    pda pdaVarD11114 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                    long j11115 = uh1.j;
                    pda pdaVarA11114 = pdaVarD11114.a(((-14837) & 1) != 0 ? pdaVarD11114.a : 0L, ((-14837) & 2) != 0 ? pdaVarD11114.b : 0L, ((-14837) & 4) != 0 ? pdaVarD11114.c : ac4.b(intercomTheme11114, bj4VarO, i4111111111111111118), pdaVarD11114.d, ((-14837) & 16) != 0 ? pdaVarD11114.e : intercomTheme11114.getColors(bj4VarO, i4111111111111111118).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD11114.f : intercomTheme11114.getColors(bj4VarO, i4111111111111111118).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD11114.g : intercomTheme11114.getColors(bj4VarO, i4111111111111111118).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD11114.h : intercomTheme11114.getColors(bj4VarO, i4111111111111111118).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD11114.i : j, pdaVarD11114.j, ((-14837) & 1024) != 0 ? pdaVarD11114.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD11114.l : j11115, ((-14837) & 4096) != 0 ? pdaVarD11114.m : j11115, ((-14837) & 8192) != 0 ? pdaVarD11114.n : j11115, pdaVarD11114.o, pdaVarD11114.p, pdaVarD11114.q, pdaVarD11114.r, pdaVarD11114.s, pdaVarD11114.t, pdaVarD11114.u, pdaVarD11114.v, pdaVarD11114.w, pdaVarD11114.x, pdaVarD11114.y, pdaVarD11114.z, pdaVarD11114.A, pdaVarD11114.B, pdaVarD11114.C, pdaVarD11114.D, pdaVarD11114.E, pdaVarD11114.F, pdaVarD11114.G, pdaVarD11114.H, pdaVarD11114.I, pdaVarD11114.J, pdaVarD11114.K, pdaVarD11114.L, pdaVarD11114.M, pdaVarD11114.N, pdaVarD11114.O, pdaVarD11114.P, pdaVarD11114.Q);
                    dp5 dp5Var11114 = new dp5(i37, i38, 115);
                    boolean z11111111111119 = z4;
                    bp5 bp5Var11114 = new bp5(oh4Var3, null, 59);
                    b72 b72Var11114 = intercomTheme11114.getShapes(bj4VarO, i4111111111111111118).b;
                    final boolean z111111111111110 = z5;
                    int i4111111111111111119 = i37;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var11117 = ci4Var2;
                    bj4Var = bj4VarO;
                    boolean z111111111111111 = z6;
                    ifa.a(str111110, oh4Var, ox6VarB111111118, z111111111111111, intercomTheme11114.getTypography(bj4VarO, i4111111111111111118).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        public final void invoke(jt1 jt1Var2, int i41111111111111111110) {
                            if ((i41111111111111111110 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ci4Var11117, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        public final void invoke(jt1 jt1Var2, int i41111111111111111110) {
                            if ((i41111111111111111110 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else if (z111111111111110) {
                                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, dp5Var11114, bp5Var11114, z11111111111119, i36, 0, b72Var11114, pdaVarA11114, bj4Var, ((i4111111111111111116 << 3) & 7168) | (i4111111111111111117 & 14) | 817889280 | ((i4111111111111111117 >> 3) & 112) | ((i4111111111111111116 << 21) & 234881024), (29360128 & (i4111111111111111117 << 3)) | ((i4111111111111111117 << 9) & 234881024), 1604688);
                    oh4Var4 = oh4Var3;
                    uh1Var3 = uh1Var11117;
                    z7 = z111111111111111;
                    ci4Var3 = ci4Var11117;
                    z8 = z11111111111119;
                    i39 = i36;
                    i40 = i38;
                    z9 = z111111111111110;
                    f3 = f11117;
                    str5 = str4;
                    i41 = i4111111111111111119;
                    str6 = str111110;
                } else {
                    str4 = BuildConfig.FLAVOR;
                    if (i42 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (i43 == 0) {
                        str4 = str2;
                    }
                    if (i9 != 0) {
                        uh1Var2 = null;
                    }
                    if (i12 != 0) {
                        i36 = Integer.MAX_VALUE;
                    } else {
                        i36 = i13;
                    }
                    if (i15 != 0) {
                        z4 = false;
                    }
                    c0187a = jt1.a.a;
                    if (i17 != 0) {
                        bj4VarO.K(-652118101);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new w05(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var3 = (oh4) objF3;
                        bj4VarO.U(false);
                    }
                    if (i19 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i2;
                    }
                    if (i21 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i3;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i26 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i29 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i33 != 0) {
                        f2 = Float.NaN;
                    } else {
                        f2 = f;
                    }
                    bj4VarO.K(-652108692);
                    if (uh1Var2 == null) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    } else {
                        jB = uh1Var2.a;
                    }
                    objB = aa0.b(bj4VarO, false, -652103026);
                    if (objB == c0187a) {
                        objB = new jw0();
                        bj4VarO.C(objB);
                    }
                    fw0Var = (fw0) objB;
                    int i41111111111111111110 = i35;
                    bj4VarO.U(false);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var11115 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF;
                    uh1 uh1Var11118 = uh1Var2;
                    String str111111 = str3;
                    int i41111111111111111111 = i7;
                    ox6 ox6VarB111111119 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                    IntercomTheme intercomTheme11115 = IntercomTheme.INSTANCE;
                    int i41111111111111111112 = IntercomTheme.$stable;
                    float f11118 = f2;
                    ox6 ox6VarA11115 = kw0.a(uma.a(ns0.a(ox6VarB111111119, 1.0f, jB, intercomTheme11115.getShapes(bj4VarO, i41111111111111111112).b), intercomTheme11115.getShapes(bj4VarO, i41111111111111111112).b), fw0Var);
                    bj4VarO.K(-652085201);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB1111111110 = p84.b(ox6VarA11115, (oh4) objF2);
                    pda pdaVarD11115 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                    long j11116 = uh1.j;
                    pda pdaVarA11115 = pdaVarD11115.a(((-14837) & 1) != 0 ? pdaVarD11115.a : 0L, ((-14837) & 2) != 0 ? pdaVarD11115.b : 0L, ((-14837) & 4) != 0 ? pdaVarD11115.c : ac4.b(intercomTheme11115, bj4VarO, i41111111111111111112), pdaVarD11115.d, ((-14837) & 16) != 0 ? pdaVarD11115.e : intercomTheme11115.getColors(bj4VarO, i41111111111111111112).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD11115.f : intercomTheme11115.getColors(bj4VarO, i41111111111111111112).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD11115.g : intercomTheme11115.getColors(bj4VarO, i41111111111111111112).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD11115.h : intercomTheme11115.getColors(bj4VarO, i41111111111111111112).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD11115.i : j, pdaVarD11115.j, ((-14837) & 1024) != 0 ? pdaVarD11115.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD11115.l : j11116, ((-14837) & 4096) != 0 ? pdaVarD11115.m : j11116, ((-14837) & 8192) != 0 ? pdaVarD11115.n : j11116, pdaVarD11115.o, pdaVarD11115.p, pdaVarD11115.q, pdaVarD11115.r, pdaVarD11115.s, pdaVarD11115.t, pdaVarD11115.u, pdaVarD11115.v, pdaVarD11115.w, pdaVarD11115.x, pdaVarD11115.y, pdaVarD11115.z, pdaVarD11115.A, pdaVarD11115.B, pdaVarD11115.C, pdaVarD11115.D, pdaVarD11115.E, pdaVarD11115.F, pdaVarD11115.G, pdaVarD11115.H, pdaVarD11115.I, pdaVarD11115.J, pdaVarD11115.K, pdaVarD11115.L, pdaVarD11115.M, pdaVarD11115.N, pdaVarD11115.O, pdaVarD11115.P, pdaVarD11115.Q);
                    dp5 dp5Var11115 = new dp5(i37, i38, 115);
                    boolean z111111111111112 = z4;
                    bp5 bp5Var11115 = new bp5(oh4Var3, null, 59);
                    b72 b72Var11115 = intercomTheme11115.getShapes(bj4VarO, i41111111111111111112).b;
                    final boolean z111111111111113 = z5;
                    int i41111111111111111113 = i37;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var11118 = ci4Var2;
                    bj4Var = bj4VarO;
                    boolean z111111111111114 = z6;
                    ifa.a(str111111, oh4Var, ox6VarB1111111110, z111111111111114, intercomTheme11115.getTypography(bj4VarO, i41111111111111111112).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        public final void invoke(jt1 jt1Var2, int i41111111111111111114) {
                            if ((i41111111111111111114 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ci4Var11118, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        public final void invoke(jt1 jt1Var2, int i41111111111111111114) {
                            if ((i41111111111111111114 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else if (z111111111111113) {
                                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, dp5Var11115, bp5Var11115, z111111111111112, i36, 0, b72Var11115, pdaVarA11115, bj4Var, ((i41111111111111111110 << 3) & 7168) | (i41111111111111111111 & 14) | 817889280 | ((i41111111111111111111 >> 3) & 112) | ((i41111111111111111110 << 21) & 234881024), (29360128 & (i41111111111111111111 << 3)) | ((i41111111111111111111 << 9) & 234881024), 1604688);
                    oh4Var4 = oh4Var3;
                    uh1Var3 = uh1Var11118;
                    z7 = z111111111111114;
                    ci4Var3 = ci4Var11118;
                    z8 = z111111111111112;
                    i39 = i36;
                    i40 = i38;
                    z9 = z111111111111113;
                    f3 = f11118;
                    str5 = str4;
                    i41 = i41111111111111111113;
                    str6 = str111111;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: vha
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i7 |= 805306368;
            i23 = i6 & 1024;
            if (i23 != 0) {
                i24 = i5 | 6;
            } else if ((i5 & 6) == 0) {
                if (bj4VarO.c(z2)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i5 | i25;
            } else {
                i24 = i5;
            }
            i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
            if (i26 != 0) {
                i24 |= 48;
            } else if ((i5 & 48) != 0) {
                if (bj4VarO.j(ci4Var)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i24 |= i27;
            }
            i28 = i24;
            i29 = i6 & 4096;
            if (i29 != 0) {
                i31 = i28 | 384;
            } else {
                i30 = i28;
                if ((i5 & 384) != 0) {
                    if (bj4VarO.c(z3)) {
                        i32 = 256;
                    } else {
                        i32 = 128;
                    }
                    i30 |= i32;
                }
                i31 = i30;
            }
            i33 = i6 & 8192;
            if (i33 != 0) {
                i35 = i31 | 3072;
            } else {
                i34 = i31;
                if ((i5 & 3072) == 0) {
                    i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                } else {
                    i35 = i34;
                }
            }
            if ((i7 & 306783379) != 306783378) {
                str4 = BuildConfig.FLAVOR;
                if (i42 != 0) {
                    str3 = BuildConfig.FLAVOR;
                }
                if (i43 == 0) {
                    str4 = str2;
                }
                if (i9 != 0) {
                    uh1Var2 = null;
                }
                if (i12 != 0) {
                    i36 = Integer.MAX_VALUE;
                } else {
                    i36 = i13;
                }
                if (i15 != 0) {
                    z4 = false;
                }
                c0187a = jt1.a.a;
                if (i17 != 0) {
                    bj4VarO.K(-652118101);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new w05(2);
                        bj4VarO.C(objF3);
                    }
                    oh4Var3 = (oh4) objF3;
                    bj4VarO.U(false);
                }
                if (i19 != 0) {
                    i37 = 1;
                } else {
                    i37 = i2;
                }
                if (i21 != 0) {
                    i38 = 1;
                } else {
                    i38 = i3;
                }
                if (i23 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i26 != 0) {
                    ci4Var2 = null;
                } else {
                    ci4Var2 = ci4Var;
                }
                if (i29 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i33 != 0) {
                    f2 = Float.NaN;
                } else {
                    f2 = f;
                }
                bj4VarO.K(-652108692);
                if (uh1Var2 == null) {
                    jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                } else {
                    jB = uh1Var2.a;
                }
                objB = aa0.b(bj4VarO, false, -652103026);
                if (objB == c0187a) {
                    objB = new jw0();
                    bj4VarO.C(objB);
                }
                fw0Var = (fw0) objB;
                int i41111111111111111114 = i35;
                bj4VarO.U(false);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    c33 c33Var11116 = wd3.a;
                    objF = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72Var = (t72) objF;
                uh1 uh1Var11119 = uh1Var2;
                String str111112 = str3;
                int i41111111111111111115 = i7;
                ox6 ox6VarB1111111111 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                IntercomTheme intercomTheme11116 = IntercomTheme.INSTANCE;
                int i41111111111111111116 = IntercomTheme.$stable;
                float f11119 = f2;
                ox6 ox6VarA11116 = kw0.a(uma.a(ns0.a(ox6VarB1111111111, 1.0f, jB, intercomTheme11116.getShapes(bj4VarO, i41111111111111111116).b), intercomTheme11116.getShapes(bj4VarO, i41111111111111111116).b), fw0Var);
                bj4VarO.K(-652085201);
                zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new w62(1, t72Var, fw0Var);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new w62(1, t72Var, fw0Var);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ox6 ox6VarB1111111112 = p84.b(ox6VarA11116, (oh4) objF2);
                pda pdaVarD11116 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                long j11117 = uh1.j;
                pda pdaVarA11116 = pdaVarD11116.a(((-14837) & 1) != 0 ? pdaVarD11116.a : 0L, ((-14837) & 2) != 0 ? pdaVarD11116.b : 0L, ((-14837) & 4) != 0 ? pdaVarD11116.c : ac4.b(intercomTheme11116, bj4VarO, i41111111111111111116), pdaVarD11116.d, ((-14837) & 16) != 0 ? pdaVarD11116.e : intercomTheme11116.getColors(bj4VarO, i41111111111111111116).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD11116.f : intercomTheme11116.getColors(bj4VarO, i41111111111111111116).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD11116.g : intercomTheme11116.getColors(bj4VarO, i41111111111111111116).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD11116.h : intercomTheme11116.getColors(bj4VarO, i41111111111111111116).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD11116.i : j, pdaVarD11116.j, ((-14837) & 1024) != 0 ? pdaVarD11116.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD11116.l : j11117, ((-14837) & 4096) != 0 ? pdaVarD11116.m : j11117, ((-14837) & 8192) != 0 ? pdaVarD11116.n : j11117, pdaVarD11116.o, pdaVarD11116.p, pdaVarD11116.q, pdaVarD11116.r, pdaVarD11116.s, pdaVarD11116.t, pdaVarD11116.u, pdaVarD11116.v, pdaVarD11116.w, pdaVarD11116.x, pdaVarD11116.y, pdaVarD11116.z, pdaVarD11116.A, pdaVarD11116.B, pdaVarD11116.C, pdaVarD11116.D, pdaVarD11116.E, pdaVarD11116.F, pdaVarD11116.G, pdaVarD11116.H, pdaVarD11116.I, pdaVarD11116.J, pdaVarD11116.K, pdaVarD11116.L, pdaVarD11116.M, pdaVarD11116.N, pdaVarD11116.O, pdaVarD11116.P, pdaVarD11116.Q);
                dp5 dp5Var11116 = new dp5(i37, i38, 115);
                boolean z111111111111115 = z4;
                bp5 bp5Var11116 = new bp5(oh4Var3, null, 59);
                b72 b72Var11116 = intercomTheme11116.getShapes(bj4VarO, i41111111111111111116).b;
                final boolean z111111111111116 = z5;
                int i41111111111111111117 = i37;
                ci4<? super jt1, ? super Integer, g2b> ci4Var11119 = ci4Var2;
                bj4Var = bj4VarO;
                boolean z111111111111117 = z6;
                ifa.a(str111112, oh4Var, ox6VarB1111111112, z111111111111117, intercomTheme11116.getTypography(bj4VarO, i41111111111111111116).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    public final void invoke(jt1 jt1Var2, int i41111111111111111118) {
                        if ((i41111111111111111118 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ci4Var11119, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    public final void invoke(jt1 jt1Var2, int i41111111111111111118) {
                        if ((i41111111111111111118 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else if (z111111111111116) {
                            m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, dp5Var11116, bp5Var11116, z111111111111115, i36, 0, b72Var11116, pdaVarA11116, bj4Var, ((i41111111111111111114 << 3) & 7168) | (i41111111111111111115 & 14) | 817889280 | ((i41111111111111111115 >> 3) & 112) | ((i41111111111111111114 << 21) & 234881024), (29360128 & (i41111111111111111115 << 3)) | ((i41111111111111111115 << 9) & 234881024), 1604688);
                oh4Var4 = oh4Var3;
                uh1Var3 = uh1Var11119;
                z7 = z111111111111117;
                ci4Var3 = ci4Var11119;
                z8 = z111111111111115;
                i39 = i36;
                i40 = i38;
                z9 = z111111111111116;
                f3 = f11119;
                str5 = str4;
                i41 = i41111111111111111117;
                str6 = str111112;
            } else {
                str4 = BuildConfig.FLAVOR;
                if (i42 != 0) {
                    str3 = BuildConfig.FLAVOR;
                }
                if (i43 == 0) {
                    str4 = str2;
                }
                if (i9 != 0) {
                    uh1Var2 = null;
                }
                if (i12 != 0) {
                    i36 = Integer.MAX_VALUE;
                } else {
                    i36 = i13;
                }
                if (i15 != 0) {
                    z4 = false;
                }
                c0187a = jt1.a.a;
                if (i17 != 0) {
                    bj4VarO.K(-652118101);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new w05(2);
                        bj4VarO.C(objF3);
                    }
                    oh4Var3 = (oh4) objF3;
                    bj4VarO.U(false);
                }
                if (i19 != 0) {
                    i37 = 1;
                } else {
                    i37 = i2;
                }
                if (i21 != 0) {
                    i38 = 1;
                } else {
                    i38 = i3;
                }
                if (i23 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i26 != 0) {
                    ci4Var2 = null;
                } else {
                    ci4Var2 = ci4Var;
                }
                if (i29 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i33 != 0) {
                    f2 = Float.NaN;
                } else {
                    f2 = f;
                }
                bj4VarO.K(-652108692);
                if (uh1Var2 == null) {
                    jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                } else {
                    jB = uh1Var2.a;
                }
                objB = aa0.b(bj4VarO, false, -652103026);
                if (objB == c0187a) {
                    objB = new jw0();
                    bj4VarO.C(objB);
                }
                fw0Var = (fw0) objB;
                int i41111111111111111118 = i35;
                bj4VarO.U(false);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    c33 c33Var11117 = wd3.a;
                    objF = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72Var = (t72) objF;
                uh1 uh1Var111110 = uh1Var2;
                String str111113 = str3;
                int i41111111111111111119 = i7;
                ox6 ox6VarB1111111113 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                IntercomTheme intercomTheme11117 = IntercomTheme.INSTANCE;
                int i411111111111111111110 = IntercomTheme.$stable;
                float f111110 = f2;
                ox6 ox6VarA11117 = kw0.a(uma.a(ns0.a(ox6VarB1111111113, 1.0f, jB, intercomTheme11117.getShapes(bj4VarO, i411111111111111111110).b), intercomTheme11117.getShapes(bj4VarO, i411111111111111111110).b), fw0Var);
                bj4VarO.K(-652085201);
                zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new w62(1, t72Var, fw0Var);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new w62(1, t72Var, fw0Var);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ox6 ox6VarB1111111114 = p84.b(ox6VarA11117, (oh4) objF2);
                pda pdaVarD11117 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                long j11118 = uh1.j;
                pda pdaVarA11117 = pdaVarD11117.a(((-14837) & 1) != 0 ? pdaVarD11117.a : 0L, ((-14837) & 2) != 0 ? pdaVarD11117.b : 0L, ((-14837) & 4) != 0 ? pdaVarD11117.c : ac4.b(intercomTheme11117, bj4VarO, i411111111111111111110), pdaVarD11117.d, ((-14837) & 16) != 0 ? pdaVarD11117.e : intercomTheme11117.getColors(bj4VarO, i411111111111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD11117.f : intercomTheme11117.getColors(bj4VarO, i411111111111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD11117.g : intercomTheme11117.getColors(bj4VarO, i411111111111111111110).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD11117.h : intercomTheme11117.getColors(bj4VarO, i411111111111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD11117.i : j, pdaVarD11117.j, ((-14837) & 1024) != 0 ? pdaVarD11117.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD11117.l : j11118, ((-14837) & 4096) != 0 ? pdaVarD11117.m : j11118, ((-14837) & 8192) != 0 ? pdaVarD11117.n : j11118, pdaVarD11117.o, pdaVarD11117.p, pdaVarD11117.q, pdaVarD11117.r, pdaVarD11117.s, pdaVarD11117.t, pdaVarD11117.u, pdaVarD11117.v, pdaVarD11117.w, pdaVarD11117.x, pdaVarD11117.y, pdaVarD11117.z, pdaVarD11117.A, pdaVarD11117.B, pdaVarD11117.C, pdaVarD11117.D, pdaVarD11117.E, pdaVarD11117.F, pdaVarD11117.G, pdaVarD11117.H, pdaVarD11117.I, pdaVarD11117.J, pdaVarD11117.K, pdaVarD11117.L, pdaVarD11117.M, pdaVarD11117.N, pdaVarD11117.O, pdaVarD11117.P, pdaVarD11117.Q);
                dp5 dp5Var11117 = new dp5(i37, i38, 115);
                boolean z111111111111118 = z4;
                bp5 bp5Var11117 = new bp5(oh4Var3, null, 59);
                b72 b72Var11117 = intercomTheme11117.getShapes(bj4VarO, i411111111111111111110).b;
                final boolean z111111111111119 = z5;
                int i411111111111111111111 = i37;
                ci4<? super jt1, ? super Integer, g2b> ci4Var111110 = ci4Var2;
                bj4Var = bj4VarO;
                boolean z1111111111111110 = z6;
                ifa.a(str111113, oh4Var, ox6VarB1111111114, z1111111111111110, intercomTheme11117.getTypography(bj4VarO, i411111111111111111110).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    public final void invoke(jt1 jt1Var2, int i411111111111111111112) {
                        if ((i411111111111111111112 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ci4Var111110, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    public final void invoke(jt1 jt1Var2, int i411111111111111111112) {
                        if ((i411111111111111111112 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else if (z111111111111119) {
                            m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, dp5Var11117, bp5Var11117, z111111111111118, i36, 0, b72Var11117, pdaVarA11117, bj4Var, ((i41111111111111111118 << 3) & 7168) | (i41111111111111111119 & 14) | 817889280 | ((i41111111111111111119 >> 3) & 112) | ((i41111111111111111118 << 21) & 234881024), (29360128 & (i41111111111111111119 << 3)) | ((i41111111111111111119 << 9) & 234881024), 1604688);
                oh4Var4 = oh4Var3;
                uh1Var3 = uh1Var111110;
                z7 = z1111111111111110;
                ci4Var3 = ci4Var111110;
                z8 = z111111111111118;
                i39 = i36;
                i40 = i38;
                z9 = z111111111111119;
                f3 = f111110;
                str5 = str4;
                i41 = i411111111111111111111;
                str6 = str111113;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: vha
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i7 |= 384;
        i9 = i6 & 8;
        if (i9 != 0) {
            if ((i4 & 3072) == 0) {
                uh1Var2 = uh1Var;
                if (bj4VarO.J(uh1Var2)) {
                    i10 = 2048;
                } else {
                    i10 = 1024;
                }
                i7 |= i10;
            }
            if ((i6 & 16) != 0) {
                i7 |= 24576;
            } else if ((i4 & 24576) == 0) {
                if (bj4VarO.i(j)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i7 |= i11;
            }
            i12 = i6 & 32;
            if (i12 != 0) {
                i7 |= 196608;
                i13 = i;
            } else {
                i13 = i;
                if ((i4 & 196608) == 0) {
                    if (bj4VarO.h(i13)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i7 |= i14;
                }
            }
            i15 = i6 & 64;
            if (i15 != 0) {
                i7 |= 1572864;
                z4 = z;
            } else {
                z4 = z;
                if ((i4 & 1572864) == 0) {
                    if (bj4VarO.c(z4)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i7 |= i16;
                }
            }
            i17 = i6 & 128;
            if (i17 != 0) {
                i7 |= 12582912;
                oh4Var3 = oh4Var2;
            } else {
                oh4Var3 = oh4Var2;
                if ((i4 & 12582912) == 0) {
                    if (bj4VarO.j(oh4Var3)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i7 |= i18;
                }
            }
            i19 = i6 & 256;
            if (i19 != 0) {
                if ((i4 & 100663296) == 0) {
                    if (bj4VarO.h(i2)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i7 |= i20;
                }
                i21 = i6 & 512;
                if (i21 != 0) {
                    if ((i4 & 805306368) == 0) {
                        if (bj4VarO.h(i3)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i7 |= i22;
                    }
                    i23 = i6 & 1024;
                    if (i23 != 0) {
                        i24 = i5 | 6;
                    } else if ((i5 & 6) == 0) {
                        if (bj4VarO.c(z2)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i5 | i25;
                    } else {
                        i24 = i5;
                    }
                    i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    if (i26 != 0) {
                        i24 |= 48;
                    } else if ((i5 & 48) != 0) {
                        if (bj4VarO.j(ci4Var)) {
                            i27 = 32;
                        } else {
                            i27 = 16;
                        }
                        i24 |= i27;
                    }
                    i28 = i24;
                    i29 = i6 & 4096;
                    if (i29 != 0) {
                        i31 = i28 | 384;
                    } else {
                        i30 = i28;
                        if ((i5 & 384) != 0) {
                            if (bj4VarO.c(z3)) {
                                i32 = 256;
                            } else {
                                i32 = 128;
                            }
                            i30 |= i32;
                        }
                        i31 = i30;
                    }
                    i33 = i6 & 8192;
                    if (i33 != 0) {
                        i35 = i31 | 3072;
                    } else {
                        i34 = i31;
                        if ((i5 & 3072) == 0) {
                            i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                        } else {
                            i35 = i34;
                        }
                    }
                    if ((i7 & 306783379) != 306783378) {
                        str4 = BuildConfig.FLAVOR;
                        if (i42 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        if (i43 == 0) {
                            str4 = str2;
                        }
                        if (i9 != 0) {
                            uh1Var2 = null;
                        }
                        if (i12 != 0) {
                            i36 = Integer.MAX_VALUE;
                        } else {
                            i36 = i13;
                        }
                        if (i15 != 0) {
                            z4 = false;
                        }
                        c0187a = jt1.a.a;
                        if (i17 != 0) {
                            bj4VarO.K(-652118101);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new w05(2);
                                bj4VarO.C(objF3);
                            }
                            oh4Var3 = (oh4) objF3;
                            bj4VarO.U(false);
                        }
                        if (i19 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i2;
                        }
                        if (i21 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i3;
                        }
                        if (i23 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i26 != 0) {
                            ci4Var2 = null;
                        } else {
                            ci4Var2 = ci4Var;
                        }
                        if (i29 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i33 != 0) {
                            f2 = Float.NaN;
                        } else {
                            f2 = f;
                        }
                        bj4VarO.K(-652108692);
                        if (uh1Var2 == null) {
                            jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        } else {
                            jB = uh1Var2.a;
                        }
                        objB = aa0.b(bj4VarO, false, -652103026);
                        if (objB == c0187a) {
                            objB = new jw0();
                            bj4VarO.C(objB);
                        }
                        fw0Var = (fw0) objB;
                        int i411111111111111111112 = i35;
                        bj4VarO.U(false);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var11118 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72Var = (t72) objF;
                        uh1 uh1Var111111 = uh1Var2;
                        String str111114 = str3;
                        int i411111111111111111113 = i7;
                        ox6 ox6VarB1111111115 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                        IntercomTheme intercomTheme11118 = IntercomTheme.INSTANCE;
                        int i411111111111111111114 = IntercomTheme.$stable;
                        float f111111 = f2;
                        ox6 ox6VarA11118 = kw0.a(uma.a(ns0.a(ox6VarB1111111115, 1.0f, jB, intercomTheme11118.getShapes(bj4VarO, i411111111111111111114).b), intercomTheme11118.getShapes(bj4VarO, i411111111111111111114).b), fw0Var);
                        bj4VarO.K(-652085201);
                        zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarB1111111116 = p84.b(ox6VarA11118, (oh4) objF2);
                        pda pdaVarD11118 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                        long j11119 = uh1.j;
                        pda pdaVarA11118 = pdaVarD11118.a(((-14837) & 1) != 0 ? pdaVarD11118.a : 0L, ((-14837) & 2) != 0 ? pdaVarD11118.b : 0L, ((-14837) & 4) != 0 ? pdaVarD11118.c : ac4.b(intercomTheme11118, bj4VarO, i411111111111111111114), pdaVarD11118.d, ((-14837) & 16) != 0 ? pdaVarD11118.e : intercomTheme11118.getColors(bj4VarO, i411111111111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD11118.f : intercomTheme11118.getColors(bj4VarO, i411111111111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD11118.g : intercomTheme11118.getColors(bj4VarO, i411111111111111111114).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD11118.h : intercomTheme11118.getColors(bj4VarO, i411111111111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD11118.i : j, pdaVarD11118.j, ((-14837) & 1024) != 0 ? pdaVarD11118.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD11118.l : j11119, ((-14837) & 4096) != 0 ? pdaVarD11118.m : j11119, ((-14837) & 8192) != 0 ? pdaVarD11118.n : j11119, pdaVarD11118.o, pdaVarD11118.p, pdaVarD11118.q, pdaVarD11118.r, pdaVarD11118.s, pdaVarD11118.t, pdaVarD11118.u, pdaVarD11118.v, pdaVarD11118.w, pdaVarD11118.x, pdaVarD11118.y, pdaVarD11118.z, pdaVarD11118.A, pdaVarD11118.B, pdaVarD11118.C, pdaVarD11118.D, pdaVarD11118.E, pdaVarD11118.F, pdaVarD11118.G, pdaVarD11118.H, pdaVarD11118.I, pdaVarD11118.J, pdaVarD11118.K, pdaVarD11118.L, pdaVarD11118.M, pdaVarD11118.N, pdaVarD11118.O, pdaVarD11118.P, pdaVarD11118.Q);
                        dp5 dp5Var11118 = new dp5(i37, i38, 115);
                        boolean z1111111111111111 = z4;
                        bp5 bp5Var11118 = new bp5(oh4Var3, null, 59);
                        b72 b72Var11118 = intercomTheme11118.getShapes(bj4VarO, i411111111111111111114).b;
                        final boolean z1111111111111112 = z5;
                        int i411111111111111111115 = i37;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var111111 = ci4Var2;
                        bj4Var = bj4VarO;
                        boolean z1111111111111113 = z6;
                        ifa.a(str111114, oh4Var, ox6VarB1111111116, z1111111111111113, intercomTheme11118.getTypography(bj4VarO, i411111111111111111114).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            public final void invoke(jt1 jt1Var2, int i411111111111111111116) {
                                if ((i411111111111111111116 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ci4Var111111, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            public final void invoke(jt1 jt1Var2, int i411111111111111111116) {
                                if ((i411111111111111111116 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else if (z1111111111111112) {
                                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, dp5Var11118, bp5Var11118, z1111111111111111, i36, 0, b72Var11118, pdaVarA11118, bj4Var, ((i411111111111111111112 << 3) & 7168) | (i411111111111111111113 & 14) | 817889280 | ((i411111111111111111113 >> 3) & 112) | ((i411111111111111111112 << 21) & 234881024), (29360128 & (i411111111111111111113 << 3)) | ((i411111111111111111113 << 9) & 234881024), 1604688);
                        oh4Var4 = oh4Var3;
                        uh1Var3 = uh1Var111111;
                        z7 = z1111111111111113;
                        ci4Var3 = ci4Var111111;
                        z8 = z1111111111111111;
                        i39 = i36;
                        i40 = i38;
                        z9 = z1111111111111112;
                        f3 = f111111;
                        str5 = str4;
                        i41 = i411111111111111111115;
                        str6 = str111114;
                    } else {
                        str4 = BuildConfig.FLAVOR;
                        if (i42 != 0) {
                            str3 = BuildConfig.FLAVOR;
                        }
                        if (i43 == 0) {
                            str4 = str2;
                        }
                        if (i9 != 0) {
                            uh1Var2 = null;
                        }
                        if (i12 != 0) {
                            i36 = Integer.MAX_VALUE;
                        } else {
                            i36 = i13;
                        }
                        if (i15 != 0) {
                            z4 = false;
                        }
                        c0187a = jt1.a.a;
                        if (i17 != 0) {
                            bj4VarO.K(-652118101);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new w05(2);
                                bj4VarO.C(objF3);
                            }
                            oh4Var3 = (oh4) objF3;
                            bj4VarO.U(false);
                        }
                        if (i19 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i2;
                        }
                        if (i21 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i3;
                        }
                        if (i23 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i26 != 0) {
                            ci4Var2 = null;
                        } else {
                            ci4Var2 = ci4Var;
                        }
                        if (i29 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i33 != 0) {
                            f2 = Float.NaN;
                        } else {
                            f2 = f;
                        }
                        bj4VarO.K(-652108692);
                        if (uh1Var2 == null) {
                            jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        } else {
                            jB = uh1Var2.a;
                        }
                        objB = aa0.b(bj4VarO, false, -652103026);
                        if (objB == c0187a) {
                            objB = new jw0();
                            bj4VarO.C(objB);
                        }
                        fw0Var = (fw0) objB;
                        int i411111111111111111116 = i35;
                        bj4VarO.U(false);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            c33 c33Var11119 = wd3.a;
                            objF = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72Var = (t72) objF;
                        uh1 uh1Var111112 = uh1Var2;
                        String str111115 = str3;
                        int i411111111111111111117 = i7;
                        ox6 ox6VarB1111111117 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                        IntercomTheme intercomTheme11119 = IntercomTheme.INSTANCE;
                        int i411111111111111111118 = IntercomTheme.$stable;
                        float f111112 = f2;
                        ox6 ox6VarA11119 = kw0.a(uma.a(ns0.a(ox6VarB1111111117, 1.0f, jB, intercomTheme11119.getShapes(bj4VarO, i411111111111111111118).b), intercomTheme11119.getShapes(bj4VarO, i411111111111111111118).b), fw0Var);
                        bj4VarO.K(-652085201);
                        zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new w62(1, t72Var, fw0Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarB1111111118 = p84.b(ox6VarA11119, (oh4) objF2);
                        pda pdaVarD11119 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                        long j111110 = uh1.j;
                        pda pdaVarA11119 = pdaVarD11119.a(((-14837) & 1) != 0 ? pdaVarD11119.a : 0L, ((-14837) & 2) != 0 ? pdaVarD11119.b : 0L, ((-14837) & 4) != 0 ? pdaVarD11119.c : ac4.b(intercomTheme11119, bj4VarO, i411111111111111111118), pdaVarD11119.d, ((-14837) & 16) != 0 ? pdaVarD11119.e : intercomTheme11119.getColors(bj4VarO, i411111111111111111118).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD11119.f : intercomTheme11119.getColors(bj4VarO, i411111111111111111118).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD11119.g : intercomTheme11119.getColors(bj4VarO, i411111111111111111118).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD11119.h : intercomTheme11119.getColors(bj4VarO, i411111111111111111118).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD11119.i : j, pdaVarD11119.j, ((-14837) & 1024) != 0 ? pdaVarD11119.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD11119.l : j111110, ((-14837) & 4096) != 0 ? pdaVarD11119.m : j111110, ((-14837) & 8192) != 0 ? pdaVarD11119.n : j111110, pdaVarD11119.o, pdaVarD11119.p, pdaVarD11119.q, pdaVarD11119.r, pdaVarD11119.s, pdaVarD11119.t, pdaVarD11119.u, pdaVarD11119.v, pdaVarD11119.w, pdaVarD11119.x, pdaVarD11119.y, pdaVarD11119.z, pdaVarD11119.A, pdaVarD11119.B, pdaVarD11119.C, pdaVarD11119.D, pdaVarD11119.E, pdaVarD11119.F, pdaVarD11119.G, pdaVarD11119.H, pdaVarD11119.I, pdaVarD11119.J, pdaVarD11119.K, pdaVarD11119.L, pdaVarD11119.M, pdaVarD11119.N, pdaVarD11119.O, pdaVarD11119.P, pdaVarD11119.Q);
                        dp5 dp5Var11119 = new dp5(i37, i38, 115);
                        boolean z1111111111111114 = z4;
                        bp5 bp5Var11119 = new bp5(oh4Var3, null, 59);
                        b72 b72Var11119 = intercomTheme11119.getShapes(bj4VarO, i411111111111111111118).b;
                        final boolean z1111111111111115 = z5;
                        int i411111111111111111119 = i37;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var111112 = ci4Var2;
                        bj4Var = bj4VarO;
                        boolean z1111111111111116 = z6;
                        ifa.a(str111115, oh4Var, ox6VarB1111111118, z1111111111111116, intercomTheme11119.getTypography(bj4VarO, i411111111111111111118).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            public final void invoke(jt1 jt1Var2, int i4111111111111111111110) {
                                if ((i4111111111111111111110 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ci4Var111112, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            public final void invoke(jt1 jt1Var2, int i4111111111111111111110) {
                                if ((i4111111111111111111110 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else if (z1111111111111115) {
                                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, dp5Var11119, bp5Var11119, z1111111111111114, i36, 0, b72Var11119, pdaVarA11119, bj4Var, ((i411111111111111111116 << 3) & 7168) | (i411111111111111111117 & 14) | 817889280 | ((i411111111111111111117 >> 3) & 112) | ((i411111111111111111116 << 21) & 234881024), (29360128 & (i411111111111111111117 << 3)) | ((i411111111111111111117 << 9) & 234881024), 1604688);
                        oh4Var4 = oh4Var3;
                        uh1Var3 = uh1Var111112;
                        z7 = z1111111111111116;
                        ci4Var3 = ci4Var111112;
                        z8 = z1111111111111114;
                        i39 = i36;
                        i40 = i38;
                        z9 = z1111111111111115;
                        f3 = f111112;
                        str5 = str4;
                        i41 = i411111111111111111119;
                        str6 = str111115;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: vha
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i7 |= 805306368;
                i23 = i6 & 1024;
                if (i23 != 0) {
                    i24 = i5 | 6;
                } else if ((i5 & 6) == 0) {
                    if (bj4VarO.c(z2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i5 | i25;
                } else {
                    i24 = i5;
                }
                i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                if (i26 != 0) {
                    i24 |= 48;
                } else if ((i5 & 48) != 0) {
                    if (bj4VarO.j(ci4Var)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i24 |= i27;
                }
                i28 = i24;
                i29 = i6 & 4096;
                if (i29 != 0) {
                    i31 = i28 | 384;
                } else {
                    i30 = i28;
                    if ((i5 & 384) != 0) {
                        if (bj4VarO.c(z3)) {
                            i32 = 256;
                        } else {
                            i32 = 128;
                        }
                        i30 |= i32;
                    }
                    i31 = i30;
                }
                i33 = i6 & 8192;
                if (i33 != 0) {
                    i35 = i31 | 3072;
                } else {
                    i34 = i31;
                    if ((i5 & 3072) == 0) {
                        i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                    } else {
                        i35 = i34;
                    }
                }
                if ((i7 & 306783379) != 306783378) {
                    str4 = BuildConfig.FLAVOR;
                    if (i42 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (i43 == 0) {
                        str4 = str2;
                    }
                    if (i9 != 0) {
                        uh1Var2 = null;
                    }
                    if (i12 != 0) {
                        i36 = Integer.MAX_VALUE;
                    } else {
                        i36 = i13;
                    }
                    if (i15 != 0) {
                        z4 = false;
                    }
                    c0187a = jt1.a.a;
                    if (i17 != 0) {
                        bj4VarO.K(-652118101);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new w05(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var3 = (oh4) objF3;
                        bj4VarO.U(false);
                    }
                    if (i19 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i2;
                    }
                    if (i21 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i3;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i26 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i29 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i33 != 0) {
                        f2 = Float.NaN;
                    } else {
                        f2 = f;
                    }
                    bj4VarO.K(-652108692);
                    if (uh1Var2 == null) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    } else {
                        jB = uh1Var2.a;
                    }
                    objB = aa0.b(bj4VarO, false, -652103026);
                    if (objB == c0187a) {
                        objB = new jw0();
                        bj4VarO.C(objB);
                    }
                    fw0Var = (fw0) objB;
                    int i4111111111111111111110 = i35;
                    bj4VarO.U(false);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var111110 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF;
                    uh1 uh1Var111113 = uh1Var2;
                    String str111116 = str3;
                    int i4111111111111111111111 = i7;
                    ox6 ox6VarB1111111119 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                    IntercomTheme intercomTheme111110 = IntercomTheme.INSTANCE;
                    int i4111111111111111111112 = IntercomTheme.$stable;
                    float f111113 = f2;
                    ox6 ox6VarA111110 = kw0.a(uma.a(ns0.a(ox6VarB1111111119, 1.0f, jB, intercomTheme111110.getShapes(bj4VarO, i4111111111111111111112).b), intercomTheme111110.getShapes(bj4VarO, i4111111111111111111112).b), fw0Var);
                    bj4VarO.K(-652085201);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB11111111110 = p84.b(ox6VarA111110, (oh4) objF2);
                    pda pdaVarD111110 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                    long j111111 = uh1.j;
                    pda pdaVarA111110 = pdaVarD111110.a(((-14837) & 1) != 0 ? pdaVarD111110.a : 0L, ((-14837) & 2) != 0 ? pdaVarD111110.b : 0L, ((-14837) & 4) != 0 ? pdaVarD111110.c : ac4.b(intercomTheme111110, bj4VarO, i4111111111111111111112), pdaVarD111110.d, ((-14837) & 16) != 0 ? pdaVarD111110.e : intercomTheme111110.getColors(bj4VarO, i4111111111111111111112).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD111110.f : intercomTheme111110.getColors(bj4VarO, i4111111111111111111112).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD111110.g : intercomTheme111110.getColors(bj4VarO, i4111111111111111111112).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD111110.h : intercomTheme111110.getColors(bj4VarO, i4111111111111111111112).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD111110.i : j, pdaVarD111110.j, ((-14837) & 1024) != 0 ? pdaVarD111110.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD111110.l : j111111, ((-14837) & 4096) != 0 ? pdaVarD111110.m : j111111, ((-14837) & 8192) != 0 ? pdaVarD111110.n : j111111, pdaVarD111110.o, pdaVarD111110.p, pdaVarD111110.q, pdaVarD111110.r, pdaVarD111110.s, pdaVarD111110.t, pdaVarD111110.u, pdaVarD111110.v, pdaVarD111110.w, pdaVarD111110.x, pdaVarD111110.y, pdaVarD111110.z, pdaVarD111110.A, pdaVarD111110.B, pdaVarD111110.C, pdaVarD111110.D, pdaVarD111110.E, pdaVarD111110.F, pdaVarD111110.G, pdaVarD111110.H, pdaVarD111110.I, pdaVarD111110.J, pdaVarD111110.K, pdaVarD111110.L, pdaVarD111110.M, pdaVarD111110.N, pdaVarD111110.O, pdaVarD111110.P, pdaVarD111110.Q);
                    dp5 dp5Var111110 = new dp5(i37, i38, 115);
                    boolean z1111111111111117 = z4;
                    bp5 bp5Var111110 = new bp5(oh4Var3, null, 59);
                    b72 b72Var111110 = intercomTheme111110.getShapes(bj4VarO, i4111111111111111111112).b;
                    final boolean z1111111111111118 = z5;
                    int i4111111111111111111113 = i37;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var111113 = ci4Var2;
                    bj4Var = bj4VarO;
                    boolean z1111111111111119 = z6;
                    ifa.a(str111116, oh4Var, ox6VarB11111111110, z1111111111111119, intercomTheme111110.getTypography(bj4VarO, i4111111111111111111112).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        public final void invoke(jt1 jt1Var2, int i4111111111111111111114) {
                            if ((i4111111111111111111114 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ci4Var111113, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        public final void invoke(jt1 jt1Var2, int i4111111111111111111114) {
                            if ((i4111111111111111111114 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else if (z1111111111111118) {
                                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, dp5Var111110, bp5Var111110, z1111111111111117, i36, 0, b72Var111110, pdaVarA111110, bj4Var, ((i4111111111111111111110 << 3) & 7168) | (i4111111111111111111111 & 14) | 817889280 | ((i4111111111111111111111 >> 3) & 112) | ((i4111111111111111111110 << 21) & 234881024), (29360128 & (i4111111111111111111111 << 3)) | ((i4111111111111111111111 << 9) & 234881024), 1604688);
                    oh4Var4 = oh4Var3;
                    uh1Var3 = uh1Var111113;
                    z7 = z1111111111111119;
                    ci4Var3 = ci4Var111113;
                    z8 = z1111111111111117;
                    i39 = i36;
                    i40 = i38;
                    z9 = z1111111111111118;
                    f3 = f111113;
                    str5 = str4;
                    i41 = i4111111111111111111113;
                    str6 = str111116;
                } else {
                    str4 = BuildConfig.FLAVOR;
                    if (i42 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (i43 == 0) {
                        str4 = str2;
                    }
                    if (i9 != 0) {
                        uh1Var2 = null;
                    }
                    if (i12 != 0) {
                        i36 = Integer.MAX_VALUE;
                    } else {
                        i36 = i13;
                    }
                    if (i15 != 0) {
                        z4 = false;
                    }
                    c0187a = jt1.a.a;
                    if (i17 != 0) {
                        bj4VarO.K(-652118101);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new w05(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var3 = (oh4) objF3;
                        bj4VarO.U(false);
                    }
                    if (i19 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i2;
                    }
                    if (i21 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i3;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i26 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i29 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i33 != 0) {
                        f2 = Float.NaN;
                    } else {
                        f2 = f;
                    }
                    bj4VarO.K(-652108692);
                    if (uh1Var2 == null) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    } else {
                        jB = uh1Var2.a;
                    }
                    objB = aa0.b(bj4VarO, false, -652103026);
                    if (objB == c0187a) {
                        objB = new jw0();
                        bj4VarO.C(objB);
                    }
                    fw0Var = (fw0) objB;
                    int i4111111111111111111114 = i35;
                    bj4VarO.U(false);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var111111 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF;
                    uh1 uh1Var111114 = uh1Var2;
                    String str111117 = str3;
                    int i4111111111111111111115 = i7;
                    ox6 ox6VarB11111111111 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                    IntercomTheme intercomTheme111111 = IntercomTheme.INSTANCE;
                    int i4111111111111111111116 = IntercomTheme.$stable;
                    float f111114 = f2;
                    ox6 ox6VarA111111 = kw0.a(uma.a(ns0.a(ox6VarB11111111111, 1.0f, jB, intercomTheme111111.getShapes(bj4VarO, i4111111111111111111116).b), intercomTheme111111.getShapes(bj4VarO, i4111111111111111111116).b), fw0Var);
                    bj4VarO.K(-652085201);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB11111111112 = p84.b(ox6VarA111111, (oh4) objF2);
                    pda pdaVarD111111 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                    long j111112 = uh1.j;
                    pda pdaVarA111111 = pdaVarD111111.a(((-14837) & 1) != 0 ? pdaVarD111111.a : 0L, ((-14837) & 2) != 0 ? pdaVarD111111.b : 0L, ((-14837) & 4) != 0 ? pdaVarD111111.c : ac4.b(intercomTheme111111, bj4VarO, i4111111111111111111116), pdaVarD111111.d, ((-14837) & 16) != 0 ? pdaVarD111111.e : intercomTheme111111.getColors(bj4VarO, i4111111111111111111116).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD111111.f : intercomTheme111111.getColors(bj4VarO, i4111111111111111111116).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD111111.g : intercomTheme111111.getColors(bj4VarO, i4111111111111111111116).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD111111.h : intercomTheme111111.getColors(bj4VarO, i4111111111111111111116).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD111111.i : j, pdaVarD111111.j, ((-14837) & 1024) != 0 ? pdaVarD111111.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD111111.l : j111112, ((-14837) & 4096) != 0 ? pdaVarD111111.m : j111112, ((-14837) & 8192) != 0 ? pdaVarD111111.n : j111112, pdaVarD111111.o, pdaVarD111111.p, pdaVarD111111.q, pdaVarD111111.r, pdaVarD111111.s, pdaVarD111111.t, pdaVarD111111.u, pdaVarD111111.v, pdaVarD111111.w, pdaVarD111111.x, pdaVarD111111.y, pdaVarD111111.z, pdaVarD111111.A, pdaVarD111111.B, pdaVarD111111.C, pdaVarD111111.D, pdaVarD111111.E, pdaVarD111111.F, pdaVarD111111.G, pdaVarD111111.H, pdaVarD111111.I, pdaVarD111111.J, pdaVarD111111.K, pdaVarD111111.L, pdaVarD111111.M, pdaVarD111111.N, pdaVarD111111.O, pdaVarD111111.P, pdaVarD111111.Q);
                    dp5 dp5Var111111 = new dp5(i37, i38, 115);
                    boolean z11111111111111110 = z4;
                    bp5 bp5Var111111 = new bp5(oh4Var3, null, 59);
                    b72 b72Var111111 = intercomTheme111111.getShapes(bj4VarO, i4111111111111111111116).b;
                    final boolean z11111111111111111 = z5;
                    int i4111111111111111111117 = i37;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var111114 = ci4Var2;
                    bj4Var = bj4VarO;
                    boolean z11111111111111112 = z6;
                    ifa.a(str111117, oh4Var, ox6VarB11111111112, z11111111111111112, intercomTheme111111.getTypography(bj4VarO, i4111111111111111111116).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        public final void invoke(jt1 jt1Var2, int i4111111111111111111118) {
                            if ((i4111111111111111111118 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ci4Var111114, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        public final void invoke(jt1 jt1Var2, int i4111111111111111111118) {
                            if ((i4111111111111111111118 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else if (z11111111111111111) {
                                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, dp5Var111111, bp5Var111111, z11111111111111110, i36, 0, b72Var111111, pdaVarA111111, bj4Var, ((i4111111111111111111114 << 3) & 7168) | (i4111111111111111111115 & 14) | 817889280 | ((i4111111111111111111115 >> 3) & 112) | ((i4111111111111111111114 << 21) & 234881024), (29360128 & (i4111111111111111111115 << 3)) | ((i4111111111111111111115 << 9) & 234881024), 1604688);
                    oh4Var4 = oh4Var3;
                    uh1Var3 = uh1Var111114;
                    z7 = z11111111111111112;
                    ci4Var3 = ci4Var111114;
                    z8 = z11111111111111110;
                    i39 = i36;
                    i40 = i38;
                    z9 = z11111111111111111;
                    f3 = f111114;
                    str5 = str4;
                    i41 = i4111111111111111111117;
                    str6 = str111117;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: vha
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i7 |= 100663296;
            i21 = i6 & 512;
            if (i21 != 0) {
                if ((i4 & 805306368) == 0) {
                    if (bj4VarO.h(i3)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i7 |= i22;
                }
                i23 = i6 & 1024;
                if (i23 != 0) {
                    i24 = i5 | 6;
                } else if ((i5 & 6) == 0) {
                    if (bj4VarO.c(z2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i5 | i25;
                } else {
                    i24 = i5;
                }
                i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                if (i26 != 0) {
                    i24 |= 48;
                } else if ((i5 & 48) != 0) {
                    if (bj4VarO.j(ci4Var)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i24 |= i27;
                }
                i28 = i24;
                i29 = i6 & 4096;
                if (i29 != 0) {
                    i31 = i28 | 384;
                } else {
                    i30 = i28;
                    if ((i5 & 384) != 0) {
                        if (bj4VarO.c(z3)) {
                            i32 = 256;
                        } else {
                            i32 = 128;
                        }
                        i30 |= i32;
                    }
                    i31 = i30;
                }
                i33 = i6 & 8192;
                if (i33 != 0) {
                    i35 = i31 | 3072;
                } else {
                    i34 = i31;
                    if ((i5 & 3072) == 0) {
                        i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                    } else {
                        i35 = i34;
                    }
                }
                if ((i7 & 306783379) != 306783378) {
                    str4 = BuildConfig.FLAVOR;
                    if (i42 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (i43 == 0) {
                        str4 = str2;
                    }
                    if (i9 != 0) {
                        uh1Var2 = null;
                    }
                    if (i12 != 0) {
                        i36 = Integer.MAX_VALUE;
                    } else {
                        i36 = i13;
                    }
                    if (i15 != 0) {
                        z4 = false;
                    }
                    c0187a = jt1.a.a;
                    if (i17 != 0) {
                        bj4VarO.K(-652118101);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new w05(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var3 = (oh4) objF3;
                        bj4VarO.U(false);
                    }
                    if (i19 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i2;
                    }
                    if (i21 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i3;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i26 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i29 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i33 != 0) {
                        f2 = Float.NaN;
                    } else {
                        f2 = f;
                    }
                    bj4VarO.K(-652108692);
                    if (uh1Var2 == null) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    } else {
                        jB = uh1Var2.a;
                    }
                    objB = aa0.b(bj4VarO, false, -652103026);
                    if (objB == c0187a) {
                        objB = new jw0();
                        bj4VarO.C(objB);
                    }
                    fw0Var = (fw0) objB;
                    int i4111111111111111111118 = i35;
                    bj4VarO.U(false);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var111112 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF;
                    uh1 uh1Var111115 = uh1Var2;
                    String str111118 = str3;
                    int i4111111111111111111119 = i7;
                    ox6 ox6VarB11111111113 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                    IntercomTheme intercomTheme111112 = IntercomTheme.INSTANCE;
                    int i41111111111111111111110 = IntercomTheme.$stable;
                    float f111115 = f2;
                    ox6 ox6VarA111112 = kw0.a(uma.a(ns0.a(ox6VarB11111111113, 1.0f, jB, intercomTheme111112.getShapes(bj4VarO, i41111111111111111111110).b), intercomTheme111112.getShapes(bj4VarO, i41111111111111111111110).b), fw0Var);
                    bj4VarO.K(-652085201);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB11111111114 = p84.b(ox6VarA111112, (oh4) objF2);
                    pda pdaVarD111112 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                    long j111113 = uh1.j;
                    pda pdaVarA111112 = pdaVarD111112.a(((-14837) & 1) != 0 ? pdaVarD111112.a : 0L, ((-14837) & 2) != 0 ? pdaVarD111112.b : 0L, ((-14837) & 4) != 0 ? pdaVarD111112.c : ac4.b(intercomTheme111112, bj4VarO, i41111111111111111111110), pdaVarD111112.d, ((-14837) & 16) != 0 ? pdaVarD111112.e : intercomTheme111112.getColors(bj4VarO, i41111111111111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD111112.f : intercomTheme111112.getColors(bj4VarO, i41111111111111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD111112.g : intercomTheme111112.getColors(bj4VarO, i41111111111111111111110).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD111112.h : intercomTheme111112.getColors(bj4VarO, i41111111111111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD111112.i : j, pdaVarD111112.j, ((-14837) & 1024) != 0 ? pdaVarD111112.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD111112.l : j111113, ((-14837) & 4096) != 0 ? pdaVarD111112.m : j111113, ((-14837) & 8192) != 0 ? pdaVarD111112.n : j111113, pdaVarD111112.o, pdaVarD111112.p, pdaVarD111112.q, pdaVarD111112.r, pdaVarD111112.s, pdaVarD111112.t, pdaVarD111112.u, pdaVarD111112.v, pdaVarD111112.w, pdaVarD111112.x, pdaVarD111112.y, pdaVarD111112.z, pdaVarD111112.A, pdaVarD111112.B, pdaVarD111112.C, pdaVarD111112.D, pdaVarD111112.E, pdaVarD111112.F, pdaVarD111112.G, pdaVarD111112.H, pdaVarD111112.I, pdaVarD111112.J, pdaVarD111112.K, pdaVarD111112.L, pdaVarD111112.M, pdaVarD111112.N, pdaVarD111112.O, pdaVarD111112.P, pdaVarD111112.Q);
                    dp5 dp5Var111112 = new dp5(i37, i38, 115);
                    boolean z11111111111111113 = z4;
                    bp5 bp5Var111112 = new bp5(oh4Var3, null, 59);
                    b72 b72Var111112 = intercomTheme111112.getShapes(bj4VarO, i41111111111111111111110).b;
                    final boolean z11111111111111114 = z5;
                    int i41111111111111111111111 = i37;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var111115 = ci4Var2;
                    bj4Var = bj4VarO;
                    boolean z11111111111111115 = z6;
                    ifa.a(str111118, oh4Var, ox6VarB11111111114, z11111111111111115, intercomTheme111112.getTypography(bj4VarO, i41111111111111111111110).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        public final void invoke(jt1 jt1Var2, int i41111111111111111111112) {
                            if ((i41111111111111111111112 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ci4Var111115, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        public final void invoke(jt1 jt1Var2, int i41111111111111111111112) {
                            if ((i41111111111111111111112 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else if (z11111111111111114) {
                                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, dp5Var111112, bp5Var111112, z11111111111111113, i36, 0, b72Var111112, pdaVarA111112, bj4Var, ((i4111111111111111111118 << 3) & 7168) | (i4111111111111111111119 & 14) | 817889280 | ((i4111111111111111111119 >> 3) & 112) | ((i4111111111111111111118 << 21) & 234881024), (29360128 & (i4111111111111111111119 << 3)) | ((i4111111111111111111119 << 9) & 234881024), 1604688);
                    oh4Var4 = oh4Var3;
                    uh1Var3 = uh1Var111115;
                    z7 = z11111111111111115;
                    ci4Var3 = ci4Var111115;
                    z8 = z11111111111111113;
                    i39 = i36;
                    i40 = i38;
                    z9 = z11111111111111114;
                    f3 = f111115;
                    str5 = str4;
                    i41 = i41111111111111111111111;
                    str6 = str111118;
                } else {
                    str4 = BuildConfig.FLAVOR;
                    if (i42 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (i43 == 0) {
                        str4 = str2;
                    }
                    if (i9 != 0) {
                        uh1Var2 = null;
                    }
                    if (i12 != 0) {
                        i36 = Integer.MAX_VALUE;
                    } else {
                        i36 = i13;
                    }
                    if (i15 != 0) {
                        z4 = false;
                    }
                    c0187a = jt1.a.a;
                    if (i17 != 0) {
                        bj4VarO.K(-652118101);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new w05(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var3 = (oh4) objF3;
                        bj4VarO.U(false);
                    }
                    if (i19 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i2;
                    }
                    if (i21 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i3;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i26 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i29 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i33 != 0) {
                        f2 = Float.NaN;
                    } else {
                        f2 = f;
                    }
                    bj4VarO.K(-652108692);
                    if (uh1Var2 == null) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    } else {
                        jB = uh1Var2.a;
                    }
                    objB = aa0.b(bj4VarO, false, -652103026);
                    if (objB == c0187a) {
                        objB = new jw0();
                        bj4VarO.C(objB);
                    }
                    fw0Var = (fw0) objB;
                    int i41111111111111111111112 = i35;
                    bj4VarO.U(false);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var111113 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF;
                    uh1 uh1Var111116 = uh1Var2;
                    String str111119 = str3;
                    int i41111111111111111111113 = i7;
                    ox6 ox6VarB11111111115 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                    IntercomTheme intercomTheme111113 = IntercomTheme.INSTANCE;
                    int i41111111111111111111114 = IntercomTheme.$stable;
                    float f111116 = f2;
                    ox6 ox6VarA111113 = kw0.a(uma.a(ns0.a(ox6VarB11111111115, 1.0f, jB, intercomTheme111113.getShapes(bj4VarO, i41111111111111111111114).b), intercomTheme111113.getShapes(bj4VarO, i41111111111111111111114).b), fw0Var);
                    bj4VarO.K(-652085201);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB11111111116 = p84.b(ox6VarA111113, (oh4) objF2);
                    pda pdaVarD111113 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                    long j111114 = uh1.j;
                    pda pdaVarA111113 = pdaVarD111113.a(((-14837) & 1) != 0 ? pdaVarD111113.a : 0L, ((-14837) & 2) != 0 ? pdaVarD111113.b : 0L, ((-14837) & 4) != 0 ? pdaVarD111113.c : ac4.b(intercomTheme111113, bj4VarO, i41111111111111111111114), pdaVarD111113.d, ((-14837) & 16) != 0 ? pdaVarD111113.e : intercomTheme111113.getColors(bj4VarO, i41111111111111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD111113.f : intercomTheme111113.getColors(bj4VarO, i41111111111111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD111113.g : intercomTheme111113.getColors(bj4VarO, i41111111111111111111114).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD111113.h : intercomTheme111113.getColors(bj4VarO, i41111111111111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD111113.i : j, pdaVarD111113.j, ((-14837) & 1024) != 0 ? pdaVarD111113.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD111113.l : j111114, ((-14837) & 4096) != 0 ? pdaVarD111113.m : j111114, ((-14837) & 8192) != 0 ? pdaVarD111113.n : j111114, pdaVarD111113.o, pdaVarD111113.p, pdaVarD111113.q, pdaVarD111113.r, pdaVarD111113.s, pdaVarD111113.t, pdaVarD111113.u, pdaVarD111113.v, pdaVarD111113.w, pdaVarD111113.x, pdaVarD111113.y, pdaVarD111113.z, pdaVarD111113.A, pdaVarD111113.B, pdaVarD111113.C, pdaVarD111113.D, pdaVarD111113.E, pdaVarD111113.F, pdaVarD111113.G, pdaVarD111113.H, pdaVarD111113.I, pdaVarD111113.J, pdaVarD111113.K, pdaVarD111113.L, pdaVarD111113.M, pdaVarD111113.N, pdaVarD111113.O, pdaVarD111113.P, pdaVarD111113.Q);
                    dp5 dp5Var111113 = new dp5(i37, i38, 115);
                    boolean z11111111111111116 = z4;
                    bp5 bp5Var111113 = new bp5(oh4Var3, null, 59);
                    b72 b72Var111113 = intercomTheme111113.getShapes(bj4VarO, i41111111111111111111114).b;
                    final boolean z11111111111111117 = z5;
                    int i41111111111111111111115 = i37;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var111116 = ci4Var2;
                    bj4Var = bj4VarO;
                    boolean z11111111111111118 = z6;
                    ifa.a(str111119, oh4Var, ox6VarB11111111116, z11111111111111118, intercomTheme111113.getTypography(bj4VarO, i41111111111111111111114).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        public final void invoke(jt1 jt1Var2, int i41111111111111111111116) {
                            if ((i41111111111111111111116 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ci4Var111116, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        public final void invoke(jt1 jt1Var2, int i41111111111111111111116) {
                            if ((i41111111111111111111116 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else if (z11111111111111117) {
                                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, dp5Var111113, bp5Var111113, z11111111111111116, i36, 0, b72Var111113, pdaVarA111113, bj4Var, ((i41111111111111111111112 << 3) & 7168) | (i41111111111111111111113 & 14) | 817889280 | ((i41111111111111111111113 >> 3) & 112) | ((i41111111111111111111112 << 21) & 234881024), (29360128 & (i41111111111111111111113 << 3)) | ((i41111111111111111111113 << 9) & 234881024), 1604688);
                    oh4Var4 = oh4Var3;
                    uh1Var3 = uh1Var111116;
                    z7 = z11111111111111118;
                    ci4Var3 = ci4Var111116;
                    z8 = z11111111111111116;
                    i39 = i36;
                    i40 = i38;
                    z9 = z11111111111111117;
                    f3 = f111116;
                    str5 = str4;
                    i41 = i41111111111111111111115;
                    str6 = str111119;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: vha
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i7 |= 805306368;
            i23 = i6 & 1024;
            if (i23 != 0) {
                i24 = i5 | 6;
            } else if ((i5 & 6) == 0) {
                if (bj4VarO.c(z2)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i5 | i25;
            } else {
                i24 = i5;
            }
            i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
            if (i26 != 0) {
                i24 |= 48;
            } else if ((i5 & 48) != 0) {
                if (bj4VarO.j(ci4Var)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i24 |= i27;
            }
            i28 = i24;
            i29 = i6 & 4096;
            if (i29 != 0) {
                i31 = i28 | 384;
            } else {
                i30 = i28;
                if ((i5 & 384) != 0) {
                    if (bj4VarO.c(z3)) {
                        i32 = 256;
                    } else {
                        i32 = 128;
                    }
                    i30 |= i32;
                }
                i31 = i30;
            }
            i33 = i6 & 8192;
            if (i33 != 0) {
                i35 = i31 | 3072;
            } else {
                i34 = i31;
                if ((i5 & 3072) == 0) {
                    i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                } else {
                    i35 = i34;
                }
            }
            if ((i7 & 306783379) != 306783378) {
                str4 = BuildConfig.FLAVOR;
                if (i42 != 0) {
                    str3 = BuildConfig.FLAVOR;
                }
                if (i43 == 0) {
                    str4 = str2;
                }
                if (i9 != 0) {
                    uh1Var2 = null;
                }
                if (i12 != 0) {
                    i36 = Integer.MAX_VALUE;
                } else {
                    i36 = i13;
                }
                if (i15 != 0) {
                    z4 = false;
                }
                c0187a = jt1.a.a;
                if (i17 != 0) {
                    bj4VarO.K(-652118101);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new w05(2);
                        bj4VarO.C(objF3);
                    }
                    oh4Var3 = (oh4) objF3;
                    bj4VarO.U(false);
                }
                if (i19 != 0) {
                    i37 = 1;
                } else {
                    i37 = i2;
                }
                if (i21 != 0) {
                    i38 = 1;
                } else {
                    i38 = i3;
                }
                if (i23 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i26 != 0) {
                    ci4Var2 = null;
                } else {
                    ci4Var2 = ci4Var;
                }
                if (i29 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i33 != 0) {
                    f2 = Float.NaN;
                } else {
                    f2 = f;
                }
                bj4VarO.K(-652108692);
                if (uh1Var2 == null) {
                    jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                } else {
                    jB = uh1Var2.a;
                }
                objB = aa0.b(bj4VarO, false, -652103026);
                if (objB == c0187a) {
                    objB = new jw0();
                    bj4VarO.C(objB);
                }
                fw0Var = (fw0) objB;
                int i41111111111111111111116 = i35;
                bj4VarO.U(false);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    c33 c33Var111114 = wd3.a;
                    objF = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72Var = (t72) objF;
                uh1 uh1Var111117 = uh1Var2;
                String str1111110 = str3;
                int i41111111111111111111117 = i7;
                ox6 ox6VarB11111111117 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                IntercomTheme intercomTheme111114 = IntercomTheme.INSTANCE;
                int i41111111111111111111118 = IntercomTheme.$stable;
                float f111117 = f2;
                ox6 ox6VarA111114 = kw0.a(uma.a(ns0.a(ox6VarB11111111117, 1.0f, jB, intercomTheme111114.getShapes(bj4VarO, i41111111111111111111118).b), intercomTheme111114.getShapes(bj4VarO, i41111111111111111111118).b), fw0Var);
                bj4VarO.K(-652085201);
                zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new w62(1, t72Var, fw0Var);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new w62(1, t72Var, fw0Var);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ox6 ox6VarB11111111118 = p84.b(ox6VarA111114, (oh4) objF2);
                pda pdaVarD111114 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                long j111115 = uh1.j;
                pda pdaVarA111114 = pdaVarD111114.a(((-14837) & 1) != 0 ? pdaVarD111114.a : 0L, ((-14837) & 2) != 0 ? pdaVarD111114.b : 0L, ((-14837) & 4) != 0 ? pdaVarD111114.c : ac4.b(intercomTheme111114, bj4VarO, i41111111111111111111118), pdaVarD111114.d, ((-14837) & 16) != 0 ? pdaVarD111114.e : intercomTheme111114.getColors(bj4VarO, i41111111111111111111118).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD111114.f : intercomTheme111114.getColors(bj4VarO, i41111111111111111111118).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD111114.g : intercomTheme111114.getColors(bj4VarO, i41111111111111111111118).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD111114.h : intercomTheme111114.getColors(bj4VarO, i41111111111111111111118).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD111114.i : j, pdaVarD111114.j, ((-14837) & 1024) != 0 ? pdaVarD111114.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD111114.l : j111115, ((-14837) & 4096) != 0 ? pdaVarD111114.m : j111115, ((-14837) & 8192) != 0 ? pdaVarD111114.n : j111115, pdaVarD111114.o, pdaVarD111114.p, pdaVarD111114.q, pdaVarD111114.r, pdaVarD111114.s, pdaVarD111114.t, pdaVarD111114.u, pdaVarD111114.v, pdaVarD111114.w, pdaVarD111114.x, pdaVarD111114.y, pdaVarD111114.z, pdaVarD111114.A, pdaVarD111114.B, pdaVarD111114.C, pdaVarD111114.D, pdaVarD111114.E, pdaVarD111114.F, pdaVarD111114.G, pdaVarD111114.H, pdaVarD111114.I, pdaVarD111114.J, pdaVarD111114.K, pdaVarD111114.L, pdaVarD111114.M, pdaVarD111114.N, pdaVarD111114.O, pdaVarD111114.P, pdaVarD111114.Q);
                dp5 dp5Var111114 = new dp5(i37, i38, 115);
                boolean z11111111111111119 = z4;
                bp5 bp5Var111114 = new bp5(oh4Var3, null, 59);
                b72 b72Var111114 = intercomTheme111114.getShapes(bj4VarO, i41111111111111111111118).b;
                final boolean z111111111111111110 = z5;
                int i41111111111111111111119 = i37;
                ci4<? super jt1, ? super Integer, g2b> ci4Var111117 = ci4Var2;
                bj4Var = bj4VarO;
                boolean z111111111111111111 = z6;
                ifa.a(str1111110, oh4Var, ox6VarB11111111118, z111111111111111111, intercomTheme111114.getTypography(bj4VarO, i41111111111111111111118).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    public final void invoke(jt1 jt1Var2, int i411111111111111111111110) {
                        if ((i411111111111111111111110 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ci4Var111117, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    public final void invoke(jt1 jt1Var2, int i411111111111111111111110) {
                        if ((i411111111111111111111110 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else if (z111111111111111110) {
                            m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, dp5Var111114, bp5Var111114, z11111111111111119, i36, 0, b72Var111114, pdaVarA111114, bj4Var, ((i41111111111111111111116 << 3) & 7168) | (i41111111111111111111117 & 14) | 817889280 | ((i41111111111111111111117 >> 3) & 112) | ((i41111111111111111111116 << 21) & 234881024), (29360128 & (i41111111111111111111117 << 3)) | ((i41111111111111111111117 << 9) & 234881024), 1604688);
                oh4Var4 = oh4Var3;
                uh1Var3 = uh1Var111117;
                z7 = z111111111111111111;
                ci4Var3 = ci4Var111117;
                z8 = z11111111111111119;
                i39 = i36;
                i40 = i38;
                z9 = z111111111111111110;
                f3 = f111117;
                str5 = str4;
                i41 = i41111111111111111111119;
                str6 = str1111110;
            } else {
                str4 = BuildConfig.FLAVOR;
                if (i42 != 0) {
                    str3 = BuildConfig.FLAVOR;
                }
                if (i43 == 0) {
                    str4 = str2;
                }
                if (i9 != 0) {
                    uh1Var2 = null;
                }
                if (i12 != 0) {
                    i36 = Integer.MAX_VALUE;
                } else {
                    i36 = i13;
                }
                if (i15 != 0) {
                    z4 = false;
                }
                c0187a = jt1.a.a;
                if (i17 != 0) {
                    bj4VarO.K(-652118101);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new w05(2);
                        bj4VarO.C(objF3);
                    }
                    oh4Var3 = (oh4) objF3;
                    bj4VarO.U(false);
                }
                if (i19 != 0) {
                    i37 = 1;
                } else {
                    i37 = i2;
                }
                if (i21 != 0) {
                    i38 = 1;
                } else {
                    i38 = i3;
                }
                if (i23 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i26 != 0) {
                    ci4Var2 = null;
                } else {
                    ci4Var2 = ci4Var;
                }
                if (i29 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i33 != 0) {
                    f2 = Float.NaN;
                } else {
                    f2 = f;
                }
                bj4VarO.K(-652108692);
                if (uh1Var2 == null) {
                    jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                } else {
                    jB = uh1Var2.a;
                }
                objB = aa0.b(bj4VarO, false, -652103026);
                if (objB == c0187a) {
                    objB = new jw0();
                    bj4VarO.C(objB);
                }
                fw0Var = (fw0) objB;
                int i411111111111111111111110 = i35;
                bj4VarO.U(false);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    c33 c33Var111115 = wd3.a;
                    objF = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72Var = (t72) objF;
                uh1 uh1Var111118 = uh1Var2;
                String str1111111 = str3;
                int i411111111111111111111111 = i7;
                ox6 ox6VarB11111111119 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                IntercomTheme intercomTheme111115 = IntercomTheme.INSTANCE;
                int i411111111111111111111112 = IntercomTheme.$stable;
                float f111118 = f2;
                ox6 ox6VarA111115 = kw0.a(uma.a(ns0.a(ox6VarB11111111119, 1.0f, jB, intercomTheme111115.getShapes(bj4VarO, i411111111111111111111112).b), intercomTheme111115.getShapes(bj4VarO, i411111111111111111111112).b), fw0Var);
                bj4VarO.K(-652085201);
                zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new w62(1, t72Var, fw0Var);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new w62(1, t72Var, fw0Var);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ox6 ox6VarB111111111110 = p84.b(ox6VarA111115, (oh4) objF2);
                pda pdaVarD111115 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                long j111116 = uh1.j;
                pda pdaVarA111115 = pdaVarD111115.a(((-14837) & 1) != 0 ? pdaVarD111115.a : 0L, ((-14837) & 2) != 0 ? pdaVarD111115.b : 0L, ((-14837) & 4) != 0 ? pdaVarD111115.c : ac4.b(intercomTheme111115, bj4VarO, i411111111111111111111112), pdaVarD111115.d, ((-14837) & 16) != 0 ? pdaVarD111115.e : intercomTheme111115.getColors(bj4VarO, i411111111111111111111112).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD111115.f : intercomTheme111115.getColors(bj4VarO, i411111111111111111111112).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD111115.g : intercomTheme111115.getColors(bj4VarO, i411111111111111111111112).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD111115.h : intercomTheme111115.getColors(bj4VarO, i411111111111111111111112).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD111115.i : j, pdaVarD111115.j, ((-14837) & 1024) != 0 ? pdaVarD111115.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD111115.l : j111116, ((-14837) & 4096) != 0 ? pdaVarD111115.m : j111116, ((-14837) & 8192) != 0 ? pdaVarD111115.n : j111116, pdaVarD111115.o, pdaVarD111115.p, pdaVarD111115.q, pdaVarD111115.r, pdaVarD111115.s, pdaVarD111115.t, pdaVarD111115.u, pdaVarD111115.v, pdaVarD111115.w, pdaVarD111115.x, pdaVarD111115.y, pdaVarD111115.z, pdaVarD111115.A, pdaVarD111115.B, pdaVarD111115.C, pdaVarD111115.D, pdaVarD111115.E, pdaVarD111115.F, pdaVarD111115.G, pdaVarD111115.H, pdaVarD111115.I, pdaVarD111115.J, pdaVarD111115.K, pdaVarD111115.L, pdaVarD111115.M, pdaVarD111115.N, pdaVarD111115.O, pdaVarD111115.P, pdaVarD111115.Q);
                dp5 dp5Var111115 = new dp5(i37, i38, 115);
                boolean z111111111111111112 = z4;
                bp5 bp5Var111115 = new bp5(oh4Var3, null, 59);
                b72 b72Var111115 = intercomTheme111115.getShapes(bj4VarO, i411111111111111111111112).b;
                final boolean z111111111111111113 = z5;
                int i411111111111111111111113 = i37;
                ci4<? super jt1, ? super Integer, g2b> ci4Var111118 = ci4Var2;
                bj4Var = bj4VarO;
                boolean z111111111111111114 = z6;
                ifa.a(str1111111, oh4Var, ox6VarB111111111110, z111111111111111114, intercomTheme111115.getTypography(bj4VarO, i411111111111111111111112).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    public final void invoke(jt1 jt1Var2, int i411111111111111111111114) {
                        if ((i411111111111111111111114 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ci4Var111118, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    public final void invoke(jt1 jt1Var2, int i411111111111111111111114) {
                        if ((i411111111111111111111114 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else if (z111111111111111113) {
                            m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, dp5Var111115, bp5Var111115, z111111111111111112, i36, 0, b72Var111115, pdaVarA111115, bj4Var, ((i411111111111111111111110 << 3) & 7168) | (i411111111111111111111111 & 14) | 817889280 | ((i411111111111111111111111 >> 3) & 112) | ((i411111111111111111111110 << 21) & 234881024), (29360128 & (i411111111111111111111111 << 3)) | ((i411111111111111111111111 << 9) & 234881024), 1604688);
                oh4Var4 = oh4Var3;
                uh1Var3 = uh1Var111118;
                z7 = z111111111111111114;
                ci4Var3 = ci4Var111118;
                z8 = z111111111111111112;
                i39 = i36;
                i40 = i38;
                z9 = z111111111111111113;
                f3 = f111118;
                str5 = str4;
                i41 = i411111111111111111111113;
                str6 = str1111111;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: vha
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i7 |= 3072;
        uh1Var2 = uh1Var;
        if ((i6 & 16) != 0) {
            i7 |= 24576;
        } else if ((i4 & 24576) == 0) {
            if (bj4VarO.i(j)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i7 |= i11;
        }
        i12 = i6 & 32;
        if (i12 != 0) {
            i7 |= 196608;
            i13 = i;
        } else {
            i13 = i;
            if ((i4 & 196608) == 0) {
                if (bj4VarO.h(i13)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i7 |= i14;
            }
        }
        i15 = i6 & 64;
        if (i15 != 0) {
            i7 |= 1572864;
            z4 = z;
        } else {
            z4 = z;
            if ((i4 & 1572864) == 0) {
                if (bj4VarO.c(z4)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i7 |= i16;
            }
        }
        i17 = i6 & 128;
        if (i17 != 0) {
            i7 |= 12582912;
            oh4Var3 = oh4Var2;
        } else {
            oh4Var3 = oh4Var2;
            if ((i4 & 12582912) == 0) {
                if (bj4VarO.j(oh4Var3)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i7 |= i18;
            }
        }
        i19 = i6 & 256;
        if (i19 != 0) {
            if ((i4 & 100663296) == 0) {
                if (bj4VarO.h(i2)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i7 |= i20;
            }
            i21 = i6 & 512;
            if (i21 != 0) {
                if ((i4 & 805306368) == 0) {
                    if (bj4VarO.h(i3)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i7 |= i22;
                }
                i23 = i6 & 1024;
                if (i23 != 0) {
                    i24 = i5 | 6;
                } else if ((i5 & 6) == 0) {
                    if (bj4VarO.c(z2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i5 | i25;
                } else {
                    i24 = i5;
                }
                i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                if (i26 != 0) {
                    i24 |= 48;
                } else if ((i5 & 48) != 0) {
                    if (bj4VarO.j(ci4Var)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i24 |= i27;
                }
                i28 = i24;
                i29 = i6 & 4096;
                if (i29 != 0) {
                    i31 = i28 | 384;
                } else {
                    i30 = i28;
                    if ((i5 & 384) != 0) {
                        if (bj4VarO.c(z3)) {
                            i32 = 256;
                        } else {
                            i32 = 128;
                        }
                        i30 |= i32;
                    }
                    i31 = i30;
                }
                i33 = i6 & 8192;
                if (i33 != 0) {
                    i35 = i31 | 3072;
                } else {
                    i34 = i31;
                    if ((i5 & 3072) == 0) {
                        i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                    } else {
                        i35 = i34;
                    }
                }
                if ((i7 & 306783379) != 306783378) {
                    str4 = BuildConfig.FLAVOR;
                    if (i42 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (i43 == 0) {
                        str4 = str2;
                    }
                    if (i9 != 0) {
                        uh1Var2 = null;
                    }
                    if (i12 != 0) {
                        i36 = Integer.MAX_VALUE;
                    } else {
                        i36 = i13;
                    }
                    if (i15 != 0) {
                        z4 = false;
                    }
                    c0187a = jt1.a.a;
                    if (i17 != 0) {
                        bj4VarO.K(-652118101);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new w05(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var3 = (oh4) objF3;
                        bj4VarO.U(false);
                    }
                    if (i19 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i2;
                    }
                    if (i21 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i3;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i26 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i29 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i33 != 0) {
                        f2 = Float.NaN;
                    } else {
                        f2 = f;
                    }
                    bj4VarO.K(-652108692);
                    if (uh1Var2 == null) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    } else {
                        jB = uh1Var2.a;
                    }
                    objB = aa0.b(bj4VarO, false, -652103026);
                    if (objB == c0187a) {
                        objB = new jw0();
                        bj4VarO.C(objB);
                    }
                    fw0Var = (fw0) objB;
                    int i411111111111111111111114 = i35;
                    bj4VarO.U(false);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var111116 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF;
                    uh1 uh1Var111119 = uh1Var2;
                    String str1111112 = str3;
                    int i411111111111111111111115 = i7;
                    ox6 ox6VarB111111111111 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                    IntercomTheme intercomTheme111116 = IntercomTheme.INSTANCE;
                    int i411111111111111111111116 = IntercomTheme.$stable;
                    float f111119 = f2;
                    ox6 ox6VarA111116 = kw0.a(uma.a(ns0.a(ox6VarB111111111111, 1.0f, jB, intercomTheme111116.getShapes(bj4VarO, i411111111111111111111116).b), intercomTheme111116.getShapes(bj4VarO, i411111111111111111111116).b), fw0Var);
                    bj4VarO.K(-652085201);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB111111111112 = p84.b(ox6VarA111116, (oh4) objF2);
                    pda pdaVarD111116 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                    long j111117 = uh1.j;
                    pda pdaVarA111116 = pdaVarD111116.a(((-14837) & 1) != 0 ? pdaVarD111116.a : 0L, ((-14837) & 2) != 0 ? pdaVarD111116.b : 0L, ((-14837) & 4) != 0 ? pdaVarD111116.c : ac4.b(intercomTheme111116, bj4VarO, i411111111111111111111116), pdaVarD111116.d, ((-14837) & 16) != 0 ? pdaVarD111116.e : intercomTheme111116.getColors(bj4VarO, i411111111111111111111116).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD111116.f : intercomTheme111116.getColors(bj4VarO, i411111111111111111111116).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD111116.g : intercomTheme111116.getColors(bj4VarO, i411111111111111111111116).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD111116.h : intercomTheme111116.getColors(bj4VarO, i411111111111111111111116).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD111116.i : j, pdaVarD111116.j, ((-14837) & 1024) != 0 ? pdaVarD111116.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD111116.l : j111117, ((-14837) & 4096) != 0 ? pdaVarD111116.m : j111117, ((-14837) & 8192) != 0 ? pdaVarD111116.n : j111117, pdaVarD111116.o, pdaVarD111116.p, pdaVarD111116.q, pdaVarD111116.r, pdaVarD111116.s, pdaVarD111116.t, pdaVarD111116.u, pdaVarD111116.v, pdaVarD111116.w, pdaVarD111116.x, pdaVarD111116.y, pdaVarD111116.z, pdaVarD111116.A, pdaVarD111116.B, pdaVarD111116.C, pdaVarD111116.D, pdaVarD111116.E, pdaVarD111116.F, pdaVarD111116.G, pdaVarD111116.H, pdaVarD111116.I, pdaVarD111116.J, pdaVarD111116.K, pdaVarD111116.L, pdaVarD111116.M, pdaVarD111116.N, pdaVarD111116.O, pdaVarD111116.P, pdaVarD111116.Q);
                    dp5 dp5Var111116 = new dp5(i37, i38, 115);
                    boolean z111111111111111115 = z4;
                    bp5 bp5Var111116 = new bp5(oh4Var3, null, 59);
                    b72 b72Var111116 = intercomTheme111116.getShapes(bj4VarO, i411111111111111111111116).b;
                    final boolean z111111111111111116 = z5;
                    int i411111111111111111111117 = i37;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var111119 = ci4Var2;
                    bj4Var = bj4VarO;
                    boolean z111111111111111117 = z6;
                    ifa.a(str1111112, oh4Var, ox6VarB111111111112, z111111111111111117, intercomTheme111116.getTypography(bj4VarO, i411111111111111111111116).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        public final void invoke(jt1 jt1Var2, int i411111111111111111111118) {
                            if ((i411111111111111111111118 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ci4Var111119, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        public final void invoke(jt1 jt1Var2, int i411111111111111111111118) {
                            if ((i411111111111111111111118 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else if (z111111111111111116) {
                                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, dp5Var111116, bp5Var111116, z111111111111111115, i36, 0, b72Var111116, pdaVarA111116, bj4Var, ((i411111111111111111111114 << 3) & 7168) | (i411111111111111111111115 & 14) | 817889280 | ((i411111111111111111111115 >> 3) & 112) | ((i411111111111111111111114 << 21) & 234881024), (29360128 & (i411111111111111111111115 << 3)) | ((i411111111111111111111115 << 9) & 234881024), 1604688);
                    oh4Var4 = oh4Var3;
                    uh1Var3 = uh1Var111119;
                    z7 = z111111111111111117;
                    ci4Var3 = ci4Var111119;
                    z8 = z111111111111111115;
                    i39 = i36;
                    i40 = i38;
                    z9 = z111111111111111116;
                    f3 = f111119;
                    str5 = str4;
                    i41 = i411111111111111111111117;
                    str6 = str1111112;
                } else {
                    str4 = BuildConfig.FLAVOR;
                    if (i42 != 0) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (i43 == 0) {
                        str4 = str2;
                    }
                    if (i9 != 0) {
                        uh1Var2 = null;
                    }
                    if (i12 != 0) {
                        i36 = Integer.MAX_VALUE;
                    } else {
                        i36 = i13;
                    }
                    if (i15 != 0) {
                        z4 = false;
                    }
                    c0187a = jt1.a.a;
                    if (i17 != 0) {
                        bj4VarO.K(-652118101);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new w05(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var3 = (oh4) objF3;
                        bj4VarO.U(false);
                    }
                    if (i19 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i2;
                    }
                    if (i21 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i3;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i26 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i29 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i33 != 0) {
                        f2 = Float.NaN;
                    } else {
                        f2 = f;
                    }
                    bj4VarO.K(-652108692);
                    if (uh1Var2 == null) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    } else {
                        jB = uh1Var2.a;
                    }
                    objB = aa0.b(bj4VarO, false, -652103026);
                    if (objB == c0187a) {
                        objB = new jw0();
                        bj4VarO.C(objB);
                    }
                    fw0Var = (fw0) objB;
                    int i411111111111111111111118 = i35;
                    bj4VarO.U(false);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        c33 c33Var111117 = wd3.a;
                        objF = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF;
                    uh1 uh1Var1111110 = uh1Var2;
                    String str1111113 = str3;
                    int i411111111111111111111119 = i7;
                    ox6 ox6VarB111111111113 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                    IntercomTheme intercomTheme111117 = IntercomTheme.INSTANCE;
                    int i4111111111111111111111110 = IntercomTheme.$stable;
                    float f1111110 = f2;
                    ox6 ox6VarA111117 = kw0.a(uma.a(ns0.a(ox6VarB111111111113, 1.0f, jB, intercomTheme111117.getShapes(bj4VarO, i4111111111111111111111110).b), intercomTheme111117.getShapes(bj4VarO, i4111111111111111111111110).b), fw0Var);
                    bj4VarO.K(-652085201);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new w62(1, t72Var, fw0Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB111111111114 = p84.b(ox6VarA111117, (oh4) objF2);
                    pda pdaVarD111117 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                    long j111118 = uh1.j;
                    pda pdaVarA111117 = pdaVarD111117.a(((-14837) & 1) != 0 ? pdaVarD111117.a : 0L, ((-14837) & 2) != 0 ? pdaVarD111117.b : 0L, ((-14837) & 4) != 0 ? pdaVarD111117.c : ac4.b(intercomTheme111117, bj4VarO, i4111111111111111111111110), pdaVarD111117.d, ((-14837) & 16) != 0 ? pdaVarD111117.e : intercomTheme111117.getColors(bj4VarO, i4111111111111111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD111117.f : intercomTheme111117.getColors(bj4VarO, i4111111111111111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD111117.g : intercomTheme111117.getColors(bj4VarO, i4111111111111111111111110).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD111117.h : intercomTheme111117.getColors(bj4VarO, i4111111111111111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD111117.i : j, pdaVarD111117.j, ((-14837) & 1024) != 0 ? pdaVarD111117.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD111117.l : j111118, ((-14837) & 4096) != 0 ? pdaVarD111117.m : j111118, ((-14837) & 8192) != 0 ? pdaVarD111117.n : j111118, pdaVarD111117.o, pdaVarD111117.p, pdaVarD111117.q, pdaVarD111117.r, pdaVarD111117.s, pdaVarD111117.t, pdaVarD111117.u, pdaVarD111117.v, pdaVarD111117.w, pdaVarD111117.x, pdaVarD111117.y, pdaVarD111117.z, pdaVarD111117.A, pdaVarD111117.B, pdaVarD111117.C, pdaVarD111117.D, pdaVarD111117.E, pdaVarD111117.F, pdaVarD111117.G, pdaVarD111117.H, pdaVarD111117.I, pdaVarD111117.J, pdaVarD111117.K, pdaVarD111117.L, pdaVarD111117.M, pdaVarD111117.N, pdaVarD111117.O, pdaVarD111117.P, pdaVarD111117.Q);
                    dp5 dp5Var111117 = new dp5(i37, i38, 115);
                    boolean z111111111111111118 = z4;
                    bp5 bp5Var111117 = new bp5(oh4Var3, null, 59);
                    b72 b72Var111117 = intercomTheme111117.getShapes(bj4VarO, i4111111111111111111111110).b;
                    final boolean z111111111111111119 = z5;
                    int i4111111111111111111111111 = i37;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var1111110 = ci4Var2;
                    bj4Var = bj4VarO;
                    boolean z1111111111111111110 = z6;
                    ifa.a(str1111113, oh4Var, ox6VarB111111111114, z1111111111111111110, intercomTheme111117.getTypography(bj4VarO, i4111111111111111111111110).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        public final void invoke(jt1 jt1Var2, int i4111111111111111111111112) {
                            if ((i4111111111111111111111112 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ci4Var1111110, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        public final void invoke(jt1 jt1Var2, int i4111111111111111111111112) {
                            if ((i4111111111111111111111112 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else if (z111111111111111119) {
                                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, dp5Var111117, bp5Var111117, z111111111111111118, i36, 0, b72Var111117, pdaVarA111117, bj4Var, ((i411111111111111111111118 << 3) & 7168) | (i411111111111111111111119 & 14) | 817889280 | ((i411111111111111111111119 >> 3) & 112) | ((i411111111111111111111118 << 21) & 234881024), (29360128 & (i411111111111111111111119 << 3)) | ((i411111111111111111111119 << 9) & 234881024), 1604688);
                    oh4Var4 = oh4Var3;
                    uh1Var3 = uh1Var1111110;
                    z7 = z1111111111111111110;
                    ci4Var3 = ci4Var1111110;
                    z8 = z111111111111111118;
                    i39 = i36;
                    i40 = i38;
                    z9 = z111111111111111119;
                    f3 = f1111110;
                    str5 = str4;
                    i41 = i4111111111111111111111111;
                    str6 = str1111113;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: vha
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i7 |= 805306368;
            i23 = i6 & 1024;
            if (i23 != 0) {
                i24 = i5 | 6;
            } else if ((i5 & 6) == 0) {
                if (bj4VarO.c(z2)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i5 | i25;
            } else {
                i24 = i5;
            }
            i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
            if (i26 != 0) {
                i24 |= 48;
            } else if ((i5 & 48) != 0) {
                if (bj4VarO.j(ci4Var)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i24 |= i27;
            }
            i28 = i24;
            i29 = i6 & 4096;
            if (i29 != 0) {
                i31 = i28 | 384;
            } else {
                i30 = i28;
                if ((i5 & 384) != 0) {
                    if (bj4VarO.c(z3)) {
                        i32 = 256;
                    } else {
                        i32 = 128;
                    }
                    i30 |= i32;
                }
                i31 = i30;
            }
            i33 = i6 & 8192;
            if (i33 != 0) {
                i35 = i31 | 3072;
            } else {
                i34 = i31;
                if ((i5 & 3072) == 0) {
                    i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                } else {
                    i35 = i34;
                }
            }
            if ((i7 & 306783379) != 306783378) {
                str4 = BuildConfig.FLAVOR;
                if (i42 != 0) {
                    str3 = BuildConfig.FLAVOR;
                }
                if (i43 == 0) {
                    str4 = str2;
                }
                if (i9 != 0) {
                    uh1Var2 = null;
                }
                if (i12 != 0) {
                    i36 = Integer.MAX_VALUE;
                } else {
                    i36 = i13;
                }
                if (i15 != 0) {
                    z4 = false;
                }
                c0187a = jt1.a.a;
                if (i17 != 0) {
                    bj4VarO.K(-652118101);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new w05(2);
                        bj4VarO.C(objF3);
                    }
                    oh4Var3 = (oh4) objF3;
                    bj4VarO.U(false);
                }
                if (i19 != 0) {
                    i37 = 1;
                } else {
                    i37 = i2;
                }
                if (i21 != 0) {
                    i38 = 1;
                } else {
                    i38 = i3;
                }
                if (i23 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i26 != 0) {
                    ci4Var2 = null;
                } else {
                    ci4Var2 = ci4Var;
                }
                if (i29 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i33 != 0) {
                    f2 = Float.NaN;
                } else {
                    f2 = f;
                }
                bj4VarO.K(-652108692);
                if (uh1Var2 == null) {
                    jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                } else {
                    jB = uh1Var2.a;
                }
                objB = aa0.b(bj4VarO, false, -652103026);
                if (objB == c0187a) {
                    objB = new jw0();
                    bj4VarO.C(objB);
                }
                fw0Var = (fw0) objB;
                int i4111111111111111111111112 = i35;
                bj4VarO.U(false);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    c33 c33Var111118 = wd3.a;
                    objF = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72Var = (t72) objF;
                uh1 uh1Var1111111 = uh1Var2;
                String str1111114 = str3;
                int i4111111111111111111111113 = i7;
                ox6 ox6VarB111111111115 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                IntercomTheme intercomTheme111118 = IntercomTheme.INSTANCE;
                int i4111111111111111111111114 = IntercomTheme.$stable;
                float f1111111 = f2;
                ox6 ox6VarA111118 = kw0.a(uma.a(ns0.a(ox6VarB111111111115, 1.0f, jB, intercomTheme111118.getShapes(bj4VarO, i4111111111111111111111114).b), intercomTheme111118.getShapes(bj4VarO, i4111111111111111111111114).b), fw0Var);
                bj4VarO.K(-652085201);
                zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new w62(1, t72Var, fw0Var);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new w62(1, t72Var, fw0Var);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ox6 ox6VarB111111111116 = p84.b(ox6VarA111118, (oh4) objF2);
                pda pdaVarD111118 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                long j111119 = uh1.j;
                pda pdaVarA111118 = pdaVarD111118.a(((-14837) & 1) != 0 ? pdaVarD111118.a : 0L, ((-14837) & 2) != 0 ? pdaVarD111118.b : 0L, ((-14837) & 4) != 0 ? pdaVarD111118.c : ac4.b(intercomTheme111118, bj4VarO, i4111111111111111111111114), pdaVarD111118.d, ((-14837) & 16) != 0 ? pdaVarD111118.e : intercomTheme111118.getColors(bj4VarO, i4111111111111111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD111118.f : intercomTheme111118.getColors(bj4VarO, i4111111111111111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD111118.g : intercomTheme111118.getColors(bj4VarO, i4111111111111111111111114).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD111118.h : intercomTheme111118.getColors(bj4VarO, i4111111111111111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD111118.i : j, pdaVarD111118.j, ((-14837) & 1024) != 0 ? pdaVarD111118.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD111118.l : j111119, ((-14837) & 4096) != 0 ? pdaVarD111118.m : j111119, ((-14837) & 8192) != 0 ? pdaVarD111118.n : j111119, pdaVarD111118.o, pdaVarD111118.p, pdaVarD111118.q, pdaVarD111118.r, pdaVarD111118.s, pdaVarD111118.t, pdaVarD111118.u, pdaVarD111118.v, pdaVarD111118.w, pdaVarD111118.x, pdaVarD111118.y, pdaVarD111118.z, pdaVarD111118.A, pdaVarD111118.B, pdaVarD111118.C, pdaVarD111118.D, pdaVarD111118.E, pdaVarD111118.F, pdaVarD111118.G, pdaVarD111118.H, pdaVarD111118.I, pdaVarD111118.J, pdaVarD111118.K, pdaVarD111118.L, pdaVarD111118.M, pdaVarD111118.N, pdaVarD111118.O, pdaVarD111118.P, pdaVarD111118.Q);
                dp5 dp5Var111118 = new dp5(i37, i38, 115);
                boolean z1111111111111111111 = z4;
                bp5 bp5Var111118 = new bp5(oh4Var3, null, 59);
                b72 b72Var111118 = intercomTheme111118.getShapes(bj4VarO, i4111111111111111111111114).b;
                final boolean z1111111111111111112 = z5;
                int i4111111111111111111111115 = i37;
                ci4<? super jt1, ? super Integer, g2b> ci4Var1111111 = ci4Var2;
                bj4Var = bj4VarO;
                boolean z1111111111111111113 = z6;
                ifa.a(str1111114, oh4Var, ox6VarB111111111116, z1111111111111111113, intercomTheme111118.getTypography(bj4VarO, i4111111111111111111111114).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    public final void invoke(jt1 jt1Var2, int i4111111111111111111111116) {
                        if ((i4111111111111111111111116 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ci4Var1111111, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    public final void invoke(jt1 jt1Var2, int i4111111111111111111111116) {
                        if ((i4111111111111111111111116 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else if (z1111111111111111112) {
                            m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, dp5Var111118, bp5Var111118, z1111111111111111111, i36, 0, b72Var111118, pdaVarA111118, bj4Var, ((i4111111111111111111111112 << 3) & 7168) | (i4111111111111111111111113 & 14) | 817889280 | ((i4111111111111111111111113 >> 3) & 112) | ((i4111111111111111111111112 << 21) & 234881024), (29360128 & (i4111111111111111111111113 << 3)) | ((i4111111111111111111111113 << 9) & 234881024), 1604688);
                oh4Var4 = oh4Var3;
                uh1Var3 = uh1Var1111111;
                z7 = z1111111111111111113;
                ci4Var3 = ci4Var1111111;
                z8 = z1111111111111111111;
                i39 = i36;
                i40 = i38;
                z9 = z1111111111111111112;
                f3 = f1111111;
                str5 = str4;
                i41 = i4111111111111111111111115;
                str6 = str1111114;
            } else {
                str4 = BuildConfig.FLAVOR;
                if (i42 != 0) {
                    str3 = BuildConfig.FLAVOR;
                }
                if (i43 == 0) {
                    str4 = str2;
                }
                if (i9 != 0) {
                    uh1Var2 = null;
                }
                if (i12 != 0) {
                    i36 = Integer.MAX_VALUE;
                } else {
                    i36 = i13;
                }
                if (i15 != 0) {
                    z4 = false;
                }
                c0187a = jt1.a.a;
                if (i17 != 0) {
                    bj4VarO.K(-652118101);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new w05(2);
                        bj4VarO.C(objF3);
                    }
                    oh4Var3 = (oh4) objF3;
                    bj4VarO.U(false);
                }
                if (i19 != 0) {
                    i37 = 1;
                } else {
                    i37 = i2;
                }
                if (i21 != 0) {
                    i38 = 1;
                } else {
                    i38 = i3;
                }
                if (i23 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i26 != 0) {
                    ci4Var2 = null;
                } else {
                    ci4Var2 = ci4Var;
                }
                if (i29 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i33 != 0) {
                    f2 = Float.NaN;
                } else {
                    f2 = f;
                }
                bj4VarO.K(-652108692);
                if (uh1Var2 == null) {
                    jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                } else {
                    jB = uh1Var2.a;
                }
                objB = aa0.b(bj4VarO, false, -652103026);
                if (objB == c0187a) {
                    objB = new jw0();
                    bj4VarO.C(objB);
                }
                fw0Var = (fw0) objB;
                int i4111111111111111111111116 = i35;
                bj4VarO.U(false);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    c33 c33Var111119 = wd3.a;
                    objF = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72Var = (t72) objF;
                uh1 uh1Var1111112 = uh1Var2;
                String str1111115 = str3;
                int i4111111111111111111111117 = i7;
                ox6 ox6VarB111111111117 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                IntercomTheme intercomTheme111119 = IntercomTheme.INSTANCE;
                int i4111111111111111111111118 = IntercomTheme.$stable;
                float f1111112 = f2;
                ox6 ox6VarA111119 = kw0.a(uma.a(ns0.a(ox6VarB111111111117, 1.0f, jB, intercomTheme111119.getShapes(bj4VarO, i4111111111111111111111118).b), intercomTheme111119.getShapes(bj4VarO, i4111111111111111111111118).b), fw0Var);
                bj4VarO.K(-652085201);
                zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new w62(1, t72Var, fw0Var);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new w62(1, t72Var, fw0Var);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ox6 ox6VarB111111111118 = p84.b(ox6VarA111119, (oh4) objF2);
                pda pdaVarD111119 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                long j1111110 = uh1.j;
                pda pdaVarA111119 = pdaVarD111119.a(((-14837) & 1) != 0 ? pdaVarD111119.a : 0L, ((-14837) & 2) != 0 ? pdaVarD111119.b : 0L, ((-14837) & 4) != 0 ? pdaVarD111119.c : ac4.b(intercomTheme111119, bj4VarO, i4111111111111111111111118), pdaVarD111119.d, ((-14837) & 16) != 0 ? pdaVarD111119.e : intercomTheme111119.getColors(bj4VarO, i4111111111111111111111118).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD111119.f : intercomTheme111119.getColors(bj4VarO, i4111111111111111111111118).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD111119.g : intercomTheme111119.getColors(bj4VarO, i4111111111111111111111118).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD111119.h : intercomTheme111119.getColors(bj4VarO, i4111111111111111111111118).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD111119.i : j, pdaVarD111119.j, ((-14837) & 1024) != 0 ? pdaVarD111119.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD111119.l : j1111110, ((-14837) & 4096) != 0 ? pdaVarD111119.m : j1111110, ((-14837) & 8192) != 0 ? pdaVarD111119.n : j1111110, pdaVarD111119.o, pdaVarD111119.p, pdaVarD111119.q, pdaVarD111119.r, pdaVarD111119.s, pdaVarD111119.t, pdaVarD111119.u, pdaVarD111119.v, pdaVarD111119.w, pdaVarD111119.x, pdaVarD111119.y, pdaVarD111119.z, pdaVarD111119.A, pdaVarD111119.B, pdaVarD111119.C, pdaVarD111119.D, pdaVarD111119.E, pdaVarD111119.F, pdaVarD111119.G, pdaVarD111119.H, pdaVarD111119.I, pdaVarD111119.J, pdaVarD111119.K, pdaVarD111119.L, pdaVarD111119.M, pdaVarD111119.N, pdaVarD111119.O, pdaVarD111119.P, pdaVarD111119.Q);
                dp5 dp5Var111119 = new dp5(i37, i38, 115);
                boolean z1111111111111111114 = z4;
                bp5 bp5Var111119 = new bp5(oh4Var3, null, 59);
                b72 b72Var111119 = intercomTheme111119.getShapes(bj4VarO, i4111111111111111111111118).b;
                final boolean z1111111111111111115 = z5;
                int i4111111111111111111111119 = i37;
                ci4<? super jt1, ? super Integer, g2b> ci4Var1111112 = ci4Var2;
                bj4Var = bj4VarO;
                boolean z1111111111111111116 = z6;
                ifa.a(str1111115, oh4Var, ox6VarB111111111118, z1111111111111111116, intercomTheme111119.getTypography(bj4VarO, i4111111111111111111111118).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    public final void invoke(jt1 jt1Var2, int i41111111111111111111111110) {
                        if ((i41111111111111111111111110 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ci4Var1111112, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    public final void invoke(jt1 jt1Var2, int i41111111111111111111111110) {
                        if ((i41111111111111111111111110 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else if (z1111111111111111115) {
                            m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, dp5Var111119, bp5Var111119, z1111111111111111114, i36, 0, b72Var111119, pdaVarA111119, bj4Var, ((i4111111111111111111111116 << 3) & 7168) | (i4111111111111111111111117 & 14) | 817889280 | ((i4111111111111111111111117 >> 3) & 112) | ((i4111111111111111111111116 << 21) & 234881024), (29360128 & (i4111111111111111111111117 << 3)) | ((i4111111111111111111111117 << 9) & 234881024), 1604688);
                oh4Var4 = oh4Var3;
                uh1Var3 = uh1Var1111112;
                z7 = z1111111111111111116;
                ci4Var3 = ci4Var1111112;
                z8 = z1111111111111111114;
                i39 = i36;
                i40 = i38;
                z9 = z1111111111111111115;
                f3 = f1111112;
                str5 = str4;
                i41 = i4111111111111111111111119;
                str6 = str1111115;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: vha
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i7 |= 100663296;
        i21 = i6 & 512;
        if (i21 != 0) {
            if ((i4 & 805306368) == 0) {
                if (bj4VarO.h(i3)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i7 |= i22;
            }
            i23 = i6 & 1024;
            if (i23 != 0) {
                i24 = i5 | 6;
            } else if ((i5 & 6) == 0) {
                if (bj4VarO.c(z2)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i5 | i25;
            } else {
                i24 = i5;
            }
            i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
            if (i26 != 0) {
                i24 |= 48;
            } else if ((i5 & 48) != 0) {
                if (bj4VarO.j(ci4Var)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i24 |= i27;
            }
            i28 = i24;
            i29 = i6 & 4096;
            if (i29 != 0) {
                i31 = i28 | 384;
            } else {
                i30 = i28;
                if ((i5 & 384) != 0) {
                    if (bj4VarO.c(z3)) {
                        i32 = 256;
                    } else {
                        i32 = 128;
                    }
                    i30 |= i32;
                }
                i31 = i30;
            }
            i33 = i6 & 8192;
            if (i33 != 0) {
                i35 = i31 | 3072;
            } else {
                i34 = i31;
                if ((i5 & 3072) == 0) {
                    i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
                } else {
                    i35 = i34;
                }
            }
            if ((i7 & 306783379) != 306783378) {
                str4 = BuildConfig.FLAVOR;
                if (i42 != 0) {
                    str3 = BuildConfig.FLAVOR;
                }
                if (i43 == 0) {
                    str4 = str2;
                }
                if (i9 != 0) {
                    uh1Var2 = null;
                }
                if (i12 != 0) {
                    i36 = Integer.MAX_VALUE;
                } else {
                    i36 = i13;
                }
                if (i15 != 0) {
                    z4 = false;
                }
                c0187a = jt1.a.a;
                if (i17 != 0) {
                    bj4VarO.K(-652118101);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new w05(2);
                        bj4VarO.C(objF3);
                    }
                    oh4Var3 = (oh4) objF3;
                    bj4VarO.U(false);
                }
                if (i19 != 0) {
                    i37 = 1;
                } else {
                    i37 = i2;
                }
                if (i21 != 0) {
                    i38 = 1;
                } else {
                    i38 = i3;
                }
                if (i23 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i26 != 0) {
                    ci4Var2 = null;
                } else {
                    ci4Var2 = ci4Var;
                }
                if (i29 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i33 != 0) {
                    f2 = Float.NaN;
                } else {
                    f2 = f;
                }
                bj4VarO.K(-652108692);
                if (uh1Var2 == null) {
                    jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                } else {
                    jB = uh1Var2.a;
                }
                objB = aa0.b(bj4VarO, false, -652103026);
                if (objB == c0187a) {
                    objB = new jw0();
                    bj4VarO.C(objB);
                }
                fw0Var = (fw0) objB;
                int i41111111111111111111111110 = i35;
                bj4VarO.U(false);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    c33 c33Var1111110 = wd3.a;
                    objF = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72Var = (t72) objF;
                uh1 uh1Var1111113 = uh1Var2;
                String str1111116 = str3;
                int i41111111111111111111111111 = i7;
                ox6 ox6VarB111111111119 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                IntercomTheme intercomTheme1111110 = IntercomTheme.INSTANCE;
                int i41111111111111111111111112 = IntercomTheme.$stable;
                float f1111113 = f2;
                ox6 ox6VarA1111110 = kw0.a(uma.a(ns0.a(ox6VarB111111111119, 1.0f, jB, intercomTheme1111110.getShapes(bj4VarO, i41111111111111111111111112).b), intercomTheme1111110.getShapes(bj4VarO, i41111111111111111111111112).b), fw0Var);
                bj4VarO.K(-652085201);
                zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new w62(1, t72Var, fw0Var);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new w62(1, t72Var, fw0Var);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ox6 ox6VarB1111111111110 = p84.b(ox6VarA1111110, (oh4) objF2);
                pda pdaVarD1111110 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                long j1111111 = uh1.j;
                pda pdaVarA1111110 = pdaVarD1111110.a(((-14837) & 1) != 0 ? pdaVarD1111110.a : 0L, ((-14837) & 2) != 0 ? pdaVarD1111110.b : 0L, ((-14837) & 4) != 0 ? pdaVarD1111110.c : ac4.b(intercomTheme1111110, bj4VarO, i41111111111111111111111112), pdaVarD1111110.d, ((-14837) & 16) != 0 ? pdaVarD1111110.e : intercomTheme1111110.getColors(bj4VarO, i41111111111111111111111112).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD1111110.f : intercomTheme1111110.getColors(bj4VarO, i41111111111111111111111112).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD1111110.g : intercomTheme1111110.getColors(bj4VarO, i41111111111111111111111112).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD1111110.h : intercomTheme1111110.getColors(bj4VarO, i41111111111111111111111112).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD1111110.i : j, pdaVarD1111110.j, ((-14837) & 1024) != 0 ? pdaVarD1111110.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD1111110.l : j1111111, ((-14837) & 4096) != 0 ? pdaVarD1111110.m : j1111111, ((-14837) & 8192) != 0 ? pdaVarD1111110.n : j1111111, pdaVarD1111110.o, pdaVarD1111110.p, pdaVarD1111110.q, pdaVarD1111110.r, pdaVarD1111110.s, pdaVarD1111110.t, pdaVarD1111110.u, pdaVarD1111110.v, pdaVarD1111110.w, pdaVarD1111110.x, pdaVarD1111110.y, pdaVarD1111110.z, pdaVarD1111110.A, pdaVarD1111110.B, pdaVarD1111110.C, pdaVarD1111110.D, pdaVarD1111110.E, pdaVarD1111110.F, pdaVarD1111110.G, pdaVarD1111110.H, pdaVarD1111110.I, pdaVarD1111110.J, pdaVarD1111110.K, pdaVarD1111110.L, pdaVarD1111110.M, pdaVarD1111110.N, pdaVarD1111110.O, pdaVarD1111110.P, pdaVarD1111110.Q);
                dp5 dp5Var1111110 = new dp5(i37, i38, 115);
                boolean z1111111111111111117 = z4;
                bp5 bp5Var1111110 = new bp5(oh4Var3, null, 59);
                b72 b72Var1111110 = intercomTheme1111110.getShapes(bj4VarO, i41111111111111111111111112).b;
                final boolean z1111111111111111118 = z5;
                int i41111111111111111111111113 = i37;
                ci4<? super jt1, ? super Integer, g2b> ci4Var1111113 = ci4Var2;
                bj4Var = bj4VarO;
                boolean z1111111111111111119 = z6;
                ifa.a(str1111116, oh4Var, ox6VarB1111111111110, z1111111111111111119, intercomTheme1111110.getTypography(bj4VarO, i41111111111111111111111112).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    public final void invoke(jt1 jt1Var2, int i41111111111111111111111114) {
                        if ((i41111111111111111111111114 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ci4Var1111113, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    public final void invoke(jt1 jt1Var2, int i41111111111111111111111114) {
                        if ((i41111111111111111111111114 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else if (z1111111111111111118) {
                            m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, dp5Var1111110, bp5Var1111110, z1111111111111111117, i36, 0, b72Var1111110, pdaVarA1111110, bj4Var, ((i41111111111111111111111110 << 3) & 7168) | (i41111111111111111111111111 & 14) | 817889280 | ((i41111111111111111111111111 >> 3) & 112) | ((i41111111111111111111111110 << 21) & 234881024), (29360128 & (i41111111111111111111111111 << 3)) | ((i41111111111111111111111111 << 9) & 234881024), 1604688);
                oh4Var4 = oh4Var3;
                uh1Var3 = uh1Var1111113;
                z7 = z1111111111111111119;
                ci4Var3 = ci4Var1111113;
                z8 = z1111111111111111117;
                i39 = i36;
                i40 = i38;
                z9 = z1111111111111111118;
                f3 = f1111113;
                str5 = str4;
                i41 = i41111111111111111111111113;
                str6 = str1111116;
            } else {
                str4 = BuildConfig.FLAVOR;
                if (i42 != 0) {
                    str3 = BuildConfig.FLAVOR;
                }
                if (i43 == 0) {
                    str4 = str2;
                }
                if (i9 != 0) {
                    uh1Var2 = null;
                }
                if (i12 != 0) {
                    i36 = Integer.MAX_VALUE;
                } else {
                    i36 = i13;
                }
                if (i15 != 0) {
                    z4 = false;
                }
                c0187a = jt1.a.a;
                if (i17 != 0) {
                    bj4VarO.K(-652118101);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new w05(2);
                        bj4VarO.C(objF3);
                    }
                    oh4Var3 = (oh4) objF3;
                    bj4VarO.U(false);
                }
                if (i19 != 0) {
                    i37 = 1;
                } else {
                    i37 = i2;
                }
                if (i21 != 0) {
                    i38 = 1;
                } else {
                    i38 = i3;
                }
                if (i23 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i26 != 0) {
                    ci4Var2 = null;
                } else {
                    ci4Var2 = ci4Var;
                }
                if (i29 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i33 != 0) {
                    f2 = Float.NaN;
                } else {
                    f2 = f;
                }
                bj4VarO.K(-652108692);
                if (uh1Var2 == null) {
                    jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                } else {
                    jB = uh1Var2.a;
                }
                objB = aa0.b(bj4VarO, false, -652103026);
                if (objB == c0187a) {
                    objB = new jw0();
                    bj4VarO.C(objB);
                }
                fw0Var = (fw0) objB;
                int i41111111111111111111111114 = i35;
                bj4VarO.U(false);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    c33 c33Var1111111 = wd3.a;
                    objF = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72Var = (t72) objF;
                uh1 uh1Var1111114 = uh1Var2;
                String str1111117 = str3;
                int i41111111111111111111111115 = i7;
                ox6 ox6VarB1111111111111 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
                IntercomTheme intercomTheme1111111 = IntercomTheme.INSTANCE;
                int i41111111111111111111111116 = IntercomTheme.$stable;
                float f1111114 = f2;
                ox6 ox6VarA1111111 = kw0.a(uma.a(ns0.a(ox6VarB1111111111111, 1.0f, jB, intercomTheme1111111.getShapes(bj4VarO, i41111111111111111111111116).b), intercomTheme1111111.getShapes(bj4VarO, i41111111111111111111111116).b), fw0Var);
                bj4VarO.K(-652085201);
                zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new w62(1, t72Var, fw0Var);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new w62(1, t72Var, fw0Var);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ox6 ox6VarB1111111111112 = p84.b(ox6VarA1111111, (oh4) objF2);
                pda pdaVarD1111111 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
                long j1111112 = uh1.j;
                pda pdaVarA1111111 = pdaVarD1111111.a(((-14837) & 1) != 0 ? pdaVarD1111111.a : 0L, ((-14837) & 2) != 0 ? pdaVarD1111111.b : 0L, ((-14837) & 4) != 0 ? pdaVarD1111111.c : ac4.b(intercomTheme1111111, bj4VarO, i41111111111111111111111116), pdaVarD1111111.d, ((-14837) & 16) != 0 ? pdaVarD1111111.e : intercomTheme1111111.getColors(bj4VarO, i41111111111111111111111116).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD1111111.f : intercomTheme1111111.getColors(bj4VarO, i41111111111111111111111116).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD1111111.g : intercomTheme1111111.getColors(bj4VarO, i41111111111111111111111116).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD1111111.h : intercomTheme1111111.getColors(bj4VarO, i41111111111111111111111116).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD1111111.i : j, pdaVarD1111111.j, ((-14837) & 1024) != 0 ? pdaVarD1111111.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD1111111.l : j1111112, ((-14837) & 4096) != 0 ? pdaVarD1111111.m : j1111112, ((-14837) & 8192) != 0 ? pdaVarD1111111.n : j1111112, pdaVarD1111111.o, pdaVarD1111111.p, pdaVarD1111111.q, pdaVarD1111111.r, pdaVarD1111111.s, pdaVarD1111111.t, pdaVarD1111111.u, pdaVarD1111111.v, pdaVarD1111111.w, pdaVarD1111111.x, pdaVarD1111111.y, pdaVarD1111111.z, pdaVarD1111111.A, pdaVarD1111111.B, pdaVarD1111111.C, pdaVarD1111111.D, pdaVarD1111111.E, pdaVarD1111111.F, pdaVarD1111111.G, pdaVarD1111111.H, pdaVarD1111111.I, pdaVarD1111111.J, pdaVarD1111111.K, pdaVarD1111111.L, pdaVarD1111111.M, pdaVarD1111111.N, pdaVarD1111111.O, pdaVarD1111111.P, pdaVarD1111111.Q);
                dp5 dp5Var1111111 = new dp5(i37, i38, 115);
                boolean z11111111111111111110 = z4;
                bp5 bp5Var1111111 = new bp5(oh4Var3, null, 59);
                b72 b72Var1111111 = intercomTheme1111111.getShapes(bj4VarO, i41111111111111111111111116).b;
                final boolean z11111111111111111111 = z5;
                int i41111111111111111111111117 = i37;
                ci4<? super jt1, ? super Integer, g2b> ci4Var1111114 = ci4Var2;
                bj4Var = bj4VarO;
                boolean z11111111111111111112 = z6;
                ifa.a(str1111117, oh4Var, ox6VarB1111111111112, z11111111111111111112, intercomTheme1111111.getTypography(bj4VarO, i41111111111111111111111116).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    public final void invoke(jt1 jt1Var2, int i41111111111111111111111118) {
                        if ((i41111111111111111111111118 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ci4Var1111114, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    public final void invoke(jt1 jt1Var2, int i41111111111111111111111118) {
                        if ((i41111111111111111111111118 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else if (z11111111111111111111) {
                            m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, dp5Var1111111, bp5Var1111111, z11111111111111111110, i36, 0, b72Var1111111, pdaVarA1111111, bj4Var, ((i41111111111111111111111114 << 3) & 7168) | (i41111111111111111111111115 & 14) | 817889280 | ((i41111111111111111111111115 >> 3) & 112) | ((i41111111111111111111111114 << 21) & 234881024), (29360128 & (i41111111111111111111111115 << 3)) | ((i41111111111111111111111115 << 9) & 234881024), 1604688);
                oh4Var4 = oh4Var3;
                uh1Var3 = uh1Var1111114;
                z7 = z11111111111111111112;
                ci4Var3 = ci4Var1111114;
                z8 = z11111111111111111110;
                i39 = i36;
                i40 = i38;
                z9 = z11111111111111111111;
                f3 = f1111114;
                str5 = str4;
                i41 = i41111111111111111111111117;
                str6 = str1111117;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: vha
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i7 |= 805306368;
        i23 = i6 & 1024;
        if (i23 != 0) {
            i24 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            if (bj4VarO.c(z2)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i24 = i5 | i25;
        } else {
            i24 = i5;
        }
        i26 = i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
        if (i26 != 0) {
            i24 |= 48;
        } else if ((i5 & 48) != 0) {
            if (bj4VarO.j(ci4Var)) {
                i27 = 32;
            } else {
                i27 = 16;
            }
            i24 |= i27;
        }
        i28 = i24;
        i29 = i6 & 4096;
        if (i29 != 0) {
            i31 = i28 | 384;
        } else {
            i30 = i28;
            if ((i5 & 384) != 0) {
                if (bj4VarO.c(z3)) {
                    i32 = 256;
                } else {
                    i32 = 128;
                }
                i30 |= i32;
            }
            i31 = i30;
        }
        i33 = i6 & 8192;
        if (i33 != 0) {
            i35 = i31 | 3072;
        } else {
            i34 = i31;
            if ((i5 & 3072) == 0) {
                i35 = i34 | (bj4VarO.g(f) ? 2048 : 1024);
            } else {
                i35 = i34;
            }
        }
        if ((i7 & 306783379) != 306783378) {
            str4 = BuildConfig.FLAVOR;
            if (i42 != 0) {
                str3 = BuildConfig.FLAVOR;
            }
            if (i43 == 0) {
                str4 = str2;
            }
            if (i9 != 0) {
                uh1Var2 = null;
            }
            if (i12 != 0) {
                i36 = Integer.MAX_VALUE;
            } else {
                i36 = i13;
            }
            if (i15 != 0) {
                z4 = false;
            }
            c0187a = jt1.a.a;
            if (i17 != 0) {
                bj4VarO.K(-652118101);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new w05(2);
                    bj4VarO.C(objF3);
                }
                oh4Var3 = (oh4) objF3;
                bj4VarO.U(false);
            }
            if (i19 != 0) {
                i37 = 1;
            } else {
                i37 = i2;
            }
            if (i21 != 0) {
                i38 = 1;
            } else {
                i38 = i3;
            }
            if (i23 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            if (i26 != 0) {
                ci4Var2 = null;
            } else {
                ci4Var2 = ci4Var;
            }
            if (i29 != 0) {
                z6 = true;
            } else {
                z6 = z3;
            }
            if (i33 != 0) {
                f2 = Float.NaN;
            } else {
                f2 = f;
            }
            bj4VarO.K(-652108692);
            if (uh1Var2 == null) {
                jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
            } else {
                jB = uh1Var2.a;
            }
            objB = aa0.b(bj4VarO, false, -652103026);
            if (objB == c0187a) {
                objB = new jw0();
                bj4VarO.C(objB);
            }
            fw0Var = (fw0) objB;
            int i41111111111111111111111118 = i35;
            bj4VarO.U(false);
            objF = bj4VarO.f();
            if (objF == c0187a) {
                c33 c33Var1111112 = wd3.a;
                objF = m78.a(bj4VarO.x(), bj4VarO);
            }
            t72Var = (t72) objF;
            uh1 uh1Var1111115 = uh1Var2;
            String str1111118 = str3;
            int i41111111111111111111111119 = i7;
            ox6 ox6VarB1111111111113 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
            IntercomTheme intercomTheme1111112 = IntercomTheme.INSTANCE;
            int i411111111111111111111111110 = IntercomTheme.$stable;
            float f1111115 = f2;
            ox6 ox6VarA1111112 = kw0.a(uma.a(ns0.a(ox6VarB1111111111113, 1.0f, jB, intercomTheme1111112.getShapes(bj4VarO, i411111111111111111111111110).b), intercomTheme1111112.getShapes(bj4VarO, i411111111111111111111111110).b), fw0Var);
            bj4VarO.K(-652085201);
            zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
            objF2 = bj4VarO.f();
            if (zJ) {
                objF2 = new w62(1, t72Var, fw0Var);
                bj4VarO.C(objF2);
            } else {
                objF2 = new w62(1, t72Var, fw0Var);
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            ox6 ox6VarB1111111111114 = p84.b(ox6VarA1111112, (oh4) objF2);
            pda pdaVarD1111112 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
            long j1111113 = uh1.j;
            pda pdaVarA1111112 = pdaVarD1111112.a(((-14837) & 1) != 0 ? pdaVarD1111112.a : 0L, ((-14837) & 2) != 0 ? pdaVarD1111112.b : 0L, ((-14837) & 4) != 0 ? pdaVarD1111112.c : ac4.b(intercomTheme1111112, bj4VarO, i411111111111111111111111110), pdaVarD1111112.d, ((-14837) & 16) != 0 ? pdaVarD1111112.e : intercomTheme1111112.getColors(bj4VarO, i411111111111111111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD1111112.f : intercomTheme1111112.getColors(bj4VarO, i411111111111111111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD1111112.g : intercomTheme1111112.getColors(bj4VarO, i411111111111111111111111110).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD1111112.h : intercomTheme1111112.getColors(bj4VarO, i411111111111111111111111110).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD1111112.i : j, pdaVarD1111112.j, ((-14837) & 1024) != 0 ? pdaVarD1111112.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD1111112.l : j1111113, ((-14837) & 4096) != 0 ? pdaVarD1111112.m : j1111113, ((-14837) & 8192) != 0 ? pdaVarD1111112.n : j1111113, pdaVarD1111112.o, pdaVarD1111112.p, pdaVarD1111112.q, pdaVarD1111112.r, pdaVarD1111112.s, pdaVarD1111112.t, pdaVarD1111112.u, pdaVarD1111112.v, pdaVarD1111112.w, pdaVarD1111112.x, pdaVarD1111112.y, pdaVarD1111112.z, pdaVarD1111112.A, pdaVarD1111112.B, pdaVarD1111112.C, pdaVarD1111112.D, pdaVarD1111112.E, pdaVarD1111112.F, pdaVarD1111112.G, pdaVarD1111112.H, pdaVarD1111112.I, pdaVarD1111112.J, pdaVarD1111112.K, pdaVarD1111112.L, pdaVarD1111112.M, pdaVarD1111112.N, pdaVarD1111112.O, pdaVarD1111112.P, pdaVarD1111112.Q);
            dp5 dp5Var1111112 = new dp5(i37, i38, 115);
            boolean z11111111111111111113 = z4;
            bp5 bp5Var1111112 = new bp5(oh4Var3, null, 59);
            b72 b72Var1111112 = intercomTheme1111112.getShapes(bj4VarO, i411111111111111111111111110).b;
            final boolean z11111111111111111114 = z5;
            int i411111111111111111111111111 = i37;
            ci4<? super jt1, ? super Integer, g2b> ci4Var1111115 = ci4Var2;
            bj4Var = bj4VarO;
            boolean z11111111111111111115 = z6;
            ifa.a(str1111118, oh4Var, ox6VarB1111111111114, z11111111111111111115, intercomTheme1111112.getTypography(bj4VarO, i411111111111111111111111110).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                public final void invoke(jt1 jt1Var2, int i411111111111111111111111112) {
                    if ((i411111111111111111111111112 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), ci4Var1111115, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                public final void invoke(jt1 jt1Var2, int i411111111111111111111111112) {
                    if ((i411111111111111111111111112 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else if (z11111111111111111114) {
                        m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, dp5Var1111112, bp5Var1111112, z11111111111111111113, i36, 0, b72Var1111112, pdaVarA1111112, bj4Var, ((i41111111111111111111111118 << 3) & 7168) | (i41111111111111111111111119 & 14) | 817889280 | ((i41111111111111111111111119 >> 3) & 112) | ((i41111111111111111111111118 << 21) & 234881024), (29360128 & (i41111111111111111111111119 << 3)) | ((i41111111111111111111111119 << 9) & 234881024), 1604688);
            oh4Var4 = oh4Var3;
            uh1Var3 = uh1Var1111115;
            z7 = z11111111111111111115;
            ci4Var3 = ci4Var1111115;
            z8 = z11111111111111111113;
            i39 = i36;
            i40 = i38;
            z9 = z11111111111111111114;
            f3 = f1111115;
            str5 = str4;
            i41 = i411111111111111111111111111;
            str6 = str1111118;
        } else {
            str4 = BuildConfig.FLAVOR;
            if (i42 != 0) {
                str3 = BuildConfig.FLAVOR;
            }
            if (i43 == 0) {
                str4 = str2;
            }
            if (i9 != 0) {
                uh1Var2 = null;
            }
            if (i12 != 0) {
                i36 = Integer.MAX_VALUE;
            } else {
                i36 = i13;
            }
            if (i15 != 0) {
                z4 = false;
            }
            c0187a = jt1.a.a;
            if (i17 != 0) {
                bj4VarO.K(-652118101);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new w05(2);
                    bj4VarO.C(objF3);
                }
                oh4Var3 = (oh4) objF3;
                bj4VarO.U(false);
            }
            if (i19 != 0) {
                i37 = 1;
            } else {
                i37 = i2;
            }
            if (i21 != 0) {
                i38 = 1;
            } else {
                i38 = i3;
            }
            if (i23 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            if (i26 != 0) {
                ci4Var2 = null;
            } else {
                ci4Var2 = ci4Var;
            }
            if (i29 != 0) {
                z6 = true;
            } else {
                z6 = z3;
            }
            if (i33 != 0) {
                f2 = Float.NaN;
            } else {
                f2 = f;
            }
            bj4VarO.K(-652108692);
            if (uh1Var2 == null) {
                jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
            } else {
                jB = uh1Var2.a;
            }
            objB = aa0.b(bj4VarO, false, -652103026);
            if (objB == c0187a) {
                objB = new jw0();
                bj4VarO.C(objB);
            }
            fw0Var = (fw0) objB;
            int i411111111111111111111111112 = i35;
            bj4VarO.U(false);
            objF = bj4VarO.f();
            if (objF == c0187a) {
                c33 c33Var1111113 = wd3.a;
                objF = m78.a(bj4VarO.x(), bj4VarO);
            }
            t72Var = (t72) objF;
            uh1 uh1Var1111116 = uh1Var2;
            String str1111119 = str3;
            int i411111111111111111111111113 = i7;
            ox6 ox6VarB1111111111115 = ir9.b(ir9.c(ox6.a.t, 1.0f), 0.0f, f2, 1);
            IntercomTheme intercomTheme1111113 = IntercomTheme.INSTANCE;
            int i411111111111111111111111114 = IntercomTheme.$stable;
            float f1111116 = f2;
            ox6 ox6VarA1111113 = kw0.a(uma.a(ns0.a(ox6VarB1111111111115, 1.0f, jB, intercomTheme1111113.getShapes(bj4VarO, i411111111111111111111111114).b), intercomTheme1111113.getShapes(bj4VarO, i411111111111111111111111114).b), fw0Var);
            bj4VarO.K(-652085201);
            zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
            objF2 = bj4VarO.f();
            if (zJ) {
                objF2 = new w62(1, t72Var, fw0Var);
                bj4VarO.C(objF2);
            } else {
                objF2 = new w62(1, t72Var, fw0Var);
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            ox6 ox6VarB1111111111116 = p84.b(ox6VarA1111113, (oh4) objF2);
            pda pdaVarD1111113 = xda.d((fi1) bj4VarO.F(hi1.a), (qja) bj4VarO.F(rja.a));
            long j1111114 = uh1.j;
            pda pdaVarA1111113 = pdaVarD1111113.a(((-14837) & 1) != 0 ? pdaVarD1111113.a : 0L, ((-14837) & 2) != 0 ? pdaVarD1111113.b : 0L, ((-14837) & 4) != 0 ? pdaVarD1111113.c : ac4.b(intercomTheme1111113, bj4VarO, i411111111111111111111111114), pdaVarD1111113.d, ((-14837) & 16) != 0 ? pdaVarD1111113.e : intercomTheme1111113.getColors(bj4VarO, i411111111111111111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 32) != 0 ? pdaVarD1111113.f : intercomTheme1111113.getColors(bj4VarO, i411111111111111111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 64) != 0 ? pdaVarD1111113.g : intercomTheme1111113.getColors(bj4VarO, i411111111111111111111111114).m757getBubbleBackground0d7_KjU(), ((-14837) & 128) != 0 ? pdaVarD1111113.h : intercomTheme1111113.getColors(bj4VarO, i411111111111111111111111114).m768getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? pdaVarD1111113.i : j, pdaVarD1111113.j, ((-14837) & 1024) != 0 ? pdaVarD1111113.k : null, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVarD1111113.l : j1111114, ((-14837) & 4096) != 0 ? pdaVarD1111113.m : j1111114, ((-14837) & 8192) != 0 ? pdaVarD1111113.n : j1111114, pdaVarD1111113.o, pdaVarD1111113.p, pdaVarD1111113.q, pdaVarD1111113.r, pdaVarD1111113.s, pdaVarD1111113.t, pdaVarD1111113.u, pdaVarD1111113.v, pdaVarD1111113.w, pdaVarD1111113.x, pdaVarD1111113.y, pdaVarD1111113.z, pdaVarD1111113.A, pdaVarD1111113.B, pdaVarD1111113.C, pdaVarD1111113.D, pdaVarD1111113.E, pdaVarD1111113.F, pdaVarD1111113.G, pdaVarD1111113.H, pdaVarD1111113.I, pdaVarD1111113.J, pdaVarD1111113.K, pdaVarD1111113.L, pdaVarD1111113.M, pdaVarD1111113.N, pdaVarD1111113.O, pdaVarD1111113.P, pdaVarD1111113.Q);
            dp5 dp5Var1111113 = new dp5(i37, i38, 115);
            boolean z11111111111111111116 = z4;
            bp5 bp5Var1111113 = new bp5(oh4Var3, null, 59);
            b72 b72Var1111113 = intercomTheme1111113.getShapes(bj4VarO, i411111111111111111111111114).b;
            final boolean z11111111111111111117 = z5;
            int i411111111111111111111111115 = i37;
            ci4<? super jt1, ? super Integer, g2b> ci4Var1111116 = ci4Var2;
            bj4Var = bj4VarO;
            boolean z11111111111111111118 = z6;
            ifa.a(str1111119, oh4Var, ox6VarB1111111111116, z11111111111111111118, intercomTheme1111113.getTypography(bj4VarO, i411111111111111111111111114).getType04(), gr1.b(-712506390, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                public final void invoke(jt1 jt1Var2, int i411111111111111111111111116) {
                    if ((i411111111111111111111111116 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), ci4Var1111116, gr1.b(583948524, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                public final void invoke(jt1 jt1Var2, int i411111111111111111111111116) {
                    if ((i411111111111111111111111116 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else if (z11111111111111111117) {
                        m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, jt1Var2, 0), "Looks good!", ir9.j(eo7.i(ox6.a.t, 16.0f), 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m753getActive0d7_KjU(), jt1Var2, 440, 0);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, dp5Var1111113, bp5Var1111113, z11111111111111111116, i36, 0, b72Var1111113, pdaVarA1111113, bj4Var, ((i411111111111111111111111112 << 3) & 7168) | (i411111111111111111111111113 & 14) | 817889280 | ((i411111111111111111111111113 >> 3) & 112) | ((i411111111111111111111111112 << 21) & 234881024), (29360128 & (i411111111111111111111111113 << 3)) | ((i411111111111111111111111113 << 9) & 234881024), 1604688);
            oh4Var4 = oh4Var3;
            uh1Var3 = uh1Var1111116;
            z7 = z11111111111111111118;
            ci4Var3 = ci4Var1111116;
            z8 = z11111111111111111116;
            i39 = i36;
            i40 = i38;
            z9 = z11111111111111111117;
            f3 = f1111116;
            str5 = str4;
            i41 = i411111111111111111111111115;
            str6 = str1111119;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: vha
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$5(str6, str5, oh4Var, uh1Var3, j, i39, z8, oh4Var4, i41, i40, z9, ci4Var3, z7, f3, i4, i5, i6, (jt1) obj, iIntValue);
                }
            };
        }
    }

    public static final void TextInputPillDisabled(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1100722979);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextInputPillKt.INSTANCE.m506getLambda5$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new u05(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextInputPillDisabled$lambda$10(int i, jt1 jt1Var, int i2) {
        TextInputPillDisabled(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void TextInputPillError(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-175520743);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextInputPillKt.INSTANCE.m505getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new t05(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextInputPillError$lambda$9(int i, jt1 jt1Var, int i2) {
        TextInputPillError(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void TextInputPillPlaceholder(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1437391364);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextInputPillKt.INSTANCE.m502getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: wha
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextInputPillKt.TextInputPillPlaceholder$lambda$6(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextInputPillPlaceholder$lambda$6(int i, jt1 jt1Var, int i2) {
        TextInputPillPlaceholder(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void TextInputPillUnchecked(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-869352961);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextInputPillKt.INSTANCE.m503getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: tha
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextInputPillKt.TextInputPillUnchecked$lambda$7(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextInputPillUnchecked$lambda$7(int i, jt1 jt1Var, int i2) {
        TextInputPillUnchecked(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void TextInputPillValidated(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(559292703);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextInputPillKt.INSTANCE.m504getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: uha
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextInputPillKt.TextInputPillValidated$lambda$8(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextInputPillValidated$lambda$8(int i, jt1 jt1Var, int i2) {
        TextInputPillValidated(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextInputPill_g5ZjG94$lambda$1$lambda$0(ap5 ap5Var) {
        ap5Var.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextInputPill_g5ZjG94$lambda$4$lambda$3(t72 t72Var, fw0 fw0Var, v94 v94Var) {
        v94Var.getClass();
        if (v94Var.e()) {
            oy0.d(t72Var, null, null, new TextInputPillKt$TextInputPill$2$1$1(fw0Var, null), 3);
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextInputPill_g5ZjG94$lambda$5(String str, String str2, oh4 oh4Var, uh1 uh1Var, long j, int i, boolean z, oh4 oh4Var2, int i2, int i3, boolean z2, ci4 ci4Var, boolean z3, float f, int i4, int i5, int i6, jt1 jt1Var, int i7) {
        m507TextInputPillg5ZjG94(str, str2, oh4Var, uh1Var, j, i, z, oh4Var2, i2, i3, z2, ci4Var, z3, f, jt1Var, gz3.s(i4 | 1), gz3.s(i5), i6);
        return g2b.a;
    }
}
