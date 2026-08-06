package io.intercom.android.sdk.m5.conversation.ui.components;

import defpackage.aj1;
import defpackage.b72;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cs9;
import defpackage.di;
import defpackage.e22;
import defpackage.f22;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h37;
import defpackage.hf3;
import defpackage.hh1;
import defpackage.ir9;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.kk;
import defpackage.kp;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.th1;
import defpackage.u;
import defpackage.uh1;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.yr9;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.ui.components.ConversationKebabKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationKebabKt {
    /* JADX WARN: Code duplicated, block: B:102:0x0195 A[LOOP:1: B:100:0x0191->B:102:0x0195, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:103:0x019d  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a7 A[LOOP:2: B:106:0x01a3->B:108:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x01b7 A[LOOP:3: B:110:0x01b3->B:112:0x01b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:121:0x020d  */
    /* JADX WARN: Code duplicated, block: B:122:0x020f  */
    /* JADX WARN: Code duplicated, block: B:125:0x021b  */
    /* JADX WARN: Code duplicated, block: B:126:0x021d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0225 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x0227  */
    /* JADX WARN: Code duplicated, block: B:132:0x025f  */
    /* JADX WARN: Code duplicated, block: B:134:0x027d  */
    /* JADX WARN: Code duplicated, block: B:137:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:140:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:144:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:147:0x02fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x0300  */
    /* JADX WARN: Code duplicated, block: B:151:0x0357  */
    /* JADX WARN: Code duplicated, block: B:152:0x0362  */
    /* JADX WARN: Code duplicated, block: B:157:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:159:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:161:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:163:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x01bf A[EDGE_INSN: B:166:0x01bf->B:113:0x01bf BREAK  A[LOOP:1: B:100:0x0191->B:102:0x0195], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x01bf A[EDGE_INSN: B:168:0x01bf->B:113:0x01bf BREAK  A[LOOP:3: B:110:0x01b3->B:112:0x01b7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:76:0x0115  */
    /* JADX WARN: Code duplicated, block: B:78:0x011e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0122  */
    /* JADX WARN: Code duplicated, block: B:83:0x0152  */
    /* JADX WARN: Code duplicated, block: B:89:0x0164  */
    /* JADX WARN: Code duplicated, block: B:90:0x016b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0171  */
    /* JADX WARN: Code duplicated, block: B:94:0x0179  */
    /* JADX WARN: Code duplicated, block: B:97:0x0183  */
    /* JADX WARN: Code duplicated, block: B:99:0x018e  */
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
    /* JADX INFO: renamed from: ConversationKebab-cf5BqRc, reason: not valid java name */
    public static final void m147ConversationKebabcf5BqRc(List<? extends HeaderMenuItem> list, oh4<? super HeaderMenuItem, g2b> oh4Var, long j, oh4<? super MetricData, g2b> oh4Var2, jt1 jt1Var, final int i, final int i2) {
        List<? extends HeaderMenuItem> list2;
        int i3;
        oh4<? super HeaderMenuItem, g2b> oh4Var3;
        int i4;
        long j2;
        int i5;
        int i6;
        oh4<? super MetricData, g2b> oh4Var4;
        int i7;
        List<? extends HeaderMenuItem> list3;
        jt1.a.C0187a c0187a;
        int i8;
        oh4<? super HeaderMenuItem, g2b> oh4Var5;
        oh4<? super MetricData, g2b> oh4Var6;
        ny8 ny8VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6.a aVar;
        ox6 ox6VarC;
        qr5.a aVar2;
        Iterator<T> it;
        Object next;
        HeaderMenuItem headerMenuItem;
        HeaderMenuItem.TotalCountIndicator totalCountIndicator;
        String unreadMessagesCount;
        boolean z;
        final oh4<? super HeaderMenuItem, g2b> oh4Var7;
        final oh4<? super MetricData, g2b> oh4Var8;
        String str;
        oh4<? super HeaderMenuItem, g2b> oh4Var9;
        Object objF;
        h37 h37Var;
        aj1 aj1VarA;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        qr5.a aVar3;
        boolean z2;
        Object objF2;
        oh4<? super MetricData, g2b> oh4Var10;
        long j3;
        Object objF3;
        final h37 h37Var2;
        boolean z3;
        boolean z4;
        final List<? extends HeaderMenuItem> list4;
        final oh4<? super HeaderMenuItem, g2b> oh4Var11;
        final oh4<? super MetricData, g2b> oh4Var12;
        final long j4;
        final HeaderMenuItem headerMenuItem2;
        boolean z5;
        boolean z6;
        boolean z7;
        Object objF4;
        yr9 yr9Var;
        int i9;
        cs9 cs9Var;
        xj8 xj8VarW;
        int i10;
        cs9 cs9Var2;
        int i11;
        Object objF5;
        Object objF6;
        xj8 xj8VarW2;
        bj4 bj4VarO = jt1Var.o(1084184456);
        j1b j1bVar = bj4VarO.a;
        int i12 = bj4VarO.S ? -bj4VarO.I.v : bj4VarO.G.i;
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
            list2 = list;
        } else if ((i & 6) == 0) {
            list2 = list;
            i3 = (bj4VarO.j(list2) ? 4 : 2) | i;
        } else {
            list2 = list;
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 == 0) {
            if ((i & 48) == 0) {
                oh4Var3 = oh4Var;
                i3 |= bj4VarO.j(oh4Var3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    j2 = j;
                    if (bj4VarO.i(j2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        oh4Var4 = oh4Var2;
                        if (bj4VarO.j(oh4Var4)) {
                            i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i3 & 1171) == 1170 || !bj4VarO.r()) {
                        if (i13 != 0) {
                            list3 = hf3.t;
                        } else {
                            list3 = list2;
                        }
                        c0187a = jt1.a.a;
                        i8 = 0;
                        if (i14 != 0) {
                            bj4VarO.K(2013516817);
                            objF6 = bj4VarO.f();
                            if (objF6 == c0187a) {
                                objF6 = new e22(i8);
                                bj4VarO.C(objF6);
                            }
                            bj4VarO.U(false);
                            oh4Var5 = (oh4) objF6;
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i4 != 0) {
                            j2 = uh1.b;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(2013519473);
                            objF5 = bj4VarO.f();
                            if (objF5 == c0187a) {
                                objF5 = new f22();
                                bj4VarO.C(objF5);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF5;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        aVar = ox6.a.t;
                        ox6VarC = it1.c(bj4VarO, aVar);
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
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        bj4VarO.K(2047867851);
                        it = list3.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                        headerMenuItem = (HeaderMenuItem) next;
                        if (headerMenuItem != null) {
                            totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                        } else {
                            totalCountIndicator = null;
                        }
                        if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                            unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                        } else {
                            unreadMessagesCount = null;
                        }
                        z = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                        if (list3.isEmpty()) {
                            bj4VarO.K(2048373646);
                            bj4VarO.U(false);
                            if (i12 >= 0) {
                                if (bj4VarO.S) {
                                    cs9Var = bj4VarO.I;
                                    while (bj4VarO.S) {
                                        bj4VarO.U(cs9Var.y(cs9Var.v));
                                    }
                                }
                                yr9Var = bj4VarO.G;
                                while (true) {
                                    i9 = yr9Var.i;
                                    if (i9 <= i12) {
                                        break;
                                    } else {
                                        bj4VarO.U(yr9Var.l(i9));
                                    }
                                }
                            } else {
                                i10 = -i12;
                                cs9Var2 = bj4VarO.I;
                                while (true) {
                                    i11 = cs9Var2.v;
                                    if (i11 <= i10) {
                                        break;
                                    } else {
                                        bj4VarO.U(cs9Var2.y(i11));
                                    }
                                }
                            }
                            xj8VarW = bj4VarO.W();
                            if (xj8VarW != null) {
                                final long j5 = j2;
                                final List<? extends HeaderMenuItem> list5 = list3;
                                final oh4<? super HeaderMenuItem, g2b> oh4Var13 = oh4Var5;
                                final oh4<? super MetricData, g2b> oh4Var14 = oh4Var6;
                                xj8VarW.d = new ci4() { // from class: g22
                                    @Override // defpackage.ci4
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$6(list5, oh4Var13, j5, oh4Var14, i, i2, (jt1) obj, iIntValue);
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        oh4Var7 = oh4Var5;
                        oh4Var8 = oh4Var6;
                        if (list3.size() == 1) {
                            bj4VarO.K(2048472753);
                            headerMenuItem2 = (HeaderMenuItem) th1.y(list3);
                            String text = headerMenuItem2.getLabel().getText(bj4VarO, StringProvider.$stable);
                            int iIcon = icon(headerMenuItem2);
                            boolean enabled = headerMenuItem2.getEnabled();
                            bj4VarO.K(-1180838359);
                            if ((i3 & 112) == 32) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            boolean zJ = z5 | bj4VarO.J(headerMenuItem2);
                            if ((i3 & 7168) == 2048) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            z7 = z6 | zJ;
                            objF4 = bj4VarO.f();
                            if (z7 || objF4 == c0187a) {
                                objF4 = new mh4() { // from class: h22
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                                    }
                                };
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            oh4Var10 = oh4Var8;
                            oh4Var9 = oh4Var7;
                            HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg(text, enabled, iIcon, null, unreadMessagesCount, false, z, false, (mh4) objF4, j2, bj4VarO, ((i3 << 21) & 1879048192) | 12582912, 40);
                            bj4VarO.U(false);
                            z3 = false;
                            z4 = true;
                            j3 = j2;
                        } else {
                            str = unreadMessagesCount;
                            oh4Var9 = oh4Var7;
                            bj4VarO.K(2049182188);
                            bj4VarO.K(-1180824432);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = bl7.i(Boolean.FALSE);
                                bj4VarO.C(objF);
                            }
                            h37Var = (h37) objF;
                            bj4VarO.U(false);
                            ox6 ox6VarR = ir9.r(aVar);
                            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                            iHashCode2 = Long.hashCode(bj4VarO.T);
                            kw7VarP2 = bj4VarO.P();
                            ox6VarC2 = it1.c(bj4VarO, ox6VarR);
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
                            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                            rd7.d(bj4VarO, bt1.a.e, kw7VarP2);
                            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode2));
                            rd7.c(bj4VarO, bt1.a.h);
                            rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
                            int i15 = R.drawable.intercom_kebab;
                            boolean z8 = !((Boolean) h37Var.getValue()).booleanValue();
                            bj4VarO.K(-1935443118);
                            if ((i3 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF2 = bj4VarO.f();
                            if (z2 || objF2 == c0187a) {
                                objF2 = new hh1(oh4Var8, h37Var);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            oh4Var10 = oh4Var8;
                            HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg("More Menu", true, i15, null, str, z8, z, false, (mh4) objF2, j2, bj4VarO, 12582966 | ((i3 << 21) & 1879048192), 8);
                            ox6 ox6VarN = ir9.n(aVar, 220.0f);
                            boolean zBooleanValue = ((Boolean) h37Var.getValue()).booleanValue();
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i16 = IntercomTheme.$stable;
                            j3 = j2;
                            long jA = kk.a(intercomTheme, bj4VarO, i16);
                            b72 b72Var = intercomTheme.getShapes(bj4VarO, i16).b;
                            bj4VarO.K(-1935428387);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                h37Var2 = h37Var;
                                objF3 = new mh4() { // from class: i22
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$14$lambda$13$lambda$12(h37Var2);
                                    }
                                };
                                bj4VarO.C(objF3);
                            } else {
                                h37Var2 = h37Var;
                            }
                            z3 = false;
                            bj4VarO.U(false);
                            kp.a(zBooleanValue, (mh4) objF3, ox6VarN, 0L, null, null, b72Var, jA, 8.0f, gr1.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list3, oh4Var9, oh4Var10, j3, h37Var2), bj4VarO), bj4VarO, 805306800);
                            bj4VarO = bj4VarO;
                            z4 = true;
                            bj4VarO.U(true);
                            bj4VarO.U(false);
                        }
                        bj4VarO.U(z3);
                        bj4VarO.U(z4);
                        list4 = list3;
                        oh4Var11 = oh4Var9;
                        oh4Var12 = oh4Var10;
                        j4 = j3;
                    } else {
                        bj4VarO.u();
                        list4 = list2;
                        oh4Var11 = oh4Var3;
                        j4 = j2;
                        oh4Var12 = oh4Var4;
                    }
                    xj8VarW2 = bj4VarO.W();
                    if (xj8VarW2 != null) {
                        xj8VarW2.d = new ci4() { // from class: j22
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$16(list4, oh4Var11, j4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 3072;
                oh4Var4 = oh4Var2;
                if ((i3 & 1171) == 1170) {
                    if (i13 != 0) {
                        list3 = hf3.t;
                    } else {
                        list3 = list2;
                    }
                    c0187a = jt1.a.a;
                    i8 = 0;
                    if (i14 != 0) {
                        bj4VarO.K(2013516817);
                        objF6 = bj4VarO.f();
                        if (objF6 == c0187a) {
                            objF6 = new e22(i8);
                            bj4VarO.C(objF6);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF6;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i4 != 0) {
                        j2 = uh1.b;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(2013519473);
                        objF5 = bj4VarO.f();
                        if (objF5 == c0187a) {
                            objF5 = new f22();
                            bj4VarO.C(objF5);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF5;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    aVar = ox6.a.t;
                    ox6VarC = it1.c(bj4VarO, aVar);
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(2047867851);
                    it = list3.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                    headerMenuItem = (HeaderMenuItem) next;
                    if (headerMenuItem != null) {
                        totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                    } else {
                        totalCountIndicator = null;
                    }
                    if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                        unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                    } else {
                        unreadMessagesCount = null;
                    }
                    z = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                    if (list3.isEmpty()) {
                        bj4VarO.K(2048373646);
                        bj4VarO.U(false);
                        if (i12 >= 0) {
                            if (bj4VarO.S) {
                                cs9Var = bj4VarO.I;
                                while (bj4VarO.S) {
                                    bj4VarO.U(cs9Var.y(cs9Var.v));
                                }
                            }
                            yr9Var = bj4VarO.G;
                            while (true) {
                                i9 = yr9Var.i;
                                if (i9 <= i12) {
                                    break;
                                    break;
                                }
                                bj4VarO.U(yr9Var.l(i9));
                            }
                        } else {
                            i10 = -i12;
                            cs9Var2 = bj4VarO.I;
                            while (true) {
                                i11 = cs9Var2.v;
                                if (i11 <= i10) {
                                    break;
                                    break;
                                }
                                bj4VarO.U(cs9Var2.y(i11));
                            }
                        }
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            final long j6 = j2;
                            final List list6 = list3;
                            final oh4 oh4Var15 = oh4Var5;
                            final oh4 oh4Var16 = oh4Var6;
                            xj8VarW.d = new ci4() { // from class: g22
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$6(list6, oh4Var15, j6, oh4Var16, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                            return;
                        }
                        return;
                    }
                    oh4Var7 = oh4Var5;
                    oh4Var8 = oh4Var6;
                    if (list3.size() == 1) {
                        bj4VarO.K(2048472753);
                        headerMenuItem2 = (HeaderMenuItem) th1.y(list3);
                        String text2 = headerMenuItem2.getLabel().getText(bj4VarO, StringProvider.$stable);
                        int iIcon2 = icon(headerMenuItem2);
                        boolean enabled2 = headerMenuItem2.getEnabled();
                        bj4VarO.K(-1180838359);
                        if ((i3 & 112) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        boolean zJ2 = z5 | bj4VarO.J(headerMenuItem2);
                        if ((i3 & 7168) == 2048) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z6 | zJ2;
                        objF4 = bj4VarO.f();
                        if (z7) {
                            objF4 = new mh4() { // from class: h22
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                                }
                            };
                            bj4VarO.C(objF4);
                        } else {
                            objF4 = new mh4() { // from class: h22
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                                }
                            };
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        oh4Var10 = oh4Var8;
                        oh4Var9 = oh4Var7;
                        HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg(text2, enabled2, iIcon2, null, unreadMessagesCount, false, z, false, (mh4) objF4, j2, bj4VarO, ((i3 << 21) & 1879048192) | 12582912, 40);
                        bj4VarO.U(false);
                        z3 = false;
                        z4 = true;
                        j3 = j2;
                    } else {
                        str = unreadMessagesCount;
                        oh4Var9 = oh4Var7;
                        bj4VarO.K(2049182188);
                        bj4VarO.K(-1180824432);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        bj4VarO.U(false);
                        ox6 ox6VarR2 = ir9.r(aVar);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, ox6VarR2);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP2);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode2));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
                        int i17 = R.drawable.intercom_kebab;
                        boolean z9 = !((Boolean) h37Var.getValue()).booleanValue();
                        bj4VarO.K(-1935443118);
                        if ((i3 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF2 = bj4VarO.f();
                        if (z2) {
                            objF2 = new hh1(oh4Var8, h37Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new hh1(oh4Var8, h37Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var10 = oh4Var8;
                        HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg("More Menu", true, i17, null, str, z9, z, false, (mh4) objF2, j2, bj4VarO, 12582966 | ((i3 << 21) & 1879048192), 8);
                        ox6 ox6VarN2 = ir9.n(aVar, 220.0f);
                        boolean zBooleanValue2 = ((Boolean) h37Var.getValue()).booleanValue();
                        IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                        int i18 = IntercomTheme.$stable;
                        j3 = j2;
                        long jA2 = kk.a(intercomTheme2, bj4VarO, i18);
                        b72 b72Var2 = intercomTheme2.getShapes(bj4VarO, i18).b;
                        bj4VarO.K(-1935428387);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            h37Var2 = h37Var;
                            objF3 = new mh4() { // from class: i22
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$14$lambda$13$lambda$12(h37Var2);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            h37Var2 = h37Var;
                        }
                        z3 = false;
                        bj4VarO.U(false);
                        kp.a(zBooleanValue2, (mh4) objF3, ox6VarN2, 0L, null, null, b72Var2, jA2, 8.0f, gr1.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list3, oh4Var9, oh4Var10, j3, h37Var2), bj4VarO), bj4VarO, 805306800);
                        bj4VarO = bj4VarO;
                        z4 = true;
                        bj4VarO.U(true);
                        bj4VarO.U(false);
                    }
                    bj4VarO.U(z3);
                    bj4VarO.U(z4);
                    list4 = list3;
                    oh4Var11 = oh4Var9;
                    oh4Var12 = oh4Var10;
                    j4 = j3;
                } else {
                    if (i13 != 0) {
                        list3 = hf3.t;
                    } else {
                        list3 = list2;
                    }
                    c0187a = jt1.a.a;
                    i8 = 0;
                    if (i14 != 0) {
                        bj4VarO.K(2013516817);
                        objF6 = bj4VarO.f();
                        if (objF6 == c0187a) {
                            objF6 = new e22(i8);
                            bj4VarO.C(objF6);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF6;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i4 != 0) {
                        j2 = uh1.b;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(2013519473);
                        objF5 = bj4VarO.f();
                        if (objF5 == c0187a) {
                            objF5 = new f22();
                            bj4VarO.C(objF5);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF5;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    aVar = ox6.a.t;
                    ox6VarC = it1.c(bj4VarO, aVar);
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(2047867851);
                    it = list3.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                    headerMenuItem = (HeaderMenuItem) next;
                    if (headerMenuItem != null) {
                        totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                    } else {
                        totalCountIndicator = null;
                    }
                    if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                        unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                    } else {
                        unreadMessagesCount = null;
                    }
                    z = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                    if (list3.isEmpty()) {
                        bj4VarO.K(2048373646);
                        bj4VarO.U(false);
                        if (i12 >= 0) {
                            if (bj4VarO.S) {
                                cs9Var = bj4VarO.I;
                                while (bj4VarO.S) {
                                    bj4VarO.U(cs9Var.y(cs9Var.v));
                                }
                            }
                            yr9Var = bj4VarO.G;
                            while (true) {
                                i9 = yr9Var.i;
                                if (i9 <= i12) {
                                    break;
                                    break;
                                }
                                bj4VarO.U(yr9Var.l(i9));
                            }
                        } else {
                            i10 = -i12;
                            cs9Var2 = bj4VarO.I;
                            while (true) {
                                i11 = cs9Var2.v;
                                if (i11 <= i10) {
                                    break;
                                    break;
                                }
                                bj4VarO.U(cs9Var2.y(i11));
                            }
                        }
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            final long j7 = j2;
                            final List list7 = list3;
                            final oh4 oh4Var17 = oh4Var5;
                            final oh4 oh4Var18 = oh4Var6;
                            xj8VarW.d = new ci4() { // from class: g22
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$6(list7, oh4Var17, j7, oh4Var18, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                            return;
                        }
                        return;
                    }
                    oh4Var7 = oh4Var5;
                    oh4Var8 = oh4Var6;
                    if (list3.size() == 1) {
                        bj4VarO.K(2048472753);
                        headerMenuItem2 = (HeaderMenuItem) th1.y(list3);
                        String text3 = headerMenuItem2.getLabel().getText(bj4VarO, StringProvider.$stable);
                        int iIcon3 = icon(headerMenuItem2);
                        boolean enabled3 = headerMenuItem2.getEnabled();
                        bj4VarO.K(-1180838359);
                        if ((i3 & 112) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        boolean zJ3 = z5 | bj4VarO.J(headerMenuItem2);
                        if ((i3 & 7168) == 2048) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z6 | zJ3;
                        objF4 = bj4VarO.f();
                        if (z7) {
                            objF4 = new mh4() { // from class: h22
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                                }
                            };
                            bj4VarO.C(objF4);
                        } else {
                            objF4 = new mh4() { // from class: h22
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                                }
                            };
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        oh4Var10 = oh4Var8;
                        oh4Var9 = oh4Var7;
                        HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg(text3, enabled3, iIcon3, null, unreadMessagesCount, false, z, false, (mh4) objF4, j2, bj4VarO, ((i3 << 21) & 1879048192) | 12582912, 40);
                        bj4VarO.U(false);
                        z3 = false;
                        z4 = true;
                        j3 = j2;
                    } else {
                        str = unreadMessagesCount;
                        oh4Var9 = oh4Var7;
                        bj4VarO.K(2049182188);
                        bj4VarO.K(-1180824432);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        bj4VarO.U(false);
                        ox6 ox6VarR3 = ir9.r(aVar);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, ox6VarR3);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP2);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode2));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
                        int i19 = R.drawable.intercom_kebab;
                        boolean z10 = !((Boolean) h37Var.getValue()).booleanValue();
                        bj4VarO.K(-1935443118);
                        if ((i3 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF2 = bj4VarO.f();
                        if (z2) {
                            objF2 = new hh1(oh4Var8, h37Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new hh1(oh4Var8, h37Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var10 = oh4Var8;
                        HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg("More Menu", true, i19, null, str, z10, z, false, (mh4) objF2, j2, bj4VarO, 12582966 | ((i3 << 21) & 1879048192), 8);
                        ox6 ox6VarN3 = ir9.n(aVar, 220.0f);
                        boolean zBooleanValue3 = ((Boolean) h37Var.getValue()).booleanValue();
                        IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                        int i110 = IntercomTheme.$stable;
                        j3 = j2;
                        long jA3 = kk.a(intercomTheme3, bj4VarO, i110);
                        b72 b72Var3 = intercomTheme3.getShapes(bj4VarO, i110).b;
                        bj4VarO.K(-1935428387);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            h37Var2 = h37Var;
                            objF3 = new mh4() { // from class: i22
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$14$lambda$13$lambda$12(h37Var2);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            h37Var2 = h37Var;
                        }
                        z3 = false;
                        bj4VarO.U(false);
                        kp.a(zBooleanValue3, (mh4) objF3, ox6VarN3, 0L, null, null, b72Var3, jA3, 8.0f, gr1.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list3, oh4Var9, oh4Var10, j3, h37Var2), bj4VarO), bj4VarO, 805306800);
                        bj4VarO = bj4VarO;
                        z4 = true;
                        bj4VarO.U(true);
                        bj4VarO.U(false);
                    }
                    bj4VarO.U(z3);
                    bj4VarO.U(z4);
                    list4 = list3;
                    oh4Var11 = oh4Var9;
                    oh4Var12 = oh4Var10;
                    j4 = j3;
                }
                xj8VarW2 = bj4VarO.W();
                if (xj8VarW2 != null) {
                    xj8VarW2.d = new ci4() { // from class: j22
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$16(list4, oh4Var11, j4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 384;
            j2 = j;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    oh4Var4 = oh4Var2;
                    if (bj4VarO.j(oh4Var4)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i3 & 1171) == 1170) {
                    if (i13 != 0) {
                        list3 = hf3.t;
                    } else {
                        list3 = list2;
                    }
                    c0187a = jt1.a.a;
                    i8 = 0;
                    if (i14 != 0) {
                        bj4VarO.K(2013516817);
                        objF6 = bj4VarO.f();
                        if (objF6 == c0187a) {
                            objF6 = new e22(i8);
                            bj4VarO.C(objF6);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF6;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i4 != 0) {
                        j2 = uh1.b;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(2013519473);
                        objF5 = bj4VarO.f();
                        if (objF5 == c0187a) {
                            objF5 = new f22();
                            bj4VarO.C(objF5);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF5;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    aVar = ox6.a.t;
                    ox6VarC = it1.c(bj4VarO, aVar);
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(2047867851);
                    it = list3.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                    headerMenuItem = (HeaderMenuItem) next;
                    if (headerMenuItem != null) {
                        totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                    } else {
                        totalCountIndicator = null;
                    }
                    if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                        unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                    } else {
                        unreadMessagesCount = null;
                    }
                    z = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                    if (list3.isEmpty()) {
                        bj4VarO.K(2048373646);
                        bj4VarO.U(false);
                        if (i12 >= 0) {
                            if (bj4VarO.S) {
                                cs9Var = bj4VarO.I;
                                while (bj4VarO.S) {
                                    bj4VarO.U(cs9Var.y(cs9Var.v));
                                }
                            }
                            yr9Var = bj4VarO.G;
                            while (true) {
                                i9 = yr9Var.i;
                                if (i9 <= i12) {
                                    break;
                                    break;
                                }
                                bj4VarO.U(yr9Var.l(i9));
                            }
                        } else {
                            i10 = -i12;
                            cs9Var2 = bj4VarO.I;
                            while (true) {
                                i11 = cs9Var2.v;
                                if (i11 <= i10) {
                                    break;
                                    break;
                                }
                                bj4VarO.U(cs9Var2.y(i11));
                            }
                        }
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            final long j8 = j2;
                            final List list8 = list3;
                            final oh4 oh4Var19 = oh4Var5;
                            final oh4 oh4Var110 = oh4Var6;
                            xj8VarW.d = new ci4() { // from class: g22
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$6(list8, oh4Var19, j8, oh4Var110, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                            return;
                        }
                        return;
                    }
                    oh4Var7 = oh4Var5;
                    oh4Var8 = oh4Var6;
                    if (list3.size() == 1) {
                        bj4VarO.K(2048472753);
                        headerMenuItem2 = (HeaderMenuItem) th1.y(list3);
                        String text4 = headerMenuItem2.getLabel().getText(bj4VarO, StringProvider.$stable);
                        int iIcon4 = icon(headerMenuItem2);
                        boolean enabled4 = headerMenuItem2.getEnabled();
                        bj4VarO.K(-1180838359);
                        if ((i3 & 112) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        boolean zJ4 = z5 | bj4VarO.J(headerMenuItem2);
                        if ((i3 & 7168) == 2048) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z6 | zJ4;
                        objF4 = bj4VarO.f();
                        if (z7) {
                            objF4 = new mh4() { // from class: h22
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                                }
                            };
                            bj4VarO.C(objF4);
                        } else {
                            objF4 = new mh4() { // from class: h22
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                                }
                            };
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        oh4Var10 = oh4Var8;
                        oh4Var9 = oh4Var7;
                        HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg(text4, enabled4, iIcon4, null, unreadMessagesCount, false, z, false, (mh4) objF4, j2, bj4VarO, ((i3 << 21) & 1879048192) | 12582912, 40);
                        bj4VarO.U(false);
                        z3 = false;
                        z4 = true;
                        j3 = j2;
                    } else {
                        str = unreadMessagesCount;
                        oh4Var9 = oh4Var7;
                        bj4VarO.K(2049182188);
                        bj4VarO.K(-1180824432);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        bj4VarO.U(false);
                        ox6 ox6VarR4 = ir9.r(aVar);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, ox6VarR4);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP2);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode2));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
                        int i111 = R.drawable.intercom_kebab;
                        boolean z11 = !((Boolean) h37Var.getValue()).booleanValue();
                        bj4VarO.K(-1935443118);
                        if ((i3 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF2 = bj4VarO.f();
                        if (z2) {
                            objF2 = new hh1(oh4Var8, h37Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new hh1(oh4Var8, h37Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var10 = oh4Var8;
                        HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg("More Menu", true, i111, null, str, z11, z, false, (mh4) objF2, j2, bj4VarO, 12582966 | ((i3 << 21) & 1879048192), 8);
                        ox6 ox6VarN4 = ir9.n(aVar, 220.0f);
                        boolean zBooleanValue4 = ((Boolean) h37Var.getValue()).booleanValue();
                        IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                        int i112 = IntercomTheme.$stable;
                        j3 = j2;
                        long jA4 = kk.a(intercomTheme4, bj4VarO, i112);
                        b72 b72Var4 = intercomTheme4.getShapes(bj4VarO, i112).b;
                        bj4VarO.K(-1935428387);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            h37Var2 = h37Var;
                            objF3 = new mh4() { // from class: i22
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$14$lambda$13$lambda$12(h37Var2);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            h37Var2 = h37Var;
                        }
                        z3 = false;
                        bj4VarO.U(false);
                        kp.a(zBooleanValue4, (mh4) objF3, ox6VarN4, 0L, null, null, b72Var4, jA4, 8.0f, gr1.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list3, oh4Var9, oh4Var10, j3, h37Var2), bj4VarO), bj4VarO, 805306800);
                        bj4VarO = bj4VarO;
                        z4 = true;
                        bj4VarO.U(true);
                        bj4VarO.U(false);
                    }
                    bj4VarO.U(z3);
                    bj4VarO.U(z4);
                    list4 = list3;
                    oh4Var11 = oh4Var9;
                    oh4Var12 = oh4Var10;
                    j4 = j3;
                } else {
                    if (i13 != 0) {
                        list3 = hf3.t;
                    } else {
                        list3 = list2;
                    }
                    c0187a = jt1.a.a;
                    i8 = 0;
                    if (i14 != 0) {
                        bj4VarO.K(2013516817);
                        objF6 = bj4VarO.f();
                        if (objF6 == c0187a) {
                            objF6 = new e22(i8);
                            bj4VarO.C(objF6);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF6;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i4 != 0) {
                        j2 = uh1.b;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(2013519473);
                        objF5 = bj4VarO.f();
                        if (objF5 == c0187a) {
                            objF5 = new f22();
                            bj4VarO.C(objF5);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF5;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    aVar = ox6.a.t;
                    ox6VarC = it1.c(bj4VarO, aVar);
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(2047867851);
                    it = list3.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                    headerMenuItem = (HeaderMenuItem) next;
                    if (headerMenuItem != null) {
                        totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                    } else {
                        totalCountIndicator = null;
                    }
                    if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                        unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                    } else {
                        unreadMessagesCount = null;
                    }
                    z = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                    if (list3.isEmpty()) {
                        bj4VarO.K(2048373646);
                        bj4VarO.U(false);
                        if (i12 >= 0) {
                            if (bj4VarO.S) {
                                cs9Var = bj4VarO.I;
                                while (bj4VarO.S) {
                                    bj4VarO.U(cs9Var.y(cs9Var.v));
                                }
                            }
                            yr9Var = bj4VarO.G;
                            while (true) {
                                i9 = yr9Var.i;
                                if (i9 <= i12) {
                                    break;
                                    break;
                                }
                                bj4VarO.U(yr9Var.l(i9));
                            }
                        } else {
                            i10 = -i12;
                            cs9Var2 = bj4VarO.I;
                            while (true) {
                                i11 = cs9Var2.v;
                                if (i11 <= i10) {
                                    break;
                                    break;
                                }
                                bj4VarO.U(cs9Var2.y(i11));
                            }
                        }
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            final long j9 = j2;
                            final List list9 = list3;
                            final oh4 oh4Var111 = oh4Var5;
                            final oh4 oh4Var112 = oh4Var6;
                            xj8VarW.d = new ci4() { // from class: g22
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$6(list9, oh4Var111, j9, oh4Var112, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                            return;
                        }
                        return;
                    }
                    oh4Var7 = oh4Var5;
                    oh4Var8 = oh4Var6;
                    if (list3.size() == 1) {
                        bj4VarO.K(2048472753);
                        headerMenuItem2 = (HeaderMenuItem) th1.y(list3);
                        String text5 = headerMenuItem2.getLabel().getText(bj4VarO, StringProvider.$stable);
                        int iIcon5 = icon(headerMenuItem2);
                        boolean enabled5 = headerMenuItem2.getEnabled();
                        bj4VarO.K(-1180838359);
                        if ((i3 & 112) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        boolean zJ5 = z5 | bj4VarO.J(headerMenuItem2);
                        if ((i3 & 7168) == 2048) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z6 | zJ5;
                        objF4 = bj4VarO.f();
                        if (z7) {
                            objF4 = new mh4() { // from class: h22
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                                }
                            };
                            bj4VarO.C(objF4);
                        } else {
                            objF4 = new mh4() { // from class: h22
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                                }
                            };
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        oh4Var10 = oh4Var8;
                        oh4Var9 = oh4Var7;
                        HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg(text5, enabled5, iIcon5, null, unreadMessagesCount, false, z, false, (mh4) objF4, j2, bj4VarO, ((i3 << 21) & 1879048192) | 12582912, 40);
                        bj4VarO.U(false);
                        z3 = false;
                        z4 = true;
                        j3 = j2;
                    } else {
                        str = unreadMessagesCount;
                        oh4Var9 = oh4Var7;
                        bj4VarO.K(2049182188);
                        bj4VarO.K(-1180824432);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        bj4VarO.U(false);
                        ox6 ox6VarR5 = ir9.r(aVar);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, ox6VarR5);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP2);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode2));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
                        int i113 = R.drawable.intercom_kebab;
                        boolean z12 = !((Boolean) h37Var.getValue()).booleanValue();
                        bj4VarO.K(-1935443118);
                        if ((i3 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF2 = bj4VarO.f();
                        if (z2) {
                            objF2 = new hh1(oh4Var8, h37Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new hh1(oh4Var8, h37Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var10 = oh4Var8;
                        HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg("More Menu", true, i113, null, str, z12, z, false, (mh4) objF2, j2, bj4VarO, 12582966 | ((i3 << 21) & 1879048192), 8);
                        ox6 ox6VarN5 = ir9.n(aVar, 220.0f);
                        boolean zBooleanValue5 = ((Boolean) h37Var.getValue()).booleanValue();
                        IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                        int i114 = IntercomTheme.$stable;
                        j3 = j2;
                        long jA5 = kk.a(intercomTheme5, bj4VarO, i114);
                        b72 b72Var5 = intercomTheme5.getShapes(bj4VarO, i114).b;
                        bj4VarO.K(-1935428387);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            h37Var2 = h37Var;
                            objF3 = new mh4() { // from class: i22
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$14$lambda$13$lambda$12(h37Var2);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            h37Var2 = h37Var;
                        }
                        z3 = false;
                        bj4VarO.U(false);
                        kp.a(zBooleanValue5, (mh4) objF3, ox6VarN5, 0L, null, null, b72Var5, jA5, 8.0f, gr1.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list3, oh4Var9, oh4Var10, j3, h37Var2), bj4VarO), bj4VarO, 805306800);
                        bj4VarO = bj4VarO;
                        z4 = true;
                        bj4VarO.U(true);
                        bj4VarO.U(false);
                    }
                    bj4VarO.U(z3);
                    bj4VarO.U(z4);
                    list4 = list3;
                    oh4Var11 = oh4Var9;
                    oh4Var12 = oh4Var10;
                    j4 = j3;
                }
                xj8VarW2 = bj4VarO.W();
                if (xj8VarW2 != null) {
                    xj8VarW2.d = new ci4() { // from class: j22
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$16(list4, oh4Var11, j4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            oh4Var4 = oh4Var2;
            if ((i3 & 1171) == 1170) {
                if (i13 != 0) {
                    list3 = hf3.t;
                } else {
                    list3 = list2;
                }
                c0187a = jt1.a.a;
                i8 = 0;
                if (i14 != 0) {
                    bj4VarO.K(2013516817);
                    objF6 = bj4VarO.f();
                    if (objF6 == c0187a) {
                        objF6 = new e22(i8);
                        bj4VarO.C(objF6);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF6;
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i4 != 0) {
                    j2 = uh1.b;
                }
                if (i6 != 0) {
                    bj4VarO.K(2013519473);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new f22();
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF5;
                } else {
                    oh4Var6 = oh4Var4;
                }
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                aVar = ox6.a.t;
                ox6VarC = it1.c(bj4VarO, aVar);
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(2047867851);
                it = list3.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                headerMenuItem = (HeaderMenuItem) next;
                if (headerMenuItem != null) {
                    totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                } else {
                    totalCountIndicator = null;
                }
                if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                    unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                } else {
                    unreadMessagesCount = null;
                }
                z = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                if (list3.isEmpty()) {
                    bj4VarO.K(2048373646);
                    bj4VarO.U(false);
                    if (i12 >= 0) {
                        if (bj4VarO.S) {
                            cs9Var = bj4VarO.I;
                            while (bj4VarO.S) {
                                bj4VarO.U(cs9Var.y(cs9Var.v));
                            }
                        }
                        yr9Var = bj4VarO.G;
                        while (true) {
                            i9 = yr9Var.i;
                            if (i9 <= i12) {
                                break;
                                break;
                            }
                            bj4VarO.U(yr9Var.l(i9));
                        }
                    } else {
                        i10 = -i12;
                        cs9Var2 = bj4VarO.I;
                        while (true) {
                            i11 = cs9Var2.v;
                            if (i11 <= i10) {
                                break;
                                break;
                            }
                            bj4VarO.U(cs9Var2.y(i11));
                        }
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        final long j10 = j2;
                        final List list10 = list3;
                        final oh4 oh4Var113 = oh4Var5;
                        final oh4 oh4Var114 = oh4Var6;
                        xj8VarW.d = new ci4() { // from class: g22
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$6(list10, oh4Var113, j10, oh4Var114, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                        return;
                    }
                    return;
                }
                oh4Var7 = oh4Var5;
                oh4Var8 = oh4Var6;
                if (list3.size() == 1) {
                    bj4VarO.K(2048472753);
                    headerMenuItem2 = (HeaderMenuItem) th1.y(list3);
                    String text6 = headerMenuItem2.getLabel().getText(bj4VarO, StringProvider.$stable);
                    int iIcon6 = icon(headerMenuItem2);
                    boolean enabled6 = headerMenuItem2.getEnabled();
                    bj4VarO.K(-1180838359);
                    if ((i3 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean zJ6 = z5 | bj4VarO.J(headerMenuItem2);
                    if ((i3 & 7168) == 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z6 | zJ6;
                    objF4 = bj4VarO.f();
                    if (z7) {
                        objF4 = new mh4() { // from class: h22
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new mh4() { // from class: h22
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    oh4Var10 = oh4Var8;
                    oh4Var9 = oh4Var7;
                    HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg(text6, enabled6, iIcon6, null, unreadMessagesCount, false, z, false, (mh4) objF4, j2, bj4VarO, ((i3 << 21) & 1879048192) | 12582912, 40);
                    bj4VarO.U(false);
                    z3 = false;
                    z4 = true;
                    j3 = j2;
                } else {
                    str = unreadMessagesCount;
                    oh4Var9 = oh4Var7;
                    bj4VarO.K(2049182188);
                    bj4VarO.K(-1180824432);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    bj4VarO.U(false);
                    ox6 ox6VarR6 = ir9.r(aVar);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarR6);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP2);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode2));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
                    int i115 = R.drawable.intercom_kebab;
                    boolean z13 = !((Boolean) h37Var.getValue()).booleanValue();
                    bj4VarO.K(-1935443118);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z2) {
                        objF2 = new hh1(oh4Var8, h37Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new hh1(oh4Var8, h37Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    oh4Var10 = oh4Var8;
                    HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg("More Menu", true, i115, null, str, z13, z, false, (mh4) objF2, j2, bj4VarO, 12582966 | ((i3 << 21) & 1879048192), 8);
                    ox6 ox6VarN6 = ir9.n(aVar, 220.0f);
                    boolean zBooleanValue6 = ((Boolean) h37Var.getValue()).booleanValue();
                    IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                    int i116 = IntercomTheme.$stable;
                    j3 = j2;
                    long jA6 = kk.a(intercomTheme6, bj4VarO, i116);
                    b72 b72Var6 = intercomTheme6.getShapes(bj4VarO, i116).b;
                    bj4VarO.K(-1935428387);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        h37Var2 = h37Var;
                        objF3 = new mh4() { // from class: i22
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$14$lambda$13$lambda$12(h37Var2);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        h37Var2 = h37Var;
                    }
                    z3 = false;
                    bj4VarO.U(false);
                    kp.a(zBooleanValue6, (mh4) objF3, ox6VarN6, 0L, null, null, b72Var6, jA6, 8.0f, gr1.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list3, oh4Var9, oh4Var10, j3, h37Var2), bj4VarO), bj4VarO, 805306800);
                    bj4VarO = bj4VarO;
                    z4 = true;
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                }
                bj4VarO.U(z3);
                bj4VarO.U(z4);
                list4 = list3;
                oh4Var11 = oh4Var9;
                oh4Var12 = oh4Var10;
                j4 = j3;
            } else {
                if (i13 != 0) {
                    list3 = hf3.t;
                } else {
                    list3 = list2;
                }
                c0187a = jt1.a.a;
                i8 = 0;
                if (i14 != 0) {
                    bj4VarO.K(2013516817);
                    objF6 = bj4VarO.f();
                    if (objF6 == c0187a) {
                        objF6 = new e22(i8);
                        bj4VarO.C(objF6);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF6;
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i4 != 0) {
                    j2 = uh1.b;
                }
                if (i6 != 0) {
                    bj4VarO.K(2013519473);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new f22();
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF5;
                } else {
                    oh4Var6 = oh4Var4;
                }
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                aVar = ox6.a.t;
                ox6VarC = it1.c(bj4VarO, aVar);
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(2047867851);
                it = list3.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                headerMenuItem = (HeaderMenuItem) next;
                if (headerMenuItem != null) {
                    totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                } else {
                    totalCountIndicator = null;
                }
                if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                    unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                } else {
                    unreadMessagesCount = null;
                }
                z = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                if (list3.isEmpty()) {
                    bj4VarO.K(2048373646);
                    bj4VarO.U(false);
                    if (i12 >= 0) {
                        if (bj4VarO.S) {
                            cs9Var = bj4VarO.I;
                            while (bj4VarO.S) {
                                bj4VarO.U(cs9Var.y(cs9Var.v));
                            }
                        }
                        yr9Var = bj4VarO.G;
                        while (true) {
                            i9 = yr9Var.i;
                            if (i9 <= i12) {
                                break;
                                break;
                            }
                            bj4VarO.U(yr9Var.l(i9));
                        }
                    } else {
                        i10 = -i12;
                        cs9Var2 = bj4VarO.I;
                        while (true) {
                            i11 = cs9Var2.v;
                            if (i11 <= i10) {
                                break;
                                break;
                            }
                            bj4VarO.U(cs9Var2.y(i11));
                        }
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        final long j11 = j2;
                        final List list11 = list3;
                        final oh4 oh4Var115 = oh4Var5;
                        final oh4 oh4Var116 = oh4Var6;
                        xj8VarW.d = new ci4() { // from class: g22
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$6(list11, oh4Var115, j11, oh4Var116, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                        return;
                    }
                    return;
                }
                oh4Var7 = oh4Var5;
                oh4Var8 = oh4Var6;
                if (list3.size() == 1) {
                    bj4VarO.K(2048472753);
                    headerMenuItem2 = (HeaderMenuItem) th1.y(list3);
                    String text7 = headerMenuItem2.getLabel().getText(bj4VarO, StringProvider.$stable);
                    int iIcon7 = icon(headerMenuItem2);
                    boolean enabled7 = headerMenuItem2.getEnabled();
                    bj4VarO.K(-1180838359);
                    if ((i3 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean zJ7 = z5 | bj4VarO.J(headerMenuItem2);
                    if ((i3 & 7168) == 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z6 | zJ7;
                    objF4 = bj4VarO.f();
                    if (z7) {
                        objF4 = new mh4() { // from class: h22
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new mh4() { // from class: h22
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    oh4Var10 = oh4Var8;
                    oh4Var9 = oh4Var7;
                    HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg(text7, enabled7, iIcon7, null, unreadMessagesCount, false, z, false, (mh4) objF4, j2, bj4VarO, ((i3 << 21) & 1879048192) | 12582912, 40);
                    bj4VarO.U(false);
                    z3 = false;
                    z4 = true;
                    j3 = j2;
                } else {
                    str = unreadMessagesCount;
                    oh4Var9 = oh4Var7;
                    bj4VarO.K(2049182188);
                    bj4VarO.K(-1180824432);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    bj4VarO.U(false);
                    ox6 ox6VarR7 = ir9.r(aVar);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarR7);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP2);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode2));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
                    int i117 = R.drawable.intercom_kebab;
                    boolean z14 = !((Boolean) h37Var.getValue()).booleanValue();
                    bj4VarO.K(-1935443118);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z2) {
                        objF2 = new hh1(oh4Var8, h37Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new hh1(oh4Var8, h37Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    oh4Var10 = oh4Var8;
                    HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg("More Menu", true, i117, null, str, z14, z, false, (mh4) objF2, j2, bj4VarO, 12582966 | ((i3 << 21) & 1879048192), 8);
                    ox6 ox6VarN7 = ir9.n(aVar, 220.0f);
                    boolean zBooleanValue7 = ((Boolean) h37Var.getValue()).booleanValue();
                    IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
                    int i118 = IntercomTheme.$stable;
                    j3 = j2;
                    long jA7 = kk.a(intercomTheme7, bj4VarO, i118);
                    b72 b72Var7 = intercomTheme7.getShapes(bj4VarO, i118).b;
                    bj4VarO.K(-1935428387);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        h37Var2 = h37Var;
                        objF3 = new mh4() { // from class: i22
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$14$lambda$13$lambda$12(h37Var2);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        h37Var2 = h37Var;
                    }
                    z3 = false;
                    bj4VarO.U(false);
                    kp.a(zBooleanValue7, (mh4) objF3, ox6VarN7, 0L, null, null, b72Var7, jA7, 8.0f, gr1.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list3, oh4Var9, oh4Var10, j3, h37Var2), bj4VarO), bj4VarO, 805306800);
                    bj4VarO = bj4VarO;
                    z4 = true;
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                }
                bj4VarO.U(z3);
                bj4VarO.U(z4);
                list4 = list3;
                oh4Var11 = oh4Var9;
                oh4Var12 = oh4Var10;
                j4 = j3;
            }
            xj8VarW2 = bj4VarO.W();
            if (xj8VarW2 != null) {
                xj8VarW2.d = new ci4() { // from class: j22
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$16(list4, oh4Var11, j4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        oh4Var3 = oh4Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                j2 = j;
                if (bj4VarO.i(j2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    oh4Var4 = oh4Var2;
                    if (bj4VarO.j(oh4Var4)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i3 & 1171) == 1170) {
                    if (i13 != 0) {
                        list3 = hf3.t;
                    } else {
                        list3 = list2;
                    }
                    c0187a = jt1.a.a;
                    i8 = 0;
                    if (i14 != 0) {
                        bj4VarO.K(2013516817);
                        objF6 = bj4VarO.f();
                        if (objF6 == c0187a) {
                            objF6 = new e22(i8);
                            bj4VarO.C(objF6);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF6;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i4 != 0) {
                        j2 = uh1.b;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(2013519473);
                        objF5 = bj4VarO.f();
                        if (objF5 == c0187a) {
                            objF5 = new f22();
                            bj4VarO.C(objF5);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF5;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    aVar = ox6.a.t;
                    ox6VarC = it1.c(bj4VarO, aVar);
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(2047867851);
                    it = list3.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                    headerMenuItem = (HeaderMenuItem) next;
                    if (headerMenuItem != null) {
                        totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                    } else {
                        totalCountIndicator = null;
                    }
                    if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                        unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                    } else {
                        unreadMessagesCount = null;
                    }
                    z = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                    if (list3.isEmpty()) {
                        bj4VarO.K(2048373646);
                        bj4VarO.U(false);
                        if (i12 >= 0) {
                            if (bj4VarO.S) {
                                cs9Var = bj4VarO.I;
                                while (bj4VarO.S) {
                                    bj4VarO.U(cs9Var.y(cs9Var.v));
                                }
                            }
                            yr9Var = bj4VarO.G;
                            while (true) {
                                i9 = yr9Var.i;
                                if (i9 <= i12) {
                                    break;
                                    break;
                                }
                                bj4VarO.U(yr9Var.l(i9));
                            }
                        } else {
                            i10 = -i12;
                            cs9Var2 = bj4VarO.I;
                            while (true) {
                                i11 = cs9Var2.v;
                                if (i11 <= i10) {
                                    break;
                                    break;
                                }
                                bj4VarO.U(cs9Var2.y(i11));
                            }
                        }
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            final long j12 = j2;
                            final List list12 = list3;
                            final oh4 oh4Var117 = oh4Var5;
                            final oh4 oh4Var118 = oh4Var6;
                            xj8VarW.d = new ci4() { // from class: g22
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$6(list12, oh4Var117, j12, oh4Var118, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                            return;
                        }
                        return;
                    }
                    oh4Var7 = oh4Var5;
                    oh4Var8 = oh4Var6;
                    if (list3.size() == 1) {
                        bj4VarO.K(2048472753);
                        headerMenuItem2 = (HeaderMenuItem) th1.y(list3);
                        String text8 = headerMenuItem2.getLabel().getText(bj4VarO, StringProvider.$stable);
                        int iIcon8 = icon(headerMenuItem2);
                        boolean enabled8 = headerMenuItem2.getEnabled();
                        bj4VarO.K(-1180838359);
                        if ((i3 & 112) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        boolean zJ8 = z5 | bj4VarO.J(headerMenuItem2);
                        if ((i3 & 7168) == 2048) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z6 | zJ8;
                        objF4 = bj4VarO.f();
                        if (z7) {
                            objF4 = new mh4() { // from class: h22
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                                }
                            };
                            bj4VarO.C(objF4);
                        } else {
                            objF4 = new mh4() { // from class: h22
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                                }
                            };
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        oh4Var10 = oh4Var8;
                        oh4Var9 = oh4Var7;
                        HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg(text8, enabled8, iIcon8, null, unreadMessagesCount, false, z, false, (mh4) objF4, j2, bj4VarO, ((i3 << 21) & 1879048192) | 12582912, 40);
                        bj4VarO.U(false);
                        z3 = false;
                        z4 = true;
                        j3 = j2;
                    } else {
                        str = unreadMessagesCount;
                        oh4Var9 = oh4Var7;
                        bj4VarO.K(2049182188);
                        bj4VarO.K(-1180824432);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        bj4VarO.U(false);
                        ox6 ox6VarR8 = ir9.r(aVar);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, ox6VarR8);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP2);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode2));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
                        int i119 = R.drawable.intercom_kebab;
                        boolean z15 = !((Boolean) h37Var.getValue()).booleanValue();
                        bj4VarO.K(-1935443118);
                        if ((i3 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF2 = bj4VarO.f();
                        if (z2) {
                            objF2 = new hh1(oh4Var8, h37Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new hh1(oh4Var8, h37Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var10 = oh4Var8;
                        HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg("More Menu", true, i119, null, str, z15, z, false, (mh4) objF2, j2, bj4VarO, 12582966 | ((i3 << 21) & 1879048192), 8);
                        ox6 ox6VarN8 = ir9.n(aVar, 220.0f);
                        boolean zBooleanValue8 = ((Boolean) h37Var.getValue()).booleanValue();
                        IntercomTheme intercomTheme8 = IntercomTheme.INSTANCE;
                        int i1110 = IntercomTheme.$stable;
                        j3 = j2;
                        long jA8 = kk.a(intercomTheme8, bj4VarO, i1110);
                        b72 b72Var8 = intercomTheme8.getShapes(bj4VarO, i1110).b;
                        bj4VarO.K(-1935428387);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            h37Var2 = h37Var;
                            objF3 = new mh4() { // from class: i22
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$14$lambda$13$lambda$12(h37Var2);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            h37Var2 = h37Var;
                        }
                        z3 = false;
                        bj4VarO.U(false);
                        kp.a(zBooleanValue8, (mh4) objF3, ox6VarN8, 0L, null, null, b72Var8, jA8, 8.0f, gr1.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list3, oh4Var9, oh4Var10, j3, h37Var2), bj4VarO), bj4VarO, 805306800);
                        bj4VarO = bj4VarO;
                        z4 = true;
                        bj4VarO.U(true);
                        bj4VarO.U(false);
                    }
                    bj4VarO.U(z3);
                    bj4VarO.U(z4);
                    list4 = list3;
                    oh4Var11 = oh4Var9;
                    oh4Var12 = oh4Var10;
                    j4 = j3;
                } else {
                    if (i13 != 0) {
                        list3 = hf3.t;
                    } else {
                        list3 = list2;
                    }
                    c0187a = jt1.a.a;
                    i8 = 0;
                    if (i14 != 0) {
                        bj4VarO.K(2013516817);
                        objF6 = bj4VarO.f();
                        if (objF6 == c0187a) {
                            objF6 = new e22(i8);
                            bj4VarO.C(objF6);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF6;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i4 != 0) {
                        j2 = uh1.b;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(2013519473);
                        objF5 = bj4VarO.f();
                        if (objF5 == c0187a) {
                            objF5 = new f22();
                            bj4VarO.C(objF5);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF5;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    aVar = ox6.a.t;
                    ox6VarC = it1.c(bj4VarO, aVar);
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(2047867851);
                    it = list3.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                    headerMenuItem = (HeaderMenuItem) next;
                    if (headerMenuItem != null) {
                        totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                    } else {
                        totalCountIndicator = null;
                    }
                    if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                        unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                    } else {
                        unreadMessagesCount = null;
                    }
                    z = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                    if (list3.isEmpty()) {
                        bj4VarO.K(2048373646);
                        bj4VarO.U(false);
                        if (i12 >= 0) {
                            if (bj4VarO.S) {
                                cs9Var = bj4VarO.I;
                                while (bj4VarO.S) {
                                    bj4VarO.U(cs9Var.y(cs9Var.v));
                                }
                            }
                            yr9Var = bj4VarO.G;
                            while (true) {
                                i9 = yr9Var.i;
                                if (i9 <= i12) {
                                    break;
                                    break;
                                }
                                bj4VarO.U(yr9Var.l(i9));
                            }
                        } else {
                            i10 = -i12;
                            cs9Var2 = bj4VarO.I;
                            while (true) {
                                i11 = cs9Var2.v;
                                if (i11 <= i10) {
                                    break;
                                    break;
                                }
                                bj4VarO.U(cs9Var2.y(i11));
                            }
                        }
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            final long j13 = j2;
                            final List list13 = list3;
                            final oh4 oh4Var119 = oh4Var5;
                            final oh4 oh4Var1110 = oh4Var6;
                            xj8VarW.d = new ci4() { // from class: g22
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$6(list13, oh4Var119, j13, oh4Var1110, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                            return;
                        }
                        return;
                    }
                    oh4Var7 = oh4Var5;
                    oh4Var8 = oh4Var6;
                    if (list3.size() == 1) {
                        bj4VarO.K(2048472753);
                        headerMenuItem2 = (HeaderMenuItem) th1.y(list3);
                        String text9 = headerMenuItem2.getLabel().getText(bj4VarO, StringProvider.$stable);
                        int iIcon9 = icon(headerMenuItem2);
                        boolean enabled9 = headerMenuItem2.getEnabled();
                        bj4VarO.K(-1180838359);
                        if ((i3 & 112) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        boolean zJ9 = z5 | bj4VarO.J(headerMenuItem2);
                        if ((i3 & 7168) == 2048) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z6 | zJ9;
                        objF4 = bj4VarO.f();
                        if (z7) {
                            objF4 = new mh4() { // from class: h22
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                                }
                            };
                            bj4VarO.C(objF4);
                        } else {
                            objF4 = new mh4() { // from class: h22
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                                }
                            };
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        oh4Var10 = oh4Var8;
                        oh4Var9 = oh4Var7;
                        HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg(text9, enabled9, iIcon9, null, unreadMessagesCount, false, z, false, (mh4) objF4, j2, bj4VarO, ((i3 << 21) & 1879048192) | 12582912, 40);
                        bj4VarO.U(false);
                        z3 = false;
                        z4 = true;
                        j3 = j2;
                    } else {
                        str = unreadMessagesCount;
                        oh4Var9 = oh4Var7;
                        bj4VarO.K(2049182188);
                        bj4VarO.K(-1180824432);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        bj4VarO.U(false);
                        ox6 ox6VarR9 = ir9.r(aVar);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, ox6VarR9);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP2);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode2));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
                        int i1111 = R.drawable.intercom_kebab;
                        boolean z16 = !((Boolean) h37Var.getValue()).booleanValue();
                        bj4VarO.K(-1935443118);
                        if ((i3 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF2 = bj4VarO.f();
                        if (z2) {
                            objF2 = new hh1(oh4Var8, h37Var);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new hh1(oh4Var8, h37Var);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var10 = oh4Var8;
                        HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg("More Menu", true, i1111, null, str, z16, z, false, (mh4) objF2, j2, bj4VarO, 12582966 | ((i3 << 21) & 1879048192), 8);
                        ox6 ox6VarN9 = ir9.n(aVar, 220.0f);
                        boolean zBooleanValue9 = ((Boolean) h37Var.getValue()).booleanValue();
                        IntercomTheme intercomTheme9 = IntercomTheme.INSTANCE;
                        int i1112 = IntercomTheme.$stable;
                        j3 = j2;
                        long jA9 = kk.a(intercomTheme9, bj4VarO, i1112);
                        b72 b72Var9 = intercomTheme9.getShapes(bj4VarO, i1112).b;
                        bj4VarO.K(-1935428387);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            h37Var2 = h37Var;
                            objF3 = new mh4() { // from class: i22
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$14$lambda$13$lambda$12(h37Var2);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            h37Var2 = h37Var;
                        }
                        z3 = false;
                        bj4VarO.U(false);
                        kp.a(zBooleanValue9, (mh4) objF3, ox6VarN9, 0L, null, null, b72Var9, jA9, 8.0f, gr1.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list3, oh4Var9, oh4Var10, j3, h37Var2), bj4VarO), bj4VarO, 805306800);
                        bj4VarO = bj4VarO;
                        z4 = true;
                        bj4VarO.U(true);
                        bj4VarO.U(false);
                    }
                    bj4VarO.U(z3);
                    bj4VarO.U(z4);
                    list4 = list3;
                    oh4Var11 = oh4Var9;
                    oh4Var12 = oh4Var10;
                    j4 = j3;
                }
                xj8VarW2 = bj4VarO.W();
                if (xj8VarW2 != null) {
                    xj8VarW2.d = new ci4() { // from class: j22
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$16(list4, oh4Var11, j4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            oh4Var4 = oh4Var2;
            if ((i3 & 1171) == 1170) {
                if (i13 != 0) {
                    list3 = hf3.t;
                } else {
                    list3 = list2;
                }
                c0187a = jt1.a.a;
                i8 = 0;
                if (i14 != 0) {
                    bj4VarO.K(2013516817);
                    objF6 = bj4VarO.f();
                    if (objF6 == c0187a) {
                        objF6 = new e22(i8);
                        bj4VarO.C(objF6);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF6;
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i4 != 0) {
                    j2 = uh1.b;
                }
                if (i6 != 0) {
                    bj4VarO.K(2013519473);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new f22();
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF5;
                } else {
                    oh4Var6 = oh4Var4;
                }
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                aVar = ox6.a.t;
                ox6VarC = it1.c(bj4VarO, aVar);
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(2047867851);
                it = list3.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                headerMenuItem = (HeaderMenuItem) next;
                if (headerMenuItem != null) {
                    totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                } else {
                    totalCountIndicator = null;
                }
                if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                    unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                } else {
                    unreadMessagesCount = null;
                }
                z = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                if (list3.isEmpty()) {
                    bj4VarO.K(2048373646);
                    bj4VarO.U(false);
                    if (i12 >= 0) {
                        if (bj4VarO.S) {
                            cs9Var = bj4VarO.I;
                            while (bj4VarO.S) {
                                bj4VarO.U(cs9Var.y(cs9Var.v));
                            }
                        }
                        yr9Var = bj4VarO.G;
                        while (true) {
                            i9 = yr9Var.i;
                            if (i9 <= i12) {
                                break;
                                break;
                            }
                            bj4VarO.U(yr9Var.l(i9));
                        }
                    } else {
                        i10 = -i12;
                        cs9Var2 = bj4VarO.I;
                        while (true) {
                            i11 = cs9Var2.v;
                            if (i11 <= i10) {
                                break;
                                break;
                            }
                            bj4VarO.U(cs9Var2.y(i11));
                        }
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        final long j14 = j2;
                        final List list14 = list3;
                        final oh4 oh4Var1111 = oh4Var5;
                        final oh4 oh4Var1112 = oh4Var6;
                        xj8VarW.d = new ci4() { // from class: g22
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$6(list14, oh4Var1111, j14, oh4Var1112, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                        return;
                    }
                    return;
                }
                oh4Var7 = oh4Var5;
                oh4Var8 = oh4Var6;
                if (list3.size() == 1) {
                    bj4VarO.K(2048472753);
                    headerMenuItem2 = (HeaderMenuItem) th1.y(list3);
                    String text10 = headerMenuItem2.getLabel().getText(bj4VarO, StringProvider.$stable);
                    int iIcon10 = icon(headerMenuItem2);
                    boolean enabled10 = headerMenuItem2.getEnabled();
                    bj4VarO.K(-1180838359);
                    if ((i3 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean zJ10 = z5 | bj4VarO.J(headerMenuItem2);
                    if ((i3 & 7168) == 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z6 | zJ10;
                    objF4 = bj4VarO.f();
                    if (z7) {
                        objF4 = new mh4() { // from class: h22
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new mh4() { // from class: h22
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    oh4Var10 = oh4Var8;
                    oh4Var9 = oh4Var7;
                    HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg(text10, enabled10, iIcon10, null, unreadMessagesCount, false, z, false, (mh4) objF4, j2, bj4VarO, ((i3 << 21) & 1879048192) | 12582912, 40);
                    bj4VarO.U(false);
                    z3 = false;
                    z4 = true;
                    j3 = j2;
                } else {
                    str = unreadMessagesCount;
                    oh4Var9 = oh4Var7;
                    bj4VarO.K(2049182188);
                    bj4VarO.K(-1180824432);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    bj4VarO.U(false);
                    ox6 ox6VarR10 = ir9.r(aVar);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarR10);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP2);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode2));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
                    int i1113 = R.drawable.intercom_kebab;
                    boolean z17 = !((Boolean) h37Var.getValue()).booleanValue();
                    bj4VarO.K(-1935443118);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z2) {
                        objF2 = new hh1(oh4Var8, h37Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new hh1(oh4Var8, h37Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    oh4Var10 = oh4Var8;
                    HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg("More Menu", true, i1113, null, str, z17, z, false, (mh4) objF2, j2, bj4VarO, 12582966 | ((i3 << 21) & 1879048192), 8);
                    ox6 ox6VarN10 = ir9.n(aVar, 220.0f);
                    boolean zBooleanValue10 = ((Boolean) h37Var.getValue()).booleanValue();
                    IntercomTheme intercomTheme10 = IntercomTheme.INSTANCE;
                    int i1114 = IntercomTheme.$stable;
                    j3 = j2;
                    long jA10 = kk.a(intercomTheme10, bj4VarO, i1114);
                    b72 b72Var10 = intercomTheme10.getShapes(bj4VarO, i1114).b;
                    bj4VarO.K(-1935428387);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        h37Var2 = h37Var;
                        objF3 = new mh4() { // from class: i22
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$14$lambda$13$lambda$12(h37Var2);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        h37Var2 = h37Var;
                    }
                    z3 = false;
                    bj4VarO.U(false);
                    kp.a(zBooleanValue10, (mh4) objF3, ox6VarN10, 0L, null, null, b72Var10, jA10, 8.0f, gr1.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list3, oh4Var9, oh4Var10, j3, h37Var2), bj4VarO), bj4VarO, 805306800);
                    bj4VarO = bj4VarO;
                    z4 = true;
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                }
                bj4VarO.U(z3);
                bj4VarO.U(z4);
                list4 = list3;
                oh4Var11 = oh4Var9;
                oh4Var12 = oh4Var10;
                j4 = j3;
            } else {
                if (i13 != 0) {
                    list3 = hf3.t;
                } else {
                    list3 = list2;
                }
                c0187a = jt1.a.a;
                i8 = 0;
                if (i14 != 0) {
                    bj4VarO.K(2013516817);
                    objF6 = bj4VarO.f();
                    if (objF6 == c0187a) {
                        objF6 = new e22(i8);
                        bj4VarO.C(objF6);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF6;
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i4 != 0) {
                    j2 = uh1.b;
                }
                if (i6 != 0) {
                    bj4VarO.K(2013519473);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new f22();
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF5;
                } else {
                    oh4Var6 = oh4Var4;
                }
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                aVar = ox6.a.t;
                ox6VarC = it1.c(bj4VarO, aVar);
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(2047867851);
                it = list3.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                headerMenuItem = (HeaderMenuItem) next;
                if (headerMenuItem != null) {
                    totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                } else {
                    totalCountIndicator = null;
                }
                if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                    unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                } else {
                    unreadMessagesCount = null;
                }
                z = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                if (list3.isEmpty()) {
                    bj4VarO.K(2048373646);
                    bj4VarO.U(false);
                    if (i12 >= 0) {
                        if (bj4VarO.S) {
                            cs9Var = bj4VarO.I;
                            while (bj4VarO.S) {
                                bj4VarO.U(cs9Var.y(cs9Var.v));
                            }
                        }
                        yr9Var = bj4VarO.G;
                        while (true) {
                            i9 = yr9Var.i;
                            if (i9 <= i12) {
                                break;
                                break;
                            }
                            bj4VarO.U(yr9Var.l(i9));
                        }
                    } else {
                        i10 = -i12;
                        cs9Var2 = bj4VarO.I;
                        while (true) {
                            i11 = cs9Var2.v;
                            if (i11 <= i10) {
                                break;
                                break;
                            }
                            bj4VarO.U(cs9Var2.y(i11));
                        }
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        final long j15 = j2;
                        final List list15 = list3;
                        final oh4 oh4Var1113 = oh4Var5;
                        final oh4 oh4Var1114 = oh4Var6;
                        xj8VarW.d = new ci4() { // from class: g22
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$6(list15, oh4Var1113, j15, oh4Var1114, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                        return;
                    }
                    return;
                }
                oh4Var7 = oh4Var5;
                oh4Var8 = oh4Var6;
                if (list3.size() == 1) {
                    bj4VarO.K(2048472753);
                    headerMenuItem2 = (HeaderMenuItem) th1.y(list3);
                    String text11 = headerMenuItem2.getLabel().getText(bj4VarO, StringProvider.$stable);
                    int iIcon11 = icon(headerMenuItem2);
                    boolean enabled11 = headerMenuItem2.getEnabled();
                    bj4VarO.K(-1180838359);
                    if ((i3 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean zJ11 = z5 | bj4VarO.J(headerMenuItem2);
                    if ((i3 & 7168) == 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z6 | zJ11;
                    objF4 = bj4VarO.f();
                    if (z7) {
                        objF4 = new mh4() { // from class: h22
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new mh4() { // from class: h22
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    oh4Var10 = oh4Var8;
                    oh4Var9 = oh4Var7;
                    HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg(text11, enabled11, iIcon11, null, unreadMessagesCount, false, z, false, (mh4) objF4, j2, bj4VarO, ((i3 << 21) & 1879048192) | 12582912, 40);
                    bj4VarO.U(false);
                    z3 = false;
                    z4 = true;
                    j3 = j2;
                } else {
                    str = unreadMessagesCount;
                    oh4Var9 = oh4Var7;
                    bj4VarO.K(2049182188);
                    bj4VarO.K(-1180824432);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    bj4VarO.U(false);
                    ox6 ox6VarR11 = ir9.r(aVar);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarR11);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP2);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode2));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
                    int i1115 = R.drawable.intercom_kebab;
                    boolean z18 = !((Boolean) h37Var.getValue()).booleanValue();
                    bj4VarO.K(-1935443118);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z2) {
                        objF2 = new hh1(oh4Var8, h37Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new hh1(oh4Var8, h37Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    oh4Var10 = oh4Var8;
                    HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg("More Menu", true, i1115, null, str, z18, z, false, (mh4) objF2, j2, bj4VarO, 12582966 | ((i3 << 21) & 1879048192), 8);
                    ox6 ox6VarN11 = ir9.n(aVar, 220.0f);
                    boolean zBooleanValue11 = ((Boolean) h37Var.getValue()).booleanValue();
                    IntercomTheme intercomTheme11 = IntercomTheme.INSTANCE;
                    int i1116 = IntercomTheme.$stable;
                    j3 = j2;
                    long jA11 = kk.a(intercomTheme11, bj4VarO, i1116);
                    b72 b72Var11 = intercomTheme11.getShapes(bj4VarO, i1116).b;
                    bj4VarO.K(-1935428387);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        h37Var2 = h37Var;
                        objF3 = new mh4() { // from class: i22
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$14$lambda$13$lambda$12(h37Var2);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        h37Var2 = h37Var;
                    }
                    z3 = false;
                    bj4VarO.U(false);
                    kp.a(zBooleanValue11, (mh4) objF3, ox6VarN11, 0L, null, null, b72Var11, jA11, 8.0f, gr1.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list3, oh4Var9, oh4Var10, j3, h37Var2), bj4VarO), bj4VarO, 805306800);
                    bj4VarO = bj4VarO;
                    z4 = true;
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                }
                bj4VarO.U(z3);
                bj4VarO.U(z4);
                list4 = list3;
                oh4Var11 = oh4Var9;
                oh4Var12 = oh4Var10;
                j4 = j3;
            }
            xj8VarW2 = bj4VarO.W();
            if (xj8VarW2 != null) {
                xj8VarW2.d = new ci4() { // from class: j22
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$16(list4, oh4Var11, j4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        j2 = j;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                oh4Var4 = oh4Var2;
                if (bj4VarO.j(oh4Var4)) {
                    i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i3 & 1171) == 1170) {
                if (i13 != 0) {
                    list3 = hf3.t;
                } else {
                    list3 = list2;
                }
                c0187a = jt1.a.a;
                i8 = 0;
                if (i14 != 0) {
                    bj4VarO.K(2013516817);
                    objF6 = bj4VarO.f();
                    if (objF6 == c0187a) {
                        objF6 = new e22(i8);
                        bj4VarO.C(objF6);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF6;
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i4 != 0) {
                    j2 = uh1.b;
                }
                if (i6 != 0) {
                    bj4VarO.K(2013519473);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new f22();
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF5;
                } else {
                    oh4Var6 = oh4Var4;
                }
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                aVar = ox6.a.t;
                ox6VarC = it1.c(bj4VarO, aVar);
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(2047867851);
                it = list3.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                headerMenuItem = (HeaderMenuItem) next;
                if (headerMenuItem != null) {
                    totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                } else {
                    totalCountIndicator = null;
                }
                if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                    unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                } else {
                    unreadMessagesCount = null;
                }
                z = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                if (list3.isEmpty()) {
                    bj4VarO.K(2048373646);
                    bj4VarO.U(false);
                    if (i12 >= 0) {
                        if (bj4VarO.S) {
                            cs9Var = bj4VarO.I;
                            while (bj4VarO.S) {
                                bj4VarO.U(cs9Var.y(cs9Var.v));
                            }
                        }
                        yr9Var = bj4VarO.G;
                        while (true) {
                            i9 = yr9Var.i;
                            if (i9 <= i12) {
                                break;
                                break;
                            }
                            bj4VarO.U(yr9Var.l(i9));
                        }
                    } else {
                        i10 = -i12;
                        cs9Var2 = bj4VarO.I;
                        while (true) {
                            i11 = cs9Var2.v;
                            if (i11 <= i10) {
                                break;
                                break;
                            }
                            bj4VarO.U(cs9Var2.y(i11));
                        }
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        final long j16 = j2;
                        final List list16 = list3;
                        final oh4 oh4Var1115 = oh4Var5;
                        final oh4 oh4Var1116 = oh4Var6;
                        xj8VarW.d = new ci4() { // from class: g22
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$6(list16, oh4Var1115, j16, oh4Var1116, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                        return;
                    }
                    return;
                }
                oh4Var7 = oh4Var5;
                oh4Var8 = oh4Var6;
                if (list3.size() == 1) {
                    bj4VarO.K(2048472753);
                    headerMenuItem2 = (HeaderMenuItem) th1.y(list3);
                    String text12 = headerMenuItem2.getLabel().getText(bj4VarO, StringProvider.$stable);
                    int iIcon12 = icon(headerMenuItem2);
                    boolean enabled12 = headerMenuItem2.getEnabled();
                    bj4VarO.K(-1180838359);
                    if ((i3 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean zJ12 = z5 | bj4VarO.J(headerMenuItem2);
                    if ((i3 & 7168) == 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z6 | zJ12;
                    objF4 = bj4VarO.f();
                    if (z7) {
                        objF4 = new mh4() { // from class: h22
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new mh4() { // from class: h22
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    oh4Var10 = oh4Var8;
                    oh4Var9 = oh4Var7;
                    HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg(text12, enabled12, iIcon12, null, unreadMessagesCount, false, z, false, (mh4) objF4, j2, bj4VarO, ((i3 << 21) & 1879048192) | 12582912, 40);
                    bj4VarO.U(false);
                    z3 = false;
                    z4 = true;
                    j3 = j2;
                } else {
                    str = unreadMessagesCount;
                    oh4Var9 = oh4Var7;
                    bj4VarO.K(2049182188);
                    bj4VarO.K(-1180824432);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    bj4VarO.U(false);
                    ox6 ox6VarR12 = ir9.r(aVar);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarR12);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP2);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode2));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
                    int i1117 = R.drawable.intercom_kebab;
                    boolean z19 = !((Boolean) h37Var.getValue()).booleanValue();
                    bj4VarO.K(-1935443118);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z2) {
                        objF2 = new hh1(oh4Var8, h37Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new hh1(oh4Var8, h37Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    oh4Var10 = oh4Var8;
                    HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg("More Menu", true, i1117, null, str, z19, z, false, (mh4) objF2, j2, bj4VarO, 12582966 | ((i3 << 21) & 1879048192), 8);
                    ox6 ox6VarN12 = ir9.n(aVar, 220.0f);
                    boolean zBooleanValue12 = ((Boolean) h37Var.getValue()).booleanValue();
                    IntercomTheme intercomTheme12 = IntercomTheme.INSTANCE;
                    int i1118 = IntercomTheme.$stable;
                    j3 = j2;
                    long jA12 = kk.a(intercomTheme12, bj4VarO, i1118);
                    b72 b72Var12 = intercomTheme12.getShapes(bj4VarO, i1118).b;
                    bj4VarO.K(-1935428387);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        h37Var2 = h37Var;
                        objF3 = new mh4() { // from class: i22
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$14$lambda$13$lambda$12(h37Var2);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        h37Var2 = h37Var;
                    }
                    z3 = false;
                    bj4VarO.U(false);
                    kp.a(zBooleanValue12, (mh4) objF3, ox6VarN12, 0L, null, null, b72Var12, jA12, 8.0f, gr1.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list3, oh4Var9, oh4Var10, j3, h37Var2), bj4VarO), bj4VarO, 805306800);
                    bj4VarO = bj4VarO;
                    z4 = true;
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                }
                bj4VarO.U(z3);
                bj4VarO.U(z4);
                list4 = list3;
                oh4Var11 = oh4Var9;
                oh4Var12 = oh4Var10;
                j4 = j3;
            } else {
                if (i13 != 0) {
                    list3 = hf3.t;
                } else {
                    list3 = list2;
                }
                c0187a = jt1.a.a;
                i8 = 0;
                if (i14 != 0) {
                    bj4VarO.K(2013516817);
                    objF6 = bj4VarO.f();
                    if (objF6 == c0187a) {
                        objF6 = new e22(i8);
                        bj4VarO.C(objF6);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF6;
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i4 != 0) {
                    j2 = uh1.b;
                }
                if (i6 != 0) {
                    bj4VarO.K(2013519473);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new f22();
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF5;
                } else {
                    oh4Var6 = oh4Var4;
                }
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                aVar = ox6.a.t;
                ox6VarC = it1.c(bj4VarO, aVar);
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(2047867851);
                it = list3.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                headerMenuItem = (HeaderMenuItem) next;
                if (headerMenuItem != null) {
                    totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                } else {
                    totalCountIndicator = null;
                }
                if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                    unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                } else {
                    unreadMessagesCount = null;
                }
                z = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                if (list3.isEmpty()) {
                    bj4VarO.K(2048373646);
                    bj4VarO.U(false);
                    if (i12 >= 0) {
                        if (bj4VarO.S) {
                            cs9Var = bj4VarO.I;
                            while (bj4VarO.S) {
                                bj4VarO.U(cs9Var.y(cs9Var.v));
                            }
                        }
                        yr9Var = bj4VarO.G;
                        while (true) {
                            i9 = yr9Var.i;
                            if (i9 <= i12) {
                                break;
                                break;
                            }
                            bj4VarO.U(yr9Var.l(i9));
                        }
                    } else {
                        i10 = -i12;
                        cs9Var2 = bj4VarO.I;
                        while (true) {
                            i11 = cs9Var2.v;
                            if (i11 <= i10) {
                                break;
                                break;
                            }
                            bj4VarO.U(cs9Var2.y(i11));
                        }
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        final long j17 = j2;
                        final List list17 = list3;
                        final oh4 oh4Var1117 = oh4Var5;
                        final oh4 oh4Var1118 = oh4Var6;
                        xj8VarW.d = new ci4() { // from class: g22
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$6(list17, oh4Var1117, j17, oh4Var1118, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                        return;
                    }
                    return;
                }
                oh4Var7 = oh4Var5;
                oh4Var8 = oh4Var6;
                if (list3.size() == 1) {
                    bj4VarO.K(2048472753);
                    headerMenuItem2 = (HeaderMenuItem) th1.y(list3);
                    String text13 = headerMenuItem2.getLabel().getText(bj4VarO, StringProvider.$stable);
                    int iIcon13 = icon(headerMenuItem2);
                    boolean enabled13 = headerMenuItem2.getEnabled();
                    bj4VarO.K(-1180838359);
                    if ((i3 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean zJ13 = z5 | bj4VarO.J(headerMenuItem2);
                    if ((i3 & 7168) == 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z6 | zJ13;
                    objF4 = bj4VarO.f();
                    if (z7) {
                        objF4 = new mh4() { // from class: h22
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new mh4() { // from class: h22
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    oh4Var10 = oh4Var8;
                    oh4Var9 = oh4Var7;
                    HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg(text13, enabled13, iIcon13, null, unreadMessagesCount, false, z, false, (mh4) objF4, j2, bj4VarO, ((i3 << 21) & 1879048192) | 12582912, 40);
                    bj4VarO.U(false);
                    z3 = false;
                    z4 = true;
                    j3 = j2;
                } else {
                    str = unreadMessagesCount;
                    oh4Var9 = oh4Var7;
                    bj4VarO.K(2049182188);
                    bj4VarO.K(-1180824432);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    bj4VarO.U(false);
                    ox6 ox6VarR13 = ir9.r(aVar);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarR13);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP2);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode2));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
                    int i1119 = R.drawable.intercom_kebab;
                    boolean z110 = !((Boolean) h37Var.getValue()).booleanValue();
                    bj4VarO.K(-1935443118);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z2) {
                        objF2 = new hh1(oh4Var8, h37Var);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new hh1(oh4Var8, h37Var);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    oh4Var10 = oh4Var8;
                    HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg("More Menu", true, i1119, null, str, z110, z, false, (mh4) objF2, j2, bj4VarO, 12582966 | ((i3 << 21) & 1879048192), 8);
                    ox6 ox6VarN13 = ir9.n(aVar, 220.0f);
                    boolean zBooleanValue13 = ((Boolean) h37Var.getValue()).booleanValue();
                    IntercomTheme intercomTheme13 = IntercomTheme.INSTANCE;
                    int i11110 = IntercomTheme.$stable;
                    j3 = j2;
                    long jA13 = kk.a(intercomTheme13, bj4VarO, i11110);
                    b72 b72Var13 = intercomTheme13.getShapes(bj4VarO, i11110).b;
                    bj4VarO.K(-1935428387);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        h37Var2 = h37Var;
                        objF3 = new mh4() { // from class: i22
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$14$lambda$13$lambda$12(h37Var2);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        h37Var2 = h37Var;
                    }
                    z3 = false;
                    bj4VarO.U(false);
                    kp.a(zBooleanValue13, (mh4) objF3, ox6VarN13, 0L, null, null, b72Var13, jA13, 8.0f, gr1.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list3, oh4Var9, oh4Var10, j3, h37Var2), bj4VarO), bj4VarO, 805306800);
                    bj4VarO = bj4VarO;
                    z4 = true;
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                }
                bj4VarO.U(z3);
                bj4VarO.U(z4);
                list4 = list3;
                oh4Var11 = oh4Var9;
                oh4Var12 = oh4Var10;
                j4 = j3;
            }
            xj8VarW2 = bj4VarO.W();
            if (xj8VarW2 != null) {
                xj8VarW2.d = new ci4() { // from class: j22
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$16(list4, oh4Var11, j4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        oh4Var4 = oh4Var2;
        if ((i3 & 1171) == 1170) {
            if (i13 != 0) {
                list3 = hf3.t;
            } else {
                list3 = list2;
            }
            c0187a = jt1.a.a;
            i8 = 0;
            if (i14 != 0) {
                bj4VarO.K(2013516817);
                objF6 = bj4VarO.f();
                if (objF6 == c0187a) {
                    objF6 = new e22(i8);
                    bj4VarO.C(objF6);
                }
                bj4VarO.U(false);
                oh4Var5 = (oh4) objF6;
            } else {
                oh4Var5 = oh4Var3;
            }
            if (i4 != 0) {
                j2 = uh1.b;
            }
            if (i6 != 0) {
                bj4VarO.K(2013519473);
                objF5 = bj4VarO.f();
                if (objF5 == c0187a) {
                    objF5 = new f22();
                    bj4VarO.C(objF5);
                }
                bj4VarO.U(false);
                oh4Var6 = (oh4) objF5;
            } else {
                oh4Var6 = oh4Var4;
            }
            ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            aVar = ox6.a.t;
            ox6VarC = it1.c(bj4VarO, aVar);
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
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(2047867851);
            it = list3.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
            headerMenuItem = (HeaderMenuItem) next;
            if (headerMenuItem != null) {
                totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
            } else {
                totalCountIndicator = null;
            }
            if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
            } else {
                unreadMessagesCount = null;
            }
            z = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
            if (list3.isEmpty()) {
                bj4VarO.K(2048373646);
                bj4VarO.U(false);
                if (i12 >= 0) {
                    if (bj4VarO.S) {
                        cs9Var = bj4VarO.I;
                        while (bj4VarO.S) {
                            bj4VarO.U(cs9Var.y(cs9Var.v));
                        }
                    }
                    yr9Var = bj4VarO.G;
                    while (true) {
                        i9 = yr9Var.i;
                        if (i9 <= i12) {
                            break;
                            break;
                        }
                        bj4VarO.U(yr9Var.l(i9));
                    }
                } else {
                    i10 = -i12;
                    cs9Var2 = bj4VarO.I;
                    while (true) {
                        i11 = cs9Var2.v;
                        if (i11 <= i10) {
                            break;
                            break;
                        }
                        bj4VarO.U(cs9Var2.y(i11));
                    }
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    final long j18 = j2;
                    final List list18 = list3;
                    final oh4 oh4Var1119 = oh4Var5;
                    final oh4 oh4Var11110 = oh4Var6;
                    xj8VarW.d = new ci4() { // from class: g22
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$6(list18, oh4Var1119, j18, oh4Var11110, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                    return;
                }
                return;
            }
            oh4Var7 = oh4Var5;
            oh4Var8 = oh4Var6;
            if (list3.size() == 1) {
                bj4VarO.K(2048472753);
                headerMenuItem2 = (HeaderMenuItem) th1.y(list3);
                String text14 = headerMenuItem2.getLabel().getText(bj4VarO, StringProvider.$stable);
                int iIcon14 = icon(headerMenuItem2);
                boolean enabled14 = headerMenuItem2.getEnabled();
                bj4VarO.K(-1180838359);
                if ((i3 & 112) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean zJ14 = z5 | bj4VarO.J(headerMenuItem2);
                if ((i3 & 7168) == 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z6 | zJ14;
                objF4 = bj4VarO.f();
                if (z7) {
                    objF4 = new mh4() { // from class: h22
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    objF4 = new mh4() { // from class: h22
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                oh4Var10 = oh4Var8;
                oh4Var9 = oh4Var7;
                HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg(text14, enabled14, iIcon14, null, unreadMessagesCount, false, z, false, (mh4) objF4, j2, bj4VarO, ((i3 << 21) & 1879048192) | 12582912, 40);
                bj4VarO.U(false);
                z3 = false;
                z4 = true;
                j3 = j2;
            } else {
                str = unreadMessagesCount;
                oh4Var9 = oh4Var7;
                bj4VarO.K(2049182188);
                bj4VarO.K(-1180824432);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                bj4VarO.U(false);
                ox6 ox6VarR14 = ir9.r(aVar);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarR14);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP2);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode2));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
                int i11111 = R.drawable.intercom_kebab;
                boolean z111 = !((Boolean) h37Var.getValue()).booleanValue();
                bj4VarO.K(-1935443118);
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objF2 = bj4VarO.f();
                if (z2) {
                    objF2 = new hh1(oh4Var8, h37Var);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new hh1(oh4Var8, h37Var);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                oh4Var10 = oh4Var8;
                HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg("More Menu", true, i11111, null, str, z111, z, false, (mh4) objF2, j2, bj4VarO, 12582966 | ((i3 << 21) & 1879048192), 8);
                ox6 ox6VarN14 = ir9.n(aVar, 220.0f);
                boolean zBooleanValue14 = ((Boolean) h37Var.getValue()).booleanValue();
                IntercomTheme intercomTheme14 = IntercomTheme.INSTANCE;
                int i11112 = IntercomTheme.$stable;
                j3 = j2;
                long jA14 = kk.a(intercomTheme14, bj4VarO, i11112);
                b72 b72Var14 = intercomTheme14.getShapes(bj4VarO, i11112).b;
                bj4VarO.K(-1935428387);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    h37Var2 = h37Var;
                    objF3 = new mh4() { // from class: i22
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$14$lambda$13$lambda$12(h37Var2);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    h37Var2 = h37Var;
                }
                z3 = false;
                bj4VarO.U(false);
                kp.a(zBooleanValue14, (mh4) objF3, ox6VarN14, 0L, null, null, b72Var14, jA14, 8.0f, gr1.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list3, oh4Var9, oh4Var10, j3, h37Var2), bj4VarO), bj4VarO, 805306800);
                bj4VarO = bj4VarO;
                z4 = true;
                bj4VarO.U(true);
                bj4VarO.U(false);
            }
            bj4VarO.U(z3);
            bj4VarO.U(z4);
            list4 = list3;
            oh4Var11 = oh4Var9;
            oh4Var12 = oh4Var10;
            j4 = j3;
        } else {
            if (i13 != 0) {
                list3 = hf3.t;
            } else {
                list3 = list2;
            }
            c0187a = jt1.a.a;
            i8 = 0;
            if (i14 != 0) {
                bj4VarO.K(2013516817);
                objF6 = bj4VarO.f();
                if (objF6 == c0187a) {
                    objF6 = new e22(i8);
                    bj4VarO.C(objF6);
                }
                bj4VarO.U(false);
                oh4Var5 = (oh4) objF6;
            } else {
                oh4Var5 = oh4Var3;
            }
            if (i4 != 0) {
                j2 = uh1.b;
            }
            if (i6 != 0) {
                bj4VarO.K(2013519473);
                objF5 = bj4VarO.f();
                if (objF5 == c0187a) {
                    objF5 = new f22();
                    bj4VarO.C(objF5);
                }
                bj4VarO.U(false);
                oh4Var6 = (oh4) objF5;
            } else {
                oh4Var6 = oh4Var4;
            }
            ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            aVar = ox6.a.t;
            ox6VarC = it1.c(bj4VarO, aVar);
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
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(2047867851);
            it = list3.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
            headerMenuItem = (HeaderMenuItem) next;
            if (headerMenuItem != null) {
                totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
            } else {
                totalCountIndicator = null;
            }
            if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
            } else {
                unreadMessagesCount = null;
            }
            z = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
            if (list3.isEmpty()) {
                bj4VarO.K(2048373646);
                bj4VarO.U(false);
                if (i12 >= 0) {
                    if (bj4VarO.S) {
                        cs9Var = bj4VarO.I;
                        while (bj4VarO.S) {
                            bj4VarO.U(cs9Var.y(cs9Var.v));
                        }
                    }
                    yr9Var = bj4VarO.G;
                    while (true) {
                        i9 = yr9Var.i;
                        if (i9 <= i12) {
                            break;
                            break;
                        }
                        bj4VarO.U(yr9Var.l(i9));
                    }
                } else {
                    i10 = -i12;
                    cs9Var2 = bj4VarO.I;
                    while (true) {
                        i11 = cs9Var2.v;
                        if (i11 <= i10) {
                            break;
                            break;
                        }
                        bj4VarO.U(cs9Var2.y(i11));
                    }
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    final long j19 = j2;
                    final List list19 = list3;
                    final oh4 oh4Var11111 = oh4Var5;
                    final oh4 oh4Var11112 = oh4Var6;
                    xj8VarW.d = new ci4() { // from class: g22
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$6(list19, oh4Var11111, j19, oh4Var11112, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                    return;
                }
                return;
            }
            oh4Var7 = oh4Var5;
            oh4Var8 = oh4Var6;
            if (list3.size() == 1) {
                bj4VarO.K(2048472753);
                headerMenuItem2 = (HeaderMenuItem) th1.y(list3);
                String text15 = headerMenuItem2.getLabel().getText(bj4VarO, StringProvider.$stable);
                int iIcon15 = icon(headerMenuItem2);
                boolean enabled15 = headerMenuItem2.getEnabled();
                bj4VarO.K(-1180838359);
                if ((i3 & 112) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean zJ15 = z5 | bj4VarO.J(headerMenuItem2);
                if ((i3 & 7168) == 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z6 | zJ15;
                objF4 = bj4VarO.f();
                if (z7) {
                    objF4 = new mh4() { // from class: h22
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    objF4 = new mh4() { // from class: h22
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4Var7, headerMenuItem2, oh4Var8);
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                oh4Var10 = oh4Var8;
                oh4Var9 = oh4Var7;
                HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg(text15, enabled15, iIcon15, null, unreadMessagesCount, false, z, false, (mh4) objF4, j2, bj4VarO, ((i3 << 21) & 1879048192) | 12582912, 40);
                bj4VarO.U(false);
                z3 = false;
                z4 = true;
                j3 = j2;
            } else {
                str = unreadMessagesCount;
                oh4Var9 = oh4Var7;
                bj4VarO.K(2049182188);
                bj4VarO.K(-1180824432);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                bj4VarO.U(false);
                ox6 ox6VarR15 = ir9.r(aVar);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarR15);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP2);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode2));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
                int i11113 = R.drawable.intercom_kebab;
                boolean z112 = !((Boolean) h37Var.getValue()).booleanValue();
                bj4VarO.K(-1935443118);
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objF2 = bj4VarO.f();
                if (z2) {
                    objF2 = new hh1(oh4Var8, h37Var);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new hh1(oh4Var8, h37Var);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                oh4Var10 = oh4Var8;
                HeaderMenuItemRowKt.m149HeaderMenuItemRow6RhP_wg("More Menu", true, i11113, null, str, z112, z, false, (mh4) objF2, j2, bj4VarO, 12582966 | ((i3 << 21) & 1879048192), 8);
                ox6 ox6VarN15 = ir9.n(aVar, 220.0f);
                boolean zBooleanValue15 = ((Boolean) h37Var.getValue()).booleanValue();
                IntercomTheme intercomTheme15 = IntercomTheme.INSTANCE;
                int i11114 = IntercomTheme.$stable;
                j3 = j2;
                long jA15 = kk.a(intercomTheme15, bj4VarO, i11114);
                b72 b72Var15 = intercomTheme15.getShapes(bj4VarO, i11114).b;
                bj4VarO.K(-1935428387);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    h37Var2 = h37Var;
                    objF3 = new mh4() { // from class: i22
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$15$lambda$14$lambda$13$lambda$12(h37Var2);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    h37Var2 = h37Var;
                }
                z3 = false;
                bj4VarO.U(false);
                kp.a(zBooleanValue15, (mh4) objF3, ox6VarN15, 0L, null, null, b72Var15, jA15, 8.0f, gr1.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list3, oh4Var9, oh4Var10, j3, h37Var2), bj4VarO), bj4VarO, 805306800);
                bj4VarO = bj4VarO;
                z4 = true;
                bj4VarO.U(true);
                bj4VarO.U(false);
            }
            bj4VarO.U(z3);
            bj4VarO.U(z4);
            list4 = list3;
            oh4Var11 = oh4Var9;
            oh4Var12 = oh4Var10;
            j4 = j3;
        }
        xj8VarW2 = bj4VarO.W();
        if (xj8VarW2 != null) {
            xj8VarW2.d = new ci4() { // from class: j22
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$16(list4, oh4Var11, j4, oh4Var12, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationKebab_cf5BqRc$lambda$1$lambda$0(HeaderMenuItem headerMenuItem) {
        headerMenuItem.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final g2b ConversationKebab_cf5BqRc$lambda$15$lambda$14$lambda$11$lambda$10(h37 h37Var, oh4 oh4Var) {
        h37Var.setValue(Boolean.valueOf(!((Boolean) h37Var.getValue()).booleanValue()));
        oh4Var.invoke(MetricData.MoreMenuClicked.INSTANCE);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationKebab_cf5BqRc$lambda$15$lambda$14$lambda$13$lambda$12(h37 h37Var) {
        h37Var.setValue(Boolean.FALSE);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationKebab_cf5BqRc$lambda$15$lambda$6(List list, oh4 oh4Var, long j, oh4 oh4Var2, int i, int i2, jt1 jt1Var, int i3) {
        m147ConversationKebabcf5BqRc(list, oh4Var, j, oh4Var2, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationKebab_cf5BqRc$lambda$15$lambda$8$lambda$7(oh4 oh4Var, HeaderMenuItem headerMenuItem, oh4 oh4Var2) {
        oh4Var.invoke(headerMenuItem);
        oh4Var2.invoke(metricData(headerMenuItem, false));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationKebab_cf5BqRc$lambda$16(List list, oh4 oh4Var, long j, oh4 oh4Var2, int i, int i2, jt1 jt1Var, int i3) {
        m147ConversationKebabcf5BqRc(list, oh4Var, j, oh4Var2, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationKebab_cf5BqRc$lambda$3$lambda$2(MetricData metricData) {
        metricData.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String badgeText(HeaderMenuItem headerMenuItem) {
        if (!(headerMenuItem instanceof HeaderMenuItem.Messages)) {
            return null;
        }
        String unreadMessagesCount = ((HeaderMenuItem.Messages) headerMenuItem).getUnreadMessagesCount();
        if (unreadMessagesCount.length() == 0) {
            return null;
        }
        return unreadMessagesCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int icon(HeaderMenuItem headerMenuItem) {
        if (headerMenuItem instanceof HeaderMenuItem.Messages) {
            return R.drawable.intercom_inbox;
        }
        if (headerMenuItem instanceof HeaderMenuItem.StartNewConversation) {
            return R.drawable.intercom_send_message_icon;
        }
        if (headerMenuItem instanceof HeaderMenuItem.Tickets) {
            return R.drawable.intercom_ticket_detail_icon;
        }
        if (headerMenuItem instanceof HeaderMenuItem.Help) {
            return R.drawable.intercom_help_centre_icon;
        }
        u.b();
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MetricData metricData(HeaderMenuItem headerMenuItem, boolean z) {
        if (headerMenuItem instanceof HeaderMenuItem.Messages) {
            return new MetricData.ConversationsInMoreMenuClicked(z);
        }
        if (headerMenuItem instanceof HeaderMenuItem.Tickets) {
            return new MetricData.TicketsInMoreMenuClicked(z);
        }
        if (headerMenuItem instanceof HeaderMenuItem.StartNewConversation) {
            return new MetricData.NewConversationInMoreMenuClicked(z);
        }
        if (headerMenuItem instanceof HeaderMenuItem.Help) {
            return MetricData.HelpInMoreMenuClicked.INSTANCE;
        }
        u.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldShowUnreadDot(HeaderMenuItem headerMenuItem) {
        if (headerMenuItem instanceof HeaderMenuItem.Tickets) {
            return ((HeaderMenuItem.Tickets) headerMenuItem).getHasUnreadTickets();
        }
        return false;
    }
}
