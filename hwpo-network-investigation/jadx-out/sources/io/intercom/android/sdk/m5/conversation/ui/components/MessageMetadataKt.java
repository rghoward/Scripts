package io.intercom.android.sdk.m5.conversation.ui.components;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.intercom.twig.BuildConfig;
import defpackage.a30;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.ec9;
import defpackage.eo7;
import defpackage.fu6;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.hc9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.oc1;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.pb9;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.rd7;
import defpackage.sc5;
import defpackage.w95;
import defpackage.wja;
import defpackage.xj8;
import defpackage.y02;
import defpackage.z2a;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageMetadataKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class MessageMetadataKt {
    /* JADX WARN: Code duplicated, block: B:102:0x0246  */
    /* JADX WARN: Code duplicated, block: B:104:0x0256 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x0262  */
    /* JADX WARN: Code duplicated, block: B:111:0x026e  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:119:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:124:0x0312  */
    /* JADX WARN: Code duplicated, block: B:126:0x0320  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x0111  */
    /* JADX WARN: Code duplicated, block: B:76:0x0118  */
    /* JADX WARN: Code duplicated, block: B:77:0x011c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0148  */
    /* JADX WARN: Code duplicated, block: B:81:0x0169  */
    /* JADX WARN: Code duplicated, block: B:85:0x017c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0189  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
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
    public static final void MessageMetadata(final List<AvatarWrapper> list, final String str, ox6 ox6Var, String str2, Long l, jt1 jt1Var, final int i, final int i2) {
        List<AvatarWrapper> list2;
        int i3;
        String str3;
        int i4;
        ox6 ox6Var2;
        int i5;
        int i6;
        String str4;
        int i7;
        int i8;
        Long l2;
        int i9;
        ox6.a aVar;
        String str5;
        Long l3;
        wja wjaVarA;
        ny8 ny8VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        ?? r1;
        float f;
        bj4 bj4Var;
        Object obj;
        bj4 bj4Var2;
        bj4 bj4Var3;
        final ox6 ox6Var3;
        final String str6;
        final Long l4;
        long jLongValue;
        Object objF;
        Object obj2;
        long j;
        bj4 bj4Var4;
        bj4 bj4Var5;
        Object objF2;
        Object obj3;
        bj4 bj4Var6;
        xj8 xj8VarW;
        list.getClass();
        str.getClass();
        bj4 bj4VarO = jt1Var.o(1631390024);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            list2 = list;
        } else {
            list2 = list;
            if ((i & 6) == 0) {
                i3 = (bj4VarO.j(list2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                str3 = str;
                i3 |= bj4VarO.J(str3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    ox6Var2 = ox6Var;
                    if (bj4VarO.J(ox6Var2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        str4 = str2;
                        if (bj4VarO.J(str4)) {
                            i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            l2 = l;
                            if (bj4VarO.J(l2)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        if ((i3 & 9363) == 9362 || !bj4VarO.r()) {
                            aVar = ox6.a.t;
                            if (i4 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i6 != 0) {
                                str5 = null;
                            } else {
                                str5 = str4;
                            }
                            if (i8 != 0) {
                                l3 = null;
                            } else {
                                l3 = l2;
                            }
                            wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                            ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6Var2);
                            bt1.c.getClass();
                            aVar2 = bt1.a.b;
                            if (bj4VarO.a == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar2);
                            } else {
                                bj4VarO.z();
                            }
                            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(bj4VarO, bt1.a.h);
                            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                            bj4VarO.K(1642417258);
                            if (list2.isEmpty()) {
                                r1 = 1;
                            } else {
                                List<AvatarWrapper> list3 = list2;
                                r1 = 1;
                                AvatarGroupKt.m19AvatarGroupJ8mCjc(list3, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                            }
                            bj4VarO.U(false);
                            if (1.0f <= 0.0d) {
                                sc5.a("invalid weight; must be greater than zero");
                            }
                            f = 1.0f;
                            if (1.0f > Float.MAX_VALUE) {
                                f = Float.MAX_VALUE;
                            }
                            mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                            bj4Var = bj4VarO;
                            bj4Var.K(1642431398);
                            obj = jt1.a.a;
                            bj4Var2 = bj4Var;
                            if (str5 != null) {
                                bj4Var.K(1642431772);
                                if (!z2a.w(str)) {
                                    bj4Var.K(-704192764);
                                    objF2 = bj4Var.f();
                                    if (objF2 == obj) {
                                        bj4Var5 = bj4Var;
                                        obj3 = objF2;
                                        Object fu6Var = new fu6();
                                        bj4Var.C(fu6Var);
                                        obj3 = fu6Var;
                                    }
                                    bj4Var5 = bj4Var;
                                    obj3 = objF2;
                                    bj4Var.U(false);
                                    mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                                    bj4Var5 = bj4Var;
                                }
                                bj4Var5 = bj4Var;
                                bj4Var5.U(false);
                                bj4 bj4Var7 = bj4Var5;
                                mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var7, 0, 24960, 110590);
                                bj4Var2 = bj4Var7;
                                g2b g2bVar = g2b.a;
                            }
                            bj4Var2.U(false);
                            bj4Var2.K(1642448818);
                            bj4Var3 = bj4Var2;
                            if (l3 != null) {
                                jLongValue = l3.longValue();
                                bj4Var2.K(1642449084);
                                if (z2a.w(str) || (str5 != null && ((z2a.w(str5) ? 1 : 0) ^ r1) == r1)) {
                                    bj4Var2.K(-704174460);
                                    objF = bj4Var2.f();
                                    obj2 = objF;
                                    if (objF == obj) {
                                        Object y02Var = new y02(r1);
                                        bj4Var2.C(y02Var);
                                        obj2 = y02Var;
                                    }
                                    bj4Var2.U(false);
                                    bj4 bj4Var8 = bj4Var2;
                                    j = jLongValue;
                                    mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var8, 6, 0, 131068);
                                    bj4Var4 = bj4Var8;
                                } else {
                                    j = jLongValue;
                                    bj4Var4 = bj4Var2;
                                }
                                bj4Var4.U(false);
                                if (0.5f <= 0.0d) {
                                    sc5.a("invalid weight; must be greater than zero");
                                }
                                bj4 bj4Var9 = bj4Var4;
                                mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var9, 0, 24960, 110588);
                                bj4Var3 = bj4Var9;
                                g2b g2bVar2 = g2b.a;
                            }
                            bj4Var3.U(false);
                            bj4Var3.U(r1);
                            ox6Var3 = ox6Var2;
                            str6 = str5;
                            l4 = l3;
                            bj4Var6 = bj4Var3;
                        } else {
                            bj4VarO.u();
                            ox6Var3 = ox6Var2;
                            str6 = str4;
                            l4 = l2;
                            bj4Var6 = bj4VarO;
                        }
                        xj8VarW = bj4Var6.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: gu6
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj4, Object obj5) {
                                    int iIntValue = ((Integer) obj5).intValue();
                                    return MessageMetadataKt.MessageMetadata$lambda$7(list, str, ox6Var3, str6, l4, i, i2, (jt1) obj4, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 24576;
                    l2 = l;
                    if ((i3 & 9363) == 9362) {
                        aVar = ox6.a.t;
                        if (i4 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i6 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i8 != 0) {
                            l3 = null;
                        } else {
                            l3 = l2;
                        }
                        wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                        ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        bj4VarO.K(1642417258);
                        if (list2.isEmpty()) {
                            List<AvatarWrapper> list4 = list2;
                            r1 = 1;
                            AvatarGroupKt.m19AvatarGroupJ8mCjc(list4, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                        } else {
                            r1 = 1;
                        }
                        bj4VarO.U(false);
                        if (1.0f <= 0.0d) {
                            sc5.a("invalid weight; must be greater than zero");
                        }
                        f = 1.0f;
                        if (1.0f > Float.MAX_VALUE) {
                            f = Float.MAX_VALUE;
                        }
                        mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                        bj4Var = bj4VarO;
                        bj4Var.K(1642431398);
                        obj = jt1.a.a;
                        bj4Var2 = bj4Var;
                        if (str5 != null) {
                            bj4Var.K(1642431772);
                            if (!z2a.w(str)) {
                                bj4Var.K(-704192764);
                                objF2 = bj4Var.f();
                                if (objF2 == obj) {
                                    bj4Var5 = bj4Var;
                                    obj3 = objF2;
                                    Object fu6Var2 = new fu6();
                                    bj4Var.C(fu6Var2);
                                    obj3 = fu6Var2;
                                }
                                bj4Var5 = bj4Var;
                                obj3 = objF2;
                                bj4Var.U(false);
                                mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                                bj4Var5 = bj4Var;
                            }
                            bj4Var5 = bj4Var;
                            bj4Var5.U(false);
                            bj4 bj4Var10 = bj4Var5;
                            mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var10, 0, 24960, 110590);
                            bj4Var2 = bj4Var10;
                            g2b g2bVar3 = g2b.a;
                        }
                        bj4Var2.U(false);
                        bj4Var2.K(1642448818);
                        bj4Var3 = bj4Var2;
                        if (l3 != null) {
                            jLongValue = l3.longValue();
                            bj4Var2.K(1642449084);
                            if (z2a.w(str)) {
                                bj4Var2.K(-704174460);
                                objF = bj4Var2.f();
                                obj2 = objF;
                                if (objF == obj) {
                                    Object y02Var2 = new y02(r1);
                                    bj4Var2.C(y02Var2);
                                    obj2 = y02Var2;
                                }
                                bj4Var2.U(false);
                                bj4 bj4Var11 = bj4Var2;
                                j = jLongValue;
                                mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var11, 6, 0, 131068);
                                bj4Var4 = bj4Var11;
                            } else {
                                bj4Var2.K(-704174460);
                                objF = bj4Var2.f();
                                obj2 = objF;
                                if (objF == obj) {
                                    Object y02Var3 = new y02(r1);
                                    bj4Var2.C(y02Var3);
                                    obj2 = y02Var3;
                                }
                                bj4Var2.U(false);
                                bj4 bj4Var12 = bj4Var2;
                                j = jLongValue;
                                mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var12, 6, 0, 131068);
                                bj4Var4 = bj4Var12;
                            }
                            bj4Var4.U(false);
                            if (0.5f <= 0.0d) {
                                sc5.a("invalid weight; must be greater than zero");
                            }
                            bj4 bj4Var13 = bj4Var4;
                            mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var13, 0, 24960, 110588);
                            bj4Var3 = bj4Var13;
                            g2b g2bVar4 = g2b.a;
                        }
                        bj4Var3.U(false);
                        bj4Var3.U(r1);
                        ox6Var3 = ox6Var2;
                        str6 = str5;
                        l4 = l3;
                        bj4Var6 = bj4Var3;
                    } else {
                        aVar = ox6.a.t;
                        if (i4 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i6 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i8 != 0) {
                            l3 = null;
                        } else {
                            l3 = l2;
                        }
                        wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                        ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        bj4VarO.K(1642417258);
                        if (list2.isEmpty()) {
                            List<AvatarWrapper> list5 = list2;
                            r1 = 1;
                            AvatarGroupKt.m19AvatarGroupJ8mCjc(list5, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                        } else {
                            r1 = 1;
                        }
                        bj4VarO.U(false);
                        if (1.0f <= 0.0d) {
                            sc5.a("invalid weight; must be greater than zero");
                        }
                        f = 1.0f;
                        if (1.0f > Float.MAX_VALUE) {
                            f = Float.MAX_VALUE;
                        }
                        mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                        bj4Var = bj4VarO;
                        bj4Var.K(1642431398);
                        obj = jt1.a.a;
                        bj4Var2 = bj4Var;
                        if (str5 != null) {
                            bj4Var.K(1642431772);
                            if (!z2a.w(str)) {
                                bj4Var.K(-704192764);
                                objF2 = bj4Var.f();
                                if (objF2 == obj) {
                                    bj4Var5 = bj4Var;
                                    obj3 = objF2;
                                    Object fu6Var3 = new fu6();
                                    bj4Var.C(fu6Var3);
                                    obj3 = fu6Var3;
                                }
                                bj4Var5 = bj4Var;
                                obj3 = objF2;
                                bj4Var.U(false);
                                mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                                bj4Var5 = bj4Var;
                            }
                            bj4Var5 = bj4Var;
                            bj4Var5.U(false);
                            bj4 bj4Var14 = bj4Var5;
                            mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var14, 0, 24960, 110590);
                            bj4Var2 = bj4Var14;
                            g2b g2bVar5 = g2b.a;
                        }
                        bj4Var2.U(false);
                        bj4Var2.K(1642448818);
                        bj4Var3 = bj4Var2;
                        if (l3 != null) {
                            jLongValue = l3.longValue();
                            bj4Var2.K(1642449084);
                            if (z2a.w(str)) {
                                bj4Var2.K(-704174460);
                                objF = bj4Var2.f();
                                obj2 = objF;
                                if (objF == obj) {
                                    Object y02Var4 = new y02(r1);
                                    bj4Var2.C(y02Var4);
                                    obj2 = y02Var4;
                                }
                                bj4Var2.U(false);
                                bj4 bj4Var15 = bj4Var2;
                                j = jLongValue;
                                mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var15, 6, 0, 131068);
                                bj4Var4 = bj4Var15;
                            } else {
                                bj4Var2.K(-704174460);
                                objF = bj4Var2.f();
                                obj2 = objF;
                                if (objF == obj) {
                                    Object y02Var5 = new y02(r1);
                                    bj4Var2.C(y02Var5);
                                    obj2 = y02Var5;
                                }
                                bj4Var2.U(false);
                                bj4 bj4Var16 = bj4Var2;
                                j = jLongValue;
                                mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var16, 6, 0, 131068);
                                bj4Var4 = bj4Var16;
                            }
                            bj4Var4.U(false);
                            if (0.5f <= 0.0d) {
                                sc5.a("invalid weight; must be greater than zero");
                            }
                            bj4 bj4Var17 = bj4Var4;
                            mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var17, 0, 24960, 110588);
                            bj4Var3 = bj4Var17;
                            g2b g2bVar6 = g2b.a;
                        }
                        bj4Var3.U(false);
                        bj4Var3.U(r1);
                        ox6Var3 = ox6Var2;
                        str6 = str5;
                        l4 = l3;
                        bj4Var6 = bj4Var3;
                    }
                    xj8VarW = bj4Var6.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: gu6
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj4, Object obj5) {
                                int iIntValue = ((Integer) obj5).intValue();
                                return MessageMetadataKt.MessageMetadata$lambda$7(list, str, ox6Var3, str6, l4, i, i2, (jt1) obj4, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 3072;
                str4 = str2;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        l2 = l;
                        if (bj4VarO.J(l2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) == 9362) {
                        aVar = ox6.a.t;
                        if (i4 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i6 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i8 != 0) {
                            l3 = null;
                        } else {
                            l3 = l2;
                        }
                        wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                        ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        bj4VarO.K(1642417258);
                        if (list2.isEmpty()) {
                            List<AvatarWrapper> list6 = list2;
                            r1 = 1;
                            AvatarGroupKt.m19AvatarGroupJ8mCjc(list6, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                        } else {
                            r1 = 1;
                        }
                        bj4VarO.U(false);
                        if (1.0f <= 0.0d) {
                            sc5.a("invalid weight; must be greater than zero");
                        }
                        f = 1.0f;
                        if (1.0f > Float.MAX_VALUE) {
                            f = Float.MAX_VALUE;
                        }
                        mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                        bj4Var = bj4VarO;
                        bj4Var.K(1642431398);
                        obj = jt1.a.a;
                        bj4Var2 = bj4Var;
                        if (str5 != null) {
                            bj4Var.K(1642431772);
                            if (!z2a.w(str)) {
                                bj4Var.K(-704192764);
                                objF2 = bj4Var.f();
                                if (objF2 == obj) {
                                    bj4Var5 = bj4Var;
                                    obj3 = objF2;
                                    Object fu6Var4 = new fu6();
                                    bj4Var.C(fu6Var4);
                                    obj3 = fu6Var4;
                                }
                                bj4Var5 = bj4Var;
                                obj3 = objF2;
                                bj4Var.U(false);
                                mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                                bj4Var5 = bj4Var;
                            }
                            bj4Var5 = bj4Var;
                            bj4Var5.U(false);
                            bj4 bj4Var18 = bj4Var5;
                            mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var18, 0, 24960, 110590);
                            bj4Var2 = bj4Var18;
                            g2b g2bVar7 = g2b.a;
                        }
                        bj4Var2.U(false);
                        bj4Var2.K(1642448818);
                        bj4Var3 = bj4Var2;
                        if (l3 != null) {
                            jLongValue = l3.longValue();
                            bj4Var2.K(1642449084);
                            if (z2a.w(str)) {
                                bj4Var2.K(-704174460);
                                objF = bj4Var2.f();
                                obj2 = objF;
                                if (objF == obj) {
                                    Object y02Var6 = new y02(r1);
                                    bj4Var2.C(y02Var6);
                                    obj2 = y02Var6;
                                }
                                bj4Var2.U(false);
                                bj4 bj4Var19 = bj4Var2;
                                j = jLongValue;
                                mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var19, 6, 0, 131068);
                                bj4Var4 = bj4Var19;
                            } else {
                                bj4Var2.K(-704174460);
                                objF = bj4Var2.f();
                                obj2 = objF;
                                if (objF == obj) {
                                    Object y02Var7 = new y02(r1);
                                    bj4Var2.C(y02Var7);
                                    obj2 = y02Var7;
                                }
                                bj4Var2.U(false);
                                bj4 bj4Var110 = bj4Var2;
                                j = jLongValue;
                                mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var110, 6, 0, 131068);
                                bj4Var4 = bj4Var110;
                            }
                            bj4Var4.U(false);
                            if (0.5f <= 0.0d) {
                                sc5.a("invalid weight; must be greater than zero");
                            }
                            bj4 bj4Var111 = bj4Var4;
                            mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var111, 0, 24960, 110588);
                            bj4Var3 = bj4Var111;
                            g2b g2bVar8 = g2b.a;
                        }
                        bj4Var3.U(false);
                        bj4Var3.U(r1);
                        ox6Var3 = ox6Var2;
                        str6 = str5;
                        l4 = l3;
                        bj4Var6 = bj4Var3;
                    } else {
                        aVar = ox6.a.t;
                        if (i4 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i6 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i8 != 0) {
                            l3 = null;
                        } else {
                            l3 = l2;
                        }
                        wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                        ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        bj4VarO.K(1642417258);
                        if (list2.isEmpty()) {
                            List<AvatarWrapper> list7 = list2;
                            r1 = 1;
                            AvatarGroupKt.m19AvatarGroupJ8mCjc(list7, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                        } else {
                            r1 = 1;
                        }
                        bj4VarO.U(false);
                        if (1.0f <= 0.0d) {
                            sc5.a("invalid weight; must be greater than zero");
                        }
                        f = 1.0f;
                        if (1.0f > Float.MAX_VALUE) {
                            f = Float.MAX_VALUE;
                        }
                        mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                        bj4Var = bj4VarO;
                        bj4Var.K(1642431398);
                        obj = jt1.a.a;
                        bj4Var2 = bj4Var;
                        if (str5 != null) {
                            bj4Var.K(1642431772);
                            if (!z2a.w(str)) {
                                bj4Var.K(-704192764);
                                objF2 = bj4Var.f();
                                if (objF2 == obj) {
                                    bj4Var5 = bj4Var;
                                    obj3 = objF2;
                                    Object fu6Var5 = new fu6();
                                    bj4Var.C(fu6Var5);
                                    obj3 = fu6Var5;
                                }
                                bj4Var5 = bj4Var;
                                obj3 = objF2;
                                bj4Var.U(false);
                                mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                                bj4Var5 = bj4Var;
                            }
                            bj4Var5 = bj4Var;
                            bj4Var5.U(false);
                            bj4 bj4Var112 = bj4Var5;
                            mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var112, 0, 24960, 110590);
                            bj4Var2 = bj4Var112;
                            g2b g2bVar9 = g2b.a;
                        }
                        bj4Var2.U(false);
                        bj4Var2.K(1642448818);
                        bj4Var3 = bj4Var2;
                        if (l3 != null) {
                            jLongValue = l3.longValue();
                            bj4Var2.K(1642449084);
                            if (z2a.w(str)) {
                                bj4Var2.K(-704174460);
                                objF = bj4Var2.f();
                                obj2 = objF;
                                if (objF == obj) {
                                    Object y02Var8 = new y02(r1);
                                    bj4Var2.C(y02Var8);
                                    obj2 = y02Var8;
                                }
                                bj4Var2.U(false);
                                bj4 bj4Var113 = bj4Var2;
                                j = jLongValue;
                                mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var113, 6, 0, 131068);
                                bj4Var4 = bj4Var113;
                            } else {
                                bj4Var2.K(-704174460);
                                objF = bj4Var2.f();
                                obj2 = objF;
                                if (objF == obj) {
                                    Object y02Var9 = new y02(r1);
                                    bj4Var2.C(y02Var9);
                                    obj2 = y02Var9;
                                }
                                bj4Var2.U(false);
                                bj4 bj4Var114 = bj4Var2;
                                j = jLongValue;
                                mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var114, 6, 0, 131068);
                                bj4Var4 = bj4Var114;
                            }
                            bj4Var4.U(false);
                            if (0.5f <= 0.0d) {
                                sc5.a("invalid weight; must be greater than zero");
                            }
                            bj4 bj4Var115 = bj4Var4;
                            mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var115, 0, 24960, 110588);
                            bj4Var3 = bj4Var115;
                            g2b g2bVar10 = g2b.a;
                        }
                        bj4Var3.U(false);
                        bj4Var3.U(r1);
                        ox6Var3 = ox6Var2;
                        str6 = str5;
                        l4 = l3;
                        bj4Var6 = bj4Var3;
                    }
                    xj8VarW = bj4Var6.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: gu6
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj4, Object obj5) {
                                int iIntValue = ((Integer) obj5).intValue();
                                return MessageMetadataKt.MessageMetadata$lambda$7(list, str, ox6Var3, str6, l4, i, i2, (jt1) obj4, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                l2 = l;
                if ((i3 & 9363) == 9362) {
                    aVar = ox6.a.t;
                    if (i4 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i6 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i8 != 0) {
                        l3 = null;
                    } else {
                        l3 = l2;
                    }
                    wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                    ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(1642417258);
                    if (list2.isEmpty()) {
                        List<AvatarWrapper> list8 = list2;
                        r1 = 1;
                        AvatarGroupKt.m19AvatarGroupJ8mCjc(list8, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                    } else {
                        r1 = 1;
                    }
                    bj4VarO.U(false);
                    if (1.0f <= 0.0d) {
                        sc5.a("invalid weight; must be greater than zero");
                    }
                    f = 1.0f;
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    }
                    mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                    bj4Var = bj4VarO;
                    bj4Var.K(1642431398);
                    obj = jt1.a.a;
                    bj4Var2 = bj4Var;
                    if (str5 != null) {
                        bj4Var.K(1642431772);
                        if (!z2a.w(str)) {
                            bj4Var.K(-704192764);
                            objF2 = bj4Var.f();
                            if (objF2 == obj) {
                                bj4Var5 = bj4Var;
                                obj3 = objF2;
                                Object fu6Var6 = new fu6();
                                bj4Var.C(fu6Var6);
                                obj3 = fu6Var6;
                            }
                            bj4Var5 = bj4Var;
                            obj3 = objF2;
                            bj4Var.U(false);
                            mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                            bj4Var5 = bj4Var;
                        }
                        bj4Var5 = bj4Var;
                        bj4Var5.U(false);
                        bj4 bj4Var116 = bj4Var5;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var116, 0, 24960, 110590);
                        bj4Var2 = bj4Var116;
                        g2b g2bVar11 = g2b.a;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1642448818);
                    bj4Var3 = bj4Var2;
                    if (l3 != null) {
                        jLongValue = l3.longValue();
                        bj4Var2.K(1642449084);
                        if (z2a.w(str)) {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var10 = new y02(r1);
                                bj4Var2.C(y02Var10);
                                obj2 = y02Var10;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var117 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var117, 6, 0, 131068);
                            bj4Var4 = bj4Var117;
                        } else {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var11 = new y02(r1);
                                bj4Var2.C(y02Var11);
                                obj2 = y02Var11;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var118 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var118, 6, 0, 131068);
                            bj4Var4 = bj4Var118;
                        }
                        bj4Var4.U(false);
                        if (0.5f <= 0.0d) {
                            sc5.a("invalid weight; must be greater than zero");
                        }
                        bj4 bj4Var119 = bj4Var4;
                        mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var119, 0, 24960, 110588);
                        bj4Var3 = bj4Var119;
                        g2b g2bVar12 = g2b.a;
                    }
                    bj4Var3.U(false);
                    bj4Var3.U(r1);
                    ox6Var3 = ox6Var2;
                    str6 = str5;
                    l4 = l3;
                    bj4Var6 = bj4Var3;
                } else {
                    aVar = ox6.a.t;
                    if (i4 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i6 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i8 != 0) {
                        l3 = null;
                    } else {
                        l3 = l2;
                    }
                    wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                    ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(1642417258);
                    if (list2.isEmpty()) {
                        List<AvatarWrapper> list9 = list2;
                        r1 = 1;
                        AvatarGroupKt.m19AvatarGroupJ8mCjc(list9, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                    } else {
                        r1 = 1;
                    }
                    bj4VarO.U(false);
                    if (1.0f <= 0.0d) {
                        sc5.a("invalid weight; must be greater than zero");
                    }
                    f = 1.0f;
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    }
                    mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                    bj4Var = bj4VarO;
                    bj4Var.K(1642431398);
                    obj = jt1.a.a;
                    bj4Var2 = bj4Var;
                    if (str5 != null) {
                        bj4Var.K(1642431772);
                        if (!z2a.w(str)) {
                            bj4Var.K(-704192764);
                            objF2 = bj4Var.f();
                            if (objF2 == obj) {
                                bj4Var5 = bj4Var;
                                obj3 = objF2;
                                Object fu6Var7 = new fu6();
                                bj4Var.C(fu6Var7);
                                obj3 = fu6Var7;
                            }
                            bj4Var5 = bj4Var;
                            obj3 = objF2;
                            bj4Var.U(false);
                            mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                            bj4Var5 = bj4Var;
                        }
                        bj4Var5 = bj4Var;
                        bj4Var5.U(false);
                        bj4 bj4Var1110 = bj4Var5;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var1110, 0, 24960, 110590);
                        bj4Var2 = bj4Var1110;
                        g2b g2bVar13 = g2b.a;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1642448818);
                    bj4Var3 = bj4Var2;
                    if (l3 != null) {
                        jLongValue = l3.longValue();
                        bj4Var2.K(1642449084);
                        if (z2a.w(str)) {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var12 = new y02(r1);
                                bj4Var2.C(y02Var12);
                                obj2 = y02Var12;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var1111 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var1111, 6, 0, 131068);
                            bj4Var4 = bj4Var1111;
                        } else {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var13 = new y02(r1);
                                bj4Var2.C(y02Var13);
                                obj2 = y02Var13;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var1112 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var1112, 6, 0, 131068);
                            bj4Var4 = bj4Var1112;
                        }
                        bj4Var4.U(false);
                        if (0.5f <= 0.0d) {
                            sc5.a("invalid weight; must be greater than zero");
                        }
                        bj4 bj4Var1113 = bj4Var4;
                        mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var1113, 0, 24960, 110588);
                        bj4Var3 = bj4Var1113;
                        g2b g2bVar14 = g2b.a;
                    }
                    bj4Var3.U(false);
                    bj4Var3.U(r1);
                    ox6Var3 = ox6Var2;
                    str6 = str5;
                    l4 = l3;
                    bj4Var6 = bj4Var3;
                }
                xj8VarW = bj4Var6.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: gu6
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj4, Object obj5) {
                            int iIntValue = ((Integer) obj5).intValue();
                            return MessageMetadataKt.MessageMetadata$lambda$7(list, str, ox6Var3, str6, l4, i, i2, (jt1) obj4, iIntValue);
                        }
                    };
                }
            }
            i3 |= 384;
            ox6Var2 = ox6Var;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    str4 = str2;
                    if (bj4VarO.J(str4)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        l2 = l;
                        if (bj4VarO.J(l2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) == 9362) {
                        aVar = ox6.a.t;
                        if (i4 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i6 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i8 != 0) {
                            l3 = null;
                        } else {
                            l3 = l2;
                        }
                        wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                        ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        bj4VarO.K(1642417258);
                        if (list2.isEmpty()) {
                            List<AvatarWrapper> list10 = list2;
                            r1 = 1;
                            AvatarGroupKt.m19AvatarGroupJ8mCjc(list10, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                        } else {
                            r1 = 1;
                        }
                        bj4VarO.U(false);
                        if (1.0f <= 0.0d) {
                            sc5.a("invalid weight; must be greater than zero");
                        }
                        f = 1.0f;
                        if (1.0f > Float.MAX_VALUE) {
                            f = Float.MAX_VALUE;
                        }
                        mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                        bj4Var = bj4VarO;
                        bj4Var.K(1642431398);
                        obj = jt1.a.a;
                        bj4Var2 = bj4Var;
                        if (str5 != null) {
                            bj4Var.K(1642431772);
                            if (!z2a.w(str)) {
                                bj4Var.K(-704192764);
                                objF2 = bj4Var.f();
                                if (objF2 == obj) {
                                    bj4Var5 = bj4Var;
                                    obj3 = objF2;
                                    Object fu6Var8 = new fu6();
                                    bj4Var.C(fu6Var8);
                                    obj3 = fu6Var8;
                                }
                                bj4Var5 = bj4Var;
                                obj3 = objF2;
                                bj4Var.U(false);
                                mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                                bj4Var5 = bj4Var;
                            }
                            bj4Var5 = bj4Var;
                            bj4Var5.U(false);
                            bj4 bj4Var1114 = bj4Var5;
                            mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var1114, 0, 24960, 110590);
                            bj4Var2 = bj4Var1114;
                            g2b g2bVar15 = g2b.a;
                        }
                        bj4Var2.U(false);
                        bj4Var2.K(1642448818);
                        bj4Var3 = bj4Var2;
                        if (l3 != null) {
                            jLongValue = l3.longValue();
                            bj4Var2.K(1642449084);
                            if (z2a.w(str)) {
                                bj4Var2.K(-704174460);
                                objF = bj4Var2.f();
                                obj2 = objF;
                                if (objF == obj) {
                                    Object y02Var14 = new y02(r1);
                                    bj4Var2.C(y02Var14);
                                    obj2 = y02Var14;
                                }
                                bj4Var2.U(false);
                                bj4 bj4Var1115 = bj4Var2;
                                j = jLongValue;
                                mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var1115, 6, 0, 131068);
                                bj4Var4 = bj4Var1115;
                            } else {
                                bj4Var2.K(-704174460);
                                objF = bj4Var2.f();
                                obj2 = objF;
                                if (objF == obj) {
                                    Object y02Var15 = new y02(r1);
                                    bj4Var2.C(y02Var15);
                                    obj2 = y02Var15;
                                }
                                bj4Var2.U(false);
                                bj4 bj4Var1116 = bj4Var2;
                                j = jLongValue;
                                mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var1116, 6, 0, 131068);
                                bj4Var4 = bj4Var1116;
                            }
                            bj4Var4.U(false);
                            if (0.5f <= 0.0d) {
                                sc5.a("invalid weight; must be greater than zero");
                            }
                            bj4 bj4Var1117 = bj4Var4;
                            mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var1117, 0, 24960, 110588);
                            bj4Var3 = bj4Var1117;
                            g2b g2bVar16 = g2b.a;
                        }
                        bj4Var3.U(false);
                        bj4Var3.U(r1);
                        ox6Var3 = ox6Var2;
                        str6 = str5;
                        l4 = l3;
                        bj4Var6 = bj4Var3;
                    } else {
                        aVar = ox6.a.t;
                        if (i4 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i6 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i8 != 0) {
                            l3 = null;
                        } else {
                            l3 = l2;
                        }
                        wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                        ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        bj4VarO.K(1642417258);
                        if (list2.isEmpty()) {
                            List<AvatarWrapper> list11 = list2;
                            r1 = 1;
                            AvatarGroupKt.m19AvatarGroupJ8mCjc(list11, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                        } else {
                            r1 = 1;
                        }
                        bj4VarO.U(false);
                        if (1.0f <= 0.0d) {
                            sc5.a("invalid weight; must be greater than zero");
                        }
                        f = 1.0f;
                        if (1.0f > Float.MAX_VALUE) {
                            f = Float.MAX_VALUE;
                        }
                        mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                        bj4Var = bj4VarO;
                        bj4Var.K(1642431398);
                        obj = jt1.a.a;
                        bj4Var2 = bj4Var;
                        if (str5 != null) {
                            bj4Var.K(1642431772);
                            if (!z2a.w(str)) {
                                bj4Var.K(-704192764);
                                objF2 = bj4Var.f();
                                if (objF2 == obj) {
                                    bj4Var5 = bj4Var;
                                    obj3 = objF2;
                                    Object fu6Var9 = new fu6();
                                    bj4Var.C(fu6Var9);
                                    obj3 = fu6Var9;
                                }
                                bj4Var5 = bj4Var;
                                obj3 = objF2;
                                bj4Var.U(false);
                                mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                                bj4Var5 = bj4Var;
                            }
                            bj4Var5 = bj4Var;
                            bj4Var5.U(false);
                            bj4 bj4Var1118 = bj4Var5;
                            mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var1118, 0, 24960, 110590);
                            bj4Var2 = bj4Var1118;
                            g2b g2bVar17 = g2b.a;
                        }
                        bj4Var2.U(false);
                        bj4Var2.K(1642448818);
                        bj4Var3 = bj4Var2;
                        if (l3 != null) {
                            jLongValue = l3.longValue();
                            bj4Var2.K(1642449084);
                            if (z2a.w(str)) {
                                bj4Var2.K(-704174460);
                                objF = bj4Var2.f();
                                obj2 = objF;
                                if (objF == obj) {
                                    Object y02Var16 = new y02(r1);
                                    bj4Var2.C(y02Var16);
                                    obj2 = y02Var16;
                                }
                                bj4Var2.U(false);
                                bj4 bj4Var1119 = bj4Var2;
                                j = jLongValue;
                                mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var1119, 6, 0, 131068);
                                bj4Var4 = bj4Var1119;
                            } else {
                                bj4Var2.K(-704174460);
                                objF = bj4Var2.f();
                                obj2 = objF;
                                if (objF == obj) {
                                    Object y02Var17 = new y02(r1);
                                    bj4Var2.C(y02Var17);
                                    obj2 = y02Var17;
                                }
                                bj4Var2.U(false);
                                bj4 bj4Var11110 = bj4Var2;
                                j = jLongValue;
                                mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var11110, 6, 0, 131068);
                                bj4Var4 = bj4Var11110;
                            }
                            bj4Var4.U(false);
                            if (0.5f <= 0.0d) {
                                sc5.a("invalid weight; must be greater than zero");
                            }
                            bj4 bj4Var11111 = bj4Var4;
                            mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var11111, 0, 24960, 110588);
                            bj4Var3 = bj4Var11111;
                            g2b g2bVar18 = g2b.a;
                        }
                        bj4Var3.U(false);
                        bj4Var3.U(r1);
                        ox6Var3 = ox6Var2;
                        str6 = str5;
                        l4 = l3;
                        bj4Var6 = bj4Var3;
                    }
                    xj8VarW = bj4Var6.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: gu6
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj4, Object obj5) {
                                int iIntValue = ((Integer) obj5).intValue();
                                return MessageMetadataKt.MessageMetadata$lambda$7(list, str, ox6Var3, str6, l4, i, i2, (jt1) obj4, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                l2 = l;
                if ((i3 & 9363) == 9362) {
                    aVar = ox6.a.t;
                    if (i4 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i6 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i8 != 0) {
                        l3 = null;
                    } else {
                        l3 = l2;
                    }
                    wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                    ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(1642417258);
                    if (list2.isEmpty()) {
                        List<AvatarWrapper> list12 = list2;
                        r1 = 1;
                        AvatarGroupKt.m19AvatarGroupJ8mCjc(list12, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                    } else {
                        r1 = 1;
                    }
                    bj4VarO.U(false);
                    if (1.0f <= 0.0d) {
                        sc5.a("invalid weight; must be greater than zero");
                    }
                    f = 1.0f;
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    }
                    mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                    bj4Var = bj4VarO;
                    bj4Var.K(1642431398);
                    obj = jt1.a.a;
                    bj4Var2 = bj4Var;
                    if (str5 != null) {
                        bj4Var.K(1642431772);
                        if (!z2a.w(str)) {
                            bj4Var.K(-704192764);
                            objF2 = bj4Var.f();
                            if (objF2 == obj) {
                                bj4Var5 = bj4Var;
                                obj3 = objF2;
                                Object fu6Var10 = new fu6();
                                bj4Var.C(fu6Var10);
                                obj3 = fu6Var10;
                            }
                            bj4Var5 = bj4Var;
                            obj3 = objF2;
                            bj4Var.U(false);
                            mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                            bj4Var5 = bj4Var;
                        }
                        bj4Var5 = bj4Var;
                        bj4Var5.U(false);
                        bj4 bj4Var11112 = bj4Var5;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var11112, 0, 24960, 110590);
                        bj4Var2 = bj4Var11112;
                        g2b g2bVar19 = g2b.a;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1642448818);
                    bj4Var3 = bj4Var2;
                    if (l3 != null) {
                        jLongValue = l3.longValue();
                        bj4Var2.K(1642449084);
                        if (z2a.w(str)) {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var18 = new y02(r1);
                                bj4Var2.C(y02Var18);
                                obj2 = y02Var18;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var11113 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var11113, 6, 0, 131068);
                            bj4Var4 = bj4Var11113;
                        } else {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var19 = new y02(r1);
                                bj4Var2.C(y02Var19);
                                obj2 = y02Var19;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var11114 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var11114, 6, 0, 131068);
                            bj4Var4 = bj4Var11114;
                        }
                        bj4Var4.U(false);
                        if (0.5f <= 0.0d) {
                            sc5.a("invalid weight; must be greater than zero");
                        }
                        bj4 bj4Var11115 = bj4Var4;
                        mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var11115, 0, 24960, 110588);
                        bj4Var3 = bj4Var11115;
                        g2b g2bVar110 = g2b.a;
                    }
                    bj4Var3.U(false);
                    bj4Var3.U(r1);
                    ox6Var3 = ox6Var2;
                    str6 = str5;
                    l4 = l3;
                    bj4Var6 = bj4Var3;
                } else {
                    aVar = ox6.a.t;
                    if (i4 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i6 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i8 != 0) {
                        l3 = null;
                    } else {
                        l3 = l2;
                    }
                    wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                    ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(1642417258);
                    if (list2.isEmpty()) {
                        List<AvatarWrapper> list13 = list2;
                        r1 = 1;
                        AvatarGroupKt.m19AvatarGroupJ8mCjc(list13, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                    } else {
                        r1 = 1;
                    }
                    bj4VarO.U(false);
                    if (1.0f <= 0.0d) {
                        sc5.a("invalid weight; must be greater than zero");
                    }
                    f = 1.0f;
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    }
                    mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                    bj4Var = bj4VarO;
                    bj4Var.K(1642431398);
                    obj = jt1.a.a;
                    bj4Var2 = bj4Var;
                    if (str5 != null) {
                        bj4Var.K(1642431772);
                        if (!z2a.w(str)) {
                            bj4Var.K(-704192764);
                            objF2 = bj4Var.f();
                            if (objF2 == obj) {
                                bj4Var5 = bj4Var;
                                obj3 = objF2;
                                Object fu6Var11 = new fu6();
                                bj4Var.C(fu6Var11);
                                obj3 = fu6Var11;
                            }
                            bj4Var5 = bj4Var;
                            obj3 = objF2;
                            bj4Var.U(false);
                            mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                            bj4Var5 = bj4Var;
                        }
                        bj4Var5 = bj4Var;
                        bj4Var5.U(false);
                        bj4 bj4Var11116 = bj4Var5;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var11116, 0, 24960, 110590);
                        bj4Var2 = bj4Var11116;
                        g2b g2bVar111 = g2b.a;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1642448818);
                    bj4Var3 = bj4Var2;
                    if (l3 != null) {
                        jLongValue = l3.longValue();
                        bj4Var2.K(1642449084);
                        if (z2a.w(str)) {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var110 = new y02(r1);
                                bj4Var2.C(y02Var110);
                                obj2 = y02Var110;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var11117 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var11117, 6, 0, 131068);
                            bj4Var4 = bj4Var11117;
                        } else {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var111 = new y02(r1);
                                bj4Var2.C(y02Var111);
                                obj2 = y02Var111;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var11118 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var11118, 6, 0, 131068);
                            bj4Var4 = bj4Var11118;
                        }
                        bj4Var4.U(false);
                        if (0.5f <= 0.0d) {
                            sc5.a("invalid weight; must be greater than zero");
                        }
                        bj4 bj4Var11119 = bj4Var4;
                        mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var11119, 0, 24960, 110588);
                        bj4Var3 = bj4Var11119;
                        g2b g2bVar112 = g2b.a;
                    }
                    bj4Var3.U(false);
                    bj4Var3.U(r1);
                    ox6Var3 = ox6Var2;
                    str6 = str5;
                    l4 = l3;
                    bj4Var6 = bj4Var3;
                }
                xj8VarW = bj4Var6.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: gu6
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj4, Object obj5) {
                            int iIntValue = ((Integer) obj5).intValue();
                            return MessageMetadataKt.MessageMetadata$lambda$7(list, str, ox6Var3, str6, l4, i, i2, (jt1) obj4, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            str4 = str2;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    l2 = l;
                    if (bj4VarO.J(l2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) == 9362) {
                    aVar = ox6.a.t;
                    if (i4 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i6 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i8 != 0) {
                        l3 = null;
                    } else {
                        l3 = l2;
                    }
                    wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                    ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(1642417258);
                    if (list2.isEmpty()) {
                        List<AvatarWrapper> list14 = list2;
                        r1 = 1;
                        AvatarGroupKt.m19AvatarGroupJ8mCjc(list14, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                    } else {
                        r1 = 1;
                    }
                    bj4VarO.U(false);
                    if (1.0f <= 0.0d) {
                        sc5.a("invalid weight; must be greater than zero");
                    }
                    f = 1.0f;
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    }
                    mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                    bj4Var = bj4VarO;
                    bj4Var.K(1642431398);
                    obj = jt1.a.a;
                    bj4Var2 = bj4Var;
                    if (str5 != null) {
                        bj4Var.K(1642431772);
                        if (!z2a.w(str)) {
                            bj4Var.K(-704192764);
                            objF2 = bj4Var.f();
                            if (objF2 == obj) {
                                bj4Var5 = bj4Var;
                                obj3 = objF2;
                                Object fu6Var12 = new fu6();
                                bj4Var.C(fu6Var12);
                                obj3 = fu6Var12;
                            }
                            bj4Var5 = bj4Var;
                            obj3 = objF2;
                            bj4Var.U(false);
                            mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                            bj4Var5 = bj4Var;
                        }
                        bj4Var5 = bj4Var;
                        bj4Var5.U(false);
                        bj4 bj4Var111110 = bj4Var5;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var111110, 0, 24960, 110590);
                        bj4Var2 = bj4Var111110;
                        g2b g2bVar113 = g2b.a;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1642448818);
                    bj4Var3 = bj4Var2;
                    if (l3 != null) {
                        jLongValue = l3.longValue();
                        bj4Var2.K(1642449084);
                        if (z2a.w(str)) {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var112 = new y02(r1);
                                bj4Var2.C(y02Var112);
                                obj2 = y02Var112;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var111111 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var111111, 6, 0, 131068);
                            bj4Var4 = bj4Var111111;
                        } else {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var113 = new y02(r1);
                                bj4Var2.C(y02Var113);
                                obj2 = y02Var113;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var111112 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var111112, 6, 0, 131068);
                            bj4Var4 = bj4Var111112;
                        }
                        bj4Var4.U(false);
                        if (0.5f <= 0.0d) {
                            sc5.a("invalid weight; must be greater than zero");
                        }
                        bj4 bj4Var111113 = bj4Var4;
                        mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var111113, 0, 24960, 110588);
                        bj4Var3 = bj4Var111113;
                        g2b g2bVar114 = g2b.a;
                    }
                    bj4Var3.U(false);
                    bj4Var3.U(r1);
                    ox6Var3 = ox6Var2;
                    str6 = str5;
                    l4 = l3;
                    bj4Var6 = bj4Var3;
                } else {
                    aVar = ox6.a.t;
                    if (i4 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i6 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i8 != 0) {
                        l3 = null;
                    } else {
                        l3 = l2;
                    }
                    wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                    ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(1642417258);
                    if (list2.isEmpty()) {
                        List<AvatarWrapper> list15 = list2;
                        r1 = 1;
                        AvatarGroupKt.m19AvatarGroupJ8mCjc(list15, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                    } else {
                        r1 = 1;
                    }
                    bj4VarO.U(false);
                    if (1.0f <= 0.0d) {
                        sc5.a("invalid weight; must be greater than zero");
                    }
                    f = 1.0f;
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    }
                    mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                    bj4Var = bj4VarO;
                    bj4Var.K(1642431398);
                    obj = jt1.a.a;
                    bj4Var2 = bj4Var;
                    if (str5 != null) {
                        bj4Var.K(1642431772);
                        if (!z2a.w(str)) {
                            bj4Var.K(-704192764);
                            objF2 = bj4Var.f();
                            if (objF2 == obj) {
                                bj4Var5 = bj4Var;
                                obj3 = objF2;
                                Object fu6Var13 = new fu6();
                                bj4Var.C(fu6Var13);
                                obj3 = fu6Var13;
                            }
                            bj4Var5 = bj4Var;
                            obj3 = objF2;
                            bj4Var.U(false);
                            mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                            bj4Var5 = bj4Var;
                        }
                        bj4Var5 = bj4Var;
                        bj4Var5.U(false);
                        bj4 bj4Var111114 = bj4Var5;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var111114, 0, 24960, 110590);
                        bj4Var2 = bj4Var111114;
                        g2b g2bVar115 = g2b.a;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1642448818);
                    bj4Var3 = bj4Var2;
                    if (l3 != null) {
                        jLongValue = l3.longValue();
                        bj4Var2.K(1642449084);
                        if (z2a.w(str)) {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var114 = new y02(r1);
                                bj4Var2.C(y02Var114);
                                obj2 = y02Var114;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var111115 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var111115, 6, 0, 131068);
                            bj4Var4 = bj4Var111115;
                        } else {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var115 = new y02(r1);
                                bj4Var2.C(y02Var115);
                                obj2 = y02Var115;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var111116 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var111116, 6, 0, 131068);
                            bj4Var4 = bj4Var111116;
                        }
                        bj4Var4.U(false);
                        if (0.5f <= 0.0d) {
                            sc5.a("invalid weight; must be greater than zero");
                        }
                        bj4 bj4Var111117 = bj4Var4;
                        mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var111117, 0, 24960, 110588);
                        bj4Var3 = bj4Var111117;
                        g2b g2bVar116 = g2b.a;
                    }
                    bj4Var3.U(false);
                    bj4Var3.U(r1);
                    ox6Var3 = ox6Var2;
                    str6 = str5;
                    l4 = l3;
                    bj4Var6 = bj4Var3;
                }
                xj8VarW = bj4Var6.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: gu6
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj4, Object obj5) {
                            int iIntValue = ((Integer) obj5).intValue();
                            return MessageMetadataKt.MessageMetadata$lambda$7(list, str, ox6Var3, str6, l4, i, i2, (jt1) obj4, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            l2 = l;
            if ((i3 & 9363) == 9362) {
                aVar = ox6.a.t;
                if (i4 != 0) {
                    ox6Var2 = aVar;
                }
                if (i6 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i8 != 0) {
                    l3 = null;
                } else {
                    l3 = l2;
                }
                wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(1642417258);
                if (list2.isEmpty()) {
                    List<AvatarWrapper> list16 = list2;
                    r1 = 1;
                    AvatarGroupKt.m19AvatarGroupJ8mCjc(list16, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                } else {
                    r1 = 1;
                }
                bj4VarO.U(false);
                if (1.0f <= 0.0d) {
                    sc5.a("invalid weight; must be greater than zero");
                }
                f = 1.0f;
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                }
                mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                bj4Var = bj4VarO;
                bj4Var.K(1642431398);
                obj = jt1.a.a;
                bj4Var2 = bj4Var;
                if (str5 != null) {
                    bj4Var.K(1642431772);
                    if (!z2a.w(str)) {
                        bj4Var.K(-704192764);
                        objF2 = bj4Var.f();
                        if (objF2 == obj) {
                            bj4Var5 = bj4Var;
                            obj3 = objF2;
                            Object fu6Var14 = new fu6();
                            bj4Var.C(fu6Var14);
                            obj3 = fu6Var14;
                        }
                        bj4Var5 = bj4Var;
                        obj3 = objF2;
                        bj4Var.U(false);
                        mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                        bj4Var5 = bj4Var;
                    }
                    bj4Var5 = bj4Var;
                    bj4Var5.U(false);
                    bj4 bj4Var111118 = bj4Var5;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var111118, 0, 24960, 110590);
                    bj4Var2 = bj4Var111118;
                    g2b g2bVar117 = g2b.a;
                }
                bj4Var2.U(false);
                bj4Var2.K(1642448818);
                bj4Var3 = bj4Var2;
                if (l3 != null) {
                    jLongValue = l3.longValue();
                    bj4Var2.K(1642449084);
                    if (z2a.w(str)) {
                        bj4Var2.K(-704174460);
                        objF = bj4Var2.f();
                        obj2 = objF;
                        if (objF == obj) {
                            Object y02Var116 = new y02(r1);
                            bj4Var2.C(y02Var116);
                            obj2 = y02Var116;
                        }
                        bj4Var2.U(false);
                        bj4 bj4Var111119 = bj4Var2;
                        j = jLongValue;
                        mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var111119, 6, 0, 131068);
                        bj4Var4 = bj4Var111119;
                    } else {
                        bj4Var2.K(-704174460);
                        objF = bj4Var2.f();
                        obj2 = objF;
                        if (objF == obj) {
                            Object y02Var117 = new y02(r1);
                            bj4Var2.C(y02Var117);
                            obj2 = y02Var117;
                        }
                        bj4Var2.U(false);
                        bj4 bj4Var1111110 = bj4Var2;
                        j = jLongValue;
                        mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var1111110, 6, 0, 131068);
                        bj4Var4 = bj4Var1111110;
                    }
                    bj4Var4.U(false);
                    if (0.5f <= 0.0d) {
                        sc5.a("invalid weight; must be greater than zero");
                    }
                    bj4 bj4Var1111111 = bj4Var4;
                    mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var1111111, 0, 24960, 110588);
                    bj4Var3 = bj4Var1111111;
                    g2b g2bVar118 = g2b.a;
                }
                bj4Var3.U(false);
                bj4Var3.U(r1);
                ox6Var3 = ox6Var2;
                str6 = str5;
                l4 = l3;
                bj4Var6 = bj4Var3;
            } else {
                aVar = ox6.a.t;
                if (i4 != 0) {
                    ox6Var2 = aVar;
                }
                if (i6 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i8 != 0) {
                    l3 = null;
                } else {
                    l3 = l2;
                }
                wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(1642417258);
                if (list2.isEmpty()) {
                    List<AvatarWrapper> list17 = list2;
                    r1 = 1;
                    AvatarGroupKt.m19AvatarGroupJ8mCjc(list17, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                } else {
                    r1 = 1;
                }
                bj4VarO.U(false);
                if (1.0f <= 0.0d) {
                    sc5.a("invalid weight; must be greater than zero");
                }
                f = 1.0f;
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                }
                mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                bj4Var = bj4VarO;
                bj4Var.K(1642431398);
                obj = jt1.a.a;
                bj4Var2 = bj4Var;
                if (str5 != null) {
                    bj4Var.K(1642431772);
                    if (!z2a.w(str)) {
                        bj4Var.K(-704192764);
                        objF2 = bj4Var.f();
                        if (objF2 == obj) {
                            bj4Var5 = bj4Var;
                            obj3 = objF2;
                            Object fu6Var15 = new fu6();
                            bj4Var.C(fu6Var15);
                            obj3 = fu6Var15;
                        }
                        bj4Var5 = bj4Var;
                        obj3 = objF2;
                        bj4Var.U(false);
                        mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                        bj4Var5 = bj4Var;
                    }
                    bj4Var5 = bj4Var;
                    bj4Var5.U(false);
                    bj4 bj4Var1111112 = bj4Var5;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var1111112, 0, 24960, 110590);
                    bj4Var2 = bj4Var1111112;
                    g2b g2bVar119 = g2b.a;
                }
                bj4Var2.U(false);
                bj4Var2.K(1642448818);
                bj4Var3 = bj4Var2;
                if (l3 != null) {
                    jLongValue = l3.longValue();
                    bj4Var2.K(1642449084);
                    if (z2a.w(str)) {
                        bj4Var2.K(-704174460);
                        objF = bj4Var2.f();
                        obj2 = objF;
                        if (objF == obj) {
                            Object y02Var118 = new y02(r1);
                            bj4Var2.C(y02Var118);
                            obj2 = y02Var118;
                        }
                        bj4Var2.U(false);
                        bj4 bj4Var1111113 = bj4Var2;
                        j = jLongValue;
                        mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var1111113, 6, 0, 131068);
                        bj4Var4 = bj4Var1111113;
                    } else {
                        bj4Var2.K(-704174460);
                        objF = bj4Var2.f();
                        obj2 = objF;
                        if (objF == obj) {
                            Object y02Var119 = new y02(r1);
                            bj4Var2.C(y02Var119);
                            obj2 = y02Var119;
                        }
                        bj4Var2.U(false);
                        bj4 bj4Var1111114 = bj4Var2;
                        j = jLongValue;
                        mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var1111114, 6, 0, 131068);
                        bj4Var4 = bj4Var1111114;
                    }
                    bj4Var4.U(false);
                    if (0.5f <= 0.0d) {
                        sc5.a("invalid weight; must be greater than zero");
                    }
                    bj4 bj4Var1111115 = bj4Var4;
                    mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var1111115, 0, 24960, 110588);
                    bj4Var3 = bj4Var1111115;
                    g2b g2bVar1110 = g2b.a;
                }
                bj4Var3.U(false);
                bj4Var3.U(r1);
                ox6Var3 = ox6Var2;
                str6 = str5;
                l4 = l3;
                bj4Var6 = bj4Var3;
            }
            xj8VarW = bj4Var6.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: gu6
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj4, Object obj5) {
                        int iIntValue = ((Integer) obj5).intValue();
                        return MessageMetadataKt.MessageMetadata$lambda$7(list, str, ox6Var3, str6, l4, i, i2, (jt1) obj4, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        str3 = str;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                ox6Var2 = ox6Var;
                if (bj4VarO.J(ox6Var2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    str4 = str2;
                    if (bj4VarO.J(str4)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        l2 = l;
                        if (bj4VarO.J(l2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) == 9362) {
                        aVar = ox6.a.t;
                        if (i4 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i6 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i8 != 0) {
                            l3 = null;
                        } else {
                            l3 = l2;
                        }
                        wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                        ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        bj4VarO.K(1642417258);
                        if (list2.isEmpty()) {
                            List<AvatarWrapper> list18 = list2;
                            r1 = 1;
                            AvatarGroupKt.m19AvatarGroupJ8mCjc(list18, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                        } else {
                            r1 = 1;
                        }
                        bj4VarO.U(false);
                        if (1.0f <= 0.0d) {
                            sc5.a("invalid weight; must be greater than zero");
                        }
                        f = 1.0f;
                        if (1.0f > Float.MAX_VALUE) {
                            f = Float.MAX_VALUE;
                        }
                        mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                        bj4Var = bj4VarO;
                        bj4Var.K(1642431398);
                        obj = jt1.a.a;
                        bj4Var2 = bj4Var;
                        if (str5 != null) {
                            bj4Var.K(1642431772);
                            if (!z2a.w(str)) {
                                bj4Var.K(-704192764);
                                objF2 = bj4Var.f();
                                if (objF2 == obj) {
                                    bj4Var5 = bj4Var;
                                    obj3 = objF2;
                                    Object fu6Var16 = new fu6();
                                    bj4Var.C(fu6Var16);
                                    obj3 = fu6Var16;
                                }
                                bj4Var5 = bj4Var;
                                obj3 = objF2;
                                bj4Var.U(false);
                                mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                                bj4Var5 = bj4Var;
                            }
                            bj4Var5 = bj4Var;
                            bj4Var5.U(false);
                            bj4 bj4Var1111116 = bj4Var5;
                            mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var1111116, 0, 24960, 110590);
                            bj4Var2 = bj4Var1111116;
                            g2b g2bVar1111 = g2b.a;
                        }
                        bj4Var2.U(false);
                        bj4Var2.K(1642448818);
                        bj4Var3 = bj4Var2;
                        if (l3 != null) {
                            jLongValue = l3.longValue();
                            bj4Var2.K(1642449084);
                            if (z2a.w(str)) {
                                bj4Var2.K(-704174460);
                                objF = bj4Var2.f();
                                obj2 = objF;
                                if (objF == obj) {
                                    Object y02Var1110 = new y02(r1);
                                    bj4Var2.C(y02Var1110);
                                    obj2 = y02Var1110;
                                }
                                bj4Var2.U(false);
                                bj4 bj4Var1111117 = bj4Var2;
                                j = jLongValue;
                                mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var1111117, 6, 0, 131068);
                                bj4Var4 = bj4Var1111117;
                            } else {
                                bj4Var2.K(-704174460);
                                objF = bj4Var2.f();
                                obj2 = objF;
                                if (objF == obj) {
                                    Object y02Var1111 = new y02(r1);
                                    bj4Var2.C(y02Var1111);
                                    obj2 = y02Var1111;
                                }
                                bj4Var2.U(false);
                                bj4 bj4Var1111118 = bj4Var2;
                                j = jLongValue;
                                mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var1111118, 6, 0, 131068);
                                bj4Var4 = bj4Var1111118;
                            }
                            bj4Var4.U(false);
                            if (0.5f <= 0.0d) {
                                sc5.a("invalid weight; must be greater than zero");
                            }
                            bj4 bj4Var1111119 = bj4Var4;
                            mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var1111119, 0, 24960, 110588);
                            bj4Var3 = bj4Var1111119;
                            g2b g2bVar1112 = g2b.a;
                        }
                        bj4Var3.U(false);
                        bj4Var3.U(r1);
                        ox6Var3 = ox6Var2;
                        str6 = str5;
                        l4 = l3;
                        bj4Var6 = bj4Var3;
                    } else {
                        aVar = ox6.a.t;
                        if (i4 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i6 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i8 != 0) {
                            l3 = null;
                        } else {
                            l3 = l2;
                        }
                        wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                        ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        bj4VarO.K(1642417258);
                        if (list2.isEmpty()) {
                            List<AvatarWrapper> list19 = list2;
                            r1 = 1;
                            AvatarGroupKt.m19AvatarGroupJ8mCjc(list19, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                        } else {
                            r1 = 1;
                        }
                        bj4VarO.U(false);
                        if (1.0f <= 0.0d) {
                            sc5.a("invalid weight; must be greater than zero");
                        }
                        f = 1.0f;
                        if (1.0f > Float.MAX_VALUE) {
                            f = Float.MAX_VALUE;
                        }
                        mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                        bj4Var = bj4VarO;
                        bj4Var.K(1642431398);
                        obj = jt1.a.a;
                        bj4Var2 = bj4Var;
                        if (str5 != null) {
                            bj4Var.K(1642431772);
                            if (!z2a.w(str)) {
                                bj4Var.K(-704192764);
                                objF2 = bj4Var.f();
                                if (objF2 == obj) {
                                    bj4Var5 = bj4Var;
                                    obj3 = objF2;
                                    Object fu6Var17 = new fu6();
                                    bj4Var.C(fu6Var17);
                                    obj3 = fu6Var17;
                                }
                                bj4Var5 = bj4Var;
                                obj3 = objF2;
                                bj4Var.U(false);
                                mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                                bj4Var5 = bj4Var;
                            }
                            bj4Var5 = bj4Var;
                            bj4Var5.U(false);
                            bj4 bj4Var11111110 = bj4Var5;
                            mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var11111110, 0, 24960, 110590);
                            bj4Var2 = bj4Var11111110;
                            g2b g2bVar1113 = g2b.a;
                        }
                        bj4Var2.U(false);
                        bj4Var2.K(1642448818);
                        bj4Var3 = bj4Var2;
                        if (l3 != null) {
                            jLongValue = l3.longValue();
                            bj4Var2.K(1642449084);
                            if (z2a.w(str)) {
                                bj4Var2.K(-704174460);
                                objF = bj4Var2.f();
                                obj2 = objF;
                                if (objF == obj) {
                                    Object y02Var1112 = new y02(r1);
                                    bj4Var2.C(y02Var1112);
                                    obj2 = y02Var1112;
                                }
                                bj4Var2.U(false);
                                bj4 bj4Var11111111 = bj4Var2;
                                j = jLongValue;
                                mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var11111111, 6, 0, 131068);
                                bj4Var4 = bj4Var11111111;
                            } else {
                                bj4Var2.K(-704174460);
                                objF = bj4Var2.f();
                                obj2 = objF;
                                if (objF == obj) {
                                    Object y02Var1113 = new y02(r1);
                                    bj4Var2.C(y02Var1113);
                                    obj2 = y02Var1113;
                                }
                                bj4Var2.U(false);
                                bj4 bj4Var11111112 = bj4Var2;
                                j = jLongValue;
                                mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var11111112, 6, 0, 131068);
                                bj4Var4 = bj4Var11111112;
                            }
                            bj4Var4.U(false);
                            if (0.5f <= 0.0d) {
                                sc5.a("invalid weight; must be greater than zero");
                            }
                            bj4 bj4Var11111113 = bj4Var4;
                            mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var11111113, 0, 24960, 110588);
                            bj4Var3 = bj4Var11111113;
                            g2b g2bVar1114 = g2b.a;
                        }
                        bj4Var3.U(false);
                        bj4Var3.U(r1);
                        ox6Var3 = ox6Var2;
                        str6 = str5;
                        l4 = l3;
                        bj4Var6 = bj4Var3;
                    }
                    xj8VarW = bj4Var6.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: gu6
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj4, Object obj5) {
                                int iIntValue = ((Integer) obj5).intValue();
                                return MessageMetadataKt.MessageMetadata$lambda$7(list, str, ox6Var3, str6, l4, i, i2, (jt1) obj4, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                l2 = l;
                if ((i3 & 9363) == 9362) {
                    aVar = ox6.a.t;
                    if (i4 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i6 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i8 != 0) {
                        l3 = null;
                    } else {
                        l3 = l2;
                    }
                    wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                    ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(1642417258);
                    if (list2.isEmpty()) {
                        List<AvatarWrapper> list110 = list2;
                        r1 = 1;
                        AvatarGroupKt.m19AvatarGroupJ8mCjc(list110, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                    } else {
                        r1 = 1;
                    }
                    bj4VarO.U(false);
                    if (1.0f <= 0.0d) {
                        sc5.a("invalid weight; must be greater than zero");
                    }
                    f = 1.0f;
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    }
                    mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                    bj4Var = bj4VarO;
                    bj4Var.K(1642431398);
                    obj = jt1.a.a;
                    bj4Var2 = bj4Var;
                    if (str5 != null) {
                        bj4Var.K(1642431772);
                        if (!z2a.w(str)) {
                            bj4Var.K(-704192764);
                            objF2 = bj4Var.f();
                            if (objF2 == obj) {
                                bj4Var5 = bj4Var;
                                obj3 = objF2;
                                Object fu6Var18 = new fu6();
                                bj4Var.C(fu6Var18);
                                obj3 = fu6Var18;
                            }
                            bj4Var5 = bj4Var;
                            obj3 = objF2;
                            bj4Var.U(false);
                            mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                            bj4Var5 = bj4Var;
                        }
                        bj4Var5 = bj4Var;
                        bj4Var5.U(false);
                        bj4 bj4Var11111114 = bj4Var5;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var11111114, 0, 24960, 110590);
                        bj4Var2 = bj4Var11111114;
                        g2b g2bVar1115 = g2b.a;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1642448818);
                    bj4Var3 = bj4Var2;
                    if (l3 != null) {
                        jLongValue = l3.longValue();
                        bj4Var2.K(1642449084);
                        if (z2a.w(str)) {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var1114 = new y02(r1);
                                bj4Var2.C(y02Var1114);
                                obj2 = y02Var1114;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var11111115 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var11111115, 6, 0, 131068);
                            bj4Var4 = bj4Var11111115;
                        } else {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var1115 = new y02(r1);
                                bj4Var2.C(y02Var1115);
                                obj2 = y02Var1115;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var11111116 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var11111116, 6, 0, 131068);
                            bj4Var4 = bj4Var11111116;
                        }
                        bj4Var4.U(false);
                        if (0.5f <= 0.0d) {
                            sc5.a("invalid weight; must be greater than zero");
                        }
                        bj4 bj4Var11111117 = bj4Var4;
                        mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var11111117, 0, 24960, 110588);
                        bj4Var3 = bj4Var11111117;
                        g2b g2bVar1116 = g2b.a;
                    }
                    bj4Var3.U(false);
                    bj4Var3.U(r1);
                    ox6Var3 = ox6Var2;
                    str6 = str5;
                    l4 = l3;
                    bj4Var6 = bj4Var3;
                } else {
                    aVar = ox6.a.t;
                    if (i4 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i6 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i8 != 0) {
                        l3 = null;
                    } else {
                        l3 = l2;
                    }
                    wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                    ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(1642417258);
                    if (list2.isEmpty()) {
                        List<AvatarWrapper> list111 = list2;
                        r1 = 1;
                        AvatarGroupKt.m19AvatarGroupJ8mCjc(list111, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                    } else {
                        r1 = 1;
                    }
                    bj4VarO.U(false);
                    if (1.0f <= 0.0d) {
                        sc5.a("invalid weight; must be greater than zero");
                    }
                    f = 1.0f;
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    }
                    mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                    bj4Var = bj4VarO;
                    bj4Var.K(1642431398);
                    obj = jt1.a.a;
                    bj4Var2 = bj4Var;
                    if (str5 != null) {
                        bj4Var.K(1642431772);
                        if (!z2a.w(str)) {
                            bj4Var.K(-704192764);
                            objF2 = bj4Var.f();
                            if (objF2 == obj) {
                                bj4Var5 = bj4Var;
                                obj3 = objF2;
                                Object fu6Var19 = new fu6();
                                bj4Var.C(fu6Var19);
                                obj3 = fu6Var19;
                            }
                            bj4Var5 = bj4Var;
                            obj3 = objF2;
                            bj4Var.U(false);
                            mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                            bj4Var5 = bj4Var;
                        }
                        bj4Var5 = bj4Var;
                        bj4Var5.U(false);
                        bj4 bj4Var11111118 = bj4Var5;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var11111118, 0, 24960, 110590);
                        bj4Var2 = bj4Var11111118;
                        g2b g2bVar1117 = g2b.a;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1642448818);
                    bj4Var3 = bj4Var2;
                    if (l3 != null) {
                        jLongValue = l3.longValue();
                        bj4Var2.K(1642449084);
                        if (z2a.w(str)) {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var1116 = new y02(r1);
                                bj4Var2.C(y02Var1116);
                                obj2 = y02Var1116;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var11111119 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var11111119, 6, 0, 131068);
                            bj4Var4 = bj4Var11111119;
                        } else {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var1117 = new y02(r1);
                                bj4Var2.C(y02Var1117);
                                obj2 = y02Var1117;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var111111110 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var111111110, 6, 0, 131068);
                            bj4Var4 = bj4Var111111110;
                        }
                        bj4Var4.U(false);
                        if (0.5f <= 0.0d) {
                            sc5.a("invalid weight; must be greater than zero");
                        }
                        bj4 bj4Var111111111 = bj4Var4;
                        mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var111111111, 0, 24960, 110588);
                        bj4Var3 = bj4Var111111111;
                        g2b g2bVar1118 = g2b.a;
                    }
                    bj4Var3.U(false);
                    bj4Var3.U(r1);
                    ox6Var3 = ox6Var2;
                    str6 = str5;
                    l4 = l3;
                    bj4Var6 = bj4Var3;
                }
                xj8VarW = bj4Var6.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: gu6
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj4, Object obj5) {
                            int iIntValue = ((Integer) obj5).intValue();
                            return MessageMetadataKt.MessageMetadata$lambda$7(list, str, ox6Var3, str6, l4, i, i2, (jt1) obj4, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            str4 = str2;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    l2 = l;
                    if (bj4VarO.J(l2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) == 9362) {
                    aVar = ox6.a.t;
                    if (i4 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i6 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i8 != 0) {
                        l3 = null;
                    } else {
                        l3 = l2;
                    }
                    wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                    ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(1642417258);
                    if (list2.isEmpty()) {
                        List<AvatarWrapper> list112 = list2;
                        r1 = 1;
                        AvatarGroupKt.m19AvatarGroupJ8mCjc(list112, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                    } else {
                        r1 = 1;
                    }
                    bj4VarO.U(false);
                    if (1.0f <= 0.0d) {
                        sc5.a("invalid weight; must be greater than zero");
                    }
                    f = 1.0f;
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    }
                    mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                    bj4Var = bj4VarO;
                    bj4Var.K(1642431398);
                    obj = jt1.a.a;
                    bj4Var2 = bj4Var;
                    if (str5 != null) {
                        bj4Var.K(1642431772);
                        if (!z2a.w(str)) {
                            bj4Var.K(-704192764);
                            objF2 = bj4Var.f();
                            if (objF2 == obj) {
                                bj4Var5 = bj4Var;
                                obj3 = objF2;
                                Object fu6Var110 = new fu6();
                                bj4Var.C(fu6Var110);
                                obj3 = fu6Var110;
                            }
                            bj4Var5 = bj4Var;
                            obj3 = objF2;
                            bj4Var.U(false);
                            mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                            bj4Var5 = bj4Var;
                        }
                        bj4Var5 = bj4Var;
                        bj4Var5.U(false);
                        bj4 bj4Var111111112 = bj4Var5;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var111111112, 0, 24960, 110590);
                        bj4Var2 = bj4Var111111112;
                        g2b g2bVar1119 = g2b.a;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1642448818);
                    bj4Var3 = bj4Var2;
                    if (l3 != null) {
                        jLongValue = l3.longValue();
                        bj4Var2.K(1642449084);
                        if (z2a.w(str)) {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var1118 = new y02(r1);
                                bj4Var2.C(y02Var1118);
                                obj2 = y02Var1118;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var111111113 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var111111113, 6, 0, 131068);
                            bj4Var4 = bj4Var111111113;
                        } else {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var1119 = new y02(r1);
                                bj4Var2.C(y02Var1119);
                                obj2 = y02Var1119;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var111111114 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var111111114, 6, 0, 131068);
                            bj4Var4 = bj4Var111111114;
                        }
                        bj4Var4.U(false);
                        if (0.5f <= 0.0d) {
                            sc5.a("invalid weight; must be greater than zero");
                        }
                        bj4 bj4Var111111115 = bj4Var4;
                        mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var111111115, 0, 24960, 110588);
                        bj4Var3 = bj4Var111111115;
                        g2b g2bVar11110 = g2b.a;
                    }
                    bj4Var3.U(false);
                    bj4Var3.U(r1);
                    ox6Var3 = ox6Var2;
                    str6 = str5;
                    l4 = l3;
                    bj4Var6 = bj4Var3;
                } else {
                    aVar = ox6.a.t;
                    if (i4 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i6 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i8 != 0) {
                        l3 = null;
                    } else {
                        l3 = l2;
                    }
                    wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                    ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(1642417258);
                    if (list2.isEmpty()) {
                        List<AvatarWrapper> list113 = list2;
                        r1 = 1;
                        AvatarGroupKt.m19AvatarGroupJ8mCjc(list113, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                    } else {
                        r1 = 1;
                    }
                    bj4VarO.U(false);
                    if (1.0f <= 0.0d) {
                        sc5.a("invalid weight; must be greater than zero");
                    }
                    f = 1.0f;
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    }
                    mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                    bj4Var = bj4VarO;
                    bj4Var.K(1642431398);
                    obj = jt1.a.a;
                    bj4Var2 = bj4Var;
                    if (str5 != null) {
                        bj4Var.K(1642431772);
                        if (!z2a.w(str)) {
                            bj4Var.K(-704192764);
                            objF2 = bj4Var.f();
                            if (objF2 == obj) {
                                bj4Var5 = bj4Var;
                                obj3 = objF2;
                                Object fu6Var111 = new fu6();
                                bj4Var.C(fu6Var111);
                                obj3 = fu6Var111;
                            }
                            bj4Var5 = bj4Var;
                            obj3 = objF2;
                            bj4Var.U(false);
                            mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                            bj4Var5 = bj4Var;
                        }
                        bj4Var5 = bj4Var;
                        bj4Var5.U(false);
                        bj4 bj4Var111111116 = bj4Var5;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var111111116, 0, 24960, 110590);
                        bj4Var2 = bj4Var111111116;
                        g2b g2bVar11111 = g2b.a;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1642448818);
                    bj4Var3 = bj4Var2;
                    if (l3 != null) {
                        jLongValue = l3.longValue();
                        bj4Var2.K(1642449084);
                        if (z2a.w(str)) {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var11110 = new y02(r1);
                                bj4Var2.C(y02Var11110);
                                obj2 = y02Var11110;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var111111117 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var111111117, 6, 0, 131068);
                            bj4Var4 = bj4Var111111117;
                        } else {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var11111 = new y02(r1);
                                bj4Var2.C(y02Var11111);
                                obj2 = y02Var11111;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var111111118 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var111111118, 6, 0, 131068);
                            bj4Var4 = bj4Var111111118;
                        }
                        bj4Var4.U(false);
                        if (0.5f <= 0.0d) {
                            sc5.a("invalid weight; must be greater than zero");
                        }
                        bj4 bj4Var111111119 = bj4Var4;
                        mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var111111119, 0, 24960, 110588);
                        bj4Var3 = bj4Var111111119;
                        g2b g2bVar11112 = g2b.a;
                    }
                    bj4Var3.U(false);
                    bj4Var3.U(r1);
                    ox6Var3 = ox6Var2;
                    str6 = str5;
                    l4 = l3;
                    bj4Var6 = bj4Var3;
                }
                xj8VarW = bj4Var6.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: gu6
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj4, Object obj5) {
                            int iIntValue = ((Integer) obj5).intValue();
                            return MessageMetadataKt.MessageMetadata$lambda$7(list, str, ox6Var3, str6, l4, i, i2, (jt1) obj4, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            l2 = l;
            if ((i3 & 9363) == 9362) {
                aVar = ox6.a.t;
                if (i4 != 0) {
                    ox6Var2 = aVar;
                }
                if (i6 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i8 != 0) {
                    l3 = null;
                } else {
                    l3 = l2;
                }
                wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(1642417258);
                if (list2.isEmpty()) {
                    List<AvatarWrapper> list114 = list2;
                    r1 = 1;
                    AvatarGroupKt.m19AvatarGroupJ8mCjc(list114, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                } else {
                    r1 = 1;
                }
                bj4VarO.U(false);
                if (1.0f <= 0.0d) {
                    sc5.a("invalid weight; must be greater than zero");
                }
                f = 1.0f;
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                }
                mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                bj4Var = bj4VarO;
                bj4Var.K(1642431398);
                obj = jt1.a.a;
                bj4Var2 = bj4Var;
                if (str5 != null) {
                    bj4Var.K(1642431772);
                    if (!z2a.w(str)) {
                        bj4Var.K(-704192764);
                        objF2 = bj4Var.f();
                        if (objF2 == obj) {
                            bj4Var5 = bj4Var;
                            obj3 = objF2;
                            Object fu6Var112 = new fu6();
                            bj4Var.C(fu6Var112);
                            obj3 = fu6Var112;
                        }
                        bj4Var5 = bj4Var;
                        obj3 = objF2;
                        bj4Var.U(false);
                        mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                        bj4Var5 = bj4Var;
                    }
                    bj4Var5 = bj4Var;
                    bj4Var5.U(false);
                    bj4 bj4Var1111111110 = bj4Var5;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var1111111110, 0, 24960, 110590);
                    bj4Var2 = bj4Var1111111110;
                    g2b g2bVar11113 = g2b.a;
                }
                bj4Var2.U(false);
                bj4Var2.K(1642448818);
                bj4Var3 = bj4Var2;
                if (l3 != null) {
                    jLongValue = l3.longValue();
                    bj4Var2.K(1642449084);
                    if (z2a.w(str)) {
                        bj4Var2.K(-704174460);
                        objF = bj4Var2.f();
                        obj2 = objF;
                        if (objF == obj) {
                            Object y02Var11112 = new y02(r1);
                            bj4Var2.C(y02Var11112);
                            obj2 = y02Var11112;
                        }
                        bj4Var2.U(false);
                        bj4 bj4Var1111111111 = bj4Var2;
                        j = jLongValue;
                        mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var1111111111, 6, 0, 131068);
                        bj4Var4 = bj4Var1111111111;
                    } else {
                        bj4Var2.K(-704174460);
                        objF = bj4Var2.f();
                        obj2 = objF;
                        if (objF == obj) {
                            Object y02Var11113 = new y02(r1);
                            bj4Var2.C(y02Var11113);
                            obj2 = y02Var11113;
                        }
                        bj4Var2.U(false);
                        bj4 bj4Var1111111112 = bj4Var2;
                        j = jLongValue;
                        mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var1111111112, 6, 0, 131068);
                        bj4Var4 = bj4Var1111111112;
                    }
                    bj4Var4.U(false);
                    if (0.5f <= 0.0d) {
                        sc5.a("invalid weight; must be greater than zero");
                    }
                    bj4 bj4Var1111111113 = bj4Var4;
                    mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var1111111113, 0, 24960, 110588);
                    bj4Var3 = bj4Var1111111113;
                    g2b g2bVar11114 = g2b.a;
                }
                bj4Var3.U(false);
                bj4Var3.U(r1);
                ox6Var3 = ox6Var2;
                str6 = str5;
                l4 = l3;
                bj4Var6 = bj4Var3;
            } else {
                aVar = ox6.a.t;
                if (i4 != 0) {
                    ox6Var2 = aVar;
                }
                if (i6 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i8 != 0) {
                    l3 = null;
                } else {
                    l3 = l2;
                }
                wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(1642417258);
                if (list2.isEmpty()) {
                    List<AvatarWrapper> list115 = list2;
                    r1 = 1;
                    AvatarGroupKt.m19AvatarGroupJ8mCjc(list115, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                } else {
                    r1 = 1;
                }
                bj4VarO.U(false);
                if (1.0f <= 0.0d) {
                    sc5.a("invalid weight; must be greater than zero");
                }
                f = 1.0f;
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                }
                mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                bj4Var = bj4VarO;
                bj4Var.K(1642431398);
                obj = jt1.a.a;
                bj4Var2 = bj4Var;
                if (str5 != null) {
                    bj4Var.K(1642431772);
                    if (!z2a.w(str)) {
                        bj4Var.K(-704192764);
                        objF2 = bj4Var.f();
                        if (objF2 == obj) {
                            bj4Var5 = bj4Var;
                            obj3 = objF2;
                            Object fu6Var113 = new fu6();
                            bj4Var.C(fu6Var113);
                            obj3 = fu6Var113;
                        }
                        bj4Var5 = bj4Var;
                        obj3 = objF2;
                        bj4Var.U(false);
                        mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                        bj4Var5 = bj4Var;
                    }
                    bj4Var5 = bj4Var;
                    bj4Var5.U(false);
                    bj4 bj4Var1111111114 = bj4Var5;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var1111111114, 0, 24960, 110590);
                    bj4Var2 = bj4Var1111111114;
                    g2b g2bVar11115 = g2b.a;
                }
                bj4Var2.U(false);
                bj4Var2.K(1642448818);
                bj4Var3 = bj4Var2;
                if (l3 != null) {
                    jLongValue = l3.longValue();
                    bj4Var2.K(1642449084);
                    if (z2a.w(str)) {
                        bj4Var2.K(-704174460);
                        objF = bj4Var2.f();
                        obj2 = objF;
                        if (objF == obj) {
                            Object y02Var11114 = new y02(r1);
                            bj4Var2.C(y02Var11114);
                            obj2 = y02Var11114;
                        }
                        bj4Var2.U(false);
                        bj4 bj4Var1111111115 = bj4Var2;
                        j = jLongValue;
                        mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var1111111115, 6, 0, 131068);
                        bj4Var4 = bj4Var1111111115;
                    } else {
                        bj4Var2.K(-704174460);
                        objF = bj4Var2.f();
                        obj2 = objF;
                        if (objF == obj) {
                            Object y02Var11115 = new y02(r1);
                            bj4Var2.C(y02Var11115);
                            obj2 = y02Var11115;
                        }
                        bj4Var2.U(false);
                        bj4 bj4Var1111111116 = bj4Var2;
                        j = jLongValue;
                        mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var1111111116, 6, 0, 131068);
                        bj4Var4 = bj4Var1111111116;
                    }
                    bj4Var4.U(false);
                    if (0.5f <= 0.0d) {
                        sc5.a("invalid weight; must be greater than zero");
                    }
                    bj4 bj4Var1111111117 = bj4Var4;
                    mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var1111111117, 0, 24960, 110588);
                    bj4Var3 = bj4Var1111111117;
                    g2b g2bVar11116 = g2b.a;
                }
                bj4Var3.U(false);
                bj4Var3.U(r1);
                ox6Var3 = ox6Var2;
                str6 = str5;
                l4 = l3;
                bj4Var6 = bj4Var3;
            }
            xj8VarW = bj4Var6.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: gu6
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj4, Object obj5) {
                        int iIntValue = ((Integer) obj5).intValue();
                        return MessageMetadataKt.MessageMetadata$lambda$7(list, str, ox6Var3, str6, l4, i, i2, (jt1) obj4, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        ox6Var2 = ox6Var;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                str4 = str2;
                if (bj4VarO.J(str4)) {
                    i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    l2 = l;
                    if (bj4VarO.J(l2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) == 9362) {
                    aVar = ox6.a.t;
                    if (i4 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i6 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i8 != 0) {
                        l3 = null;
                    } else {
                        l3 = l2;
                    }
                    wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                    ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(1642417258);
                    if (list2.isEmpty()) {
                        List<AvatarWrapper> list116 = list2;
                        r1 = 1;
                        AvatarGroupKt.m19AvatarGroupJ8mCjc(list116, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                    } else {
                        r1 = 1;
                    }
                    bj4VarO.U(false);
                    if (1.0f <= 0.0d) {
                        sc5.a("invalid weight; must be greater than zero");
                    }
                    f = 1.0f;
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    }
                    mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                    bj4Var = bj4VarO;
                    bj4Var.K(1642431398);
                    obj = jt1.a.a;
                    bj4Var2 = bj4Var;
                    if (str5 != null) {
                        bj4Var.K(1642431772);
                        if (!z2a.w(str)) {
                            bj4Var.K(-704192764);
                            objF2 = bj4Var.f();
                            if (objF2 == obj) {
                                bj4Var5 = bj4Var;
                                obj3 = objF2;
                                Object fu6Var114 = new fu6();
                                bj4Var.C(fu6Var114);
                                obj3 = fu6Var114;
                            }
                            bj4Var5 = bj4Var;
                            obj3 = objF2;
                            bj4Var.U(false);
                            mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                            bj4Var5 = bj4Var;
                        }
                        bj4Var5 = bj4Var;
                        bj4Var5.U(false);
                        bj4 bj4Var1111111118 = bj4Var5;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var1111111118, 0, 24960, 110590);
                        bj4Var2 = bj4Var1111111118;
                        g2b g2bVar11117 = g2b.a;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1642448818);
                    bj4Var3 = bj4Var2;
                    if (l3 != null) {
                        jLongValue = l3.longValue();
                        bj4Var2.K(1642449084);
                        if (z2a.w(str)) {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var11116 = new y02(r1);
                                bj4Var2.C(y02Var11116);
                                obj2 = y02Var11116;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var1111111119 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var1111111119, 6, 0, 131068);
                            bj4Var4 = bj4Var1111111119;
                        } else {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var11117 = new y02(r1);
                                bj4Var2.C(y02Var11117);
                                obj2 = y02Var11117;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var11111111110 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var11111111110, 6, 0, 131068);
                            bj4Var4 = bj4Var11111111110;
                        }
                        bj4Var4.U(false);
                        if (0.5f <= 0.0d) {
                            sc5.a("invalid weight; must be greater than zero");
                        }
                        bj4 bj4Var11111111111 = bj4Var4;
                        mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var11111111111, 0, 24960, 110588);
                        bj4Var3 = bj4Var11111111111;
                        g2b g2bVar11118 = g2b.a;
                    }
                    bj4Var3.U(false);
                    bj4Var3.U(r1);
                    ox6Var3 = ox6Var2;
                    str6 = str5;
                    l4 = l3;
                    bj4Var6 = bj4Var3;
                } else {
                    aVar = ox6.a.t;
                    if (i4 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i6 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i8 != 0) {
                        l3 = null;
                    } else {
                        l3 = l2;
                    }
                    wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                    ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(1642417258);
                    if (list2.isEmpty()) {
                        List<AvatarWrapper> list117 = list2;
                        r1 = 1;
                        AvatarGroupKt.m19AvatarGroupJ8mCjc(list117, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                    } else {
                        r1 = 1;
                    }
                    bj4VarO.U(false);
                    if (1.0f <= 0.0d) {
                        sc5.a("invalid weight; must be greater than zero");
                    }
                    f = 1.0f;
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    }
                    mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                    bj4Var = bj4VarO;
                    bj4Var.K(1642431398);
                    obj = jt1.a.a;
                    bj4Var2 = bj4Var;
                    if (str5 != null) {
                        bj4Var.K(1642431772);
                        if (!z2a.w(str)) {
                            bj4Var.K(-704192764);
                            objF2 = bj4Var.f();
                            if (objF2 == obj) {
                                bj4Var5 = bj4Var;
                                obj3 = objF2;
                                Object fu6Var115 = new fu6();
                                bj4Var.C(fu6Var115);
                                obj3 = fu6Var115;
                            }
                            bj4Var5 = bj4Var;
                            obj3 = objF2;
                            bj4Var.U(false);
                            mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                            bj4Var5 = bj4Var;
                        }
                        bj4Var5 = bj4Var;
                        bj4Var5.U(false);
                        bj4 bj4Var11111111112 = bj4Var5;
                        mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var11111111112, 0, 24960, 110590);
                        bj4Var2 = bj4Var11111111112;
                        g2b g2bVar11119 = g2b.a;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1642448818);
                    bj4Var3 = bj4Var2;
                    if (l3 != null) {
                        jLongValue = l3.longValue();
                        bj4Var2.K(1642449084);
                        if (z2a.w(str)) {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var11118 = new y02(r1);
                                bj4Var2.C(y02Var11118);
                                obj2 = y02Var11118;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var11111111113 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var11111111113, 6, 0, 131068);
                            bj4Var4 = bj4Var11111111113;
                        } else {
                            bj4Var2.K(-704174460);
                            objF = bj4Var2.f();
                            obj2 = objF;
                            if (objF == obj) {
                                Object y02Var11119 = new y02(r1);
                                bj4Var2.C(y02Var11119);
                                obj2 = y02Var11119;
                            }
                            bj4Var2.U(false);
                            bj4 bj4Var11111111114 = bj4Var2;
                            j = jLongValue;
                            mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var11111111114, 6, 0, 131068);
                            bj4Var4 = bj4Var11111111114;
                        }
                        bj4Var4.U(false);
                        if (0.5f <= 0.0d) {
                            sc5.a("invalid weight; must be greater than zero");
                        }
                        bj4 bj4Var11111111115 = bj4Var4;
                        mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var11111111115, 0, 24960, 110588);
                        bj4Var3 = bj4Var11111111115;
                        g2b g2bVar111110 = g2b.a;
                    }
                    bj4Var3.U(false);
                    bj4Var3.U(r1);
                    ox6Var3 = ox6Var2;
                    str6 = str5;
                    l4 = l3;
                    bj4Var6 = bj4Var3;
                }
                xj8VarW = bj4Var6.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: gu6
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj4, Object obj5) {
                            int iIntValue = ((Integer) obj5).intValue();
                            return MessageMetadataKt.MessageMetadata$lambda$7(list, str, ox6Var3, str6, l4, i, i2, (jt1) obj4, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            l2 = l;
            if ((i3 & 9363) == 9362) {
                aVar = ox6.a.t;
                if (i4 != 0) {
                    ox6Var2 = aVar;
                }
                if (i6 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i8 != 0) {
                    l3 = null;
                } else {
                    l3 = l2;
                }
                wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(1642417258);
                if (list2.isEmpty()) {
                    List<AvatarWrapper> list118 = list2;
                    r1 = 1;
                    AvatarGroupKt.m19AvatarGroupJ8mCjc(list118, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                } else {
                    r1 = 1;
                }
                bj4VarO.U(false);
                if (1.0f <= 0.0d) {
                    sc5.a("invalid weight; must be greater than zero");
                }
                f = 1.0f;
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                }
                mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                bj4Var = bj4VarO;
                bj4Var.K(1642431398);
                obj = jt1.a.a;
                bj4Var2 = bj4Var;
                if (str5 != null) {
                    bj4Var.K(1642431772);
                    if (!z2a.w(str)) {
                        bj4Var.K(-704192764);
                        objF2 = bj4Var.f();
                        if (objF2 == obj) {
                            bj4Var5 = bj4Var;
                            obj3 = objF2;
                            Object fu6Var116 = new fu6();
                            bj4Var.C(fu6Var116);
                            obj3 = fu6Var116;
                        }
                        bj4Var5 = bj4Var;
                        obj3 = objF2;
                        bj4Var.U(false);
                        mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                        bj4Var5 = bj4Var;
                    }
                    bj4Var5 = bj4Var;
                    bj4Var5.U(false);
                    bj4 bj4Var11111111116 = bj4Var5;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var11111111116, 0, 24960, 110590);
                    bj4Var2 = bj4Var11111111116;
                    g2b g2bVar111111 = g2b.a;
                }
                bj4Var2.U(false);
                bj4Var2.K(1642448818);
                bj4Var3 = bj4Var2;
                if (l3 != null) {
                    jLongValue = l3.longValue();
                    bj4Var2.K(1642449084);
                    if (z2a.w(str)) {
                        bj4Var2.K(-704174460);
                        objF = bj4Var2.f();
                        obj2 = objF;
                        if (objF == obj) {
                            Object y02Var111110 = new y02(r1);
                            bj4Var2.C(y02Var111110);
                            obj2 = y02Var111110;
                        }
                        bj4Var2.U(false);
                        bj4 bj4Var11111111117 = bj4Var2;
                        j = jLongValue;
                        mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var11111111117, 6, 0, 131068);
                        bj4Var4 = bj4Var11111111117;
                    } else {
                        bj4Var2.K(-704174460);
                        objF = bj4Var2.f();
                        obj2 = objF;
                        if (objF == obj) {
                            Object y02Var111111 = new y02(r1);
                            bj4Var2.C(y02Var111111);
                            obj2 = y02Var111111;
                        }
                        bj4Var2.U(false);
                        bj4 bj4Var11111111118 = bj4Var2;
                        j = jLongValue;
                        mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var11111111118, 6, 0, 131068);
                        bj4Var4 = bj4Var11111111118;
                    }
                    bj4Var4.U(false);
                    if (0.5f <= 0.0d) {
                        sc5.a("invalid weight; must be greater than zero");
                    }
                    bj4 bj4Var11111111119 = bj4Var4;
                    mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var11111111119, 0, 24960, 110588);
                    bj4Var3 = bj4Var11111111119;
                    g2b g2bVar111112 = g2b.a;
                }
                bj4Var3.U(false);
                bj4Var3.U(r1);
                ox6Var3 = ox6Var2;
                str6 = str5;
                l4 = l3;
                bj4Var6 = bj4Var3;
            } else {
                aVar = ox6.a.t;
                if (i4 != 0) {
                    ox6Var2 = aVar;
                }
                if (i6 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i8 != 0) {
                    l3 = null;
                } else {
                    l3 = l2;
                }
                wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(1642417258);
                if (list2.isEmpty()) {
                    List<AvatarWrapper> list119 = list2;
                    r1 = 1;
                    AvatarGroupKt.m19AvatarGroupJ8mCjc(list119, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                } else {
                    r1 = 1;
                }
                bj4VarO.U(false);
                if (1.0f <= 0.0d) {
                    sc5.a("invalid weight; must be greater than zero");
                }
                f = 1.0f;
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                }
                mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                bj4Var = bj4VarO;
                bj4Var.K(1642431398);
                obj = jt1.a.a;
                bj4Var2 = bj4Var;
                if (str5 != null) {
                    bj4Var.K(1642431772);
                    if (!z2a.w(str)) {
                        bj4Var.K(-704192764);
                        objF2 = bj4Var.f();
                        if (objF2 == obj) {
                            bj4Var5 = bj4Var;
                            obj3 = objF2;
                            Object fu6Var117 = new fu6();
                            bj4Var.C(fu6Var117);
                            obj3 = fu6Var117;
                        }
                        bj4Var5 = bj4Var;
                        obj3 = objF2;
                        bj4Var.U(false);
                        mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                        bj4Var5 = bj4Var;
                    }
                    bj4Var5 = bj4Var;
                    bj4Var5.U(false);
                    bj4 bj4Var111111111110 = bj4Var5;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var111111111110, 0, 24960, 110590);
                    bj4Var2 = bj4Var111111111110;
                    g2b g2bVar111113 = g2b.a;
                }
                bj4Var2.U(false);
                bj4Var2.K(1642448818);
                bj4Var3 = bj4Var2;
                if (l3 != null) {
                    jLongValue = l3.longValue();
                    bj4Var2.K(1642449084);
                    if (z2a.w(str)) {
                        bj4Var2.K(-704174460);
                        objF = bj4Var2.f();
                        obj2 = objF;
                        if (objF == obj) {
                            Object y02Var111112 = new y02(r1);
                            bj4Var2.C(y02Var111112);
                            obj2 = y02Var111112;
                        }
                        bj4Var2.U(false);
                        bj4 bj4Var111111111111 = bj4Var2;
                        j = jLongValue;
                        mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var111111111111, 6, 0, 131068);
                        bj4Var4 = bj4Var111111111111;
                    } else {
                        bj4Var2.K(-704174460);
                        objF = bj4Var2.f();
                        obj2 = objF;
                        if (objF == obj) {
                            Object y02Var111113 = new y02(r1);
                            bj4Var2.C(y02Var111113);
                            obj2 = y02Var111113;
                        }
                        bj4Var2.U(false);
                        bj4 bj4Var111111111112 = bj4Var2;
                        j = jLongValue;
                        mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var111111111112, 6, 0, 131068);
                        bj4Var4 = bj4Var111111111112;
                    }
                    bj4Var4.U(false);
                    if (0.5f <= 0.0d) {
                        sc5.a("invalid weight; must be greater than zero");
                    }
                    bj4 bj4Var111111111113 = bj4Var4;
                    mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var111111111113, 0, 24960, 110588);
                    bj4Var3 = bj4Var111111111113;
                    g2b g2bVar111114 = g2b.a;
                }
                bj4Var3.U(false);
                bj4Var3.U(r1);
                ox6Var3 = ox6Var2;
                str6 = str5;
                l4 = l3;
                bj4Var6 = bj4Var3;
            }
            xj8VarW = bj4Var6.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: gu6
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj4, Object obj5) {
                        int iIntValue = ((Integer) obj5).intValue();
                        return MessageMetadataKt.MessageMetadata$lambda$7(list, str, ox6Var3, str6, l4, i, i2, (jt1) obj4, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        str4 = str2;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                l2 = l;
                if (bj4VarO.J(l2)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i3 & 9363) == 9362) {
                aVar = ox6.a.t;
                if (i4 != 0) {
                    ox6Var2 = aVar;
                }
                if (i6 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i8 != 0) {
                    l3 = null;
                } else {
                    l3 = l2;
                }
                wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(1642417258);
                if (list2.isEmpty()) {
                    List<AvatarWrapper> list1110 = list2;
                    r1 = 1;
                    AvatarGroupKt.m19AvatarGroupJ8mCjc(list1110, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                } else {
                    r1 = 1;
                }
                bj4VarO.U(false);
                if (1.0f <= 0.0d) {
                    sc5.a("invalid weight; must be greater than zero");
                }
                f = 1.0f;
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                }
                mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                bj4Var = bj4VarO;
                bj4Var.K(1642431398);
                obj = jt1.a.a;
                bj4Var2 = bj4Var;
                if (str5 != null) {
                    bj4Var.K(1642431772);
                    if (!z2a.w(str)) {
                        bj4Var.K(-704192764);
                        objF2 = bj4Var.f();
                        if (objF2 == obj) {
                            bj4Var5 = bj4Var;
                            obj3 = objF2;
                            Object fu6Var118 = new fu6();
                            bj4Var.C(fu6Var118);
                            obj3 = fu6Var118;
                        }
                        bj4Var5 = bj4Var;
                        obj3 = objF2;
                        bj4Var.U(false);
                        mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                        bj4Var5 = bj4Var;
                    }
                    bj4Var5 = bj4Var;
                    bj4Var5.U(false);
                    bj4 bj4Var111111111114 = bj4Var5;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var111111111114, 0, 24960, 110590);
                    bj4Var2 = bj4Var111111111114;
                    g2b g2bVar111115 = g2b.a;
                }
                bj4Var2.U(false);
                bj4Var2.K(1642448818);
                bj4Var3 = bj4Var2;
                if (l3 != null) {
                    jLongValue = l3.longValue();
                    bj4Var2.K(1642449084);
                    if (z2a.w(str)) {
                        bj4Var2.K(-704174460);
                        objF = bj4Var2.f();
                        obj2 = objF;
                        if (objF == obj) {
                            Object y02Var111114 = new y02(r1);
                            bj4Var2.C(y02Var111114);
                            obj2 = y02Var111114;
                        }
                        bj4Var2.U(false);
                        bj4 bj4Var111111111115 = bj4Var2;
                        j = jLongValue;
                        mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var111111111115, 6, 0, 131068);
                        bj4Var4 = bj4Var111111111115;
                    } else {
                        bj4Var2.K(-704174460);
                        objF = bj4Var2.f();
                        obj2 = objF;
                        if (objF == obj) {
                            Object y02Var111115 = new y02(r1);
                            bj4Var2.C(y02Var111115);
                            obj2 = y02Var111115;
                        }
                        bj4Var2.U(false);
                        bj4 bj4Var111111111116 = bj4Var2;
                        j = jLongValue;
                        mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var111111111116, 6, 0, 131068);
                        bj4Var4 = bj4Var111111111116;
                    }
                    bj4Var4.U(false);
                    if (0.5f <= 0.0d) {
                        sc5.a("invalid weight; must be greater than zero");
                    }
                    bj4 bj4Var111111111117 = bj4Var4;
                    mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var111111111117, 0, 24960, 110588);
                    bj4Var3 = bj4Var111111111117;
                    g2b g2bVar111116 = g2b.a;
                }
                bj4Var3.U(false);
                bj4Var3.U(r1);
                ox6Var3 = ox6Var2;
                str6 = str5;
                l4 = l3;
                bj4Var6 = bj4Var3;
            } else {
                aVar = ox6.a.t;
                if (i4 != 0) {
                    ox6Var2 = aVar;
                }
                if (i6 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i8 != 0) {
                    l3 = null;
                } else {
                    l3 = l2;
                }
                wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
                ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(1642417258);
                if (list2.isEmpty()) {
                    List<AvatarWrapper> list1111 = list2;
                    r1 = 1;
                    AvatarGroupKt.m19AvatarGroupJ8mCjc(list1111, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
                } else {
                    r1 = 1;
                }
                bj4VarO.U(false);
                if (1.0f <= 0.0d) {
                    sc5.a("invalid weight; must be greater than zero");
                }
                f = 1.0f;
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                }
                mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
                bj4Var = bj4VarO;
                bj4Var.K(1642431398);
                obj = jt1.a.a;
                bj4Var2 = bj4Var;
                if (str5 != null) {
                    bj4Var.K(1642431772);
                    if (!z2a.w(str)) {
                        bj4Var.K(-704192764);
                        objF2 = bj4Var.f();
                        if (objF2 == obj) {
                            bj4Var5 = bj4Var;
                            obj3 = objF2;
                            Object fu6Var119 = new fu6();
                            bj4Var.C(fu6Var119);
                            obj3 = fu6Var119;
                        }
                        bj4Var5 = bj4Var;
                        obj3 = objF2;
                        bj4Var.U(false);
                        mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                        bj4Var5 = bj4Var;
                    }
                    bj4Var5 = bj4Var;
                    bj4Var5.U(false);
                    bj4 bj4Var111111111118 = bj4Var5;
                    mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var111111111118, 0, 24960, 110590);
                    bj4Var2 = bj4Var111111111118;
                    g2b g2bVar111117 = g2b.a;
                }
                bj4Var2.U(false);
                bj4Var2.K(1642448818);
                bj4Var3 = bj4Var2;
                if (l3 != null) {
                    jLongValue = l3.longValue();
                    bj4Var2.K(1642449084);
                    if (z2a.w(str)) {
                        bj4Var2.K(-704174460);
                        objF = bj4Var2.f();
                        obj2 = objF;
                        if (objF == obj) {
                            Object y02Var111116 = new y02(r1);
                            bj4Var2.C(y02Var111116);
                            obj2 = y02Var111116;
                        }
                        bj4Var2.U(false);
                        bj4 bj4Var111111111119 = bj4Var2;
                        j = jLongValue;
                        mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var111111111119, 6, 0, 131068);
                        bj4Var4 = bj4Var111111111119;
                    } else {
                        bj4Var2.K(-704174460);
                        objF = bj4Var2.f();
                        obj2 = objF;
                        if (objF == obj) {
                            Object y02Var111117 = new y02(r1);
                            bj4Var2.C(y02Var111117);
                            obj2 = y02Var111117;
                        }
                        bj4Var2.U(false);
                        bj4 bj4Var1111111111110 = bj4Var2;
                        j = jLongValue;
                        mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var1111111111110, 6, 0, 131068);
                        bj4Var4 = bj4Var1111111111110;
                    }
                    bj4Var4.U(false);
                    if (0.5f <= 0.0d) {
                        sc5.a("invalid weight; must be greater than zero");
                    }
                    bj4 bj4Var1111111111111 = bj4Var4;
                    mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var1111111111111, 0, 24960, 110588);
                    bj4Var3 = bj4Var1111111111111;
                    g2b g2bVar111118 = g2b.a;
                }
                bj4Var3.U(false);
                bj4Var3.U(r1);
                ox6Var3 = ox6Var2;
                str6 = str5;
                l4 = l3;
                bj4Var6 = bj4Var3;
            }
            xj8VarW = bj4Var6.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: gu6
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj4, Object obj5) {
                        int iIntValue = ((Integer) obj5).intValue();
                        return MessageMetadataKt.MessageMetadata$lambda$7(list, str, ox6Var3, str6, l4, i, i2, (jt1) obj4, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        l2 = l;
        if ((i3 & 9363) == 9362) {
            aVar = ox6.a.t;
            if (i4 != 0) {
                ox6Var2 = aVar;
            }
            if (i6 != 0) {
                str5 = null;
            } else {
                str5 = str4;
            }
            if (i8 != 0) {
                l3 = null;
            } else {
                l3 = l2;
            }
            wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
            ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var2);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(1642417258);
            if (list2.isEmpty()) {
                List<AvatarWrapper> list1112 = list2;
                r1 = 1;
                AvatarGroupKt.m19AvatarGroupJ8mCjc(list1112, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
            } else {
                r1 = 1;
            }
            bj4VarO.U(false);
            if (1.0f <= 0.0d) {
                sc5.a("invalid weight; must be greater than zero");
            }
            f = 1.0f;
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
            bj4Var = bj4VarO;
            bj4Var.K(1642431398);
            obj = jt1.a.a;
            bj4Var2 = bj4Var;
            if (str5 != null) {
                bj4Var.K(1642431772);
                if (!z2a.w(str)) {
                    bj4Var.K(-704192764);
                    objF2 = bj4Var.f();
                    if (objF2 == obj) {
                        bj4Var5 = bj4Var;
                        obj3 = objF2;
                        Object fu6Var1110 = new fu6();
                        bj4Var.C(fu6Var1110);
                        obj3 = fu6Var1110;
                    }
                    bj4Var5 = bj4Var;
                    obj3 = objF2;
                    bj4Var.U(false);
                    mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                    bj4Var5 = bj4Var;
                }
                bj4Var5 = bj4Var;
                bj4Var5.U(false);
                bj4 bj4Var1111111111112 = bj4Var5;
                mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var1111111111112, 0, 24960, 110590);
                bj4Var2 = bj4Var1111111111112;
                g2b g2bVar111119 = g2b.a;
            }
            bj4Var2.U(false);
            bj4Var2.K(1642448818);
            bj4Var3 = bj4Var2;
            if (l3 != null) {
                jLongValue = l3.longValue();
                bj4Var2.K(1642449084);
                if (z2a.w(str)) {
                    bj4Var2.K(-704174460);
                    objF = bj4Var2.f();
                    obj2 = objF;
                    if (objF == obj) {
                        Object y02Var111118 = new y02(r1);
                        bj4Var2.C(y02Var111118);
                        obj2 = y02Var111118;
                    }
                    bj4Var2.U(false);
                    bj4 bj4Var1111111111113 = bj4Var2;
                    j = jLongValue;
                    mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var1111111111113, 6, 0, 131068);
                    bj4Var4 = bj4Var1111111111113;
                } else {
                    bj4Var2.K(-704174460);
                    objF = bj4Var2.f();
                    obj2 = objF;
                    if (objF == obj) {
                        Object y02Var111119 = new y02(r1);
                        bj4Var2.C(y02Var111119);
                        obj2 = y02Var111119;
                    }
                    bj4Var2.U(false);
                    bj4 bj4Var1111111111114 = bj4Var2;
                    j = jLongValue;
                    mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var1111111111114, 6, 0, 131068);
                    bj4Var4 = bj4Var1111111111114;
                }
                bj4Var4.U(false);
                if (0.5f <= 0.0d) {
                    sc5.a("invalid weight; must be greater than zero");
                }
                bj4 bj4Var1111111111115 = bj4Var4;
                mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var1111111111115, 0, 24960, 110588);
                bj4Var3 = bj4Var1111111111115;
                g2b g2bVar1111110 = g2b.a;
            }
            bj4Var3.U(false);
            bj4Var3.U(r1);
            ox6Var3 = ox6Var2;
            str6 = str5;
            l4 = l3;
            bj4Var6 = bj4Var3;
        } else {
            aVar = ox6.a.t;
            if (i4 != 0) {
                ox6Var2 = aVar;
            }
            if (i6 != 0) {
                str5 = null;
            } else {
                str5 = str4;
            }
            if (i8 != 0) {
                l3 = null;
            } else {
                l3 = l2;
            }
            wjaVarA = wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211);
            ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var2);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(1642417258);
            if (list2.isEmpty()) {
                List<AvatarWrapper> list1113 = list2;
                r1 = 1;
                AvatarGroupKt.m19AvatarGroupJ8mCjc(list1113, eo7.m(aVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f, 0L, bj4VarO, (i3 & 14) | 432, 8);
            } else {
                r1 = 1;
            }
            bj4VarO.U(false);
            if (1.0f <= 0.0d) {
                sc5.a("invalid weight; must be greater than zero");
            }
            f = 1.0f;
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            mia.b(str3, new qs5(false, f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, (i3 >> 3) & 14, 24960, 110588);
            bj4Var = bj4VarO;
            bj4Var.K(1642431398);
            obj = jt1.a.a;
            bj4Var2 = bj4Var;
            if (str5 != null) {
                bj4Var.K(1642431772);
                if (!z2a.w(str)) {
                    bj4Var.K(-704192764);
                    objF2 = bj4Var.f();
                    if (objF2 == obj) {
                        bj4Var5 = bj4Var;
                        obj3 = objF2;
                        Object fu6Var1111 = new fu6();
                        bj4Var.C(fu6Var1111);
                        obj3 = fu6Var1111;
                    }
                    bj4Var5 = bj4Var;
                    obj3 = objF2;
                    bj4Var.U(false);
                    mia.b("•", pb9.b(aVar, false, (oh4) obj3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var, 6, 0, 131068);
                    bj4Var5 = bj4Var;
                }
                bj4Var5 = bj4Var;
                bj4Var5.U(false);
                bj4 bj4Var1111111111116 = bj4Var5;
                mia.b(str5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var1111111111116, 0, 24960, 110590);
                bj4Var2 = bj4Var1111111111116;
                g2b g2bVar1111111 = g2b.a;
            }
            bj4Var2.U(false);
            bj4Var2.K(1642448818);
            bj4Var3 = bj4Var2;
            if (l3 != null) {
                jLongValue = l3.longValue();
                bj4Var2.K(1642449084);
                if (z2a.w(str)) {
                    bj4Var2.K(-704174460);
                    objF = bj4Var2.f();
                    obj2 = objF;
                    if (objF == obj) {
                        Object y02Var1111110 = new y02(r1);
                        bj4Var2.C(y02Var1111110);
                        obj2 = y02Var1111110;
                    }
                    bj4Var2.U(false);
                    bj4 bj4Var1111111111117 = bj4Var2;
                    j = jLongValue;
                    mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var1111111111117, 6, 0, 131068);
                    bj4Var4 = bj4Var1111111111117;
                } else {
                    bj4Var2.K(-704174460);
                    objF = bj4Var2.f();
                    obj2 = objF;
                    if (objF == obj) {
                        Object y02Var1111111 = new y02(r1);
                        bj4Var2.C(y02Var1111111);
                        obj2 = y02Var1111111;
                    }
                    bj4Var2.U(false);
                    bj4 bj4Var1111111111118 = bj4Var2;
                    j = jLongValue;
                    mia.b("•", pb9.b(aVar, false, (oh4) obj2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4Var1111111111118, 6, 0, 131068);
                    bj4Var4 = bj4Var1111111111118;
                }
                bj4Var4.U(false);
                if (0.5f <= 0.0d) {
                    sc5.a("invalid weight; must be greater than zero");
                }
                bj4 bj4Var1111111111119 = bj4Var4;
                mia.b(TimeFormatterExtKt.formattedDateFromLong(j, (Context) bj4Var4.F(AndroidCompositionLocals_androidKt.b)), new qs5(false, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4Var1111111111119, 0, 24960, 110588);
                bj4Var3 = bj4Var1111111111119;
                g2b g2bVar1111112 = g2b.a;
            }
            bj4Var3.U(false);
            bj4Var3.U(r1);
            ox6Var3 = ox6Var2;
            str6 = str5;
            l4 = l3;
            bj4Var6 = bj4Var3;
        }
        xj8VarW = bj4Var6.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: gu6
                @Override // defpackage.ci4
                public final Object invoke(Object obj4, Object obj5) {
                    int iIntValue = ((Integer) obj5).intValue();
                    return MessageMetadataKt.MessageMetadata$lambda$7(list, str, ox6Var3, str6, l4, i, i2, (jt1) obj4, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageMetadata$lambda$6$lambda$2$lambda$1$lambda$0(hc9 hc9Var) {
        hc9Var.getClass();
        ec9.b(BuildConfig.FLAVOR, hc9Var);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageMetadata$lambda$6$lambda$5$lambda$4$lambda$3(hc9 hc9Var) {
        hc9Var.getClass();
        ec9.b(BuildConfig.FLAVOR, hc9Var);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageMetadata$lambda$7(List list, String str, ox6 ox6Var, String str2, Long l, int i, int i2, jt1 jt1Var, int i3) {
        MessageMetadata(list, str, ox6Var, str2, l, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void MessageMetadataLongTextPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-764241754);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageMetadataKt.INSTANCE.m136getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new w95(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageMetadataLongTextPreview$lambda$9(int i, jt1 jt1Var, int i2) {
        MessageMetadataLongTextPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void MessageMetadataPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1316869201);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageMetadataKt.INSTANCE.m134getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new oc1(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageMetadataPreview$lambda$8(int i, jt1 jt1Var, int i2) {
        MessageMetadataPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
