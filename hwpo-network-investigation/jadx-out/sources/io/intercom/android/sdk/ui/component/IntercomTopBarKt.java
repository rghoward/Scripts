package io.intercom.android.sdk.ui.component;

import defpackage.aj1;
import defpackage.al8;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h65;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.kg0;
import defpackage.kv0;
import defpackage.kw7;
import defpackage.l02;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nq3;
import defpackage.ny8;
import defpackage.ox6;
import defpackage.oy8;
import defpackage.py8;
import defpackage.qi5;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.ri5;
import defpackage.sp0;
import defpackage.w20;
import defpackage.wb4;
import defpackage.we1;
import defpackage.wja;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.yi1;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomTopBarKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomTopBarKt {
    /* JADX WARN: Code duplicated, block: B:106:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x015b  */
    /* JADX WARN: Code duplicated, block: B:108:0x015e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0162  */
    /* JADX WARN: Code duplicated, block: B:112:0x0165  */
    /* JADX WARN: Code duplicated, block: B:114:0x0168  */
    /* JADX WARN: Code duplicated, block: B:117:0x016d  */
    /* JADX WARN: Code duplicated, block: B:118:0x017a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0180  */
    /* JADX WARN: Code duplicated, block: B:122:0x018d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0191  */
    /* JADX WARN: Code duplicated, block: B:126:0x019d  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:130:0x01af  */
    /* JADX WARN: Code duplicated, block: B:132:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:137:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:138:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:141:0x024d  */
    /* JADX WARN: Code duplicated, block: B:142:0x024f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0256 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x025b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0287  */
    /* JADX WARN: Code duplicated, block: B:153:0x028e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0292  */
    /* JADX WARN: Code duplicated, block: B:157:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:160:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:163:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:165:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:166:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:169:0x0311  */
    /* JADX WARN: Code duplicated, block: B:171:0x037a  */
    /* JADX WARN: Code duplicated, block: B:174:0x0396  */
    /* JADX WARN: Code duplicated, block: B:176:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:179:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:181:0x040a  */
    /* JADX WARN: Code duplicated, block: B:183:0x0413  */
    /* JADX WARN: Code duplicated, block: B:184:0x0417  */
    /* JADX WARN: Code duplicated, block: B:187:0x043b  */
    /* JADX WARN: Code duplicated, block: B:189:0x043f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0467  */
    /* JADX WARN: Code duplicated, block: B:195:0x0473  */
    /* JADX WARN: Code duplicated, block: B:197:0x0478  */
    /* JADX WARN: Code duplicated, block: B:199:0x047d  */
    /* JADX WARN: Code duplicated, block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x0104  */
    /* JADX WARN: Code duplicated, block: B:94:0x011c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0133  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v20 */
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
    /* JADX INFO: renamed from: IntercomTopBar-bogVsAg, reason: not valid java name */
    public static final void m589IntercomTopBarbogVsAg(ox6 ox6Var, String str, IntercomTopBarIcon intercomTopBarIcon, di.b bVar, long j, long j2, mh4<g2b> mh4Var, ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        String str2;
        int i4;
        IntercomTopBarIcon intercomTopBarIcon2;
        int i5;
        int i6;
        di.b bVar2;
        int i7;
        long j3;
        long j4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ox6.a aVar;
        Object obj;
        sp0.a aVar2;
        ox6 ox6Var2;
        long jM767getHeader0d7_KjU;
        final long jM771getOnHeader0d7_KjU;
        mh4<g2b> mh4Var2;
        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var2;
        String str3;
        long j5;
        Object objF;
        aj1 aj1VarA;
        ox6 ox6Var3;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar3;
        bt1.a.c cVar;
        bt1.a.e eVar;
        bt1.a.b bVar3;
        bt1.a.C0034a c0034a;
        bt1.a.d dVar;
        final IntercomTopBarIcon intercomTopBarIcon3;
        long j6;
        boolean z;
        Object objF2;
        boolean z2;
        fl6 fl6VarD;
        mh4<g2b> mh4Var3;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        float f;
        int i13;
        aj1 aj1VarA2;
        int iHashCode3;
        kw7 kw7VarP3;
        ox6 ox6VarC3;
        ox6 ox6Var4;
        bj4 bj4Var;
        int i14;
        kv0 kv0Var;
        int i15;
        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var3;
        ?? r1;
        final mh4<g2b> mh4Var4;
        final ox6 ox6Var5;
        final ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var4;
        final String str4;
        final di.b bVar4;
        final long j7;
        final IntercomTopBarIcon intercomTopBarIcon4;
        final long j8;
        ny8 ny8VarA;
        int iHashCode4;
        kw7 kw7VarP4;
        ox6 ox6VarC4;
        bj4 bj4Var2;
        xj8 xj8VarW;
        int i16;
        bj4 bj4VarO = jt1Var.o(832461575);
        j1b j1bVar = bj4VarO.a;
        int i17 = i2 & 1;
        if (i17 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i18 = i2 & 2;
        if (i18 == 0) {
            if ((i & 48) == 0) {
                str2 = str;
                i3 |= bj4VarO.J(str2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    intercomTopBarIcon2 = intercomTopBarIcon;
                    if (bj4VarO.J(intercomTopBarIcon2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        bVar2 = bVar;
                        if (bj4VarO.J(bVar2)) {
                            i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) == 0) {
                        if ((i2 & 16) == 0) {
                            j3 = j;
                            int i19 = bj4VarO.i(j3) ? 16384 : 8192;
                            i3 |= i19;
                        } else {
                            j3 = j;
                        }
                        i3 |= i19;
                    } else {
                        j3 = j;
                    }
                    if ((i & 196608) == 0) {
                        j4 = j2;
                        if ((i2 & 32) == 0 || !bj4VarO.i(j4)) {
                            i16 = 65536;
                        } else {
                            i16 = 131072;
                        }
                        i3 |= i16;
                    } else {
                        j4 = j2;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (bj4VarO.j(mh4Var)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        if ((i & 12582912) == 0) {
                            if (bj4VarO.j(ei4Var)) {
                                i11 = 8388608;
                            } else {
                                i11 = 4194304;
                            }
                            i3 |= i11;
                        }
                        if ((i3 & 4793491) == 4793490 || !bj4VarO.r()) {
                            bj4VarO.v0();
                            i12 = i & 1;
                            aVar = ox6.a.t;
                            obj = jt1.a.a;
                            aVar2 = di.a.m;
                            if (i12 != 0 || bj4VarO.c0()) {
                                if (i17 != 0) {
                                    ox6Var2 = aVar;
                                } else {
                                    ox6Var2 = ox6Var;
                                }
                                if (i18 != 0) {
                                    str2 = null;
                                }
                                if (i4 != 0) {
                                    intercomTopBarIcon2 = null;
                                }
                                if (i6 != 0) {
                                    bVar2 = aVar2;
                                }
                                if ((i2 & 16) != 0) {
                                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                                    i3 &= -57345;
                                } else {
                                    jM767getHeader0d7_KjU = j;
                                }
                                if ((i2 & 32) != 0) {
                                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                                    i3 &= -458753;
                                } else {
                                    jM771getOnHeader0d7_KjU = j2;
                                }
                                if (i8 != 0) {
                                    bj4VarO.K(-883388004);
                                    objF = bj4VarO.f();
                                    if (objF == obj) {
                                        objF = new qi5();
                                        bj4VarO.C(objF);
                                    }
                                    mh4Var2 = (mh4) objF;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var2 = mh4Var;
                                }
                                if (i10 != 0) {
                                    ei4Var2 = null;
                                } else {
                                    ei4Var2 = ei4Var;
                                }
                                str3 = str2;
                                j5 = jM767getHeader0d7_KjU;
                            } else {
                                bj4VarO.u();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                jM771getOnHeader0d7_KjU = j2;
                                mh4Var2 = mh4Var;
                                ei4Var2 = ei4Var;
                                i3 = i3;
                                bVar2 = bVar2;
                                ox6Var2 = ox6Var;
                                str3 = str2;
                                j5 = j;
                            }
                            bj4VarO.V();
                            aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                            ox6Var3 = ox6Var2;
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, aVar);
                            bt1.c.getClass();
                            aVar3 = bt1.a.b;
                            if (j1bVar == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar3);
                            } else {
                                bj4VarO.z();
                            }
                            cVar = bt1.a.f;
                            rd7.d(bj4VarO, cVar, aj1VarA);
                            eVar = bt1.a.e;
                            rd7.d(bj4VarO, eVar, kw7VarP);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            bVar3 = bt1.a.g;
                            rd7.d(bj4VarO, bVar3, numValueOf);
                            c0034a = bt1.a.h;
                            rd7.c(bj4VarO, c0034a);
                            dVar = bt1.a.d;
                            rd7.d(bj4VarO, dVar, ox6VarC);
                            intercomTopBarIcon3 = intercomTopBarIcon2;
                            j6 = j5;
                            ox6 ox6VarK = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                            bj4VarO.K(86796077);
                            if ((i3 & 3670016) == 1048576) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objF2 = bj4VarO.f();
                            if (!z || objF2 == obj) {
                                z2 = false;
                                objF2 = new ri5(false ? 1 : 0, mh4Var2);
                                bj4VarO.C(objF2);
                            } else {
                                z2 = false;
                            }
                            bj4VarO.U(z2);
                            ox6 ox6VarC5 = we1.c(ox6VarK, z2, null, (mh4) objF2, 15);
                            fl6VarD = dv0.d(di.a.a, z2);
                            mh4Var3 = mh4Var2;
                            iHashCode2 = Long.hashCode(bj4VarO.T);
                            kw7VarP2 = bj4VarO.P();
                            ox6VarC2 = it1.c(bj4VarO, ox6VarC5);
                            if (j1bVar == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar3);
                            } else {
                                bj4VarO.z();
                            }
                            rd7.d(bj4VarO, cVar, fl6VarD);
                            rd7.d(bj4VarO, eVar, kw7VarP2);
                            l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                            rd7.d(bj4VarO, dVar, ox6VarC2);
                            if (intercomTopBarIcon3 != null || xj5.a(bVar2, di.a.n)) {
                                f = 16.0f;
                            } else {
                                f = 64.0f;
                            }
                            ox6 ox6VarM = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                            i13 = i3 >> 3;
                            aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                            iHashCode3 = Long.hashCode(bj4VarO.T);
                            kw7VarP3 = bj4VarO.P();
                            ox6VarC3 = it1.c(bj4VarO, ox6VarM);
                            if (j1bVar == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar3);
                            } else {
                                bj4VarO.z();
                            }
                            rd7.d(bj4VarO, cVar, aj1VarA2);
                            rd7.d(bj4VarO, eVar, kw7VarP3);
                            l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                            rd7.d(bj4VarO, dVar, ox6VarC3);
                            bj4VarO.K(560412879);
                            if (str3 != null) {
                                i14 = 6;
                                ox6Var4 = null;
                                mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                                bj4Var = bj4VarO;
                            } else {
                                ox6Var4 = null;
                                bj4Var = bj4VarO;
                                i14 = 6;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.K(-1319827237);
                            kv0Var = kv0.a;
                            i15 = i14;
                            if (intercomTopBarIcon3 != null) {
                                h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                    public final void invoke(jt1 jt1Var2, int i20) {
                                        if ((i20 & 3) == 2 && jt1Var2.r()) {
                                            jt1Var2.u();
                                        } else {
                                            m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                                        }
                                    }

                                    @Override // defpackage.ci4
                                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                        invoke(jt1Var2, num.intValue());
                                        return g2b.a;
                                    }
                                }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                            }
                            bj4Var.U(false);
                            bj4Var.K(-1319809649);
                            ei4Var3 = ei4Var2;
                            if (ei4Var3 != null) {
                                ox6 ox6VarF = kv0Var.f(ir9.r(ir9.b), di.a.f);
                                ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                                iHashCode4 = Long.hashCode(bj4Var.T);
                                kw7VarP4 = bj4Var.P();
                                ox6VarC4 = it1.c(bj4Var, ox6VarF);
                                if (j1bVar == null) {
                                    ml5.c();
                                    throw ox6Var4;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar3);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, ny8VarA);
                                rd7.d(bj4Var, eVar, kw7VarP4);
                                l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC4);
                                ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                                r1 = 1;
                                bj4Var.U(true);
                            } else {
                                r1 = 1;
                            }
                            bj4Var.U(false);
                            bj4Var.U(r1);
                            IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                            bj4Var.U(r1);
                            mh4Var4 = mh4Var3;
                            ox6Var5 = ox6Var3;
                            ei4Var4 = ei4Var3;
                            str4 = str3;
                            bVar4 = bVar2;
                            j7 = jM771getOnHeader0d7_KjU;
                            intercomTopBarIcon4 = intercomTopBarIcon3;
                            j8 = j6;
                            bj4Var2 = bj4Var;
                        } else {
                            bj4VarO.u();
                            ox6Var5 = ox6Var;
                            ei4Var4 = ei4Var;
                            str4 = str2;
                            j8 = j3;
                            j7 = j4;
                            intercomTopBarIcon4 = intercomTopBarIcon2;
                            bVar4 = bVar2;
                            mh4Var4 = mh4Var;
                            bj4Var2 = bj4VarO;
                        }
                        xj8VarW = bj4Var2.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: si5
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj2, Object obj3) {
                                    int iIntValue = ((Integer) obj3).intValue();
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$8(ox6Var5, str4, intercomTopBarIcon4, bVar4, j8, j7, mh4Var4, ei4Var4, i, i2, (jt1) obj2, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 12582912;
                    if ((i3 & 4793491) == 4793490) {
                        bj4VarO.v0();
                        i12 = i & 1;
                        aVar = ox6.a.t;
                        obj = jt1.a.a;
                        aVar2 = di.a.m;
                        if (i12 != 0) {
                            if (i17 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var;
                            }
                            if (i18 != 0) {
                                str2 = null;
                            }
                            if (i4 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i6 != 0) {
                                bVar2 = aVar2;
                            }
                            if ((i2 & 16) != 0) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                                i3 &= -57345;
                            } else {
                                jM767getHeader0d7_KjU = j;
                            }
                            if ((i2 & 32) != 0) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                                i3 &= -458753;
                            } else {
                                jM771getOnHeader0d7_KjU = j2;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-883388004);
                                objF = bj4VarO.f();
                                if (objF == obj) {
                                    objF = new qi5();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if (i10 != 0) {
                                ei4Var2 = null;
                            } else {
                                ei4Var2 = ei4Var;
                            }
                            str3 = str2;
                            j5 = jM767getHeader0d7_KjU;
                        } else {
                            if (i17 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var;
                            }
                            if (i18 != 0) {
                                str2 = null;
                            }
                            if (i4 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i6 != 0) {
                                bVar2 = aVar2;
                            }
                            if ((i2 & 16) != 0) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                                i3 &= -57345;
                            } else {
                                jM767getHeader0d7_KjU = j;
                            }
                            if ((i2 & 32) != 0) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                                i3 &= -458753;
                            } else {
                                jM771getOnHeader0d7_KjU = j2;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-883388004);
                                objF = bj4VarO.f();
                                if (objF == obj) {
                                    objF = new qi5();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if (i10 != 0) {
                                ei4Var2 = null;
                            } else {
                                ei4Var2 = ei4Var;
                            }
                            str3 = str2;
                            j5 = jM767getHeader0d7_KjU;
                        }
                        bj4VarO.V();
                        aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                        ox6Var3 = ox6Var2;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, aVar);
                        bt1.c.getClass();
                        aVar3 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        cVar = bt1.a.f;
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        eVar = bt1.a.e;
                        rd7.d(bj4VarO, eVar, kw7VarP);
                        Integer numValueOf2 = Integer.valueOf(iHashCode);
                        bVar3 = bt1.a.g;
                        rd7.d(bj4VarO, bVar3, numValueOf2);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        intercomTopBarIcon3 = intercomTopBarIcon2;
                        j6 = j5;
                        ox6 ox6VarK2 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                        bj4VarO.K(86796077);
                        if ((i3 & 3670016) == 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF2 = bj4VarO.f();
                        if (z) {
                            z2 = false;
                            objF2 = new ri5(false ? 1 : 0, mh4Var2);
                            bj4VarO.C(objF2);
                        } else {
                            z2 = false;
                            objF2 = new ri5(false ? 1 : 0, mh4Var2);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(z2);
                        ox6 ox6VarC6 = we1.c(ox6VarK2, z2, null, (mh4) objF2, 15);
                        fl6VarD = dv0.d(di.a.a, z2);
                        mh4Var3 = mh4Var2;
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, ox6VarC6);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, fl6VarD);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        if (intercomTopBarIcon3 != null) {
                            f = 16.0f;
                        } else {
                            f = 16.0f;
                        }
                        ox6 ox6VarM2 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                        i13 = i3 >> 3;
                        aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                        iHashCode3 = Long.hashCode(bj4VarO.T);
                        kw7VarP3 = bj4VarO.P();
                        ox6VarC3 = it1.c(bj4VarO, ox6VarM2);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA2);
                        rd7.d(bj4VarO, eVar, kw7VarP3);
                        l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC3);
                        bj4VarO.K(560412879);
                        if (str3 != null) {
                            i14 = 6;
                            ox6Var4 = null;
                            mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                            bj4Var = bj4VarO;
                        } else {
                            ox6Var4 = null;
                            bj4Var = bj4VarO;
                            i14 = 6;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.K(-1319827237);
                        kv0Var = kv0.a;
                        i15 = i14;
                        if (intercomTopBarIcon3 != null) {
                            h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                public final void invoke(jt1 jt1Var2, int i20) {
                                    if ((i20 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else {
                                        m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                        }
                        bj4Var.U(false);
                        bj4Var.K(-1319809649);
                        ei4Var3 = ei4Var2;
                        if (ei4Var3 != null) {
                            ox6 ox6VarF2 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                            ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, ox6VarF2);
                            if (j1bVar == null) {
                                ml5.c();
                                throw ox6Var4;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar3);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                            r1 = 1;
                            bj4Var.U(true);
                        } else {
                            r1 = 1;
                        }
                        bj4Var.U(false);
                        bj4Var.U(r1);
                        IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                        bj4Var.U(r1);
                        mh4Var4 = mh4Var3;
                        ox6Var5 = ox6Var3;
                        ei4Var4 = ei4Var3;
                        str4 = str3;
                        bVar4 = bVar2;
                        j7 = jM771getOnHeader0d7_KjU;
                        intercomTopBarIcon4 = intercomTopBarIcon3;
                        j8 = j6;
                        bj4Var2 = bj4Var;
                    } else {
                        bj4VarO.v0();
                        i12 = i & 1;
                        aVar = ox6.a.t;
                        obj = jt1.a.a;
                        aVar2 = di.a.m;
                        if (i12 != 0) {
                            if (i17 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var;
                            }
                            if (i18 != 0) {
                                str2 = null;
                            }
                            if (i4 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i6 != 0) {
                                bVar2 = aVar2;
                            }
                            if ((i2 & 16) != 0) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                                i3 &= -57345;
                            } else {
                                jM767getHeader0d7_KjU = j;
                            }
                            if ((i2 & 32) != 0) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                                i3 &= -458753;
                            } else {
                                jM771getOnHeader0d7_KjU = j2;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-883388004);
                                objF = bj4VarO.f();
                                if (objF == obj) {
                                    objF = new qi5();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if (i10 != 0) {
                                ei4Var2 = null;
                            } else {
                                ei4Var2 = ei4Var;
                            }
                            str3 = str2;
                            j5 = jM767getHeader0d7_KjU;
                        } else {
                            if (i17 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var;
                            }
                            if (i18 != 0) {
                                str2 = null;
                            }
                            if (i4 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i6 != 0) {
                                bVar2 = aVar2;
                            }
                            if ((i2 & 16) != 0) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                                i3 &= -57345;
                            } else {
                                jM767getHeader0d7_KjU = j;
                            }
                            if ((i2 & 32) != 0) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                                i3 &= -458753;
                            } else {
                                jM771getOnHeader0d7_KjU = j2;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-883388004);
                                objF = bj4VarO.f();
                                if (objF == obj) {
                                    objF = new qi5();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if (i10 != 0) {
                                ei4Var2 = null;
                            } else {
                                ei4Var2 = ei4Var;
                            }
                            str3 = str2;
                            j5 = jM767getHeader0d7_KjU;
                        }
                        bj4VarO.V();
                        aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                        ox6Var3 = ox6Var2;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, aVar);
                        bt1.c.getClass();
                        aVar3 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        cVar = bt1.a.f;
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        eVar = bt1.a.e;
                        rd7.d(bj4VarO, eVar, kw7VarP);
                        Integer numValueOf3 = Integer.valueOf(iHashCode);
                        bVar3 = bt1.a.g;
                        rd7.d(bj4VarO, bVar3, numValueOf3);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        intercomTopBarIcon3 = intercomTopBarIcon2;
                        j6 = j5;
                        ox6 ox6VarK3 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                        bj4VarO.K(86796077);
                        if ((i3 & 3670016) == 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF2 = bj4VarO.f();
                        if (z) {
                            z2 = false;
                            objF2 = new ri5(false ? 1 : 0, mh4Var2);
                            bj4VarO.C(objF2);
                        } else {
                            z2 = false;
                            objF2 = new ri5(false ? 1 : 0, mh4Var2);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(z2);
                        ox6 ox6VarC7 = we1.c(ox6VarK3, z2, null, (mh4) objF2, 15);
                        fl6VarD = dv0.d(di.a.a, z2);
                        mh4Var3 = mh4Var2;
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, ox6VarC7);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, fl6VarD);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        if (intercomTopBarIcon3 != null) {
                            f = 16.0f;
                        } else {
                            f = 16.0f;
                        }
                        ox6 ox6VarM3 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                        i13 = i3 >> 3;
                        aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                        iHashCode3 = Long.hashCode(bj4VarO.T);
                        kw7VarP3 = bj4VarO.P();
                        ox6VarC3 = it1.c(bj4VarO, ox6VarM3);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA2);
                        rd7.d(bj4VarO, eVar, kw7VarP3);
                        l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC3);
                        bj4VarO.K(560412879);
                        if (str3 != null) {
                            i14 = 6;
                            ox6Var4 = null;
                            mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                            bj4Var = bj4VarO;
                        } else {
                            ox6Var4 = null;
                            bj4Var = bj4VarO;
                            i14 = 6;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.K(-1319827237);
                        kv0Var = kv0.a;
                        i15 = i14;
                        if (intercomTopBarIcon3 != null) {
                            h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                public final void invoke(jt1 jt1Var2, int i20) {
                                    if ((i20 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else {
                                        m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                        }
                        bj4Var.U(false);
                        bj4Var.K(-1319809649);
                        ei4Var3 = ei4Var2;
                        if (ei4Var3 != null) {
                            ox6 ox6VarF3 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                            ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, ox6VarF3);
                            if (j1bVar == null) {
                                ml5.c();
                                throw ox6Var4;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar3);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                            r1 = 1;
                            bj4Var.U(true);
                        } else {
                            r1 = 1;
                        }
                        bj4Var.U(false);
                        bj4Var.U(r1);
                        IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                        bj4Var.U(r1);
                        mh4Var4 = mh4Var3;
                        ox6Var5 = ox6Var3;
                        ei4Var4 = ei4Var3;
                        str4 = str3;
                        bVar4 = bVar2;
                        j7 = jM771getOnHeader0d7_KjU;
                        intercomTopBarIcon4 = intercomTopBarIcon3;
                        j8 = j6;
                        bj4Var2 = bj4Var;
                    }
                    xj8VarW = bj4Var2.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: si5
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$8(ox6Var5, str4, intercomTopBarIcon4, bVar4, j8, j7, mh4Var4, ei4Var4, i, i2, (jt1) obj2, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 3072;
                bVar2 = bVar;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j3 = j;
                        if (bj4VarO.i(j3)) {
                        }
                        i3 |= i19;
                    } else {
                        j3 = j;
                    }
                    i3 |= i19;
                } else {
                    j3 = j;
                }
                if ((i & 196608) == 0) {
                    j4 = j2;
                    if ((i2 & 32) == 0) {
                        i16 = 65536;
                    } else {
                        i16 = 65536;
                    }
                    i3 |= i16;
                } else {
                    j4 = j2;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (bj4VarO.j(mh4Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    if ((i & 12582912) == 0) {
                        if (bj4VarO.j(ei4Var)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        bj4VarO.v0();
                        i12 = i & 1;
                        aVar = ox6.a.t;
                        obj = jt1.a.a;
                        aVar2 = di.a.m;
                        if (i12 != 0) {
                            if (i17 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var;
                            }
                            if (i18 != 0) {
                                str2 = null;
                            }
                            if (i4 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i6 != 0) {
                                bVar2 = aVar2;
                            }
                            if ((i2 & 16) != 0) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                                i3 &= -57345;
                            } else {
                                jM767getHeader0d7_KjU = j;
                            }
                            if ((i2 & 32) != 0) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                                i3 &= -458753;
                            } else {
                                jM771getOnHeader0d7_KjU = j2;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-883388004);
                                objF = bj4VarO.f();
                                if (objF == obj) {
                                    objF = new qi5();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if (i10 != 0) {
                                ei4Var2 = null;
                            } else {
                                ei4Var2 = ei4Var;
                            }
                            str3 = str2;
                            j5 = jM767getHeader0d7_KjU;
                        } else {
                            if (i17 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var;
                            }
                            if (i18 != 0) {
                                str2 = null;
                            }
                            if (i4 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i6 != 0) {
                                bVar2 = aVar2;
                            }
                            if ((i2 & 16) != 0) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                                i3 &= -57345;
                            } else {
                                jM767getHeader0d7_KjU = j;
                            }
                            if ((i2 & 32) != 0) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                                i3 &= -458753;
                            } else {
                                jM771getOnHeader0d7_KjU = j2;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-883388004);
                                objF = bj4VarO.f();
                                if (objF == obj) {
                                    objF = new qi5();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if (i10 != 0) {
                                ei4Var2 = null;
                            } else {
                                ei4Var2 = ei4Var;
                            }
                            str3 = str2;
                            j5 = jM767getHeader0d7_KjU;
                        }
                        bj4VarO.V();
                        aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                        ox6Var3 = ox6Var2;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, aVar);
                        bt1.c.getClass();
                        aVar3 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        cVar = bt1.a.f;
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        eVar = bt1.a.e;
                        rd7.d(bj4VarO, eVar, kw7VarP);
                        Integer numValueOf4 = Integer.valueOf(iHashCode);
                        bVar3 = bt1.a.g;
                        rd7.d(bj4VarO, bVar3, numValueOf4);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        intercomTopBarIcon3 = intercomTopBarIcon2;
                        j6 = j5;
                        ox6 ox6VarK4 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                        bj4VarO.K(86796077);
                        if ((i3 & 3670016) == 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF2 = bj4VarO.f();
                        if (z) {
                            z2 = false;
                            objF2 = new ri5(false ? 1 : 0, mh4Var2);
                            bj4VarO.C(objF2);
                        } else {
                            z2 = false;
                            objF2 = new ri5(false ? 1 : 0, mh4Var2);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(z2);
                        ox6 ox6VarC8 = we1.c(ox6VarK4, z2, null, (mh4) objF2, 15);
                        fl6VarD = dv0.d(di.a.a, z2);
                        mh4Var3 = mh4Var2;
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, ox6VarC8);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, fl6VarD);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        if (intercomTopBarIcon3 != null) {
                            f = 16.0f;
                        } else {
                            f = 16.0f;
                        }
                        ox6 ox6VarM4 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                        i13 = i3 >> 3;
                        aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                        iHashCode3 = Long.hashCode(bj4VarO.T);
                        kw7VarP3 = bj4VarO.P();
                        ox6VarC3 = it1.c(bj4VarO, ox6VarM4);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA2);
                        rd7.d(bj4VarO, eVar, kw7VarP3);
                        l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC3);
                        bj4VarO.K(560412879);
                        if (str3 != null) {
                            i14 = 6;
                            ox6Var4 = null;
                            mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                            bj4Var = bj4VarO;
                        } else {
                            ox6Var4 = null;
                            bj4Var = bj4VarO;
                            i14 = 6;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.K(-1319827237);
                        kv0Var = kv0.a;
                        i15 = i14;
                        if (intercomTopBarIcon3 != null) {
                            h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                public final void invoke(jt1 jt1Var2, int i20) {
                                    if ((i20 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else {
                                        m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                        }
                        bj4Var.U(false);
                        bj4Var.K(-1319809649);
                        ei4Var3 = ei4Var2;
                        if (ei4Var3 != null) {
                            ox6 ox6VarF4 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                            ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, ox6VarF4);
                            if (j1bVar == null) {
                                ml5.c();
                                throw ox6Var4;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar3);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                            r1 = 1;
                            bj4Var.U(true);
                        } else {
                            r1 = 1;
                        }
                        bj4Var.U(false);
                        bj4Var.U(r1);
                        IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                        bj4Var.U(r1);
                        mh4Var4 = mh4Var3;
                        ox6Var5 = ox6Var3;
                        ei4Var4 = ei4Var3;
                        str4 = str3;
                        bVar4 = bVar2;
                        j7 = jM771getOnHeader0d7_KjU;
                        intercomTopBarIcon4 = intercomTopBarIcon3;
                        j8 = j6;
                        bj4Var2 = bj4Var;
                    } else {
                        bj4VarO.v0();
                        i12 = i & 1;
                        aVar = ox6.a.t;
                        obj = jt1.a.a;
                        aVar2 = di.a.m;
                        if (i12 != 0) {
                            if (i17 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var;
                            }
                            if (i18 != 0) {
                                str2 = null;
                            }
                            if (i4 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i6 != 0) {
                                bVar2 = aVar2;
                            }
                            if ((i2 & 16) != 0) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                                i3 &= -57345;
                            } else {
                                jM767getHeader0d7_KjU = j;
                            }
                            if ((i2 & 32) != 0) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                                i3 &= -458753;
                            } else {
                                jM771getOnHeader0d7_KjU = j2;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-883388004);
                                objF = bj4VarO.f();
                                if (objF == obj) {
                                    objF = new qi5();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if (i10 != 0) {
                                ei4Var2 = null;
                            } else {
                                ei4Var2 = ei4Var;
                            }
                            str3 = str2;
                            j5 = jM767getHeader0d7_KjU;
                        } else {
                            if (i17 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var;
                            }
                            if (i18 != 0) {
                                str2 = null;
                            }
                            if (i4 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i6 != 0) {
                                bVar2 = aVar2;
                            }
                            if ((i2 & 16) != 0) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                                i3 &= -57345;
                            } else {
                                jM767getHeader0d7_KjU = j;
                            }
                            if ((i2 & 32) != 0) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                                i3 &= -458753;
                            } else {
                                jM771getOnHeader0d7_KjU = j2;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-883388004);
                                objF = bj4VarO.f();
                                if (objF == obj) {
                                    objF = new qi5();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if (i10 != 0) {
                                ei4Var2 = null;
                            } else {
                                ei4Var2 = ei4Var;
                            }
                            str3 = str2;
                            j5 = jM767getHeader0d7_KjU;
                        }
                        bj4VarO.V();
                        aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                        ox6Var3 = ox6Var2;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, aVar);
                        bt1.c.getClass();
                        aVar3 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        cVar = bt1.a.f;
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        eVar = bt1.a.e;
                        rd7.d(bj4VarO, eVar, kw7VarP);
                        Integer numValueOf5 = Integer.valueOf(iHashCode);
                        bVar3 = bt1.a.g;
                        rd7.d(bj4VarO, bVar3, numValueOf5);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        intercomTopBarIcon3 = intercomTopBarIcon2;
                        j6 = j5;
                        ox6 ox6VarK5 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                        bj4VarO.K(86796077);
                        if ((i3 & 3670016) == 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF2 = bj4VarO.f();
                        if (z) {
                            z2 = false;
                            objF2 = new ri5(false ? 1 : 0, mh4Var2);
                            bj4VarO.C(objF2);
                        } else {
                            z2 = false;
                            objF2 = new ri5(false ? 1 : 0, mh4Var2);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(z2);
                        ox6 ox6VarC9 = we1.c(ox6VarK5, z2, null, (mh4) objF2, 15);
                        fl6VarD = dv0.d(di.a.a, z2);
                        mh4Var3 = mh4Var2;
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, ox6VarC9);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, fl6VarD);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        if (intercomTopBarIcon3 != null) {
                            f = 16.0f;
                        } else {
                            f = 16.0f;
                        }
                        ox6 ox6VarM5 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                        i13 = i3 >> 3;
                        aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                        iHashCode3 = Long.hashCode(bj4VarO.T);
                        kw7VarP3 = bj4VarO.P();
                        ox6VarC3 = it1.c(bj4VarO, ox6VarM5);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA2);
                        rd7.d(bj4VarO, eVar, kw7VarP3);
                        l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC3);
                        bj4VarO.K(560412879);
                        if (str3 != null) {
                            i14 = 6;
                            ox6Var4 = null;
                            mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                            bj4Var = bj4VarO;
                        } else {
                            ox6Var4 = null;
                            bj4Var = bj4VarO;
                            i14 = 6;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.K(-1319827237);
                        kv0Var = kv0.a;
                        i15 = i14;
                        if (intercomTopBarIcon3 != null) {
                            h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                public final void invoke(jt1 jt1Var2, int i20) {
                                    if ((i20 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else {
                                        m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                        }
                        bj4Var.U(false);
                        bj4Var.K(-1319809649);
                        ei4Var3 = ei4Var2;
                        if (ei4Var3 != null) {
                            ox6 ox6VarF5 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                            ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, ox6VarF5);
                            if (j1bVar == null) {
                                ml5.c();
                                throw ox6Var4;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar3);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                            r1 = 1;
                            bj4Var.U(true);
                        } else {
                            r1 = 1;
                        }
                        bj4Var.U(false);
                        bj4Var.U(r1);
                        IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                        bj4Var.U(r1);
                        mh4Var4 = mh4Var3;
                        ox6Var5 = ox6Var3;
                        ei4Var4 = ei4Var3;
                        str4 = str3;
                        bVar4 = bVar2;
                        j7 = jM771getOnHeader0d7_KjU;
                        intercomTopBarIcon4 = intercomTopBarIcon3;
                        j8 = j6;
                        bj4Var2 = bj4Var;
                    }
                    xj8VarW = bj4Var2.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: si5
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$8(ox6Var5, str4, intercomTopBarIcon4, bVar4, j8, j7, mh4Var4, ei4Var4, i, i2, (jt1) obj2, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) == 4793490) {
                    bj4VarO.v0();
                    i12 = i & 1;
                    aVar = ox6.a.t;
                    obj = jt1.a.a;
                    aVar2 = di.a.m;
                    if (i12 != 0) {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    } else {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    }
                    bj4VarO.V();
                    aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                    ox6Var3 = ox6Var2;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, aVar);
                    bt1.c.getClass();
                    aVar3 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf6 = Integer.valueOf(iHashCode);
                    bVar3 = bt1.a.g;
                    rd7.d(bj4VarO, bVar3, numValueOf6);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    j6 = j5;
                    ox6 ox6VarK6 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                    bj4VarO.K(86796077);
                    if ((i3 & 3670016) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z) {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    } else {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(z2);
                    ox6 ox6VarC10 = we1.c(ox6VarK6, z2, null, (mh4) objF2, 15);
                    fl6VarD = dv0.d(di.a.a, z2);
                    mh4Var3 = mh4Var2;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarC10);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    if (intercomTopBarIcon3 != null) {
                        f = 16.0f;
                    } else {
                        f = 16.0f;
                    }
                    ox6 ox6VarM6 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                    i13 = i3 >> 3;
                    aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarM6);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    bj4VarO.K(560412879);
                    if (str3 != null) {
                        i14 = 6;
                        ox6Var4 = null;
                        mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                        bj4Var = bj4VarO;
                    } else {
                        ox6Var4 = null;
                        bj4Var = bj4VarO;
                        i14 = 6;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.K(-1319827237);
                    kv0Var = kv0.a;
                    i15 = i14;
                    if (intercomTopBarIcon3 != null) {
                        h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            public final void invoke(jt1 jt1Var2, int i20) {
                                if ((i20 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                    }
                    bj4Var.U(false);
                    bj4Var.K(-1319809649);
                    ei4Var3 = ei4Var2;
                    if (ei4Var3 != null) {
                        ox6 ox6VarF6 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                        ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, ox6VarF6);
                        if (j1bVar == null) {
                            ml5.c();
                            throw ox6Var4;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar3);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                        r1 = 1;
                        bj4Var.U(true);
                    } else {
                        r1 = 1;
                    }
                    bj4Var.U(false);
                    bj4Var.U(r1);
                    IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                    bj4Var.U(r1);
                    mh4Var4 = mh4Var3;
                    ox6Var5 = ox6Var3;
                    ei4Var4 = ei4Var3;
                    str4 = str3;
                    bVar4 = bVar2;
                    j7 = jM771getOnHeader0d7_KjU;
                    intercomTopBarIcon4 = intercomTopBarIcon3;
                    j8 = j6;
                    bj4Var2 = bj4Var;
                } else {
                    bj4VarO.v0();
                    i12 = i & 1;
                    aVar = ox6.a.t;
                    obj = jt1.a.a;
                    aVar2 = di.a.m;
                    if (i12 != 0) {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    } else {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    }
                    bj4VarO.V();
                    aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                    ox6Var3 = ox6Var2;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, aVar);
                    bt1.c.getClass();
                    aVar3 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf7 = Integer.valueOf(iHashCode);
                    bVar3 = bt1.a.g;
                    rd7.d(bj4VarO, bVar3, numValueOf7);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    j6 = j5;
                    ox6 ox6VarK7 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                    bj4VarO.K(86796077);
                    if ((i3 & 3670016) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z) {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    } else {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(z2);
                    ox6 ox6VarC11 = we1.c(ox6VarK7, z2, null, (mh4) objF2, 15);
                    fl6VarD = dv0.d(di.a.a, z2);
                    mh4Var3 = mh4Var2;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarC11);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    if (intercomTopBarIcon3 != null) {
                        f = 16.0f;
                    } else {
                        f = 16.0f;
                    }
                    ox6 ox6VarM7 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                    i13 = i3 >> 3;
                    aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarM7);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    bj4VarO.K(560412879);
                    if (str3 != null) {
                        i14 = 6;
                        ox6Var4 = null;
                        mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                        bj4Var = bj4VarO;
                    } else {
                        ox6Var4 = null;
                        bj4Var = bj4VarO;
                        i14 = 6;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.K(-1319827237);
                    kv0Var = kv0.a;
                    i15 = i14;
                    if (intercomTopBarIcon3 != null) {
                        h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            public final void invoke(jt1 jt1Var2, int i20) {
                                if ((i20 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                    }
                    bj4Var.U(false);
                    bj4Var.K(-1319809649);
                    ei4Var3 = ei4Var2;
                    if (ei4Var3 != null) {
                        ox6 ox6VarF7 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                        ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, ox6VarF7);
                        if (j1bVar == null) {
                            ml5.c();
                            throw ox6Var4;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar3);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                        r1 = 1;
                        bj4Var.U(true);
                    } else {
                        r1 = 1;
                    }
                    bj4Var.U(false);
                    bj4Var.U(r1);
                    IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                    bj4Var.U(r1);
                    mh4Var4 = mh4Var3;
                    ox6Var5 = ox6Var3;
                    ei4Var4 = ei4Var3;
                    str4 = str3;
                    bVar4 = bVar2;
                    j7 = jM771getOnHeader0d7_KjU;
                    intercomTopBarIcon4 = intercomTopBarIcon3;
                    j8 = j6;
                    bj4Var2 = bj4Var;
                }
                xj8VarW = bj4Var2.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: si5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$8(ox6Var5, str4, intercomTopBarIcon4, bVar4, j8, j7, mh4Var4, ei4Var4, i, i2, (jt1) obj2, iIntValue);
                        }
                    };
                }
            }
            i3 |= 384;
            intercomTopBarIcon2 = intercomTopBarIcon;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    bVar2 = bVar;
                    if (bj4VarO.J(bVar2)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j3 = j;
                        if (bj4VarO.i(j3)) {
                        }
                        i3 |= i19;
                    } else {
                        j3 = j;
                    }
                    i3 |= i19;
                } else {
                    j3 = j;
                }
                if ((i & 196608) == 0) {
                    j4 = j2;
                    if ((i2 & 32) == 0) {
                        i16 = 65536;
                    } else {
                        i16 = 65536;
                    }
                    i3 |= i16;
                } else {
                    j4 = j2;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (bj4VarO.j(mh4Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    if ((i & 12582912) == 0) {
                        if (bj4VarO.j(ei4Var)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        bj4VarO.v0();
                        i12 = i & 1;
                        aVar = ox6.a.t;
                        obj = jt1.a.a;
                        aVar2 = di.a.m;
                        if (i12 != 0) {
                            if (i17 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var;
                            }
                            if (i18 != 0) {
                                str2 = null;
                            }
                            if (i4 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i6 != 0) {
                                bVar2 = aVar2;
                            }
                            if ((i2 & 16) != 0) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                                i3 &= -57345;
                            } else {
                                jM767getHeader0d7_KjU = j;
                            }
                            if ((i2 & 32) != 0) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                                i3 &= -458753;
                            } else {
                                jM771getOnHeader0d7_KjU = j2;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-883388004);
                                objF = bj4VarO.f();
                                if (objF == obj) {
                                    objF = new qi5();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if (i10 != 0) {
                                ei4Var2 = null;
                            } else {
                                ei4Var2 = ei4Var;
                            }
                            str3 = str2;
                            j5 = jM767getHeader0d7_KjU;
                        } else {
                            if (i17 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var;
                            }
                            if (i18 != 0) {
                                str2 = null;
                            }
                            if (i4 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i6 != 0) {
                                bVar2 = aVar2;
                            }
                            if ((i2 & 16) != 0) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                                i3 &= -57345;
                            } else {
                                jM767getHeader0d7_KjU = j;
                            }
                            if ((i2 & 32) != 0) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                                i3 &= -458753;
                            } else {
                                jM771getOnHeader0d7_KjU = j2;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-883388004);
                                objF = bj4VarO.f();
                                if (objF == obj) {
                                    objF = new qi5();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if (i10 != 0) {
                                ei4Var2 = null;
                            } else {
                                ei4Var2 = ei4Var;
                            }
                            str3 = str2;
                            j5 = jM767getHeader0d7_KjU;
                        }
                        bj4VarO.V();
                        aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                        ox6Var3 = ox6Var2;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, aVar);
                        bt1.c.getClass();
                        aVar3 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        cVar = bt1.a.f;
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        eVar = bt1.a.e;
                        rd7.d(bj4VarO, eVar, kw7VarP);
                        Integer numValueOf8 = Integer.valueOf(iHashCode);
                        bVar3 = bt1.a.g;
                        rd7.d(bj4VarO, bVar3, numValueOf8);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        intercomTopBarIcon3 = intercomTopBarIcon2;
                        j6 = j5;
                        ox6 ox6VarK8 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                        bj4VarO.K(86796077);
                        if ((i3 & 3670016) == 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF2 = bj4VarO.f();
                        if (z) {
                            z2 = false;
                            objF2 = new ri5(false ? 1 : 0, mh4Var2);
                            bj4VarO.C(objF2);
                        } else {
                            z2 = false;
                            objF2 = new ri5(false ? 1 : 0, mh4Var2);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(z2);
                        ox6 ox6VarC12 = we1.c(ox6VarK8, z2, null, (mh4) objF2, 15);
                        fl6VarD = dv0.d(di.a.a, z2);
                        mh4Var3 = mh4Var2;
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, ox6VarC12);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, fl6VarD);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        if (intercomTopBarIcon3 != null) {
                            f = 16.0f;
                        } else {
                            f = 16.0f;
                        }
                        ox6 ox6VarM8 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                        i13 = i3 >> 3;
                        aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                        iHashCode3 = Long.hashCode(bj4VarO.T);
                        kw7VarP3 = bj4VarO.P();
                        ox6VarC3 = it1.c(bj4VarO, ox6VarM8);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA2);
                        rd7.d(bj4VarO, eVar, kw7VarP3);
                        l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC3);
                        bj4VarO.K(560412879);
                        if (str3 != null) {
                            i14 = 6;
                            ox6Var4 = null;
                            mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                            bj4Var = bj4VarO;
                        } else {
                            ox6Var4 = null;
                            bj4Var = bj4VarO;
                            i14 = 6;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.K(-1319827237);
                        kv0Var = kv0.a;
                        i15 = i14;
                        if (intercomTopBarIcon3 != null) {
                            h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                public final void invoke(jt1 jt1Var2, int i20) {
                                    if ((i20 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else {
                                        m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                        }
                        bj4Var.U(false);
                        bj4Var.K(-1319809649);
                        ei4Var3 = ei4Var2;
                        if (ei4Var3 != null) {
                            ox6 ox6VarF8 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                            ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, ox6VarF8);
                            if (j1bVar == null) {
                                ml5.c();
                                throw ox6Var4;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar3);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                            r1 = 1;
                            bj4Var.U(true);
                        } else {
                            r1 = 1;
                        }
                        bj4Var.U(false);
                        bj4Var.U(r1);
                        IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                        bj4Var.U(r1);
                        mh4Var4 = mh4Var3;
                        ox6Var5 = ox6Var3;
                        ei4Var4 = ei4Var3;
                        str4 = str3;
                        bVar4 = bVar2;
                        j7 = jM771getOnHeader0d7_KjU;
                        intercomTopBarIcon4 = intercomTopBarIcon3;
                        j8 = j6;
                        bj4Var2 = bj4Var;
                    } else {
                        bj4VarO.v0();
                        i12 = i & 1;
                        aVar = ox6.a.t;
                        obj = jt1.a.a;
                        aVar2 = di.a.m;
                        if (i12 != 0) {
                            if (i17 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var;
                            }
                            if (i18 != 0) {
                                str2 = null;
                            }
                            if (i4 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i6 != 0) {
                                bVar2 = aVar2;
                            }
                            if ((i2 & 16) != 0) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                                i3 &= -57345;
                            } else {
                                jM767getHeader0d7_KjU = j;
                            }
                            if ((i2 & 32) != 0) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                                i3 &= -458753;
                            } else {
                                jM771getOnHeader0d7_KjU = j2;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-883388004);
                                objF = bj4VarO.f();
                                if (objF == obj) {
                                    objF = new qi5();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if (i10 != 0) {
                                ei4Var2 = null;
                            } else {
                                ei4Var2 = ei4Var;
                            }
                            str3 = str2;
                            j5 = jM767getHeader0d7_KjU;
                        } else {
                            if (i17 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var;
                            }
                            if (i18 != 0) {
                                str2 = null;
                            }
                            if (i4 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i6 != 0) {
                                bVar2 = aVar2;
                            }
                            if ((i2 & 16) != 0) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                                i3 &= -57345;
                            } else {
                                jM767getHeader0d7_KjU = j;
                            }
                            if ((i2 & 32) != 0) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                                i3 &= -458753;
                            } else {
                                jM771getOnHeader0d7_KjU = j2;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-883388004);
                                objF = bj4VarO.f();
                                if (objF == obj) {
                                    objF = new qi5();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if (i10 != 0) {
                                ei4Var2 = null;
                            } else {
                                ei4Var2 = ei4Var;
                            }
                            str3 = str2;
                            j5 = jM767getHeader0d7_KjU;
                        }
                        bj4VarO.V();
                        aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                        ox6Var3 = ox6Var2;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, aVar);
                        bt1.c.getClass();
                        aVar3 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        cVar = bt1.a.f;
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        eVar = bt1.a.e;
                        rd7.d(bj4VarO, eVar, kw7VarP);
                        Integer numValueOf9 = Integer.valueOf(iHashCode);
                        bVar3 = bt1.a.g;
                        rd7.d(bj4VarO, bVar3, numValueOf9);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        intercomTopBarIcon3 = intercomTopBarIcon2;
                        j6 = j5;
                        ox6 ox6VarK9 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                        bj4VarO.K(86796077);
                        if ((i3 & 3670016) == 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF2 = bj4VarO.f();
                        if (z) {
                            z2 = false;
                            objF2 = new ri5(false ? 1 : 0, mh4Var2);
                            bj4VarO.C(objF2);
                        } else {
                            z2 = false;
                            objF2 = new ri5(false ? 1 : 0, mh4Var2);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(z2);
                        ox6 ox6VarC13 = we1.c(ox6VarK9, z2, null, (mh4) objF2, 15);
                        fl6VarD = dv0.d(di.a.a, z2);
                        mh4Var3 = mh4Var2;
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, ox6VarC13);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, fl6VarD);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        if (intercomTopBarIcon3 != null) {
                            f = 16.0f;
                        } else {
                            f = 16.0f;
                        }
                        ox6 ox6VarM9 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                        i13 = i3 >> 3;
                        aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                        iHashCode3 = Long.hashCode(bj4VarO.T);
                        kw7VarP3 = bj4VarO.P();
                        ox6VarC3 = it1.c(bj4VarO, ox6VarM9);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA2);
                        rd7.d(bj4VarO, eVar, kw7VarP3);
                        l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC3);
                        bj4VarO.K(560412879);
                        if (str3 != null) {
                            i14 = 6;
                            ox6Var4 = null;
                            mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                            bj4Var = bj4VarO;
                        } else {
                            ox6Var4 = null;
                            bj4Var = bj4VarO;
                            i14 = 6;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.K(-1319827237);
                        kv0Var = kv0.a;
                        i15 = i14;
                        if (intercomTopBarIcon3 != null) {
                            h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                public final void invoke(jt1 jt1Var2, int i20) {
                                    if ((i20 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else {
                                        m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                        }
                        bj4Var.U(false);
                        bj4Var.K(-1319809649);
                        ei4Var3 = ei4Var2;
                        if (ei4Var3 != null) {
                            ox6 ox6VarF9 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                            ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, ox6VarF9);
                            if (j1bVar == null) {
                                ml5.c();
                                throw ox6Var4;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar3);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                            r1 = 1;
                            bj4Var.U(true);
                        } else {
                            r1 = 1;
                        }
                        bj4Var.U(false);
                        bj4Var.U(r1);
                        IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                        bj4Var.U(r1);
                        mh4Var4 = mh4Var3;
                        ox6Var5 = ox6Var3;
                        ei4Var4 = ei4Var3;
                        str4 = str3;
                        bVar4 = bVar2;
                        j7 = jM771getOnHeader0d7_KjU;
                        intercomTopBarIcon4 = intercomTopBarIcon3;
                        j8 = j6;
                        bj4Var2 = bj4Var;
                    }
                    xj8VarW = bj4Var2.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: si5
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$8(ox6Var5, str4, intercomTopBarIcon4, bVar4, j8, j7, mh4Var4, ei4Var4, i, i2, (jt1) obj2, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) == 4793490) {
                    bj4VarO.v0();
                    i12 = i & 1;
                    aVar = ox6.a.t;
                    obj = jt1.a.a;
                    aVar2 = di.a.m;
                    if (i12 != 0) {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    } else {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    }
                    bj4VarO.V();
                    aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                    ox6Var3 = ox6Var2;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, aVar);
                    bt1.c.getClass();
                    aVar3 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf10 = Integer.valueOf(iHashCode);
                    bVar3 = bt1.a.g;
                    rd7.d(bj4VarO, bVar3, numValueOf10);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    j6 = j5;
                    ox6 ox6VarK10 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                    bj4VarO.K(86796077);
                    if ((i3 & 3670016) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z) {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    } else {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(z2);
                    ox6 ox6VarC14 = we1.c(ox6VarK10, z2, null, (mh4) objF2, 15);
                    fl6VarD = dv0.d(di.a.a, z2);
                    mh4Var3 = mh4Var2;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarC14);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    if (intercomTopBarIcon3 != null) {
                        f = 16.0f;
                    } else {
                        f = 16.0f;
                    }
                    ox6 ox6VarM10 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                    i13 = i3 >> 3;
                    aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarM10);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    bj4VarO.K(560412879);
                    if (str3 != null) {
                        i14 = 6;
                        ox6Var4 = null;
                        mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                        bj4Var = bj4VarO;
                    } else {
                        ox6Var4 = null;
                        bj4Var = bj4VarO;
                        i14 = 6;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.K(-1319827237);
                    kv0Var = kv0.a;
                    i15 = i14;
                    if (intercomTopBarIcon3 != null) {
                        h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            public final void invoke(jt1 jt1Var2, int i20) {
                                if ((i20 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                    }
                    bj4Var.U(false);
                    bj4Var.K(-1319809649);
                    ei4Var3 = ei4Var2;
                    if (ei4Var3 != null) {
                        ox6 ox6VarF10 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                        ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, ox6VarF10);
                        if (j1bVar == null) {
                            ml5.c();
                            throw ox6Var4;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar3);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                        r1 = 1;
                        bj4Var.U(true);
                    } else {
                        r1 = 1;
                    }
                    bj4Var.U(false);
                    bj4Var.U(r1);
                    IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                    bj4Var.U(r1);
                    mh4Var4 = mh4Var3;
                    ox6Var5 = ox6Var3;
                    ei4Var4 = ei4Var3;
                    str4 = str3;
                    bVar4 = bVar2;
                    j7 = jM771getOnHeader0d7_KjU;
                    intercomTopBarIcon4 = intercomTopBarIcon3;
                    j8 = j6;
                    bj4Var2 = bj4Var;
                } else {
                    bj4VarO.v0();
                    i12 = i & 1;
                    aVar = ox6.a.t;
                    obj = jt1.a.a;
                    aVar2 = di.a.m;
                    if (i12 != 0) {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    } else {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    }
                    bj4VarO.V();
                    aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                    ox6Var3 = ox6Var2;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, aVar);
                    bt1.c.getClass();
                    aVar3 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf11 = Integer.valueOf(iHashCode);
                    bVar3 = bt1.a.g;
                    rd7.d(bj4VarO, bVar3, numValueOf11);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    j6 = j5;
                    ox6 ox6VarK11 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                    bj4VarO.K(86796077);
                    if ((i3 & 3670016) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z) {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    } else {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(z2);
                    ox6 ox6VarC15 = we1.c(ox6VarK11, z2, null, (mh4) objF2, 15);
                    fl6VarD = dv0.d(di.a.a, z2);
                    mh4Var3 = mh4Var2;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarC15);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    if (intercomTopBarIcon3 != null) {
                        f = 16.0f;
                    } else {
                        f = 16.0f;
                    }
                    ox6 ox6VarM11 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                    i13 = i3 >> 3;
                    aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarM11);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    bj4VarO.K(560412879);
                    if (str3 != null) {
                        i14 = 6;
                        ox6Var4 = null;
                        mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                        bj4Var = bj4VarO;
                    } else {
                        ox6Var4 = null;
                        bj4Var = bj4VarO;
                        i14 = 6;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.K(-1319827237);
                    kv0Var = kv0.a;
                    i15 = i14;
                    if (intercomTopBarIcon3 != null) {
                        h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            public final void invoke(jt1 jt1Var2, int i20) {
                                if ((i20 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                    }
                    bj4Var.U(false);
                    bj4Var.K(-1319809649);
                    ei4Var3 = ei4Var2;
                    if (ei4Var3 != null) {
                        ox6 ox6VarF11 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                        ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, ox6VarF11);
                        if (j1bVar == null) {
                            ml5.c();
                            throw ox6Var4;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar3);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                        r1 = 1;
                        bj4Var.U(true);
                    } else {
                        r1 = 1;
                    }
                    bj4Var.U(false);
                    bj4Var.U(r1);
                    IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                    bj4Var.U(r1);
                    mh4Var4 = mh4Var3;
                    ox6Var5 = ox6Var3;
                    ei4Var4 = ei4Var3;
                    str4 = str3;
                    bVar4 = bVar2;
                    j7 = jM771getOnHeader0d7_KjU;
                    intercomTopBarIcon4 = intercomTopBarIcon3;
                    j8 = j6;
                    bj4Var2 = bj4Var;
                }
                xj8VarW = bj4Var2.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: si5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$8(ox6Var5, str4, intercomTopBarIcon4, bVar4, j8, j7, mh4Var4, ei4Var4, i, i2, (jt1) obj2, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            bVar2 = bVar;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j3 = j;
                    if (bj4VarO.i(j3)) {
                    }
                    i3 |= i19;
                } else {
                    j3 = j;
                }
                i3 |= i19;
            } else {
                j3 = j;
            }
            if ((i & 196608) == 0) {
                j4 = j2;
                if ((i2 & 32) == 0) {
                    i16 = 65536;
                } else {
                    i16 = 65536;
                }
                i3 |= i16;
            } else {
                j4 = j2;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (bj4VarO.j(mh4Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i10 = i2 & 128;
            if (i10 != 0) {
                if ((i & 12582912) == 0) {
                    if (bj4VarO.j(ei4Var)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                if ((i3 & 4793491) == 4793490) {
                    bj4VarO.v0();
                    i12 = i & 1;
                    aVar = ox6.a.t;
                    obj = jt1.a.a;
                    aVar2 = di.a.m;
                    if (i12 != 0) {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    } else {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    }
                    bj4VarO.V();
                    aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                    ox6Var3 = ox6Var2;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, aVar);
                    bt1.c.getClass();
                    aVar3 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf12 = Integer.valueOf(iHashCode);
                    bVar3 = bt1.a.g;
                    rd7.d(bj4VarO, bVar3, numValueOf12);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    j6 = j5;
                    ox6 ox6VarK12 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                    bj4VarO.K(86796077);
                    if ((i3 & 3670016) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z) {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    } else {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(z2);
                    ox6 ox6VarC16 = we1.c(ox6VarK12, z2, null, (mh4) objF2, 15);
                    fl6VarD = dv0.d(di.a.a, z2);
                    mh4Var3 = mh4Var2;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarC16);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    if (intercomTopBarIcon3 != null) {
                        f = 16.0f;
                    } else {
                        f = 16.0f;
                    }
                    ox6 ox6VarM12 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                    i13 = i3 >> 3;
                    aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarM12);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    bj4VarO.K(560412879);
                    if (str3 != null) {
                        i14 = 6;
                        ox6Var4 = null;
                        mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                        bj4Var = bj4VarO;
                    } else {
                        ox6Var4 = null;
                        bj4Var = bj4VarO;
                        i14 = 6;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.K(-1319827237);
                    kv0Var = kv0.a;
                    i15 = i14;
                    if (intercomTopBarIcon3 != null) {
                        h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            public final void invoke(jt1 jt1Var2, int i20) {
                                if ((i20 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                    }
                    bj4Var.U(false);
                    bj4Var.K(-1319809649);
                    ei4Var3 = ei4Var2;
                    if (ei4Var3 != null) {
                        ox6 ox6VarF12 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                        ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, ox6VarF12);
                        if (j1bVar == null) {
                            ml5.c();
                            throw ox6Var4;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar3);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                        r1 = 1;
                        bj4Var.U(true);
                    } else {
                        r1 = 1;
                    }
                    bj4Var.U(false);
                    bj4Var.U(r1);
                    IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                    bj4Var.U(r1);
                    mh4Var4 = mh4Var3;
                    ox6Var5 = ox6Var3;
                    ei4Var4 = ei4Var3;
                    str4 = str3;
                    bVar4 = bVar2;
                    j7 = jM771getOnHeader0d7_KjU;
                    intercomTopBarIcon4 = intercomTopBarIcon3;
                    j8 = j6;
                    bj4Var2 = bj4Var;
                } else {
                    bj4VarO.v0();
                    i12 = i & 1;
                    aVar = ox6.a.t;
                    obj = jt1.a.a;
                    aVar2 = di.a.m;
                    if (i12 != 0) {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    } else {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    }
                    bj4VarO.V();
                    aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                    ox6Var3 = ox6Var2;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, aVar);
                    bt1.c.getClass();
                    aVar3 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf13 = Integer.valueOf(iHashCode);
                    bVar3 = bt1.a.g;
                    rd7.d(bj4VarO, bVar3, numValueOf13);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    j6 = j5;
                    ox6 ox6VarK13 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                    bj4VarO.K(86796077);
                    if ((i3 & 3670016) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z) {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    } else {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(z2);
                    ox6 ox6VarC17 = we1.c(ox6VarK13, z2, null, (mh4) objF2, 15);
                    fl6VarD = dv0.d(di.a.a, z2);
                    mh4Var3 = mh4Var2;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarC17);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    if (intercomTopBarIcon3 != null) {
                        f = 16.0f;
                    } else {
                        f = 16.0f;
                    }
                    ox6 ox6VarM13 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                    i13 = i3 >> 3;
                    aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarM13);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    bj4VarO.K(560412879);
                    if (str3 != null) {
                        i14 = 6;
                        ox6Var4 = null;
                        mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                        bj4Var = bj4VarO;
                    } else {
                        ox6Var4 = null;
                        bj4Var = bj4VarO;
                        i14 = 6;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.K(-1319827237);
                    kv0Var = kv0.a;
                    i15 = i14;
                    if (intercomTopBarIcon3 != null) {
                        h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            public final void invoke(jt1 jt1Var2, int i20) {
                                if ((i20 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                    }
                    bj4Var.U(false);
                    bj4Var.K(-1319809649);
                    ei4Var3 = ei4Var2;
                    if (ei4Var3 != null) {
                        ox6 ox6VarF13 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                        ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, ox6VarF13);
                        if (j1bVar == null) {
                            ml5.c();
                            throw ox6Var4;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar3);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                        r1 = 1;
                        bj4Var.U(true);
                    } else {
                        r1 = 1;
                    }
                    bj4Var.U(false);
                    bj4Var.U(r1);
                    IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                    bj4Var.U(r1);
                    mh4Var4 = mh4Var3;
                    ox6Var5 = ox6Var3;
                    ei4Var4 = ei4Var3;
                    str4 = str3;
                    bVar4 = bVar2;
                    j7 = jM771getOnHeader0d7_KjU;
                    intercomTopBarIcon4 = intercomTopBarIcon3;
                    j8 = j6;
                    bj4Var2 = bj4Var;
                }
                xj8VarW = bj4Var2.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: si5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$8(ox6Var5, str4, intercomTopBarIcon4, bVar4, j8, j7, mh4Var4, ei4Var4, i, i2, (jt1) obj2, iIntValue);
                        }
                    };
                }
            }
            i3 |= 12582912;
            if ((i3 & 4793491) == 4793490) {
                bj4VarO.v0();
                i12 = i & 1;
                aVar = ox6.a.t;
                obj = jt1.a.a;
                aVar2 = di.a.m;
                if (i12 != 0) {
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i4 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i6 != 0) {
                        bVar2 = aVar2;
                    }
                    if ((i2 & 16) != 0) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM767getHeader0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM771getOnHeader0d7_KjU = j2;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-883388004);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new qi5();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if (i10 != 0) {
                        ei4Var2 = null;
                    } else {
                        ei4Var2 = ei4Var;
                    }
                    str3 = str2;
                    j5 = jM767getHeader0d7_KjU;
                } else {
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i4 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i6 != 0) {
                        bVar2 = aVar2;
                    }
                    if ((i2 & 16) != 0) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM767getHeader0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM771getOnHeader0d7_KjU = j2;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-883388004);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new qi5();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if (i10 != 0) {
                        ei4Var2 = null;
                    } else {
                        ei4Var2 = ei4Var;
                    }
                    str3 = str2;
                    j5 = jM767getHeader0d7_KjU;
                }
                bj4VarO.V();
                aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                ox6Var3 = ox6Var2;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, aVar);
                bt1.c.getClass();
                aVar3 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, aj1VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf14 = Integer.valueOf(iHashCode);
                bVar3 = bt1.a.g;
                rd7.d(bj4VarO, bVar3, numValueOf14);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                intercomTopBarIcon3 = intercomTopBarIcon2;
                j6 = j5;
                ox6 ox6VarK14 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                bj4VarO.K(86796077);
                if ((i3 & 3670016) == 1048576) {
                    z = true;
                } else {
                    z = false;
                }
                objF2 = bj4VarO.f();
                if (z) {
                    z2 = false;
                    objF2 = new ri5(false ? 1 : 0, mh4Var2);
                    bj4VarO.C(objF2);
                } else {
                    z2 = false;
                    objF2 = new ri5(false ? 1 : 0, mh4Var2);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(z2);
                ox6 ox6VarC18 = we1.c(ox6VarK14, z2, null, (mh4) objF2, 15);
                fl6VarD = dv0.d(di.a.a, z2);
                mh4Var3 = mh4Var2;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC18);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                if (intercomTopBarIcon3 != null) {
                    f = 16.0f;
                } else {
                    f = 16.0f;
                }
                ox6 ox6VarM14 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                i13 = i3 >> 3;
                aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, ox6VarM14);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                bj4VarO.K(560412879);
                if (str3 != null) {
                    i14 = 6;
                    ox6Var4 = null;
                    mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                    bj4Var = bj4VarO;
                } else {
                    ox6Var4 = null;
                    bj4Var = bj4VarO;
                    i14 = 6;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.K(-1319827237);
                kv0Var = kv0.a;
                i15 = i14;
                if (intercomTopBarIcon3 != null) {
                    h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        public final void invoke(jt1 jt1Var2, int i20) {
                            if ((i20 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                }
                bj4Var.U(false);
                bj4Var.K(-1319809649);
                ei4Var3 = ei4Var2;
                if (ei4Var3 != null) {
                    ox6 ox6VarF14 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                    iHashCode4 = Long.hashCode(bj4Var.T);
                    kw7VarP4 = bj4Var.P();
                    ox6VarC4 = it1.c(bj4Var, ox6VarF14);
                    if (j1bVar == null) {
                        ml5.c();
                        throw ox6Var4;
                    }
                    bj4Var.q();
                    if (bj4Var.S) {
                        bj4Var.k(aVar3);
                    } else {
                        bj4Var.z();
                    }
                    rd7.d(bj4Var, cVar, ny8VarA);
                    rd7.d(bj4Var, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                    rd7.d(bj4Var, dVar, ox6VarC4);
                    ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                    r1 = 1;
                    bj4Var.U(true);
                } else {
                    r1 = 1;
                }
                bj4Var.U(false);
                bj4Var.U(r1);
                IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                bj4Var.U(r1);
                mh4Var4 = mh4Var3;
                ox6Var5 = ox6Var3;
                ei4Var4 = ei4Var3;
                str4 = str3;
                bVar4 = bVar2;
                j7 = jM771getOnHeader0d7_KjU;
                intercomTopBarIcon4 = intercomTopBarIcon3;
                j8 = j6;
                bj4Var2 = bj4Var;
            } else {
                bj4VarO.v0();
                i12 = i & 1;
                aVar = ox6.a.t;
                obj = jt1.a.a;
                aVar2 = di.a.m;
                if (i12 != 0) {
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i4 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i6 != 0) {
                        bVar2 = aVar2;
                    }
                    if ((i2 & 16) != 0) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM767getHeader0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM771getOnHeader0d7_KjU = j2;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-883388004);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new qi5();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if (i10 != 0) {
                        ei4Var2 = null;
                    } else {
                        ei4Var2 = ei4Var;
                    }
                    str3 = str2;
                    j5 = jM767getHeader0d7_KjU;
                } else {
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i4 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i6 != 0) {
                        bVar2 = aVar2;
                    }
                    if ((i2 & 16) != 0) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM767getHeader0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM771getOnHeader0d7_KjU = j2;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-883388004);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new qi5();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if (i10 != 0) {
                        ei4Var2 = null;
                    } else {
                        ei4Var2 = ei4Var;
                    }
                    str3 = str2;
                    j5 = jM767getHeader0d7_KjU;
                }
                bj4VarO.V();
                aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                ox6Var3 = ox6Var2;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, aVar);
                bt1.c.getClass();
                aVar3 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, aj1VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf15 = Integer.valueOf(iHashCode);
                bVar3 = bt1.a.g;
                rd7.d(bj4VarO, bVar3, numValueOf15);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                intercomTopBarIcon3 = intercomTopBarIcon2;
                j6 = j5;
                ox6 ox6VarK15 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                bj4VarO.K(86796077);
                if ((i3 & 3670016) == 1048576) {
                    z = true;
                } else {
                    z = false;
                }
                objF2 = bj4VarO.f();
                if (z) {
                    z2 = false;
                    objF2 = new ri5(false ? 1 : 0, mh4Var2);
                    bj4VarO.C(objF2);
                } else {
                    z2 = false;
                    objF2 = new ri5(false ? 1 : 0, mh4Var2);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(z2);
                ox6 ox6VarC19 = we1.c(ox6VarK15, z2, null, (mh4) objF2, 15);
                fl6VarD = dv0.d(di.a.a, z2);
                mh4Var3 = mh4Var2;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC19);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                if (intercomTopBarIcon3 != null) {
                    f = 16.0f;
                } else {
                    f = 16.0f;
                }
                ox6 ox6VarM15 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                i13 = i3 >> 3;
                aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, ox6VarM15);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                bj4VarO.K(560412879);
                if (str3 != null) {
                    i14 = 6;
                    ox6Var4 = null;
                    mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                    bj4Var = bj4VarO;
                } else {
                    ox6Var4 = null;
                    bj4Var = bj4VarO;
                    i14 = 6;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.K(-1319827237);
                kv0Var = kv0.a;
                i15 = i14;
                if (intercomTopBarIcon3 != null) {
                    h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        public final void invoke(jt1 jt1Var2, int i20) {
                            if ((i20 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                }
                bj4Var.U(false);
                bj4Var.K(-1319809649);
                ei4Var3 = ei4Var2;
                if (ei4Var3 != null) {
                    ox6 ox6VarF15 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                    iHashCode4 = Long.hashCode(bj4Var.T);
                    kw7VarP4 = bj4Var.P();
                    ox6VarC4 = it1.c(bj4Var, ox6VarF15);
                    if (j1bVar == null) {
                        ml5.c();
                        throw ox6Var4;
                    }
                    bj4Var.q();
                    if (bj4Var.S) {
                        bj4Var.k(aVar3);
                    } else {
                        bj4Var.z();
                    }
                    rd7.d(bj4Var, cVar, ny8VarA);
                    rd7.d(bj4Var, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                    rd7.d(bj4Var, dVar, ox6VarC4);
                    ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                    r1 = 1;
                    bj4Var.U(true);
                } else {
                    r1 = 1;
                }
                bj4Var.U(false);
                bj4Var.U(r1);
                IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                bj4Var.U(r1);
                mh4Var4 = mh4Var3;
                ox6Var5 = ox6Var3;
                ei4Var4 = ei4Var3;
                str4 = str3;
                bVar4 = bVar2;
                j7 = jM771getOnHeader0d7_KjU;
                intercomTopBarIcon4 = intercomTopBarIcon3;
                j8 = j6;
                bj4Var2 = bj4Var;
            }
            xj8VarW = bj4Var2.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: si5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$8(ox6Var5, str4, intercomTopBarIcon4, bVar4, j8, j7, mh4Var4, ei4Var4, i, i2, (jt1) obj2, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        str2 = str;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                intercomTopBarIcon2 = intercomTopBarIcon;
                if (bj4VarO.J(intercomTopBarIcon2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    bVar2 = bVar;
                    if (bj4VarO.J(bVar2)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j3 = j;
                        if (bj4VarO.i(j3)) {
                        }
                        i3 |= i19;
                    } else {
                        j3 = j;
                    }
                    i3 |= i19;
                } else {
                    j3 = j;
                }
                if ((i & 196608) == 0) {
                    j4 = j2;
                    if ((i2 & 32) == 0) {
                        i16 = 65536;
                    } else {
                        i16 = 65536;
                    }
                    i3 |= i16;
                } else {
                    j4 = j2;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (bj4VarO.j(mh4Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    if ((i & 12582912) == 0) {
                        if (bj4VarO.j(ei4Var)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        bj4VarO.v0();
                        i12 = i & 1;
                        aVar = ox6.a.t;
                        obj = jt1.a.a;
                        aVar2 = di.a.m;
                        if (i12 != 0) {
                            if (i17 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var;
                            }
                            if (i18 != 0) {
                                str2 = null;
                            }
                            if (i4 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i6 != 0) {
                                bVar2 = aVar2;
                            }
                            if ((i2 & 16) != 0) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                                i3 &= -57345;
                            } else {
                                jM767getHeader0d7_KjU = j;
                            }
                            if ((i2 & 32) != 0) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                                i3 &= -458753;
                            } else {
                                jM771getOnHeader0d7_KjU = j2;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-883388004);
                                objF = bj4VarO.f();
                                if (objF == obj) {
                                    objF = new qi5();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if (i10 != 0) {
                                ei4Var2 = null;
                            } else {
                                ei4Var2 = ei4Var;
                            }
                            str3 = str2;
                            j5 = jM767getHeader0d7_KjU;
                        } else {
                            if (i17 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var;
                            }
                            if (i18 != 0) {
                                str2 = null;
                            }
                            if (i4 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i6 != 0) {
                                bVar2 = aVar2;
                            }
                            if ((i2 & 16) != 0) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                                i3 &= -57345;
                            } else {
                                jM767getHeader0d7_KjU = j;
                            }
                            if ((i2 & 32) != 0) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                                i3 &= -458753;
                            } else {
                                jM771getOnHeader0d7_KjU = j2;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-883388004);
                                objF = bj4VarO.f();
                                if (objF == obj) {
                                    objF = new qi5();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if (i10 != 0) {
                                ei4Var2 = null;
                            } else {
                                ei4Var2 = ei4Var;
                            }
                            str3 = str2;
                            j5 = jM767getHeader0d7_KjU;
                        }
                        bj4VarO.V();
                        aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                        ox6Var3 = ox6Var2;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, aVar);
                        bt1.c.getClass();
                        aVar3 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        cVar = bt1.a.f;
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        eVar = bt1.a.e;
                        rd7.d(bj4VarO, eVar, kw7VarP);
                        Integer numValueOf16 = Integer.valueOf(iHashCode);
                        bVar3 = bt1.a.g;
                        rd7.d(bj4VarO, bVar3, numValueOf16);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        intercomTopBarIcon3 = intercomTopBarIcon2;
                        j6 = j5;
                        ox6 ox6VarK16 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                        bj4VarO.K(86796077);
                        if ((i3 & 3670016) == 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF2 = bj4VarO.f();
                        if (z) {
                            z2 = false;
                            objF2 = new ri5(false ? 1 : 0, mh4Var2);
                            bj4VarO.C(objF2);
                        } else {
                            z2 = false;
                            objF2 = new ri5(false ? 1 : 0, mh4Var2);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(z2);
                        ox6 ox6VarC110 = we1.c(ox6VarK16, z2, null, (mh4) objF2, 15);
                        fl6VarD = dv0.d(di.a.a, z2);
                        mh4Var3 = mh4Var2;
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, ox6VarC110);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, fl6VarD);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        if (intercomTopBarIcon3 != null) {
                            f = 16.0f;
                        } else {
                            f = 16.0f;
                        }
                        ox6 ox6VarM16 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                        i13 = i3 >> 3;
                        aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                        iHashCode3 = Long.hashCode(bj4VarO.T);
                        kw7VarP3 = bj4VarO.P();
                        ox6VarC3 = it1.c(bj4VarO, ox6VarM16);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA2);
                        rd7.d(bj4VarO, eVar, kw7VarP3);
                        l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC3);
                        bj4VarO.K(560412879);
                        if (str3 != null) {
                            i14 = 6;
                            ox6Var4 = null;
                            mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                            bj4Var = bj4VarO;
                        } else {
                            ox6Var4 = null;
                            bj4Var = bj4VarO;
                            i14 = 6;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.K(-1319827237);
                        kv0Var = kv0.a;
                        i15 = i14;
                        if (intercomTopBarIcon3 != null) {
                            h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                public final void invoke(jt1 jt1Var2, int i20) {
                                    if ((i20 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else {
                                        m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                        }
                        bj4Var.U(false);
                        bj4Var.K(-1319809649);
                        ei4Var3 = ei4Var2;
                        if (ei4Var3 != null) {
                            ox6 ox6VarF16 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                            ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, ox6VarF16);
                            if (j1bVar == null) {
                                ml5.c();
                                throw ox6Var4;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar3);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                            r1 = 1;
                            bj4Var.U(true);
                        } else {
                            r1 = 1;
                        }
                        bj4Var.U(false);
                        bj4Var.U(r1);
                        IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                        bj4Var.U(r1);
                        mh4Var4 = mh4Var3;
                        ox6Var5 = ox6Var3;
                        ei4Var4 = ei4Var3;
                        str4 = str3;
                        bVar4 = bVar2;
                        j7 = jM771getOnHeader0d7_KjU;
                        intercomTopBarIcon4 = intercomTopBarIcon3;
                        j8 = j6;
                        bj4Var2 = bj4Var;
                    } else {
                        bj4VarO.v0();
                        i12 = i & 1;
                        aVar = ox6.a.t;
                        obj = jt1.a.a;
                        aVar2 = di.a.m;
                        if (i12 != 0) {
                            if (i17 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var;
                            }
                            if (i18 != 0) {
                                str2 = null;
                            }
                            if (i4 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i6 != 0) {
                                bVar2 = aVar2;
                            }
                            if ((i2 & 16) != 0) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                                i3 &= -57345;
                            } else {
                                jM767getHeader0d7_KjU = j;
                            }
                            if ((i2 & 32) != 0) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                                i3 &= -458753;
                            } else {
                                jM771getOnHeader0d7_KjU = j2;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-883388004);
                                objF = bj4VarO.f();
                                if (objF == obj) {
                                    objF = new qi5();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if (i10 != 0) {
                                ei4Var2 = null;
                            } else {
                                ei4Var2 = ei4Var;
                            }
                            str3 = str2;
                            j5 = jM767getHeader0d7_KjU;
                        } else {
                            if (i17 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var;
                            }
                            if (i18 != 0) {
                                str2 = null;
                            }
                            if (i4 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i6 != 0) {
                                bVar2 = aVar2;
                            }
                            if ((i2 & 16) != 0) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                                i3 &= -57345;
                            } else {
                                jM767getHeader0d7_KjU = j;
                            }
                            if ((i2 & 32) != 0) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                                i3 &= -458753;
                            } else {
                                jM771getOnHeader0d7_KjU = j2;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-883388004);
                                objF = bj4VarO.f();
                                if (objF == obj) {
                                    objF = new qi5();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if (i10 != 0) {
                                ei4Var2 = null;
                            } else {
                                ei4Var2 = ei4Var;
                            }
                            str3 = str2;
                            j5 = jM767getHeader0d7_KjU;
                        }
                        bj4VarO.V();
                        aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                        ox6Var3 = ox6Var2;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, aVar);
                        bt1.c.getClass();
                        aVar3 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        cVar = bt1.a.f;
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        eVar = bt1.a.e;
                        rd7.d(bj4VarO, eVar, kw7VarP);
                        Integer numValueOf17 = Integer.valueOf(iHashCode);
                        bVar3 = bt1.a.g;
                        rd7.d(bj4VarO, bVar3, numValueOf17);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        intercomTopBarIcon3 = intercomTopBarIcon2;
                        j6 = j5;
                        ox6 ox6VarK17 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                        bj4VarO.K(86796077);
                        if ((i3 & 3670016) == 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF2 = bj4VarO.f();
                        if (z) {
                            z2 = false;
                            objF2 = new ri5(false ? 1 : 0, mh4Var2);
                            bj4VarO.C(objF2);
                        } else {
                            z2 = false;
                            objF2 = new ri5(false ? 1 : 0, mh4Var2);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(z2);
                        ox6 ox6VarC111 = we1.c(ox6VarK17, z2, null, (mh4) objF2, 15);
                        fl6VarD = dv0.d(di.a.a, z2);
                        mh4Var3 = mh4Var2;
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, ox6VarC111);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, fl6VarD);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        if (intercomTopBarIcon3 != null) {
                            f = 16.0f;
                        } else {
                            f = 16.0f;
                        }
                        ox6 ox6VarM17 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                        i13 = i3 >> 3;
                        aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                        iHashCode3 = Long.hashCode(bj4VarO.T);
                        kw7VarP3 = bj4VarO.P();
                        ox6VarC3 = it1.c(bj4VarO, ox6VarM17);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA2);
                        rd7.d(bj4VarO, eVar, kw7VarP3);
                        l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC3);
                        bj4VarO.K(560412879);
                        if (str3 != null) {
                            i14 = 6;
                            ox6Var4 = null;
                            mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                            bj4Var = bj4VarO;
                        } else {
                            ox6Var4 = null;
                            bj4Var = bj4VarO;
                            i14 = 6;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.K(-1319827237);
                        kv0Var = kv0.a;
                        i15 = i14;
                        if (intercomTopBarIcon3 != null) {
                            h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                public final void invoke(jt1 jt1Var2, int i20) {
                                    if ((i20 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else {
                                        m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                        }
                        bj4Var.U(false);
                        bj4Var.K(-1319809649);
                        ei4Var3 = ei4Var2;
                        if (ei4Var3 != null) {
                            ox6 ox6VarF17 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                            ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, ox6VarF17);
                            if (j1bVar == null) {
                                ml5.c();
                                throw ox6Var4;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar3);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                            r1 = 1;
                            bj4Var.U(true);
                        } else {
                            r1 = 1;
                        }
                        bj4Var.U(false);
                        bj4Var.U(r1);
                        IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                        bj4Var.U(r1);
                        mh4Var4 = mh4Var3;
                        ox6Var5 = ox6Var3;
                        ei4Var4 = ei4Var3;
                        str4 = str3;
                        bVar4 = bVar2;
                        j7 = jM771getOnHeader0d7_KjU;
                        intercomTopBarIcon4 = intercomTopBarIcon3;
                        j8 = j6;
                        bj4Var2 = bj4Var;
                    }
                    xj8VarW = bj4Var2.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: si5
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$8(ox6Var5, str4, intercomTopBarIcon4, bVar4, j8, j7, mh4Var4, ei4Var4, i, i2, (jt1) obj2, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) == 4793490) {
                    bj4VarO.v0();
                    i12 = i & 1;
                    aVar = ox6.a.t;
                    obj = jt1.a.a;
                    aVar2 = di.a.m;
                    if (i12 != 0) {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    } else {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    }
                    bj4VarO.V();
                    aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                    ox6Var3 = ox6Var2;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, aVar);
                    bt1.c.getClass();
                    aVar3 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf18 = Integer.valueOf(iHashCode);
                    bVar3 = bt1.a.g;
                    rd7.d(bj4VarO, bVar3, numValueOf18);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    j6 = j5;
                    ox6 ox6VarK18 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                    bj4VarO.K(86796077);
                    if ((i3 & 3670016) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z) {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    } else {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(z2);
                    ox6 ox6VarC112 = we1.c(ox6VarK18, z2, null, (mh4) objF2, 15);
                    fl6VarD = dv0.d(di.a.a, z2);
                    mh4Var3 = mh4Var2;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarC112);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    if (intercomTopBarIcon3 != null) {
                        f = 16.0f;
                    } else {
                        f = 16.0f;
                    }
                    ox6 ox6VarM18 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                    i13 = i3 >> 3;
                    aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarM18);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    bj4VarO.K(560412879);
                    if (str3 != null) {
                        i14 = 6;
                        ox6Var4 = null;
                        mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                        bj4Var = bj4VarO;
                    } else {
                        ox6Var4 = null;
                        bj4Var = bj4VarO;
                        i14 = 6;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.K(-1319827237);
                    kv0Var = kv0.a;
                    i15 = i14;
                    if (intercomTopBarIcon3 != null) {
                        h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            public final void invoke(jt1 jt1Var2, int i20) {
                                if ((i20 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                    }
                    bj4Var.U(false);
                    bj4Var.K(-1319809649);
                    ei4Var3 = ei4Var2;
                    if (ei4Var3 != null) {
                        ox6 ox6VarF18 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                        ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, ox6VarF18);
                        if (j1bVar == null) {
                            ml5.c();
                            throw ox6Var4;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar3);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                        r1 = 1;
                        bj4Var.U(true);
                    } else {
                        r1 = 1;
                    }
                    bj4Var.U(false);
                    bj4Var.U(r1);
                    IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                    bj4Var.U(r1);
                    mh4Var4 = mh4Var3;
                    ox6Var5 = ox6Var3;
                    ei4Var4 = ei4Var3;
                    str4 = str3;
                    bVar4 = bVar2;
                    j7 = jM771getOnHeader0d7_KjU;
                    intercomTopBarIcon4 = intercomTopBarIcon3;
                    j8 = j6;
                    bj4Var2 = bj4Var;
                } else {
                    bj4VarO.v0();
                    i12 = i & 1;
                    aVar = ox6.a.t;
                    obj = jt1.a.a;
                    aVar2 = di.a.m;
                    if (i12 != 0) {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    } else {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    }
                    bj4VarO.V();
                    aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                    ox6Var3 = ox6Var2;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, aVar);
                    bt1.c.getClass();
                    aVar3 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf19 = Integer.valueOf(iHashCode);
                    bVar3 = bt1.a.g;
                    rd7.d(bj4VarO, bVar3, numValueOf19);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    j6 = j5;
                    ox6 ox6VarK19 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                    bj4VarO.K(86796077);
                    if ((i3 & 3670016) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z) {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    } else {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(z2);
                    ox6 ox6VarC113 = we1.c(ox6VarK19, z2, null, (mh4) objF2, 15);
                    fl6VarD = dv0.d(di.a.a, z2);
                    mh4Var3 = mh4Var2;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarC113);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    if (intercomTopBarIcon3 != null) {
                        f = 16.0f;
                    } else {
                        f = 16.0f;
                    }
                    ox6 ox6VarM19 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                    i13 = i3 >> 3;
                    aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarM19);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    bj4VarO.K(560412879);
                    if (str3 != null) {
                        i14 = 6;
                        ox6Var4 = null;
                        mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                        bj4Var = bj4VarO;
                    } else {
                        ox6Var4 = null;
                        bj4Var = bj4VarO;
                        i14 = 6;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.K(-1319827237);
                    kv0Var = kv0.a;
                    i15 = i14;
                    if (intercomTopBarIcon3 != null) {
                        h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            public final void invoke(jt1 jt1Var2, int i20) {
                                if ((i20 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                    }
                    bj4Var.U(false);
                    bj4Var.K(-1319809649);
                    ei4Var3 = ei4Var2;
                    if (ei4Var3 != null) {
                        ox6 ox6VarF19 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                        ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, ox6VarF19);
                        if (j1bVar == null) {
                            ml5.c();
                            throw ox6Var4;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar3);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                        r1 = 1;
                        bj4Var.U(true);
                    } else {
                        r1 = 1;
                    }
                    bj4Var.U(false);
                    bj4Var.U(r1);
                    IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                    bj4Var.U(r1);
                    mh4Var4 = mh4Var3;
                    ox6Var5 = ox6Var3;
                    ei4Var4 = ei4Var3;
                    str4 = str3;
                    bVar4 = bVar2;
                    j7 = jM771getOnHeader0d7_KjU;
                    intercomTopBarIcon4 = intercomTopBarIcon3;
                    j8 = j6;
                    bj4Var2 = bj4Var;
                }
                xj8VarW = bj4Var2.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: si5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$8(ox6Var5, str4, intercomTopBarIcon4, bVar4, j8, j7, mh4Var4, ei4Var4, i, i2, (jt1) obj2, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            bVar2 = bVar;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j3 = j;
                    if (bj4VarO.i(j3)) {
                    }
                    i3 |= i19;
                } else {
                    j3 = j;
                }
                i3 |= i19;
            } else {
                j3 = j;
            }
            if ((i & 196608) == 0) {
                j4 = j2;
                if ((i2 & 32) == 0) {
                    i16 = 65536;
                } else {
                    i16 = 65536;
                }
                i3 |= i16;
            } else {
                j4 = j2;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (bj4VarO.j(mh4Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i10 = i2 & 128;
            if (i10 != 0) {
                if ((i & 12582912) == 0) {
                    if (bj4VarO.j(ei4Var)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                if ((i3 & 4793491) == 4793490) {
                    bj4VarO.v0();
                    i12 = i & 1;
                    aVar = ox6.a.t;
                    obj = jt1.a.a;
                    aVar2 = di.a.m;
                    if (i12 != 0) {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    } else {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    }
                    bj4VarO.V();
                    aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                    ox6Var3 = ox6Var2;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, aVar);
                    bt1.c.getClass();
                    aVar3 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf110 = Integer.valueOf(iHashCode);
                    bVar3 = bt1.a.g;
                    rd7.d(bj4VarO, bVar3, numValueOf110);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    j6 = j5;
                    ox6 ox6VarK110 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                    bj4VarO.K(86796077);
                    if ((i3 & 3670016) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z) {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    } else {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(z2);
                    ox6 ox6VarC114 = we1.c(ox6VarK110, z2, null, (mh4) objF2, 15);
                    fl6VarD = dv0.d(di.a.a, z2);
                    mh4Var3 = mh4Var2;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarC114);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    if (intercomTopBarIcon3 != null) {
                        f = 16.0f;
                    } else {
                        f = 16.0f;
                    }
                    ox6 ox6VarM110 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                    i13 = i3 >> 3;
                    aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarM110);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    bj4VarO.K(560412879);
                    if (str3 != null) {
                        i14 = 6;
                        ox6Var4 = null;
                        mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                        bj4Var = bj4VarO;
                    } else {
                        ox6Var4 = null;
                        bj4Var = bj4VarO;
                        i14 = 6;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.K(-1319827237);
                    kv0Var = kv0.a;
                    i15 = i14;
                    if (intercomTopBarIcon3 != null) {
                        h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            public final void invoke(jt1 jt1Var2, int i20) {
                                if ((i20 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                    }
                    bj4Var.U(false);
                    bj4Var.K(-1319809649);
                    ei4Var3 = ei4Var2;
                    if (ei4Var3 != null) {
                        ox6 ox6VarF110 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                        ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, ox6VarF110);
                        if (j1bVar == null) {
                            ml5.c();
                            throw ox6Var4;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar3);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                        r1 = 1;
                        bj4Var.U(true);
                    } else {
                        r1 = 1;
                    }
                    bj4Var.U(false);
                    bj4Var.U(r1);
                    IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                    bj4Var.U(r1);
                    mh4Var4 = mh4Var3;
                    ox6Var5 = ox6Var3;
                    ei4Var4 = ei4Var3;
                    str4 = str3;
                    bVar4 = bVar2;
                    j7 = jM771getOnHeader0d7_KjU;
                    intercomTopBarIcon4 = intercomTopBarIcon3;
                    j8 = j6;
                    bj4Var2 = bj4Var;
                } else {
                    bj4VarO.v0();
                    i12 = i & 1;
                    aVar = ox6.a.t;
                    obj = jt1.a.a;
                    aVar2 = di.a.m;
                    if (i12 != 0) {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    } else {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    }
                    bj4VarO.V();
                    aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                    ox6Var3 = ox6Var2;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, aVar);
                    bt1.c.getClass();
                    aVar3 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf111 = Integer.valueOf(iHashCode);
                    bVar3 = bt1.a.g;
                    rd7.d(bj4VarO, bVar3, numValueOf111);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    j6 = j5;
                    ox6 ox6VarK111 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                    bj4VarO.K(86796077);
                    if ((i3 & 3670016) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z) {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    } else {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(z2);
                    ox6 ox6VarC115 = we1.c(ox6VarK111, z2, null, (mh4) objF2, 15);
                    fl6VarD = dv0.d(di.a.a, z2);
                    mh4Var3 = mh4Var2;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarC115);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    if (intercomTopBarIcon3 != null) {
                        f = 16.0f;
                    } else {
                        f = 16.0f;
                    }
                    ox6 ox6VarM111 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                    i13 = i3 >> 3;
                    aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarM111);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    bj4VarO.K(560412879);
                    if (str3 != null) {
                        i14 = 6;
                        ox6Var4 = null;
                        mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                        bj4Var = bj4VarO;
                    } else {
                        ox6Var4 = null;
                        bj4Var = bj4VarO;
                        i14 = 6;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.K(-1319827237);
                    kv0Var = kv0.a;
                    i15 = i14;
                    if (intercomTopBarIcon3 != null) {
                        h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            public final void invoke(jt1 jt1Var2, int i20) {
                                if ((i20 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                    }
                    bj4Var.U(false);
                    bj4Var.K(-1319809649);
                    ei4Var3 = ei4Var2;
                    if (ei4Var3 != null) {
                        ox6 ox6VarF111 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                        ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, ox6VarF111);
                        if (j1bVar == null) {
                            ml5.c();
                            throw ox6Var4;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar3);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                        r1 = 1;
                        bj4Var.U(true);
                    } else {
                        r1 = 1;
                    }
                    bj4Var.U(false);
                    bj4Var.U(r1);
                    IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                    bj4Var.U(r1);
                    mh4Var4 = mh4Var3;
                    ox6Var5 = ox6Var3;
                    ei4Var4 = ei4Var3;
                    str4 = str3;
                    bVar4 = bVar2;
                    j7 = jM771getOnHeader0d7_KjU;
                    intercomTopBarIcon4 = intercomTopBarIcon3;
                    j8 = j6;
                    bj4Var2 = bj4Var;
                }
                xj8VarW = bj4Var2.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: si5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$8(ox6Var5, str4, intercomTopBarIcon4, bVar4, j8, j7, mh4Var4, ei4Var4, i, i2, (jt1) obj2, iIntValue);
                        }
                    };
                }
            }
            i3 |= 12582912;
            if ((i3 & 4793491) == 4793490) {
                bj4VarO.v0();
                i12 = i & 1;
                aVar = ox6.a.t;
                obj = jt1.a.a;
                aVar2 = di.a.m;
                if (i12 != 0) {
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i4 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i6 != 0) {
                        bVar2 = aVar2;
                    }
                    if ((i2 & 16) != 0) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM767getHeader0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM771getOnHeader0d7_KjU = j2;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-883388004);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new qi5();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if (i10 != 0) {
                        ei4Var2 = null;
                    } else {
                        ei4Var2 = ei4Var;
                    }
                    str3 = str2;
                    j5 = jM767getHeader0d7_KjU;
                } else {
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i4 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i6 != 0) {
                        bVar2 = aVar2;
                    }
                    if ((i2 & 16) != 0) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM767getHeader0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM771getOnHeader0d7_KjU = j2;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-883388004);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new qi5();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if (i10 != 0) {
                        ei4Var2 = null;
                    } else {
                        ei4Var2 = ei4Var;
                    }
                    str3 = str2;
                    j5 = jM767getHeader0d7_KjU;
                }
                bj4VarO.V();
                aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                ox6Var3 = ox6Var2;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, aVar);
                bt1.c.getClass();
                aVar3 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, aj1VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf112 = Integer.valueOf(iHashCode);
                bVar3 = bt1.a.g;
                rd7.d(bj4VarO, bVar3, numValueOf112);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                intercomTopBarIcon3 = intercomTopBarIcon2;
                j6 = j5;
                ox6 ox6VarK112 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                bj4VarO.K(86796077);
                if ((i3 & 3670016) == 1048576) {
                    z = true;
                } else {
                    z = false;
                }
                objF2 = bj4VarO.f();
                if (z) {
                    z2 = false;
                    objF2 = new ri5(false ? 1 : 0, mh4Var2);
                    bj4VarO.C(objF2);
                } else {
                    z2 = false;
                    objF2 = new ri5(false ? 1 : 0, mh4Var2);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(z2);
                ox6 ox6VarC116 = we1.c(ox6VarK112, z2, null, (mh4) objF2, 15);
                fl6VarD = dv0.d(di.a.a, z2);
                mh4Var3 = mh4Var2;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC116);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                if (intercomTopBarIcon3 != null) {
                    f = 16.0f;
                } else {
                    f = 16.0f;
                }
                ox6 ox6VarM112 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                i13 = i3 >> 3;
                aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, ox6VarM112);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                bj4VarO.K(560412879);
                if (str3 != null) {
                    i14 = 6;
                    ox6Var4 = null;
                    mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                    bj4Var = bj4VarO;
                } else {
                    ox6Var4 = null;
                    bj4Var = bj4VarO;
                    i14 = 6;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.K(-1319827237);
                kv0Var = kv0.a;
                i15 = i14;
                if (intercomTopBarIcon3 != null) {
                    h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        public final void invoke(jt1 jt1Var2, int i20) {
                            if ((i20 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                }
                bj4Var.U(false);
                bj4Var.K(-1319809649);
                ei4Var3 = ei4Var2;
                if (ei4Var3 != null) {
                    ox6 ox6VarF112 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                    iHashCode4 = Long.hashCode(bj4Var.T);
                    kw7VarP4 = bj4Var.P();
                    ox6VarC4 = it1.c(bj4Var, ox6VarF112);
                    if (j1bVar == null) {
                        ml5.c();
                        throw ox6Var4;
                    }
                    bj4Var.q();
                    if (bj4Var.S) {
                        bj4Var.k(aVar3);
                    } else {
                        bj4Var.z();
                    }
                    rd7.d(bj4Var, cVar, ny8VarA);
                    rd7.d(bj4Var, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                    rd7.d(bj4Var, dVar, ox6VarC4);
                    ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                    r1 = 1;
                    bj4Var.U(true);
                } else {
                    r1 = 1;
                }
                bj4Var.U(false);
                bj4Var.U(r1);
                IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                bj4Var.U(r1);
                mh4Var4 = mh4Var3;
                ox6Var5 = ox6Var3;
                ei4Var4 = ei4Var3;
                str4 = str3;
                bVar4 = bVar2;
                j7 = jM771getOnHeader0d7_KjU;
                intercomTopBarIcon4 = intercomTopBarIcon3;
                j8 = j6;
                bj4Var2 = bj4Var;
            } else {
                bj4VarO.v0();
                i12 = i & 1;
                aVar = ox6.a.t;
                obj = jt1.a.a;
                aVar2 = di.a.m;
                if (i12 != 0) {
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i4 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i6 != 0) {
                        bVar2 = aVar2;
                    }
                    if ((i2 & 16) != 0) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM767getHeader0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM771getOnHeader0d7_KjU = j2;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-883388004);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new qi5();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if (i10 != 0) {
                        ei4Var2 = null;
                    } else {
                        ei4Var2 = ei4Var;
                    }
                    str3 = str2;
                    j5 = jM767getHeader0d7_KjU;
                } else {
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i4 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i6 != 0) {
                        bVar2 = aVar2;
                    }
                    if ((i2 & 16) != 0) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM767getHeader0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM771getOnHeader0d7_KjU = j2;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-883388004);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new qi5();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if (i10 != 0) {
                        ei4Var2 = null;
                    } else {
                        ei4Var2 = ei4Var;
                    }
                    str3 = str2;
                    j5 = jM767getHeader0d7_KjU;
                }
                bj4VarO.V();
                aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                ox6Var3 = ox6Var2;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, aVar);
                bt1.c.getClass();
                aVar3 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, aj1VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf113 = Integer.valueOf(iHashCode);
                bVar3 = bt1.a.g;
                rd7.d(bj4VarO, bVar3, numValueOf113);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                intercomTopBarIcon3 = intercomTopBarIcon2;
                j6 = j5;
                ox6 ox6VarK113 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                bj4VarO.K(86796077);
                if ((i3 & 3670016) == 1048576) {
                    z = true;
                } else {
                    z = false;
                }
                objF2 = bj4VarO.f();
                if (z) {
                    z2 = false;
                    objF2 = new ri5(false ? 1 : 0, mh4Var2);
                    bj4VarO.C(objF2);
                } else {
                    z2 = false;
                    objF2 = new ri5(false ? 1 : 0, mh4Var2);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(z2);
                ox6 ox6VarC117 = we1.c(ox6VarK113, z2, null, (mh4) objF2, 15);
                fl6VarD = dv0.d(di.a.a, z2);
                mh4Var3 = mh4Var2;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC117);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                if (intercomTopBarIcon3 != null) {
                    f = 16.0f;
                } else {
                    f = 16.0f;
                }
                ox6 ox6VarM113 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                i13 = i3 >> 3;
                aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, ox6VarM113);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                bj4VarO.K(560412879);
                if (str3 != null) {
                    i14 = 6;
                    ox6Var4 = null;
                    mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                    bj4Var = bj4VarO;
                } else {
                    ox6Var4 = null;
                    bj4Var = bj4VarO;
                    i14 = 6;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.K(-1319827237);
                kv0Var = kv0.a;
                i15 = i14;
                if (intercomTopBarIcon3 != null) {
                    h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        public final void invoke(jt1 jt1Var2, int i20) {
                            if ((i20 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                }
                bj4Var.U(false);
                bj4Var.K(-1319809649);
                ei4Var3 = ei4Var2;
                if (ei4Var3 != null) {
                    ox6 ox6VarF113 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                    iHashCode4 = Long.hashCode(bj4Var.T);
                    kw7VarP4 = bj4Var.P();
                    ox6VarC4 = it1.c(bj4Var, ox6VarF113);
                    if (j1bVar == null) {
                        ml5.c();
                        throw ox6Var4;
                    }
                    bj4Var.q();
                    if (bj4Var.S) {
                        bj4Var.k(aVar3);
                    } else {
                        bj4Var.z();
                    }
                    rd7.d(bj4Var, cVar, ny8VarA);
                    rd7.d(bj4Var, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                    rd7.d(bj4Var, dVar, ox6VarC4);
                    ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                    r1 = 1;
                    bj4Var.U(true);
                } else {
                    r1 = 1;
                }
                bj4Var.U(false);
                bj4Var.U(r1);
                IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                bj4Var.U(r1);
                mh4Var4 = mh4Var3;
                ox6Var5 = ox6Var3;
                ei4Var4 = ei4Var3;
                str4 = str3;
                bVar4 = bVar2;
                j7 = jM771getOnHeader0d7_KjU;
                intercomTopBarIcon4 = intercomTopBarIcon3;
                j8 = j6;
                bj4Var2 = bj4Var;
            }
            xj8VarW = bj4Var2.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: si5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$8(ox6Var5, str4, intercomTopBarIcon4, bVar4, j8, j7, mh4Var4, ei4Var4, i, i2, (jt1) obj2, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        intercomTopBarIcon2 = intercomTopBarIcon;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                bVar2 = bVar;
                if (bj4VarO.J(bVar2)) {
                    i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j3 = j;
                    if (bj4VarO.i(j3)) {
                    }
                    i3 |= i19;
                } else {
                    j3 = j;
                }
                i3 |= i19;
            } else {
                j3 = j;
            }
            if ((i & 196608) == 0) {
                j4 = j2;
                if ((i2 & 32) == 0) {
                    i16 = 65536;
                } else {
                    i16 = 65536;
                }
                i3 |= i16;
            } else {
                j4 = j2;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (bj4VarO.j(mh4Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i10 = i2 & 128;
            if (i10 != 0) {
                if ((i & 12582912) == 0) {
                    if (bj4VarO.j(ei4Var)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                if ((i3 & 4793491) == 4793490) {
                    bj4VarO.v0();
                    i12 = i & 1;
                    aVar = ox6.a.t;
                    obj = jt1.a.a;
                    aVar2 = di.a.m;
                    if (i12 != 0) {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    } else {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    }
                    bj4VarO.V();
                    aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                    ox6Var3 = ox6Var2;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, aVar);
                    bt1.c.getClass();
                    aVar3 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf114 = Integer.valueOf(iHashCode);
                    bVar3 = bt1.a.g;
                    rd7.d(bj4VarO, bVar3, numValueOf114);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    j6 = j5;
                    ox6 ox6VarK114 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                    bj4VarO.K(86796077);
                    if ((i3 & 3670016) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z) {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    } else {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(z2);
                    ox6 ox6VarC118 = we1.c(ox6VarK114, z2, null, (mh4) objF2, 15);
                    fl6VarD = dv0.d(di.a.a, z2);
                    mh4Var3 = mh4Var2;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarC118);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    if (intercomTopBarIcon3 != null) {
                        f = 16.0f;
                    } else {
                        f = 16.0f;
                    }
                    ox6 ox6VarM114 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                    i13 = i3 >> 3;
                    aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarM114);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    bj4VarO.K(560412879);
                    if (str3 != null) {
                        i14 = 6;
                        ox6Var4 = null;
                        mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                        bj4Var = bj4VarO;
                    } else {
                        ox6Var4 = null;
                        bj4Var = bj4VarO;
                        i14 = 6;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.K(-1319827237);
                    kv0Var = kv0.a;
                    i15 = i14;
                    if (intercomTopBarIcon3 != null) {
                        h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            public final void invoke(jt1 jt1Var2, int i20) {
                                if ((i20 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                    }
                    bj4Var.U(false);
                    bj4Var.K(-1319809649);
                    ei4Var3 = ei4Var2;
                    if (ei4Var3 != null) {
                        ox6 ox6VarF114 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                        ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, ox6VarF114);
                        if (j1bVar == null) {
                            ml5.c();
                            throw ox6Var4;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar3);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                        r1 = 1;
                        bj4Var.U(true);
                    } else {
                        r1 = 1;
                    }
                    bj4Var.U(false);
                    bj4Var.U(r1);
                    IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                    bj4Var.U(r1);
                    mh4Var4 = mh4Var3;
                    ox6Var5 = ox6Var3;
                    ei4Var4 = ei4Var3;
                    str4 = str3;
                    bVar4 = bVar2;
                    j7 = jM771getOnHeader0d7_KjU;
                    intercomTopBarIcon4 = intercomTopBarIcon3;
                    j8 = j6;
                    bj4Var2 = bj4Var;
                } else {
                    bj4VarO.v0();
                    i12 = i & 1;
                    aVar = ox6.a.t;
                    obj = jt1.a.a;
                    aVar2 = di.a.m;
                    if (i12 != 0) {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    } else {
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i6 != 0) {
                            bVar2 = aVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM767getHeader0d7_KjU = j;
                        }
                        if ((i2 & 32) != 0) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM771getOnHeader0d7_KjU = j2;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-883388004);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new qi5();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if (i10 != 0) {
                            ei4Var2 = null;
                        } else {
                            ei4Var2 = ei4Var;
                        }
                        str3 = str2;
                        j5 = jM767getHeader0d7_KjU;
                    }
                    bj4VarO.V();
                    aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                    ox6Var3 = ox6Var2;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, aVar);
                    bt1.c.getClass();
                    aVar3 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf115 = Integer.valueOf(iHashCode);
                    bVar3 = bt1.a.g;
                    rd7.d(bj4VarO, bVar3, numValueOf115);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    j6 = j5;
                    ox6 ox6VarK115 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                    bj4VarO.K(86796077);
                    if ((i3 & 3670016) == 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z) {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    } else {
                        z2 = false;
                        objF2 = new ri5(false ? 1 : 0, mh4Var2);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(z2);
                    ox6 ox6VarC119 = we1.c(ox6VarK115, z2, null, (mh4) objF2, 15);
                    fl6VarD = dv0.d(di.a.a, z2);
                    mh4Var3 = mh4Var2;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarC119);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    if (intercomTopBarIcon3 != null) {
                        f = 16.0f;
                    } else {
                        f = 16.0f;
                    }
                    ox6 ox6VarM115 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                    i13 = i3 >> 3;
                    aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarM115);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    bj4VarO.K(560412879);
                    if (str3 != null) {
                        i14 = 6;
                        ox6Var4 = null;
                        mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                        bj4Var = bj4VarO;
                    } else {
                        ox6Var4 = null;
                        bj4Var = bj4VarO;
                        i14 = 6;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.K(-1319827237);
                    kv0Var = kv0.a;
                    i15 = i14;
                    if (intercomTopBarIcon3 != null) {
                        h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            public final void invoke(jt1 jt1Var2, int i20) {
                                if ((i20 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                    }
                    bj4Var.U(false);
                    bj4Var.K(-1319809649);
                    ei4Var3 = ei4Var2;
                    if (ei4Var3 != null) {
                        ox6 ox6VarF115 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                        ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, ox6VarF115);
                        if (j1bVar == null) {
                            ml5.c();
                            throw ox6Var4;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar3);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                        r1 = 1;
                        bj4Var.U(true);
                    } else {
                        r1 = 1;
                    }
                    bj4Var.U(false);
                    bj4Var.U(r1);
                    IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                    bj4Var.U(r1);
                    mh4Var4 = mh4Var3;
                    ox6Var5 = ox6Var3;
                    ei4Var4 = ei4Var3;
                    str4 = str3;
                    bVar4 = bVar2;
                    j7 = jM771getOnHeader0d7_KjU;
                    intercomTopBarIcon4 = intercomTopBarIcon3;
                    j8 = j6;
                    bj4Var2 = bj4Var;
                }
                xj8VarW = bj4Var2.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: si5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$8(ox6Var5, str4, intercomTopBarIcon4, bVar4, j8, j7, mh4Var4, ei4Var4, i, i2, (jt1) obj2, iIntValue);
                        }
                    };
                }
            }
            i3 |= 12582912;
            if ((i3 & 4793491) == 4793490) {
                bj4VarO.v0();
                i12 = i & 1;
                aVar = ox6.a.t;
                obj = jt1.a.a;
                aVar2 = di.a.m;
                if (i12 != 0) {
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i4 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i6 != 0) {
                        bVar2 = aVar2;
                    }
                    if ((i2 & 16) != 0) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM767getHeader0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM771getOnHeader0d7_KjU = j2;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-883388004);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new qi5();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if (i10 != 0) {
                        ei4Var2 = null;
                    } else {
                        ei4Var2 = ei4Var;
                    }
                    str3 = str2;
                    j5 = jM767getHeader0d7_KjU;
                } else {
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i4 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i6 != 0) {
                        bVar2 = aVar2;
                    }
                    if ((i2 & 16) != 0) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM767getHeader0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM771getOnHeader0d7_KjU = j2;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-883388004);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new qi5();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if (i10 != 0) {
                        ei4Var2 = null;
                    } else {
                        ei4Var2 = ei4Var;
                    }
                    str3 = str2;
                    j5 = jM767getHeader0d7_KjU;
                }
                bj4VarO.V();
                aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                ox6Var3 = ox6Var2;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, aVar);
                bt1.c.getClass();
                aVar3 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, aj1VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf116 = Integer.valueOf(iHashCode);
                bVar3 = bt1.a.g;
                rd7.d(bj4VarO, bVar3, numValueOf116);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                intercomTopBarIcon3 = intercomTopBarIcon2;
                j6 = j5;
                ox6 ox6VarK116 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                bj4VarO.K(86796077);
                if ((i3 & 3670016) == 1048576) {
                    z = true;
                } else {
                    z = false;
                }
                objF2 = bj4VarO.f();
                if (z) {
                    z2 = false;
                    objF2 = new ri5(false ? 1 : 0, mh4Var2);
                    bj4VarO.C(objF2);
                } else {
                    z2 = false;
                    objF2 = new ri5(false ? 1 : 0, mh4Var2);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(z2);
                ox6 ox6VarC1110 = we1.c(ox6VarK116, z2, null, (mh4) objF2, 15);
                fl6VarD = dv0.d(di.a.a, z2);
                mh4Var3 = mh4Var2;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC1110);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                if (intercomTopBarIcon3 != null) {
                    f = 16.0f;
                } else {
                    f = 16.0f;
                }
                ox6 ox6VarM116 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                i13 = i3 >> 3;
                aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, ox6VarM116);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                bj4VarO.K(560412879);
                if (str3 != null) {
                    i14 = 6;
                    ox6Var4 = null;
                    mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                    bj4Var = bj4VarO;
                } else {
                    ox6Var4 = null;
                    bj4Var = bj4VarO;
                    i14 = 6;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.K(-1319827237);
                kv0Var = kv0.a;
                i15 = i14;
                if (intercomTopBarIcon3 != null) {
                    h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        public final void invoke(jt1 jt1Var2, int i20) {
                            if ((i20 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                }
                bj4Var.U(false);
                bj4Var.K(-1319809649);
                ei4Var3 = ei4Var2;
                if (ei4Var3 != null) {
                    ox6 ox6VarF116 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                    iHashCode4 = Long.hashCode(bj4Var.T);
                    kw7VarP4 = bj4Var.P();
                    ox6VarC4 = it1.c(bj4Var, ox6VarF116);
                    if (j1bVar == null) {
                        ml5.c();
                        throw ox6Var4;
                    }
                    bj4Var.q();
                    if (bj4Var.S) {
                        bj4Var.k(aVar3);
                    } else {
                        bj4Var.z();
                    }
                    rd7.d(bj4Var, cVar, ny8VarA);
                    rd7.d(bj4Var, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                    rd7.d(bj4Var, dVar, ox6VarC4);
                    ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                    r1 = 1;
                    bj4Var.U(true);
                } else {
                    r1 = 1;
                }
                bj4Var.U(false);
                bj4Var.U(r1);
                IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                bj4Var.U(r1);
                mh4Var4 = mh4Var3;
                ox6Var5 = ox6Var3;
                ei4Var4 = ei4Var3;
                str4 = str3;
                bVar4 = bVar2;
                j7 = jM771getOnHeader0d7_KjU;
                intercomTopBarIcon4 = intercomTopBarIcon3;
                j8 = j6;
                bj4Var2 = bj4Var;
            } else {
                bj4VarO.v0();
                i12 = i & 1;
                aVar = ox6.a.t;
                obj = jt1.a.a;
                aVar2 = di.a.m;
                if (i12 != 0) {
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i4 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i6 != 0) {
                        bVar2 = aVar2;
                    }
                    if ((i2 & 16) != 0) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM767getHeader0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM771getOnHeader0d7_KjU = j2;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-883388004);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new qi5();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if (i10 != 0) {
                        ei4Var2 = null;
                    } else {
                        ei4Var2 = ei4Var;
                    }
                    str3 = str2;
                    j5 = jM767getHeader0d7_KjU;
                } else {
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i4 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i6 != 0) {
                        bVar2 = aVar2;
                    }
                    if ((i2 & 16) != 0) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM767getHeader0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM771getOnHeader0d7_KjU = j2;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-883388004);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new qi5();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if (i10 != 0) {
                        ei4Var2 = null;
                    } else {
                        ei4Var2 = ei4Var;
                    }
                    str3 = str2;
                    j5 = jM767getHeader0d7_KjU;
                }
                bj4VarO.V();
                aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                ox6Var3 = ox6Var2;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, aVar);
                bt1.c.getClass();
                aVar3 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, aj1VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf117 = Integer.valueOf(iHashCode);
                bVar3 = bt1.a.g;
                rd7.d(bj4VarO, bVar3, numValueOf117);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                intercomTopBarIcon3 = intercomTopBarIcon2;
                j6 = j5;
                ox6 ox6VarK117 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                bj4VarO.K(86796077);
                if ((i3 & 3670016) == 1048576) {
                    z = true;
                } else {
                    z = false;
                }
                objF2 = bj4VarO.f();
                if (z) {
                    z2 = false;
                    objF2 = new ri5(false ? 1 : 0, mh4Var2);
                    bj4VarO.C(objF2);
                } else {
                    z2 = false;
                    objF2 = new ri5(false ? 1 : 0, mh4Var2);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(z2);
                ox6 ox6VarC1111 = we1.c(ox6VarK117, z2, null, (mh4) objF2, 15);
                fl6VarD = dv0.d(di.a.a, z2);
                mh4Var3 = mh4Var2;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC1111);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                if (intercomTopBarIcon3 != null) {
                    f = 16.0f;
                } else {
                    f = 16.0f;
                }
                ox6 ox6VarM117 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                i13 = i3 >> 3;
                aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, ox6VarM117);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                bj4VarO.K(560412879);
                if (str3 != null) {
                    i14 = 6;
                    ox6Var4 = null;
                    mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                    bj4Var = bj4VarO;
                } else {
                    ox6Var4 = null;
                    bj4Var = bj4VarO;
                    i14 = 6;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.K(-1319827237);
                kv0Var = kv0.a;
                i15 = i14;
                if (intercomTopBarIcon3 != null) {
                    h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        public final void invoke(jt1 jt1Var2, int i20) {
                            if ((i20 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                }
                bj4Var.U(false);
                bj4Var.K(-1319809649);
                ei4Var3 = ei4Var2;
                if (ei4Var3 != null) {
                    ox6 ox6VarF117 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                    iHashCode4 = Long.hashCode(bj4Var.T);
                    kw7VarP4 = bj4Var.P();
                    ox6VarC4 = it1.c(bj4Var, ox6VarF117);
                    if (j1bVar == null) {
                        ml5.c();
                        throw ox6Var4;
                    }
                    bj4Var.q();
                    if (bj4Var.S) {
                        bj4Var.k(aVar3);
                    } else {
                        bj4Var.z();
                    }
                    rd7.d(bj4Var, cVar, ny8VarA);
                    rd7.d(bj4Var, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                    rd7.d(bj4Var, dVar, ox6VarC4);
                    ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                    r1 = 1;
                    bj4Var.U(true);
                } else {
                    r1 = 1;
                }
                bj4Var.U(false);
                bj4Var.U(r1);
                IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                bj4Var.U(r1);
                mh4Var4 = mh4Var3;
                ox6Var5 = ox6Var3;
                ei4Var4 = ei4Var3;
                str4 = str3;
                bVar4 = bVar2;
                j7 = jM771getOnHeader0d7_KjU;
                intercomTopBarIcon4 = intercomTopBarIcon3;
                j8 = j6;
                bj4Var2 = bj4Var;
            }
            xj8VarW = bj4Var2.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: si5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$8(ox6Var5, str4, intercomTopBarIcon4, bVar4, j8, j7, mh4Var4, ei4Var4, i, i2, (jt1) obj2, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        bVar2 = bVar;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                j3 = j;
                if (bj4VarO.i(j3)) {
                }
                i3 |= i19;
            } else {
                j3 = j;
            }
            i3 |= i19;
        } else {
            j3 = j;
        }
        if ((i & 196608) == 0) {
            j4 = j2;
            if ((i2 & 32) == 0) {
                i16 = 65536;
            } else {
                i16 = 65536;
            }
            i3 |= i16;
        } else {
            j4 = j2;
        }
        i8 = i2 & 64;
        if (i8 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (bj4VarO.j(mh4Var)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        i10 = i2 & 128;
        if (i10 != 0) {
            if ((i & 12582912) == 0) {
                if (bj4VarO.j(ei4Var)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            }
            if ((i3 & 4793491) == 4793490) {
                bj4VarO.v0();
                i12 = i & 1;
                aVar = ox6.a.t;
                obj = jt1.a.a;
                aVar2 = di.a.m;
                if (i12 != 0) {
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i4 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i6 != 0) {
                        bVar2 = aVar2;
                    }
                    if ((i2 & 16) != 0) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM767getHeader0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM771getOnHeader0d7_KjU = j2;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-883388004);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new qi5();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if (i10 != 0) {
                        ei4Var2 = null;
                    } else {
                        ei4Var2 = ei4Var;
                    }
                    str3 = str2;
                    j5 = jM767getHeader0d7_KjU;
                } else {
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i4 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i6 != 0) {
                        bVar2 = aVar2;
                    }
                    if ((i2 & 16) != 0) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM767getHeader0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM771getOnHeader0d7_KjU = j2;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-883388004);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new qi5();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if (i10 != 0) {
                        ei4Var2 = null;
                    } else {
                        ei4Var2 = ei4Var;
                    }
                    str3 = str2;
                    j5 = jM767getHeader0d7_KjU;
                }
                bj4VarO.V();
                aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                ox6Var3 = ox6Var2;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, aVar);
                bt1.c.getClass();
                aVar3 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, aj1VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf118 = Integer.valueOf(iHashCode);
                bVar3 = bt1.a.g;
                rd7.d(bj4VarO, bVar3, numValueOf118);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                intercomTopBarIcon3 = intercomTopBarIcon2;
                j6 = j5;
                ox6 ox6VarK118 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                bj4VarO.K(86796077);
                if ((i3 & 3670016) == 1048576) {
                    z = true;
                } else {
                    z = false;
                }
                objF2 = bj4VarO.f();
                if (z) {
                    z2 = false;
                    objF2 = new ri5(false ? 1 : 0, mh4Var2);
                    bj4VarO.C(objF2);
                } else {
                    z2 = false;
                    objF2 = new ri5(false ? 1 : 0, mh4Var2);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(z2);
                ox6 ox6VarC1112 = we1.c(ox6VarK118, z2, null, (mh4) objF2, 15);
                fl6VarD = dv0.d(di.a.a, z2);
                mh4Var3 = mh4Var2;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC1112);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                if (intercomTopBarIcon3 != null) {
                    f = 16.0f;
                } else {
                    f = 16.0f;
                }
                ox6 ox6VarM118 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                i13 = i3 >> 3;
                aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, ox6VarM118);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                bj4VarO.K(560412879);
                if (str3 != null) {
                    i14 = 6;
                    ox6Var4 = null;
                    mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                    bj4Var = bj4VarO;
                } else {
                    ox6Var4 = null;
                    bj4Var = bj4VarO;
                    i14 = 6;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.K(-1319827237);
                kv0Var = kv0.a;
                i15 = i14;
                if (intercomTopBarIcon3 != null) {
                    h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        public final void invoke(jt1 jt1Var2, int i20) {
                            if ((i20 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                }
                bj4Var.U(false);
                bj4Var.K(-1319809649);
                ei4Var3 = ei4Var2;
                if (ei4Var3 != null) {
                    ox6 ox6VarF118 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                    iHashCode4 = Long.hashCode(bj4Var.T);
                    kw7VarP4 = bj4Var.P();
                    ox6VarC4 = it1.c(bj4Var, ox6VarF118);
                    if (j1bVar == null) {
                        ml5.c();
                        throw ox6Var4;
                    }
                    bj4Var.q();
                    if (bj4Var.S) {
                        bj4Var.k(aVar3);
                    } else {
                        bj4Var.z();
                    }
                    rd7.d(bj4Var, cVar, ny8VarA);
                    rd7.d(bj4Var, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                    rd7.d(bj4Var, dVar, ox6VarC4);
                    ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                    r1 = 1;
                    bj4Var.U(true);
                } else {
                    r1 = 1;
                }
                bj4Var.U(false);
                bj4Var.U(r1);
                IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                bj4Var.U(r1);
                mh4Var4 = mh4Var3;
                ox6Var5 = ox6Var3;
                ei4Var4 = ei4Var3;
                str4 = str3;
                bVar4 = bVar2;
                j7 = jM771getOnHeader0d7_KjU;
                intercomTopBarIcon4 = intercomTopBarIcon3;
                j8 = j6;
                bj4Var2 = bj4Var;
            } else {
                bj4VarO.v0();
                i12 = i & 1;
                aVar = ox6.a.t;
                obj = jt1.a.a;
                aVar2 = di.a.m;
                if (i12 != 0) {
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i4 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i6 != 0) {
                        bVar2 = aVar2;
                    }
                    if ((i2 & 16) != 0) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM767getHeader0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM771getOnHeader0d7_KjU = j2;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-883388004);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new qi5();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if (i10 != 0) {
                        ei4Var2 = null;
                    } else {
                        ei4Var2 = ei4Var;
                    }
                    str3 = str2;
                    j5 = jM767getHeader0d7_KjU;
                } else {
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i4 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i6 != 0) {
                        bVar2 = aVar2;
                    }
                    if ((i2 & 16) != 0) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM767getHeader0d7_KjU = j;
                    }
                    if ((i2 & 32) != 0) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM771getOnHeader0d7_KjU = j2;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-883388004);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new qi5();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if (i10 != 0) {
                        ei4Var2 = null;
                    } else {
                        ei4Var2 = ei4Var;
                    }
                    str3 = str2;
                    j5 = jM767getHeader0d7_KjU;
                }
                bj4VarO.V();
                aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
                ox6Var3 = ox6Var2;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, aVar);
                bt1.c.getClass();
                aVar3 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, aj1VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf119 = Integer.valueOf(iHashCode);
                bVar3 = bt1.a.g;
                rd7.d(bj4VarO, bVar3, numValueOf119);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                intercomTopBarIcon3 = intercomTopBarIcon2;
                j6 = j5;
                ox6 ox6VarK119 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
                bj4VarO.K(86796077);
                if ((i3 & 3670016) == 1048576) {
                    z = true;
                } else {
                    z = false;
                }
                objF2 = bj4VarO.f();
                if (z) {
                    z2 = false;
                    objF2 = new ri5(false ? 1 : 0, mh4Var2);
                    bj4VarO.C(objF2);
                } else {
                    z2 = false;
                    objF2 = new ri5(false ? 1 : 0, mh4Var2);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(z2);
                ox6 ox6VarC1113 = we1.c(ox6VarK119, z2, null, (mh4) objF2, 15);
                fl6VarD = dv0.d(di.a.a, z2);
                mh4Var3 = mh4Var2;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC1113);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                if (intercomTopBarIcon3 != null) {
                    f = 16.0f;
                } else {
                    f = 16.0f;
                }
                ox6 ox6VarM119 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
                i13 = i3 >> 3;
                aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, ox6VarM119);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                bj4VarO.K(560412879);
                if (str3 != null) {
                    i14 = 6;
                    ox6Var4 = null;
                    mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                    bj4Var = bj4VarO;
                } else {
                    ox6Var4 = null;
                    bj4Var = bj4VarO;
                    i14 = 6;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.K(-1319827237);
                kv0Var = kv0.a;
                i15 = i14;
                if (intercomTopBarIcon3 != null) {
                    h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        public final void invoke(jt1 jt1Var2, int i20) {
                            if ((i20 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
                }
                bj4Var.U(false);
                bj4Var.K(-1319809649);
                ei4Var3 = ei4Var2;
                if (ei4Var3 != null) {
                    ox6 ox6VarF119 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                    iHashCode4 = Long.hashCode(bj4Var.T);
                    kw7VarP4 = bj4Var.P();
                    ox6VarC4 = it1.c(bj4Var, ox6VarF119);
                    if (j1bVar == null) {
                        ml5.c();
                        throw ox6Var4;
                    }
                    bj4Var.q();
                    if (bj4Var.S) {
                        bj4Var.k(aVar3);
                    } else {
                        bj4Var.z();
                    }
                    rd7.d(bj4Var, cVar, ny8VarA);
                    rd7.d(bj4Var, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                    rd7.d(bj4Var, dVar, ox6VarC4);
                    ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                    r1 = 1;
                    bj4Var.U(true);
                } else {
                    r1 = 1;
                }
                bj4Var.U(false);
                bj4Var.U(r1);
                IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
                bj4Var.U(r1);
                mh4Var4 = mh4Var3;
                ox6Var5 = ox6Var3;
                ei4Var4 = ei4Var3;
                str4 = str3;
                bVar4 = bVar2;
                j7 = jM771getOnHeader0d7_KjU;
                intercomTopBarIcon4 = intercomTopBarIcon3;
                j8 = j6;
                bj4Var2 = bj4Var;
            }
            xj8VarW = bj4Var2.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: si5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$8(ox6Var5, str4, intercomTopBarIcon4, bVar4, j8, j7, mh4Var4, ei4Var4, i, i2, (jt1) obj2, iIntValue);
                    }
                };
            }
        }
        i3 |= 12582912;
        if ((i3 & 4793491) == 4793490) {
            bj4VarO.v0();
            i12 = i & 1;
            aVar = ox6.a.t;
            obj = jt1.a.a;
            aVar2 = di.a.m;
            if (i12 != 0) {
                if (i17 != 0) {
                    ox6Var2 = aVar;
                } else {
                    ox6Var2 = ox6Var;
                }
                if (i18 != 0) {
                    str2 = null;
                }
                if (i4 != 0) {
                    intercomTopBarIcon2 = null;
                }
                if (i6 != 0) {
                    bVar2 = aVar2;
                }
                if ((i2 & 16) != 0) {
                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                    i3 &= -57345;
                } else {
                    jM767getHeader0d7_KjU = j;
                }
                if ((i2 & 32) != 0) {
                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                    i3 &= -458753;
                } else {
                    jM771getOnHeader0d7_KjU = j2;
                }
                if (i8 != 0) {
                    bj4VarO.K(-883388004);
                    objF = bj4VarO.f();
                    if (objF == obj) {
                        objF = new qi5();
                        bj4VarO.C(objF);
                    }
                    mh4Var2 = (mh4) objF;
                    bj4VarO.U(false);
                } else {
                    mh4Var2 = mh4Var;
                }
                if (i10 != 0) {
                    ei4Var2 = null;
                } else {
                    ei4Var2 = ei4Var;
                }
                str3 = str2;
                j5 = jM767getHeader0d7_KjU;
            } else {
                if (i17 != 0) {
                    ox6Var2 = aVar;
                } else {
                    ox6Var2 = ox6Var;
                }
                if (i18 != 0) {
                    str2 = null;
                }
                if (i4 != 0) {
                    intercomTopBarIcon2 = null;
                }
                if (i6 != 0) {
                    bVar2 = aVar2;
                }
                if ((i2 & 16) != 0) {
                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                    i3 &= -57345;
                } else {
                    jM767getHeader0d7_KjU = j;
                }
                if ((i2 & 32) != 0) {
                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                    i3 &= -458753;
                } else {
                    jM771getOnHeader0d7_KjU = j2;
                }
                if (i8 != 0) {
                    bj4VarO.K(-883388004);
                    objF = bj4VarO.f();
                    if (objF == obj) {
                        objF = new qi5();
                        bj4VarO.C(objF);
                    }
                    mh4Var2 = (mh4) objF;
                    bj4VarO.U(false);
                } else {
                    mh4Var2 = mh4Var;
                }
                if (i10 != 0) {
                    ei4Var2 = null;
                } else {
                    ei4Var2 = ei4Var;
                }
                str3 = str2;
                j5 = jM767getHeader0d7_KjU;
            }
            bj4VarO.V();
            aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
            ox6Var3 = ox6Var2;
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, aVar);
            bt1.c.getClass();
            aVar3 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, aj1VarA);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf1110 = Integer.valueOf(iHashCode);
            bVar3 = bt1.a.g;
            rd7.d(bj4VarO, bVar3, numValueOf1110);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            intercomTopBarIcon3 = intercomTopBarIcon2;
            j6 = j5;
            ox6 ox6VarK1110 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
            bj4VarO.K(86796077);
            if ((i3 & 3670016) == 1048576) {
                z = true;
            } else {
                z = false;
            }
            objF2 = bj4VarO.f();
            if (z) {
                z2 = false;
                objF2 = new ri5(false ? 1 : 0, mh4Var2);
                bj4VarO.C(objF2);
            } else {
                z2 = false;
                objF2 = new ri5(false ? 1 : 0, mh4Var2);
                bj4VarO.C(objF2);
            }
            bj4VarO.U(z2);
            ox6 ox6VarC1114 = we1.c(ox6VarK1110, z2, null, (mh4) objF2, 15);
            fl6VarD = dv0.d(di.a.a, z2);
            mh4Var3 = mh4Var2;
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, ox6VarC1114);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, fl6VarD);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            if (intercomTopBarIcon3 != null) {
                f = 16.0f;
            } else {
                f = 16.0f;
            }
            ox6 ox6VarM1110 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
            i13 = i3 >> 3;
            aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
            iHashCode3 = Long.hashCode(bj4VarO.T);
            kw7VarP3 = bj4VarO.P();
            ox6VarC3 = it1.c(bj4VarO, ox6VarM1110);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA2);
            rd7.d(bj4VarO, eVar, kw7VarP3);
            l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC3);
            bj4VarO.K(560412879);
            if (str3 != null) {
                i14 = 6;
                ox6Var4 = null;
                mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                bj4Var = bj4VarO;
            } else {
                ox6Var4 = null;
                bj4Var = bj4VarO;
                i14 = 6;
            }
            bj4Var.U(false);
            bj4Var.U(true);
            bj4Var.K(-1319827237);
            kv0Var = kv0.a;
            i15 = i14;
            if (intercomTopBarIcon3 != null) {
                h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                    public final void invoke(jt1 jt1Var2, int i20) {
                        if ((i20 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
            }
            bj4Var.U(false);
            bj4Var.K(-1319809649);
            ei4Var3 = ei4Var2;
            if (ei4Var3 != null) {
                ox6 ox6VarF1110 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                iHashCode4 = Long.hashCode(bj4Var.T);
                kw7VarP4 = bj4Var.P();
                ox6VarC4 = it1.c(bj4Var, ox6VarF1110);
                if (j1bVar == null) {
                    ml5.c();
                    throw ox6Var4;
                }
                bj4Var.q();
                if (bj4Var.S) {
                    bj4Var.k(aVar3);
                } else {
                    bj4Var.z();
                }
                rd7.d(bj4Var, cVar, ny8VarA);
                rd7.d(bj4Var, eVar, kw7VarP4);
                l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                rd7.d(bj4Var, dVar, ox6VarC4);
                ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                r1 = 1;
                bj4Var.U(true);
            } else {
                r1 = 1;
            }
            bj4Var.U(false);
            bj4Var.U(r1);
            IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
            bj4Var.U(r1);
            mh4Var4 = mh4Var3;
            ox6Var5 = ox6Var3;
            ei4Var4 = ei4Var3;
            str4 = str3;
            bVar4 = bVar2;
            j7 = jM771getOnHeader0d7_KjU;
            intercomTopBarIcon4 = intercomTopBarIcon3;
            j8 = j6;
            bj4Var2 = bj4Var;
        } else {
            bj4VarO.v0();
            i12 = i & 1;
            aVar = ox6.a.t;
            obj = jt1.a.a;
            aVar2 = di.a.m;
            if (i12 != 0) {
                if (i17 != 0) {
                    ox6Var2 = aVar;
                } else {
                    ox6Var2 = ox6Var;
                }
                if (i18 != 0) {
                    str2 = null;
                }
                if (i4 != 0) {
                    intercomTopBarIcon2 = null;
                }
                if (i6 != 0) {
                    bVar2 = aVar2;
                }
                if ((i2 & 16) != 0) {
                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                    i3 &= -57345;
                } else {
                    jM767getHeader0d7_KjU = j;
                }
                if ((i2 & 32) != 0) {
                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                    i3 &= -458753;
                } else {
                    jM771getOnHeader0d7_KjU = j2;
                }
                if (i8 != 0) {
                    bj4VarO.K(-883388004);
                    objF = bj4VarO.f();
                    if (objF == obj) {
                        objF = new qi5();
                        bj4VarO.C(objF);
                    }
                    mh4Var2 = (mh4) objF;
                    bj4VarO.U(false);
                } else {
                    mh4Var2 = mh4Var;
                }
                if (i10 != 0) {
                    ei4Var2 = null;
                } else {
                    ei4Var2 = ei4Var;
                }
                str3 = str2;
                j5 = jM767getHeader0d7_KjU;
            } else {
                if (i17 != 0) {
                    ox6Var2 = aVar;
                } else {
                    ox6Var2 = ox6Var;
                }
                if (i18 != 0) {
                    str2 = null;
                }
                if (i4 != 0) {
                    intercomTopBarIcon2 = null;
                }
                if (i6 != 0) {
                    bVar2 = aVar2;
                }
                if ((i2 & 16) != 0) {
                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m767getHeader0d7_KjU();
                    i3 &= -57345;
                } else {
                    jM767getHeader0d7_KjU = j;
                }
                if ((i2 & 32) != 0) {
                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m771getOnHeader0d7_KjU();
                    i3 &= -458753;
                } else {
                    jM771getOnHeader0d7_KjU = j2;
                }
                if (i8 != 0) {
                    bj4VarO.K(-883388004);
                    objF = bj4VarO.f();
                    if (objF == obj) {
                        objF = new qi5();
                        bj4VarO.C(objF);
                    }
                    mh4Var2 = (mh4) objF;
                    bj4VarO.U(false);
                } else {
                    mh4Var2 = mh4Var;
                }
                if (i10 != 0) {
                    ei4Var2 = null;
                } else {
                    ei4Var2 = ei4Var;
                }
                str3 = str2;
                j5 = jM767getHeader0d7_KjU;
            }
            bj4VarO.V();
            aj1VarA = yi1.a(c30.c, aVar2, bj4VarO, 0);
            ox6Var3 = ox6Var2;
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, aVar);
            bt1.c.getClass();
            aVar3 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, aj1VarA);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf1111 = Integer.valueOf(iHashCode);
            bVar3 = bt1.a.g;
            rd7.d(bj4VarO, bVar3, numValueOf1111);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            intercomTopBarIcon3 = intercomTopBarIcon2;
            j6 = j5;
            ox6 ox6VarK1111 = eo7.k(ir9.d(ir9.c(w20.c(gi0.c(ox6Var3, j5, al8.a), w20.d), 1.0f), 56.0f), 4.0f, 0.0f, 2);
            bj4VarO.K(86796077);
            if ((i3 & 3670016) == 1048576) {
                z = true;
            } else {
                z = false;
            }
            objF2 = bj4VarO.f();
            if (z) {
                z2 = false;
                objF2 = new ri5(false ? 1 : 0, mh4Var2);
                bj4VarO.C(objF2);
            } else {
                z2 = false;
                objF2 = new ri5(false ? 1 : 0, mh4Var2);
                bj4VarO.C(objF2);
            }
            bj4VarO.U(z2);
            ox6 ox6VarC1115 = we1.c(ox6VarK1111, z2, null, (mh4) objF2, 15);
            fl6VarD = dv0.d(di.a.a, z2);
            mh4Var3 = mh4Var2;
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, ox6VarC1115);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, fl6VarD);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar3, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            if (intercomTopBarIcon3 != null) {
                f = 16.0f;
            } else {
                f = 16.0f;
            }
            ox6 ox6VarM1111 = eo7.m(ir9.c, f, 0.0f, 16.0f, 0.0f, 10);
            i13 = i3 >> 3;
            aj1VarA2 = yi1.a(c30.d, bVar2, bj4VarO, 6 | ((((i13 & 896) | 48) >> 3) & 112));
            iHashCode3 = Long.hashCode(bj4VarO.T);
            kw7VarP3 = bj4VarO.P();
            ox6VarC3 = it1.c(bj4VarO, ox6VarM1111);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA2);
            rd7.d(bj4VarO, eVar, kw7VarP3);
            l02.a(iHashCode3, bj4VarO, bVar3, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC3);
            bj4VarO.K(560412879);
            if (str3 != null) {
                i14 = 6;
                ox6Var4 = null;
                mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, 6).getType03(), jM771getOnHeader0d7_KjU, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, i13 & 14, 24960, 110590);
                bj4Var = bj4VarO;
            } else {
                ox6Var4 = null;
                bj4Var = bj4VarO;
                i14 = 6;
            }
            bj4Var.U(false);
            bj4Var.U(true);
            bj4Var.K(-1319827237);
            kv0Var = kv0.a;
            i15 = i14;
            if (intercomTopBarIcon3 != null) {
                h65.b(1572864, 60, bj4Var, intercomTopBarIcon3.getOnClick(), gr1.b(-423583748, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                    public final void invoke(jt1 jt1Var2, int i20) {
                        if ((i20 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            m65.b(is7.a(intercomTopBarIcon3.getIconRes(), jt1Var2, 0), intercomTopBarIcon3.getContentDescription(), ir9.j(ox6.a.t, 24.0f), jM771getOnHeader0d7_KjU, jt1Var2, 392, 0);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4Var), null, kv0Var.f(aVar, di.a.d), null, false);
            }
            bj4Var.U(false);
            bj4Var.K(-1319809649);
            ei4Var3 = ei4Var2;
            if (ei4Var3 != null) {
                ox6 ox6VarF1111 = kv0Var.f(ir9.r(ir9.b), di.a.f);
                ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
                iHashCode4 = Long.hashCode(bj4Var.T);
                kw7VarP4 = bj4Var.P();
                ox6VarC4 = it1.c(bj4Var, ox6VarF1111);
                if (j1bVar == null) {
                    ml5.c();
                    throw ox6Var4;
                }
                bj4Var.q();
                if (bj4Var.S) {
                    bj4Var.k(aVar3);
                } else {
                    bj4Var.z();
                }
                rd7.d(bj4Var, cVar, ny8VarA);
                rd7.d(bj4Var, eVar, kw7VarP4);
                l02.a(iHashCode4, bj4Var, bVar3, bj4Var, c0034a);
                rd7.d(bj4Var, dVar, ox6VarC4);
                ei4Var3.invoke(py8.a, bj4Var, Integer.valueOf(i15 | ((i3 >> 18) & 112)));
                r1 = 1;
                bj4Var.U(true);
            } else {
                r1 = 1;
            }
            bj4Var.U(false);
            bj4Var.U(r1);
            IntercomDividerKt.IntercomDivider(ox6Var4, bj4Var, 0, r1);
            bj4Var.U(r1);
            mh4Var4 = mh4Var3;
            ox6Var5 = ox6Var3;
            ei4Var4 = ei4Var3;
            str4 = str3;
            bVar4 = bVar2;
            j7 = jM771getOnHeader0d7_KjU;
            intercomTopBarIcon4 = intercomTopBarIcon3;
            j8 = j6;
            bj4Var2 = bj4Var;
        }
        xj8VarW = bj4Var2.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: si5
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$8(ox6Var5, str4, intercomTopBarIcon4, bVar4, j8, j7, mh4Var4, ei4Var4, i, i2, (jt1) obj2, iIntValue);
                }
            };
        }
    }

    @IntercomPreviews
    private static final void IntercomTopBarPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-358701081);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomTopBarKt.INSTANCE.m560getLambda1$intercom_sdk_ui_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new nq3(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b IntercomTopBarPreview$lambda$9(int i, jt1 jt1Var, int i2) {
        IntercomTopBarPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void IntercomTopBarPreviewWithMenuItems(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-2022840780);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomTopBarKt.INSTANCE.m564getLambda5$intercom_sdk_ui_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new kg0(i, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b IntercomTopBarPreviewWithMenuItems$lambda$11(int i, jt1 jt1Var, int i2) {
        IntercomTopBarPreviewWithMenuItems(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void IntercomTopBarPreviewWithoutNavIcon(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-110907621);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomTopBarKt.INSTANCE.m561getLambda2$intercom_sdk_ui_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new wb4(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b IntercomTopBarPreviewWithoutNavIcon$lambda$10(int i, jt1 jt1Var, int i2) {
        IntercomTopBarPreviewWithoutNavIcon(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b IntercomTopBar_bogVsAg$lambda$7$lambda$3$lambda$2(mh4 mh4Var) {
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b IntercomTopBar_bogVsAg$lambda$8(ox6 ox6Var, String str, IntercomTopBarIcon intercomTopBarIcon, di.b bVar, long j, long j2, mh4 mh4Var, ei4 ei4Var, int i, int i2, jt1 jt1Var, int i3) {
        m589IntercomTopBarbogVsAg(ox6Var, str, intercomTopBarIcon, bVar, j, j2, mh4Var, ei4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
