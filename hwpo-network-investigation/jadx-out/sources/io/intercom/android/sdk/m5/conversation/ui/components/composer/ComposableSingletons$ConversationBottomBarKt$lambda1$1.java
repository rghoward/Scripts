package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import com.intercom.twig.BuildConfig;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.oh4;
import defpackage.xr1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.InputTypeState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$ConversationBottomBarKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ConversationBottomBarKt$lambda1$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$ConversationBottomBarKt$lambda1$1 INSTANCE = new ComposableSingletons$ConversationBottomBarKt$lambda1$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$1$lambda$0(String str, List list) {
        str.getClass();
        list.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$11$lambda$10(String str) {
        str.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$3$lambda$2(ComposerInputType composerInputType) {
        composerInputType.getClass();
        return g2b.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        ComposerState.TextInput textInput = new ComposerState.TextInput("Wubba Lubba Dub Dub!", new StringProvider.StringRes(R.string.intercom_reply_to_conversation, null, 2, null), false, null, null, null, 60, null);
        Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "PR");
        avatarCreate.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        BottomBarUiState bottomBarUiState = new BottomBarUiState(textInput, new CurrentlyTypingState(new AvatarWrapper(avatarCreate, false, 2, null), false, null, TypingIndicatorType.ADMIN, 6, null), InputTypeState.Companion.getDEFAULT(), objArr, 8, null);
        jt1Var.K(289194445);
        Object objF = jt1Var.f();
        jt1.a.C0187a c0187a = jt1.a.a;
        if (objF == c0187a) {
            objF = new a();
            jt1Var.C(objF);
        }
        ci4 ci4Var = (ci4) objF;
        Object objA = xr1.a(jt1Var, 289195876);
        if (objA == c0187a) {
            objA = new b();
            jt1Var.C(objA);
        }
        oh4 oh4Var = (oh4) objA;
        Object objA2 = xr1.a(jt1Var, 289197188);
        if (objA2 == c0187a) {
            objA2 = new c();
            jt1Var.C(objA2);
        }
        mh4 mh4Var = (mh4) objA2;
        Object objA3 = xr1.a(jt1Var, 289198692);
        if (objA3 == c0187a) {
            objA3 = new d();
            jt1Var.C(objA3);
        }
        mh4 mh4Var2 = (mh4) objA3;
        Object objA4 = xr1.a(jt1Var, 289200068);
        if (objA4 == c0187a) {
            objA4 = new e();
            jt1Var.C(objA4);
        }
        mh4 mh4Var3 = (mh4) objA4;
        Object objA5 = xr1.a(jt1Var, 289201732);
        if (objA5 == c0187a) {
            objA5 = new f();
            jt1Var.C(objA5);
        }
        oh4 oh4Var2 = (oh4) objA5;
        Object objA6 = xr1.a(jt1Var, 289203236);
        if (objA6 == c0187a) {
            objA6 = new g();
            jt1Var.C(objA6);
        }
        jt1Var.B();
        ConversationBottomBarKt.m180ConversationBottomBar6KZKxL0(null, bottomBarUiState, ci4Var, oh4Var, mh4Var, mh4Var2, mh4Var3, null, 0.0f, oh4Var2, (mh4) objA6, null, null, null, null, null, null, null, null, null, null, jt1Var, 807103872, 6, 0, 2095489);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
