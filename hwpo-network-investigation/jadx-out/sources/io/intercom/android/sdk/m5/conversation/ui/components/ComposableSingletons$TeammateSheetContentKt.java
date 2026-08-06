package io.intercom.android.sdk.m5.conversation.ui.components;

import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.hf3;
import defpackage.jt1;
import defpackage.v5a;
import defpackage.ws0;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Header;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TeammateSheetContentKt {
    public static final ComposableSingletons$TeammateSheetContentKt INSTANCE = new ComposableSingletons$TeammateSheetContentKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f108lambda1 = new fr1(false, -1445246988, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$TeammateSheetContentKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            List listH = ws0.h(new Header.Expanded.Body(Header.Expanded.Style.H1, "Body 1", null));
            AvatarType avatarType = AvatarType.FACEPILE;
            Avatar avatarBuild = new Avatar.Builder().withInitials("A").build();
            avatarBuild.getClass();
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarBuild, false);
            Avatar avatarBuild2 = new Avatar.Builder().withInitials("B").build();
            avatarBuild2.getClass();
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarBuild2, false);
            Avatar avatarBuild3 = new Avatar.Builder().withInitials("C").build();
            avatarBuild3.getClass();
            List listI = ws0.i(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarBuild3, false));
            hf3 hf3Var = hf3.t;
            TeammateSheetContentKt.TeammateSheetContent(null, null, new ExpandedTeamPresenceState("Title", listH, avatarType, listI, hf3Var, hf3Var, false), jt1Var, 0, 3);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f109lambda2 = new fr1(false, 914081689, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$TeammateSheetContentKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TeammateSheetContentKt.INSTANCE.m139getLambda1$intercom_sdk_base_release(), jt1Var, 12582912, 127);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m139getLambda1$intercom_sdk_base_release() {
        return f108lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m140getLambda2$intercom_sdk_base_release() {
        return f109lambda2;
    }
}
