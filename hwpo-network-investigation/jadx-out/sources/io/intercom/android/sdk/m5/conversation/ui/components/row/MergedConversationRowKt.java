package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.ac4;
import defpackage.aj1;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.eo7;
import defpackage.fs6;
import defpackage.g2b;
import defpackage.gs6;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ob4;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.va2;
import defpackage.vaa;
import defpackage.we1;
import defpackage.wja;
import defpackage.xj8;
import defpackage.yi1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.ui.components.row.MergedConversationRowKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class MergedConversationRowKt {
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:68:0x0182  */
    /* JADX WARN: Code duplicated, block: B:69:0x0184  */
    /* JADX WARN: Code duplicated, block: B:72:0x018b  */
    /* JADX WARN: Code duplicated, block: B:73:0x018d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x019a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0212  */
    /* JADX WARN: Code duplicated, block: B:85:0x0220  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
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
    public static final void MergedConversationRow(ox6 ox6Var, final String str, final String str2, oh4<? super String, g2b> oh4Var, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        int i4;
        int i5;
        oh4<? super String, g2b> oh4Var2;
        int i6;
        ox6.a aVar;
        jt1.a.C0187a c0187a;
        int i7;
        aj1 aj1VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        int i8;
        final oh4<? super String, g2b> oh4Var3;
        boolean z;
        boolean z2;
        boolean z3;
        Object objF;
        boolean z4;
        bj4 bj4Var;
        final ox6 ox6Var3;
        Object objF2;
        xj8 xj8VarW;
        str.getClass();
        str2.getClass();
        bj4 bj4VarO = jt1Var.o(-635122177);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                i3 |= bj4VarO.J(str) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (bj4VarO.J(str2)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    oh4Var2 = oh4Var;
                    if (bj4VarO.j(oh4Var2)) {
                        i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i3 & 1171) == 1170 || !bj4VarO.r()) {
                    aVar = ox6.a.t;
                    if (i9 != 0) {
                        ox6Var2 = aVar;
                    }
                    c0187a = jt1.a.a;
                    i7 = 0;
                    if (i5 != 0) {
                        bj4VarO.K(-98469438);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new fs6(i7);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var2 = (oh4) objF2;
                    }
                    ox6 ox6VarK = eo7.k(ox6Var2, 16.0f, 0.0f, 2);
                    aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarK);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i10 = IntercomTheme.$stable;
                    wja type04Point5 = intercomTheme.getTypography(bj4VarO, i10).getType04Point5();
                    i8 = i3;
                    ox6 ox6Var4 = ox6Var2;
                    oh4Var3 = oh4Var2;
                    mia.b(str, null, ac4.b(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type04Point5, bj4VarO, (i3 >> 3) & 14, 0, 130042);
                    b47.b(bj4VarO, ir9.d(aVar, 4.0f));
                    bj4VarO.K(-1680452222);
                    if ((i8 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((i8 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | z;
                    objF = bj4VarO.f();
                    if (!z3 || objF == c0187a) {
                        z4 = false;
                        objF = new gs6(0 == true ? 1 : 0, oh4Var3, str2);
                        bj4VarO.C(objF);
                    } else {
                        z4 = false;
                    }
                    bj4VarO.U(z4);
                    mia.b(nr1.f(bj4VarO, R.string.intercom_view_conversation), we1.c(aVar, z4, null, (mh4) objF, 15), intercomTheme.getColors(bj4VarO, i10).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i10).getType04Point5(), 0L, 0L, ob4.B, null, 0L, 0L, null, null, 16777211), bj4VarO, 0, 0, 130040);
                    bj4Var = bj4VarO;
                    bj4Var.U(true);
                    ox6Var3 = ox6Var4;
                } else {
                    bj4VarO.u();
                    bj4Var = bj4VarO;
                    ox6Var3 = ox6Var2;
                    oh4Var3 = oh4Var2;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: hs6
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return MergedConversationRowKt.MergedConversationRow$lambda$5(ox6Var3, str, str2, oh4Var3, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            oh4Var2 = oh4Var;
            if ((i3 & 1171) == 1170) {
                aVar = ox6.a.t;
                if (i9 != 0) {
                    ox6Var2 = aVar;
                }
                c0187a = jt1.a.a;
                i7 = 0;
                if (i5 != 0) {
                    bj4VarO.K(-98469438);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new fs6(i7);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    oh4Var2 = (oh4) objF2;
                }
                ox6 ox6VarK2 = eo7.k(ox6Var2, 16.0f, 0.0f, 2);
                aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarK2);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                int i11 = IntercomTheme.$stable;
                wja type04Point6 = intercomTheme2.getTypography(bj4VarO, i11).getType04Point5();
                i8 = i3;
                ox6 ox6Var5 = ox6Var2;
                oh4Var3 = oh4Var2;
                mia.b(str, null, ac4.b(intercomTheme2, bj4VarO, i11), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type04Point6, bj4VarO, (i3 >> 3) & 14, 0, 130042);
                b47.b(bj4VarO, ir9.d(aVar, 4.0f));
                bj4VarO.K(-1680452222);
                if ((i8 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                if ((i8 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | z;
                objF = bj4VarO.f();
                if (z3) {
                    z4 = false;
                    objF = new gs6(0 == true ? 1 : 0, oh4Var3, str2);
                    bj4VarO.C(objF);
                } else {
                    z4 = false;
                    objF = new gs6(0 == true ? 1 : 0, oh4Var3, str2);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(z4);
                mia.b(nr1.f(bj4VarO, R.string.intercom_view_conversation), we1.c(aVar, z4, null, (mh4) objF, 15), intercomTheme2.getColors(bj4VarO, i11).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, wja.a(intercomTheme2.getTypography(bj4VarO, i11).getType04Point5(), 0L, 0L, ob4.B, null, 0L, 0L, null, null, 16777211), bj4VarO, 0, 0, 130040);
                bj4Var = bj4VarO;
                bj4Var.U(true);
                ox6Var3 = ox6Var5;
            } else {
                aVar = ox6.a.t;
                if (i9 != 0) {
                    ox6Var2 = aVar;
                }
                c0187a = jt1.a.a;
                i7 = 0;
                if (i5 != 0) {
                    bj4VarO.K(-98469438);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new fs6(i7);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    oh4Var2 = (oh4) objF2;
                }
                ox6 ox6VarK3 = eo7.k(ox6Var2, 16.0f, 0.0f, 2);
                aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarK3);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                int i12 = IntercomTheme.$stable;
                wja type04Point7 = intercomTheme3.getTypography(bj4VarO, i12).getType04Point5();
                i8 = i3;
                ox6 ox6Var6 = ox6Var2;
                oh4Var3 = oh4Var2;
                mia.b(str, null, ac4.b(intercomTheme3, bj4VarO, i12), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type04Point7, bj4VarO, (i3 >> 3) & 14, 0, 130042);
                b47.b(bj4VarO, ir9.d(aVar, 4.0f));
                bj4VarO.K(-1680452222);
                if ((i8 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                if ((i8 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | z;
                objF = bj4VarO.f();
                if (z3) {
                    z4 = false;
                    objF = new gs6(0 == true ? 1 : 0, oh4Var3, str2);
                    bj4VarO.C(objF);
                } else {
                    z4 = false;
                    objF = new gs6(0 == true ? 1 : 0, oh4Var3, str2);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(z4);
                mia.b(nr1.f(bj4VarO, R.string.intercom_view_conversation), we1.c(aVar, z4, null, (mh4) objF, 15), intercomTheme3.getColors(bj4VarO, i12).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, wja.a(intercomTheme3.getTypography(bj4VarO, i12).getType04Point5(), 0L, 0L, ob4.B, null, 0L, 0L, null, null, 16777211), bj4VarO, 0, 0, 130040);
                bj4Var = bj4VarO;
                bj4Var.U(true);
                ox6Var3 = ox6Var6;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: hs6
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return MergedConversationRowKt.MergedConversationRow$lambda$5(ox6Var3, str, str2, oh4Var3, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (bj4VarO.J(str2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        i5 = i2 & 8;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                oh4Var2 = oh4Var;
                if (bj4VarO.j(oh4Var2)) {
                    i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 1171) == 1170) {
                aVar = ox6.a.t;
                if (i9 != 0) {
                    ox6Var2 = aVar;
                }
                c0187a = jt1.a.a;
                i7 = 0;
                if (i5 != 0) {
                    bj4VarO.K(-98469438);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new fs6(i7);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    oh4Var2 = (oh4) objF2;
                }
                ox6 ox6VarK4 = eo7.k(ox6Var2, 16.0f, 0.0f, 2);
                aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarK4);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                int i13 = IntercomTheme.$stable;
                wja type04Point8 = intercomTheme4.getTypography(bj4VarO, i13).getType04Point5();
                i8 = i3;
                ox6 ox6Var7 = ox6Var2;
                oh4Var3 = oh4Var2;
                mia.b(str, null, ac4.b(intercomTheme4, bj4VarO, i13), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type04Point8, bj4VarO, (i3 >> 3) & 14, 0, 130042);
                b47.b(bj4VarO, ir9.d(aVar, 4.0f));
                bj4VarO.K(-1680452222);
                if ((i8 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                if ((i8 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | z;
                objF = bj4VarO.f();
                if (z3) {
                    z4 = false;
                    objF = new gs6(0 == true ? 1 : 0, oh4Var3, str2);
                    bj4VarO.C(objF);
                } else {
                    z4 = false;
                    objF = new gs6(0 == true ? 1 : 0, oh4Var3, str2);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(z4);
                mia.b(nr1.f(bj4VarO, R.string.intercom_view_conversation), we1.c(aVar, z4, null, (mh4) objF, 15), intercomTheme4.getColors(bj4VarO, i13).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, wja.a(intercomTheme4.getTypography(bj4VarO, i13).getType04Point5(), 0L, 0L, ob4.B, null, 0L, 0L, null, null, 16777211), bj4VarO, 0, 0, 130040);
                bj4Var = bj4VarO;
                bj4Var.U(true);
                ox6Var3 = ox6Var7;
            } else {
                aVar = ox6.a.t;
                if (i9 != 0) {
                    ox6Var2 = aVar;
                }
                c0187a = jt1.a.a;
                i7 = 0;
                if (i5 != 0) {
                    bj4VarO.K(-98469438);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new fs6(i7);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    oh4Var2 = (oh4) objF2;
                }
                ox6 ox6VarK5 = eo7.k(ox6Var2, 16.0f, 0.0f, 2);
                aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarK5);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                int i14 = IntercomTheme.$stable;
                wja type04Point9 = intercomTheme5.getTypography(bj4VarO, i14).getType04Point5();
                i8 = i3;
                ox6 ox6Var8 = ox6Var2;
                oh4Var3 = oh4Var2;
                mia.b(str, null, ac4.b(intercomTheme5, bj4VarO, i14), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type04Point9, bj4VarO, (i3 >> 3) & 14, 0, 130042);
                b47.b(bj4VarO, ir9.d(aVar, 4.0f));
                bj4VarO.K(-1680452222);
                if ((i8 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                if ((i8 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | z;
                objF = bj4VarO.f();
                if (z3) {
                    z4 = false;
                    objF = new gs6(0 == true ? 1 : 0, oh4Var3, str2);
                    bj4VarO.C(objF);
                } else {
                    z4 = false;
                    objF = new gs6(0 == true ? 1 : 0, oh4Var3, str2);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(z4);
                mia.b(nr1.f(bj4VarO, R.string.intercom_view_conversation), we1.c(aVar, z4, null, (mh4) objF, 15), intercomTheme5.getColors(bj4VarO, i14).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, wja.a(intercomTheme5.getTypography(bj4VarO, i14).getType04Point5(), 0L, 0L, ob4.B, null, 0L, 0L, null, null, 16777211), bj4VarO, 0, 0, 130040);
                bj4Var = bj4VarO;
                bj4Var.U(true);
                ox6Var3 = ox6Var8;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: hs6
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return MergedConversationRowKt.MergedConversationRow$lambda$5(ox6Var3, str, str2, oh4Var3, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        oh4Var2 = oh4Var;
        if ((i3 & 1171) == 1170) {
            aVar = ox6.a.t;
            if (i9 != 0) {
                ox6Var2 = aVar;
            }
            c0187a = jt1.a.a;
            i7 = 0;
            if (i5 != 0) {
                bj4VarO.K(-98469438);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new fs6(i7);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                oh4Var2 = (oh4) objF2;
            }
            ox6 ox6VarK6 = eo7.k(ox6Var2, 16.0f, 0.0f, 2);
            aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarK6);
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
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
            int i15 = IntercomTheme.$stable;
            wja type04Point10 = intercomTheme6.getTypography(bj4VarO, i15).getType04Point5();
            i8 = i3;
            ox6 ox6Var9 = ox6Var2;
            oh4Var3 = oh4Var2;
            mia.b(str, null, ac4.b(intercomTheme6, bj4VarO, i15), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type04Point10, bj4VarO, (i3 >> 3) & 14, 0, 130042);
            b47.b(bj4VarO, ir9.d(aVar, 4.0f));
            bj4VarO.K(-1680452222);
            if ((i8 & 7168) == 2048) {
                z = true;
            } else {
                z = false;
            }
            if ((i8 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z2 | z;
            objF = bj4VarO.f();
            if (z3) {
                z4 = false;
                objF = new gs6(0 == true ? 1 : 0, oh4Var3, str2);
                bj4VarO.C(objF);
            } else {
                z4 = false;
                objF = new gs6(0 == true ? 1 : 0, oh4Var3, str2);
                bj4VarO.C(objF);
            }
            bj4VarO.U(z4);
            mia.b(nr1.f(bj4VarO, R.string.intercom_view_conversation), we1.c(aVar, z4, null, (mh4) objF, 15), intercomTheme6.getColors(bj4VarO, i15).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, wja.a(intercomTheme6.getTypography(bj4VarO, i15).getType04Point5(), 0L, 0L, ob4.B, null, 0L, 0L, null, null, 16777211), bj4VarO, 0, 0, 130040);
            bj4Var = bj4VarO;
            bj4Var.U(true);
            ox6Var3 = ox6Var9;
        } else {
            aVar = ox6.a.t;
            if (i9 != 0) {
                ox6Var2 = aVar;
            }
            c0187a = jt1.a.a;
            i7 = 0;
            if (i5 != 0) {
                bj4VarO.K(-98469438);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new fs6(i7);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                oh4Var2 = (oh4) objF2;
            }
            ox6 ox6VarK7 = eo7.k(ox6Var2, 16.0f, 0.0f, 2);
            aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarK7);
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
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
            int i16 = IntercomTheme.$stable;
            wja type04Point11 = intercomTheme7.getTypography(bj4VarO, i16).getType04Point5();
            i8 = i3;
            ox6 ox6Var10 = ox6Var2;
            oh4Var3 = oh4Var2;
            mia.b(str, null, ac4.b(intercomTheme7, bj4VarO, i16), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type04Point11, bj4VarO, (i3 >> 3) & 14, 0, 130042);
            b47.b(bj4VarO, ir9.d(aVar, 4.0f));
            bj4VarO.K(-1680452222);
            if ((i8 & 7168) == 2048) {
                z = true;
            } else {
                z = false;
            }
            if ((i8 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z2 | z;
            objF = bj4VarO.f();
            if (z3) {
                z4 = false;
                objF = new gs6(0 == true ? 1 : 0, oh4Var3, str2);
                bj4VarO.C(objF);
            } else {
                z4 = false;
                objF = new gs6(0 == true ? 1 : 0, oh4Var3, str2);
                bj4VarO.C(objF);
            }
            bj4VarO.U(z4);
            mia.b(nr1.f(bj4VarO, R.string.intercom_view_conversation), we1.c(aVar, z4, null, (mh4) objF, 15), intercomTheme7.getColors(bj4VarO, i16).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, wja.a(intercomTheme7.getTypography(bj4VarO, i16).getType04Point5(), 0L, 0L, ob4.B, null, 0L, 0L, null, null, 16777211), bj4VarO, 0, 0, 130040);
            bj4Var = bj4VarO;
            bj4Var.U(true);
            ox6Var3 = ox6Var10;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: hs6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return MergedConversationRowKt.MergedConversationRow$lambda$5(ox6Var3, str, str2, oh4Var3, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MergedConversationRow$lambda$1$lambda$0(String str) {
        str.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MergedConversationRow$lambda$4$lambda$3$lambda$2(oh4 oh4Var, String str) {
        oh4Var.invoke(str);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MergedConversationRow$lambda$5(ox6 ox6Var, String str, String str2, oh4 oh4Var, int i, int i2, jt1 jt1Var, int i3) {
        MergedConversationRow(ox6Var, str, str2, oh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void MergedConversationRowPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-243500111);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MergedConversationRowKt.INSTANCE.m257getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new va2(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MergedConversationRowPreview$lambda$6(int i, jt1 jt1Var, int i2) {
        MergedConversationRowPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
