package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import com.intercom.twig.BuildConfig;
import defpackage.a30;
import defpackage.aj1;
import defpackage.b0a;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.g2b;
import defpackage.i37;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ml5;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.xr1;
import defpackage.yi1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.errors.VoiceTranscriptionError;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$MessageComposerKt$lambda-8$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$MessageComposerKt$lambda8$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$MessageComposerKt$lambda8$1 INSTANCE = new ComposableSingletons$MessageComposerKt$lambda8$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$7$lambda$2$lambda$1(String str, List list) {
        str.getClass();
        list.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$7$lambda$4$lambda$3(String str, List list) {
        str.getClass();
        list.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$7$lambda$6$lambda$5(String str, List list) {
        str.getClass();
        list.getClass();
        return g2b.a;
    }

    public final void invoke(jt1 jt1Var, int i) throws Throwable {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        aj1 aj1VarA = yi1.a(new c30.h(8.0f, true, new a30()), di.a.m, jt1Var, 6);
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
        jt1Var.K(141143785);
        Object objF = jt1Var.f();
        jt1.a.C0187a c0187a = jt1.a.a;
        if (objF == c0187a) {
            objF = b0a.b(Float.valueOf(0.5f));
            jt1Var.C(objF);
        }
        i37 i37Var = (i37) objF;
        Object objA = xr1.a(jt1Var, 141146865);
        if (objA == c0187a) {
            objA = new k0();
            jt1Var.C(objA);
        }
        jt1Var.B();
        MessageComposerKt.MessageComposer(null, (ci4) objA, new ComposerState.TextInput(BuildConfig.FLAVOR, new StringProvider.StringRes(R.string.intercom_send_us_a_message, null, 2, null), false, null, null, null, 60, null), null, null, null, null, null, null, VoiceTranscriptionState.Recording.INSTANCE, i37Var, null, null, null, null, null, null, jt1Var, 805306416, 0, 129529);
        jt1Var.K(141160305);
        Object objF2 = jt1Var.f();
        if (objF2 == c0187a) {
            objF2 = new l0();
            jt1Var.C(objF2);
        }
        jt1Var.B();
        MessageComposerKt.MessageComposer(null, (ci4) objF2, new ComposerState.TextInput(BuildConfig.FLAVOR, new StringProvider.StringRes(R.string.intercom_send_us_a_message, null, 2, null), false, null, null, null, 60, null), null, null, null, null, null, null, VoiceTranscriptionState.Processing.INSTANCE, null, null, null, null, null, null, null, jt1Var, 805306416, 0, 130553);
        jt1Var.K(141172241);
        Object objF3 = jt1Var.f();
        if (objF3 == c0187a) {
            objF3 = new m0();
            jt1Var.C(objF3);
        }
        jt1Var.B();
        MessageComposerKt.MessageComposer(null, (ci4) objF3, new ComposerState.TextInput(BuildConfig.FLAVOR, new StringProvider.StringRes(R.string.intercom_send_us_a_message, null, 2, null), false, null, null, null, 60, null), null, null, null, null, null, null, new VoiceTranscriptionState.Error(new VoiceTranscriptionError.TranscriptionFailed(null, 1, null)), null, null, null, null, null, null, null, jt1Var, 48, 0, 130553);
        jt1Var.I();
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) throws Throwable {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
