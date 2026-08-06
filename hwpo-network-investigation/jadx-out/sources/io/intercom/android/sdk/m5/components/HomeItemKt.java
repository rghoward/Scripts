package io.intercom.android.sdk.m5.components;

import com.intercom.twig.BuildConfig;
import defpackage.a30;
import defpackage.aj1;
import defpackage.ay8;
import defpackage.beb;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cka;
import defpackage.d73;
import defpackage.di;
import defpackage.dv0;
import defpackage.eo7;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gb3;
import defpackage.gi0;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.kv0;
import defpackage.kw7;
import defpackage.l02;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.raa;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.t05;
import defpackage.u05;
import defpackage.u7d;
import defpackage.uh1;
import defpackage.uma;
import defpackage.v05;
import defpackage.w05;
import defpackage.we1;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.z63;
import io.intercom.android.sdk.m5.components.HomeItemKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.home.states.HomeItemBadge;
import io.intercom.android.sdk.m5.shapes.CutIconWithIndicatorShape;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeItemKt {
    /* JADX WARN: Code duplicated, block: B:101:0x012c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0146  */
    /* JADX WARN: Code duplicated, block: B:107:0x014a  */
    /* JADX WARN: Code duplicated, block: B:109:0x014d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0150  */
    /* JADX WARN: Code duplicated, block: B:112:0x0157  */
    /* JADX WARN: Code duplicated, block: B:115:0x015c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0161  */
    /* JADX WARN: Code duplicated, block: B:118:0x0164  */
    /* JADX WARN: Code duplicated, block: B:120:0x0167  */
    /* JADX WARN: Code duplicated, block: B:121:0x016a  */
    /* JADX WARN: Code duplicated, block: B:123:0x016e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0171  */
    /* JADX WARN: Code duplicated, block: B:126:0x0175  */
    /* JADX WARN: Code duplicated, block: B:127:0x0178  */
    /* JADX WARN: Code duplicated, block: B:130:0x017f  */
    /* JADX WARN: Code duplicated, block: B:132:0x018b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0199  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:145:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:147:0x0207  */
    /* JADX WARN: Code duplicated, block: B:148:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x025f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0266  */
    /* JADX WARN: Code duplicated, block: B:154:0x026a  */
    /* JADX WARN: Code duplicated, block: B:157:0x0281  */
    /* JADX WARN: Code duplicated, block: B:160:0x028c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x028e  */
    /* JADX WARN: Code duplicated, block: B:162:0x0291  */
    /* JADX WARN: Code duplicated, block: B:165:0x0300  */
    /* JADX WARN: Code duplicated, block: B:168:0x034b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0373  */
    /* JADX WARN: Code duplicated, block: B:172:0x037a  */
    /* JADX WARN: Code duplicated, block: B:173:0x037e  */
    /* JADX WARN: Code duplicated, block: B:176:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:178:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:180:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:182:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:184:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:186:0x0406  */
    /* JADX WARN: Code duplicated, block: B:187:0x040c  */
    /* JADX WARN: Code duplicated, block: B:189:0x0425  */
    /* JADX WARN: Code duplicated, block: B:191:0x042e  */
    /* JADX WARN: Code duplicated, block: B:193:0x0434  */
    /* JADX WARN: Code duplicated, block: B:196:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:198:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:200:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:202:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:203:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:208:0x055a  */
    /* JADX WARN: Code duplicated, block: B:210:0x0566  */
    /* JADX WARN: Code duplicated, block: B:212:0x0574  */
    /* JADX WARN: Code duplicated, block: B:214:0x057a  */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2 A[PHI: r18
      0x00e2: PHI (r18v20 int) = (r18v6 int), (r18v12 int), (r18v13 int) binds: [B:78:0x00e0, B:88:0x00fd, B:87:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:92:0x010d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x0119  */
    /* JADX WARN: Code duplicated, block: B:97:0x011c  */
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
    public static final void HomeItem(ox6 ox6Var, Integer num, ci4<? super jt1, ? super Integer, g2b> ci4Var, ox6 ox6Var2, Integer num2, String str, String str2, HomeItemBadge homeItemBadge, mh4<g2b> mh4Var, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var3;
        int i3;
        Integer num3;
        int i4;
        ci4<? super jt1, ? super Integer, g2b> ci4Var2;
        int i5;
        int i6;
        ox6 ox6Var4;
        int i7;
        int i8;
        Integer num4;
        int i9;
        int i10;
        j1b j1bVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean zJ;
        int i16;
        int i17;
        ox6.a aVar;
        ci4<? super jt1, ? super Integer, g2b> ci4VarM52getLambda1$intercom_sdk_base_release;
        ox6 ox6VarJ;
        String str3;
        String str4;
        HomeItemBadge homeItemBadge2;
        jt1.a.C0187a c0187a;
        mh4<g2b> mh4Var2;
        boolean z;
        Object objF;
        Integer num5;
        ox6 ox6Var5;
        sp0.b bVar;
        ny8 ny8VarA;
        int i18;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        bt1.a.c cVar;
        bt1.a.e eVar;
        bt1.a.b bVar2;
        bt1.a.C0034a c0034a;
        mh4<g2b> mh4Var3;
        bt1.a.d dVar;
        Integer num6;
        HomeItemBadge homeItemBadge3;
        aj1 aj1VarA;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        String str5;
        String strF;
        IntercomTheme intercomTheme;
        int i19;
        ox6 ox6Var6;
        ci4<? super jt1, ? super Integer, g2b> ci4Var3;
        bj4 bj4Var;
        ox6 ox6Var7;
        ci4<? super jt1, ? super Integer, g2b> ci4Var4;
        Object objF2;
        boolean z2;
        boolean z3;
        fl6 fl6VarD;
        int iHashCode3;
        kw7 kw7VarP3;
        ox6 ox6VarC3;
        boolean z4;
        boolean z5;
        final HomeItemBadge homeItemBadge4;
        final ox6 ox6Var8;
        final String str6;
        final String str7;
        final ox6 ox6Var9;
        final Integer num7;
        final mh4<g2b> mh4Var4;
        final ci4<? super jt1, ? super Integer, g2b> ci4Var5;
        final Integer num8;
        ny8 ny8VarA2;
        int iHashCode4;
        kw7 kw7VarP4;
        ox6 ox6VarC4;
        Object objF3;
        xj8 xj8VarW;
        bj4 bj4VarO = jt1Var.o(-360748364);
        j1b j1bVar2 = bj4VarO.a;
        int i20 = i2 & 1;
        if (i20 != 0) {
            i3 = i | 6;
            ox6Var3 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var3 = ox6Var;
            i3 = (bj4VarO.J(ox6Var3) ? 4 : 2) | i;
        } else {
            ox6Var3 = ox6Var;
            i3 = i;
        }
        int i21 = i2 & 2;
        if (i21 == 0) {
            if ((i & 48) == 0) {
                num3 = num;
                i3 |= bj4VarO.J(num3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    ci4Var2 = ci4Var;
                    if (bj4VarO.j(ci4Var2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        ox6Var4 = ox6Var2;
                        if (bj4VarO.J(ox6Var4)) {
                            i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            num4 = num2;
                            if (bj4VarO.J(num4)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 32;
                        if (i10 != 0) {
                            i3 |= 196608;
                            j1bVar = j1bVar2;
                        } else {
                            j1bVar = j1bVar2;
                            if ((i & 196608) == 0) {
                                if (bj4VarO.J(str)) {
                                    i11 = 131072;
                                } else {
                                    i11 = 65536;
                                }
                                i3 |= i11;
                            }
                        }
                        i12 = i2 & 64;
                        if (i12 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            if (bj4VarO.J(str2)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i3 |= i13;
                        }
                        i14 = i2 & 128;
                        i15 = 12582912;
                        if (i14 == 0) {
                            i3 |= i15;
                        } else if ((i & 12582912) == 0) {
                            if ((i & 16777216) == 0) {
                                zJ = bj4VarO.J(homeItemBadge);
                            } else {
                                zJ = bj4VarO.j(homeItemBadge);
                            }
                            if (zJ) {
                                i15 = 8388608;
                            } else {
                                i15 = 4194304;
                            }
                            i3 |= i15;
                        }
                        i16 = i2 & 256;
                        if (i16 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            if (bj4VarO.j(mh4Var)) {
                                i17 = 67108864;
                            } else {
                                i17 = 33554432;
                            }
                            i3 |= i17;
                        }
                        if ((i3 & 38347923) == 38347922 || !bj4VarO.r()) {
                            aVar = ox6.a.t;
                            if (i20 != 0) {
                                ox6Var3 = aVar;
                            }
                            if (i21 != 0) {
                                num3 = null;
                            }
                            if (i4 != 0) {
                                ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                            } else {
                                ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                            }
                            if (i6 != 0) {
                                ox6VarJ = ir9.j(aVar, 16.0f);
                            } else {
                                ox6VarJ = ox6Var4;
                            }
                            if (i8 != 0) {
                                num4 = null;
                            }
                            if (i10 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i12 != 0) {
                                str4 = null;
                            } else {
                                str4 = str2;
                            }
                            if (i14 != 0) {
                                homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                            } else {
                                homeItemBadge2 = homeItemBadge;
                            }
                            c0187a = jt1.a.a;
                            if (i16 != 0) {
                                bj4VarO.K(-244016614);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new v05();
                                    bj4VarO.C(objF3);
                                }
                                mh4Var2 = (mh4) objF3;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            ox6 ox6VarC5 = ir9.c(ox6Var3, 1.0f);
                            bj4VarO.K(-244013531);
                            if ((234881024 & i3) == 67108864) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objF = bj4VarO.f();
                            if (z || objF == c0187a) {
                                objF = new gb3(2, mh4Var2);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            num5 = num4;
                            ox6Var5 = ox6Var3;
                            ox6 ox6VarJ2 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC5, false, null, (mh4) objF, 15));
                            c30.j jVar = c30.a;
                            bVar = di.a.k;
                            ny8VarA = ly8.a(jVar, bVar, bj4VarO, 48);
                            i18 = i3;
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6VarJ2);
                            bt1.c.getClass();
                            aVar2 = bt1.a.b;
                            if (j1bVar == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar2);
                            } else {
                                bj4VarO.z();
                            }
                            cVar = bt1.a.f;
                            rd7.d(bj4VarO, cVar, ny8VarA);
                            eVar = bt1.a.e;
                            rd7.d(bj4VarO, eVar, kw7VarP);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            bVar2 = bt1.a.g;
                            rd7.d(bj4VarO, bVar2, numValueOf);
                            c0034a = bt1.a.h;
                            rd7.c(bj4VarO, c0034a);
                            mh4Var3 = mh4Var2;
                            dVar = bt1.a.d;
                            rd7.d(bj4VarO, dVar, ox6VarC);
                            num6 = num3;
                            qs5 qs5Var = new qs5(true, 2.0f);
                            homeItemBadge3 = homeItemBadge2;
                            aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                            iHashCode2 = Long.hashCode(bj4VarO.T);
                            kw7VarP2 = bj4VarO.P();
                            ox6VarC2 = it1.c(bj4VarO, qs5Var);
                            if (j1bVar == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar2);
                            } else {
                                bj4VarO.z();
                            }
                            rd7.d(bj4VarO, cVar, aj1VarA);
                            rd7.d(bj4VarO, eVar, kw7VarP2);
                            l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                            rd7.d(bj4VarO, dVar, ox6VarC2);
                            bj4VarO.K(-1379228937);
                            if (num5 != null) {
                                strF = nr1.f(bj4VarO, num5.intValue());
                            } else {
                                if (str3 == null) {
                                    strF = BuildConfig.FLAVOR;
                                } else {
                                    str5 = str3;
                                }
                                bj4VarO.U(false);
                                intercomTheme = IntercomTheme.INSTANCE;
                                i19 = IntercomTheme.$stable;
                                ox6Var6 = ox6VarJ;
                                ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                                mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                                bj4Var = bj4VarO;
                                bj4Var.K(-1379221164);
                                if (str4 != null) {
                                    mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                                    bj4Var = bj4Var;
                                }
                                bj4Var.U(false);
                                bj4Var.U(true);
                                if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                                    bj4Var.K(941879891);
                                    ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                                    iHashCode4 = Long.hashCode(bj4Var.T);
                                    kw7VarP4 = bj4Var.P();
                                    ox6VarC4 = it1.c(bj4Var, aVar);
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4Var.q();
                                    if (bj4Var.S) {
                                        bj4Var.k(aVar2);
                                    } else {
                                        bj4Var.z();
                                    }
                                    rd7.d(bj4Var, cVar, ny8VarA2);
                                    rd7.d(bj4Var, eVar, kw7VarP4);
                                    l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                                    rd7.d(bj4Var, dVar, ox6VarC4);
                                    ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                                    bj4Var.K(-1379205196);
                                    if (num6 == null) {
                                        ox6Var7 = ox6Var6;
                                    } else {
                                        ox6Var7 = ox6Var6;
                                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                        g2b g2bVar = g2b.a;
                                    }
                                    bj4Var.U(false);
                                    bj4Var.U(true);
                                    bj4Var.U(false);
                                    g2b g2bVar2 = g2b.a;
                                    ci4Var4 = ci4Var3;
                                    z3 = true;
                                } else {
                                    ox6Var7 = ox6Var6;
                                    ci4Var4 = ci4Var3;
                                    if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                        bj4Var.K(942534549);
                                        if (num6 == null) {
                                            z5 = true;
                                            z4 = false;
                                        } else {
                                            fl6VarD = dv0.d(di.a.a, false);
                                            iHashCode3 = Long.hashCode(bj4Var.T);
                                            kw7VarP3 = bj4Var.P();
                                            ox6VarC3 = it1.c(bj4Var, aVar);
                                            if (j1bVar != null) {
                                                ml5.c();
                                                throw null;
                                            }
                                            bj4Var.q();
                                            if (bj4Var.S) {
                                                bj4Var.k(aVar2);
                                            } else {
                                                bj4Var.z();
                                            }
                                            rd7.d(bj4Var, cVar, fl6VarD);
                                            rd7.d(bj4Var, eVar, kw7VarP3);
                                            l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                            rd7.d(bj4Var, dVar, ox6VarC3);
                                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                            z4 = false;
                                            dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                            z5 = true;
                                            bj4Var.U(true);
                                            g2b g2bVar3 = g2b.a;
                                        }
                                        bj4Var.U(z4);
                                        z3 = z5;
                                    } else {
                                        ci4Var4 = ci4Var4;
                                        if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                            bj4Var.K(861667097);
                                            bj4Var.U(false);
                                            defpackage.u.b();
                                            return;
                                        }
                                        bj4Var.K(943331838);
                                        ox6 ox6VarM = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                        bj4Var.K(861717389);
                                        objF2 = bj4Var.f();
                                        if (objF2 == c0187a) {
                                            z2 = false;
                                            objF2 = new w05(0 == true ? 1 : 0);
                                            bj4Var.C(objF2);
                                        } else {
                                            z2 = false;
                                        }
                                        bj4Var.U(z2);
                                        z3 = true;
                                        bj4 bj4Var2 = bj4Var;
                                        mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var2, 1597824, 0, 262056);
                                        bj4Var = bj4Var2;
                                        bj4Var.U(false);
                                        g2b g2bVar4 = g2b.a;
                                    }
                                }
                                bj4Var.U(z3);
                                homeItemBadge4 = homeItemBadge3;
                                ox6Var8 = ox6Var7;
                                str6 = str3;
                                str7 = str4;
                                ox6Var9 = ox6Var5;
                                num7 = num6;
                                mh4Var4 = mh4Var3;
                                ci4Var5 = ci4Var4;
                                num8 = num5;
                            }
                            str5 = strF;
                            bj4VarO.U(false);
                            intercomTheme = IntercomTheme.INSTANCE;
                            i19 = IntercomTheme.$stable;
                            ox6Var6 = ox6VarJ;
                            ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                            mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                            bj4Var = bj4VarO;
                            bj4Var.K(-1379221164);
                            if (str4 != null) {
                                mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                                bj4Var = bj4Var;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                                bj4Var.K(941879891);
                                ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                                iHashCode4 = Long.hashCode(bj4Var.T);
                                kw7VarP4 = bj4Var.P();
                                ox6VarC4 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, ny8VarA2);
                                rd7.d(bj4Var, eVar, kw7VarP4);
                                l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC4);
                                ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                                bj4Var.K(-1379205196);
                                if (num6 == null) {
                                    ox6Var7 = ox6Var6;
                                } else {
                                    ox6Var7 = ox6Var6;
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    g2b g2bVar5 = g2b.a;
                                }
                                bj4Var.U(false);
                                bj4Var.U(true);
                                bj4Var.U(false);
                                g2b g2bVar6 = g2b.a;
                                ci4Var4 = ci4Var3;
                                z3 = true;
                            } else {
                                ox6Var7 = ox6Var6;
                                ci4Var4 = ci4Var3;
                                if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                    bj4Var.K(942534549);
                                    if (num6 == null) {
                                        z5 = true;
                                        z4 = false;
                                    } else {
                                        fl6VarD = dv0.d(di.a.a, false);
                                        iHashCode3 = Long.hashCode(bj4Var.T);
                                        kw7VarP3 = bj4Var.P();
                                        ox6VarC3 = it1.c(bj4Var, aVar);
                                        if (j1bVar != null) {
                                            ml5.c();
                                            throw null;
                                        }
                                        bj4Var.q();
                                        if (bj4Var.S) {
                                            bj4Var.k(aVar2);
                                        } else {
                                            bj4Var.z();
                                        }
                                        rd7.d(bj4Var, cVar, fl6VarD);
                                        rd7.d(bj4Var, eVar, kw7VarP3);
                                        l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                        rd7.d(bj4Var, dVar, ox6VarC3);
                                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                        z4 = false;
                                        dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                        z5 = true;
                                        bj4Var.U(true);
                                        g2b g2bVar7 = g2b.a;
                                    }
                                    bj4Var.U(z4);
                                    z3 = z5;
                                } else {
                                    ci4Var4 = ci4Var4;
                                    if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                        bj4Var.K(861667097);
                                        bj4Var.U(false);
                                        defpackage.u.b();
                                        return;
                                    }
                                    bj4Var.K(943331838);
                                    ox6 ox6VarM2 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                    bj4Var.K(861717389);
                                    objF2 = bj4Var.f();
                                    if (objF2 == c0187a) {
                                        z2 = false;
                                        objF2 = new w05(0 == true ? 1 : 0);
                                        bj4Var.C(objF2);
                                    } else {
                                        z2 = false;
                                    }
                                    bj4Var.U(z2);
                                    z3 = true;
                                    bj4 bj4Var3 = bj4Var;
                                    mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM2, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var3, 1597824, 0, 262056);
                                    bj4Var = bj4Var3;
                                    bj4Var.U(false);
                                    g2b g2bVar8 = g2b.a;
                                }
                            }
                            bj4Var.U(z3);
                            homeItemBadge4 = homeItemBadge3;
                            ox6Var8 = ox6Var7;
                            str6 = str3;
                            str7 = str4;
                            ox6Var9 = ox6Var5;
                            num7 = num6;
                            mh4Var4 = mh4Var3;
                            ci4Var5 = ci4Var4;
                            num8 = num5;
                        } else {
                            bj4VarO.u();
                            str6 = str;
                            str7 = str2;
                            mh4Var4 = mh4Var;
                            num7 = num3;
                            ci4Var5 = ci4Var2;
                            homeItemBadge4 = homeItemBadge;
                            bj4Var = bj4VarO;
                            ox6Var9 = ox6Var3;
                            num8 = num4;
                            ox6Var8 = ox6Var4;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: x05
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return HomeItemKt.HomeItem$lambda$12(ox6Var9, num7, ci4Var5, ox6Var8, num8, str6, str7, homeItemBadge4, mh4Var4, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 24576;
                    num4 = num2;
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                        j1bVar = j1bVar2;
                    } else {
                        j1bVar = j1bVar2;
                        if ((i & 196608) == 0) {
                            if (bj4VarO.J(str)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                    }
                    i12 = i2 & 64;
                    if (i12 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (bj4VarO.J(str2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 128;
                    i15 = 12582912;
                    if (i14 == 0) {
                        i3 |= i15;
                    } else if ((i & 12582912) == 0) {
                        if ((i & 16777216) == 0) {
                            zJ = bj4VarO.J(homeItemBadge);
                        } else {
                            zJ = bj4VarO.j(homeItemBadge);
                        }
                        if (zJ) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i3 |= i15;
                    }
                    i16 = i2 & 256;
                    if (i16 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (bj4VarO.j(mh4Var)) {
                            i17 = 67108864;
                        } else {
                            i17 = 33554432;
                        }
                        i3 |= i17;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        aVar = ox6.a.t;
                        if (i20 != 0) {
                            ox6Var3 = aVar;
                        }
                        if (i21 != 0) {
                            num3 = null;
                        }
                        if (i4 != 0) {
                            ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                        }
                        if (i6 != 0) {
                            ox6VarJ = ir9.j(aVar, 16.0f);
                        } else {
                            ox6VarJ = ox6Var4;
                        }
                        if (i8 != 0) {
                            num4 = null;
                        }
                        if (i10 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i12 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i14 != 0) {
                            homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                        } else {
                            homeItemBadge2 = homeItemBadge;
                        }
                        c0187a = jt1.a.a;
                        if (i16 != 0) {
                            bj4VarO.K(-244016614);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new v05();
                                bj4VarO.C(objF3);
                            }
                            mh4Var2 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        ox6 ox6VarC6 = ir9.c(ox6Var3, 1.0f);
                        bj4VarO.K(-244013531);
                        if ((234881024 & i3) == 67108864) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            objF = new gb3(2, mh4Var2);
                            bj4VarO.C(objF);
                        } else {
                            objF = new gb3(2, mh4Var2);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        num5 = num4;
                        ox6Var5 = ox6Var3;
                        ox6 ox6VarJ3 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC6, false, null, (mh4) objF, 15));
                        c30.j jVar2 = c30.a;
                        bVar = di.a.k;
                        ny8VarA = ly8.a(jVar2, bVar, bj4VarO, 48);
                        i18 = i3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarJ3);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        cVar = bt1.a.f;
                        rd7.d(bj4VarO, cVar, ny8VarA);
                        eVar = bt1.a.e;
                        rd7.d(bj4VarO, eVar, kw7VarP);
                        Integer numValueOf2 = Integer.valueOf(iHashCode);
                        bVar2 = bt1.a.g;
                        rd7.d(bj4VarO, bVar2, numValueOf2);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        mh4Var3 = mh4Var2;
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        num6 = num3;
                        qs5 qs5Var2 = new qs5(true, 2.0f);
                        homeItemBadge3 = homeItemBadge2;
                        aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, qs5Var2);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        bj4VarO.K(-1379228937);
                        if (num5 != null) {
                            strF = nr1.f(bj4VarO, num5.intValue());
                        } else {
                            if (str3 == null) {
                                strF = BuildConfig.FLAVOR;
                            } else {
                                str5 = str3;
                            }
                            bj4VarO.U(false);
                            intercomTheme = IntercomTheme.INSTANCE;
                            i19 = IntercomTheme.$stable;
                            ox6Var6 = ox6VarJ;
                            ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                            mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                            bj4Var = bj4VarO;
                            bj4Var.K(-1379221164);
                            if (str4 != null) {
                                mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                                bj4Var = bj4Var;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                                bj4Var.K(941879891);
                                ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                                iHashCode4 = Long.hashCode(bj4Var.T);
                                kw7VarP4 = bj4Var.P();
                                ox6VarC4 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, ny8VarA2);
                                rd7.d(bj4Var, eVar, kw7VarP4);
                                l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC4);
                                ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                                bj4Var.K(-1379205196);
                                if (num6 == null) {
                                    ox6Var7 = ox6Var6;
                                } else {
                                    ox6Var7 = ox6Var6;
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    g2b g2bVar9 = g2b.a;
                                }
                                bj4Var.U(false);
                                bj4Var.U(true);
                                bj4Var.U(false);
                                g2b g2bVar10 = g2b.a;
                                ci4Var4 = ci4Var3;
                                z3 = true;
                            } else {
                                ox6Var7 = ox6Var6;
                                ci4Var4 = ci4Var3;
                                if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                    bj4Var.K(942534549);
                                    if (num6 == null) {
                                        z5 = true;
                                        z4 = false;
                                    } else {
                                        fl6VarD = dv0.d(di.a.a, false);
                                        iHashCode3 = Long.hashCode(bj4Var.T);
                                        kw7VarP3 = bj4Var.P();
                                        ox6VarC3 = it1.c(bj4Var, aVar);
                                        if (j1bVar != null) {
                                            ml5.c();
                                            throw null;
                                        }
                                        bj4Var.q();
                                        if (bj4Var.S) {
                                            bj4Var.k(aVar2);
                                        } else {
                                            bj4Var.z();
                                        }
                                        rd7.d(bj4Var, cVar, fl6VarD);
                                        rd7.d(bj4Var, eVar, kw7VarP3);
                                        l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                        rd7.d(bj4Var, dVar, ox6VarC3);
                                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                        z4 = false;
                                        dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                        z5 = true;
                                        bj4Var.U(true);
                                        g2b g2bVar11 = g2b.a;
                                    }
                                    bj4Var.U(z4);
                                    z3 = z5;
                                } else {
                                    ci4Var4 = ci4Var4;
                                    if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                        bj4Var.K(861667097);
                                        bj4Var.U(false);
                                        defpackage.u.b();
                                        return;
                                    }
                                    bj4Var.K(943331838);
                                    ox6 ox6VarM3 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                    bj4Var.K(861717389);
                                    objF2 = bj4Var.f();
                                    if (objF2 == c0187a) {
                                        z2 = false;
                                        objF2 = new w05(0 == true ? 1 : 0);
                                        bj4Var.C(objF2);
                                    } else {
                                        z2 = false;
                                    }
                                    bj4Var.U(z2);
                                    z3 = true;
                                    bj4 bj4Var4 = bj4Var;
                                    mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM3, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var4, 1597824, 0, 262056);
                                    bj4Var = bj4Var4;
                                    bj4Var.U(false);
                                    g2b g2bVar12 = g2b.a;
                                }
                            }
                            bj4Var.U(z3);
                            homeItemBadge4 = homeItemBadge3;
                            ox6Var8 = ox6Var7;
                            str6 = str3;
                            str7 = str4;
                            ox6Var9 = ox6Var5;
                            num7 = num6;
                            mh4Var4 = mh4Var3;
                            ci4Var5 = ci4Var4;
                            num8 = num5;
                        }
                        str5 = strF;
                        bj4VarO.U(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        ox6Var6 = ox6VarJ;
                        ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                        bj4Var = bj4VarO;
                        bj4Var.K(-1379221164);
                        if (str4 != null) {
                            mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                            bj4Var.K(941879891);
                            ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA2);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                            bj4Var.K(-1379205196);
                            if (num6 == null) {
                                ox6Var7 = ox6Var6;
                            } else {
                                ox6Var7 = ox6Var6;
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                g2b g2bVar13 = g2b.a;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.U(false);
                            g2b g2bVar14 = g2b.a;
                            ci4Var4 = ci4Var3;
                            z3 = true;
                        } else {
                            ox6Var7 = ox6Var6;
                            ci4Var4 = ci4Var3;
                            if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                bj4Var.K(942534549);
                                if (num6 == null) {
                                    z5 = true;
                                    z4 = false;
                                } else {
                                    fl6VarD = dv0.d(di.a.a, false);
                                    iHashCode3 = Long.hashCode(bj4Var.T);
                                    kw7VarP3 = bj4Var.P();
                                    ox6VarC3 = it1.c(bj4Var, aVar);
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4Var.q();
                                    if (bj4Var.S) {
                                        bj4Var.k(aVar2);
                                    } else {
                                        bj4Var.z();
                                    }
                                    rd7.d(bj4Var, cVar, fl6VarD);
                                    rd7.d(bj4Var, eVar, kw7VarP3);
                                    l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                    rd7.d(bj4Var, dVar, ox6VarC3);
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    z4 = false;
                                    dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                    z5 = true;
                                    bj4Var.U(true);
                                    g2b g2bVar15 = g2b.a;
                                }
                                bj4Var.U(z4);
                                z3 = z5;
                            } else {
                                ci4Var4 = ci4Var4;
                                if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                    bj4Var.K(861667097);
                                    bj4Var.U(false);
                                    defpackage.u.b();
                                    return;
                                }
                                bj4Var.K(943331838);
                                ox6 ox6VarM4 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                bj4Var.K(861717389);
                                objF2 = bj4Var.f();
                                if (objF2 == c0187a) {
                                    z2 = false;
                                    objF2 = new w05(0 == true ? 1 : 0);
                                    bj4Var.C(objF2);
                                } else {
                                    z2 = false;
                                }
                                bj4Var.U(z2);
                                z3 = true;
                                bj4 bj4Var5 = bj4Var;
                                mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM4, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var5, 1597824, 0, 262056);
                                bj4Var = bj4Var5;
                                bj4Var.U(false);
                                g2b g2bVar16 = g2b.a;
                            }
                        }
                        bj4Var.U(z3);
                        homeItemBadge4 = homeItemBadge3;
                        ox6Var8 = ox6Var7;
                        str6 = str3;
                        str7 = str4;
                        ox6Var9 = ox6Var5;
                        num7 = num6;
                        mh4Var4 = mh4Var3;
                        ci4Var5 = ci4Var4;
                        num8 = num5;
                    } else {
                        aVar = ox6.a.t;
                        if (i20 != 0) {
                            ox6Var3 = aVar;
                        }
                        if (i21 != 0) {
                            num3 = null;
                        }
                        if (i4 != 0) {
                            ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                        }
                        if (i6 != 0) {
                            ox6VarJ = ir9.j(aVar, 16.0f);
                        } else {
                            ox6VarJ = ox6Var4;
                        }
                        if (i8 != 0) {
                            num4 = null;
                        }
                        if (i10 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i12 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i14 != 0) {
                            homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                        } else {
                            homeItemBadge2 = homeItemBadge;
                        }
                        c0187a = jt1.a.a;
                        if (i16 != 0) {
                            bj4VarO.K(-244016614);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new v05();
                                bj4VarO.C(objF3);
                            }
                            mh4Var2 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        ox6 ox6VarC7 = ir9.c(ox6Var3, 1.0f);
                        bj4VarO.K(-244013531);
                        if ((234881024 & i3) == 67108864) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            objF = new gb3(2, mh4Var2);
                            bj4VarO.C(objF);
                        } else {
                            objF = new gb3(2, mh4Var2);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        num5 = num4;
                        ox6Var5 = ox6Var3;
                        ox6 ox6VarJ4 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC7, false, null, (mh4) objF, 15));
                        c30.j jVar3 = c30.a;
                        bVar = di.a.k;
                        ny8VarA = ly8.a(jVar3, bVar, bj4VarO, 48);
                        i18 = i3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarJ4);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        cVar = bt1.a.f;
                        rd7.d(bj4VarO, cVar, ny8VarA);
                        eVar = bt1.a.e;
                        rd7.d(bj4VarO, eVar, kw7VarP);
                        Integer numValueOf3 = Integer.valueOf(iHashCode);
                        bVar2 = bt1.a.g;
                        rd7.d(bj4VarO, bVar2, numValueOf3);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        mh4Var3 = mh4Var2;
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        num6 = num3;
                        qs5 qs5Var3 = new qs5(true, 2.0f);
                        homeItemBadge3 = homeItemBadge2;
                        aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, qs5Var3);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        bj4VarO.K(-1379228937);
                        if (num5 != null) {
                            strF = nr1.f(bj4VarO, num5.intValue());
                        } else {
                            if (str3 == null) {
                                strF = BuildConfig.FLAVOR;
                            } else {
                                str5 = str3;
                            }
                            bj4VarO.U(false);
                            intercomTheme = IntercomTheme.INSTANCE;
                            i19 = IntercomTheme.$stable;
                            ox6Var6 = ox6VarJ;
                            ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                            mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                            bj4Var = bj4VarO;
                            bj4Var.K(-1379221164);
                            if (str4 != null) {
                                mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                                bj4Var = bj4Var;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                                bj4Var.K(941879891);
                                ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                                iHashCode4 = Long.hashCode(bj4Var.T);
                                kw7VarP4 = bj4Var.P();
                                ox6VarC4 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, ny8VarA2);
                                rd7.d(bj4Var, eVar, kw7VarP4);
                                l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC4);
                                ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                                bj4Var.K(-1379205196);
                                if (num6 == null) {
                                    ox6Var7 = ox6Var6;
                                } else {
                                    ox6Var7 = ox6Var6;
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    g2b g2bVar17 = g2b.a;
                                }
                                bj4Var.U(false);
                                bj4Var.U(true);
                                bj4Var.U(false);
                                g2b g2bVar18 = g2b.a;
                                ci4Var4 = ci4Var3;
                                z3 = true;
                            } else {
                                ox6Var7 = ox6Var6;
                                ci4Var4 = ci4Var3;
                                if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                    bj4Var.K(942534549);
                                    if (num6 == null) {
                                        z5 = true;
                                        z4 = false;
                                    } else {
                                        fl6VarD = dv0.d(di.a.a, false);
                                        iHashCode3 = Long.hashCode(bj4Var.T);
                                        kw7VarP3 = bj4Var.P();
                                        ox6VarC3 = it1.c(bj4Var, aVar);
                                        if (j1bVar != null) {
                                            ml5.c();
                                            throw null;
                                        }
                                        bj4Var.q();
                                        if (bj4Var.S) {
                                            bj4Var.k(aVar2);
                                        } else {
                                            bj4Var.z();
                                        }
                                        rd7.d(bj4Var, cVar, fl6VarD);
                                        rd7.d(bj4Var, eVar, kw7VarP3);
                                        l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                        rd7.d(bj4Var, dVar, ox6VarC3);
                                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                        z4 = false;
                                        dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                        z5 = true;
                                        bj4Var.U(true);
                                        g2b g2bVar19 = g2b.a;
                                    }
                                    bj4Var.U(z4);
                                    z3 = z5;
                                } else {
                                    ci4Var4 = ci4Var4;
                                    if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                        bj4Var.K(861667097);
                                        bj4Var.U(false);
                                        defpackage.u.b();
                                        return;
                                    }
                                    bj4Var.K(943331838);
                                    ox6 ox6VarM5 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                    bj4Var.K(861717389);
                                    objF2 = bj4Var.f();
                                    if (objF2 == c0187a) {
                                        z2 = false;
                                        objF2 = new w05(0 == true ? 1 : 0);
                                        bj4Var.C(objF2);
                                    } else {
                                        z2 = false;
                                    }
                                    bj4Var.U(z2);
                                    z3 = true;
                                    bj4 bj4Var6 = bj4Var;
                                    mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM5, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var6, 1597824, 0, 262056);
                                    bj4Var = bj4Var6;
                                    bj4Var.U(false);
                                    g2b g2bVar110 = g2b.a;
                                }
                            }
                            bj4Var.U(z3);
                            homeItemBadge4 = homeItemBadge3;
                            ox6Var8 = ox6Var7;
                            str6 = str3;
                            str7 = str4;
                            ox6Var9 = ox6Var5;
                            num7 = num6;
                            mh4Var4 = mh4Var3;
                            ci4Var5 = ci4Var4;
                            num8 = num5;
                        }
                        str5 = strF;
                        bj4VarO.U(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        ox6Var6 = ox6VarJ;
                        ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                        bj4Var = bj4VarO;
                        bj4Var.K(-1379221164);
                        if (str4 != null) {
                            mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                            bj4Var.K(941879891);
                            ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA2);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                            bj4Var.K(-1379205196);
                            if (num6 == null) {
                                ox6Var7 = ox6Var6;
                            } else {
                                ox6Var7 = ox6Var6;
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                g2b g2bVar111 = g2b.a;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.U(false);
                            g2b g2bVar112 = g2b.a;
                            ci4Var4 = ci4Var3;
                            z3 = true;
                        } else {
                            ox6Var7 = ox6Var6;
                            ci4Var4 = ci4Var3;
                            if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                bj4Var.K(942534549);
                                if (num6 == null) {
                                    z5 = true;
                                    z4 = false;
                                } else {
                                    fl6VarD = dv0.d(di.a.a, false);
                                    iHashCode3 = Long.hashCode(bj4Var.T);
                                    kw7VarP3 = bj4Var.P();
                                    ox6VarC3 = it1.c(bj4Var, aVar);
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4Var.q();
                                    if (bj4Var.S) {
                                        bj4Var.k(aVar2);
                                    } else {
                                        bj4Var.z();
                                    }
                                    rd7.d(bj4Var, cVar, fl6VarD);
                                    rd7.d(bj4Var, eVar, kw7VarP3);
                                    l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                    rd7.d(bj4Var, dVar, ox6VarC3);
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    z4 = false;
                                    dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                    z5 = true;
                                    bj4Var.U(true);
                                    g2b g2bVar113 = g2b.a;
                                }
                                bj4Var.U(z4);
                                z3 = z5;
                            } else {
                                ci4Var4 = ci4Var4;
                                if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                    bj4Var.K(861667097);
                                    bj4Var.U(false);
                                    defpackage.u.b();
                                    return;
                                }
                                bj4Var.K(943331838);
                                ox6 ox6VarM6 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                bj4Var.K(861717389);
                                objF2 = bj4Var.f();
                                if (objF2 == c0187a) {
                                    z2 = false;
                                    objF2 = new w05(0 == true ? 1 : 0);
                                    bj4Var.C(objF2);
                                } else {
                                    z2 = false;
                                }
                                bj4Var.U(z2);
                                z3 = true;
                                bj4 bj4Var7 = bj4Var;
                                mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM6, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var7, 1597824, 0, 262056);
                                bj4Var = bj4Var7;
                                bj4Var.U(false);
                                g2b g2bVar114 = g2b.a;
                            }
                        }
                        bj4Var.U(z3);
                        homeItemBadge4 = homeItemBadge3;
                        ox6Var8 = ox6Var7;
                        str6 = str3;
                        str7 = str4;
                        ox6Var9 = ox6Var5;
                        num7 = num6;
                        mh4Var4 = mh4Var3;
                        ci4Var5 = ci4Var4;
                        num8 = num5;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: x05
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HomeItemKt.HomeItem$lambda$12(ox6Var9, num7, ci4Var5, ox6Var8, num8, str6, str7, homeItemBadge4, mh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 3072;
                ox6Var4 = ox6Var2;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        num4 = num2;
                        if (bj4VarO.J(num4)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                        j1bVar = j1bVar2;
                    } else {
                        j1bVar = j1bVar2;
                        if ((i & 196608) == 0) {
                            if (bj4VarO.J(str)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                    }
                    i12 = i2 & 64;
                    if (i12 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (bj4VarO.J(str2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 128;
                    i15 = 12582912;
                    if (i14 == 0) {
                        i3 |= i15;
                    } else if ((i & 12582912) == 0) {
                        if ((i & 16777216) == 0) {
                            zJ = bj4VarO.J(homeItemBadge);
                        } else {
                            zJ = bj4VarO.j(homeItemBadge);
                        }
                        if (zJ) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i3 |= i15;
                    }
                    i16 = i2 & 256;
                    if (i16 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (bj4VarO.j(mh4Var)) {
                            i17 = 67108864;
                        } else {
                            i17 = 33554432;
                        }
                        i3 |= i17;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        aVar = ox6.a.t;
                        if (i20 != 0) {
                            ox6Var3 = aVar;
                        }
                        if (i21 != 0) {
                            num3 = null;
                        }
                        if (i4 != 0) {
                            ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                        }
                        if (i6 != 0) {
                            ox6VarJ = ir9.j(aVar, 16.0f);
                        } else {
                            ox6VarJ = ox6Var4;
                        }
                        if (i8 != 0) {
                            num4 = null;
                        }
                        if (i10 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i12 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i14 != 0) {
                            homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                        } else {
                            homeItemBadge2 = homeItemBadge;
                        }
                        c0187a = jt1.a.a;
                        if (i16 != 0) {
                            bj4VarO.K(-244016614);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new v05();
                                bj4VarO.C(objF3);
                            }
                            mh4Var2 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        ox6 ox6VarC8 = ir9.c(ox6Var3, 1.0f);
                        bj4VarO.K(-244013531);
                        if ((234881024 & i3) == 67108864) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            objF = new gb3(2, mh4Var2);
                            bj4VarO.C(objF);
                        } else {
                            objF = new gb3(2, mh4Var2);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        num5 = num4;
                        ox6Var5 = ox6Var3;
                        ox6 ox6VarJ5 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC8, false, null, (mh4) objF, 15));
                        c30.j jVar4 = c30.a;
                        bVar = di.a.k;
                        ny8VarA = ly8.a(jVar4, bVar, bj4VarO, 48);
                        i18 = i3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarJ5);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        cVar = bt1.a.f;
                        rd7.d(bj4VarO, cVar, ny8VarA);
                        eVar = bt1.a.e;
                        rd7.d(bj4VarO, eVar, kw7VarP);
                        Integer numValueOf4 = Integer.valueOf(iHashCode);
                        bVar2 = bt1.a.g;
                        rd7.d(bj4VarO, bVar2, numValueOf4);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        mh4Var3 = mh4Var2;
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        num6 = num3;
                        qs5 qs5Var4 = new qs5(true, 2.0f);
                        homeItemBadge3 = homeItemBadge2;
                        aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, qs5Var4);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        bj4VarO.K(-1379228937);
                        if (num5 != null) {
                            strF = nr1.f(bj4VarO, num5.intValue());
                        } else {
                            if (str3 == null) {
                                strF = BuildConfig.FLAVOR;
                            } else {
                                str5 = str3;
                            }
                            bj4VarO.U(false);
                            intercomTheme = IntercomTheme.INSTANCE;
                            i19 = IntercomTheme.$stable;
                            ox6Var6 = ox6VarJ;
                            ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                            mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                            bj4Var = bj4VarO;
                            bj4Var.K(-1379221164);
                            if (str4 != null) {
                                mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                                bj4Var = bj4Var;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                                bj4Var.K(941879891);
                                ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                                iHashCode4 = Long.hashCode(bj4Var.T);
                                kw7VarP4 = bj4Var.P();
                                ox6VarC4 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, ny8VarA2);
                                rd7.d(bj4Var, eVar, kw7VarP4);
                                l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC4);
                                ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                                bj4Var.K(-1379205196);
                                if (num6 == null) {
                                    ox6Var7 = ox6Var6;
                                } else {
                                    ox6Var7 = ox6Var6;
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    g2b g2bVar115 = g2b.a;
                                }
                                bj4Var.U(false);
                                bj4Var.U(true);
                                bj4Var.U(false);
                                g2b g2bVar116 = g2b.a;
                                ci4Var4 = ci4Var3;
                                z3 = true;
                            } else {
                                ox6Var7 = ox6Var6;
                                ci4Var4 = ci4Var3;
                                if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                    bj4Var.K(942534549);
                                    if (num6 == null) {
                                        z5 = true;
                                        z4 = false;
                                    } else {
                                        fl6VarD = dv0.d(di.a.a, false);
                                        iHashCode3 = Long.hashCode(bj4Var.T);
                                        kw7VarP3 = bj4Var.P();
                                        ox6VarC3 = it1.c(bj4Var, aVar);
                                        if (j1bVar != null) {
                                            ml5.c();
                                            throw null;
                                        }
                                        bj4Var.q();
                                        if (bj4Var.S) {
                                            bj4Var.k(aVar2);
                                        } else {
                                            bj4Var.z();
                                        }
                                        rd7.d(bj4Var, cVar, fl6VarD);
                                        rd7.d(bj4Var, eVar, kw7VarP3);
                                        l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                        rd7.d(bj4Var, dVar, ox6VarC3);
                                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                        z4 = false;
                                        dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                        z5 = true;
                                        bj4Var.U(true);
                                        g2b g2bVar117 = g2b.a;
                                    }
                                    bj4Var.U(z4);
                                    z3 = z5;
                                } else {
                                    ci4Var4 = ci4Var4;
                                    if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                        bj4Var.K(861667097);
                                        bj4Var.U(false);
                                        defpackage.u.b();
                                        return;
                                    }
                                    bj4Var.K(943331838);
                                    ox6 ox6VarM7 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                    bj4Var.K(861717389);
                                    objF2 = bj4Var.f();
                                    if (objF2 == c0187a) {
                                        z2 = false;
                                        objF2 = new w05(0 == true ? 1 : 0);
                                        bj4Var.C(objF2);
                                    } else {
                                        z2 = false;
                                    }
                                    bj4Var.U(z2);
                                    z3 = true;
                                    bj4 bj4Var8 = bj4Var;
                                    mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM7, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var8, 1597824, 0, 262056);
                                    bj4Var = bj4Var8;
                                    bj4Var.U(false);
                                    g2b g2bVar118 = g2b.a;
                                }
                            }
                            bj4Var.U(z3);
                            homeItemBadge4 = homeItemBadge3;
                            ox6Var8 = ox6Var7;
                            str6 = str3;
                            str7 = str4;
                            ox6Var9 = ox6Var5;
                            num7 = num6;
                            mh4Var4 = mh4Var3;
                            ci4Var5 = ci4Var4;
                            num8 = num5;
                        }
                        str5 = strF;
                        bj4VarO.U(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        ox6Var6 = ox6VarJ;
                        ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                        bj4Var = bj4VarO;
                        bj4Var.K(-1379221164);
                        if (str4 != null) {
                            mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                            bj4Var.K(941879891);
                            ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA2);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                            bj4Var.K(-1379205196);
                            if (num6 == null) {
                                ox6Var7 = ox6Var6;
                            } else {
                                ox6Var7 = ox6Var6;
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                g2b g2bVar119 = g2b.a;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.U(false);
                            g2b g2bVar1110 = g2b.a;
                            ci4Var4 = ci4Var3;
                            z3 = true;
                        } else {
                            ox6Var7 = ox6Var6;
                            ci4Var4 = ci4Var3;
                            if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                bj4Var.K(942534549);
                                if (num6 == null) {
                                    z5 = true;
                                    z4 = false;
                                } else {
                                    fl6VarD = dv0.d(di.a.a, false);
                                    iHashCode3 = Long.hashCode(bj4Var.T);
                                    kw7VarP3 = bj4Var.P();
                                    ox6VarC3 = it1.c(bj4Var, aVar);
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4Var.q();
                                    if (bj4Var.S) {
                                        bj4Var.k(aVar2);
                                    } else {
                                        bj4Var.z();
                                    }
                                    rd7.d(bj4Var, cVar, fl6VarD);
                                    rd7.d(bj4Var, eVar, kw7VarP3);
                                    l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                    rd7.d(bj4Var, dVar, ox6VarC3);
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    z4 = false;
                                    dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                    z5 = true;
                                    bj4Var.U(true);
                                    g2b g2bVar1111 = g2b.a;
                                }
                                bj4Var.U(z4);
                                z3 = z5;
                            } else {
                                ci4Var4 = ci4Var4;
                                if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                    bj4Var.K(861667097);
                                    bj4Var.U(false);
                                    defpackage.u.b();
                                    return;
                                }
                                bj4Var.K(943331838);
                                ox6 ox6VarM8 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                bj4Var.K(861717389);
                                objF2 = bj4Var.f();
                                if (objF2 == c0187a) {
                                    z2 = false;
                                    objF2 = new w05(0 == true ? 1 : 0);
                                    bj4Var.C(objF2);
                                } else {
                                    z2 = false;
                                }
                                bj4Var.U(z2);
                                z3 = true;
                                bj4 bj4Var9 = bj4Var;
                                mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM8, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var9, 1597824, 0, 262056);
                                bj4Var = bj4Var9;
                                bj4Var.U(false);
                                g2b g2bVar1112 = g2b.a;
                            }
                        }
                        bj4Var.U(z3);
                        homeItemBadge4 = homeItemBadge3;
                        ox6Var8 = ox6Var7;
                        str6 = str3;
                        str7 = str4;
                        ox6Var9 = ox6Var5;
                        num7 = num6;
                        mh4Var4 = mh4Var3;
                        ci4Var5 = ci4Var4;
                        num8 = num5;
                    } else {
                        aVar = ox6.a.t;
                        if (i20 != 0) {
                            ox6Var3 = aVar;
                        }
                        if (i21 != 0) {
                            num3 = null;
                        }
                        if (i4 != 0) {
                            ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                        }
                        if (i6 != 0) {
                            ox6VarJ = ir9.j(aVar, 16.0f);
                        } else {
                            ox6VarJ = ox6Var4;
                        }
                        if (i8 != 0) {
                            num4 = null;
                        }
                        if (i10 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i12 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i14 != 0) {
                            homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                        } else {
                            homeItemBadge2 = homeItemBadge;
                        }
                        c0187a = jt1.a.a;
                        if (i16 != 0) {
                            bj4VarO.K(-244016614);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new v05();
                                bj4VarO.C(objF3);
                            }
                            mh4Var2 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        ox6 ox6VarC9 = ir9.c(ox6Var3, 1.0f);
                        bj4VarO.K(-244013531);
                        if ((234881024 & i3) == 67108864) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            objF = new gb3(2, mh4Var2);
                            bj4VarO.C(objF);
                        } else {
                            objF = new gb3(2, mh4Var2);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        num5 = num4;
                        ox6Var5 = ox6Var3;
                        ox6 ox6VarJ6 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC9, false, null, (mh4) objF, 15));
                        c30.j jVar5 = c30.a;
                        bVar = di.a.k;
                        ny8VarA = ly8.a(jVar5, bVar, bj4VarO, 48);
                        i18 = i3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarJ6);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        cVar = bt1.a.f;
                        rd7.d(bj4VarO, cVar, ny8VarA);
                        eVar = bt1.a.e;
                        rd7.d(bj4VarO, eVar, kw7VarP);
                        Integer numValueOf5 = Integer.valueOf(iHashCode);
                        bVar2 = bt1.a.g;
                        rd7.d(bj4VarO, bVar2, numValueOf5);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        mh4Var3 = mh4Var2;
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        num6 = num3;
                        qs5 qs5Var5 = new qs5(true, 2.0f);
                        homeItemBadge3 = homeItemBadge2;
                        aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, qs5Var5);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        bj4VarO.K(-1379228937);
                        if (num5 != null) {
                            strF = nr1.f(bj4VarO, num5.intValue());
                        } else {
                            if (str3 == null) {
                                strF = BuildConfig.FLAVOR;
                            } else {
                                str5 = str3;
                            }
                            bj4VarO.U(false);
                            intercomTheme = IntercomTheme.INSTANCE;
                            i19 = IntercomTheme.$stable;
                            ox6Var6 = ox6VarJ;
                            ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                            mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                            bj4Var = bj4VarO;
                            bj4Var.K(-1379221164);
                            if (str4 != null) {
                                mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                                bj4Var = bj4Var;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                                bj4Var.K(941879891);
                                ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                                iHashCode4 = Long.hashCode(bj4Var.T);
                                kw7VarP4 = bj4Var.P();
                                ox6VarC4 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, ny8VarA2);
                                rd7.d(bj4Var, eVar, kw7VarP4);
                                l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC4);
                                ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                                bj4Var.K(-1379205196);
                                if (num6 == null) {
                                    ox6Var7 = ox6Var6;
                                } else {
                                    ox6Var7 = ox6Var6;
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    g2b g2bVar1113 = g2b.a;
                                }
                                bj4Var.U(false);
                                bj4Var.U(true);
                                bj4Var.U(false);
                                g2b g2bVar1114 = g2b.a;
                                ci4Var4 = ci4Var3;
                                z3 = true;
                            } else {
                                ox6Var7 = ox6Var6;
                                ci4Var4 = ci4Var3;
                                if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                    bj4Var.K(942534549);
                                    if (num6 == null) {
                                        z5 = true;
                                        z4 = false;
                                    } else {
                                        fl6VarD = dv0.d(di.a.a, false);
                                        iHashCode3 = Long.hashCode(bj4Var.T);
                                        kw7VarP3 = bj4Var.P();
                                        ox6VarC3 = it1.c(bj4Var, aVar);
                                        if (j1bVar != null) {
                                            ml5.c();
                                            throw null;
                                        }
                                        bj4Var.q();
                                        if (bj4Var.S) {
                                            bj4Var.k(aVar2);
                                        } else {
                                            bj4Var.z();
                                        }
                                        rd7.d(bj4Var, cVar, fl6VarD);
                                        rd7.d(bj4Var, eVar, kw7VarP3);
                                        l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                        rd7.d(bj4Var, dVar, ox6VarC3);
                                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                        z4 = false;
                                        dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                        z5 = true;
                                        bj4Var.U(true);
                                        g2b g2bVar1115 = g2b.a;
                                    }
                                    bj4Var.U(z4);
                                    z3 = z5;
                                } else {
                                    ci4Var4 = ci4Var4;
                                    if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                        bj4Var.K(861667097);
                                        bj4Var.U(false);
                                        defpackage.u.b();
                                        return;
                                    }
                                    bj4Var.K(943331838);
                                    ox6 ox6VarM9 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                    bj4Var.K(861717389);
                                    objF2 = bj4Var.f();
                                    if (objF2 == c0187a) {
                                        z2 = false;
                                        objF2 = new w05(0 == true ? 1 : 0);
                                        bj4Var.C(objF2);
                                    } else {
                                        z2 = false;
                                    }
                                    bj4Var.U(z2);
                                    z3 = true;
                                    bj4 bj4Var10 = bj4Var;
                                    mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM9, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var10, 1597824, 0, 262056);
                                    bj4Var = bj4Var10;
                                    bj4Var.U(false);
                                    g2b g2bVar1116 = g2b.a;
                                }
                            }
                            bj4Var.U(z3);
                            homeItemBadge4 = homeItemBadge3;
                            ox6Var8 = ox6Var7;
                            str6 = str3;
                            str7 = str4;
                            ox6Var9 = ox6Var5;
                            num7 = num6;
                            mh4Var4 = mh4Var3;
                            ci4Var5 = ci4Var4;
                            num8 = num5;
                        }
                        str5 = strF;
                        bj4VarO.U(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        ox6Var6 = ox6VarJ;
                        ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                        bj4Var = bj4VarO;
                        bj4Var.K(-1379221164);
                        if (str4 != null) {
                            mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                            bj4Var.K(941879891);
                            ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA2);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                            bj4Var.K(-1379205196);
                            if (num6 == null) {
                                ox6Var7 = ox6Var6;
                            } else {
                                ox6Var7 = ox6Var6;
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                g2b g2bVar1117 = g2b.a;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.U(false);
                            g2b g2bVar1118 = g2b.a;
                            ci4Var4 = ci4Var3;
                            z3 = true;
                        } else {
                            ox6Var7 = ox6Var6;
                            ci4Var4 = ci4Var3;
                            if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                bj4Var.K(942534549);
                                if (num6 == null) {
                                    z5 = true;
                                    z4 = false;
                                } else {
                                    fl6VarD = dv0.d(di.a.a, false);
                                    iHashCode3 = Long.hashCode(bj4Var.T);
                                    kw7VarP3 = bj4Var.P();
                                    ox6VarC3 = it1.c(bj4Var, aVar);
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4Var.q();
                                    if (bj4Var.S) {
                                        bj4Var.k(aVar2);
                                    } else {
                                        bj4Var.z();
                                    }
                                    rd7.d(bj4Var, cVar, fl6VarD);
                                    rd7.d(bj4Var, eVar, kw7VarP3);
                                    l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                    rd7.d(bj4Var, dVar, ox6VarC3);
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    z4 = false;
                                    dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                    z5 = true;
                                    bj4Var.U(true);
                                    g2b g2bVar1119 = g2b.a;
                                }
                                bj4Var.U(z4);
                                z3 = z5;
                            } else {
                                ci4Var4 = ci4Var4;
                                if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                    bj4Var.K(861667097);
                                    bj4Var.U(false);
                                    defpackage.u.b();
                                    return;
                                }
                                bj4Var.K(943331838);
                                ox6 ox6VarM10 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                bj4Var.K(861717389);
                                objF2 = bj4Var.f();
                                if (objF2 == c0187a) {
                                    z2 = false;
                                    objF2 = new w05(0 == true ? 1 : 0);
                                    bj4Var.C(objF2);
                                } else {
                                    z2 = false;
                                }
                                bj4Var.U(z2);
                                z3 = true;
                                bj4 bj4Var11 = bj4Var;
                                mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM10, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var11, 1597824, 0, 262056);
                                bj4Var = bj4Var11;
                                bj4Var.U(false);
                                g2b g2bVar11110 = g2b.a;
                            }
                        }
                        bj4Var.U(z3);
                        homeItemBadge4 = homeItemBadge3;
                        ox6Var8 = ox6Var7;
                        str6 = str3;
                        str7 = str4;
                        ox6Var9 = ox6Var5;
                        num7 = num6;
                        mh4Var4 = mh4Var3;
                        ci4Var5 = ci4Var4;
                        num8 = num5;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: x05
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HomeItemKt.HomeItem$lambda$12(ox6Var9, num7, ci4Var5, ox6Var8, num8, str6, str7, homeItemBadge4, mh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                num4 = num2;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                    j1bVar = j1bVar2;
                } else {
                    j1bVar = j1bVar2;
                    if ((i & 196608) == 0) {
                        if (bj4VarO.J(str)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (bj4VarO.J(str2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                i15 = 12582912;
                if (i14 == 0) {
                    i3 |= i15;
                } else if ((i & 12582912) == 0) {
                    if ((i & 16777216) == 0) {
                        zJ = bj4VarO.J(homeItemBadge);
                    } else {
                        zJ = bj4VarO.j(homeItemBadge);
                    }
                    if (zJ) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                i16 = i2 & 256;
                if (i16 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (bj4VarO.j(mh4Var)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i3 |= i17;
                }
                if ((i3 & 38347923) == 38347922) {
                    aVar = ox6.a.t;
                    if (i20 != 0) {
                        ox6Var3 = aVar;
                    }
                    if (i21 != 0) {
                        num3 = null;
                    }
                    if (i4 != 0) {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    if (i6 != 0) {
                        ox6VarJ = ir9.j(aVar, 16.0f);
                    } else {
                        ox6VarJ = ox6Var4;
                    }
                    if (i8 != 0) {
                        num4 = null;
                    }
                    if (i10 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i12 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                    } else {
                        homeItemBadge2 = homeItemBadge;
                    }
                    c0187a = jt1.a.a;
                    if (i16 != 0) {
                        bj4VarO.K(-244016614);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new v05();
                            bj4VarO.C(objF3);
                        }
                        mh4Var2 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    ox6 ox6VarC10 = ir9.c(ox6Var3, 1.0f);
                    bj4VarO.K(-244013531);
                    if ((234881024 & i3) == 67108864) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    } else {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    num5 = num4;
                    ox6Var5 = ox6Var3;
                    ox6 ox6VarJ7 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC10, false, null, (mh4) objF, 15));
                    c30.j jVar6 = c30.a;
                    bVar = di.a.k;
                    ny8VarA = ly8.a(jVar6, bVar, bj4VarO, 48);
                    i18 = i3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarJ7);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf6 = Integer.valueOf(iHashCode);
                    bVar2 = bt1.a.g;
                    rd7.d(bj4VarO, bVar2, numValueOf6);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    mh4Var3 = mh4Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    num6 = num3;
                    qs5 qs5Var6 = new qs5(true, 2.0f);
                    homeItemBadge3 = homeItemBadge2;
                    aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, qs5Var6);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    bj4VarO.K(-1379228937);
                    if (num5 != null) {
                        strF = nr1.f(bj4VarO, num5.intValue());
                    } else {
                        if (str3 == null) {
                            strF = BuildConfig.FLAVOR;
                        } else {
                            str5 = str3;
                        }
                        bj4VarO.U(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        ox6Var6 = ox6VarJ;
                        ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                        bj4Var = bj4VarO;
                        bj4Var.K(-1379221164);
                        if (str4 != null) {
                            mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                            bj4Var.K(941879891);
                            ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA2);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                            bj4Var.K(-1379205196);
                            if (num6 == null) {
                                ox6Var7 = ox6Var6;
                            } else {
                                ox6Var7 = ox6Var6;
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                g2b g2bVar11111 = g2b.a;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.U(false);
                            g2b g2bVar11112 = g2b.a;
                            ci4Var4 = ci4Var3;
                            z3 = true;
                        } else {
                            ox6Var7 = ox6Var6;
                            ci4Var4 = ci4Var3;
                            if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                bj4Var.K(942534549);
                                if (num6 == null) {
                                    z5 = true;
                                    z4 = false;
                                } else {
                                    fl6VarD = dv0.d(di.a.a, false);
                                    iHashCode3 = Long.hashCode(bj4Var.T);
                                    kw7VarP3 = bj4Var.P();
                                    ox6VarC3 = it1.c(bj4Var, aVar);
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4Var.q();
                                    if (bj4Var.S) {
                                        bj4Var.k(aVar2);
                                    } else {
                                        bj4Var.z();
                                    }
                                    rd7.d(bj4Var, cVar, fl6VarD);
                                    rd7.d(bj4Var, eVar, kw7VarP3);
                                    l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                    rd7.d(bj4Var, dVar, ox6VarC3);
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    z4 = false;
                                    dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                    z5 = true;
                                    bj4Var.U(true);
                                    g2b g2bVar11113 = g2b.a;
                                }
                                bj4Var.U(z4);
                                z3 = z5;
                            } else {
                                ci4Var4 = ci4Var4;
                                if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                    bj4Var.K(861667097);
                                    bj4Var.U(false);
                                    defpackage.u.b();
                                    return;
                                }
                                bj4Var.K(943331838);
                                ox6 ox6VarM11 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                bj4Var.K(861717389);
                                objF2 = bj4Var.f();
                                if (objF2 == c0187a) {
                                    z2 = false;
                                    objF2 = new w05(0 == true ? 1 : 0);
                                    bj4Var.C(objF2);
                                } else {
                                    z2 = false;
                                }
                                bj4Var.U(z2);
                                z3 = true;
                                bj4 bj4Var12 = bj4Var;
                                mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM11, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var12, 1597824, 0, 262056);
                                bj4Var = bj4Var12;
                                bj4Var.U(false);
                                g2b g2bVar11114 = g2b.a;
                            }
                        }
                        bj4Var.U(z3);
                        homeItemBadge4 = homeItemBadge3;
                        ox6Var8 = ox6Var7;
                        str6 = str3;
                        str7 = str4;
                        ox6Var9 = ox6Var5;
                        num7 = num6;
                        mh4Var4 = mh4Var3;
                        ci4Var5 = ci4Var4;
                        num8 = num5;
                    }
                    str5 = strF;
                    bj4VarO.U(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    ox6Var6 = ox6VarJ;
                    ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                    bj4Var = bj4VarO;
                    bj4Var.K(-1379221164);
                    if (str4 != null) {
                        mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                        bj4Var.K(941879891);
                        ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA2);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                        bj4Var.K(-1379205196);
                        if (num6 == null) {
                            ox6Var7 = ox6Var6;
                        } else {
                            ox6Var7 = ox6Var6;
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            g2b g2bVar11115 = g2b.a;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(false);
                        g2b g2bVar11116 = g2b.a;
                        ci4Var4 = ci4Var3;
                        z3 = true;
                    } else {
                        ox6Var7 = ox6Var6;
                        ci4Var4 = ci4Var3;
                        if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            bj4Var.K(942534549);
                            if (num6 == null) {
                                z5 = true;
                                z4 = false;
                            } else {
                                fl6VarD = dv0.d(di.a.a, false);
                                iHashCode3 = Long.hashCode(bj4Var.T);
                                kw7VarP3 = bj4Var.P();
                                ox6VarC3 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, fl6VarD);
                                rd7.d(bj4Var, eVar, kw7VarP3);
                                l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC3);
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                z4 = false;
                                dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                z5 = true;
                                bj4Var.U(true);
                                g2b g2bVar11117 = g2b.a;
                            }
                            bj4Var.U(z4);
                            z3 = z5;
                        } else {
                            ci4Var4 = ci4Var4;
                            if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                bj4Var.K(861667097);
                                bj4Var.U(false);
                                defpackage.u.b();
                                return;
                            }
                            bj4Var.K(943331838);
                            ox6 ox6VarM12 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                            bj4Var.K(861717389);
                            objF2 = bj4Var.f();
                            if (objF2 == c0187a) {
                                z2 = false;
                                objF2 = new w05(0 == true ? 1 : 0);
                                bj4Var.C(objF2);
                            } else {
                                z2 = false;
                            }
                            bj4Var.U(z2);
                            z3 = true;
                            bj4 bj4Var13 = bj4Var;
                            mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM12, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var13, 1597824, 0, 262056);
                            bj4Var = bj4Var13;
                            bj4Var.U(false);
                            g2b g2bVar11118 = g2b.a;
                        }
                    }
                    bj4Var.U(z3);
                    homeItemBadge4 = homeItemBadge3;
                    ox6Var8 = ox6Var7;
                    str6 = str3;
                    str7 = str4;
                    ox6Var9 = ox6Var5;
                    num7 = num6;
                    mh4Var4 = mh4Var3;
                    ci4Var5 = ci4Var4;
                    num8 = num5;
                } else {
                    aVar = ox6.a.t;
                    if (i20 != 0) {
                        ox6Var3 = aVar;
                    }
                    if (i21 != 0) {
                        num3 = null;
                    }
                    if (i4 != 0) {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    if (i6 != 0) {
                        ox6VarJ = ir9.j(aVar, 16.0f);
                    } else {
                        ox6VarJ = ox6Var4;
                    }
                    if (i8 != 0) {
                        num4 = null;
                    }
                    if (i10 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i12 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                    } else {
                        homeItemBadge2 = homeItemBadge;
                    }
                    c0187a = jt1.a.a;
                    if (i16 != 0) {
                        bj4VarO.K(-244016614);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new v05();
                            bj4VarO.C(objF3);
                        }
                        mh4Var2 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    ox6 ox6VarC11 = ir9.c(ox6Var3, 1.0f);
                    bj4VarO.K(-244013531);
                    if ((234881024 & i3) == 67108864) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    } else {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    num5 = num4;
                    ox6Var5 = ox6Var3;
                    ox6 ox6VarJ8 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC11, false, null, (mh4) objF, 15));
                    c30.j jVar7 = c30.a;
                    bVar = di.a.k;
                    ny8VarA = ly8.a(jVar7, bVar, bj4VarO, 48);
                    i18 = i3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarJ8);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf7 = Integer.valueOf(iHashCode);
                    bVar2 = bt1.a.g;
                    rd7.d(bj4VarO, bVar2, numValueOf7);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    mh4Var3 = mh4Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    num6 = num3;
                    qs5 qs5Var7 = new qs5(true, 2.0f);
                    homeItemBadge3 = homeItemBadge2;
                    aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, qs5Var7);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    bj4VarO.K(-1379228937);
                    if (num5 != null) {
                        strF = nr1.f(bj4VarO, num5.intValue());
                    } else {
                        if (str3 == null) {
                            strF = BuildConfig.FLAVOR;
                        } else {
                            str5 = str3;
                        }
                        bj4VarO.U(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        ox6Var6 = ox6VarJ;
                        ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                        bj4Var = bj4VarO;
                        bj4Var.K(-1379221164);
                        if (str4 != null) {
                            mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                            bj4Var.K(941879891);
                            ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA2);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                            bj4Var.K(-1379205196);
                            if (num6 == null) {
                                ox6Var7 = ox6Var6;
                            } else {
                                ox6Var7 = ox6Var6;
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                g2b g2bVar11119 = g2b.a;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.U(false);
                            g2b g2bVar111110 = g2b.a;
                            ci4Var4 = ci4Var3;
                            z3 = true;
                        } else {
                            ox6Var7 = ox6Var6;
                            ci4Var4 = ci4Var3;
                            if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                bj4Var.K(942534549);
                                if (num6 == null) {
                                    z5 = true;
                                    z4 = false;
                                } else {
                                    fl6VarD = dv0.d(di.a.a, false);
                                    iHashCode3 = Long.hashCode(bj4Var.T);
                                    kw7VarP3 = bj4Var.P();
                                    ox6VarC3 = it1.c(bj4Var, aVar);
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4Var.q();
                                    if (bj4Var.S) {
                                        bj4Var.k(aVar2);
                                    } else {
                                        bj4Var.z();
                                    }
                                    rd7.d(bj4Var, cVar, fl6VarD);
                                    rd7.d(bj4Var, eVar, kw7VarP3);
                                    l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                    rd7.d(bj4Var, dVar, ox6VarC3);
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    z4 = false;
                                    dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                    z5 = true;
                                    bj4Var.U(true);
                                    g2b g2bVar111111 = g2b.a;
                                }
                                bj4Var.U(z4);
                                z3 = z5;
                            } else {
                                ci4Var4 = ci4Var4;
                                if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                    bj4Var.K(861667097);
                                    bj4Var.U(false);
                                    defpackage.u.b();
                                    return;
                                }
                                bj4Var.K(943331838);
                                ox6 ox6VarM13 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                bj4Var.K(861717389);
                                objF2 = bj4Var.f();
                                if (objF2 == c0187a) {
                                    z2 = false;
                                    objF2 = new w05(0 == true ? 1 : 0);
                                    bj4Var.C(objF2);
                                } else {
                                    z2 = false;
                                }
                                bj4Var.U(z2);
                                z3 = true;
                                bj4 bj4Var14 = bj4Var;
                                mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM13, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var14, 1597824, 0, 262056);
                                bj4Var = bj4Var14;
                                bj4Var.U(false);
                                g2b g2bVar111112 = g2b.a;
                            }
                        }
                        bj4Var.U(z3);
                        homeItemBadge4 = homeItemBadge3;
                        ox6Var8 = ox6Var7;
                        str6 = str3;
                        str7 = str4;
                        ox6Var9 = ox6Var5;
                        num7 = num6;
                        mh4Var4 = mh4Var3;
                        ci4Var5 = ci4Var4;
                        num8 = num5;
                    }
                    str5 = strF;
                    bj4VarO.U(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    ox6Var6 = ox6VarJ;
                    ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                    bj4Var = bj4VarO;
                    bj4Var.K(-1379221164);
                    if (str4 != null) {
                        mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                        bj4Var.K(941879891);
                        ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA2);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                        bj4Var.K(-1379205196);
                        if (num6 == null) {
                            ox6Var7 = ox6Var6;
                        } else {
                            ox6Var7 = ox6Var6;
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            g2b g2bVar111113 = g2b.a;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(false);
                        g2b g2bVar111114 = g2b.a;
                        ci4Var4 = ci4Var3;
                        z3 = true;
                    } else {
                        ox6Var7 = ox6Var6;
                        ci4Var4 = ci4Var3;
                        if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            bj4Var.K(942534549);
                            if (num6 == null) {
                                z5 = true;
                                z4 = false;
                            } else {
                                fl6VarD = dv0.d(di.a.a, false);
                                iHashCode3 = Long.hashCode(bj4Var.T);
                                kw7VarP3 = bj4Var.P();
                                ox6VarC3 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, fl6VarD);
                                rd7.d(bj4Var, eVar, kw7VarP3);
                                l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC3);
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                z4 = false;
                                dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                z5 = true;
                                bj4Var.U(true);
                                g2b g2bVar111115 = g2b.a;
                            }
                            bj4Var.U(z4);
                            z3 = z5;
                        } else {
                            ci4Var4 = ci4Var4;
                            if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                bj4Var.K(861667097);
                                bj4Var.U(false);
                                defpackage.u.b();
                                return;
                            }
                            bj4Var.K(943331838);
                            ox6 ox6VarM14 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                            bj4Var.K(861717389);
                            objF2 = bj4Var.f();
                            if (objF2 == c0187a) {
                                z2 = false;
                                objF2 = new w05(0 == true ? 1 : 0);
                                bj4Var.C(objF2);
                            } else {
                                z2 = false;
                            }
                            bj4Var.U(z2);
                            z3 = true;
                            bj4 bj4Var15 = bj4Var;
                            mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM14, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var15, 1597824, 0, 262056);
                            bj4Var = bj4Var15;
                            bj4Var.U(false);
                            g2b g2bVar111116 = g2b.a;
                        }
                    }
                    bj4Var.U(z3);
                    homeItemBadge4 = homeItemBadge3;
                    ox6Var8 = ox6Var7;
                    str6 = str3;
                    str7 = str4;
                    ox6Var9 = ox6Var5;
                    num7 = num6;
                    mh4Var4 = mh4Var3;
                    ci4Var5 = ci4Var4;
                    num8 = num5;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: x05
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HomeItemKt.HomeItem$lambda$12(ox6Var9, num7, ci4Var5, ox6Var8, num8, str6, str7, homeItemBadge4, mh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 384;
            ci4Var2 = ci4Var;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    ox6Var4 = ox6Var2;
                    if (bj4VarO.J(ox6Var4)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        num4 = num2;
                        if (bj4VarO.J(num4)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                        j1bVar = j1bVar2;
                    } else {
                        j1bVar = j1bVar2;
                        if ((i & 196608) == 0) {
                            if (bj4VarO.J(str)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                    }
                    i12 = i2 & 64;
                    if (i12 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (bj4VarO.J(str2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 128;
                    i15 = 12582912;
                    if (i14 == 0) {
                        i3 |= i15;
                    } else if ((i & 12582912) == 0) {
                        if ((i & 16777216) == 0) {
                            zJ = bj4VarO.J(homeItemBadge);
                        } else {
                            zJ = bj4VarO.j(homeItemBadge);
                        }
                        if (zJ) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i3 |= i15;
                    }
                    i16 = i2 & 256;
                    if (i16 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (bj4VarO.j(mh4Var)) {
                            i17 = 67108864;
                        } else {
                            i17 = 33554432;
                        }
                        i3 |= i17;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        aVar = ox6.a.t;
                        if (i20 != 0) {
                            ox6Var3 = aVar;
                        }
                        if (i21 != 0) {
                            num3 = null;
                        }
                        if (i4 != 0) {
                            ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                        }
                        if (i6 != 0) {
                            ox6VarJ = ir9.j(aVar, 16.0f);
                        } else {
                            ox6VarJ = ox6Var4;
                        }
                        if (i8 != 0) {
                            num4 = null;
                        }
                        if (i10 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i12 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i14 != 0) {
                            homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                        } else {
                            homeItemBadge2 = homeItemBadge;
                        }
                        c0187a = jt1.a.a;
                        if (i16 != 0) {
                            bj4VarO.K(-244016614);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new v05();
                                bj4VarO.C(objF3);
                            }
                            mh4Var2 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        ox6 ox6VarC12 = ir9.c(ox6Var3, 1.0f);
                        bj4VarO.K(-244013531);
                        if ((234881024 & i3) == 67108864) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            objF = new gb3(2, mh4Var2);
                            bj4VarO.C(objF);
                        } else {
                            objF = new gb3(2, mh4Var2);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        num5 = num4;
                        ox6Var5 = ox6Var3;
                        ox6 ox6VarJ9 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC12, false, null, (mh4) objF, 15));
                        c30.j jVar8 = c30.a;
                        bVar = di.a.k;
                        ny8VarA = ly8.a(jVar8, bVar, bj4VarO, 48);
                        i18 = i3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarJ9);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        cVar = bt1.a.f;
                        rd7.d(bj4VarO, cVar, ny8VarA);
                        eVar = bt1.a.e;
                        rd7.d(bj4VarO, eVar, kw7VarP);
                        Integer numValueOf8 = Integer.valueOf(iHashCode);
                        bVar2 = bt1.a.g;
                        rd7.d(bj4VarO, bVar2, numValueOf8);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        mh4Var3 = mh4Var2;
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        num6 = num3;
                        qs5 qs5Var8 = new qs5(true, 2.0f);
                        homeItemBadge3 = homeItemBadge2;
                        aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, qs5Var8);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        bj4VarO.K(-1379228937);
                        if (num5 != null) {
                            strF = nr1.f(bj4VarO, num5.intValue());
                        } else {
                            if (str3 == null) {
                                strF = BuildConfig.FLAVOR;
                            } else {
                                str5 = str3;
                            }
                            bj4VarO.U(false);
                            intercomTheme = IntercomTheme.INSTANCE;
                            i19 = IntercomTheme.$stable;
                            ox6Var6 = ox6VarJ;
                            ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                            mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                            bj4Var = bj4VarO;
                            bj4Var.K(-1379221164);
                            if (str4 != null) {
                                mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                                bj4Var = bj4Var;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                                bj4Var.K(941879891);
                                ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                                iHashCode4 = Long.hashCode(bj4Var.T);
                                kw7VarP4 = bj4Var.P();
                                ox6VarC4 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, ny8VarA2);
                                rd7.d(bj4Var, eVar, kw7VarP4);
                                l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC4);
                                ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                                bj4Var.K(-1379205196);
                                if (num6 == null) {
                                    ox6Var7 = ox6Var6;
                                } else {
                                    ox6Var7 = ox6Var6;
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    g2b g2bVar111117 = g2b.a;
                                }
                                bj4Var.U(false);
                                bj4Var.U(true);
                                bj4Var.U(false);
                                g2b g2bVar111118 = g2b.a;
                                ci4Var4 = ci4Var3;
                                z3 = true;
                            } else {
                                ox6Var7 = ox6Var6;
                                ci4Var4 = ci4Var3;
                                if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                    bj4Var.K(942534549);
                                    if (num6 == null) {
                                        z5 = true;
                                        z4 = false;
                                    } else {
                                        fl6VarD = dv0.d(di.a.a, false);
                                        iHashCode3 = Long.hashCode(bj4Var.T);
                                        kw7VarP3 = bj4Var.P();
                                        ox6VarC3 = it1.c(bj4Var, aVar);
                                        if (j1bVar != null) {
                                            ml5.c();
                                            throw null;
                                        }
                                        bj4Var.q();
                                        if (bj4Var.S) {
                                            bj4Var.k(aVar2);
                                        } else {
                                            bj4Var.z();
                                        }
                                        rd7.d(bj4Var, cVar, fl6VarD);
                                        rd7.d(bj4Var, eVar, kw7VarP3);
                                        l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                        rd7.d(bj4Var, dVar, ox6VarC3);
                                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                        z4 = false;
                                        dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                        z5 = true;
                                        bj4Var.U(true);
                                        g2b g2bVar111119 = g2b.a;
                                    }
                                    bj4Var.U(z4);
                                    z3 = z5;
                                } else {
                                    ci4Var4 = ci4Var4;
                                    if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                        bj4Var.K(861667097);
                                        bj4Var.U(false);
                                        defpackage.u.b();
                                        return;
                                    }
                                    bj4Var.K(943331838);
                                    ox6 ox6VarM15 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                    bj4Var.K(861717389);
                                    objF2 = bj4Var.f();
                                    if (objF2 == c0187a) {
                                        z2 = false;
                                        objF2 = new w05(0 == true ? 1 : 0);
                                        bj4Var.C(objF2);
                                    } else {
                                        z2 = false;
                                    }
                                    bj4Var.U(z2);
                                    z3 = true;
                                    bj4 bj4Var16 = bj4Var;
                                    mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM15, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var16, 1597824, 0, 262056);
                                    bj4Var = bj4Var16;
                                    bj4Var.U(false);
                                    g2b g2bVar1111110 = g2b.a;
                                }
                            }
                            bj4Var.U(z3);
                            homeItemBadge4 = homeItemBadge3;
                            ox6Var8 = ox6Var7;
                            str6 = str3;
                            str7 = str4;
                            ox6Var9 = ox6Var5;
                            num7 = num6;
                            mh4Var4 = mh4Var3;
                            ci4Var5 = ci4Var4;
                            num8 = num5;
                        }
                        str5 = strF;
                        bj4VarO.U(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        ox6Var6 = ox6VarJ;
                        ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                        bj4Var = bj4VarO;
                        bj4Var.K(-1379221164);
                        if (str4 != null) {
                            mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                            bj4Var.K(941879891);
                            ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA2);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                            bj4Var.K(-1379205196);
                            if (num6 == null) {
                                ox6Var7 = ox6Var6;
                            } else {
                                ox6Var7 = ox6Var6;
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                g2b g2bVar1111111 = g2b.a;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.U(false);
                            g2b g2bVar1111112 = g2b.a;
                            ci4Var4 = ci4Var3;
                            z3 = true;
                        } else {
                            ox6Var7 = ox6Var6;
                            ci4Var4 = ci4Var3;
                            if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                bj4Var.K(942534549);
                                if (num6 == null) {
                                    z5 = true;
                                    z4 = false;
                                } else {
                                    fl6VarD = dv0.d(di.a.a, false);
                                    iHashCode3 = Long.hashCode(bj4Var.T);
                                    kw7VarP3 = bj4Var.P();
                                    ox6VarC3 = it1.c(bj4Var, aVar);
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4Var.q();
                                    if (bj4Var.S) {
                                        bj4Var.k(aVar2);
                                    } else {
                                        bj4Var.z();
                                    }
                                    rd7.d(bj4Var, cVar, fl6VarD);
                                    rd7.d(bj4Var, eVar, kw7VarP3);
                                    l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                    rd7.d(bj4Var, dVar, ox6VarC3);
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    z4 = false;
                                    dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                    z5 = true;
                                    bj4Var.U(true);
                                    g2b g2bVar1111113 = g2b.a;
                                }
                                bj4Var.U(z4);
                                z3 = z5;
                            } else {
                                ci4Var4 = ci4Var4;
                                if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                    bj4Var.K(861667097);
                                    bj4Var.U(false);
                                    defpackage.u.b();
                                    return;
                                }
                                bj4Var.K(943331838);
                                ox6 ox6VarM16 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                bj4Var.K(861717389);
                                objF2 = bj4Var.f();
                                if (objF2 == c0187a) {
                                    z2 = false;
                                    objF2 = new w05(0 == true ? 1 : 0);
                                    bj4Var.C(objF2);
                                } else {
                                    z2 = false;
                                }
                                bj4Var.U(z2);
                                z3 = true;
                                bj4 bj4Var17 = bj4Var;
                                mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM16, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var17, 1597824, 0, 262056);
                                bj4Var = bj4Var17;
                                bj4Var.U(false);
                                g2b g2bVar1111114 = g2b.a;
                            }
                        }
                        bj4Var.U(z3);
                        homeItemBadge4 = homeItemBadge3;
                        ox6Var8 = ox6Var7;
                        str6 = str3;
                        str7 = str4;
                        ox6Var9 = ox6Var5;
                        num7 = num6;
                        mh4Var4 = mh4Var3;
                        ci4Var5 = ci4Var4;
                        num8 = num5;
                    } else {
                        aVar = ox6.a.t;
                        if (i20 != 0) {
                            ox6Var3 = aVar;
                        }
                        if (i21 != 0) {
                            num3 = null;
                        }
                        if (i4 != 0) {
                            ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                        }
                        if (i6 != 0) {
                            ox6VarJ = ir9.j(aVar, 16.0f);
                        } else {
                            ox6VarJ = ox6Var4;
                        }
                        if (i8 != 0) {
                            num4 = null;
                        }
                        if (i10 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i12 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i14 != 0) {
                            homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                        } else {
                            homeItemBadge2 = homeItemBadge;
                        }
                        c0187a = jt1.a.a;
                        if (i16 != 0) {
                            bj4VarO.K(-244016614);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new v05();
                                bj4VarO.C(objF3);
                            }
                            mh4Var2 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        ox6 ox6VarC13 = ir9.c(ox6Var3, 1.0f);
                        bj4VarO.K(-244013531);
                        if ((234881024 & i3) == 67108864) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            objF = new gb3(2, mh4Var2);
                            bj4VarO.C(objF);
                        } else {
                            objF = new gb3(2, mh4Var2);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        num5 = num4;
                        ox6Var5 = ox6Var3;
                        ox6 ox6VarJ10 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC13, false, null, (mh4) objF, 15));
                        c30.j jVar9 = c30.a;
                        bVar = di.a.k;
                        ny8VarA = ly8.a(jVar9, bVar, bj4VarO, 48);
                        i18 = i3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarJ10);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        cVar = bt1.a.f;
                        rd7.d(bj4VarO, cVar, ny8VarA);
                        eVar = bt1.a.e;
                        rd7.d(bj4VarO, eVar, kw7VarP);
                        Integer numValueOf9 = Integer.valueOf(iHashCode);
                        bVar2 = bt1.a.g;
                        rd7.d(bj4VarO, bVar2, numValueOf9);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        mh4Var3 = mh4Var2;
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        num6 = num3;
                        qs5 qs5Var9 = new qs5(true, 2.0f);
                        homeItemBadge3 = homeItemBadge2;
                        aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, qs5Var9);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        bj4VarO.K(-1379228937);
                        if (num5 != null) {
                            strF = nr1.f(bj4VarO, num5.intValue());
                        } else {
                            if (str3 == null) {
                                strF = BuildConfig.FLAVOR;
                            } else {
                                str5 = str3;
                            }
                            bj4VarO.U(false);
                            intercomTheme = IntercomTheme.INSTANCE;
                            i19 = IntercomTheme.$stable;
                            ox6Var6 = ox6VarJ;
                            ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                            mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                            bj4Var = bj4VarO;
                            bj4Var.K(-1379221164);
                            if (str4 != null) {
                                mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                                bj4Var = bj4Var;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                                bj4Var.K(941879891);
                                ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                                iHashCode4 = Long.hashCode(bj4Var.T);
                                kw7VarP4 = bj4Var.P();
                                ox6VarC4 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, ny8VarA2);
                                rd7.d(bj4Var, eVar, kw7VarP4);
                                l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC4);
                                ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                                bj4Var.K(-1379205196);
                                if (num6 == null) {
                                    ox6Var7 = ox6Var6;
                                } else {
                                    ox6Var7 = ox6Var6;
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    g2b g2bVar1111115 = g2b.a;
                                }
                                bj4Var.U(false);
                                bj4Var.U(true);
                                bj4Var.U(false);
                                g2b g2bVar1111116 = g2b.a;
                                ci4Var4 = ci4Var3;
                                z3 = true;
                            } else {
                                ox6Var7 = ox6Var6;
                                ci4Var4 = ci4Var3;
                                if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                    bj4Var.K(942534549);
                                    if (num6 == null) {
                                        z5 = true;
                                        z4 = false;
                                    } else {
                                        fl6VarD = dv0.d(di.a.a, false);
                                        iHashCode3 = Long.hashCode(bj4Var.T);
                                        kw7VarP3 = bj4Var.P();
                                        ox6VarC3 = it1.c(bj4Var, aVar);
                                        if (j1bVar != null) {
                                            ml5.c();
                                            throw null;
                                        }
                                        bj4Var.q();
                                        if (bj4Var.S) {
                                            bj4Var.k(aVar2);
                                        } else {
                                            bj4Var.z();
                                        }
                                        rd7.d(bj4Var, cVar, fl6VarD);
                                        rd7.d(bj4Var, eVar, kw7VarP3);
                                        l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                        rd7.d(bj4Var, dVar, ox6VarC3);
                                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                        z4 = false;
                                        dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                        z5 = true;
                                        bj4Var.U(true);
                                        g2b g2bVar1111117 = g2b.a;
                                    }
                                    bj4Var.U(z4);
                                    z3 = z5;
                                } else {
                                    ci4Var4 = ci4Var4;
                                    if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                        bj4Var.K(861667097);
                                        bj4Var.U(false);
                                        defpackage.u.b();
                                        return;
                                    }
                                    bj4Var.K(943331838);
                                    ox6 ox6VarM17 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                    bj4Var.K(861717389);
                                    objF2 = bj4Var.f();
                                    if (objF2 == c0187a) {
                                        z2 = false;
                                        objF2 = new w05(0 == true ? 1 : 0);
                                        bj4Var.C(objF2);
                                    } else {
                                        z2 = false;
                                    }
                                    bj4Var.U(z2);
                                    z3 = true;
                                    bj4 bj4Var18 = bj4Var;
                                    mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM17, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var18, 1597824, 0, 262056);
                                    bj4Var = bj4Var18;
                                    bj4Var.U(false);
                                    g2b g2bVar1111118 = g2b.a;
                                }
                            }
                            bj4Var.U(z3);
                            homeItemBadge4 = homeItemBadge3;
                            ox6Var8 = ox6Var7;
                            str6 = str3;
                            str7 = str4;
                            ox6Var9 = ox6Var5;
                            num7 = num6;
                            mh4Var4 = mh4Var3;
                            ci4Var5 = ci4Var4;
                            num8 = num5;
                        }
                        str5 = strF;
                        bj4VarO.U(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        ox6Var6 = ox6VarJ;
                        ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                        bj4Var = bj4VarO;
                        bj4Var.K(-1379221164);
                        if (str4 != null) {
                            mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                            bj4Var.K(941879891);
                            ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA2);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                            bj4Var.K(-1379205196);
                            if (num6 == null) {
                                ox6Var7 = ox6Var6;
                            } else {
                                ox6Var7 = ox6Var6;
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                g2b g2bVar1111119 = g2b.a;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.U(false);
                            g2b g2bVar11111110 = g2b.a;
                            ci4Var4 = ci4Var3;
                            z3 = true;
                        } else {
                            ox6Var7 = ox6Var6;
                            ci4Var4 = ci4Var3;
                            if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                bj4Var.K(942534549);
                                if (num6 == null) {
                                    z5 = true;
                                    z4 = false;
                                } else {
                                    fl6VarD = dv0.d(di.a.a, false);
                                    iHashCode3 = Long.hashCode(bj4Var.T);
                                    kw7VarP3 = bj4Var.P();
                                    ox6VarC3 = it1.c(bj4Var, aVar);
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4Var.q();
                                    if (bj4Var.S) {
                                        bj4Var.k(aVar2);
                                    } else {
                                        bj4Var.z();
                                    }
                                    rd7.d(bj4Var, cVar, fl6VarD);
                                    rd7.d(bj4Var, eVar, kw7VarP3);
                                    l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                    rd7.d(bj4Var, dVar, ox6VarC3);
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    z4 = false;
                                    dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                    z5 = true;
                                    bj4Var.U(true);
                                    g2b g2bVar11111111 = g2b.a;
                                }
                                bj4Var.U(z4);
                                z3 = z5;
                            } else {
                                ci4Var4 = ci4Var4;
                                if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                    bj4Var.K(861667097);
                                    bj4Var.U(false);
                                    defpackage.u.b();
                                    return;
                                }
                                bj4Var.K(943331838);
                                ox6 ox6VarM18 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                bj4Var.K(861717389);
                                objF2 = bj4Var.f();
                                if (objF2 == c0187a) {
                                    z2 = false;
                                    objF2 = new w05(0 == true ? 1 : 0);
                                    bj4Var.C(objF2);
                                } else {
                                    z2 = false;
                                }
                                bj4Var.U(z2);
                                z3 = true;
                                bj4 bj4Var19 = bj4Var;
                                mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM18, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var19, 1597824, 0, 262056);
                                bj4Var = bj4Var19;
                                bj4Var.U(false);
                                g2b g2bVar11111112 = g2b.a;
                            }
                        }
                        bj4Var.U(z3);
                        homeItemBadge4 = homeItemBadge3;
                        ox6Var8 = ox6Var7;
                        str6 = str3;
                        str7 = str4;
                        ox6Var9 = ox6Var5;
                        num7 = num6;
                        mh4Var4 = mh4Var3;
                        ci4Var5 = ci4Var4;
                        num8 = num5;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: x05
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HomeItemKt.HomeItem$lambda$12(ox6Var9, num7, ci4Var5, ox6Var8, num8, str6, str7, homeItemBadge4, mh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                num4 = num2;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                    j1bVar = j1bVar2;
                } else {
                    j1bVar = j1bVar2;
                    if ((i & 196608) == 0) {
                        if (bj4VarO.J(str)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (bj4VarO.J(str2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                i15 = 12582912;
                if (i14 == 0) {
                    i3 |= i15;
                } else if ((i & 12582912) == 0) {
                    if ((i & 16777216) == 0) {
                        zJ = bj4VarO.J(homeItemBadge);
                    } else {
                        zJ = bj4VarO.j(homeItemBadge);
                    }
                    if (zJ) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                i16 = i2 & 256;
                if (i16 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (bj4VarO.j(mh4Var)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i3 |= i17;
                }
                if ((i3 & 38347923) == 38347922) {
                    aVar = ox6.a.t;
                    if (i20 != 0) {
                        ox6Var3 = aVar;
                    }
                    if (i21 != 0) {
                        num3 = null;
                    }
                    if (i4 != 0) {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    if (i6 != 0) {
                        ox6VarJ = ir9.j(aVar, 16.0f);
                    } else {
                        ox6VarJ = ox6Var4;
                    }
                    if (i8 != 0) {
                        num4 = null;
                    }
                    if (i10 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i12 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                    } else {
                        homeItemBadge2 = homeItemBadge;
                    }
                    c0187a = jt1.a.a;
                    if (i16 != 0) {
                        bj4VarO.K(-244016614);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new v05();
                            bj4VarO.C(objF3);
                        }
                        mh4Var2 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    ox6 ox6VarC14 = ir9.c(ox6Var3, 1.0f);
                    bj4VarO.K(-244013531);
                    if ((234881024 & i3) == 67108864) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    } else {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    num5 = num4;
                    ox6Var5 = ox6Var3;
                    ox6 ox6VarJ11 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC14, false, null, (mh4) objF, 15));
                    c30.j jVar10 = c30.a;
                    bVar = di.a.k;
                    ny8VarA = ly8.a(jVar10, bVar, bj4VarO, 48);
                    i18 = i3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarJ11);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf10 = Integer.valueOf(iHashCode);
                    bVar2 = bt1.a.g;
                    rd7.d(bj4VarO, bVar2, numValueOf10);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    mh4Var3 = mh4Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    num6 = num3;
                    qs5 qs5Var10 = new qs5(true, 2.0f);
                    homeItemBadge3 = homeItemBadge2;
                    aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, qs5Var10);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    bj4VarO.K(-1379228937);
                    if (num5 != null) {
                        strF = nr1.f(bj4VarO, num5.intValue());
                    } else {
                        if (str3 == null) {
                            strF = BuildConfig.FLAVOR;
                        } else {
                            str5 = str3;
                        }
                        bj4VarO.U(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        ox6Var6 = ox6VarJ;
                        ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                        bj4Var = bj4VarO;
                        bj4Var.K(-1379221164);
                        if (str4 != null) {
                            mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                            bj4Var.K(941879891);
                            ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA2);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                            bj4Var.K(-1379205196);
                            if (num6 == null) {
                                ox6Var7 = ox6Var6;
                            } else {
                                ox6Var7 = ox6Var6;
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                g2b g2bVar11111113 = g2b.a;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.U(false);
                            g2b g2bVar11111114 = g2b.a;
                            ci4Var4 = ci4Var3;
                            z3 = true;
                        } else {
                            ox6Var7 = ox6Var6;
                            ci4Var4 = ci4Var3;
                            if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                bj4Var.K(942534549);
                                if (num6 == null) {
                                    z5 = true;
                                    z4 = false;
                                } else {
                                    fl6VarD = dv0.d(di.a.a, false);
                                    iHashCode3 = Long.hashCode(bj4Var.T);
                                    kw7VarP3 = bj4Var.P();
                                    ox6VarC3 = it1.c(bj4Var, aVar);
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4Var.q();
                                    if (bj4Var.S) {
                                        bj4Var.k(aVar2);
                                    } else {
                                        bj4Var.z();
                                    }
                                    rd7.d(bj4Var, cVar, fl6VarD);
                                    rd7.d(bj4Var, eVar, kw7VarP3);
                                    l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                    rd7.d(bj4Var, dVar, ox6VarC3);
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    z4 = false;
                                    dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                    z5 = true;
                                    bj4Var.U(true);
                                    g2b g2bVar11111115 = g2b.a;
                                }
                                bj4Var.U(z4);
                                z3 = z5;
                            } else {
                                ci4Var4 = ci4Var4;
                                if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                    bj4Var.K(861667097);
                                    bj4Var.U(false);
                                    defpackage.u.b();
                                    return;
                                }
                                bj4Var.K(943331838);
                                ox6 ox6VarM19 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                bj4Var.K(861717389);
                                objF2 = bj4Var.f();
                                if (objF2 == c0187a) {
                                    z2 = false;
                                    objF2 = new w05(0 == true ? 1 : 0);
                                    bj4Var.C(objF2);
                                } else {
                                    z2 = false;
                                }
                                bj4Var.U(z2);
                                z3 = true;
                                bj4 bj4Var110 = bj4Var;
                                mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM19, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var110, 1597824, 0, 262056);
                                bj4Var = bj4Var110;
                                bj4Var.U(false);
                                g2b g2bVar11111116 = g2b.a;
                            }
                        }
                        bj4Var.U(z3);
                        homeItemBadge4 = homeItemBadge3;
                        ox6Var8 = ox6Var7;
                        str6 = str3;
                        str7 = str4;
                        ox6Var9 = ox6Var5;
                        num7 = num6;
                        mh4Var4 = mh4Var3;
                        ci4Var5 = ci4Var4;
                        num8 = num5;
                    }
                    str5 = strF;
                    bj4VarO.U(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    ox6Var6 = ox6VarJ;
                    ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                    bj4Var = bj4VarO;
                    bj4Var.K(-1379221164);
                    if (str4 != null) {
                        mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                        bj4Var.K(941879891);
                        ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA2);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                        bj4Var.K(-1379205196);
                        if (num6 == null) {
                            ox6Var7 = ox6Var6;
                        } else {
                            ox6Var7 = ox6Var6;
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            g2b g2bVar11111117 = g2b.a;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(false);
                        g2b g2bVar11111118 = g2b.a;
                        ci4Var4 = ci4Var3;
                        z3 = true;
                    } else {
                        ox6Var7 = ox6Var6;
                        ci4Var4 = ci4Var3;
                        if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            bj4Var.K(942534549);
                            if (num6 == null) {
                                z5 = true;
                                z4 = false;
                            } else {
                                fl6VarD = dv0.d(di.a.a, false);
                                iHashCode3 = Long.hashCode(bj4Var.T);
                                kw7VarP3 = bj4Var.P();
                                ox6VarC3 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, fl6VarD);
                                rd7.d(bj4Var, eVar, kw7VarP3);
                                l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC3);
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                z4 = false;
                                dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                z5 = true;
                                bj4Var.U(true);
                                g2b g2bVar11111119 = g2b.a;
                            }
                            bj4Var.U(z4);
                            z3 = z5;
                        } else {
                            ci4Var4 = ci4Var4;
                            if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                bj4Var.K(861667097);
                                bj4Var.U(false);
                                defpackage.u.b();
                                return;
                            }
                            bj4Var.K(943331838);
                            ox6 ox6VarM110 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                            bj4Var.K(861717389);
                            objF2 = bj4Var.f();
                            if (objF2 == c0187a) {
                                z2 = false;
                                objF2 = new w05(0 == true ? 1 : 0);
                                bj4Var.C(objF2);
                            } else {
                                z2 = false;
                            }
                            bj4Var.U(z2);
                            z3 = true;
                            bj4 bj4Var111 = bj4Var;
                            mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM110, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var111, 1597824, 0, 262056);
                            bj4Var = bj4Var111;
                            bj4Var.U(false);
                            g2b g2bVar111111110 = g2b.a;
                        }
                    }
                    bj4Var.U(z3);
                    homeItemBadge4 = homeItemBadge3;
                    ox6Var8 = ox6Var7;
                    str6 = str3;
                    str7 = str4;
                    ox6Var9 = ox6Var5;
                    num7 = num6;
                    mh4Var4 = mh4Var3;
                    ci4Var5 = ci4Var4;
                    num8 = num5;
                } else {
                    aVar = ox6.a.t;
                    if (i20 != 0) {
                        ox6Var3 = aVar;
                    }
                    if (i21 != 0) {
                        num3 = null;
                    }
                    if (i4 != 0) {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    if (i6 != 0) {
                        ox6VarJ = ir9.j(aVar, 16.0f);
                    } else {
                        ox6VarJ = ox6Var4;
                    }
                    if (i8 != 0) {
                        num4 = null;
                    }
                    if (i10 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i12 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                    } else {
                        homeItemBadge2 = homeItemBadge;
                    }
                    c0187a = jt1.a.a;
                    if (i16 != 0) {
                        bj4VarO.K(-244016614);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new v05();
                            bj4VarO.C(objF3);
                        }
                        mh4Var2 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    ox6 ox6VarC15 = ir9.c(ox6Var3, 1.0f);
                    bj4VarO.K(-244013531);
                    if ((234881024 & i3) == 67108864) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    } else {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    num5 = num4;
                    ox6Var5 = ox6Var3;
                    ox6 ox6VarJ12 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC15, false, null, (mh4) objF, 15));
                    c30.j jVar11 = c30.a;
                    bVar = di.a.k;
                    ny8VarA = ly8.a(jVar11, bVar, bj4VarO, 48);
                    i18 = i3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarJ12);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf11 = Integer.valueOf(iHashCode);
                    bVar2 = bt1.a.g;
                    rd7.d(bj4VarO, bVar2, numValueOf11);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    mh4Var3 = mh4Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    num6 = num3;
                    qs5 qs5Var11 = new qs5(true, 2.0f);
                    homeItemBadge3 = homeItemBadge2;
                    aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, qs5Var11);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    bj4VarO.K(-1379228937);
                    if (num5 != null) {
                        strF = nr1.f(bj4VarO, num5.intValue());
                    } else {
                        if (str3 == null) {
                            strF = BuildConfig.FLAVOR;
                        } else {
                            str5 = str3;
                        }
                        bj4VarO.U(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        ox6Var6 = ox6VarJ;
                        ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                        bj4Var = bj4VarO;
                        bj4Var.K(-1379221164);
                        if (str4 != null) {
                            mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                            bj4Var.K(941879891);
                            ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA2);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                            bj4Var.K(-1379205196);
                            if (num6 == null) {
                                ox6Var7 = ox6Var6;
                            } else {
                                ox6Var7 = ox6Var6;
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                g2b g2bVar111111111 = g2b.a;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.U(false);
                            g2b g2bVar111111112 = g2b.a;
                            ci4Var4 = ci4Var3;
                            z3 = true;
                        } else {
                            ox6Var7 = ox6Var6;
                            ci4Var4 = ci4Var3;
                            if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                bj4Var.K(942534549);
                                if (num6 == null) {
                                    z5 = true;
                                    z4 = false;
                                } else {
                                    fl6VarD = dv0.d(di.a.a, false);
                                    iHashCode3 = Long.hashCode(bj4Var.T);
                                    kw7VarP3 = bj4Var.P();
                                    ox6VarC3 = it1.c(bj4Var, aVar);
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4Var.q();
                                    if (bj4Var.S) {
                                        bj4Var.k(aVar2);
                                    } else {
                                        bj4Var.z();
                                    }
                                    rd7.d(bj4Var, cVar, fl6VarD);
                                    rd7.d(bj4Var, eVar, kw7VarP3);
                                    l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                    rd7.d(bj4Var, dVar, ox6VarC3);
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    z4 = false;
                                    dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                    z5 = true;
                                    bj4Var.U(true);
                                    g2b g2bVar111111113 = g2b.a;
                                }
                                bj4Var.U(z4);
                                z3 = z5;
                            } else {
                                ci4Var4 = ci4Var4;
                                if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                    bj4Var.K(861667097);
                                    bj4Var.U(false);
                                    defpackage.u.b();
                                    return;
                                }
                                bj4Var.K(943331838);
                                ox6 ox6VarM111 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                bj4Var.K(861717389);
                                objF2 = bj4Var.f();
                                if (objF2 == c0187a) {
                                    z2 = false;
                                    objF2 = new w05(0 == true ? 1 : 0);
                                    bj4Var.C(objF2);
                                } else {
                                    z2 = false;
                                }
                                bj4Var.U(z2);
                                z3 = true;
                                bj4 bj4Var112 = bj4Var;
                                mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM111, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var112, 1597824, 0, 262056);
                                bj4Var = bj4Var112;
                                bj4Var.U(false);
                                g2b g2bVar111111114 = g2b.a;
                            }
                        }
                        bj4Var.U(z3);
                        homeItemBadge4 = homeItemBadge3;
                        ox6Var8 = ox6Var7;
                        str6 = str3;
                        str7 = str4;
                        ox6Var9 = ox6Var5;
                        num7 = num6;
                        mh4Var4 = mh4Var3;
                        ci4Var5 = ci4Var4;
                        num8 = num5;
                    }
                    str5 = strF;
                    bj4VarO.U(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    ox6Var6 = ox6VarJ;
                    ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                    bj4Var = bj4VarO;
                    bj4Var.K(-1379221164);
                    if (str4 != null) {
                        mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                        bj4Var.K(941879891);
                        ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA2);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                        bj4Var.K(-1379205196);
                        if (num6 == null) {
                            ox6Var7 = ox6Var6;
                        } else {
                            ox6Var7 = ox6Var6;
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            g2b g2bVar111111115 = g2b.a;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(false);
                        g2b g2bVar111111116 = g2b.a;
                        ci4Var4 = ci4Var3;
                        z3 = true;
                    } else {
                        ox6Var7 = ox6Var6;
                        ci4Var4 = ci4Var3;
                        if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            bj4Var.K(942534549);
                            if (num6 == null) {
                                z5 = true;
                                z4 = false;
                            } else {
                                fl6VarD = dv0.d(di.a.a, false);
                                iHashCode3 = Long.hashCode(bj4Var.T);
                                kw7VarP3 = bj4Var.P();
                                ox6VarC3 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, fl6VarD);
                                rd7.d(bj4Var, eVar, kw7VarP3);
                                l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC3);
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                z4 = false;
                                dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                z5 = true;
                                bj4Var.U(true);
                                g2b g2bVar111111117 = g2b.a;
                            }
                            bj4Var.U(z4);
                            z3 = z5;
                        } else {
                            ci4Var4 = ci4Var4;
                            if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                bj4Var.K(861667097);
                                bj4Var.U(false);
                                defpackage.u.b();
                                return;
                            }
                            bj4Var.K(943331838);
                            ox6 ox6VarM112 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                            bj4Var.K(861717389);
                            objF2 = bj4Var.f();
                            if (objF2 == c0187a) {
                                z2 = false;
                                objF2 = new w05(0 == true ? 1 : 0);
                                bj4Var.C(objF2);
                            } else {
                                z2 = false;
                            }
                            bj4Var.U(z2);
                            z3 = true;
                            bj4 bj4Var113 = bj4Var;
                            mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM112, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var113, 1597824, 0, 262056);
                            bj4Var = bj4Var113;
                            bj4Var.U(false);
                            g2b g2bVar111111118 = g2b.a;
                        }
                    }
                    bj4Var.U(z3);
                    homeItemBadge4 = homeItemBadge3;
                    ox6Var8 = ox6Var7;
                    str6 = str3;
                    str7 = str4;
                    ox6Var9 = ox6Var5;
                    num7 = num6;
                    mh4Var4 = mh4Var3;
                    ci4Var5 = ci4Var4;
                    num8 = num5;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: x05
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HomeItemKt.HomeItem$lambda$12(ox6Var9, num7, ci4Var5, ox6Var8, num8, str6, str7, homeItemBadge4, mh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            ox6Var4 = ox6Var2;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    num4 = num2;
                    if (bj4VarO.J(num4)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                    j1bVar = j1bVar2;
                } else {
                    j1bVar = j1bVar2;
                    if ((i & 196608) == 0) {
                        if (bj4VarO.J(str)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (bj4VarO.J(str2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                i15 = 12582912;
                if (i14 == 0) {
                    i3 |= i15;
                } else if ((i & 12582912) == 0) {
                    if ((i & 16777216) == 0) {
                        zJ = bj4VarO.J(homeItemBadge);
                    } else {
                        zJ = bj4VarO.j(homeItemBadge);
                    }
                    if (zJ) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                i16 = i2 & 256;
                if (i16 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (bj4VarO.j(mh4Var)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i3 |= i17;
                }
                if ((i3 & 38347923) == 38347922) {
                    aVar = ox6.a.t;
                    if (i20 != 0) {
                        ox6Var3 = aVar;
                    }
                    if (i21 != 0) {
                        num3 = null;
                    }
                    if (i4 != 0) {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    if (i6 != 0) {
                        ox6VarJ = ir9.j(aVar, 16.0f);
                    } else {
                        ox6VarJ = ox6Var4;
                    }
                    if (i8 != 0) {
                        num4 = null;
                    }
                    if (i10 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i12 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                    } else {
                        homeItemBadge2 = homeItemBadge;
                    }
                    c0187a = jt1.a.a;
                    if (i16 != 0) {
                        bj4VarO.K(-244016614);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new v05();
                            bj4VarO.C(objF3);
                        }
                        mh4Var2 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    ox6 ox6VarC16 = ir9.c(ox6Var3, 1.0f);
                    bj4VarO.K(-244013531);
                    if ((234881024 & i3) == 67108864) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    } else {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    num5 = num4;
                    ox6Var5 = ox6Var3;
                    ox6 ox6VarJ13 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC16, false, null, (mh4) objF, 15));
                    c30.j jVar12 = c30.a;
                    bVar = di.a.k;
                    ny8VarA = ly8.a(jVar12, bVar, bj4VarO, 48);
                    i18 = i3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarJ13);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf12 = Integer.valueOf(iHashCode);
                    bVar2 = bt1.a.g;
                    rd7.d(bj4VarO, bVar2, numValueOf12);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    mh4Var3 = mh4Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    num6 = num3;
                    qs5 qs5Var12 = new qs5(true, 2.0f);
                    homeItemBadge3 = homeItemBadge2;
                    aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, qs5Var12);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    bj4VarO.K(-1379228937);
                    if (num5 != null) {
                        strF = nr1.f(bj4VarO, num5.intValue());
                    } else {
                        if (str3 == null) {
                            strF = BuildConfig.FLAVOR;
                        } else {
                            str5 = str3;
                        }
                        bj4VarO.U(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        ox6Var6 = ox6VarJ;
                        ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                        bj4Var = bj4VarO;
                        bj4Var.K(-1379221164);
                        if (str4 != null) {
                            mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                            bj4Var.K(941879891);
                            ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA2);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                            bj4Var.K(-1379205196);
                            if (num6 == null) {
                                ox6Var7 = ox6Var6;
                            } else {
                                ox6Var7 = ox6Var6;
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                g2b g2bVar111111119 = g2b.a;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.U(false);
                            g2b g2bVar1111111110 = g2b.a;
                            ci4Var4 = ci4Var3;
                            z3 = true;
                        } else {
                            ox6Var7 = ox6Var6;
                            ci4Var4 = ci4Var3;
                            if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                bj4Var.K(942534549);
                                if (num6 == null) {
                                    z5 = true;
                                    z4 = false;
                                } else {
                                    fl6VarD = dv0.d(di.a.a, false);
                                    iHashCode3 = Long.hashCode(bj4Var.T);
                                    kw7VarP3 = bj4Var.P();
                                    ox6VarC3 = it1.c(bj4Var, aVar);
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4Var.q();
                                    if (bj4Var.S) {
                                        bj4Var.k(aVar2);
                                    } else {
                                        bj4Var.z();
                                    }
                                    rd7.d(bj4Var, cVar, fl6VarD);
                                    rd7.d(bj4Var, eVar, kw7VarP3);
                                    l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                    rd7.d(bj4Var, dVar, ox6VarC3);
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    z4 = false;
                                    dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                    z5 = true;
                                    bj4Var.U(true);
                                    g2b g2bVar1111111111 = g2b.a;
                                }
                                bj4Var.U(z4);
                                z3 = z5;
                            } else {
                                ci4Var4 = ci4Var4;
                                if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                    bj4Var.K(861667097);
                                    bj4Var.U(false);
                                    defpackage.u.b();
                                    return;
                                }
                                bj4Var.K(943331838);
                                ox6 ox6VarM113 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                bj4Var.K(861717389);
                                objF2 = bj4Var.f();
                                if (objF2 == c0187a) {
                                    z2 = false;
                                    objF2 = new w05(0 == true ? 1 : 0);
                                    bj4Var.C(objF2);
                                } else {
                                    z2 = false;
                                }
                                bj4Var.U(z2);
                                z3 = true;
                                bj4 bj4Var114 = bj4Var;
                                mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM113, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var114, 1597824, 0, 262056);
                                bj4Var = bj4Var114;
                                bj4Var.U(false);
                                g2b g2bVar1111111112 = g2b.a;
                            }
                        }
                        bj4Var.U(z3);
                        homeItemBadge4 = homeItemBadge3;
                        ox6Var8 = ox6Var7;
                        str6 = str3;
                        str7 = str4;
                        ox6Var9 = ox6Var5;
                        num7 = num6;
                        mh4Var4 = mh4Var3;
                        ci4Var5 = ci4Var4;
                        num8 = num5;
                    }
                    str5 = strF;
                    bj4VarO.U(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    ox6Var6 = ox6VarJ;
                    ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                    bj4Var = bj4VarO;
                    bj4Var.K(-1379221164);
                    if (str4 != null) {
                        mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                        bj4Var.K(941879891);
                        ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA2);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                        bj4Var.K(-1379205196);
                        if (num6 == null) {
                            ox6Var7 = ox6Var6;
                        } else {
                            ox6Var7 = ox6Var6;
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            g2b g2bVar1111111113 = g2b.a;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(false);
                        g2b g2bVar1111111114 = g2b.a;
                        ci4Var4 = ci4Var3;
                        z3 = true;
                    } else {
                        ox6Var7 = ox6Var6;
                        ci4Var4 = ci4Var3;
                        if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            bj4Var.K(942534549);
                            if (num6 == null) {
                                z5 = true;
                                z4 = false;
                            } else {
                                fl6VarD = dv0.d(di.a.a, false);
                                iHashCode3 = Long.hashCode(bj4Var.T);
                                kw7VarP3 = bj4Var.P();
                                ox6VarC3 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, fl6VarD);
                                rd7.d(bj4Var, eVar, kw7VarP3);
                                l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC3);
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                z4 = false;
                                dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                z5 = true;
                                bj4Var.U(true);
                                g2b g2bVar1111111115 = g2b.a;
                            }
                            bj4Var.U(z4);
                            z3 = z5;
                        } else {
                            ci4Var4 = ci4Var4;
                            if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                bj4Var.K(861667097);
                                bj4Var.U(false);
                                defpackage.u.b();
                                return;
                            }
                            bj4Var.K(943331838);
                            ox6 ox6VarM114 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                            bj4Var.K(861717389);
                            objF2 = bj4Var.f();
                            if (objF2 == c0187a) {
                                z2 = false;
                                objF2 = new w05(0 == true ? 1 : 0);
                                bj4Var.C(objF2);
                            } else {
                                z2 = false;
                            }
                            bj4Var.U(z2);
                            z3 = true;
                            bj4 bj4Var115 = bj4Var;
                            mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM114, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var115, 1597824, 0, 262056);
                            bj4Var = bj4Var115;
                            bj4Var.U(false);
                            g2b g2bVar1111111116 = g2b.a;
                        }
                    }
                    bj4Var.U(z3);
                    homeItemBadge4 = homeItemBadge3;
                    ox6Var8 = ox6Var7;
                    str6 = str3;
                    str7 = str4;
                    ox6Var9 = ox6Var5;
                    num7 = num6;
                    mh4Var4 = mh4Var3;
                    ci4Var5 = ci4Var4;
                    num8 = num5;
                } else {
                    aVar = ox6.a.t;
                    if (i20 != 0) {
                        ox6Var3 = aVar;
                    }
                    if (i21 != 0) {
                        num3 = null;
                    }
                    if (i4 != 0) {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    if (i6 != 0) {
                        ox6VarJ = ir9.j(aVar, 16.0f);
                    } else {
                        ox6VarJ = ox6Var4;
                    }
                    if (i8 != 0) {
                        num4 = null;
                    }
                    if (i10 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i12 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                    } else {
                        homeItemBadge2 = homeItemBadge;
                    }
                    c0187a = jt1.a.a;
                    if (i16 != 0) {
                        bj4VarO.K(-244016614);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new v05();
                            bj4VarO.C(objF3);
                        }
                        mh4Var2 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    ox6 ox6VarC17 = ir9.c(ox6Var3, 1.0f);
                    bj4VarO.K(-244013531);
                    if ((234881024 & i3) == 67108864) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    } else {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    num5 = num4;
                    ox6Var5 = ox6Var3;
                    ox6 ox6VarJ14 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC17, false, null, (mh4) objF, 15));
                    c30.j jVar13 = c30.a;
                    bVar = di.a.k;
                    ny8VarA = ly8.a(jVar13, bVar, bj4VarO, 48);
                    i18 = i3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarJ14);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf13 = Integer.valueOf(iHashCode);
                    bVar2 = bt1.a.g;
                    rd7.d(bj4VarO, bVar2, numValueOf13);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    mh4Var3 = mh4Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    num6 = num3;
                    qs5 qs5Var13 = new qs5(true, 2.0f);
                    homeItemBadge3 = homeItemBadge2;
                    aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, qs5Var13);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    bj4VarO.K(-1379228937);
                    if (num5 != null) {
                        strF = nr1.f(bj4VarO, num5.intValue());
                    } else {
                        if (str3 == null) {
                            strF = BuildConfig.FLAVOR;
                        } else {
                            str5 = str3;
                        }
                        bj4VarO.U(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        ox6Var6 = ox6VarJ;
                        ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                        bj4Var = bj4VarO;
                        bj4Var.K(-1379221164);
                        if (str4 != null) {
                            mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                            bj4Var.K(941879891);
                            ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA2);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                            bj4Var.K(-1379205196);
                            if (num6 == null) {
                                ox6Var7 = ox6Var6;
                            } else {
                                ox6Var7 = ox6Var6;
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                g2b g2bVar1111111117 = g2b.a;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.U(false);
                            g2b g2bVar1111111118 = g2b.a;
                            ci4Var4 = ci4Var3;
                            z3 = true;
                        } else {
                            ox6Var7 = ox6Var6;
                            ci4Var4 = ci4Var3;
                            if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                bj4Var.K(942534549);
                                if (num6 == null) {
                                    z5 = true;
                                    z4 = false;
                                } else {
                                    fl6VarD = dv0.d(di.a.a, false);
                                    iHashCode3 = Long.hashCode(bj4Var.T);
                                    kw7VarP3 = bj4Var.P();
                                    ox6VarC3 = it1.c(bj4Var, aVar);
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4Var.q();
                                    if (bj4Var.S) {
                                        bj4Var.k(aVar2);
                                    } else {
                                        bj4Var.z();
                                    }
                                    rd7.d(bj4Var, cVar, fl6VarD);
                                    rd7.d(bj4Var, eVar, kw7VarP3);
                                    l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                    rd7.d(bj4Var, dVar, ox6VarC3);
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    z4 = false;
                                    dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                    z5 = true;
                                    bj4Var.U(true);
                                    g2b g2bVar1111111119 = g2b.a;
                                }
                                bj4Var.U(z4);
                                z3 = z5;
                            } else {
                                ci4Var4 = ci4Var4;
                                if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                    bj4Var.K(861667097);
                                    bj4Var.U(false);
                                    defpackage.u.b();
                                    return;
                                }
                                bj4Var.K(943331838);
                                ox6 ox6VarM115 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                bj4Var.K(861717389);
                                objF2 = bj4Var.f();
                                if (objF2 == c0187a) {
                                    z2 = false;
                                    objF2 = new w05(0 == true ? 1 : 0);
                                    bj4Var.C(objF2);
                                } else {
                                    z2 = false;
                                }
                                bj4Var.U(z2);
                                z3 = true;
                                bj4 bj4Var116 = bj4Var;
                                mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM115, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var116, 1597824, 0, 262056);
                                bj4Var = bj4Var116;
                                bj4Var.U(false);
                                g2b g2bVar11111111110 = g2b.a;
                            }
                        }
                        bj4Var.U(z3);
                        homeItemBadge4 = homeItemBadge3;
                        ox6Var8 = ox6Var7;
                        str6 = str3;
                        str7 = str4;
                        ox6Var9 = ox6Var5;
                        num7 = num6;
                        mh4Var4 = mh4Var3;
                        ci4Var5 = ci4Var4;
                        num8 = num5;
                    }
                    str5 = strF;
                    bj4VarO.U(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    ox6Var6 = ox6VarJ;
                    ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                    bj4Var = bj4VarO;
                    bj4Var.K(-1379221164);
                    if (str4 != null) {
                        mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                        bj4Var.K(941879891);
                        ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA2);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                        bj4Var.K(-1379205196);
                        if (num6 == null) {
                            ox6Var7 = ox6Var6;
                        } else {
                            ox6Var7 = ox6Var6;
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            g2b g2bVar11111111111 = g2b.a;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(false);
                        g2b g2bVar11111111112 = g2b.a;
                        ci4Var4 = ci4Var3;
                        z3 = true;
                    } else {
                        ox6Var7 = ox6Var6;
                        ci4Var4 = ci4Var3;
                        if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            bj4Var.K(942534549);
                            if (num6 == null) {
                                z5 = true;
                                z4 = false;
                            } else {
                                fl6VarD = dv0.d(di.a.a, false);
                                iHashCode3 = Long.hashCode(bj4Var.T);
                                kw7VarP3 = bj4Var.P();
                                ox6VarC3 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, fl6VarD);
                                rd7.d(bj4Var, eVar, kw7VarP3);
                                l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC3);
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                z4 = false;
                                dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                z5 = true;
                                bj4Var.U(true);
                                g2b g2bVar11111111113 = g2b.a;
                            }
                            bj4Var.U(z4);
                            z3 = z5;
                        } else {
                            ci4Var4 = ci4Var4;
                            if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                bj4Var.K(861667097);
                                bj4Var.U(false);
                                defpackage.u.b();
                                return;
                            }
                            bj4Var.K(943331838);
                            ox6 ox6VarM116 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                            bj4Var.K(861717389);
                            objF2 = bj4Var.f();
                            if (objF2 == c0187a) {
                                z2 = false;
                                objF2 = new w05(0 == true ? 1 : 0);
                                bj4Var.C(objF2);
                            } else {
                                z2 = false;
                            }
                            bj4Var.U(z2);
                            z3 = true;
                            bj4 bj4Var117 = bj4Var;
                            mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM116, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var117, 1597824, 0, 262056);
                            bj4Var = bj4Var117;
                            bj4Var.U(false);
                            g2b g2bVar11111111114 = g2b.a;
                        }
                    }
                    bj4Var.U(z3);
                    homeItemBadge4 = homeItemBadge3;
                    ox6Var8 = ox6Var7;
                    str6 = str3;
                    str7 = str4;
                    ox6Var9 = ox6Var5;
                    num7 = num6;
                    mh4Var4 = mh4Var3;
                    ci4Var5 = ci4Var4;
                    num8 = num5;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: x05
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HomeItemKt.HomeItem$lambda$12(ox6Var9, num7, ci4Var5, ox6Var8, num8, str6, str7, homeItemBadge4, mh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            num4 = num2;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
                j1bVar = j1bVar2;
            } else {
                j1bVar = j1bVar2;
                if ((i & 196608) == 0) {
                    if (bj4VarO.J(str)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 64;
            if (i12 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (bj4VarO.J(str2)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i3 |= i13;
            }
            i14 = i2 & 128;
            i15 = 12582912;
            if (i14 == 0) {
                i3 |= i15;
            } else if ((i & 12582912) == 0) {
                if ((i & 16777216) == 0) {
                    zJ = bj4VarO.J(homeItemBadge);
                } else {
                    zJ = bj4VarO.j(homeItemBadge);
                }
                if (zJ) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i3 |= i15;
            }
            i16 = i2 & 256;
            if (i16 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (bj4VarO.j(mh4Var)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i3 |= i17;
            }
            if ((i3 & 38347923) == 38347922) {
                aVar = ox6.a.t;
                if (i20 != 0) {
                    ox6Var3 = aVar;
                }
                if (i21 != 0) {
                    num3 = null;
                }
                if (i4 != 0) {
                    ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                if (i6 != 0) {
                    ox6VarJ = ir9.j(aVar, 16.0f);
                } else {
                    ox6VarJ = ox6Var4;
                }
                if (i8 != 0) {
                    num4 = null;
                }
                if (i10 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i12 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i14 != 0) {
                    homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                } else {
                    homeItemBadge2 = homeItemBadge;
                }
                c0187a = jt1.a.a;
                if (i16 != 0) {
                    bj4VarO.K(-244016614);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new v05();
                        bj4VarO.C(objF3);
                    }
                    mh4Var2 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var2 = mh4Var;
                }
                ox6 ox6VarC18 = ir9.c(ox6Var3, 1.0f);
                bj4VarO.K(-244013531);
                if ((234881024 & i3) == 67108864) {
                    z = true;
                } else {
                    z = false;
                }
                objF = bj4VarO.f();
                if (z) {
                    objF = new gb3(2, mh4Var2);
                    bj4VarO.C(objF);
                } else {
                    objF = new gb3(2, mh4Var2);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                num5 = num4;
                ox6Var5 = ox6Var3;
                ox6 ox6VarJ15 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC18, false, null, (mh4) objF, 15));
                c30.j jVar14 = c30.a;
                bVar = di.a.k;
                ny8VarA = ly8.a(jVar14, bVar, bj4VarO, 48);
                i18 = i3;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarJ15);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, ny8VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf14 = Integer.valueOf(iHashCode);
                bVar2 = bt1.a.g;
                rd7.d(bj4VarO, bVar2, numValueOf14);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                mh4Var3 = mh4Var2;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                num6 = num3;
                qs5 qs5Var14 = new qs5(true, 2.0f);
                homeItemBadge3 = homeItemBadge2;
                aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, qs5Var14);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                bj4VarO.K(-1379228937);
                if (num5 != null) {
                    strF = nr1.f(bj4VarO, num5.intValue());
                } else {
                    if (str3 == null) {
                        strF = BuildConfig.FLAVOR;
                    } else {
                        str5 = str3;
                    }
                    bj4VarO.U(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    ox6Var6 = ox6VarJ;
                    ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                    bj4Var = bj4VarO;
                    bj4Var.K(-1379221164);
                    if (str4 != null) {
                        mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                        bj4Var.K(941879891);
                        ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA2);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                        bj4Var.K(-1379205196);
                        if (num6 == null) {
                            ox6Var7 = ox6Var6;
                        } else {
                            ox6Var7 = ox6Var6;
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            g2b g2bVar11111111115 = g2b.a;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(false);
                        g2b g2bVar11111111116 = g2b.a;
                        ci4Var4 = ci4Var3;
                        z3 = true;
                    } else {
                        ox6Var7 = ox6Var6;
                        ci4Var4 = ci4Var3;
                        if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            bj4Var.K(942534549);
                            if (num6 == null) {
                                z5 = true;
                                z4 = false;
                            } else {
                                fl6VarD = dv0.d(di.a.a, false);
                                iHashCode3 = Long.hashCode(bj4Var.T);
                                kw7VarP3 = bj4Var.P();
                                ox6VarC3 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, fl6VarD);
                                rd7.d(bj4Var, eVar, kw7VarP3);
                                l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC3);
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                z4 = false;
                                dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                z5 = true;
                                bj4Var.U(true);
                                g2b g2bVar11111111117 = g2b.a;
                            }
                            bj4Var.U(z4);
                            z3 = z5;
                        } else {
                            ci4Var4 = ci4Var4;
                            if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                bj4Var.K(861667097);
                                bj4Var.U(false);
                                defpackage.u.b();
                                return;
                            }
                            bj4Var.K(943331838);
                            ox6 ox6VarM117 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                            bj4Var.K(861717389);
                            objF2 = bj4Var.f();
                            if (objF2 == c0187a) {
                                z2 = false;
                                objF2 = new w05(0 == true ? 1 : 0);
                                bj4Var.C(objF2);
                            } else {
                                z2 = false;
                            }
                            bj4Var.U(z2);
                            z3 = true;
                            bj4 bj4Var118 = bj4Var;
                            mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM117, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var118, 1597824, 0, 262056);
                            bj4Var = bj4Var118;
                            bj4Var.U(false);
                            g2b g2bVar11111111118 = g2b.a;
                        }
                    }
                    bj4Var.U(z3);
                    homeItemBadge4 = homeItemBadge3;
                    ox6Var8 = ox6Var7;
                    str6 = str3;
                    str7 = str4;
                    ox6Var9 = ox6Var5;
                    num7 = num6;
                    mh4Var4 = mh4Var3;
                    ci4Var5 = ci4Var4;
                    num8 = num5;
                }
                str5 = strF;
                bj4VarO.U(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i19 = IntercomTheme.$stable;
                ox6Var6 = ox6VarJ;
                ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                bj4Var = bj4VarO;
                bj4Var.K(-1379221164);
                if (str4 != null) {
                    mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                    bj4Var.K(941879891);
                    ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                    iHashCode4 = Long.hashCode(bj4Var.T);
                    kw7VarP4 = bj4Var.P();
                    ox6VarC4 = it1.c(bj4Var, aVar);
                    if (j1bVar != null) {
                        ml5.c();
                        throw null;
                    }
                    bj4Var.q();
                    if (bj4Var.S) {
                        bj4Var.k(aVar2);
                    } else {
                        bj4Var.z();
                    }
                    rd7.d(bj4Var, cVar, ny8VarA2);
                    rd7.d(bj4Var, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                    rd7.d(bj4Var, dVar, ox6VarC4);
                    ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                    bj4Var.K(-1379205196);
                    if (num6 == null) {
                        ox6Var7 = ox6Var6;
                    } else {
                        ox6Var7 = ox6Var6;
                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                        g2b g2bVar11111111119 = g2b.a;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(false);
                    g2b g2bVar111111111110 = g2b.a;
                    ci4Var4 = ci4Var3;
                    z3 = true;
                } else {
                    ox6Var7 = ox6Var6;
                    ci4Var4 = ci4Var3;
                    if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                        bj4Var.K(942534549);
                        if (num6 == null) {
                            z5 = true;
                            z4 = false;
                        } else {
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode3 = Long.hashCode(bj4Var.T);
                            kw7VarP3 = bj4Var.P();
                            ox6VarC3 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, fl6VarD);
                            rd7.d(bj4Var, eVar, kw7VarP3);
                            l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC3);
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            z4 = false;
                            dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                            z5 = true;
                            bj4Var.U(true);
                            g2b g2bVar111111111111 = g2b.a;
                        }
                        bj4Var.U(z4);
                        z3 = z5;
                    } else {
                        ci4Var4 = ci4Var4;
                        if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                            bj4Var.K(861667097);
                            bj4Var.U(false);
                            defpackage.u.b();
                            return;
                        }
                        bj4Var.K(943331838);
                        ox6 ox6VarM118 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                        bj4Var.K(861717389);
                        objF2 = bj4Var.f();
                        if (objF2 == c0187a) {
                            z2 = false;
                            objF2 = new w05(0 == true ? 1 : 0);
                            bj4Var.C(objF2);
                        } else {
                            z2 = false;
                        }
                        bj4Var.U(z2);
                        z3 = true;
                        bj4 bj4Var119 = bj4Var;
                        mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM118, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var119, 1597824, 0, 262056);
                        bj4Var = bj4Var119;
                        bj4Var.U(false);
                        g2b g2bVar111111111112 = g2b.a;
                    }
                }
                bj4Var.U(z3);
                homeItemBadge4 = homeItemBadge3;
                ox6Var8 = ox6Var7;
                str6 = str3;
                str7 = str4;
                ox6Var9 = ox6Var5;
                num7 = num6;
                mh4Var4 = mh4Var3;
                ci4Var5 = ci4Var4;
                num8 = num5;
            } else {
                aVar = ox6.a.t;
                if (i20 != 0) {
                    ox6Var3 = aVar;
                }
                if (i21 != 0) {
                    num3 = null;
                }
                if (i4 != 0) {
                    ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                if (i6 != 0) {
                    ox6VarJ = ir9.j(aVar, 16.0f);
                } else {
                    ox6VarJ = ox6Var4;
                }
                if (i8 != 0) {
                    num4 = null;
                }
                if (i10 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i12 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i14 != 0) {
                    homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                } else {
                    homeItemBadge2 = homeItemBadge;
                }
                c0187a = jt1.a.a;
                if (i16 != 0) {
                    bj4VarO.K(-244016614);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new v05();
                        bj4VarO.C(objF3);
                    }
                    mh4Var2 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var2 = mh4Var;
                }
                ox6 ox6VarC19 = ir9.c(ox6Var3, 1.0f);
                bj4VarO.K(-244013531);
                if ((234881024 & i3) == 67108864) {
                    z = true;
                } else {
                    z = false;
                }
                objF = bj4VarO.f();
                if (z) {
                    objF = new gb3(2, mh4Var2);
                    bj4VarO.C(objF);
                } else {
                    objF = new gb3(2, mh4Var2);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                num5 = num4;
                ox6Var5 = ox6Var3;
                ox6 ox6VarJ16 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC19, false, null, (mh4) objF, 15));
                c30.j jVar15 = c30.a;
                bVar = di.a.k;
                ny8VarA = ly8.a(jVar15, bVar, bj4VarO, 48);
                i18 = i3;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarJ16);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, ny8VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf15 = Integer.valueOf(iHashCode);
                bVar2 = bt1.a.g;
                rd7.d(bj4VarO, bVar2, numValueOf15);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                mh4Var3 = mh4Var2;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                num6 = num3;
                qs5 qs5Var15 = new qs5(true, 2.0f);
                homeItemBadge3 = homeItemBadge2;
                aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, qs5Var15);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                bj4VarO.K(-1379228937);
                if (num5 != null) {
                    strF = nr1.f(bj4VarO, num5.intValue());
                } else {
                    if (str3 == null) {
                        strF = BuildConfig.FLAVOR;
                    } else {
                        str5 = str3;
                    }
                    bj4VarO.U(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    ox6Var6 = ox6VarJ;
                    ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                    bj4Var = bj4VarO;
                    bj4Var.K(-1379221164);
                    if (str4 != null) {
                        mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                        bj4Var.K(941879891);
                        ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA2);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                        bj4Var.K(-1379205196);
                        if (num6 == null) {
                            ox6Var7 = ox6Var6;
                        } else {
                            ox6Var7 = ox6Var6;
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            g2b g2bVar111111111113 = g2b.a;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(false);
                        g2b g2bVar111111111114 = g2b.a;
                        ci4Var4 = ci4Var3;
                        z3 = true;
                    } else {
                        ox6Var7 = ox6Var6;
                        ci4Var4 = ci4Var3;
                        if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            bj4Var.K(942534549);
                            if (num6 == null) {
                                z5 = true;
                                z4 = false;
                            } else {
                                fl6VarD = dv0.d(di.a.a, false);
                                iHashCode3 = Long.hashCode(bj4Var.T);
                                kw7VarP3 = bj4Var.P();
                                ox6VarC3 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, fl6VarD);
                                rd7.d(bj4Var, eVar, kw7VarP3);
                                l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC3);
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                z4 = false;
                                dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                z5 = true;
                                bj4Var.U(true);
                                g2b g2bVar111111111115 = g2b.a;
                            }
                            bj4Var.U(z4);
                            z3 = z5;
                        } else {
                            ci4Var4 = ci4Var4;
                            if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                bj4Var.K(861667097);
                                bj4Var.U(false);
                                defpackage.u.b();
                                return;
                            }
                            bj4Var.K(943331838);
                            ox6 ox6VarM119 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                            bj4Var.K(861717389);
                            objF2 = bj4Var.f();
                            if (objF2 == c0187a) {
                                z2 = false;
                                objF2 = new w05(0 == true ? 1 : 0);
                                bj4Var.C(objF2);
                            } else {
                                z2 = false;
                            }
                            bj4Var.U(z2);
                            z3 = true;
                            bj4 bj4Var1110 = bj4Var;
                            mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM119, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var1110, 1597824, 0, 262056);
                            bj4Var = bj4Var1110;
                            bj4Var.U(false);
                            g2b g2bVar111111111116 = g2b.a;
                        }
                    }
                    bj4Var.U(z3);
                    homeItemBadge4 = homeItemBadge3;
                    ox6Var8 = ox6Var7;
                    str6 = str3;
                    str7 = str4;
                    ox6Var9 = ox6Var5;
                    num7 = num6;
                    mh4Var4 = mh4Var3;
                    ci4Var5 = ci4Var4;
                    num8 = num5;
                }
                str5 = strF;
                bj4VarO.U(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i19 = IntercomTheme.$stable;
                ox6Var6 = ox6VarJ;
                ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                bj4Var = bj4VarO;
                bj4Var.K(-1379221164);
                if (str4 != null) {
                    mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                    bj4Var.K(941879891);
                    ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                    iHashCode4 = Long.hashCode(bj4Var.T);
                    kw7VarP4 = bj4Var.P();
                    ox6VarC4 = it1.c(bj4Var, aVar);
                    if (j1bVar != null) {
                        ml5.c();
                        throw null;
                    }
                    bj4Var.q();
                    if (bj4Var.S) {
                        bj4Var.k(aVar2);
                    } else {
                        bj4Var.z();
                    }
                    rd7.d(bj4Var, cVar, ny8VarA2);
                    rd7.d(bj4Var, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                    rd7.d(bj4Var, dVar, ox6VarC4);
                    ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                    bj4Var.K(-1379205196);
                    if (num6 == null) {
                        ox6Var7 = ox6Var6;
                    } else {
                        ox6Var7 = ox6Var6;
                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                        g2b g2bVar111111111117 = g2b.a;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(false);
                    g2b g2bVar111111111118 = g2b.a;
                    ci4Var4 = ci4Var3;
                    z3 = true;
                } else {
                    ox6Var7 = ox6Var6;
                    ci4Var4 = ci4Var3;
                    if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                        bj4Var.K(942534549);
                        if (num6 == null) {
                            z5 = true;
                            z4 = false;
                        } else {
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode3 = Long.hashCode(bj4Var.T);
                            kw7VarP3 = bj4Var.P();
                            ox6VarC3 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, fl6VarD);
                            rd7.d(bj4Var, eVar, kw7VarP3);
                            l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC3);
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            z4 = false;
                            dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                            z5 = true;
                            bj4Var.U(true);
                            g2b g2bVar111111111119 = g2b.a;
                        }
                        bj4Var.U(z4);
                        z3 = z5;
                    } else {
                        ci4Var4 = ci4Var4;
                        if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                            bj4Var.K(861667097);
                            bj4Var.U(false);
                            defpackage.u.b();
                            return;
                        }
                        bj4Var.K(943331838);
                        ox6 ox6VarM1110 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                        bj4Var.K(861717389);
                        objF2 = bj4Var.f();
                        if (objF2 == c0187a) {
                            z2 = false;
                            objF2 = new w05(0 == true ? 1 : 0);
                            bj4Var.C(objF2);
                        } else {
                            z2 = false;
                        }
                        bj4Var.U(z2);
                        z3 = true;
                        bj4 bj4Var1111 = bj4Var;
                        mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM1110, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var1111, 1597824, 0, 262056);
                        bj4Var = bj4Var1111;
                        bj4Var.U(false);
                        g2b g2bVar1111111111110 = g2b.a;
                    }
                }
                bj4Var.U(z3);
                homeItemBadge4 = homeItemBadge3;
                ox6Var8 = ox6Var7;
                str6 = str3;
                str7 = str4;
                ox6Var9 = ox6Var5;
                num7 = num6;
                mh4Var4 = mh4Var3;
                ci4Var5 = ci4Var4;
                num8 = num5;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: x05
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HomeItemKt.HomeItem$lambda$12(ox6Var9, num7, ci4Var5, ox6Var8, num8, str6, str7, homeItemBadge4, mh4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        num3 = num;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                ci4Var2 = ci4Var;
                if (bj4VarO.j(ci4Var2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    ox6Var4 = ox6Var2;
                    if (bj4VarO.J(ox6Var4)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        num4 = num2;
                        if (bj4VarO.J(num4)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                        j1bVar = j1bVar2;
                    } else {
                        j1bVar = j1bVar2;
                        if ((i & 196608) == 0) {
                            if (bj4VarO.J(str)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                    }
                    i12 = i2 & 64;
                    if (i12 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (bj4VarO.J(str2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 128;
                    i15 = 12582912;
                    if (i14 == 0) {
                        i3 |= i15;
                    } else if ((i & 12582912) == 0) {
                        if ((i & 16777216) == 0) {
                            zJ = bj4VarO.J(homeItemBadge);
                        } else {
                            zJ = bj4VarO.j(homeItemBadge);
                        }
                        if (zJ) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i3 |= i15;
                    }
                    i16 = i2 & 256;
                    if (i16 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (bj4VarO.j(mh4Var)) {
                            i17 = 67108864;
                        } else {
                            i17 = 33554432;
                        }
                        i3 |= i17;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        aVar = ox6.a.t;
                        if (i20 != 0) {
                            ox6Var3 = aVar;
                        }
                        if (i21 != 0) {
                            num3 = null;
                        }
                        if (i4 != 0) {
                            ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                        }
                        if (i6 != 0) {
                            ox6VarJ = ir9.j(aVar, 16.0f);
                        } else {
                            ox6VarJ = ox6Var4;
                        }
                        if (i8 != 0) {
                            num4 = null;
                        }
                        if (i10 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i12 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i14 != 0) {
                            homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                        } else {
                            homeItemBadge2 = homeItemBadge;
                        }
                        c0187a = jt1.a.a;
                        if (i16 != 0) {
                            bj4VarO.K(-244016614);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new v05();
                                bj4VarO.C(objF3);
                            }
                            mh4Var2 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        ox6 ox6VarC110 = ir9.c(ox6Var3, 1.0f);
                        bj4VarO.K(-244013531);
                        if ((234881024 & i3) == 67108864) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            objF = new gb3(2, mh4Var2);
                            bj4VarO.C(objF);
                        } else {
                            objF = new gb3(2, mh4Var2);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        num5 = num4;
                        ox6Var5 = ox6Var3;
                        ox6 ox6VarJ17 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC110, false, null, (mh4) objF, 15));
                        c30.j jVar16 = c30.a;
                        bVar = di.a.k;
                        ny8VarA = ly8.a(jVar16, bVar, bj4VarO, 48);
                        i18 = i3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarJ17);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        cVar = bt1.a.f;
                        rd7.d(bj4VarO, cVar, ny8VarA);
                        eVar = bt1.a.e;
                        rd7.d(bj4VarO, eVar, kw7VarP);
                        Integer numValueOf16 = Integer.valueOf(iHashCode);
                        bVar2 = bt1.a.g;
                        rd7.d(bj4VarO, bVar2, numValueOf16);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        mh4Var3 = mh4Var2;
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        num6 = num3;
                        qs5 qs5Var16 = new qs5(true, 2.0f);
                        homeItemBadge3 = homeItemBadge2;
                        aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, qs5Var16);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        bj4VarO.K(-1379228937);
                        if (num5 != null) {
                            strF = nr1.f(bj4VarO, num5.intValue());
                        } else {
                            if (str3 == null) {
                                strF = BuildConfig.FLAVOR;
                            } else {
                                str5 = str3;
                            }
                            bj4VarO.U(false);
                            intercomTheme = IntercomTheme.INSTANCE;
                            i19 = IntercomTheme.$stable;
                            ox6Var6 = ox6VarJ;
                            ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                            mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                            bj4Var = bj4VarO;
                            bj4Var.K(-1379221164);
                            if (str4 != null) {
                                mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                                bj4Var = bj4Var;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                                bj4Var.K(941879891);
                                ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                                iHashCode4 = Long.hashCode(bj4Var.T);
                                kw7VarP4 = bj4Var.P();
                                ox6VarC4 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, ny8VarA2);
                                rd7.d(bj4Var, eVar, kw7VarP4);
                                l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC4);
                                ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                                bj4Var.K(-1379205196);
                                if (num6 == null) {
                                    ox6Var7 = ox6Var6;
                                } else {
                                    ox6Var7 = ox6Var6;
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    g2b g2bVar1111111111111 = g2b.a;
                                }
                                bj4Var.U(false);
                                bj4Var.U(true);
                                bj4Var.U(false);
                                g2b g2bVar1111111111112 = g2b.a;
                                ci4Var4 = ci4Var3;
                                z3 = true;
                            } else {
                                ox6Var7 = ox6Var6;
                                ci4Var4 = ci4Var3;
                                if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                    bj4Var.K(942534549);
                                    if (num6 == null) {
                                        z5 = true;
                                        z4 = false;
                                    } else {
                                        fl6VarD = dv0.d(di.a.a, false);
                                        iHashCode3 = Long.hashCode(bj4Var.T);
                                        kw7VarP3 = bj4Var.P();
                                        ox6VarC3 = it1.c(bj4Var, aVar);
                                        if (j1bVar != null) {
                                            ml5.c();
                                            throw null;
                                        }
                                        bj4Var.q();
                                        if (bj4Var.S) {
                                            bj4Var.k(aVar2);
                                        } else {
                                            bj4Var.z();
                                        }
                                        rd7.d(bj4Var, cVar, fl6VarD);
                                        rd7.d(bj4Var, eVar, kw7VarP3);
                                        l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                        rd7.d(bj4Var, dVar, ox6VarC3);
                                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                        z4 = false;
                                        dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                        z5 = true;
                                        bj4Var.U(true);
                                        g2b g2bVar1111111111113 = g2b.a;
                                    }
                                    bj4Var.U(z4);
                                    z3 = z5;
                                } else {
                                    ci4Var4 = ci4Var4;
                                    if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                        bj4Var.K(861667097);
                                        bj4Var.U(false);
                                        defpackage.u.b();
                                        return;
                                    }
                                    bj4Var.K(943331838);
                                    ox6 ox6VarM1111 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                    bj4Var.K(861717389);
                                    objF2 = bj4Var.f();
                                    if (objF2 == c0187a) {
                                        z2 = false;
                                        objF2 = new w05(0 == true ? 1 : 0);
                                        bj4Var.C(objF2);
                                    } else {
                                        z2 = false;
                                    }
                                    bj4Var.U(z2);
                                    z3 = true;
                                    bj4 bj4Var1112 = bj4Var;
                                    mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM1111, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var1112, 1597824, 0, 262056);
                                    bj4Var = bj4Var1112;
                                    bj4Var.U(false);
                                    g2b g2bVar1111111111114 = g2b.a;
                                }
                            }
                            bj4Var.U(z3);
                            homeItemBadge4 = homeItemBadge3;
                            ox6Var8 = ox6Var7;
                            str6 = str3;
                            str7 = str4;
                            ox6Var9 = ox6Var5;
                            num7 = num6;
                            mh4Var4 = mh4Var3;
                            ci4Var5 = ci4Var4;
                            num8 = num5;
                        }
                        str5 = strF;
                        bj4VarO.U(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        ox6Var6 = ox6VarJ;
                        ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                        bj4Var = bj4VarO;
                        bj4Var.K(-1379221164);
                        if (str4 != null) {
                            mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                            bj4Var.K(941879891);
                            ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA2);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                            bj4Var.K(-1379205196);
                            if (num6 == null) {
                                ox6Var7 = ox6Var6;
                            } else {
                                ox6Var7 = ox6Var6;
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                g2b g2bVar1111111111115 = g2b.a;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.U(false);
                            g2b g2bVar1111111111116 = g2b.a;
                            ci4Var4 = ci4Var3;
                            z3 = true;
                        } else {
                            ox6Var7 = ox6Var6;
                            ci4Var4 = ci4Var3;
                            if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                bj4Var.K(942534549);
                                if (num6 == null) {
                                    z5 = true;
                                    z4 = false;
                                } else {
                                    fl6VarD = dv0.d(di.a.a, false);
                                    iHashCode3 = Long.hashCode(bj4Var.T);
                                    kw7VarP3 = bj4Var.P();
                                    ox6VarC3 = it1.c(bj4Var, aVar);
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4Var.q();
                                    if (bj4Var.S) {
                                        bj4Var.k(aVar2);
                                    } else {
                                        bj4Var.z();
                                    }
                                    rd7.d(bj4Var, cVar, fl6VarD);
                                    rd7.d(bj4Var, eVar, kw7VarP3);
                                    l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                    rd7.d(bj4Var, dVar, ox6VarC3);
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    z4 = false;
                                    dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                    z5 = true;
                                    bj4Var.U(true);
                                    g2b g2bVar1111111111117 = g2b.a;
                                }
                                bj4Var.U(z4);
                                z3 = z5;
                            } else {
                                ci4Var4 = ci4Var4;
                                if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                    bj4Var.K(861667097);
                                    bj4Var.U(false);
                                    defpackage.u.b();
                                    return;
                                }
                                bj4Var.K(943331838);
                                ox6 ox6VarM1112 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                bj4Var.K(861717389);
                                objF2 = bj4Var.f();
                                if (objF2 == c0187a) {
                                    z2 = false;
                                    objF2 = new w05(0 == true ? 1 : 0);
                                    bj4Var.C(objF2);
                                } else {
                                    z2 = false;
                                }
                                bj4Var.U(z2);
                                z3 = true;
                                bj4 bj4Var1113 = bj4Var;
                                mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM1112, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var1113, 1597824, 0, 262056);
                                bj4Var = bj4Var1113;
                                bj4Var.U(false);
                                g2b g2bVar1111111111118 = g2b.a;
                            }
                        }
                        bj4Var.U(z3);
                        homeItemBadge4 = homeItemBadge3;
                        ox6Var8 = ox6Var7;
                        str6 = str3;
                        str7 = str4;
                        ox6Var9 = ox6Var5;
                        num7 = num6;
                        mh4Var4 = mh4Var3;
                        ci4Var5 = ci4Var4;
                        num8 = num5;
                    } else {
                        aVar = ox6.a.t;
                        if (i20 != 0) {
                            ox6Var3 = aVar;
                        }
                        if (i21 != 0) {
                            num3 = null;
                        }
                        if (i4 != 0) {
                            ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                        }
                        if (i6 != 0) {
                            ox6VarJ = ir9.j(aVar, 16.0f);
                        } else {
                            ox6VarJ = ox6Var4;
                        }
                        if (i8 != 0) {
                            num4 = null;
                        }
                        if (i10 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i12 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i14 != 0) {
                            homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                        } else {
                            homeItemBadge2 = homeItemBadge;
                        }
                        c0187a = jt1.a.a;
                        if (i16 != 0) {
                            bj4VarO.K(-244016614);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new v05();
                                bj4VarO.C(objF3);
                            }
                            mh4Var2 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        ox6 ox6VarC111 = ir9.c(ox6Var3, 1.0f);
                        bj4VarO.K(-244013531);
                        if ((234881024 & i3) == 67108864) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            objF = new gb3(2, mh4Var2);
                            bj4VarO.C(objF);
                        } else {
                            objF = new gb3(2, mh4Var2);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        num5 = num4;
                        ox6Var5 = ox6Var3;
                        ox6 ox6VarJ18 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC111, false, null, (mh4) objF, 15));
                        c30.j jVar17 = c30.a;
                        bVar = di.a.k;
                        ny8VarA = ly8.a(jVar17, bVar, bj4VarO, 48);
                        i18 = i3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarJ18);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        cVar = bt1.a.f;
                        rd7.d(bj4VarO, cVar, ny8VarA);
                        eVar = bt1.a.e;
                        rd7.d(bj4VarO, eVar, kw7VarP);
                        Integer numValueOf17 = Integer.valueOf(iHashCode);
                        bVar2 = bt1.a.g;
                        rd7.d(bj4VarO, bVar2, numValueOf17);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        mh4Var3 = mh4Var2;
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        num6 = num3;
                        qs5 qs5Var17 = new qs5(true, 2.0f);
                        homeItemBadge3 = homeItemBadge2;
                        aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, qs5Var17);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        bj4VarO.K(-1379228937);
                        if (num5 != null) {
                            strF = nr1.f(bj4VarO, num5.intValue());
                        } else {
                            if (str3 == null) {
                                strF = BuildConfig.FLAVOR;
                            } else {
                                str5 = str3;
                            }
                            bj4VarO.U(false);
                            intercomTheme = IntercomTheme.INSTANCE;
                            i19 = IntercomTheme.$stable;
                            ox6Var6 = ox6VarJ;
                            ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                            mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                            bj4Var = bj4VarO;
                            bj4Var.K(-1379221164);
                            if (str4 != null) {
                                mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                                bj4Var = bj4Var;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                                bj4Var.K(941879891);
                                ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                                iHashCode4 = Long.hashCode(bj4Var.T);
                                kw7VarP4 = bj4Var.P();
                                ox6VarC4 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, ny8VarA2);
                                rd7.d(bj4Var, eVar, kw7VarP4);
                                l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC4);
                                ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                                bj4Var.K(-1379205196);
                                if (num6 == null) {
                                    ox6Var7 = ox6Var6;
                                } else {
                                    ox6Var7 = ox6Var6;
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    g2b g2bVar1111111111119 = g2b.a;
                                }
                                bj4Var.U(false);
                                bj4Var.U(true);
                                bj4Var.U(false);
                                g2b g2bVar11111111111110 = g2b.a;
                                ci4Var4 = ci4Var3;
                                z3 = true;
                            } else {
                                ox6Var7 = ox6Var6;
                                ci4Var4 = ci4Var3;
                                if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                    bj4Var.K(942534549);
                                    if (num6 == null) {
                                        z5 = true;
                                        z4 = false;
                                    } else {
                                        fl6VarD = dv0.d(di.a.a, false);
                                        iHashCode3 = Long.hashCode(bj4Var.T);
                                        kw7VarP3 = bj4Var.P();
                                        ox6VarC3 = it1.c(bj4Var, aVar);
                                        if (j1bVar != null) {
                                            ml5.c();
                                            throw null;
                                        }
                                        bj4Var.q();
                                        if (bj4Var.S) {
                                            bj4Var.k(aVar2);
                                        } else {
                                            bj4Var.z();
                                        }
                                        rd7.d(bj4Var, cVar, fl6VarD);
                                        rd7.d(bj4Var, eVar, kw7VarP3);
                                        l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                        rd7.d(bj4Var, dVar, ox6VarC3);
                                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                        z4 = false;
                                        dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                        z5 = true;
                                        bj4Var.U(true);
                                        g2b g2bVar11111111111111 = g2b.a;
                                    }
                                    bj4Var.U(z4);
                                    z3 = z5;
                                } else {
                                    ci4Var4 = ci4Var4;
                                    if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                        bj4Var.K(861667097);
                                        bj4Var.U(false);
                                        defpackage.u.b();
                                        return;
                                    }
                                    bj4Var.K(943331838);
                                    ox6 ox6VarM1113 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                    bj4Var.K(861717389);
                                    objF2 = bj4Var.f();
                                    if (objF2 == c0187a) {
                                        z2 = false;
                                        objF2 = new w05(0 == true ? 1 : 0);
                                        bj4Var.C(objF2);
                                    } else {
                                        z2 = false;
                                    }
                                    bj4Var.U(z2);
                                    z3 = true;
                                    bj4 bj4Var1114 = bj4Var;
                                    mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM1113, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var1114, 1597824, 0, 262056);
                                    bj4Var = bj4Var1114;
                                    bj4Var.U(false);
                                    g2b g2bVar11111111111112 = g2b.a;
                                }
                            }
                            bj4Var.U(z3);
                            homeItemBadge4 = homeItemBadge3;
                            ox6Var8 = ox6Var7;
                            str6 = str3;
                            str7 = str4;
                            ox6Var9 = ox6Var5;
                            num7 = num6;
                            mh4Var4 = mh4Var3;
                            ci4Var5 = ci4Var4;
                            num8 = num5;
                        }
                        str5 = strF;
                        bj4VarO.U(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        ox6Var6 = ox6VarJ;
                        ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                        bj4Var = bj4VarO;
                        bj4Var.K(-1379221164);
                        if (str4 != null) {
                            mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                            bj4Var.K(941879891);
                            ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA2);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                            bj4Var.K(-1379205196);
                            if (num6 == null) {
                                ox6Var7 = ox6Var6;
                            } else {
                                ox6Var7 = ox6Var6;
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                g2b g2bVar11111111111113 = g2b.a;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.U(false);
                            g2b g2bVar11111111111114 = g2b.a;
                            ci4Var4 = ci4Var3;
                            z3 = true;
                        } else {
                            ox6Var7 = ox6Var6;
                            ci4Var4 = ci4Var3;
                            if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                bj4Var.K(942534549);
                                if (num6 == null) {
                                    z5 = true;
                                    z4 = false;
                                } else {
                                    fl6VarD = dv0.d(di.a.a, false);
                                    iHashCode3 = Long.hashCode(bj4Var.T);
                                    kw7VarP3 = bj4Var.P();
                                    ox6VarC3 = it1.c(bj4Var, aVar);
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4Var.q();
                                    if (bj4Var.S) {
                                        bj4Var.k(aVar2);
                                    } else {
                                        bj4Var.z();
                                    }
                                    rd7.d(bj4Var, cVar, fl6VarD);
                                    rd7.d(bj4Var, eVar, kw7VarP3);
                                    l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                    rd7.d(bj4Var, dVar, ox6VarC3);
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    z4 = false;
                                    dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                    z5 = true;
                                    bj4Var.U(true);
                                    g2b g2bVar11111111111115 = g2b.a;
                                }
                                bj4Var.U(z4);
                                z3 = z5;
                            } else {
                                ci4Var4 = ci4Var4;
                                if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                    bj4Var.K(861667097);
                                    bj4Var.U(false);
                                    defpackage.u.b();
                                    return;
                                }
                                bj4Var.K(943331838);
                                ox6 ox6VarM1114 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                bj4Var.K(861717389);
                                objF2 = bj4Var.f();
                                if (objF2 == c0187a) {
                                    z2 = false;
                                    objF2 = new w05(0 == true ? 1 : 0);
                                    bj4Var.C(objF2);
                                } else {
                                    z2 = false;
                                }
                                bj4Var.U(z2);
                                z3 = true;
                                bj4 bj4Var1115 = bj4Var;
                                mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM1114, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var1115, 1597824, 0, 262056);
                                bj4Var = bj4Var1115;
                                bj4Var.U(false);
                                g2b g2bVar11111111111116 = g2b.a;
                            }
                        }
                        bj4Var.U(z3);
                        homeItemBadge4 = homeItemBadge3;
                        ox6Var8 = ox6Var7;
                        str6 = str3;
                        str7 = str4;
                        ox6Var9 = ox6Var5;
                        num7 = num6;
                        mh4Var4 = mh4Var3;
                        ci4Var5 = ci4Var4;
                        num8 = num5;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: x05
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HomeItemKt.HomeItem$lambda$12(ox6Var9, num7, ci4Var5, ox6Var8, num8, str6, str7, homeItemBadge4, mh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                num4 = num2;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                    j1bVar = j1bVar2;
                } else {
                    j1bVar = j1bVar2;
                    if ((i & 196608) == 0) {
                        if (bj4VarO.J(str)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (bj4VarO.J(str2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                i15 = 12582912;
                if (i14 == 0) {
                    i3 |= i15;
                } else if ((i & 12582912) == 0) {
                    if ((i & 16777216) == 0) {
                        zJ = bj4VarO.J(homeItemBadge);
                    } else {
                        zJ = bj4VarO.j(homeItemBadge);
                    }
                    if (zJ) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                i16 = i2 & 256;
                if (i16 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (bj4VarO.j(mh4Var)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i3 |= i17;
                }
                if ((i3 & 38347923) == 38347922) {
                    aVar = ox6.a.t;
                    if (i20 != 0) {
                        ox6Var3 = aVar;
                    }
                    if (i21 != 0) {
                        num3 = null;
                    }
                    if (i4 != 0) {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    if (i6 != 0) {
                        ox6VarJ = ir9.j(aVar, 16.0f);
                    } else {
                        ox6VarJ = ox6Var4;
                    }
                    if (i8 != 0) {
                        num4 = null;
                    }
                    if (i10 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i12 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                    } else {
                        homeItemBadge2 = homeItemBadge;
                    }
                    c0187a = jt1.a.a;
                    if (i16 != 0) {
                        bj4VarO.K(-244016614);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new v05();
                            bj4VarO.C(objF3);
                        }
                        mh4Var2 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    ox6 ox6VarC112 = ir9.c(ox6Var3, 1.0f);
                    bj4VarO.K(-244013531);
                    if ((234881024 & i3) == 67108864) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    } else {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    num5 = num4;
                    ox6Var5 = ox6Var3;
                    ox6 ox6VarJ19 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC112, false, null, (mh4) objF, 15));
                    c30.j jVar18 = c30.a;
                    bVar = di.a.k;
                    ny8VarA = ly8.a(jVar18, bVar, bj4VarO, 48);
                    i18 = i3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarJ19);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf18 = Integer.valueOf(iHashCode);
                    bVar2 = bt1.a.g;
                    rd7.d(bj4VarO, bVar2, numValueOf18);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    mh4Var3 = mh4Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    num6 = num3;
                    qs5 qs5Var18 = new qs5(true, 2.0f);
                    homeItemBadge3 = homeItemBadge2;
                    aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, qs5Var18);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    bj4VarO.K(-1379228937);
                    if (num5 != null) {
                        strF = nr1.f(bj4VarO, num5.intValue());
                    } else {
                        if (str3 == null) {
                            strF = BuildConfig.FLAVOR;
                        } else {
                            str5 = str3;
                        }
                        bj4VarO.U(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        ox6Var6 = ox6VarJ;
                        ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                        bj4Var = bj4VarO;
                        bj4Var.K(-1379221164);
                        if (str4 != null) {
                            mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                            bj4Var.K(941879891);
                            ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA2);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                            bj4Var.K(-1379205196);
                            if (num6 == null) {
                                ox6Var7 = ox6Var6;
                            } else {
                                ox6Var7 = ox6Var6;
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                g2b g2bVar11111111111117 = g2b.a;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.U(false);
                            g2b g2bVar11111111111118 = g2b.a;
                            ci4Var4 = ci4Var3;
                            z3 = true;
                        } else {
                            ox6Var7 = ox6Var6;
                            ci4Var4 = ci4Var3;
                            if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                bj4Var.K(942534549);
                                if (num6 == null) {
                                    z5 = true;
                                    z4 = false;
                                } else {
                                    fl6VarD = dv0.d(di.a.a, false);
                                    iHashCode3 = Long.hashCode(bj4Var.T);
                                    kw7VarP3 = bj4Var.P();
                                    ox6VarC3 = it1.c(bj4Var, aVar);
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4Var.q();
                                    if (bj4Var.S) {
                                        bj4Var.k(aVar2);
                                    } else {
                                        bj4Var.z();
                                    }
                                    rd7.d(bj4Var, cVar, fl6VarD);
                                    rd7.d(bj4Var, eVar, kw7VarP3);
                                    l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                    rd7.d(bj4Var, dVar, ox6VarC3);
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    z4 = false;
                                    dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                    z5 = true;
                                    bj4Var.U(true);
                                    g2b g2bVar11111111111119 = g2b.a;
                                }
                                bj4Var.U(z4);
                                z3 = z5;
                            } else {
                                ci4Var4 = ci4Var4;
                                if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                    bj4Var.K(861667097);
                                    bj4Var.U(false);
                                    defpackage.u.b();
                                    return;
                                }
                                bj4Var.K(943331838);
                                ox6 ox6VarM1115 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                bj4Var.K(861717389);
                                objF2 = bj4Var.f();
                                if (objF2 == c0187a) {
                                    z2 = false;
                                    objF2 = new w05(0 == true ? 1 : 0);
                                    bj4Var.C(objF2);
                                } else {
                                    z2 = false;
                                }
                                bj4Var.U(z2);
                                z3 = true;
                                bj4 bj4Var1116 = bj4Var;
                                mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM1115, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var1116, 1597824, 0, 262056);
                                bj4Var = bj4Var1116;
                                bj4Var.U(false);
                                g2b g2bVar111111111111110 = g2b.a;
                            }
                        }
                        bj4Var.U(z3);
                        homeItemBadge4 = homeItemBadge3;
                        ox6Var8 = ox6Var7;
                        str6 = str3;
                        str7 = str4;
                        ox6Var9 = ox6Var5;
                        num7 = num6;
                        mh4Var4 = mh4Var3;
                        ci4Var5 = ci4Var4;
                        num8 = num5;
                    }
                    str5 = strF;
                    bj4VarO.U(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    ox6Var6 = ox6VarJ;
                    ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                    bj4Var = bj4VarO;
                    bj4Var.K(-1379221164);
                    if (str4 != null) {
                        mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                        bj4Var.K(941879891);
                        ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA2);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                        bj4Var.K(-1379205196);
                        if (num6 == null) {
                            ox6Var7 = ox6Var6;
                        } else {
                            ox6Var7 = ox6Var6;
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            g2b g2bVar111111111111111 = g2b.a;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(false);
                        g2b g2bVar111111111111112 = g2b.a;
                        ci4Var4 = ci4Var3;
                        z3 = true;
                    } else {
                        ox6Var7 = ox6Var6;
                        ci4Var4 = ci4Var3;
                        if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            bj4Var.K(942534549);
                            if (num6 == null) {
                                z5 = true;
                                z4 = false;
                            } else {
                                fl6VarD = dv0.d(di.a.a, false);
                                iHashCode3 = Long.hashCode(bj4Var.T);
                                kw7VarP3 = bj4Var.P();
                                ox6VarC3 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, fl6VarD);
                                rd7.d(bj4Var, eVar, kw7VarP3);
                                l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC3);
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                z4 = false;
                                dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                z5 = true;
                                bj4Var.U(true);
                                g2b g2bVar111111111111113 = g2b.a;
                            }
                            bj4Var.U(z4);
                            z3 = z5;
                        } else {
                            ci4Var4 = ci4Var4;
                            if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                bj4Var.K(861667097);
                                bj4Var.U(false);
                                defpackage.u.b();
                                return;
                            }
                            bj4Var.K(943331838);
                            ox6 ox6VarM1116 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                            bj4Var.K(861717389);
                            objF2 = bj4Var.f();
                            if (objF2 == c0187a) {
                                z2 = false;
                                objF2 = new w05(0 == true ? 1 : 0);
                                bj4Var.C(objF2);
                            } else {
                                z2 = false;
                            }
                            bj4Var.U(z2);
                            z3 = true;
                            bj4 bj4Var1117 = bj4Var;
                            mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM1116, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var1117, 1597824, 0, 262056);
                            bj4Var = bj4Var1117;
                            bj4Var.U(false);
                            g2b g2bVar111111111111114 = g2b.a;
                        }
                    }
                    bj4Var.U(z3);
                    homeItemBadge4 = homeItemBadge3;
                    ox6Var8 = ox6Var7;
                    str6 = str3;
                    str7 = str4;
                    ox6Var9 = ox6Var5;
                    num7 = num6;
                    mh4Var4 = mh4Var3;
                    ci4Var5 = ci4Var4;
                    num8 = num5;
                } else {
                    aVar = ox6.a.t;
                    if (i20 != 0) {
                        ox6Var3 = aVar;
                    }
                    if (i21 != 0) {
                        num3 = null;
                    }
                    if (i4 != 0) {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    if (i6 != 0) {
                        ox6VarJ = ir9.j(aVar, 16.0f);
                    } else {
                        ox6VarJ = ox6Var4;
                    }
                    if (i8 != 0) {
                        num4 = null;
                    }
                    if (i10 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i12 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                    } else {
                        homeItemBadge2 = homeItemBadge;
                    }
                    c0187a = jt1.a.a;
                    if (i16 != 0) {
                        bj4VarO.K(-244016614);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new v05();
                            bj4VarO.C(objF3);
                        }
                        mh4Var2 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    ox6 ox6VarC113 = ir9.c(ox6Var3, 1.0f);
                    bj4VarO.K(-244013531);
                    if ((234881024 & i3) == 67108864) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    } else {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    num5 = num4;
                    ox6Var5 = ox6Var3;
                    ox6 ox6VarJ110 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC113, false, null, (mh4) objF, 15));
                    c30.j jVar19 = c30.a;
                    bVar = di.a.k;
                    ny8VarA = ly8.a(jVar19, bVar, bj4VarO, 48);
                    i18 = i3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarJ110);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf19 = Integer.valueOf(iHashCode);
                    bVar2 = bt1.a.g;
                    rd7.d(bj4VarO, bVar2, numValueOf19);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    mh4Var3 = mh4Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    num6 = num3;
                    qs5 qs5Var19 = new qs5(true, 2.0f);
                    homeItemBadge3 = homeItemBadge2;
                    aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, qs5Var19);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    bj4VarO.K(-1379228937);
                    if (num5 != null) {
                        strF = nr1.f(bj4VarO, num5.intValue());
                    } else {
                        if (str3 == null) {
                            strF = BuildConfig.FLAVOR;
                        } else {
                            str5 = str3;
                        }
                        bj4VarO.U(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        ox6Var6 = ox6VarJ;
                        ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                        bj4Var = bj4VarO;
                        bj4Var.K(-1379221164);
                        if (str4 != null) {
                            mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                            bj4Var.K(941879891);
                            ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA2);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                            bj4Var.K(-1379205196);
                            if (num6 == null) {
                                ox6Var7 = ox6Var6;
                            } else {
                                ox6Var7 = ox6Var6;
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                g2b g2bVar111111111111115 = g2b.a;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.U(false);
                            g2b g2bVar111111111111116 = g2b.a;
                            ci4Var4 = ci4Var3;
                            z3 = true;
                        } else {
                            ox6Var7 = ox6Var6;
                            ci4Var4 = ci4Var3;
                            if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                bj4Var.K(942534549);
                                if (num6 == null) {
                                    z5 = true;
                                    z4 = false;
                                } else {
                                    fl6VarD = dv0.d(di.a.a, false);
                                    iHashCode3 = Long.hashCode(bj4Var.T);
                                    kw7VarP3 = bj4Var.P();
                                    ox6VarC3 = it1.c(bj4Var, aVar);
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4Var.q();
                                    if (bj4Var.S) {
                                        bj4Var.k(aVar2);
                                    } else {
                                        bj4Var.z();
                                    }
                                    rd7.d(bj4Var, cVar, fl6VarD);
                                    rd7.d(bj4Var, eVar, kw7VarP3);
                                    l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                    rd7.d(bj4Var, dVar, ox6VarC3);
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    z4 = false;
                                    dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                    z5 = true;
                                    bj4Var.U(true);
                                    g2b g2bVar111111111111117 = g2b.a;
                                }
                                bj4Var.U(z4);
                                z3 = z5;
                            } else {
                                ci4Var4 = ci4Var4;
                                if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                    bj4Var.K(861667097);
                                    bj4Var.U(false);
                                    defpackage.u.b();
                                    return;
                                }
                                bj4Var.K(943331838);
                                ox6 ox6VarM1117 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                bj4Var.K(861717389);
                                objF2 = bj4Var.f();
                                if (objF2 == c0187a) {
                                    z2 = false;
                                    objF2 = new w05(0 == true ? 1 : 0);
                                    bj4Var.C(objF2);
                                } else {
                                    z2 = false;
                                }
                                bj4Var.U(z2);
                                z3 = true;
                                bj4 bj4Var1118 = bj4Var;
                                mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM1117, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var1118, 1597824, 0, 262056);
                                bj4Var = bj4Var1118;
                                bj4Var.U(false);
                                g2b g2bVar111111111111118 = g2b.a;
                            }
                        }
                        bj4Var.U(z3);
                        homeItemBadge4 = homeItemBadge3;
                        ox6Var8 = ox6Var7;
                        str6 = str3;
                        str7 = str4;
                        ox6Var9 = ox6Var5;
                        num7 = num6;
                        mh4Var4 = mh4Var3;
                        ci4Var5 = ci4Var4;
                        num8 = num5;
                    }
                    str5 = strF;
                    bj4VarO.U(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    ox6Var6 = ox6VarJ;
                    ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                    bj4Var = bj4VarO;
                    bj4Var.K(-1379221164);
                    if (str4 != null) {
                        mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                        bj4Var.K(941879891);
                        ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA2);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                        bj4Var.K(-1379205196);
                        if (num6 == null) {
                            ox6Var7 = ox6Var6;
                        } else {
                            ox6Var7 = ox6Var6;
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            g2b g2bVar111111111111119 = g2b.a;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(false);
                        g2b g2bVar1111111111111110 = g2b.a;
                        ci4Var4 = ci4Var3;
                        z3 = true;
                    } else {
                        ox6Var7 = ox6Var6;
                        ci4Var4 = ci4Var3;
                        if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            bj4Var.K(942534549);
                            if (num6 == null) {
                                z5 = true;
                                z4 = false;
                            } else {
                                fl6VarD = dv0.d(di.a.a, false);
                                iHashCode3 = Long.hashCode(bj4Var.T);
                                kw7VarP3 = bj4Var.P();
                                ox6VarC3 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, fl6VarD);
                                rd7.d(bj4Var, eVar, kw7VarP3);
                                l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC3);
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                z4 = false;
                                dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                z5 = true;
                                bj4Var.U(true);
                                g2b g2bVar1111111111111111 = g2b.a;
                            }
                            bj4Var.U(z4);
                            z3 = z5;
                        } else {
                            ci4Var4 = ci4Var4;
                            if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                bj4Var.K(861667097);
                                bj4Var.U(false);
                                defpackage.u.b();
                                return;
                            }
                            bj4Var.K(943331838);
                            ox6 ox6VarM1118 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                            bj4Var.K(861717389);
                            objF2 = bj4Var.f();
                            if (objF2 == c0187a) {
                                z2 = false;
                                objF2 = new w05(0 == true ? 1 : 0);
                                bj4Var.C(objF2);
                            } else {
                                z2 = false;
                            }
                            bj4Var.U(z2);
                            z3 = true;
                            bj4 bj4Var1119 = bj4Var;
                            mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM1118, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var1119, 1597824, 0, 262056);
                            bj4Var = bj4Var1119;
                            bj4Var.U(false);
                            g2b g2bVar1111111111111112 = g2b.a;
                        }
                    }
                    bj4Var.U(z3);
                    homeItemBadge4 = homeItemBadge3;
                    ox6Var8 = ox6Var7;
                    str6 = str3;
                    str7 = str4;
                    ox6Var9 = ox6Var5;
                    num7 = num6;
                    mh4Var4 = mh4Var3;
                    ci4Var5 = ci4Var4;
                    num8 = num5;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: x05
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HomeItemKt.HomeItem$lambda$12(ox6Var9, num7, ci4Var5, ox6Var8, num8, str6, str7, homeItemBadge4, mh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            ox6Var4 = ox6Var2;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    num4 = num2;
                    if (bj4VarO.J(num4)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                    j1bVar = j1bVar2;
                } else {
                    j1bVar = j1bVar2;
                    if ((i & 196608) == 0) {
                        if (bj4VarO.J(str)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (bj4VarO.J(str2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                i15 = 12582912;
                if (i14 == 0) {
                    i3 |= i15;
                } else if ((i & 12582912) == 0) {
                    if ((i & 16777216) == 0) {
                        zJ = bj4VarO.J(homeItemBadge);
                    } else {
                        zJ = bj4VarO.j(homeItemBadge);
                    }
                    if (zJ) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                i16 = i2 & 256;
                if (i16 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (bj4VarO.j(mh4Var)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i3 |= i17;
                }
                if ((i3 & 38347923) == 38347922) {
                    aVar = ox6.a.t;
                    if (i20 != 0) {
                        ox6Var3 = aVar;
                    }
                    if (i21 != 0) {
                        num3 = null;
                    }
                    if (i4 != 0) {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    if (i6 != 0) {
                        ox6VarJ = ir9.j(aVar, 16.0f);
                    } else {
                        ox6VarJ = ox6Var4;
                    }
                    if (i8 != 0) {
                        num4 = null;
                    }
                    if (i10 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i12 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                    } else {
                        homeItemBadge2 = homeItemBadge;
                    }
                    c0187a = jt1.a.a;
                    if (i16 != 0) {
                        bj4VarO.K(-244016614);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new v05();
                            bj4VarO.C(objF3);
                        }
                        mh4Var2 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    ox6 ox6VarC114 = ir9.c(ox6Var3, 1.0f);
                    bj4VarO.K(-244013531);
                    if ((234881024 & i3) == 67108864) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    } else {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    num5 = num4;
                    ox6Var5 = ox6Var3;
                    ox6 ox6VarJ111 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC114, false, null, (mh4) objF, 15));
                    c30.j jVar110 = c30.a;
                    bVar = di.a.k;
                    ny8VarA = ly8.a(jVar110, bVar, bj4VarO, 48);
                    i18 = i3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarJ111);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf110 = Integer.valueOf(iHashCode);
                    bVar2 = bt1.a.g;
                    rd7.d(bj4VarO, bVar2, numValueOf110);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    mh4Var3 = mh4Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    num6 = num3;
                    qs5 qs5Var110 = new qs5(true, 2.0f);
                    homeItemBadge3 = homeItemBadge2;
                    aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, qs5Var110);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    bj4VarO.K(-1379228937);
                    if (num5 != null) {
                        strF = nr1.f(bj4VarO, num5.intValue());
                    } else {
                        if (str3 == null) {
                            strF = BuildConfig.FLAVOR;
                        } else {
                            str5 = str3;
                        }
                        bj4VarO.U(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        ox6Var6 = ox6VarJ;
                        ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                        bj4Var = bj4VarO;
                        bj4Var.K(-1379221164);
                        if (str4 != null) {
                            mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                            bj4Var.K(941879891);
                            ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA2);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                            bj4Var.K(-1379205196);
                            if (num6 == null) {
                                ox6Var7 = ox6Var6;
                            } else {
                                ox6Var7 = ox6Var6;
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                g2b g2bVar1111111111111113 = g2b.a;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.U(false);
                            g2b g2bVar1111111111111114 = g2b.a;
                            ci4Var4 = ci4Var3;
                            z3 = true;
                        } else {
                            ox6Var7 = ox6Var6;
                            ci4Var4 = ci4Var3;
                            if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                bj4Var.K(942534549);
                                if (num6 == null) {
                                    z5 = true;
                                    z4 = false;
                                } else {
                                    fl6VarD = dv0.d(di.a.a, false);
                                    iHashCode3 = Long.hashCode(bj4Var.T);
                                    kw7VarP3 = bj4Var.P();
                                    ox6VarC3 = it1.c(bj4Var, aVar);
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4Var.q();
                                    if (bj4Var.S) {
                                        bj4Var.k(aVar2);
                                    } else {
                                        bj4Var.z();
                                    }
                                    rd7.d(bj4Var, cVar, fl6VarD);
                                    rd7.d(bj4Var, eVar, kw7VarP3);
                                    l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                    rd7.d(bj4Var, dVar, ox6VarC3);
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    z4 = false;
                                    dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                    z5 = true;
                                    bj4Var.U(true);
                                    g2b g2bVar1111111111111115 = g2b.a;
                                }
                                bj4Var.U(z4);
                                z3 = z5;
                            } else {
                                ci4Var4 = ci4Var4;
                                if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                    bj4Var.K(861667097);
                                    bj4Var.U(false);
                                    defpackage.u.b();
                                    return;
                                }
                                bj4Var.K(943331838);
                                ox6 ox6VarM1119 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                bj4Var.K(861717389);
                                objF2 = bj4Var.f();
                                if (objF2 == c0187a) {
                                    z2 = false;
                                    objF2 = new w05(0 == true ? 1 : 0);
                                    bj4Var.C(objF2);
                                } else {
                                    z2 = false;
                                }
                                bj4Var.U(z2);
                                z3 = true;
                                bj4 bj4Var11110 = bj4Var;
                                mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM1119, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var11110, 1597824, 0, 262056);
                                bj4Var = bj4Var11110;
                                bj4Var.U(false);
                                g2b g2bVar1111111111111116 = g2b.a;
                            }
                        }
                        bj4Var.U(z3);
                        homeItemBadge4 = homeItemBadge3;
                        ox6Var8 = ox6Var7;
                        str6 = str3;
                        str7 = str4;
                        ox6Var9 = ox6Var5;
                        num7 = num6;
                        mh4Var4 = mh4Var3;
                        ci4Var5 = ci4Var4;
                        num8 = num5;
                    }
                    str5 = strF;
                    bj4VarO.U(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    ox6Var6 = ox6VarJ;
                    ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                    bj4Var = bj4VarO;
                    bj4Var.K(-1379221164);
                    if (str4 != null) {
                        mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                        bj4Var.K(941879891);
                        ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA2);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                        bj4Var.K(-1379205196);
                        if (num6 == null) {
                            ox6Var7 = ox6Var6;
                        } else {
                            ox6Var7 = ox6Var6;
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            g2b g2bVar1111111111111117 = g2b.a;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(false);
                        g2b g2bVar1111111111111118 = g2b.a;
                        ci4Var4 = ci4Var3;
                        z3 = true;
                    } else {
                        ox6Var7 = ox6Var6;
                        ci4Var4 = ci4Var3;
                        if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            bj4Var.K(942534549);
                            if (num6 == null) {
                                z5 = true;
                                z4 = false;
                            } else {
                                fl6VarD = dv0.d(di.a.a, false);
                                iHashCode3 = Long.hashCode(bj4Var.T);
                                kw7VarP3 = bj4Var.P();
                                ox6VarC3 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, fl6VarD);
                                rd7.d(bj4Var, eVar, kw7VarP3);
                                l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC3);
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                z4 = false;
                                dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                z5 = true;
                                bj4Var.U(true);
                                g2b g2bVar1111111111111119 = g2b.a;
                            }
                            bj4Var.U(z4);
                            z3 = z5;
                        } else {
                            ci4Var4 = ci4Var4;
                            if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                bj4Var.K(861667097);
                                bj4Var.U(false);
                                defpackage.u.b();
                                return;
                            }
                            bj4Var.K(943331838);
                            ox6 ox6VarM11110 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                            bj4Var.K(861717389);
                            objF2 = bj4Var.f();
                            if (objF2 == c0187a) {
                                z2 = false;
                                objF2 = new w05(0 == true ? 1 : 0);
                                bj4Var.C(objF2);
                            } else {
                                z2 = false;
                            }
                            bj4Var.U(z2);
                            z3 = true;
                            bj4 bj4Var11111 = bj4Var;
                            mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM11110, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var11111, 1597824, 0, 262056);
                            bj4Var = bj4Var11111;
                            bj4Var.U(false);
                            g2b g2bVar11111111111111110 = g2b.a;
                        }
                    }
                    bj4Var.U(z3);
                    homeItemBadge4 = homeItemBadge3;
                    ox6Var8 = ox6Var7;
                    str6 = str3;
                    str7 = str4;
                    ox6Var9 = ox6Var5;
                    num7 = num6;
                    mh4Var4 = mh4Var3;
                    ci4Var5 = ci4Var4;
                    num8 = num5;
                } else {
                    aVar = ox6.a.t;
                    if (i20 != 0) {
                        ox6Var3 = aVar;
                    }
                    if (i21 != 0) {
                        num3 = null;
                    }
                    if (i4 != 0) {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    if (i6 != 0) {
                        ox6VarJ = ir9.j(aVar, 16.0f);
                    } else {
                        ox6VarJ = ox6Var4;
                    }
                    if (i8 != 0) {
                        num4 = null;
                    }
                    if (i10 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i12 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                    } else {
                        homeItemBadge2 = homeItemBadge;
                    }
                    c0187a = jt1.a.a;
                    if (i16 != 0) {
                        bj4VarO.K(-244016614);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new v05();
                            bj4VarO.C(objF3);
                        }
                        mh4Var2 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    ox6 ox6VarC115 = ir9.c(ox6Var3, 1.0f);
                    bj4VarO.K(-244013531);
                    if ((234881024 & i3) == 67108864) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    } else {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    num5 = num4;
                    ox6Var5 = ox6Var3;
                    ox6 ox6VarJ112 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC115, false, null, (mh4) objF, 15));
                    c30.j jVar111 = c30.a;
                    bVar = di.a.k;
                    ny8VarA = ly8.a(jVar111, bVar, bj4VarO, 48);
                    i18 = i3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarJ112);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf111 = Integer.valueOf(iHashCode);
                    bVar2 = bt1.a.g;
                    rd7.d(bj4VarO, bVar2, numValueOf111);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    mh4Var3 = mh4Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    num6 = num3;
                    qs5 qs5Var111 = new qs5(true, 2.0f);
                    homeItemBadge3 = homeItemBadge2;
                    aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, qs5Var111);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    bj4VarO.K(-1379228937);
                    if (num5 != null) {
                        strF = nr1.f(bj4VarO, num5.intValue());
                    } else {
                        if (str3 == null) {
                            strF = BuildConfig.FLAVOR;
                        } else {
                            str5 = str3;
                        }
                        bj4VarO.U(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        ox6Var6 = ox6VarJ;
                        ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                        bj4Var = bj4VarO;
                        bj4Var.K(-1379221164);
                        if (str4 != null) {
                            mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                            bj4Var.K(941879891);
                            ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA2);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                            bj4Var.K(-1379205196);
                            if (num6 == null) {
                                ox6Var7 = ox6Var6;
                            } else {
                                ox6Var7 = ox6Var6;
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                g2b g2bVar11111111111111111 = g2b.a;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.U(false);
                            g2b g2bVar11111111111111112 = g2b.a;
                            ci4Var4 = ci4Var3;
                            z3 = true;
                        } else {
                            ox6Var7 = ox6Var6;
                            ci4Var4 = ci4Var3;
                            if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                bj4Var.K(942534549);
                                if (num6 == null) {
                                    z5 = true;
                                    z4 = false;
                                } else {
                                    fl6VarD = dv0.d(di.a.a, false);
                                    iHashCode3 = Long.hashCode(bj4Var.T);
                                    kw7VarP3 = bj4Var.P();
                                    ox6VarC3 = it1.c(bj4Var, aVar);
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4Var.q();
                                    if (bj4Var.S) {
                                        bj4Var.k(aVar2);
                                    } else {
                                        bj4Var.z();
                                    }
                                    rd7.d(bj4Var, cVar, fl6VarD);
                                    rd7.d(bj4Var, eVar, kw7VarP3);
                                    l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                    rd7.d(bj4Var, dVar, ox6VarC3);
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    z4 = false;
                                    dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                    z5 = true;
                                    bj4Var.U(true);
                                    g2b g2bVar11111111111111113 = g2b.a;
                                }
                                bj4Var.U(z4);
                                z3 = z5;
                            } else {
                                ci4Var4 = ci4Var4;
                                if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                    bj4Var.K(861667097);
                                    bj4Var.U(false);
                                    defpackage.u.b();
                                    return;
                                }
                                bj4Var.K(943331838);
                                ox6 ox6VarM11111 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                bj4Var.K(861717389);
                                objF2 = bj4Var.f();
                                if (objF2 == c0187a) {
                                    z2 = false;
                                    objF2 = new w05(0 == true ? 1 : 0);
                                    bj4Var.C(objF2);
                                } else {
                                    z2 = false;
                                }
                                bj4Var.U(z2);
                                z3 = true;
                                bj4 bj4Var11112 = bj4Var;
                                mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM11111, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var11112, 1597824, 0, 262056);
                                bj4Var = bj4Var11112;
                                bj4Var.U(false);
                                g2b g2bVar11111111111111114 = g2b.a;
                            }
                        }
                        bj4Var.U(z3);
                        homeItemBadge4 = homeItemBadge3;
                        ox6Var8 = ox6Var7;
                        str6 = str3;
                        str7 = str4;
                        ox6Var9 = ox6Var5;
                        num7 = num6;
                        mh4Var4 = mh4Var3;
                        ci4Var5 = ci4Var4;
                        num8 = num5;
                    }
                    str5 = strF;
                    bj4VarO.U(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    ox6Var6 = ox6VarJ;
                    ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                    bj4Var = bj4VarO;
                    bj4Var.K(-1379221164);
                    if (str4 != null) {
                        mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                        bj4Var.K(941879891);
                        ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA2);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                        bj4Var.K(-1379205196);
                        if (num6 == null) {
                            ox6Var7 = ox6Var6;
                        } else {
                            ox6Var7 = ox6Var6;
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            g2b g2bVar11111111111111115 = g2b.a;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(false);
                        g2b g2bVar11111111111111116 = g2b.a;
                        ci4Var4 = ci4Var3;
                        z3 = true;
                    } else {
                        ox6Var7 = ox6Var6;
                        ci4Var4 = ci4Var3;
                        if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            bj4Var.K(942534549);
                            if (num6 == null) {
                                z5 = true;
                                z4 = false;
                            } else {
                                fl6VarD = dv0.d(di.a.a, false);
                                iHashCode3 = Long.hashCode(bj4Var.T);
                                kw7VarP3 = bj4Var.P();
                                ox6VarC3 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, fl6VarD);
                                rd7.d(bj4Var, eVar, kw7VarP3);
                                l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC3);
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                z4 = false;
                                dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                z5 = true;
                                bj4Var.U(true);
                                g2b g2bVar11111111111111117 = g2b.a;
                            }
                            bj4Var.U(z4);
                            z3 = z5;
                        } else {
                            ci4Var4 = ci4Var4;
                            if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                bj4Var.K(861667097);
                                bj4Var.U(false);
                                defpackage.u.b();
                                return;
                            }
                            bj4Var.K(943331838);
                            ox6 ox6VarM11112 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                            bj4Var.K(861717389);
                            objF2 = bj4Var.f();
                            if (objF2 == c0187a) {
                                z2 = false;
                                objF2 = new w05(0 == true ? 1 : 0);
                                bj4Var.C(objF2);
                            } else {
                                z2 = false;
                            }
                            bj4Var.U(z2);
                            z3 = true;
                            bj4 bj4Var11113 = bj4Var;
                            mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM11112, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var11113, 1597824, 0, 262056);
                            bj4Var = bj4Var11113;
                            bj4Var.U(false);
                            g2b g2bVar11111111111111118 = g2b.a;
                        }
                    }
                    bj4Var.U(z3);
                    homeItemBadge4 = homeItemBadge3;
                    ox6Var8 = ox6Var7;
                    str6 = str3;
                    str7 = str4;
                    ox6Var9 = ox6Var5;
                    num7 = num6;
                    mh4Var4 = mh4Var3;
                    ci4Var5 = ci4Var4;
                    num8 = num5;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: x05
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HomeItemKt.HomeItem$lambda$12(ox6Var9, num7, ci4Var5, ox6Var8, num8, str6, str7, homeItemBadge4, mh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            num4 = num2;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
                j1bVar = j1bVar2;
            } else {
                j1bVar = j1bVar2;
                if ((i & 196608) == 0) {
                    if (bj4VarO.J(str)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 64;
            if (i12 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (bj4VarO.J(str2)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i3 |= i13;
            }
            i14 = i2 & 128;
            i15 = 12582912;
            if (i14 == 0) {
                i3 |= i15;
            } else if ((i & 12582912) == 0) {
                if ((i & 16777216) == 0) {
                    zJ = bj4VarO.J(homeItemBadge);
                } else {
                    zJ = bj4VarO.j(homeItemBadge);
                }
                if (zJ) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i3 |= i15;
            }
            i16 = i2 & 256;
            if (i16 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (bj4VarO.j(mh4Var)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i3 |= i17;
            }
            if ((i3 & 38347923) == 38347922) {
                aVar = ox6.a.t;
                if (i20 != 0) {
                    ox6Var3 = aVar;
                }
                if (i21 != 0) {
                    num3 = null;
                }
                if (i4 != 0) {
                    ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                if (i6 != 0) {
                    ox6VarJ = ir9.j(aVar, 16.0f);
                } else {
                    ox6VarJ = ox6Var4;
                }
                if (i8 != 0) {
                    num4 = null;
                }
                if (i10 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i12 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i14 != 0) {
                    homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                } else {
                    homeItemBadge2 = homeItemBadge;
                }
                c0187a = jt1.a.a;
                if (i16 != 0) {
                    bj4VarO.K(-244016614);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new v05();
                        bj4VarO.C(objF3);
                    }
                    mh4Var2 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var2 = mh4Var;
                }
                ox6 ox6VarC116 = ir9.c(ox6Var3, 1.0f);
                bj4VarO.K(-244013531);
                if ((234881024 & i3) == 67108864) {
                    z = true;
                } else {
                    z = false;
                }
                objF = bj4VarO.f();
                if (z) {
                    objF = new gb3(2, mh4Var2);
                    bj4VarO.C(objF);
                } else {
                    objF = new gb3(2, mh4Var2);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                num5 = num4;
                ox6Var5 = ox6Var3;
                ox6 ox6VarJ113 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC116, false, null, (mh4) objF, 15));
                c30.j jVar112 = c30.a;
                bVar = di.a.k;
                ny8VarA = ly8.a(jVar112, bVar, bj4VarO, 48);
                i18 = i3;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarJ113);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, ny8VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf112 = Integer.valueOf(iHashCode);
                bVar2 = bt1.a.g;
                rd7.d(bj4VarO, bVar2, numValueOf112);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                mh4Var3 = mh4Var2;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                num6 = num3;
                qs5 qs5Var112 = new qs5(true, 2.0f);
                homeItemBadge3 = homeItemBadge2;
                aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, qs5Var112);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                bj4VarO.K(-1379228937);
                if (num5 != null) {
                    strF = nr1.f(bj4VarO, num5.intValue());
                } else {
                    if (str3 == null) {
                        strF = BuildConfig.FLAVOR;
                    } else {
                        str5 = str3;
                    }
                    bj4VarO.U(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    ox6Var6 = ox6VarJ;
                    ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                    bj4Var = bj4VarO;
                    bj4Var.K(-1379221164);
                    if (str4 != null) {
                        mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                        bj4Var.K(941879891);
                        ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA2);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                        bj4Var.K(-1379205196);
                        if (num6 == null) {
                            ox6Var7 = ox6Var6;
                        } else {
                            ox6Var7 = ox6Var6;
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            g2b g2bVar11111111111111119 = g2b.a;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(false);
                        g2b g2bVar111111111111111110 = g2b.a;
                        ci4Var4 = ci4Var3;
                        z3 = true;
                    } else {
                        ox6Var7 = ox6Var6;
                        ci4Var4 = ci4Var3;
                        if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            bj4Var.K(942534549);
                            if (num6 == null) {
                                z5 = true;
                                z4 = false;
                            } else {
                                fl6VarD = dv0.d(di.a.a, false);
                                iHashCode3 = Long.hashCode(bj4Var.T);
                                kw7VarP3 = bj4Var.P();
                                ox6VarC3 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, fl6VarD);
                                rd7.d(bj4Var, eVar, kw7VarP3);
                                l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC3);
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                z4 = false;
                                dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                z5 = true;
                                bj4Var.U(true);
                                g2b g2bVar111111111111111111 = g2b.a;
                            }
                            bj4Var.U(z4);
                            z3 = z5;
                        } else {
                            ci4Var4 = ci4Var4;
                            if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                bj4Var.K(861667097);
                                bj4Var.U(false);
                                defpackage.u.b();
                                return;
                            }
                            bj4Var.K(943331838);
                            ox6 ox6VarM11113 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                            bj4Var.K(861717389);
                            objF2 = bj4Var.f();
                            if (objF2 == c0187a) {
                                z2 = false;
                                objF2 = new w05(0 == true ? 1 : 0);
                                bj4Var.C(objF2);
                            } else {
                                z2 = false;
                            }
                            bj4Var.U(z2);
                            z3 = true;
                            bj4 bj4Var11114 = bj4Var;
                            mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM11113, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var11114, 1597824, 0, 262056);
                            bj4Var = bj4Var11114;
                            bj4Var.U(false);
                            g2b g2bVar111111111111111112 = g2b.a;
                        }
                    }
                    bj4Var.U(z3);
                    homeItemBadge4 = homeItemBadge3;
                    ox6Var8 = ox6Var7;
                    str6 = str3;
                    str7 = str4;
                    ox6Var9 = ox6Var5;
                    num7 = num6;
                    mh4Var4 = mh4Var3;
                    ci4Var5 = ci4Var4;
                    num8 = num5;
                }
                str5 = strF;
                bj4VarO.U(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i19 = IntercomTheme.$stable;
                ox6Var6 = ox6VarJ;
                ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                bj4Var = bj4VarO;
                bj4Var.K(-1379221164);
                if (str4 != null) {
                    mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                    bj4Var.K(941879891);
                    ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                    iHashCode4 = Long.hashCode(bj4Var.T);
                    kw7VarP4 = bj4Var.P();
                    ox6VarC4 = it1.c(bj4Var, aVar);
                    if (j1bVar != null) {
                        ml5.c();
                        throw null;
                    }
                    bj4Var.q();
                    if (bj4Var.S) {
                        bj4Var.k(aVar2);
                    } else {
                        bj4Var.z();
                    }
                    rd7.d(bj4Var, cVar, ny8VarA2);
                    rd7.d(bj4Var, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                    rd7.d(bj4Var, dVar, ox6VarC4);
                    ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                    bj4Var.K(-1379205196);
                    if (num6 == null) {
                        ox6Var7 = ox6Var6;
                    } else {
                        ox6Var7 = ox6Var6;
                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                        g2b g2bVar111111111111111113 = g2b.a;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(false);
                    g2b g2bVar111111111111111114 = g2b.a;
                    ci4Var4 = ci4Var3;
                    z3 = true;
                } else {
                    ox6Var7 = ox6Var6;
                    ci4Var4 = ci4Var3;
                    if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                        bj4Var.K(942534549);
                        if (num6 == null) {
                            z5 = true;
                            z4 = false;
                        } else {
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode3 = Long.hashCode(bj4Var.T);
                            kw7VarP3 = bj4Var.P();
                            ox6VarC3 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, fl6VarD);
                            rd7.d(bj4Var, eVar, kw7VarP3);
                            l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC3);
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            z4 = false;
                            dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                            z5 = true;
                            bj4Var.U(true);
                            g2b g2bVar111111111111111115 = g2b.a;
                        }
                        bj4Var.U(z4);
                        z3 = z5;
                    } else {
                        ci4Var4 = ci4Var4;
                        if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                            bj4Var.K(861667097);
                            bj4Var.U(false);
                            defpackage.u.b();
                            return;
                        }
                        bj4Var.K(943331838);
                        ox6 ox6VarM11114 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                        bj4Var.K(861717389);
                        objF2 = bj4Var.f();
                        if (objF2 == c0187a) {
                            z2 = false;
                            objF2 = new w05(0 == true ? 1 : 0);
                            bj4Var.C(objF2);
                        } else {
                            z2 = false;
                        }
                        bj4Var.U(z2);
                        z3 = true;
                        bj4 bj4Var11115 = bj4Var;
                        mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM11114, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var11115, 1597824, 0, 262056);
                        bj4Var = bj4Var11115;
                        bj4Var.U(false);
                        g2b g2bVar111111111111111116 = g2b.a;
                    }
                }
                bj4Var.U(z3);
                homeItemBadge4 = homeItemBadge3;
                ox6Var8 = ox6Var7;
                str6 = str3;
                str7 = str4;
                ox6Var9 = ox6Var5;
                num7 = num6;
                mh4Var4 = mh4Var3;
                ci4Var5 = ci4Var4;
                num8 = num5;
            } else {
                aVar = ox6.a.t;
                if (i20 != 0) {
                    ox6Var3 = aVar;
                }
                if (i21 != 0) {
                    num3 = null;
                }
                if (i4 != 0) {
                    ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                if (i6 != 0) {
                    ox6VarJ = ir9.j(aVar, 16.0f);
                } else {
                    ox6VarJ = ox6Var4;
                }
                if (i8 != 0) {
                    num4 = null;
                }
                if (i10 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i12 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i14 != 0) {
                    homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                } else {
                    homeItemBadge2 = homeItemBadge;
                }
                c0187a = jt1.a.a;
                if (i16 != 0) {
                    bj4VarO.K(-244016614);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new v05();
                        bj4VarO.C(objF3);
                    }
                    mh4Var2 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var2 = mh4Var;
                }
                ox6 ox6VarC117 = ir9.c(ox6Var3, 1.0f);
                bj4VarO.K(-244013531);
                if ((234881024 & i3) == 67108864) {
                    z = true;
                } else {
                    z = false;
                }
                objF = bj4VarO.f();
                if (z) {
                    objF = new gb3(2, mh4Var2);
                    bj4VarO.C(objF);
                } else {
                    objF = new gb3(2, mh4Var2);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                num5 = num4;
                ox6Var5 = ox6Var3;
                ox6 ox6VarJ114 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC117, false, null, (mh4) objF, 15));
                c30.j jVar113 = c30.a;
                bVar = di.a.k;
                ny8VarA = ly8.a(jVar113, bVar, bj4VarO, 48);
                i18 = i3;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarJ114);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, ny8VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf113 = Integer.valueOf(iHashCode);
                bVar2 = bt1.a.g;
                rd7.d(bj4VarO, bVar2, numValueOf113);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                mh4Var3 = mh4Var2;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                num6 = num3;
                qs5 qs5Var113 = new qs5(true, 2.0f);
                homeItemBadge3 = homeItemBadge2;
                aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, qs5Var113);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                bj4VarO.K(-1379228937);
                if (num5 != null) {
                    strF = nr1.f(bj4VarO, num5.intValue());
                } else {
                    if (str3 == null) {
                        strF = BuildConfig.FLAVOR;
                    } else {
                        str5 = str3;
                    }
                    bj4VarO.U(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    ox6Var6 = ox6VarJ;
                    ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                    bj4Var = bj4VarO;
                    bj4Var.K(-1379221164);
                    if (str4 != null) {
                        mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                        bj4Var.K(941879891);
                        ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA2);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                        bj4Var.K(-1379205196);
                        if (num6 == null) {
                            ox6Var7 = ox6Var6;
                        } else {
                            ox6Var7 = ox6Var6;
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            g2b g2bVar111111111111111117 = g2b.a;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(false);
                        g2b g2bVar111111111111111118 = g2b.a;
                        ci4Var4 = ci4Var3;
                        z3 = true;
                    } else {
                        ox6Var7 = ox6Var6;
                        ci4Var4 = ci4Var3;
                        if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            bj4Var.K(942534549);
                            if (num6 == null) {
                                z5 = true;
                                z4 = false;
                            } else {
                                fl6VarD = dv0.d(di.a.a, false);
                                iHashCode3 = Long.hashCode(bj4Var.T);
                                kw7VarP3 = bj4Var.P();
                                ox6VarC3 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, fl6VarD);
                                rd7.d(bj4Var, eVar, kw7VarP3);
                                l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC3);
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                z4 = false;
                                dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                z5 = true;
                                bj4Var.U(true);
                                g2b g2bVar111111111111111119 = g2b.a;
                            }
                            bj4Var.U(z4);
                            z3 = z5;
                        } else {
                            ci4Var4 = ci4Var4;
                            if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                bj4Var.K(861667097);
                                bj4Var.U(false);
                                defpackage.u.b();
                                return;
                            }
                            bj4Var.K(943331838);
                            ox6 ox6VarM11115 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                            bj4Var.K(861717389);
                            objF2 = bj4Var.f();
                            if (objF2 == c0187a) {
                                z2 = false;
                                objF2 = new w05(0 == true ? 1 : 0);
                                bj4Var.C(objF2);
                            } else {
                                z2 = false;
                            }
                            bj4Var.U(z2);
                            z3 = true;
                            bj4 bj4Var11116 = bj4Var;
                            mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM11115, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var11116, 1597824, 0, 262056);
                            bj4Var = bj4Var11116;
                            bj4Var.U(false);
                            g2b g2bVar1111111111111111110 = g2b.a;
                        }
                    }
                    bj4Var.U(z3);
                    homeItemBadge4 = homeItemBadge3;
                    ox6Var8 = ox6Var7;
                    str6 = str3;
                    str7 = str4;
                    ox6Var9 = ox6Var5;
                    num7 = num6;
                    mh4Var4 = mh4Var3;
                    ci4Var5 = ci4Var4;
                    num8 = num5;
                }
                str5 = strF;
                bj4VarO.U(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i19 = IntercomTheme.$stable;
                ox6Var6 = ox6VarJ;
                ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                bj4Var = bj4VarO;
                bj4Var.K(-1379221164);
                if (str4 != null) {
                    mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                    bj4Var.K(941879891);
                    ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                    iHashCode4 = Long.hashCode(bj4Var.T);
                    kw7VarP4 = bj4Var.P();
                    ox6VarC4 = it1.c(bj4Var, aVar);
                    if (j1bVar != null) {
                        ml5.c();
                        throw null;
                    }
                    bj4Var.q();
                    if (bj4Var.S) {
                        bj4Var.k(aVar2);
                    } else {
                        bj4Var.z();
                    }
                    rd7.d(bj4Var, cVar, ny8VarA2);
                    rd7.d(bj4Var, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                    rd7.d(bj4Var, dVar, ox6VarC4);
                    ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                    bj4Var.K(-1379205196);
                    if (num6 == null) {
                        ox6Var7 = ox6Var6;
                    } else {
                        ox6Var7 = ox6Var6;
                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                        g2b g2bVar1111111111111111111 = g2b.a;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(false);
                    g2b g2bVar1111111111111111112 = g2b.a;
                    ci4Var4 = ci4Var3;
                    z3 = true;
                } else {
                    ox6Var7 = ox6Var6;
                    ci4Var4 = ci4Var3;
                    if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                        bj4Var.K(942534549);
                        if (num6 == null) {
                            z5 = true;
                            z4 = false;
                        } else {
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode3 = Long.hashCode(bj4Var.T);
                            kw7VarP3 = bj4Var.P();
                            ox6VarC3 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, fl6VarD);
                            rd7.d(bj4Var, eVar, kw7VarP3);
                            l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC3);
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            z4 = false;
                            dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                            z5 = true;
                            bj4Var.U(true);
                            g2b g2bVar1111111111111111113 = g2b.a;
                        }
                        bj4Var.U(z4);
                        z3 = z5;
                    } else {
                        ci4Var4 = ci4Var4;
                        if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                            bj4Var.K(861667097);
                            bj4Var.U(false);
                            defpackage.u.b();
                            return;
                        }
                        bj4Var.K(943331838);
                        ox6 ox6VarM11116 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                        bj4Var.K(861717389);
                        objF2 = bj4Var.f();
                        if (objF2 == c0187a) {
                            z2 = false;
                            objF2 = new w05(0 == true ? 1 : 0);
                            bj4Var.C(objF2);
                        } else {
                            z2 = false;
                        }
                        bj4Var.U(z2);
                        z3 = true;
                        bj4 bj4Var11117 = bj4Var;
                        mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM11116, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var11117, 1597824, 0, 262056);
                        bj4Var = bj4Var11117;
                        bj4Var.U(false);
                        g2b g2bVar1111111111111111114 = g2b.a;
                    }
                }
                bj4Var.U(z3);
                homeItemBadge4 = homeItemBadge3;
                ox6Var8 = ox6Var7;
                str6 = str3;
                str7 = str4;
                ox6Var9 = ox6Var5;
                num7 = num6;
                mh4Var4 = mh4Var3;
                ci4Var5 = ci4Var4;
                num8 = num5;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: x05
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HomeItemKt.HomeItem$lambda$12(ox6Var9, num7, ci4Var5, ox6Var8, num8, str6, str7, homeItemBadge4, mh4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        ci4Var2 = ci4Var;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                ox6Var4 = ox6Var2;
                if (bj4VarO.J(ox6Var4)) {
                    i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    num4 = num2;
                    if (bj4VarO.J(num4)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                    j1bVar = j1bVar2;
                } else {
                    j1bVar = j1bVar2;
                    if ((i & 196608) == 0) {
                        if (bj4VarO.J(str)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (bj4VarO.J(str2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                i15 = 12582912;
                if (i14 == 0) {
                    i3 |= i15;
                } else if ((i & 12582912) == 0) {
                    if ((i & 16777216) == 0) {
                        zJ = bj4VarO.J(homeItemBadge);
                    } else {
                        zJ = bj4VarO.j(homeItemBadge);
                    }
                    if (zJ) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                i16 = i2 & 256;
                if (i16 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (bj4VarO.j(mh4Var)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i3 |= i17;
                }
                if ((i3 & 38347923) == 38347922) {
                    aVar = ox6.a.t;
                    if (i20 != 0) {
                        ox6Var3 = aVar;
                    }
                    if (i21 != 0) {
                        num3 = null;
                    }
                    if (i4 != 0) {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    if (i6 != 0) {
                        ox6VarJ = ir9.j(aVar, 16.0f);
                    } else {
                        ox6VarJ = ox6Var4;
                    }
                    if (i8 != 0) {
                        num4 = null;
                    }
                    if (i10 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i12 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                    } else {
                        homeItemBadge2 = homeItemBadge;
                    }
                    c0187a = jt1.a.a;
                    if (i16 != 0) {
                        bj4VarO.K(-244016614);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new v05();
                            bj4VarO.C(objF3);
                        }
                        mh4Var2 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    ox6 ox6VarC118 = ir9.c(ox6Var3, 1.0f);
                    bj4VarO.K(-244013531);
                    if ((234881024 & i3) == 67108864) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    } else {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    num5 = num4;
                    ox6Var5 = ox6Var3;
                    ox6 ox6VarJ115 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC118, false, null, (mh4) objF, 15));
                    c30.j jVar114 = c30.a;
                    bVar = di.a.k;
                    ny8VarA = ly8.a(jVar114, bVar, bj4VarO, 48);
                    i18 = i3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarJ115);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf114 = Integer.valueOf(iHashCode);
                    bVar2 = bt1.a.g;
                    rd7.d(bj4VarO, bVar2, numValueOf114);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    mh4Var3 = mh4Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    num6 = num3;
                    qs5 qs5Var114 = new qs5(true, 2.0f);
                    homeItemBadge3 = homeItemBadge2;
                    aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, qs5Var114);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    bj4VarO.K(-1379228937);
                    if (num5 != null) {
                        strF = nr1.f(bj4VarO, num5.intValue());
                    } else {
                        if (str3 == null) {
                            strF = BuildConfig.FLAVOR;
                        } else {
                            str5 = str3;
                        }
                        bj4VarO.U(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        ox6Var6 = ox6VarJ;
                        ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                        bj4Var = bj4VarO;
                        bj4Var.K(-1379221164);
                        if (str4 != null) {
                            mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                            bj4Var.K(941879891);
                            ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA2);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                            bj4Var.K(-1379205196);
                            if (num6 == null) {
                                ox6Var7 = ox6Var6;
                            } else {
                                ox6Var7 = ox6Var6;
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                g2b g2bVar1111111111111111115 = g2b.a;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.U(false);
                            g2b g2bVar1111111111111111116 = g2b.a;
                            ci4Var4 = ci4Var3;
                            z3 = true;
                        } else {
                            ox6Var7 = ox6Var6;
                            ci4Var4 = ci4Var3;
                            if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                bj4Var.K(942534549);
                                if (num6 == null) {
                                    z5 = true;
                                    z4 = false;
                                } else {
                                    fl6VarD = dv0.d(di.a.a, false);
                                    iHashCode3 = Long.hashCode(bj4Var.T);
                                    kw7VarP3 = bj4Var.P();
                                    ox6VarC3 = it1.c(bj4Var, aVar);
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4Var.q();
                                    if (bj4Var.S) {
                                        bj4Var.k(aVar2);
                                    } else {
                                        bj4Var.z();
                                    }
                                    rd7.d(bj4Var, cVar, fl6VarD);
                                    rd7.d(bj4Var, eVar, kw7VarP3);
                                    l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                    rd7.d(bj4Var, dVar, ox6VarC3);
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    z4 = false;
                                    dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                    z5 = true;
                                    bj4Var.U(true);
                                    g2b g2bVar1111111111111111117 = g2b.a;
                                }
                                bj4Var.U(z4);
                                z3 = z5;
                            } else {
                                ci4Var4 = ci4Var4;
                                if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                    bj4Var.K(861667097);
                                    bj4Var.U(false);
                                    defpackage.u.b();
                                    return;
                                }
                                bj4Var.K(943331838);
                                ox6 ox6VarM11117 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                bj4Var.K(861717389);
                                objF2 = bj4Var.f();
                                if (objF2 == c0187a) {
                                    z2 = false;
                                    objF2 = new w05(0 == true ? 1 : 0);
                                    bj4Var.C(objF2);
                                } else {
                                    z2 = false;
                                }
                                bj4Var.U(z2);
                                z3 = true;
                                bj4 bj4Var11118 = bj4Var;
                                mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM11117, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var11118, 1597824, 0, 262056);
                                bj4Var = bj4Var11118;
                                bj4Var.U(false);
                                g2b g2bVar1111111111111111118 = g2b.a;
                            }
                        }
                        bj4Var.U(z3);
                        homeItemBadge4 = homeItemBadge3;
                        ox6Var8 = ox6Var7;
                        str6 = str3;
                        str7 = str4;
                        ox6Var9 = ox6Var5;
                        num7 = num6;
                        mh4Var4 = mh4Var3;
                        ci4Var5 = ci4Var4;
                        num8 = num5;
                    }
                    str5 = strF;
                    bj4VarO.U(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    ox6Var6 = ox6VarJ;
                    ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                    bj4Var = bj4VarO;
                    bj4Var.K(-1379221164);
                    if (str4 != null) {
                        mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                        bj4Var.K(941879891);
                        ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA2);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                        bj4Var.K(-1379205196);
                        if (num6 == null) {
                            ox6Var7 = ox6Var6;
                        } else {
                            ox6Var7 = ox6Var6;
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            g2b g2bVar1111111111111111119 = g2b.a;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(false);
                        g2b g2bVar11111111111111111110 = g2b.a;
                        ci4Var4 = ci4Var3;
                        z3 = true;
                    } else {
                        ox6Var7 = ox6Var6;
                        ci4Var4 = ci4Var3;
                        if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            bj4Var.K(942534549);
                            if (num6 == null) {
                                z5 = true;
                                z4 = false;
                            } else {
                                fl6VarD = dv0.d(di.a.a, false);
                                iHashCode3 = Long.hashCode(bj4Var.T);
                                kw7VarP3 = bj4Var.P();
                                ox6VarC3 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, fl6VarD);
                                rd7.d(bj4Var, eVar, kw7VarP3);
                                l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC3);
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                z4 = false;
                                dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                z5 = true;
                                bj4Var.U(true);
                                g2b g2bVar11111111111111111111 = g2b.a;
                            }
                            bj4Var.U(z4);
                            z3 = z5;
                        } else {
                            ci4Var4 = ci4Var4;
                            if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                bj4Var.K(861667097);
                                bj4Var.U(false);
                                defpackage.u.b();
                                return;
                            }
                            bj4Var.K(943331838);
                            ox6 ox6VarM11118 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                            bj4Var.K(861717389);
                            objF2 = bj4Var.f();
                            if (objF2 == c0187a) {
                                z2 = false;
                                objF2 = new w05(0 == true ? 1 : 0);
                                bj4Var.C(objF2);
                            } else {
                                z2 = false;
                            }
                            bj4Var.U(z2);
                            z3 = true;
                            bj4 bj4Var11119 = bj4Var;
                            mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM11118, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var11119, 1597824, 0, 262056);
                            bj4Var = bj4Var11119;
                            bj4Var.U(false);
                            g2b g2bVar11111111111111111112 = g2b.a;
                        }
                    }
                    bj4Var.U(z3);
                    homeItemBadge4 = homeItemBadge3;
                    ox6Var8 = ox6Var7;
                    str6 = str3;
                    str7 = str4;
                    ox6Var9 = ox6Var5;
                    num7 = num6;
                    mh4Var4 = mh4Var3;
                    ci4Var5 = ci4Var4;
                    num8 = num5;
                } else {
                    aVar = ox6.a.t;
                    if (i20 != 0) {
                        ox6Var3 = aVar;
                    }
                    if (i21 != 0) {
                        num3 = null;
                    }
                    if (i4 != 0) {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    if (i6 != 0) {
                        ox6VarJ = ir9.j(aVar, 16.0f);
                    } else {
                        ox6VarJ = ox6Var4;
                    }
                    if (i8 != 0) {
                        num4 = null;
                    }
                    if (i10 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i12 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                    } else {
                        homeItemBadge2 = homeItemBadge;
                    }
                    c0187a = jt1.a.a;
                    if (i16 != 0) {
                        bj4VarO.K(-244016614);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new v05();
                            bj4VarO.C(objF3);
                        }
                        mh4Var2 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    ox6 ox6VarC119 = ir9.c(ox6Var3, 1.0f);
                    bj4VarO.K(-244013531);
                    if ((234881024 & i3) == 67108864) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    } else {
                        objF = new gb3(2, mh4Var2);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    num5 = num4;
                    ox6Var5 = ox6Var3;
                    ox6 ox6VarJ116 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC119, false, null, (mh4) objF, 15));
                    c30.j jVar115 = c30.a;
                    bVar = di.a.k;
                    ny8VarA = ly8.a(jVar115, bVar, bj4VarO, 48);
                    i18 = i3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarJ116);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf115 = Integer.valueOf(iHashCode);
                    bVar2 = bt1.a.g;
                    rd7.d(bj4VarO, bVar2, numValueOf115);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    mh4Var3 = mh4Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    num6 = num3;
                    qs5 qs5Var115 = new qs5(true, 2.0f);
                    homeItemBadge3 = homeItemBadge2;
                    aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, qs5Var115);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    bj4VarO.K(-1379228937);
                    if (num5 != null) {
                        strF = nr1.f(bj4VarO, num5.intValue());
                    } else {
                        if (str3 == null) {
                            strF = BuildConfig.FLAVOR;
                        } else {
                            str5 = str3;
                        }
                        bj4VarO.U(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        ox6Var6 = ox6VarJ;
                        ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                        bj4Var = bj4VarO;
                        bj4Var.K(-1379221164);
                        if (str4 != null) {
                            mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                            bj4Var.K(941879891);
                            ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                            iHashCode4 = Long.hashCode(bj4Var.T);
                            kw7VarP4 = bj4Var.P();
                            ox6VarC4 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, ny8VarA2);
                            rd7.d(bj4Var, eVar, kw7VarP4);
                            l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC4);
                            ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                            bj4Var.K(-1379205196);
                            if (num6 == null) {
                                ox6Var7 = ox6Var6;
                            } else {
                                ox6Var7 = ox6Var6;
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                g2b g2bVar11111111111111111113 = g2b.a;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.U(false);
                            g2b g2bVar11111111111111111114 = g2b.a;
                            ci4Var4 = ci4Var3;
                            z3 = true;
                        } else {
                            ox6Var7 = ox6Var6;
                            ci4Var4 = ci4Var3;
                            if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                bj4Var.K(942534549);
                                if (num6 == null) {
                                    z5 = true;
                                    z4 = false;
                                } else {
                                    fl6VarD = dv0.d(di.a.a, false);
                                    iHashCode3 = Long.hashCode(bj4Var.T);
                                    kw7VarP3 = bj4Var.P();
                                    ox6VarC3 = it1.c(bj4Var, aVar);
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4Var.q();
                                    if (bj4Var.S) {
                                        bj4Var.k(aVar2);
                                    } else {
                                        bj4Var.z();
                                    }
                                    rd7.d(bj4Var, cVar, fl6VarD);
                                    rd7.d(bj4Var, eVar, kw7VarP3);
                                    l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                    rd7.d(bj4Var, dVar, ox6VarC3);
                                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                    z4 = false;
                                    dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                    z5 = true;
                                    bj4Var.U(true);
                                    g2b g2bVar11111111111111111115 = g2b.a;
                                }
                                bj4Var.U(z4);
                                z3 = z5;
                            } else {
                                ci4Var4 = ci4Var4;
                                if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                    bj4Var.K(861667097);
                                    bj4Var.U(false);
                                    defpackage.u.b();
                                    return;
                                }
                                bj4Var.K(943331838);
                                ox6 ox6VarM11119 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                                bj4Var.K(861717389);
                                objF2 = bj4Var.f();
                                if (objF2 == c0187a) {
                                    z2 = false;
                                    objF2 = new w05(0 == true ? 1 : 0);
                                    bj4Var.C(objF2);
                                } else {
                                    z2 = false;
                                }
                                bj4Var.U(z2);
                                z3 = true;
                                bj4 bj4Var111110 = bj4Var;
                                mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM11119, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var111110, 1597824, 0, 262056);
                                bj4Var = bj4Var111110;
                                bj4Var.U(false);
                                g2b g2bVar11111111111111111116 = g2b.a;
                            }
                        }
                        bj4Var.U(z3);
                        homeItemBadge4 = homeItemBadge3;
                        ox6Var8 = ox6Var7;
                        str6 = str3;
                        str7 = str4;
                        ox6Var9 = ox6Var5;
                        num7 = num6;
                        mh4Var4 = mh4Var3;
                        ci4Var5 = ci4Var4;
                        num8 = num5;
                    }
                    str5 = strF;
                    bj4VarO.U(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    ox6Var6 = ox6VarJ;
                    ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                    bj4Var = bj4VarO;
                    bj4Var.K(-1379221164);
                    if (str4 != null) {
                        mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                        bj4Var.K(941879891);
                        ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA2);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                        bj4Var.K(-1379205196);
                        if (num6 == null) {
                            ox6Var7 = ox6Var6;
                        } else {
                            ox6Var7 = ox6Var6;
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            g2b g2bVar11111111111111111117 = g2b.a;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(false);
                        g2b g2bVar11111111111111111118 = g2b.a;
                        ci4Var4 = ci4Var3;
                        z3 = true;
                    } else {
                        ox6Var7 = ox6Var6;
                        ci4Var4 = ci4Var3;
                        if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            bj4Var.K(942534549);
                            if (num6 == null) {
                                z5 = true;
                                z4 = false;
                            } else {
                                fl6VarD = dv0.d(di.a.a, false);
                                iHashCode3 = Long.hashCode(bj4Var.T);
                                kw7VarP3 = bj4Var.P();
                                ox6VarC3 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, fl6VarD);
                                rd7.d(bj4Var, eVar, kw7VarP3);
                                l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC3);
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                z4 = false;
                                dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                z5 = true;
                                bj4Var.U(true);
                                g2b g2bVar11111111111111111119 = g2b.a;
                            }
                            bj4Var.U(z4);
                            z3 = z5;
                        } else {
                            ci4Var4 = ci4Var4;
                            if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                bj4Var.K(861667097);
                                bj4Var.U(false);
                                defpackage.u.b();
                                return;
                            }
                            bj4Var.K(943331838);
                            ox6 ox6VarM111110 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                            bj4Var.K(861717389);
                            objF2 = bj4Var.f();
                            if (objF2 == c0187a) {
                                z2 = false;
                                objF2 = new w05(0 == true ? 1 : 0);
                                bj4Var.C(objF2);
                            } else {
                                z2 = false;
                            }
                            bj4Var.U(z2);
                            z3 = true;
                            bj4 bj4Var111111 = bj4Var;
                            mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM111110, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var111111, 1597824, 0, 262056);
                            bj4Var = bj4Var111111;
                            bj4Var.U(false);
                            g2b g2bVar111111111111111111110 = g2b.a;
                        }
                    }
                    bj4Var.U(z3);
                    homeItemBadge4 = homeItemBadge3;
                    ox6Var8 = ox6Var7;
                    str6 = str3;
                    str7 = str4;
                    ox6Var9 = ox6Var5;
                    num7 = num6;
                    mh4Var4 = mh4Var3;
                    ci4Var5 = ci4Var4;
                    num8 = num5;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: x05
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HomeItemKt.HomeItem$lambda$12(ox6Var9, num7, ci4Var5, ox6Var8, num8, str6, str7, homeItemBadge4, mh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            num4 = num2;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
                j1bVar = j1bVar2;
            } else {
                j1bVar = j1bVar2;
                if ((i & 196608) == 0) {
                    if (bj4VarO.J(str)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 64;
            if (i12 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (bj4VarO.J(str2)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i3 |= i13;
            }
            i14 = i2 & 128;
            i15 = 12582912;
            if (i14 == 0) {
                i3 |= i15;
            } else if ((i & 12582912) == 0) {
                if ((i & 16777216) == 0) {
                    zJ = bj4VarO.J(homeItemBadge);
                } else {
                    zJ = bj4VarO.j(homeItemBadge);
                }
                if (zJ) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i3 |= i15;
            }
            i16 = i2 & 256;
            if (i16 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (bj4VarO.j(mh4Var)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i3 |= i17;
            }
            if ((i3 & 38347923) == 38347922) {
                aVar = ox6.a.t;
                if (i20 != 0) {
                    ox6Var3 = aVar;
                }
                if (i21 != 0) {
                    num3 = null;
                }
                if (i4 != 0) {
                    ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                if (i6 != 0) {
                    ox6VarJ = ir9.j(aVar, 16.0f);
                } else {
                    ox6VarJ = ox6Var4;
                }
                if (i8 != 0) {
                    num4 = null;
                }
                if (i10 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i12 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i14 != 0) {
                    homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                } else {
                    homeItemBadge2 = homeItemBadge;
                }
                c0187a = jt1.a.a;
                if (i16 != 0) {
                    bj4VarO.K(-244016614);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new v05();
                        bj4VarO.C(objF3);
                    }
                    mh4Var2 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var2 = mh4Var;
                }
                ox6 ox6VarC1110 = ir9.c(ox6Var3, 1.0f);
                bj4VarO.K(-244013531);
                if ((234881024 & i3) == 67108864) {
                    z = true;
                } else {
                    z = false;
                }
                objF = bj4VarO.f();
                if (z) {
                    objF = new gb3(2, mh4Var2);
                    bj4VarO.C(objF);
                } else {
                    objF = new gb3(2, mh4Var2);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                num5 = num4;
                ox6Var5 = ox6Var3;
                ox6 ox6VarJ117 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC1110, false, null, (mh4) objF, 15));
                c30.j jVar116 = c30.a;
                bVar = di.a.k;
                ny8VarA = ly8.a(jVar116, bVar, bj4VarO, 48);
                i18 = i3;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarJ117);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, ny8VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf116 = Integer.valueOf(iHashCode);
                bVar2 = bt1.a.g;
                rd7.d(bj4VarO, bVar2, numValueOf116);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                mh4Var3 = mh4Var2;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                num6 = num3;
                qs5 qs5Var116 = new qs5(true, 2.0f);
                homeItemBadge3 = homeItemBadge2;
                aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, qs5Var116);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                bj4VarO.K(-1379228937);
                if (num5 != null) {
                    strF = nr1.f(bj4VarO, num5.intValue());
                } else {
                    if (str3 == null) {
                        strF = BuildConfig.FLAVOR;
                    } else {
                        str5 = str3;
                    }
                    bj4VarO.U(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    ox6Var6 = ox6VarJ;
                    ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                    bj4Var = bj4VarO;
                    bj4Var.K(-1379221164);
                    if (str4 != null) {
                        mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                        bj4Var.K(941879891);
                        ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA2);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                        bj4Var.K(-1379205196);
                        if (num6 == null) {
                            ox6Var7 = ox6Var6;
                        } else {
                            ox6Var7 = ox6Var6;
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            g2b g2bVar111111111111111111111 = g2b.a;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(false);
                        g2b g2bVar111111111111111111112 = g2b.a;
                        ci4Var4 = ci4Var3;
                        z3 = true;
                    } else {
                        ox6Var7 = ox6Var6;
                        ci4Var4 = ci4Var3;
                        if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            bj4Var.K(942534549);
                            if (num6 == null) {
                                z5 = true;
                                z4 = false;
                            } else {
                                fl6VarD = dv0.d(di.a.a, false);
                                iHashCode3 = Long.hashCode(bj4Var.T);
                                kw7VarP3 = bj4Var.P();
                                ox6VarC3 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, fl6VarD);
                                rd7.d(bj4Var, eVar, kw7VarP3);
                                l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC3);
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                z4 = false;
                                dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                z5 = true;
                                bj4Var.U(true);
                                g2b g2bVar111111111111111111113 = g2b.a;
                            }
                            bj4Var.U(z4);
                            z3 = z5;
                        } else {
                            ci4Var4 = ci4Var4;
                            if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                bj4Var.K(861667097);
                                bj4Var.U(false);
                                defpackage.u.b();
                                return;
                            }
                            bj4Var.K(943331838);
                            ox6 ox6VarM111111 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                            bj4Var.K(861717389);
                            objF2 = bj4Var.f();
                            if (objF2 == c0187a) {
                                z2 = false;
                                objF2 = new w05(0 == true ? 1 : 0);
                                bj4Var.C(objF2);
                            } else {
                                z2 = false;
                            }
                            bj4Var.U(z2);
                            z3 = true;
                            bj4 bj4Var111112 = bj4Var;
                            mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM111111, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var111112, 1597824, 0, 262056);
                            bj4Var = bj4Var111112;
                            bj4Var.U(false);
                            g2b g2bVar111111111111111111114 = g2b.a;
                        }
                    }
                    bj4Var.U(z3);
                    homeItemBadge4 = homeItemBadge3;
                    ox6Var8 = ox6Var7;
                    str6 = str3;
                    str7 = str4;
                    ox6Var9 = ox6Var5;
                    num7 = num6;
                    mh4Var4 = mh4Var3;
                    ci4Var5 = ci4Var4;
                    num8 = num5;
                }
                str5 = strF;
                bj4VarO.U(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i19 = IntercomTheme.$stable;
                ox6Var6 = ox6VarJ;
                ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                bj4Var = bj4VarO;
                bj4Var.K(-1379221164);
                if (str4 != null) {
                    mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                    bj4Var.K(941879891);
                    ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                    iHashCode4 = Long.hashCode(bj4Var.T);
                    kw7VarP4 = bj4Var.P();
                    ox6VarC4 = it1.c(bj4Var, aVar);
                    if (j1bVar != null) {
                        ml5.c();
                        throw null;
                    }
                    bj4Var.q();
                    if (bj4Var.S) {
                        bj4Var.k(aVar2);
                    } else {
                        bj4Var.z();
                    }
                    rd7.d(bj4Var, cVar, ny8VarA2);
                    rd7.d(bj4Var, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                    rd7.d(bj4Var, dVar, ox6VarC4);
                    ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                    bj4Var.K(-1379205196);
                    if (num6 == null) {
                        ox6Var7 = ox6Var6;
                    } else {
                        ox6Var7 = ox6Var6;
                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                        g2b g2bVar111111111111111111115 = g2b.a;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(false);
                    g2b g2bVar111111111111111111116 = g2b.a;
                    ci4Var4 = ci4Var3;
                    z3 = true;
                } else {
                    ox6Var7 = ox6Var6;
                    ci4Var4 = ci4Var3;
                    if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                        bj4Var.K(942534549);
                        if (num6 == null) {
                            z5 = true;
                            z4 = false;
                        } else {
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode3 = Long.hashCode(bj4Var.T);
                            kw7VarP3 = bj4Var.P();
                            ox6VarC3 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, fl6VarD);
                            rd7.d(bj4Var, eVar, kw7VarP3);
                            l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC3);
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            z4 = false;
                            dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                            z5 = true;
                            bj4Var.U(true);
                            g2b g2bVar111111111111111111117 = g2b.a;
                        }
                        bj4Var.U(z4);
                        z3 = z5;
                    } else {
                        ci4Var4 = ci4Var4;
                        if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                            bj4Var.K(861667097);
                            bj4Var.U(false);
                            defpackage.u.b();
                            return;
                        }
                        bj4Var.K(943331838);
                        ox6 ox6VarM111112 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                        bj4Var.K(861717389);
                        objF2 = bj4Var.f();
                        if (objF2 == c0187a) {
                            z2 = false;
                            objF2 = new w05(0 == true ? 1 : 0);
                            bj4Var.C(objF2);
                        } else {
                            z2 = false;
                        }
                        bj4Var.U(z2);
                        z3 = true;
                        bj4 bj4Var111113 = bj4Var;
                        mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM111112, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var111113, 1597824, 0, 262056);
                        bj4Var = bj4Var111113;
                        bj4Var.U(false);
                        g2b g2bVar111111111111111111118 = g2b.a;
                    }
                }
                bj4Var.U(z3);
                homeItemBadge4 = homeItemBadge3;
                ox6Var8 = ox6Var7;
                str6 = str3;
                str7 = str4;
                ox6Var9 = ox6Var5;
                num7 = num6;
                mh4Var4 = mh4Var3;
                ci4Var5 = ci4Var4;
                num8 = num5;
            } else {
                aVar = ox6.a.t;
                if (i20 != 0) {
                    ox6Var3 = aVar;
                }
                if (i21 != 0) {
                    num3 = null;
                }
                if (i4 != 0) {
                    ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                if (i6 != 0) {
                    ox6VarJ = ir9.j(aVar, 16.0f);
                } else {
                    ox6VarJ = ox6Var4;
                }
                if (i8 != 0) {
                    num4 = null;
                }
                if (i10 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i12 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i14 != 0) {
                    homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                } else {
                    homeItemBadge2 = homeItemBadge;
                }
                c0187a = jt1.a.a;
                if (i16 != 0) {
                    bj4VarO.K(-244016614);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new v05();
                        bj4VarO.C(objF3);
                    }
                    mh4Var2 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var2 = mh4Var;
                }
                ox6 ox6VarC1111 = ir9.c(ox6Var3, 1.0f);
                bj4VarO.K(-244013531);
                if ((234881024 & i3) == 67108864) {
                    z = true;
                } else {
                    z = false;
                }
                objF = bj4VarO.f();
                if (z) {
                    objF = new gb3(2, mh4Var2);
                    bj4VarO.C(objF);
                } else {
                    objF = new gb3(2, mh4Var2);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                num5 = num4;
                ox6Var5 = ox6Var3;
                ox6 ox6VarJ118 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC1111, false, null, (mh4) objF, 15));
                c30.j jVar117 = c30.a;
                bVar = di.a.k;
                ny8VarA = ly8.a(jVar117, bVar, bj4VarO, 48);
                i18 = i3;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarJ118);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, ny8VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf117 = Integer.valueOf(iHashCode);
                bVar2 = bt1.a.g;
                rd7.d(bj4VarO, bVar2, numValueOf117);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                mh4Var3 = mh4Var2;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                num6 = num3;
                qs5 qs5Var117 = new qs5(true, 2.0f);
                homeItemBadge3 = homeItemBadge2;
                aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, qs5Var117);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                bj4VarO.K(-1379228937);
                if (num5 != null) {
                    strF = nr1.f(bj4VarO, num5.intValue());
                } else {
                    if (str3 == null) {
                        strF = BuildConfig.FLAVOR;
                    } else {
                        str5 = str3;
                    }
                    bj4VarO.U(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    ox6Var6 = ox6VarJ;
                    ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                    bj4Var = bj4VarO;
                    bj4Var.K(-1379221164);
                    if (str4 != null) {
                        mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                        bj4Var.K(941879891);
                        ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA2);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                        bj4Var.K(-1379205196);
                        if (num6 == null) {
                            ox6Var7 = ox6Var6;
                        } else {
                            ox6Var7 = ox6Var6;
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            g2b g2bVar111111111111111111119 = g2b.a;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(false);
                        g2b g2bVar1111111111111111111110 = g2b.a;
                        ci4Var4 = ci4Var3;
                        z3 = true;
                    } else {
                        ox6Var7 = ox6Var6;
                        ci4Var4 = ci4Var3;
                        if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            bj4Var.K(942534549);
                            if (num6 == null) {
                                z5 = true;
                                z4 = false;
                            } else {
                                fl6VarD = dv0.d(di.a.a, false);
                                iHashCode3 = Long.hashCode(bj4Var.T);
                                kw7VarP3 = bj4Var.P();
                                ox6VarC3 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, fl6VarD);
                                rd7.d(bj4Var, eVar, kw7VarP3);
                                l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC3);
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                z4 = false;
                                dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                z5 = true;
                                bj4Var.U(true);
                                g2b g2bVar1111111111111111111111 = g2b.a;
                            }
                            bj4Var.U(z4);
                            z3 = z5;
                        } else {
                            ci4Var4 = ci4Var4;
                            if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                bj4Var.K(861667097);
                                bj4Var.U(false);
                                defpackage.u.b();
                                return;
                            }
                            bj4Var.K(943331838);
                            ox6 ox6VarM111113 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                            bj4Var.K(861717389);
                            objF2 = bj4Var.f();
                            if (objF2 == c0187a) {
                                z2 = false;
                                objF2 = new w05(0 == true ? 1 : 0);
                                bj4Var.C(objF2);
                            } else {
                                z2 = false;
                            }
                            bj4Var.U(z2);
                            z3 = true;
                            bj4 bj4Var111114 = bj4Var;
                            mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM111113, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var111114, 1597824, 0, 262056);
                            bj4Var = bj4Var111114;
                            bj4Var.U(false);
                            g2b g2bVar1111111111111111111112 = g2b.a;
                        }
                    }
                    bj4Var.U(z3);
                    homeItemBadge4 = homeItemBadge3;
                    ox6Var8 = ox6Var7;
                    str6 = str3;
                    str7 = str4;
                    ox6Var9 = ox6Var5;
                    num7 = num6;
                    mh4Var4 = mh4Var3;
                    ci4Var5 = ci4Var4;
                    num8 = num5;
                }
                str5 = strF;
                bj4VarO.U(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i19 = IntercomTheme.$stable;
                ox6Var6 = ox6VarJ;
                ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                bj4Var = bj4VarO;
                bj4Var.K(-1379221164);
                if (str4 != null) {
                    mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                    bj4Var.K(941879891);
                    ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                    iHashCode4 = Long.hashCode(bj4Var.T);
                    kw7VarP4 = bj4Var.P();
                    ox6VarC4 = it1.c(bj4Var, aVar);
                    if (j1bVar != null) {
                        ml5.c();
                        throw null;
                    }
                    bj4Var.q();
                    if (bj4Var.S) {
                        bj4Var.k(aVar2);
                    } else {
                        bj4Var.z();
                    }
                    rd7.d(bj4Var, cVar, ny8VarA2);
                    rd7.d(bj4Var, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                    rd7.d(bj4Var, dVar, ox6VarC4);
                    ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                    bj4Var.K(-1379205196);
                    if (num6 == null) {
                        ox6Var7 = ox6Var6;
                    } else {
                        ox6Var7 = ox6Var6;
                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                        g2b g2bVar1111111111111111111113 = g2b.a;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(false);
                    g2b g2bVar1111111111111111111114 = g2b.a;
                    ci4Var4 = ci4Var3;
                    z3 = true;
                } else {
                    ox6Var7 = ox6Var6;
                    ci4Var4 = ci4Var3;
                    if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                        bj4Var.K(942534549);
                        if (num6 == null) {
                            z5 = true;
                            z4 = false;
                        } else {
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode3 = Long.hashCode(bj4Var.T);
                            kw7VarP3 = bj4Var.P();
                            ox6VarC3 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, fl6VarD);
                            rd7.d(bj4Var, eVar, kw7VarP3);
                            l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC3);
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            z4 = false;
                            dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                            z5 = true;
                            bj4Var.U(true);
                            g2b g2bVar1111111111111111111115 = g2b.a;
                        }
                        bj4Var.U(z4);
                        z3 = z5;
                    } else {
                        ci4Var4 = ci4Var4;
                        if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                            bj4Var.K(861667097);
                            bj4Var.U(false);
                            defpackage.u.b();
                            return;
                        }
                        bj4Var.K(943331838);
                        ox6 ox6VarM111114 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                        bj4Var.K(861717389);
                        objF2 = bj4Var.f();
                        if (objF2 == c0187a) {
                            z2 = false;
                            objF2 = new w05(0 == true ? 1 : 0);
                            bj4Var.C(objF2);
                        } else {
                            z2 = false;
                        }
                        bj4Var.U(z2);
                        z3 = true;
                        bj4 bj4Var111115 = bj4Var;
                        mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM111114, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var111115, 1597824, 0, 262056);
                        bj4Var = bj4Var111115;
                        bj4Var.U(false);
                        g2b g2bVar1111111111111111111116 = g2b.a;
                    }
                }
                bj4Var.U(z3);
                homeItemBadge4 = homeItemBadge3;
                ox6Var8 = ox6Var7;
                str6 = str3;
                str7 = str4;
                ox6Var9 = ox6Var5;
                num7 = num6;
                mh4Var4 = mh4Var3;
                ci4Var5 = ci4Var4;
                num8 = num5;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: x05
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HomeItemKt.HomeItem$lambda$12(ox6Var9, num7, ci4Var5, ox6Var8, num8, str6, str7, homeItemBadge4, mh4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        ox6Var4 = ox6Var2;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                num4 = num2;
                if (bj4VarO.J(num4)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
                j1bVar = j1bVar2;
            } else {
                j1bVar = j1bVar2;
                if ((i & 196608) == 0) {
                    if (bj4VarO.J(str)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 64;
            if (i12 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (bj4VarO.J(str2)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i3 |= i13;
            }
            i14 = i2 & 128;
            i15 = 12582912;
            if (i14 == 0) {
                i3 |= i15;
            } else if ((i & 12582912) == 0) {
                if ((i & 16777216) == 0) {
                    zJ = bj4VarO.J(homeItemBadge);
                } else {
                    zJ = bj4VarO.j(homeItemBadge);
                }
                if (zJ) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i3 |= i15;
            }
            i16 = i2 & 256;
            if (i16 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (bj4VarO.j(mh4Var)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i3 |= i17;
            }
            if ((i3 & 38347923) == 38347922) {
                aVar = ox6.a.t;
                if (i20 != 0) {
                    ox6Var3 = aVar;
                }
                if (i21 != 0) {
                    num3 = null;
                }
                if (i4 != 0) {
                    ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                if (i6 != 0) {
                    ox6VarJ = ir9.j(aVar, 16.0f);
                } else {
                    ox6VarJ = ox6Var4;
                }
                if (i8 != 0) {
                    num4 = null;
                }
                if (i10 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i12 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i14 != 0) {
                    homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                } else {
                    homeItemBadge2 = homeItemBadge;
                }
                c0187a = jt1.a.a;
                if (i16 != 0) {
                    bj4VarO.K(-244016614);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new v05();
                        bj4VarO.C(objF3);
                    }
                    mh4Var2 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var2 = mh4Var;
                }
                ox6 ox6VarC1112 = ir9.c(ox6Var3, 1.0f);
                bj4VarO.K(-244013531);
                if ((234881024 & i3) == 67108864) {
                    z = true;
                } else {
                    z = false;
                }
                objF = bj4VarO.f();
                if (z) {
                    objF = new gb3(2, mh4Var2);
                    bj4VarO.C(objF);
                } else {
                    objF = new gb3(2, mh4Var2);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                num5 = num4;
                ox6Var5 = ox6Var3;
                ox6 ox6VarJ119 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC1112, false, null, (mh4) objF, 15));
                c30.j jVar118 = c30.a;
                bVar = di.a.k;
                ny8VarA = ly8.a(jVar118, bVar, bj4VarO, 48);
                i18 = i3;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarJ119);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, ny8VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf118 = Integer.valueOf(iHashCode);
                bVar2 = bt1.a.g;
                rd7.d(bj4VarO, bVar2, numValueOf118);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                mh4Var3 = mh4Var2;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                num6 = num3;
                qs5 qs5Var118 = new qs5(true, 2.0f);
                homeItemBadge3 = homeItemBadge2;
                aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, qs5Var118);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                bj4VarO.K(-1379228937);
                if (num5 != null) {
                    strF = nr1.f(bj4VarO, num5.intValue());
                } else {
                    if (str3 == null) {
                        strF = BuildConfig.FLAVOR;
                    } else {
                        str5 = str3;
                    }
                    bj4VarO.U(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    ox6Var6 = ox6VarJ;
                    ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                    bj4Var = bj4VarO;
                    bj4Var.K(-1379221164);
                    if (str4 != null) {
                        mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                        bj4Var.K(941879891);
                        ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA2);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                        bj4Var.K(-1379205196);
                        if (num6 == null) {
                            ox6Var7 = ox6Var6;
                        } else {
                            ox6Var7 = ox6Var6;
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            g2b g2bVar1111111111111111111117 = g2b.a;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(false);
                        g2b g2bVar1111111111111111111118 = g2b.a;
                        ci4Var4 = ci4Var3;
                        z3 = true;
                    } else {
                        ox6Var7 = ox6Var6;
                        ci4Var4 = ci4Var3;
                        if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            bj4Var.K(942534549);
                            if (num6 == null) {
                                z5 = true;
                                z4 = false;
                            } else {
                                fl6VarD = dv0.d(di.a.a, false);
                                iHashCode3 = Long.hashCode(bj4Var.T);
                                kw7VarP3 = bj4Var.P();
                                ox6VarC3 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, fl6VarD);
                                rd7.d(bj4Var, eVar, kw7VarP3);
                                l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC3);
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                z4 = false;
                                dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                z5 = true;
                                bj4Var.U(true);
                                g2b g2bVar1111111111111111111119 = g2b.a;
                            }
                            bj4Var.U(z4);
                            z3 = z5;
                        } else {
                            ci4Var4 = ci4Var4;
                            if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                bj4Var.K(861667097);
                                bj4Var.U(false);
                                defpackage.u.b();
                                return;
                            }
                            bj4Var.K(943331838);
                            ox6 ox6VarM111115 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                            bj4Var.K(861717389);
                            objF2 = bj4Var.f();
                            if (objF2 == c0187a) {
                                z2 = false;
                                objF2 = new w05(0 == true ? 1 : 0);
                                bj4Var.C(objF2);
                            } else {
                                z2 = false;
                            }
                            bj4Var.U(z2);
                            z3 = true;
                            bj4 bj4Var111116 = bj4Var;
                            mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM111115, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var111116, 1597824, 0, 262056);
                            bj4Var = bj4Var111116;
                            bj4Var.U(false);
                            g2b g2bVar11111111111111111111110 = g2b.a;
                        }
                    }
                    bj4Var.U(z3);
                    homeItemBadge4 = homeItemBadge3;
                    ox6Var8 = ox6Var7;
                    str6 = str3;
                    str7 = str4;
                    ox6Var9 = ox6Var5;
                    num7 = num6;
                    mh4Var4 = mh4Var3;
                    ci4Var5 = ci4Var4;
                    num8 = num5;
                }
                str5 = strF;
                bj4VarO.U(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i19 = IntercomTheme.$stable;
                ox6Var6 = ox6VarJ;
                ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                bj4Var = bj4VarO;
                bj4Var.K(-1379221164);
                if (str4 != null) {
                    mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                    bj4Var.K(941879891);
                    ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                    iHashCode4 = Long.hashCode(bj4Var.T);
                    kw7VarP4 = bj4Var.P();
                    ox6VarC4 = it1.c(bj4Var, aVar);
                    if (j1bVar != null) {
                        ml5.c();
                        throw null;
                    }
                    bj4Var.q();
                    if (bj4Var.S) {
                        bj4Var.k(aVar2);
                    } else {
                        bj4Var.z();
                    }
                    rd7.d(bj4Var, cVar, ny8VarA2);
                    rd7.d(bj4Var, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                    rd7.d(bj4Var, dVar, ox6VarC4);
                    ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                    bj4Var.K(-1379205196);
                    if (num6 == null) {
                        ox6Var7 = ox6Var6;
                    } else {
                        ox6Var7 = ox6Var6;
                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                        g2b g2bVar11111111111111111111111 = g2b.a;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(false);
                    g2b g2bVar11111111111111111111112 = g2b.a;
                    ci4Var4 = ci4Var3;
                    z3 = true;
                } else {
                    ox6Var7 = ox6Var6;
                    ci4Var4 = ci4Var3;
                    if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                        bj4Var.K(942534549);
                        if (num6 == null) {
                            z5 = true;
                            z4 = false;
                        } else {
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode3 = Long.hashCode(bj4Var.T);
                            kw7VarP3 = bj4Var.P();
                            ox6VarC3 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, fl6VarD);
                            rd7.d(bj4Var, eVar, kw7VarP3);
                            l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC3);
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            z4 = false;
                            dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                            z5 = true;
                            bj4Var.U(true);
                            g2b g2bVar11111111111111111111113 = g2b.a;
                        }
                        bj4Var.U(z4);
                        z3 = z5;
                    } else {
                        ci4Var4 = ci4Var4;
                        if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                            bj4Var.K(861667097);
                            bj4Var.U(false);
                            defpackage.u.b();
                            return;
                        }
                        bj4Var.K(943331838);
                        ox6 ox6VarM111116 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                        bj4Var.K(861717389);
                        objF2 = bj4Var.f();
                        if (objF2 == c0187a) {
                            z2 = false;
                            objF2 = new w05(0 == true ? 1 : 0);
                            bj4Var.C(objF2);
                        } else {
                            z2 = false;
                        }
                        bj4Var.U(z2);
                        z3 = true;
                        bj4 bj4Var111117 = bj4Var;
                        mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM111116, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var111117, 1597824, 0, 262056);
                        bj4Var = bj4Var111117;
                        bj4Var.U(false);
                        g2b g2bVar11111111111111111111114 = g2b.a;
                    }
                }
                bj4Var.U(z3);
                homeItemBadge4 = homeItemBadge3;
                ox6Var8 = ox6Var7;
                str6 = str3;
                str7 = str4;
                ox6Var9 = ox6Var5;
                num7 = num6;
                mh4Var4 = mh4Var3;
                ci4Var5 = ci4Var4;
                num8 = num5;
            } else {
                aVar = ox6.a.t;
                if (i20 != 0) {
                    ox6Var3 = aVar;
                }
                if (i21 != 0) {
                    num3 = null;
                }
                if (i4 != 0) {
                    ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                if (i6 != 0) {
                    ox6VarJ = ir9.j(aVar, 16.0f);
                } else {
                    ox6VarJ = ox6Var4;
                }
                if (i8 != 0) {
                    num4 = null;
                }
                if (i10 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i12 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i14 != 0) {
                    homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                } else {
                    homeItemBadge2 = homeItemBadge;
                }
                c0187a = jt1.a.a;
                if (i16 != 0) {
                    bj4VarO.K(-244016614);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new v05();
                        bj4VarO.C(objF3);
                    }
                    mh4Var2 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var2 = mh4Var;
                }
                ox6 ox6VarC1113 = ir9.c(ox6Var3, 1.0f);
                bj4VarO.K(-244013531);
                if ((234881024 & i3) == 67108864) {
                    z = true;
                } else {
                    z = false;
                }
                objF = bj4VarO.f();
                if (z) {
                    objF = new gb3(2, mh4Var2);
                    bj4VarO.C(objF);
                } else {
                    objF = new gb3(2, mh4Var2);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                num5 = num4;
                ox6Var5 = ox6Var3;
                ox6 ox6VarJ1110 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC1113, false, null, (mh4) objF, 15));
                c30.j jVar119 = c30.a;
                bVar = di.a.k;
                ny8VarA = ly8.a(jVar119, bVar, bj4VarO, 48);
                i18 = i3;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarJ1110);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, ny8VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf119 = Integer.valueOf(iHashCode);
                bVar2 = bt1.a.g;
                rd7.d(bj4VarO, bVar2, numValueOf119);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                mh4Var3 = mh4Var2;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                num6 = num3;
                qs5 qs5Var119 = new qs5(true, 2.0f);
                homeItemBadge3 = homeItemBadge2;
                aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, qs5Var119);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                bj4VarO.K(-1379228937);
                if (num5 != null) {
                    strF = nr1.f(bj4VarO, num5.intValue());
                } else {
                    if (str3 == null) {
                        strF = BuildConfig.FLAVOR;
                    } else {
                        str5 = str3;
                    }
                    bj4VarO.U(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    ox6Var6 = ox6VarJ;
                    ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                    bj4Var = bj4VarO;
                    bj4Var.K(-1379221164);
                    if (str4 != null) {
                        mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                        bj4Var.K(941879891);
                        ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                        iHashCode4 = Long.hashCode(bj4Var.T);
                        kw7VarP4 = bj4Var.P();
                        ox6VarC4 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, ny8VarA2);
                        rd7.d(bj4Var, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC4);
                        ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                        bj4Var.K(-1379205196);
                        if (num6 == null) {
                            ox6Var7 = ox6Var6;
                        } else {
                            ox6Var7 = ox6Var6;
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            g2b g2bVar11111111111111111111115 = g2b.a;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(false);
                        g2b g2bVar11111111111111111111116 = g2b.a;
                        ci4Var4 = ci4Var3;
                        z3 = true;
                    } else {
                        ox6Var7 = ox6Var6;
                        ci4Var4 = ci4Var3;
                        if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            bj4Var.K(942534549);
                            if (num6 == null) {
                                z5 = true;
                                z4 = false;
                            } else {
                                fl6VarD = dv0.d(di.a.a, false);
                                iHashCode3 = Long.hashCode(bj4Var.T);
                                kw7VarP3 = bj4Var.P();
                                ox6VarC3 = it1.c(bj4Var, aVar);
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var.q();
                                if (bj4Var.S) {
                                    bj4Var.k(aVar2);
                                } else {
                                    bj4Var.z();
                                }
                                rd7.d(bj4Var, cVar, fl6VarD);
                                rd7.d(bj4Var, eVar, kw7VarP3);
                                l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                                rd7.d(bj4Var, dVar, ox6VarC3);
                                m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                                z4 = false;
                                dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                                z5 = true;
                                bj4Var.U(true);
                                g2b g2bVar11111111111111111111117 = g2b.a;
                            }
                            bj4Var.U(z4);
                            z3 = z5;
                        } else {
                            ci4Var4 = ci4Var4;
                            if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                                bj4Var.K(861667097);
                                bj4Var.U(false);
                                defpackage.u.b();
                                return;
                            }
                            bj4Var.K(943331838);
                            ox6 ox6VarM111117 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                            bj4Var.K(861717389);
                            objF2 = bj4Var.f();
                            if (objF2 == c0187a) {
                                z2 = false;
                                objF2 = new w05(0 == true ? 1 : 0);
                                bj4Var.C(objF2);
                            } else {
                                z2 = false;
                            }
                            bj4Var.U(z2);
                            z3 = true;
                            bj4 bj4Var111118 = bj4Var;
                            mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM111117, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var111118, 1597824, 0, 262056);
                            bj4Var = bj4Var111118;
                            bj4Var.U(false);
                            g2b g2bVar11111111111111111111118 = g2b.a;
                        }
                    }
                    bj4Var.U(z3);
                    homeItemBadge4 = homeItemBadge3;
                    ox6Var8 = ox6Var7;
                    str6 = str3;
                    str7 = str4;
                    ox6Var9 = ox6Var5;
                    num7 = num6;
                    mh4Var4 = mh4Var3;
                    ci4Var5 = ci4Var4;
                    num8 = num5;
                }
                str5 = strF;
                bj4VarO.U(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i19 = IntercomTheme.$stable;
                ox6Var6 = ox6VarJ;
                ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                bj4Var = bj4VarO;
                bj4Var.K(-1379221164);
                if (str4 != null) {
                    mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                    bj4Var.K(941879891);
                    ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                    iHashCode4 = Long.hashCode(bj4Var.T);
                    kw7VarP4 = bj4Var.P();
                    ox6VarC4 = it1.c(bj4Var, aVar);
                    if (j1bVar != null) {
                        ml5.c();
                        throw null;
                    }
                    bj4Var.q();
                    if (bj4Var.S) {
                        bj4Var.k(aVar2);
                    } else {
                        bj4Var.z();
                    }
                    rd7.d(bj4Var, cVar, ny8VarA2);
                    rd7.d(bj4Var, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                    rd7.d(bj4Var, dVar, ox6VarC4);
                    ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                    bj4Var.K(-1379205196);
                    if (num6 == null) {
                        ox6Var7 = ox6Var6;
                    } else {
                        ox6Var7 = ox6Var6;
                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                        g2b g2bVar11111111111111111111119 = g2b.a;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(false);
                    g2b g2bVar111111111111111111111110 = g2b.a;
                    ci4Var4 = ci4Var3;
                    z3 = true;
                } else {
                    ox6Var7 = ox6Var6;
                    ci4Var4 = ci4Var3;
                    if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                        bj4Var.K(942534549);
                        if (num6 == null) {
                            z5 = true;
                            z4 = false;
                        } else {
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode3 = Long.hashCode(bj4Var.T);
                            kw7VarP3 = bj4Var.P();
                            ox6VarC3 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, fl6VarD);
                            rd7.d(bj4Var, eVar, kw7VarP3);
                            l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC3);
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            z4 = false;
                            dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                            z5 = true;
                            bj4Var.U(true);
                            g2b g2bVar111111111111111111111111 = g2b.a;
                        }
                        bj4Var.U(z4);
                        z3 = z5;
                    } else {
                        ci4Var4 = ci4Var4;
                        if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                            bj4Var.K(861667097);
                            bj4Var.U(false);
                            defpackage.u.b();
                            return;
                        }
                        bj4Var.K(943331838);
                        ox6 ox6VarM111118 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                        bj4Var.K(861717389);
                        objF2 = bj4Var.f();
                        if (objF2 == c0187a) {
                            z2 = false;
                            objF2 = new w05(0 == true ? 1 : 0);
                            bj4Var.C(objF2);
                        } else {
                            z2 = false;
                        }
                        bj4Var.U(z2);
                        z3 = true;
                        bj4 bj4Var111119 = bj4Var;
                        mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM111118, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var111119, 1597824, 0, 262056);
                        bj4Var = bj4Var111119;
                        bj4Var.U(false);
                        g2b g2bVar111111111111111111111112 = g2b.a;
                    }
                }
                bj4Var.U(z3);
                homeItemBadge4 = homeItemBadge3;
                ox6Var8 = ox6Var7;
                str6 = str3;
                str7 = str4;
                ox6Var9 = ox6Var5;
                num7 = num6;
                mh4Var4 = mh4Var3;
                ci4Var5 = ci4Var4;
                num8 = num5;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: x05
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HomeItemKt.HomeItem$lambda$12(ox6Var9, num7, ci4Var5, ox6Var8, num8, str6, str7, homeItemBadge4, mh4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        num4 = num2;
        i10 = i2 & 32;
        if (i10 != 0) {
            i3 |= 196608;
            j1bVar = j1bVar2;
        } else {
            j1bVar = j1bVar2;
            if ((i & 196608) == 0) {
                if (bj4VarO.J(str)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
        }
        i12 = i2 & 64;
        if (i12 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (bj4VarO.J(str2)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i3 |= i13;
        }
        i14 = i2 & 128;
        i15 = 12582912;
        if (i14 == 0) {
            i3 |= i15;
        } else if ((i & 12582912) == 0) {
            if ((i & 16777216) == 0) {
                zJ = bj4VarO.J(homeItemBadge);
            } else {
                zJ = bj4VarO.j(homeItemBadge);
            }
            if (zJ) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i3 |= i15;
        }
        i16 = i2 & 256;
        if (i16 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (bj4VarO.j(mh4Var)) {
                i17 = 67108864;
            } else {
                i17 = 33554432;
            }
            i3 |= i17;
        }
        if ((i3 & 38347923) == 38347922) {
            aVar = ox6.a.t;
            if (i20 != 0) {
                ox6Var3 = aVar;
            }
            if (i21 != 0) {
                num3 = null;
            }
            if (i4 != 0) {
                ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
            } else {
                ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
            }
            if (i6 != 0) {
                ox6VarJ = ir9.j(aVar, 16.0f);
            } else {
                ox6VarJ = ox6Var4;
            }
            if (i8 != 0) {
                num4 = null;
            }
            if (i10 != 0) {
                str3 = null;
            } else {
                str3 = str;
            }
            if (i12 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if (i14 != 0) {
                homeItemBadge2 = HomeItemBadge.None.INSTANCE;
            } else {
                homeItemBadge2 = homeItemBadge;
            }
            c0187a = jt1.a.a;
            if (i16 != 0) {
                bj4VarO.K(-244016614);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new v05();
                    bj4VarO.C(objF3);
                }
                mh4Var2 = (mh4) objF3;
                bj4VarO.U(false);
            } else {
                mh4Var2 = mh4Var;
            }
            ox6 ox6VarC1114 = ir9.c(ox6Var3, 1.0f);
            bj4VarO.K(-244013531);
            if ((234881024 & i3) == 67108864) {
                z = true;
            } else {
                z = false;
            }
            objF = bj4VarO.f();
            if (z) {
                objF = new gb3(2, mh4Var2);
                bj4VarO.C(objF);
            } else {
                objF = new gb3(2, mh4Var2);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            num5 = num4;
            ox6Var5 = ox6Var3;
            ox6 ox6VarJ1111 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC1114, false, null, (mh4) objF, 15));
            c30.j jVar1110 = c30.a;
            bVar = di.a.k;
            ny8VarA = ly8.a(jVar1110, bVar, bj4VarO, 48);
            i18 = i3;
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarJ1111);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, ny8VarA);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf1110 = Integer.valueOf(iHashCode);
            bVar2 = bt1.a.g;
            rd7.d(bj4VarO, bVar2, numValueOf1110);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            mh4Var3 = mh4Var2;
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            num6 = num3;
            qs5 qs5Var1110 = new qs5(true, 2.0f);
            homeItemBadge3 = homeItemBadge2;
            aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, qs5Var1110);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            bj4VarO.K(-1379228937);
            if (num5 != null) {
                strF = nr1.f(bj4VarO, num5.intValue());
            } else {
                if (str3 == null) {
                    strF = BuildConfig.FLAVOR;
                } else {
                    str5 = str3;
                }
                bj4VarO.U(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i19 = IntercomTheme.$stable;
                ox6Var6 = ox6VarJ;
                ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                bj4Var = bj4VarO;
                bj4Var.K(-1379221164);
                if (str4 != null) {
                    mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                    bj4Var.K(941879891);
                    ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                    iHashCode4 = Long.hashCode(bj4Var.T);
                    kw7VarP4 = bj4Var.P();
                    ox6VarC4 = it1.c(bj4Var, aVar);
                    if (j1bVar != null) {
                        ml5.c();
                        throw null;
                    }
                    bj4Var.q();
                    if (bj4Var.S) {
                        bj4Var.k(aVar2);
                    } else {
                        bj4Var.z();
                    }
                    rd7.d(bj4Var, cVar, ny8VarA2);
                    rd7.d(bj4Var, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                    rd7.d(bj4Var, dVar, ox6VarC4);
                    ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                    bj4Var.K(-1379205196);
                    if (num6 == null) {
                        ox6Var7 = ox6Var6;
                    } else {
                        ox6Var7 = ox6Var6;
                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                        g2b g2bVar111111111111111111111113 = g2b.a;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(false);
                    g2b g2bVar111111111111111111111114 = g2b.a;
                    ci4Var4 = ci4Var3;
                    z3 = true;
                } else {
                    ox6Var7 = ox6Var6;
                    ci4Var4 = ci4Var3;
                    if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                        bj4Var.K(942534549);
                        if (num6 == null) {
                            z5 = true;
                            z4 = false;
                        } else {
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode3 = Long.hashCode(bj4Var.T);
                            kw7VarP3 = bj4Var.P();
                            ox6VarC3 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, fl6VarD);
                            rd7.d(bj4Var, eVar, kw7VarP3);
                            l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC3);
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            z4 = false;
                            dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                            z5 = true;
                            bj4Var.U(true);
                            g2b g2bVar111111111111111111111115 = g2b.a;
                        }
                        bj4Var.U(z4);
                        z3 = z5;
                    } else {
                        ci4Var4 = ci4Var4;
                        if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                            bj4Var.K(861667097);
                            bj4Var.U(false);
                            defpackage.u.b();
                            return;
                        }
                        bj4Var.K(943331838);
                        ox6 ox6VarM111119 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                        bj4Var.K(861717389);
                        objF2 = bj4Var.f();
                        if (objF2 == c0187a) {
                            z2 = false;
                            objF2 = new w05(0 == true ? 1 : 0);
                            bj4Var.C(objF2);
                        } else {
                            z2 = false;
                        }
                        bj4Var.U(z2);
                        z3 = true;
                        bj4 bj4Var1111110 = bj4Var;
                        mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM111119, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var1111110, 1597824, 0, 262056);
                        bj4Var = bj4Var1111110;
                        bj4Var.U(false);
                        g2b g2bVar111111111111111111111116 = g2b.a;
                    }
                }
                bj4Var.U(z3);
                homeItemBadge4 = homeItemBadge3;
                ox6Var8 = ox6Var7;
                str6 = str3;
                str7 = str4;
                ox6Var9 = ox6Var5;
                num7 = num6;
                mh4Var4 = mh4Var3;
                ci4Var5 = ci4Var4;
                num8 = num5;
            }
            str5 = strF;
            bj4VarO.U(false);
            intercomTheme = IntercomTheme.INSTANCE;
            i19 = IntercomTheme.$stable;
            ox6Var6 = ox6VarJ;
            ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
            mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
            bj4Var = bj4VarO;
            bj4Var.K(-1379221164);
            if (str4 != null) {
                mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                bj4Var = bj4Var;
            }
            bj4Var.U(false);
            bj4Var.U(true);
            if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                bj4Var.K(941879891);
                ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                iHashCode4 = Long.hashCode(bj4Var.T);
                kw7VarP4 = bj4Var.P();
                ox6VarC4 = it1.c(bj4Var, aVar);
                if (j1bVar != null) {
                    ml5.c();
                    throw null;
                }
                bj4Var.q();
                if (bj4Var.S) {
                    bj4Var.k(aVar2);
                } else {
                    bj4Var.z();
                }
                rd7.d(bj4Var, cVar, ny8VarA2);
                rd7.d(bj4Var, eVar, kw7VarP4);
                l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                rd7.d(bj4Var, dVar, ox6VarC4);
                ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                bj4Var.K(-1379205196);
                if (num6 == null) {
                    ox6Var7 = ox6Var6;
                } else {
                    ox6Var7 = ox6Var6;
                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                    g2b g2bVar111111111111111111111117 = g2b.a;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(false);
                g2b g2bVar111111111111111111111118 = g2b.a;
                ci4Var4 = ci4Var3;
                z3 = true;
            } else {
                ox6Var7 = ox6Var6;
                ci4Var4 = ci4Var3;
                if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                    bj4Var.K(942534549);
                    if (num6 == null) {
                        z5 = true;
                        z4 = false;
                    } else {
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode3 = Long.hashCode(bj4Var.T);
                        kw7VarP3 = bj4Var.P();
                        ox6VarC3 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, fl6VarD);
                        rd7.d(bj4Var, eVar, kw7VarP3);
                        l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC3);
                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                        z4 = false;
                        dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                        z5 = true;
                        bj4Var.U(true);
                        g2b g2bVar111111111111111111111119 = g2b.a;
                    }
                    bj4Var.U(z4);
                    z3 = z5;
                } else {
                    ci4Var4 = ci4Var4;
                    if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                        bj4Var.K(861667097);
                        bj4Var.U(false);
                        defpackage.u.b();
                        return;
                    }
                    bj4Var.K(943331838);
                    ox6 ox6VarM1111110 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                    bj4Var.K(861717389);
                    objF2 = bj4Var.f();
                    if (objF2 == c0187a) {
                        z2 = false;
                        objF2 = new w05(0 == true ? 1 : 0);
                        bj4Var.C(objF2);
                    } else {
                        z2 = false;
                    }
                    bj4Var.U(z2);
                    z3 = true;
                    bj4 bj4Var1111111 = bj4Var;
                    mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM1111110, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var1111111, 1597824, 0, 262056);
                    bj4Var = bj4Var1111111;
                    bj4Var.U(false);
                    g2b g2bVar1111111111111111111111110 = g2b.a;
                }
            }
            bj4Var.U(z3);
            homeItemBadge4 = homeItemBadge3;
            ox6Var8 = ox6Var7;
            str6 = str3;
            str7 = str4;
            ox6Var9 = ox6Var5;
            num7 = num6;
            mh4Var4 = mh4Var3;
            ci4Var5 = ci4Var4;
            num8 = num5;
        } else {
            aVar = ox6.a.t;
            if (i20 != 0) {
                ox6Var3 = aVar;
            }
            if (i21 != 0) {
                num3 = null;
            }
            if (i4 != 0) {
                ci4VarM52getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m52getLambda1$intercom_sdk_base_release();
            } else {
                ci4VarM52getLambda1$intercom_sdk_base_release = ci4Var2;
            }
            if (i6 != 0) {
                ox6VarJ = ir9.j(aVar, 16.0f);
            } else {
                ox6VarJ = ox6Var4;
            }
            if (i8 != 0) {
                num4 = null;
            }
            if (i10 != 0) {
                str3 = null;
            } else {
                str3 = str;
            }
            if (i12 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if (i14 != 0) {
                homeItemBadge2 = HomeItemBadge.None.INSTANCE;
            } else {
                homeItemBadge2 = homeItemBadge;
            }
            c0187a = jt1.a.a;
            if (i16 != 0) {
                bj4VarO.K(-244016614);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new v05();
                    bj4VarO.C(objF3);
                }
                mh4Var2 = (mh4) objF3;
                bj4VarO.U(false);
            } else {
                mh4Var2 = mh4Var;
            }
            ox6 ox6VarC1115 = ir9.c(ox6Var3, 1.0f);
            bj4VarO.K(-244013531);
            if ((234881024 & i3) == 67108864) {
                z = true;
            } else {
                z = false;
            }
            objF = bj4VarO.f();
            if (z) {
                objF = new gb3(2, mh4Var2);
                bj4VarO.C(objF);
            } else {
                objF = new gb3(2, mh4Var2);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            num5 = num4;
            ox6Var5 = ox6Var3;
            ox6 ox6VarJ1112 = eo7.j(16.0f, 12.0f, we1.c(ox6VarC1115, false, null, (mh4) objF, 15));
            c30.j jVar1111 = c30.a;
            bVar = di.a.k;
            ny8VarA = ly8.a(jVar1111, bVar, bj4VarO, 48);
            i18 = i3;
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarJ1112);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, ny8VarA);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf1111 = Integer.valueOf(iHashCode);
            bVar2 = bt1.a.g;
            rd7.d(bj4VarO, bVar2, numValueOf1111);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            mh4Var3 = mh4Var2;
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            num6 = num3;
            qs5 qs5Var1111 = new qs5(true, 2.0f);
            homeItemBadge3 = homeItemBadge2;
            aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, qs5Var1111);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            bj4VarO.K(-1379228937);
            if (num5 != null) {
                strF = nr1.f(bj4VarO, num5.intValue());
            } else {
                if (str3 == null) {
                    strF = BuildConfig.FLAVOR;
                } else {
                    str5 = str3;
                }
                bj4VarO.U(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i19 = IntercomTheme.$stable;
                ox6Var6 = ox6VarJ;
                ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
                mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
                bj4Var = bj4VarO;
                bj4Var.K(-1379221164);
                if (str4 != null) {
                    mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                    bj4Var.K(941879891);
                    ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                    iHashCode4 = Long.hashCode(bj4Var.T);
                    kw7VarP4 = bj4Var.P();
                    ox6VarC4 = it1.c(bj4Var, aVar);
                    if (j1bVar != null) {
                        ml5.c();
                        throw null;
                    }
                    bj4Var.q();
                    if (bj4Var.S) {
                        bj4Var.k(aVar2);
                    } else {
                        bj4Var.z();
                    }
                    rd7.d(bj4Var, cVar, ny8VarA2);
                    rd7.d(bj4Var, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                    rd7.d(bj4Var, dVar, ox6VarC4);
                    ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                    bj4Var.K(-1379205196);
                    if (num6 == null) {
                        ox6Var7 = ox6Var6;
                    } else {
                        ox6Var7 = ox6Var6;
                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                        g2b g2bVar1111111111111111111111111 = g2b.a;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(false);
                    g2b g2bVar1111111111111111111111112 = g2b.a;
                    ci4Var4 = ci4Var3;
                    z3 = true;
                } else {
                    ox6Var7 = ox6Var6;
                    ci4Var4 = ci4Var3;
                    if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                        bj4Var.K(942534549);
                        if (num6 == null) {
                            z5 = true;
                            z4 = false;
                        } else {
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode3 = Long.hashCode(bj4Var.T);
                            kw7VarP3 = bj4Var.P();
                            ox6VarC3 = it1.c(bj4Var, aVar);
                            if (j1bVar != null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var.q();
                            if (bj4Var.S) {
                                bj4Var.k(aVar2);
                            } else {
                                bj4Var.z();
                            }
                            rd7.d(bj4Var, cVar, fl6VarD);
                            rd7.d(bj4Var, eVar, kw7VarP3);
                            l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                            rd7.d(bj4Var, dVar, ox6VarC3);
                            m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                            z4 = false;
                            dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                            z5 = true;
                            bj4Var.U(true);
                            g2b g2bVar1111111111111111111111113 = g2b.a;
                        }
                        bj4Var.U(z4);
                        z3 = z5;
                    } else {
                        ci4Var4 = ci4Var4;
                        if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                            bj4Var.K(861667097);
                            bj4Var.U(false);
                            defpackage.u.b();
                            return;
                        }
                        bj4Var.K(943331838);
                        ox6 ox6VarM1111111 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                        bj4Var.K(861717389);
                        objF2 = bj4Var.f();
                        if (objF2 == c0187a) {
                            z2 = false;
                            objF2 = new w05(0 == true ? 1 : 0);
                            bj4Var.C(objF2);
                        } else {
                            z2 = false;
                        }
                        bj4Var.U(z2);
                        z3 = true;
                        bj4 bj4Var1111112 = bj4Var;
                        mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM1111111, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var1111112, 1597824, 0, 262056);
                        bj4Var = bj4Var1111112;
                        bj4Var.U(false);
                        g2b g2bVar1111111111111111111111114 = g2b.a;
                    }
                }
                bj4Var.U(z3);
                homeItemBadge4 = homeItemBadge3;
                ox6Var8 = ox6Var7;
                str6 = str3;
                str7 = str4;
                ox6Var9 = ox6Var5;
                num7 = num6;
                mh4Var4 = mh4Var3;
                ci4Var5 = ci4Var4;
                num8 = num5;
            }
            str5 = strF;
            bj4VarO.U(false);
            intercomTheme = IntercomTheme.INSTANCE;
            i19 = IntercomTheme.$stable;
            ox6Var6 = ox6VarJ;
            ci4Var3 = ci4VarM52getLambda1$intercom_sdk_base_release;
            mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110590);
            bj4Var = bj4VarO;
            bj4Var.K(-1379221164);
            if (str4 != null) {
                mia.b(str4, null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i19).getType04(), bj4Var, ((i18 >> 18) & 14) | 384, 0, 131066);
                bj4Var = bj4Var;
            }
            bj4Var.U(false);
            bj4Var.U(true);
            if (xj5.a(homeItemBadge3, HomeItemBadge.None.INSTANCE)) {
                bj4Var.K(941879891);
                ny8VarA2 = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var, 54);
                iHashCode4 = Long.hashCode(bj4Var.T);
                kw7VarP4 = bj4Var.P();
                ox6VarC4 = it1.c(bj4Var, aVar);
                if (j1bVar != null) {
                    ml5.c();
                    throw null;
                }
                bj4Var.q();
                if (bj4Var.S) {
                    bj4Var.k(aVar2);
                } else {
                    bj4Var.z();
                }
                rd7.d(bj4Var, cVar, ny8VarA2);
                rd7.d(bj4Var, eVar, kw7VarP4);
                l02.a(iHashCode4, bj4Var, bVar2, bj4Var, c0034a);
                rd7.d(bj4Var, dVar, ox6VarC4);
                ci4Var3.invoke(bj4Var, Integer.valueOf((i18 >> 6) & 14));
                bj4Var.K(-1379205196);
                if (num6 == null) {
                    ox6Var7 = ox6Var6;
                } else {
                    ox6Var7 = ox6Var6;
                    m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(ox6Var7, num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                    g2b g2bVar1111111111111111111111115 = g2b.a;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(false);
                g2b g2bVar1111111111111111111111116 = g2b.a;
                ci4Var4 = ci4Var3;
                z3 = true;
            } else {
                ox6Var7 = ox6Var6;
                ci4Var4 = ci4Var3;
                if (xj5.a(homeItemBadge3, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                    bj4Var.K(942534549);
                    if (num6 == null) {
                        z5 = true;
                        z4 = false;
                    } else {
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode3 = Long.hashCode(bj4Var.T);
                        kw7VarP3 = bj4Var.P();
                        ox6VarC3 = it1.c(bj4Var, aVar);
                        if (j1bVar != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var.q();
                        if (bj4Var.S) {
                            bj4Var.k(aVar2);
                        } else {
                            bj4Var.z();
                        }
                        rd7.d(bj4Var, cVar, fl6VarD);
                        rd7.d(bj4Var, eVar, kw7VarP3);
                        l02.a(iHashCode3, bj4Var, bVar2, bj4Var, c0034a);
                        rd7.d(bj4Var, dVar, ox6VarC3);
                        m65.b(is7.a(num6.intValue(), bj4Var, (i18 >> 3) & 14), null, raa.a(uma.a(ox6Var7, new CutIconWithIndicatorShape(0.0f, 1, null)), num6.toString()), intercomTheme.getColors(bj4Var, i19).m752getActionContrastWhite0d7_KjU(), bj4Var, 56, 0);
                        z4 = false;
                        dv0.a(kv0.a.f(ir9.j(gi0.c(aVar, u7d.d(4292544041L), ay8.a), 7.0f), di.a.c), bj4Var, 0);
                        z5 = true;
                        bj4Var.U(true);
                        g2b g2bVar1111111111111111111111117 = g2b.a;
                    }
                    bj4Var.U(z4);
                    z3 = z5;
                } else {
                    ci4Var4 = ci4Var4;
                    if (homeItemBadge3 instanceof HomeItemBadge.IndicatorWithCount) {
                        bj4Var.K(861667097);
                        bj4Var.U(false);
                        defpackage.u.b();
                        return;
                    }
                    bj4Var.K(943331838);
                    ox6 ox6VarM1111112 = eo7.m(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                    bj4Var.K(861717389);
                    objF2 = bj4Var.f();
                    if (objF2 == c0187a) {
                        z2 = false;
                        objF2 = new w05(0 == true ? 1 : 0);
                        bj4Var.C(objF2);
                    } else {
                        z2 = false;
                    }
                    bj4Var.U(z2);
                    z3 = true;
                    bj4 bj4Var1111113 = bj4Var;
                    mia.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge3).getCount()), z63.c(ox6VarM1111112, (oh4) objF2).H(new beb()), uh1.e, cka.b(11), ob4.w, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var1111113, 1597824, 0, 262056);
                    bj4Var = bj4Var1111113;
                    bj4Var.U(false);
                    g2b g2bVar1111111111111111111111118 = g2b.a;
                }
            }
            bj4Var.U(z3);
            homeItemBadge4 = homeItemBadge3;
            ox6Var8 = ox6Var7;
            str6 = str3;
            str7 = str4;
            ox6Var9 = ox6Var5;
            num7 = num6;
            mh4Var4 = mh4Var3;
            ci4Var5 = ci4Var4;
            num8 = num5;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: x05
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeItemKt.HomeItem$lambda$12(ox6Var9, num7, ci4Var5, ox6Var8, num8, str6, str7, homeItemBadge4, mh4Var4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeItem$lambda$11$lambda$10$lambda$9(d73 d73Var) {
        d73Var.getClass();
        d73.N(d73Var, u7d.d(4292544041L), 22.0f, 0L, 0, 124);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeItem$lambda$12(ox6 ox6Var, Integer num, ci4 ci4Var, ox6 ox6Var2, Integer num2, String str, String str2, HomeItemBadge homeItemBadge, mh4 mh4Var, int i, int i2, jt1 jt1Var, int i3) {
        HomeItem(ox6Var, num, ci4Var, ox6Var2, num2, str, str2, homeItemBadge, mh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeItem$lambda$3$lambda$2(mh4 mh4Var) {
        mh4Var.invoke();
        return g2b.a;
    }

    private static final void HomeMessagesPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1318695433);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeItemKt.INSTANCE.m56getLambda5$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: r05
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeItemKt.HomeMessagesPreview$lambda$14(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeMessagesPreview$lambda$14(int i, jt1 jt1Var, int i2) {
        HomeMessagesPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final void HomeSendMessagePreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(861055120);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeItemKt.INSTANCE.m54getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: s05
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeItemKt.HomeSendMessagePreview$lambda$13(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeSendMessagePreview$lambda$13(int i, jt1 jt1Var, int i2) {
        HomeSendMessagePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final void HomeTicketsPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-279860840);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeItemKt.INSTANCE.m58getLambda7$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new u05(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeTicketsPreview$lambda$15(int i, jt1 jt1Var, int i2) {
        HomeTicketsPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final void HomeTicketsRTLPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1844314002);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeItemKt.INSTANCE.m60getLambda9$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new t05(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeTicketsRTLPreview$lambda$16(int i, jt1 jt1Var, int i2) {
        HomeTicketsRTLPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
