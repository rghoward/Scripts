package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.aj1;
import defpackage.bg5;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cj1;
import defpackage.cza;
import defpackage.di;
import defpackage.dv;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fl6;
import defpackage.fnb;
import defpackage.ft;
import defpackage.g2b;
import defpackage.g3;
import defpackage.gr1;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kv0;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.mt;
import defpackage.njb;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.pv0;
import defpackage.qh3;
import defpackage.qr5;
import defpackage.qu1;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.tx2;
import defpackage.uh3;
import defpackage.w20;
import defpackage.xj5;
import defpackage.xv;
import defpackage.xv9;
import defpackage.y0a;
import defpackage.yi1;
import defpackage.yz9;
import defpackage.zg3;
import defpackage.zl9;
import defpackage.zz9;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.activities.ConversationReactionListener;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.conversation.ReactionListener;
import io.intercom.android.sdk.m5.components.ConversationEndedCardKt;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ComposerUiEffect;
import io.intercom.android.sdk.m5.conversation.states.MediaUploadItem;
import io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardStateKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationBottomBarKt$ConversationBottomBar$9 implements ei4<pv0, jt1, Integer, g2b> {
    final /* synthetic */ zz9<Float> $amplitudeLevel;
    final /* synthetic */ BottomBarUiState $bottomBarUiState;
    final /* synthetic */ zl9<ComposerUiEffect> $composerUiEffect;
    final /* synthetic */ oh4<String, g2b> $navigateToAnotherConversation;
    final /* synthetic */ mh4<g2b> $onCancelVoiceRecording;
    final /* synthetic */ mh4<g2b> $onClearMediaUploadItems;
    final /* synthetic */ oh4<MediaUploadItem, g2b> $onDeleteMediaUploadItem;
    final /* synthetic */ oh4<MediaUploadItem, g2b> $onFailedMediaUploadItem;
    final /* synthetic */ mh4<g2b> $onGifInputSelected;
    final /* synthetic */ oh4<ComposerInputType, g2b> $onInputChange;
    final /* synthetic */ mh4<g2b> $onMediaInputSelected;
    final /* synthetic */ mh4<g2b> $onNewConversationClicked;
    final /* synthetic */ mh4<g2b> $onPrivacyNoticeDismissed;
    final /* synthetic */ ci4<String, List<MediaUploadItem>, g2b> $onSendMessage;
    final /* synthetic */ mh4<g2b> $onStartVoiceRecording;
    final /* synthetic */ mh4<g2b> $onStopVoiceRecording;
    final /* synthetic */ mh4<g2b> $onTyping;
    final /* synthetic */ float $topSpacing;
    final /* synthetic */ oh4<MetricData, g2b> $trackMetric;
    final /* synthetic */ VoiceTranscriptionState $voiceTranscriptionState;

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationBottomBarKt$ConversationBottomBar$9(float f, BottomBarUiState bottomBarUiState, ci4<? super String, ? super List<MediaUploadItem>, g2b> ci4Var, mh4<g2b> mh4Var, mh4<g2b> mh4Var2, oh4<? super ComposerInputType, g2b> oh4Var, oh4<? super MetricData, g2b> oh4Var2, mh4<g2b> mh4Var3, zl9<? extends ComposerUiEffect> zl9Var, VoiceTranscriptionState voiceTranscriptionState, zz9<Float> zz9Var, mh4<g2b> mh4Var4, mh4<g2b> mh4Var5, mh4<g2b> mh4Var6, oh4<? super MediaUploadItem, g2b> oh4Var3, oh4<? super MediaUploadItem, g2b> oh4Var4, mh4<g2b> mh4Var7, mh4<g2b> mh4Var8, oh4<? super String, g2b> oh4Var5, mh4<g2b> mh4Var9) {
        this.$topSpacing = f;
        this.$bottomBarUiState = bottomBarUiState;
        this.$onSendMessage = ci4Var;
        this.$onGifInputSelected = mh4Var;
        this.$onMediaInputSelected = mh4Var2;
        this.$onInputChange = oh4Var;
        this.$trackMetric = oh4Var2;
        this.$onTyping = mh4Var3;
        this.$composerUiEffect = zl9Var;
        this.$voiceTranscriptionState = voiceTranscriptionState;
        this.$amplitudeLevel = zz9Var;
        this.$onStartVoiceRecording = mh4Var4;
        this.$onStopVoiceRecording = mh4Var5;
        this.$onCancelVoiceRecording = mh4Var6;
        this.$onDeleteMediaUploadItem = oh4Var3;
        this.$onFailedMediaUploadItem = oh4Var4;
        this.$onClearMediaUploadItems = mh4Var7;
        this.$onNewConversationClicked = mh4Var8;
        this.$navigateToAnotherConversation = oh4Var5;
        this.$onPrivacyNoticeDismissed = mh4Var9;
    }

    private static final KeyboardState invoke$lambda$0(yz9<KeyboardState> yz9Var) {
        return yz9Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$15$lambda$10$lambda$9(yz9 yz9Var) {
        return invoke$lambda$0(yz9Var).isDismissed();
    }

    private static final boolean invoke$lambda$15$lambda$11(yz9<Boolean> yz9Var) {
        return yz9Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$15$lambda$14$lambda$13(tx2 tx2Var, int i) {
        return -tx2Var.n1(40.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$15$lambda$5$lambda$4$lambda$3$lambda$2$lambda$1(oh4 oh4Var, ComposerState.ConversationEnded.ConversationEndedCta conversationEndedCta) {
        oh4Var.invoke(conversationEndedCta.getLinkedConversationId());
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactionInputView invoke$lambda$15$lambda$8$lambda$7(BottomBarUiState bottomBarUiState, ReactionListener reactionListener, Context context) {
        context.getClass();
        ReactionInputView reactionInputView = new ReactionInputView(context);
        reactionInputView.setUpReactions(((ComposerState.Reactions) bottomBarUiState.getComposerState()).getReactionReply(), true, reactionListener);
        return reactionInputView;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x035a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0366  */
    /* JADX WARN: Code duplicated, block: B:87:0x03a1  */
    public final void invoke(pv0 pv0Var, jt1 jt1Var, int i) throws Throwable {
        pv0 pv0Var2;
        int i2;
        mh4<g2b> mh4Var;
        yz9<KeyboardState> yz9Var;
        oh4<MetricData, g2b> oh4Var;
        final BottomBarUiState bottomBarUiState;
        jt1.a.C0187a c0187a;
        xv9 xv9Var;
        Object objF;
        final tx2 tx2Var;
        boolean zJ;
        Object objF2;
        mh4<g2b> mh4Var2;
        mh4<g2b> mh4Var3;
        jt1 jt1Var2 = jt1Var;
        pv0Var.getClass();
        if ((i & 6) == 0) {
            pv0Var2 = pv0Var;
            i2 = i | (jt1Var2.J(pv0Var2) ? 4 : 2);
        } else {
            pv0Var2 = pv0Var;
            i2 = i;
        }
        if ((i2 & 19) == 18 && jt1Var2.r()) {
            jt1Var2.u();
            return;
        }
        WeakHashMap<View, fnb> weakHashMap = fnb.w;
        mt mtVar = fnb.a.c(jt1Var2).g;
        y0a y0aVar = qu1.h;
        float fI = (pv0Var2.i() - this.$topSpacing) - ((tx2) jt1Var2.F(y0aVar)).F0(mtVar.e().b);
        if (fI < 0.0f) {
            fI = 0.0f;
        }
        Context context = (Context) jt1Var2.F(AndroidCompositionLocals_androidKt.b);
        yz9<KeyboardState> yz9VarKeyboardAsState = KeyboardStateKt.keyboardAsState(jt1Var2, 0);
        ox6.a aVar = ox6.a.t;
        ox6 ox6VarC = w20.c(ir9.e(ir9.c(aVar, 1.0f), 0.0f, fI, 1), w20.f);
        BottomBarUiState bottomBarUiState2 = this.$bottomBarUiState;
        ci4<String, List<MediaUploadItem>, g2b> ci4Var = this.$onSendMessage;
        mh4<g2b> mh4Var4 = this.$onGifInputSelected;
        mh4<g2b> mh4Var5 = this.$onMediaInputSelected;
        oh4<ComposerInputType, g2b> oh4Var2 = this.$onInputChange;
        oh4<MetricData, g2b> oh4Var3 = this.$trackMetric;
        mh4<g2b> mh4Var6 = this.$onTyping;
        zl9<ComposerUiEffect> zl9Var = this.$composerUiEffect;
        VoiceTranscriptionState voiceTranscriptionState = this.$voiceTranscriptionState;
        zz9<Float> zz9Var = this.$amplitudeLevel;
        mh4<g2b> mh4Var7 = this.$onStartVoiceRecording;
        mh4<g2b> mh4Var8 = this.$onStopVoiceRecording;
        mh4<g2b> mh4Var9 = this.$onCancelVoiceRecording;
        oh4<MediaUploadItem, g2b> oh4Var4 = this.$onDeleteMediaUploadItem;
        oh4<MediaUploadItem, g2b> oh4Var5 = this.$onFailedMediaUploadItem;
        mh4<g2b> mh4Var10 = this.$onClearMediaUploadItems;
        mh4<g2b> mh4Var11 = this.$onNewConversationClicked;
        final oh4<String, g2b> oh4Var6 = this.$navigateToAnotherConversation;
        mh4<g2b> mh4Var12 = this.$onPrivacyNoticeDismissed;
        c30.k kVar = c30.c;
        sp0.a aVar2 = di.a.m;
        aj1 aj1VarA = yi1.a(kVar, aVar2, jt1Var2, 0);
        int iHashCode = Long.hashCode(jt1Var2.v());
        kw7 kw7VarY = jt1Var2.y();
        ox6 ox6VarC2 = it1.c(jt1Var2, ox6VarC);
        bt1.c.getClass();
        qr5.a aVar3 = bt1.a.b;
        if (jt1Var2.s() == null) {
            ml5.c();
            throw null;
        }
        jt1Var2.q();
        if (jt1Var2.l()) {
            jt1Var2.k(aVar3);
        } else {
            jt1Var2.z();
        }
        bt1.a.c cVar = bt1.a.f;
        rd7.d(jt1Var2, cVar, aj1VarA);
        bt1.a.e eVar = bt1.a.e;
        rd7.d(jt1Var2, eVar, kw7VarY);
        Integer numValueOf = Integer.valueOf(iHashCode);
        bt1.a.b bVar = bt1.a.g;
        rd7.d(jt1Var2, bVar, numValueOf);
        bt1.a.C0034a c0034a = bt1.a.h;
        rd7.c(jt1Var2, c0034a);
        bt1.a.d dVar = bt1.a.d;
        rd7.d(jt1Var2, dVar, ox6VarC2);
        ComposerState composerState = bottomBarUiState2.getComposerState();
        boolean z = composerState instanceof ComposerState.ConversationEnded;
        jt1.a.C0187a c0187a2 = jt1.a.a;
        if (!z) {
            mh4Var = mh4Var12;
            if (composerState instanceof ComposerState.Hidden) {
                jt1Var2.K(519160542);
                if (((ComposerState.Hidden) bottomBarUiState2.getComposerState()).getHideKeyboard() && (xv9Var = (xv9) jt1Var2.F(qu1.q)) != null) {
                    xv9Var.a();
                    g2b g2bVar = g2b.a;
                }
                jt1Var2.B();
            } else if (composerState instanceof ComposerState.TextInput) {
                jt1Var2.K(519422585);
                yz9Var = yz9VarKeyboardAsState;
                MessageComposerKt.MessageComposer(eo7.m(aVar, 16.0f, 0.0f, 16.0f, 8.0f, 2), ci4Var, (ComposerState.TextInput) bottomBarUiState2.getComposerState(), mh4Var4, mh4Var5, oh4Var2, oh4Var3, mh4Var6, zl9Var, voiceTranscriptionState, zz9Var, mh4Var7, mh4Var8, mh4Var9, oh4Var4, oh4Var5, mh4Var10, jt1Var2, 6, 0, 0);
                oh4Var = oh4Var3;
                jt1Var2 = jt1Var2;
                jt1Var2.B();
                bottomBarUiState = bottomBarUiState2;
                c0187a = c0187a2;
                aVar = aVar;
            } else {
                yz9Var = yz9VarKeyboardAsState;
                oh4Var = oh4Var3;
                if (!(composerState instanceof ComposerState.Reactions)) {
                    jt1Var2.K(1956378310);
                    jt1Var2.B();
                    defpackage.u.b();
                    return;
                }
                jt1Var2.K(520669219);
                final ConversationReactionListener conversationReactionListener = new ConversationReactionListener(MetricTracker.ReactionLocation.CONVERSATION, ((ComposerState.Reactions) bottomBarUiState2.getComposerState()).getLastPartId(), ((ComposerState.Reactions) bottomBarUiState2.getComposerState()).getConversationId(), Injector.get().getApi(), Injector.get().getMetricTracker());
                ox6 ox6VarI = eo7.i(ir9.c(aVar, 1.0f), 24.0f);
                jt1Var2.K(1956478664);
                bottomBarUiState = bottomBarUiState2;
                boolean zJ2 = jt1Var2.j(bottomBarUiState) | jt1Var2.j(conversationReactionListener);
                Object objF3 = jt1Var2.f();
                c0187a = c0187a2;
                if (zJ2 || objF3 == c0187a) {
                    aVar = aVar;
                    objF3 = new oh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.o0
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ConversationBottomBarKt$ConversationBottomBar$9.invoke$lambda$15$lambda$8$lambda$7(bottomBarUiState, conversationReactionListener, (Context) obj);
                        }
                    };
                    jt1Var2.C(objF3);
                }
                jt1Var2.B();
                ft.b((oh4) objF3, ox6VarI, null, jt1Var2, 48, 4);
                jt1Var2.B();
            }
            jt1Var2.K(1956495153);
            if (!xj5.a(bottomBarUiState.getBottomBadge(), BottomBarUiState.BottomBadgeState.None.INSTANCE)) {
                jt1Var2.K(1956496727);
                objF = jt1Var2.f();
                if (objF == c0187a) {
                    final yz9<KeyboardState> yz9Var2 = yz9Var;
                    objF = bl7.f(new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.p0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Boolean.valueOf(ConversationBottomBarKt$ConversationBottomBar$9.invoke$lambda$15$lambda$10$lambda$9(yz9Var2));
                        }
                    });
                    jt1Var2.C(objF);
                }
                jt1Var2.B();
                tx2Var = (tx2) jt1Var2.F(y0aVar);
                sp0.a aVar4 = di.a.n;
                BottomBarUiState bottomBarUiState3 = bottomBarUiState;
                cj1 cj1Var = cj1.a;
                ox6 ox6VarA = cj1Var.a(aVar, aVar4);
                boolean zInvoke$lambda$15$lambda$11 = invoke$lambda$15$lambda$11((yz9) objF);
                jt1Var2.K(1956509568);
                zJ = jt1Var2.J(tx2Var);
                objF2 = jt1Var2.f();
                if (zJ || objF2 == c0187a) {
                    objF2 = new oh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.q0
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(ConversationBottomBarKt$ConversationBottomBar$9.invoke$lambda$15$lambda$14$lambda$13(tx2Var, ((Integer) obj).intValue()));
                        }
                    };
                    jt1Var2.C(objF2);
                }
                jt1Var2.B();
                uh3 uh3VarB = zg3.j((oh4) objF2).b(zg3.b(null, 13)).b(zg3.c(null, 1));
                Map<cza<?, ?>, Float> map = njb.a;
                dv.c(zInvoke$lambda$15$lambda$11, ox6VarA, uh3VarB, zg3.k(xv.b(0.0f, 400.0f, new bg5(4294967297L), 1), qh3.u).b(zg3.h(null, 15)).b(zg3.d(null, 3)), null, gr1.b(1219754198, new ConversationBottomBarKt$ConversationBottomBar$9$1$4(bottomBarUiState3, mh4Var, cj1Var, oh4Var, context), jt1Var2), jt1Var, 1597446, 16);
                jt1Var2 = jt1Var;
            }
            jt1Var2.B();
            jt1Var2.I();
        }
        jt1Var2.K(518194365);
        fl6 fl6VarD = dv0.d(di.a.a, false);
        int iHashCode2 = Long.hashCode(jt1Var2.v());
        kw7 kw7VarY2 = jt1Var2.y();
        ox6 ox6VarC3 = it1.c(jt1Var2, aVar);
        if (jt1Var2.s() == null) {
            ml5.c();
            throw null;
        }
        jt1Var2.q();
        if (jt1Var2.l()) {
            jt1Var2.k(aVar3);
        } else {
            jt1Var2.z();
        }
        rd7.d(jt1Var2, cVar, fl6VarD);
        rd7.d(jt1Var2, eVar, kw7VarY2);
        g3.c(iHashCode2, jt1Var2, bVar, jt1Var2, c0034a);
        rd7.d(jt1Var2, dVar, ox6VarC3);
        ox6 ox6VarF = kv0.a.f(aVar, di.a.e);
        aj1 aj1VarA2 = yi1.a(kVar, aVar2, jt1Var2, 0);
        int iHashCode3 = Long.hashCode(jt1Var2.v());
        kw7 kw7VarY3 = jt1Var2.y();
        ox6 ox6VarC4 = it1.c(jt1Var2, ox6VarF);
        if (jt1Var2.s() == null) {
            ml5.c();
            throw null;
        }
        jt1Var2.q();
        if (jt1Var2.l()) {
            jt1Var2.k(aVar3);
        } else {
            jt1Var2.z();
        }
        rd7.d(jt1Var2, cVar, aj1VarA2);
        rd7.d(jt1Var2, eVar, kw7VarY3);
        g3.c(iHashCode3, jt1Var2, bVar, jt1Var2, c0034a);
        rd7.d(jt1Var2, dVar, ox6VarC4);
        IntercomDividerKt.IntercomDivider(null, jt1Var2, 0, 1);
        final ComposerState.ConversationEnded.ConversationEndedCta cta = ((ComposerState.ConversationEnded) bottomBarUiState2.getComposerState()).getCta();
        jt1Var2.K(-809299333);
        if (cta == null) {
            mh4Var3 = null;
        } else {
            jt1Var2.K(-809298065);
            String linkedConversationId = cta.getLinkedConversationId();
            if (linkedConversationId == null || linkedConversationId.length() == 0) {
                mh4Var2 = mh4Var11;
            } else {
                jt1Var2.K(1562894883);
                boolean zJ3 = jt1Var2.J(oh4Var6) | jt1Var2.j(cta);
                Object objF4 = jt1Var2.f();
                if (zJ3 || objF4 == c0187a2) {
                    objF4 = new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.n0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ConversationBottomBarKt$ConversationBottomBar$9.invoke$lambda$15$lambda$5$lambda$4$lambda$3$lambda$2$lambda$1(oh4Var6, cta);
                        }
                    };
                    jt1Var2.C(objF4);
                }
                mh4Var2 = (mh4) objF4;
                jt1Var2.B();
            }
            jt1Var2.B();
            mh4Var3 = mh4Var2;
        }
        jt1Var2.B();
        mh4Var = mh4Var12;
        ConversationEndedCardKt.ConversationEndedCard(null, mh4Var3, (ComposerState.ConversationEnded) bottomBarUiState2.getComposerState(), jt1Var2, StringProvider.$stable << 6, 1);
        jt1Var2.I();
        jt1Var2.I();
        jt1Var2.B();
        c0187a = c0187a2;
        yz9Var = yz9VarKeyboardAsState;
        bottomBarUiState = bottomBarUiState2;
        oh4Var = oh4Var3;
        jt1Var2.K(1956495153);
        if (!xj5.a(bottomBarUiState.getBottomBadge(), BottomBarUiState.BottomBadgeState.None.INSTANCE)) {
            jt1Var2.K(1956496727);
            objF = jt1Var2.f();
            if (objF == c0187a) {
                final yz9 yz9Var3 = yz9Var;
                objF = bl7.f(new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.p0
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return Boolean.valueOf(ConversationBottomBarKt$ConversationBottomBar$9.invoke$lambda$15$lambda$10$lambda$9(yz9Var3));
                    }
                });
                jt1Var2.C(objF);
            }
            jt1Var2.B();
            tx2Var = (tx2) jt1Var2.F(y0aVar);
            sp0.a aVar5 = di.a.n;
            BottomBarUiState bottomBarUiState4 = bottomBarUiState;
            cj1 cj1Var2 = cj1.a;
            ox6 ox6VarA2 = cj1Var2.a(aVar, aVar5);
            boolean zInvoke$lambda$15$lambda$12 = invoke$lambda$15$lambda$11((yz9) objF);
            jt1Var2.K(1956509568);
            zJ = jt1Var2.J(tx2Var);
            objF2 = jt1Var2.f();
            if (zJ) {
                objF2 = new oh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.q0
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(ConversationBottomBarKt$ConversationBottomBar$9.invoke$lambda$15$lambda$14$lambda$13(tx2Var, ((Integer) obj).intValue()));
                    }
                };
                jt1Var2.C(objF2);
            } else {
                objF2 = new oh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.q0
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(ConversationBottomBarKt$ConversationBottomBar$9.invoke$lambda$15$lambda$14$lambda$13(tx2Var, ((Integer) obj).intValue()));
                    }
                };
                jt1Var2.C(objF2);
            }
            jt1Var2.B();
            uh3 uh3VarB2 = zg3.j((oh4) objF2).b(zg3.b(null, 13)).b(zg3.c(null, 1));
            Map<cza<?, ?>, Float> map2 = njb.a;
            dv.c(zInvoke$lambda$15$lambda$12, ox6VarA2, uh3VarB2, zg3.k(xv.b(0.0f, 400.0f, new bg5(4294967297L), 1), qh3.u).b(zg3.h(null, 15)).b(zg3.d(null, 3)), null, gr1.b(1219754198, new ConversationBottomBarKt$ConversationBottomBar$9$1$4(bottomBarUiState4, mh4Var, cj1Var2, oh4Var, context), jt1Var2), jt1Var, 1597446, 16);
            jt1Var2 = jt1Var;
        }
        jt1Var2.B();
        jt1Var2.I();
    }

    @Override // defpackage.ei4
    public /* bridge */ /* synthetic */ g2b invoke(pv0 pv0Var, jt1 jt1Var, Integer num) throws Throwable {
        invoke(pv0Var, jt1Var, num.intValue());
        return g2b.a;
    }
}
