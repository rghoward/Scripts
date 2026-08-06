package io.intercom.android.sdk.m5.helpcenter.ui.components;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bj4;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.jt1;
import defpackage.mia;
import defpackage.ox6;
import defpackage.u7d;
import defpackage.w30;
import defpackage.x30;
import defpackage.xj8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleCountComponentKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ArticleCountComponentKt {
    public static final void ArticleCountComponent(ox6 ox6Var, final int i, jt1 jt1Var, final int i2, final int i3) {
        final ox6 ox6Var2;
        int i4;
        CharSequence charSequence;
        bj4 bj4Var;
        bj4 bj4VarO = jt1Var.o(-731744304);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            ox6Var2 = ox6Var;
        } else if ((i2 & 6) == 0) {
            ox6Var2 = ox6Var;
            i4 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i2;
        } else {
            ox6Var2 = ox6Var;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= bj4VarO.h(i) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
            bj4Var = bj4VarO;
        } else {
            if (i5 != 0) {
                ox6Var2 = ox6.a.t;
            }
            if (i == 1) {
                bj4VarO.K(1038713318);
                charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_single_article).format();
                bj4VarO.U(false);
            } else {
                bj4VarO.K(1038811929);
                charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_multiple_articles).put("total_articles", i).format();
                bj4VarO.U(false);
            }
            bj4Var = bj4VarO;
            mia.b(charSequence.toString(), ox6Var2, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), bj4Var, ((i4 << 3) & 112) | 384, 0, 131064);
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: v30
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ArticleCountComponentKt.ArticleCountComponent$lambda$0(ox6Var2, i, i2, i3, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ArticleCountComponent$lambda$0(ox6 ox6Var, int i, int i2, int i3, jt1 jt1Var, int i4) {
        ArticleCountComponent(ox6Var, i, jt1Var, gz3.s(i2 | 1), i3);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void ArticleCountComponentPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1155458330);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ArticleCountComponentKt.INSTANCE.m308getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new x30(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ArticleCountComponentPreview$lambda$1(int i, jt1 jt1Var, int i2) {
        ArticleCountComponentPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void SingleArticleCountComponentPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1795936462);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ArticleCountComponentKt.INSTANCE.m309getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new w30(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SingleArticleCountComponentPreview$lambda$2(int i, jt1 jt1Var, int i2) {
        SingleArticleCountComponentPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
