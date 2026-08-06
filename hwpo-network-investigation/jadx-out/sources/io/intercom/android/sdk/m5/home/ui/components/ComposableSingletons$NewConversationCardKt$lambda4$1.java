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

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$NewConversationCardKt$lambda-4$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$NewConversationCardKt$lambda4$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$NewConversationCardKt$lambda4$1 INSTANCE = new ComposableSingletons$NewConversationCardKt$lambda4$1();

    public final void invoke(jt1 jt1Var, int i) {
        int i2 = 2;
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        qq2 qq2Var = null;
        HomeCards.HomeNewConversationData homeNewConversationData = new HomeCards.HomeNewConversationData("Get in touch", HomeCardType.NEW_CONVERSATION, new Action("Ask a question", IconType.FIN, null), false, hf3.t, true, true, null);
        Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "VR");
        avatarCreate.getClass();
        boolean z = false;
        AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, z, i2, qq2Var);
        Avatar avatarCreate2 = Avatar.create(BuildConfig.FLAVOR, "PR");
        avatarCreate2.getClass();
        AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, z, i2, qq2Var);
        Avatar avatarCreate3 = Avatar.create(BuildConfig.FLAVOR, "SK");
        avatarCreate3.getClass();
        AvatarWrapper avatarWrapper3 = new AvatarWrapper(avatarCreate3, z, i2, qq2Var);
        Avatar avatarCreate4 = Avatar.create(BuildConfig.FLAVOR, "LD");
        avatarCreate4.getClass();
        List listI = ws0.i(avatarWrapper, avatarWrapper2, avatarWrapper3, new AvatarWrapper(avatarCreate4, z, i2, qq2Var));
        Avatar avatarCreate5 = Avatar.create(BuildConfig.FLAVOR, "B");
        avatarCreate5.getClass();
        AvatarWrapper avatarWrapper4 = new AvatarWrapper(avatarCreate5, z, i2, qq2Var);
        jt1Var.K(1732386197);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new d();
            jt1Var.C(objF);
        }
        jt1Var.B();
        NewConversationCardKt.NewConversationCard(homeNewConversationData, listI, avatarWrapper4, (mh4) objF, jt1Var, 3072, 0);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
