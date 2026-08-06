package io.intercom.android.sdk.m5.conversation.ui.components;

import defpackage.a30;
import defpackage.aj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.e40;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ml5;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.xj8;
import defpackage.yi1;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.m5.conversation.ui.components.TeammateSheetContentKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.ExpandedTeamPresenceLayoutKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.SpecialNoticeKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TeammateSheetContentKt {
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:62:0x010a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0114  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void TeammateSheetContent(ox6 ox6Var, String str, final ExpandedTeamPresenceState expandedTeamPresenceState, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        String str2;
        int i4;
        ox6.a aVar;
        aj1 aj1VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        final ox6 ox6Var3;
        final String str3;
        xj8 xj8VarW;
        expandedTeamPresenceState.getClass();
        bj4 bj4VarO = jt1Var.o(755089345);
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
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                str2 = str;
                i3 |= bj4VarO.J(str2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (bj4VarO.j(expandedTeamPresenceState)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i3 & 147) == 146 || !bj4VarO.r()) {
                aVar = ox6.a.t;
                if (i5 != 0) {
                    ox6Var2 = aVar;
                }
                if (i6 != 0) {
                    str2 = null;
                }
                aj1VarA = yi1.a(new c30.h(16.0f, true, new a30()), di.a.m, bj4VarO, 6);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout(expandedTeamPresenceState, ir9.c(aVar, 1.0f), bj4VarO, ((i3 >> 6) & 14) | 48, 0);
                bj4VarO.K(-1851009825);
                if (str2 != null && str2.length() != 0) {
                    SpecialNoticeKt.SpecialNotice(str2, null, bj4VarO, (i3 >> 3) & 14, 2);
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
            } else {
                bj4VarO.u();
            }
            ox6Var3 = ox6Var2;
            str3 = str2;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: naa
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TeammateSheetContentKt.TeammateSheetContent$lambda$1(ox6Var3, str3, expandedTeamPresenceState, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        str2 = str;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (bj4VarO.j(expandedTeamPresenceState)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) == 146) {
            aVar = ox6.a.t;
            if (i5 != 0) {
                ox6Var2 = aVar;
            }
            if (i6 != 0) {
                str2 = null;
            }
            aj1VarA = yi1.a(new c30.h(16.0f, true, new a30()), di.a.m, bj4VarO, 6);
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
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout(expandedTeamPresenceState, ir9.c(aVar, 1.0f), bj4VarO, ((i3 >> 6) & 14) | 48, 0);
            bj4VarO.K(-1851009825);
            if (str2 != null) {
                SpecialNoticeKt.SpecialNotice(str2, null, bj4VarO, (i3 >> 3) & 14, 2);
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
        } else {
            aVar = ox6.a.t;
            if (i5 != 0) {
                ox6Var2 = aVar;
            }
            if (i6 != 0) {
                str2 = null;
            }
            aj1VarA = yi1.a(new c30.h(16.0f, true, new a30()), di.a.m, bj4VarO, 6);
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
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout(expandedTeamPresenceState, ir9.c(aVar, 1.0f), bj4VarO, ((i3 >> 6) & 14) | 48, 0);
            bj4VarO.K(-1851009825);
            if (str2 != null) {
                SpecialNoticeKt.SpecialNotice(str2, null, bj4VarO, (i3 >> 3) & 14, 2);
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
        }
        ox6Var3 = ox6Var2;
        str3 = str2;
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: naa
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TeammateSheetContentKt.TeammateSheetContent$lambda$1(ox6Var3, str3, expandedTeamPresenceState, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TeammateSheetContent$lambda$1(ox6 ox6Var, String str, ExpandedTeamPresenceState expandedTeamPresenceState, int i, int i2, jt1 jt1Var, int i3) {
        TeammateSheetContent(ox6Var, str, expandedTeamPresenceState, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void TeammateSheetContentPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(223292015);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TeammateSheetContentKt.INSTANCE.m140getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new e40(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TeammateSheetContentPreview$lambda$2(int i, jt1 jt1Var, int i2) {
        TeammateSheetContentPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
