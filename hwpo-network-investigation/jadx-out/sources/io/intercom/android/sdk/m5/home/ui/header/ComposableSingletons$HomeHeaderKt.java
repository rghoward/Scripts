package io.intercom.android.sdk.m5.home.ui.header;

import com.intercom.twig.BuildConfig;
import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.uh1;
import defpackage.v5a;
import defpackage.ws0;
import defpackage.zg5;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$HomeHeaderKt {
    public static final ComposableSingletons$HomeHeaderKt INSTANCE = new ComposableSingletons$HomeHeaderKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f256lambda1 = new fr1(false, 1111020598, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "SK");
            avatarCreate.getClass();
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create(BuildConfig.FLAVOR, "RS");
            avatarCreate2.getClass();
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create(BuildConfig.FLAVOR, "VR");
            avatarCreate3.getClass();
            List listI = ws0.i(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null));
            String str = null;
            HomeUiState.Content.ContentHeader.ColoredText coloredText = new HomeUiState.Content.ContentHeader.ColoredText("I am greeting.", 0.5f, str, null, "#FFFFFF", "#000000", 12, null);
            HomeUiState.Content.ContentHeader.ColoredText coloredText2 = new HomeUiState.Content.ContentHeader.ColoredText("I am intro.", 1.0f, null, null, "#FFFFFF", "#000000", 12, null);
            long jA = zg5.a(IntercomTheme.INSTANCE, jt1Var, IntercomTheme.$stable);
            HomeHeaderKt.HomeContentHeader(null, new HomeUiState.Content.ContentHeader(true, BuildConfig.FLAVOR, str, coloredText, coloredText2, new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(jA, false, null), null, true, listI, new HomeUiState.Content.ContentHeader.CloseButtonColor("#000000", "#FFFFFF", "#FFFFFF", 0.5f), 64, null), jt1Var, 0, 1);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f257lambda2 = new fr1(false, -2058941199, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                int i2 = uh1.l;
                v5a.a(null, null, uh1.g, 0L, 0.0f, 0.0f, null, ComposableSingletons$HomeHeaderKt.INSTANCE.m355getLambda1$intercom_sdk_base_release(), jt1Var, 12583296, 123);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f258lambda3 = new fr1(false, 555108293, ComposableSingletons$HomeHeaderKt$lambda3$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f259lambda4 = new fr1(false, 37843776, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderKt$lambda-4$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$HomeHeaderKt.INSTANCE.m357getLambda3$intercom_sdk_base_release(), jt1Var, 12582912, 127);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m355getLambda1$intercom_sdk_base_release() {
        return f256lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m356getLambda2$intercom_sdk_base_release() {
        return f257lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m357getLambda3$intercom_sdk_base_release() {
        return f258lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m358getLambda4$intercom_sdk_base_release() {
        return f259lambda4;
    }
}
