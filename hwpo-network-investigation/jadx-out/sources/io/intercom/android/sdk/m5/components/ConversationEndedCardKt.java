package io.intercom.android.sdk.m5.components;

import defpackage.aj1;
import defpackage.al8;
import defpackage.b47;
import defpackage.bj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.d3a;
import defpackage.di;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.f40;
import defpackage.g2b;
import defpackage.g51;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kk;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ox6;
import defpackage.p12;
import defpackage.q12;
import defpackage.qr5;
import defpackage.r12;
import defpackage.raa;
import defpackage.rd7;
import defpackage.s12;
import defpackage.xj8;
import defpackage.yi1;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationEndedCardKt {
    public static final void ConversationEndedCard(ox6 ox6Var, mh4<g2b> mh4Var, ComposerState.ConversationEnded conversationEnded, jt1 jt1Var, int i, int i2) {
        int i3;
        bj4 bj4Var;
        ox6 ox6Var2;
        mh4<g2b> mh4Var2;
        conversationEnded.getClass();
        bj4 bj4VarO = jt1Var.o(-517544614);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? bj4VarO.J(conversationEnded) : bj4VarO.j(conversationEnded) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
            ox6Var2 = ox6Var;
            mh4Var2 = mh4Var;
            bj4Var = bj4VarO;
        } else {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            if (i5 != 0) {
                mh4Var = null;
            }
            g51.b(ir9.c(ox6Var, 1.0f), al8.a, d3a.c(kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0L, bj4VarO, 0, 14), null, null, gr1.b(-676087732, new AnonymousClass1(conversationEnded, mh4Var), bj4VarO), bj4VarO, 196656, 24);
            bj4Var = bj4VarO;
            ox6Var2 = ox6Var;
            mh4Var2 = mh4Var;
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new s12(ox6Var2, mh4Var2, conversationEnded, i, i2, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationEndedCard$lambda$0(ox6 ox6Var, mh4 mh4Var, ComposerState.ConversationEnded conversationEnded, int i, int i2, jt1 jt1Var, int i3) {
        ConversationEndedCard(ox6Var, mh4Var, conversationEnded, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void ConversationEndedCardPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-172245026);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.m29getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new r12(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationEndedCardPreview$lambda$1(int i, jt1 jt1Var, int i2) {
        ConversationEndedCardPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void ConversationEndedCardWithButtonBotPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-317527071);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.m31getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new p12(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationEndedCardWithButtonBotPreview$lambda$3(int i, jt1 jt1Var, int i2) {
        ConversationEndedCardWithButtonBotPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void ConversationEndedCardWithButtonPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1576691098);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.m30getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new f40(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationEndedCardWithButtonPreview$lambda$2(int i, jt1 jt1Var, int i2) {
        ConversationEndedCardWithButtonPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void ConversationMergedCardPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-233275222);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.m32getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new q12(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationMergedCardPreview$lambda$4(int i, jt1 jt1Var, int i2) {
        ConversationMergedCardPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ConversationEndedCardKt$ConversationEndedCard$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass1 implements ei4<bj1, jt1, Integer, g2b> {
        final /* synthetic */ ComposerState.ConversationEnded $conversationEndedUiState;
        final /* synthetic */ mh4<g2b> $onButtonClick;

        public AnonymousClass1(ComposerState.ConversationEnded conversationEnded, mh4<g2b> mh4Var) {
            this.$conversationEndedUiState = conversationEnded;
            this.$onButtonClick = mh4Var;
        }

        public final void invoke(bj1 bj1Var, jt1 jt1Var, int i) {
            mh4<g2b> mh4Var;
            bj1Var.getClass();
            if ((i & 17) == 16 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarI = eo7.i(ir9.c(aVar, 1.0f), 20.0f);
            ComposerState.ConversationEnded conversationEnded = this.$conversationEndedUiState;
            mh4<g2b> mh4Var2 = this.$onButtonClick;
            aj1 aj1VarA = yi1.a(c30.d, di.a.n, jt1Var, 54);
            int iHashCode = Long.hashCode(jt1Var.v());
            kw7 kw7VarY = jt1Var.y();
            ox6 ox6VarC = it1.c(jt1Var, ox6VarI);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (jt1Var.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var.q();
            if (jt1Var.l()) {
                jt1Var.k(aVar2);
            } else {
                jt1Var.z();
            }
            rd7.d(jt1Var, bt1.a.f, aj1VarA);
            rd7.d(jt1Var, bt1.a.e, kw7VarY);
            rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(jt1Var, bt1.a.h);
            rd7.d(jt1Var, bt1.a.d, ox6VarC);
            StringProvider message = conversationEnded.getMessage();
            int i2 = StringProvider.$stable;
            mia.b(message.getText(jt1Var, i2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var, IntercomTheme.$stable).getType04(), jt1Var, 0, 0, 131070);
            jt1Var.K(-1044601175);
            if (conversationEnded.getCta() != null) {
                b47.b(jt1Var, ir9.d(aVar, 12.0f));
                ox6 ox6VarA = raa.a(aVar, "start-new-conversation-button");
                String text = conversationEnded.getCta().getTitle().getText(jt1Var, i2);
                jt1Var.K(-1044591182);
                if (mh4Var2 == null) {
                    jt1Var.K(-1044590655);
                    Object objF = jt1Var.f();
                    if (objF == jt1.a.a) {
                        objF = new y();
                        jt1Var.C(objF);
                    }
                    jt1Var.B();
                    mh4Var = (mh4) objF;
                } else {
                    mh4Var = mh4Var2;
                }
                jt1Var.B();
                IntercomPrimaryButtonKt.IntercomPrimaryButton(text, ox6VarA, Integer.valueOf(conversationEnded.getCta().getTrailingIcon()), mh4Var, jt1Var, 48, 0);
            }
            jt1Var.B();
            jt1Var.I();
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var, Integer num) {
            invoke(bj1Var, jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
