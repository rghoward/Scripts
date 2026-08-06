package io.intercom.android.sdk.m5.components;

import com.intercom.twig.BuildConfig;
import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.js7;
import defpackage.jt1;
import io.intercom.android.sdk.models.Avatar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$BotAndHumansFacePileKt {
    public static final ComposableSingletons$BotAndHumansFacePileKt INSTANCE = new ComposableSingletons$BotAndHumansFacePileKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f14lambda1 = new fr1(false, 1717496869, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$BotAndHumansFacePileKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "VR");
            avatarCreate.getClass();
            BotAndHumansFacePileKt.m21BotAndHumansFacePilehGBTI10(null, avatarCreate, new js7(Avatar.create(BuildConfig.FLAVOR, "SK"), Avatar.create(BuildConfig.FLAVOR, "RS")), 64.0f, "Fin", jt1Var, 27648, 1);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f15lambda2 = new fr1(false, -1080506615, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$BotAndHumansFacePileKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "VR");
            avatarCreate.getClass();
            BotAndHumansFacePileKt.m21BotAndHumansFacePilehGBTI10(null, avatarCreate, new js7(null, Avatar.create(BuildConfig.FLAVOR, "SK")), 32.0f, "Fin", jt1Var, 27648, 1);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m27getLambda1$intercom_sdk_base_release() {
        return f14lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m28getLambda2$intercom_sdk_base_release() {
        return f15lambda2;
    }
}
