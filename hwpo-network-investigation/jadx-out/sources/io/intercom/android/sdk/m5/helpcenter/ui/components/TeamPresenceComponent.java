package io.intercom.android.sdk.m5.helpcenter.ui.components;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h37;
import defpackage.jt1;
import defpackage.qq2;
import defpackage.v0;
import defpackage.xj8;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TeamPresenceComponent extends v0 {
    public static final int $stable = 0;
    private final h37 needsChatBubble$delegate;
    private final h37 teamPresenceState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamPresenceComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.teamPresenceState$delegate = bl7.i(null);
        this.needsChatBubble$delegate = bl7.i(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b Content$lambda$1(TeamPresenceComponent teamPresenceComponent, int i, jt1 jt1Var, int i2) {
        teamPresenceComponent.Content(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @Override // defpackage.v0
    public void Content(jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-1850798977);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            final ArticleViewState.TeamPresenceState teamPresenceState = getTeamPresenceState();
            if (teamPresenceState != null) {
                AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                appConfig.getClass();
                ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, gr1.b(-1302062926, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponent$Content$1$1
                    public final void invoke(jt1 jt1Var2, int i3) {
                        if ((i3 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        if (this.this$0.getNeedsChatBubble()) {
                            jt1Var2.K(-365619251);
                            TeamPresenceComponentKt.TeamPresenceComponentWithBubble(teamPresenceState, jt1Var2, 0);
                            jt1Var2.B();
                        } else {
                            jt1Var2.K(-365539209);
                            TeamPresenceComponentKt.TeamPresenceComponent(teamPresenceState, false, null, jt1Var2, 0, 6);
                            jt1Var2.B();
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, 48);
            }
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: gaa
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TeamPresenceComponent.Content$lambda$1(this.t, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getNeedsChatBubble() {
        return ((Boolean) this.needsChatBubble$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArticleViewState.TeamPresenceState getTeamPresenceState() {
        return (ArticleViewState.TeamPresenceState) this.teamPresenceState$delegate.getValue();
    }

    public final void setNeedsChatBubble(boolean z) {
        this.needsChatBubble$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setTeamPresenceState(ArticleViewState.TeamPresenceState teamPresenceState) {
        this.teamPresenceState$delegate.setValue(teamPresenceState);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TeamPresenceComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ TeamPresenceComponent(Context context, AttributeSet attributeSet, int i, int i2, qq2 qq2Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TeamPresenceComponent(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
