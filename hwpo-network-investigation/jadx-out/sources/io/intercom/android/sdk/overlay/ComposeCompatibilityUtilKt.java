package io.intercom.android.sdk.overlay;

import androidx.compose.ui.platform.ComposeView;
import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.jt1;
import defpackage.m76;
import defpackage.vib;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.utilities.extensions.PartExtensionsKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposeCompatibilityUtilKt {
    public static final void addAvatarIconToCompose(ComposeView composeView, final Participant participant, final AppConfig appConfig) {
        participant.getClass();
        appConfig.getClass();
        if (composeView == null || isLegacyActivity(composeView)) {
            return;
        }
        composeView.setContent(new fr1(true, 421691537, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.overlay.ComposeCompatibilityUtilKt$addAvatarIconToCompose$1$1
            public final void invoke(jt1 jt1Var, int i) {
                if ((i & 3) == 2 && jt1Var.r()) {
                    jt1Var.u();
                    return;
                }
                AppConfig appConfig2 = appConfig;
                final Participant participant2 = participant;
                ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig2, gr1.b(2111948784, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.overlay.ComposeCompatibilityUtilKt$addAvatarIconToCompose$1$1.1
                    public final void invoke(jt1 jt1Var2, int i2) {
                        if ((i2 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        Avatar avatar = participant2.getAvatar();
                        avatar.getClass();
                        Boolean boolIsBot = participant2.isBot();
                        boolIsBot.getClass();
                        AvatarIconKt.m91AvatarIconRd90Nhg(null, new AvatarWrapper(avatar, boolIsBot.booleanValue()), null, false, 0L, null, jt1Var2, 0, 61);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, jt1Var), jt1Var, 48);
            }

            @Override // defpackage.ci4
            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
                invoke(jt1Var, num.intValue());
                return g2b.a;
            }
        }));
    }

    public static final boolean hideForLegacyActivity(ComposeView composeView) {
        if (!isLegacyActivity(composeView)) {
            return false;
        }
        if (composeView == null) {
            return true;
        }
        composeView.setVisibility(8);
        return true;
    }

    public static final boolean isLegacyActivity(ComposeView composeView) {
        if (composeView == null) {
            return true;
        }
        try {
            m76 m76VarA = vib.a(composeView);
            boolean z = (m76VarA != null ? m76VarA.getLifecycle() : null) == null;
            if (z) {
                Injector.get().getMetricTracker().receivedInAppOnLegacyActivity();
            }
            return z;
        } catch (Exception unused) {
            Injector.get().getMetricTracker().receivedInAppOnLegacyActivity();
            return true;
        }
    }

    public static final void addAvatarIconToCompose(ComposeView composeView, final Part part, final AppConfig appConfig) {
        part.getClass();
        appConfig.getClass();
        if (composeView == null || isLegacyActivity(composeView)) {
            return;
        }
        composeView.setContent(new fr1(true, 38990427, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.overlay.ComposeCompatibilityUtilKt$addAvatarIconToCompose$2$1
            public final void invoke(jt1 jt1Var, int i) {
                if ((i & 3) == 2 && jt1Var.r()) {
                    jt1Var.u();
                    return;
                }
                AppConfig appConfig2 = appConfig;
                final Part part2 = part;
                ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig2, gr1.b(1854253020, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.overlay.ComposeCompatibilityUtilKt$addAvatarIconToCompose$2$1.1
                    public final void invoke(jt1 jt1Var2, int i2) {
                        if ((i2 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            AvatarIconKt.m91AvatarIconRd90Nhg(null, PartExtensionsKt.resolvedAvatarWrapper(part2), null, false, 0L, null, jt1Var2, 0, 61);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, jt1Var), jt1Var, 48);
            }

            @Override // defpackage.ci4
            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
                invoke(jt1Var, num.intValue());
                return g2b.a;
            }
        }));
    }
}
