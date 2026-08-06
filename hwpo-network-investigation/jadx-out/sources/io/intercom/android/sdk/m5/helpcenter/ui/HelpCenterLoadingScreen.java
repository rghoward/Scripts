package io.intercom.android.sdk.m5.helpcenter.ui;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.bj4;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.jt1;
import defpackage.qq2;
import defpackage.v0;
import defpackage.xj8;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterLoadingScreen;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterLoadingScreen extends v0 {
    public static final int $stable = 0;

    public /* synthetic */ HelpCenterLoadingScreen(Context context, AttributeSet attributeSet, int i, int i2, qq2 qq2Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b Content$lambda$0(HelpCenterLoadingScreen helpCenterLoadingScreen, int i, jt1 jt1Var, int i2) {
        helpCenterLoadingScreen.Content(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @Override // defpackage.v0
    public void Content(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1926895347);
        if ((i & 1) == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HelpCenterLoadingScreenKt.INSTANCE.m305getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: qv4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterLoadingScreen.Content$lambda$0(this.t, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HelpCenterLoadingScreen(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HelpCenterLoadingScreen(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpCenterLoadingScreen(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
