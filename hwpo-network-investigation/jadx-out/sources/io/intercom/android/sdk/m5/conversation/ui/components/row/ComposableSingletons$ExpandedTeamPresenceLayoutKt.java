package io.intercom.android.sdk.m5.conversation.ui.components.row;

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
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Header;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ExpandedTeamPresenceLayoutKt {
    public static final ComposableSingletons$ExpandedTeamPresenceLayoutKt INSTANCE = new ComposableSingletons$ExpandedTeamPresenceLayoutKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f157lambda1 = new fr1(false, 1003438967, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            Header.Expanded.Style style = Header.Expanded.Style.PARAGRAPH;
            List listI = ws0.i(new Header.Expanded.Body(style, "Hi there! I'm a member of the Intercom team. How can I help you today?", "#000000"), new Header.Expanded.Body(style, "I'm here to answer any questions you have about Intercom.", "#000000"));
            AvatarType avatarType = AvatarType.FACEPILE;
            Avatar avatarCreate = Avatar.create("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "F");
            avatarCreate.getClass();
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "SK");
            avatarCreate2.getClass();
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "RH");
            avatarCreate3.getClass();
            ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout(new ExpandedTeamPresenceState("SDKTestApp", listI, avatarType, ws0.i(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null)), hf3.t, ws0.h(new Header.Expanded.SocialAccount("twitter", "https://twitter.com/intercom", "https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "intercom")), false), null, jt1Var, 0, 2);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f158lambda2 = new fr1(false, -1374619086, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m223getLambda1$intercom_sdk_base_release(), jt1Var, 12582912, 127);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f159lambda3 = new fr1(false, 1317404560, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-3$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            Header.Expanded.Style style = Header.Expanded.Style.PARAGRAPH;
            List listI = ws0.i(new Header.Expanded.Body(style, "Hi there! I'm a member of the Intercom team. How can I help you today?", "#000000"), new Header.Expanded.Body(style, "I'm here to answer any questions you have about Intercom.", "#000000"));
            AvatarType avatarType = AvatarType.LAYERED_BUBBLES;
            Avatar avatarCreate = Avatar.create("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "F");
            avatarCreate.getClass();
            ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout(new ExpandedTeamPresenceState("SDKTestApp", listI, avatarType, ws0.h(new AvatarWrapper(avatarCreate, false, 2, null)), ws0.h(new Header.Expanded.Footer(style, "Powered by Intercom", null, new AvatarDetails(avatarType, ws0.i(new Avatar.Builder().withImageUrl("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064").withInitials("SK"), new Avatar.Builder().withImageUrl("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064").withInitials("RH"))))), ws0.h(new Header.Expanded.SocialAccount("twitter", "https://twitter.com/intercom", "https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "intercom")), false), null, jt1Var, 0, 2);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f160lambda4 = new fr1(false, 2104929077, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-4$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m225getLambda3$intercom_sdk_base_release(), jt1Var, 12582912, 127);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-5, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f161lambda5 = new fr1(false, 1099388065, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-5$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            Header.Expanded.Style style = Header.Expanded.Style.PARAGRAPH;
            List listI = ws0.i(new Header.Expanded.Body(style, "Hi there! I'm a member of the Intercom team. How can I help you today?", "#000000"), new Header.Expanded.Body(style, "I'm here to answer any questions you have about Intercom.", "#000000"));
            AvatarType avatarType = AvatarType.LAYERED_BUBBLES;
            Avatar avatarCreate = Avatar.create("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "SK");
            avatarCreate.getClass();
            List listH = ws0.h(new AvatarWrapper(avatarCreate, false, 2, null));
            hf3 hf3Var = hf3.t;
            ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout(new ExpandedTeamPresenceState("SDKTestApp", listI, avatarType, listH, hf3Var, hf3Var, true), null, jt1Var, 0, 2);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-6, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f162lambda6 = new fr1(false, -257155684, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-6$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m227getLambda5$intercom_sdk_base_release(), jt1Var, 12582912, 127);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m223getLambda1$intercom_sdk_base_release() {
        return f157lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m224getLambda2$intercom_sdk_base_release() {
        return f158lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m225getLambda3$intercom_sdk_base_release() {
        return f159lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m226getLambda4$intercom_sdk_base_release() {
        return f160lambda4;
    }

    /* JADX INFO: renamed from: getLambda-5$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m227getLambda5$intercom_sdk_base_release() {
        return f161lambda5;
    }

    /* JADX INFO: renamed from: getLambda-6$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m228getLambda6$intercom_sdk_base_release() {
        return f162lambda6;
    }
}
