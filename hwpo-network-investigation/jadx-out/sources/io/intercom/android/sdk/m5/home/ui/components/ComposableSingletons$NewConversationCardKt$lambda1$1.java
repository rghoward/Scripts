package io.intercom.android.sdk.m5.home.ui.components;

import com.intercom.twig.BuildConfig;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.hf3;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.qq2;
import defpackage.ws0;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.Action;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.IconType;
import io.intercom.android.sdk.models.Avatar;
import java.util.List;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$NewConversationCardKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$NewConversationCardKt$lambda1$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$NewConversationCardKt$lambda1$1 INSTANCE = new ComposableSingletons$NewConversationCardKt$lambda1$1();

    public final void invoke(jt1 jt1Var, int i) {
        int i2 = i & 3;
        int i3 = 2;
        if (i2 == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        HomeCards.HomeNewConversationData homeNewConversationData = new HomeCards.HomeNewConversationData("Get in touch", HomeCardType.NEW_CONVERSATION, new Action("Send us a message", IconType.TEAMMATE, "Usual reply time is a few minutes"), false, hf3.t, false, false, null);
        Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "VR");
        avatarCreate.getClass();
        boolean z = false;
        qq2 qq2Var = null;
        AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, z, i3, qq2Var);
        Avatar avatarCreate2 = Avatar.create(BuildConfig.FLAVOR, "PR");
        avatarCreate2.getClass();
        AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, z, i3, qq2Var);
        Avatar avatarCreate3 = Avatar.create(BuildConfig.FLAVOR, "SK");
        avatarCreate3.getClass();
        AvatarWrapper avatarWrapper3 = new AvatarWrapper(avatarCreate3, z, i3, qq2Var);
        Avatar avatarCreate4 = Avatar.create(BuildConfig.FLAVOR, "LD");
        avatarCreate4.getClass();
        List listI = ws0.i(avatarWrapper, avatarWrapper2, avatarWrapper3, new AvatarWrapper(avatarCreate4, z, i3, qq2Var));
        jt1Var.K(1504593906);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new a();
            jt1Var.C(objF);
        }
        jt1Var.B();
        NewConversationCardKt.NewConversationCard(homeNewConversationData, listI, null, (mh4) objF, jt1Var, 3072, 4);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
