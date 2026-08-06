package io.intercom.android.sdk.m5.conversation.ui.components;

import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;
import io.intercom.android.sdk.models.AiAnswerInfo;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$AnswerInfoDialogKt {
    public static final ComposableSingletons$AnswerInfoDialogKt INSTANCE = new ComposableSingletons$AnswerInfoDialogKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f85lambda1 = new fr1(false, 125395865, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$AnswerInfoDialogKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                AnswerInfoDialogKt.AnswerInfoDialog(new AiAnswerInfo("This answer was auto generated using AI. There’s a chance it may not be fully correct."), true, null, null, jt1Var, 48, 12);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f86lambda2 = new fr1(false, -1572197681, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$AnswerInfoDialogKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                AnswerInfoDialogKt.AnswerInfoDialog(new AiAnswerInfo("This answer was auto generated using AI. There’s a chance it may not be fully correct."), false, null, null, jt1Var, 48, 12);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m116getLambda1$intercom_sdk_base_release() {
        return f85lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m117getLambda2$intercom_sdk_base_release() {
        return f86lambda2;
    }
}
