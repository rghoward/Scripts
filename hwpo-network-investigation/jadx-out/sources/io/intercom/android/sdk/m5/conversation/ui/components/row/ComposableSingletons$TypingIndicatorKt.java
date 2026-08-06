package io.intercom.android.sdk.m5.conversation.ui.components.row;

import com.intercom.twig.BuildConfig;
import defpackage.aj1;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ml5;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.v5a;
import defpackage.yi1;
import defpackage.z20;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Avatar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TypingIndicatorKt {
    public static final ComposableSingletons$TypingIndicatorKt INSTANCE = new ComposableSingletons$TypingIndicatorKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f204lambda1 = new fr1(false, -800155812, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$TypingIndicatorKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            aj1 aj1VarA = yi1.a(new c30.h(16.0f, false, new z20(di.a.k)), di.a.m, jt1Var, 54);
            int iHashCode = Long.hashCode(jt1Var.v());
            kw7 kw7VarY = jt1Var.y();
            ox6 ox6VarC = it1.c(jt1Var, ox6.a.t);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (jt1Var.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var.q();
            if (jt1Var.l()) {
                jt1Var.k(aVar);
            } else {
                jt1Var.z();
            }
            rd7.d(jt1Var, bt1.a.f, aj1VarA);
            rd7.d(jt1Var, bt1.a.e, kw7VarY);
            rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(jt1Var, bt1.a.h);
            rd7.d(jt1Var, bt1.a.d, ox6VarC);
            Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "SK");
            avatarCreate.getClass();
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false);
            TypingIndicatorType typingIndicatorType = TypingIndicatorType.ADMIN;
            TypingIndicatorKt.m290TypingIndicator6a0pyJM(null, new CurrentlyTypingState(avatarWrapper, false, null, typingIndicatorType, 6, null), 0.0f, jt1Var, 0, 5);
            Avatar avatarCreate2 = Avatar.create(BuildConfig.FLAVOR, "SK");
            avatarCreate2.getClass();
            TypingIndicatorKt.m290TypingIndicator6a0pyJM(null, new CurrentlyTypingState(new AvatarWrapper(avatarCreate2, true), false, null, typingIndicatorType, 6, null), 0.0f, jt1Var, 0, 5);
            jt1Var.I();
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f205lambda2 = new fr1(false, 10286785, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$TypingIndicatorKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TypingIndicatorKt.INSTANCE.m270getLambda1$intercom_sdk_base_release(), jt1Var, 12582912, 127);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f206lambda3 = new fr1(false, -946532027, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$TypingIndicatorKt$lambda-3$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "SK");
            avatarCreate.getClass();
            TypingIndicatorKt.m290TypingIndicator6a0pyJM(null, new CurrentlyTypingState(new AvatarWrapper(avatarCreate, true), false, null, TypingIndicatorType.ADMIN, 4, null), 0.0f, jt1Var, 0, 5);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f207lambda4 = new fr1(false, 1884921344, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$TypingIndicatorKt$lambda-4$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TypingIndicatorKt.INSTANCE.m272getLambda3$intercom_sdk_base_release(), jt1Var, 12582912, 127);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m270getLambda1$intercom_sdk_base_release() {
        return f204lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m271getLambda2$intercom_sdk_base_release() {
        return f205lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m272getLambda3$intercom_sdk_base_release() {
        return f206lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m273getLambda4$intercom_sdk_base_release() {
        return f207lambda4;
    }
}
