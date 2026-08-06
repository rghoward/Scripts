package io.intercom.android.sdk.m5.components;

import com.intercom.twig.BuildConfig;
import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.v5a;
import defpackage.ws0;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TeamPresenceRowKt {
    public static final ComposableSingletons$TeamPresenceRowKt INSTANCE = new ComposableSingletons$TeamPresenceRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f61lambda1 = new fr1(false, -919412179, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$TeamPresenceRowKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "VR");
            avatarCreate.getClass();
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create(BuildConfig.FLAVOR, "SK");
            avatarCreate2.getClass();
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create(BuildConfig.FLAVOR, "PR");
            avatarCreate3.getClass();
            AvatarWrapper avatarWrapper3 = new AvatarWrapper(avatarCreate3, false, 2, null);
            Avatar avatarCreate4 = Avatar.create(BuildConfig.FLAVOR, "LD");
            avatarCreate4.getClass();
            TeamPresenceRowKt.TeamPresenceRow(null, ws0.i(avatarWrapper, avatarWrapper2, avatarWrapper3, new AvatarWrapper(avatarCreate4, false, 2, null)), jt1Var, 0, 1);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f62lambda2 = new fr1(false, 225256978, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$TeamPresenceRowKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TeamPresenceRowKt.INSTANCE.m74getLambda1$intercom_sdk_base_release(), jt1Var, 12582912, 127);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m74getLambda1$intercom_sdk_base_release() {
        return f61lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m75getLambda2$intercom_sdk_base_release() {
        return f62lambda2;
    }
}
