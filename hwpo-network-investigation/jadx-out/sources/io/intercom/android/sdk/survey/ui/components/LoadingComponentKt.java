package io.intercom.android.sdk.survey.ui.components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.bj4;
import defpackage.ci4;
import defpackage.ft;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.iu8;
import defpackage.jt1;
import defpackage.mn9;
import defpackage.n40;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.u7d;
import defpackage.xj8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.ui.components.LoadingComponentKt;
import io.intercom.android.sdk.views.IntercomShimmerLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LoadingComponentKt {
    public static final void SurveyLoading(final SurveyState.Loading loading, final ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        loading.getClass();
        bj4 bj4VarO = jt1Var.o(913588806);
        int i4 = 2;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(loading) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.J(ox6Var) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            if (i5 != 0) {
                ox6Var = ox6.a.t;
            }
            ox6 ox6VarH = ox6Var.H(ir9.c);
            bj4VarO.K(1496338436);
            boolean z = (i3 & 14) == 4;
            Object objF = bj4VarO.f();
            if (z || objF == jt1.a.a) {
                objF = new n40(i4, loading);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ft.b((oh4) objF, ox6VarH, null, bj4VarO, 0, 4);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: bc6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return LoadingComponentKt.SurveyLoading$lambda$3(loading, ox6Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mn9 SurveyLoading$lambda$2$lambda$1(SurveyState.Loading loading, Context context) {
        context.getClass();
        mn9 mn9VarBuildLoadingContainer = buildLoadingContainer(context);
        mn9VarBuildLoadingContainer.addView(m452buildLoadingContentbw27NRU(context, loading.getSurveyUiColors().m407getOnBackground0d7_KjU(), R.drawable.intercom_survey_loading_state));
        return mn9VarBuildLoadingContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SurveyLoading$lambda$3(SurveyState.Loading loading, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        SurveyLoading(loading, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final mn9 buildLoadingContainer(Context context) {
        context.getClass();
        IntercomShimmerLayout intercomShimmerLayout = new IntercomShimmerLayout(context);
        intercomShimmerLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        intercomShimmerLayout.setClickable(true);
        intercomShimmerLayout.setFocusable(true);
        return intercomShimmerLayout;
    }

    /* JADX INFO: renamed from: buildLoadingContent-bw27NRU, reason: not valid java name */
    public static final View m452buildLoadingContentbw27NRU(Context context, long j, int i) {
        context.getClass();
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int i2 = (int) (20.0f * context.getResources().getDisplayMetrics().density);
        layoutParams.setMarginStart(i2);
        layoutParams.setMarginEnd(i2);
        layoutParams.topMargin = i2;
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        Resources resources = context.getResources();
        ThreadLocal<TypedValue> threadLocal = iu8.a;
        Drawable drawable = resources.getDrawable(i, null);
        if (drawable != null) {
            drawable.setTint(u7d.l(j));
            drawable.setAutoMirrored(true);
            imageView.setImageDrawable(drawable);
        }
        return imageView;
    }
}
