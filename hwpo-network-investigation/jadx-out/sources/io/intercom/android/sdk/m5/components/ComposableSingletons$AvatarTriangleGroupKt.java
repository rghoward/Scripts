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
public final class ComposableSingletons$AvatarTriangleGroupKt {
    public static final ComposableSingletons$AvatarTriangleGroupKt INSTANCE = new ComposableSingletons$AvatarTriangleGroupKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f11lambda1 = new fr1(false, -1436103865, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$AvatarTriangleGroupKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "SK");
            avatarCreate.getClass();
            AvatarTriangleGroupKt.m20AvatarTriangleGroupjt2gSs(ws0.h(new AvatarWrapper(avatarCreate, false, 2, null)), null, null, 0.0f, jt1Var, 0, 14);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f12lambda2 = new fr1(false, -549018737, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$AvatarTriangleGroupKt$lambda-2$1
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
            AvatarTriangleGroupKt.m20AvatarTriangleGroupjt2gSs(ws0.i(avatarWrapper, new AvatarWrapper(avatarCreate2, false, 2, null)), null, null, 0.0f, jt1Var, 0, 14);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f13lambda3 = new fr1(false, 848463324, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$AvatarTriangleGroupKt$lambda-3$1
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
            AvatarTriangleGroupKt.m20AvatarTriangleGroupjt2gSs(ws0.i(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null)), null, null, 0.0f, jt1Var, 0, 14);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m24getLambda1$intercom_sdk_base_release() {
        return f11lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m25getLambda2$intercom_sdk_base_release() {
        return f12lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m26getLambda3$intercom_sdk_base_release() {
        return f13lambda3;
    }
}
