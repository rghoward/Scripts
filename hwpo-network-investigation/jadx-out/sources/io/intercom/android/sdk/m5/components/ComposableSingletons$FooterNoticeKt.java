package io.intercom.android.sdk.m5.components;

import com.intercom.twig.BuildConfig;
import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.ws0;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$FooterNoticeKt {
    public static final ComposableSingletons$FooterNoticeKt INSTANCE = new ComposableSingletons$FooterNoticeKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f32lambda1 = new fr1(false, -316510596, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$FooterNoticeKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "SK");
            avatarCreate.getClass();
            FooterNoticeKt.ExpandedFooterNotice(null, "The team will reply in 1314 minutes", "You’ll get replies here and in your email: handover_notice990", ws0.h(new AvatarWrapper(avatarCreate, false, 2, null)), jt1Var, 432, 1);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f33lambda2 = new fr1(false, 1192394372, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$FooterNoticeKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "SK");
            avatarCreate.getClass();
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create(BuildConfig.FLAVOR, "LD");
            avatarCreate2.getClass();
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create(BuildConfig.FLAVOR, "LY");
            avatarCreate3.getClass();
            FooterNoticeKt.ExpandedFooterNotice(null, "The team will reply in 1314 minutes", "You’ll get replies here and in your email: handover_notice990", ws0.i(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null)), jt1Var, 432, 1);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f34lambda3 = new fr1(false, -1618737880, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$FooterNoticeKt$lambda-3$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "SK");
            avatarCreate.getClass();
            FooterNoticeKt.ExpandedFooterNotice(null, "The team will reply in 1314 minutes", BuildConfig.FLAVOR, ws0.h(new AvatarWrapper(avatarCreate, false, 2, null)), jt1Var, 432, 1);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f35lambda4 = new fr1(false, -759832452, ComposableSingletons$FooterNoticeKt$lambda4$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-5, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f36lambda5 = new fr1(false, 1035678920, ComposableSingletons$FooterNoticeKt$lambda5$1.INSTANCE);

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m45getLambda1$intercom_sdk_base_release() {
        return f32lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m46getLambda2$intercom_sdk_base_release() {
        return f33lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m47getLambda3$intercom_sdk_base_release() {
        return f34lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m48getLambda4$intercom_sdk_base_release() {
        return f35lambda4;
    }

    /* JADX INFO: renamed from: getLambda-5$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m49getLambda5$intercom_sdk_base_release() {
        return f36lambda5;
    }
}
