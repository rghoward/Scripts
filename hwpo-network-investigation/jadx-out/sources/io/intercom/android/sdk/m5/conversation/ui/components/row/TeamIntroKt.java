package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.ac4;
import defpackage.bj4;
import defpackage.ci4;
import defpackage.ed1;
import defpackage.fda;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.iw;
import defpackage.jt1;
import defpackage.mia;
import defpackage.ox6;
import defpackage.vaa;
import defpackage.wja;
import defpackage.ww9;
import defpackage.xj8;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TeamIntroKt;
import io.intercom.android.sdk.survey.block.BlockExtensionsKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TeamIntroKt {
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    public static final void TeamIntro(final String str, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        ox6 ox6Var3;
        final ox6 ox6Var4;
        bj4 bj4Var;
        xj8 xj8VarW;
        str.getClass();
        bj4 bj4VarO = jt1Var.o(673666815);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !bj4VarO.r()) {
                if (i4 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                Spanned spannedFromHtml = Html.fromHtml(str, 0);
                spannedFromHtml.getClass();
                iw annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i5 = IntercomTheme.$stable;
                ox6Var4 = ox6Var3;
                bj4Var = bj4VarO;
                mia.c(annotatedString, ox6Var4, 0L, 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, null, wja.a(intercomTheme.getTypography(bj4VarO, i5).getType04Point5(), ac4.b(intercomTheme, bj4VarO, i5), 0L, null, null, 0L, 0L, null, null, 16777214), bj4Var, i3 & 112, 0, 261116);
            } else {
                bj4VarO.u();
                bj4Var = bj4VarO;
                ox6Var4 = ox6Var2;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: faa
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        ox6 ox6Var5 = ox6Var4;
                        return TeamIntroKt.TeamIntro$lambda$0(str, ox6Var5, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        if ((i3 & 19) == 18) {
            if (i4 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            Spanned spannedFromHtml2 = Html.fromHtml(str, 0);
            spannedFromHtml2.getClass();
            iw annotatedString2 = BlockExtensionsKt.toAnnotatedString(spannedFromHtml2, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i6 = IntercomTheme.$stable;
            ox6Var4 = ox6Var3;
            bj4Var = bj4VarO;
            mia.c(annotatedString2, ox6Var4, 0L, 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, null, wja.a(intercomTheme2.getTypography(bj4VarO, i6).getType04Point5(), ac4.b(intercomTheme2, bj4VarO, i6), 0L, null, null, 0L, 0L, null, null, 16777214), bj4Var, i3 & 112, 0, 261116);
        } else {
            if (i4 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            Spanned spannedFromHtml3 = Html.fromHtml(str, 0);
            spannedFromHtml3.getClass();
            iw annotatedString3 = BlockExtensionsKt.toAnnotatedString(spannedFromHtml3, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i7 = IntercomTheme.$stable;
            ox6Var4 = ox6Var3;
            bj4Var = bj4VarO;
            mia.c(annotatedString3, ox6Var4, 0L, 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, null, wja.a(intercomTheme3.getTypography(bj4VarO, i7).getType04Point5(), ac4.b(intercomTheme3, bj4VarO, i7), 0L, null, null, 0L, 0L, null, null, 16777214), bj4Var, i3 & 112, 0, 261116);
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: faa
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    ox6 ox6Var5 = ox6Var4;
                    return TeamIntroKt.TeamIntro$lambda$0(str, ox6Var5, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TeamIntro$lambda$0(String str, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        TeamIntro(str, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void TeamIntroPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(825513769);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TeamIntroKt.INSTANCE.m267getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ed1(i, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TeamIntroPreview$lambda$1(int i, jt1 jt1Var, int i2) {
        TeamIntroPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
