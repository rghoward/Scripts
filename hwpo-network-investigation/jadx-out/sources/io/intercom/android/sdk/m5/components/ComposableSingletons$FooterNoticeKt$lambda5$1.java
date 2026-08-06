package io.intercom.android.sdk.m5.components;

import com.intercom.twig.BuildConfig;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.qq2;
import defpackage.ws0;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import java.util.List;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$FooterNoticeKt$lambda-5$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$FooterNoticeKt$lambda5$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$FooterNoticeKt$lambda5$1 INSTANCE = new ComposableSingletons$FooterNoticeKt$lambda5$1();

    public final void invoke(jt1 jt1Var, int i) {
        int i2 = i & 3;
        int i3 = 2;
        if (i2 == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "SK");
        avatarCreate.getClass();
        boolean z = false;
        qq2 qq2Var = null;
        AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, z, i3, qq2Var);
        Avatar avatarCreate2 = Avatar.create(BuildConfig.FLAVOR, "LD");
        avatarCreate2.getClass();
        AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, z, i3, qq2Var);
        Avatar avatarCreate3 = Avatar.create(BuildConfig.FLAVOR, "LY");
        avatarCreate3.getClass();
        List listI = ws0.i(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, z, i3, qq2Var));
        jt1Var.K(1967900889);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new m();
            jt1Var.C(objF);
        }
        jt1Var.B();
        FooterNoticeKt.FooterNoticePillWithoutAnimation("The team will reply in 1314 minutes", listI, (mh4) objF, jt1Var, 390);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
