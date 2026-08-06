package io.intercom.android.sdk.m5.inbox.ui;

import defpackage.bj4;
import defpackage.ci4;
import defpackage.ed1;
import defpackage.fd1;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.jt1;
import defpackage.lp4;
import defpackage.mh4;
import defpackage.op4;
import defpackage.ox6;
import defpackage.u;
import defpackage.xj8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.EmptyStateKt;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.home.data.IconType;
import io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt;
import io.intercom.android.sdk.models.ActionType;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class InboxEmptyScreenKt {
    @IntercomPreviews
    private static final void EmptyScreenBotPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(862447475);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InboxEmptyScreenKt.INSTANCE.m367getLambda8$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new fd1(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b EmptyScreenBotPreview$lambda$4(int i, jt1 jt1Var, int i2) {
        EmptyScreenBotPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void EmptyScreenHelpPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1522245405);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InboxEmptyScreenKt.INSTANCE.m363getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new op4(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b EmptyScreenHelpPreview$lambda$2(int i, jt1 jt1Var, int i2) {
        EmptyScreenHelpPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void EmptyScreenMessagePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1317218099);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InboxEmptyScreenKt.INSTANCE.m361getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new lp4(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b EmptyScreenMessagePreview$lambda$1(int i, jt1 jt1Var, int i2) {
        EmptyScreenMessagePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void EmptyScreenWithoutActionPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-132232118);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InboxEmptyScreenKt.INSTANCE.m365getLambda6$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ed1(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b EmptyScreenWithoutActionPreview$lambda$3(int i, jt1 jt1Var, int i2) {
        EmptyScreenWithoutActionPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void InboxEmptyScreen(final EmptyState emptyState, final boolean z, final mh4<g2b> mh4Var, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        final ox6 ox6Var2;
        emptyState.getClass();
        mh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-727293785);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(emptyState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.c(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= bj4VarO.J(ox6Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i3 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
            ox6Var2 = ox6Var;
        } else {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            ox6 ox6Var3 = ox6Var;
            EmptyStateKt.EmptyState(emptyState.getTitle(), ox6Var3, emptyState.getText(), Integer.valueOf(R.drawable.intercom_messages_icon), gr1.b(2045450098, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt.InboxEmptyScreen.1

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt$InboxEmptyScreen$1$WhenMappings */
                /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

                    static {
                        int[] iArr = new int[IconType.values().length];
                        try {
                            iArr[IconType.TEAMMATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[IconType.BOT.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[IconType.FIN.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[IconType.FACE_PILE.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                        int[] iArr2 = new int[ActionType.values().length];
                        try {
                            iArr2[ActionType.MESSAGE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr2[ActionType.HELP.ordinal()] = 2;
                        } catch (NoSuchFieldError unused6) {
                        }
                        $EnumSwitchMapping$1 = iArr2;
                    }
                }

                public final void invoke(jt1 jt1Var2, int i5) {
                    Integer numValueOf;
                    if ((i5 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    if (z) {
                        int i6 = WhenMappings.$EnumSwitchMapping$1[emptyState.getAction().getType().ordinal()];
                        if (i6 != 1) {
                            if (i6 == 2) {
                                jt1Var2.K(1738038509);
                                IntercomPrimaryButtonKt.IntercomPrimaryButton(emptyState.getAction().getLabel(), null, Integer.valueOf(R.drawable.intercom_article_book_icon), mh4Var, jt1Var2, 0, 2);
                                jt1Var2.B();
                                return;
                            } else {
                                jt1Var2.K(1738020481);
                                jt1Var2.B();
                                u.b();
                                return;
                            }
                        }
                        jt1Var2.K(1738022382);
                        String label = emptyState.getAction().getLabel();
                        IconType icon = emptyState.getAction().getIcon();
                        int i7 = icon == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
                        if (i7 != 1) {
                            numValueOf = (i7 == 2 || i7 == 3 || i7 == 4) ? Integer.valueOf(R.drawable.intercom_conversation_card_question) : null;
                        } else {
                            numValueOf = Integer.valueOf(R.drawable.intercom_send_message_icon);
                        }
                        IntercomPrimaryButtonKt.IntercomPrimaryButton(label, null, numValueOf, mh4Var, jt1Var2, 0, 2);
                        jt1Var2.B();
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, ((i3 >> 6) & 112) | 24576, 0);
            ox6Var2 = ox6Var3;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: z95
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return InboxEmptyScreenKt.InboxEmptyScreen$lambda$0(emptyState, z, mh4Var, ox6Var2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b InboxEmptyScreen$lambda$0(EmptyState emptyState, boolean z, mh4 mh4Var, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        InboxEmptyScreen(emptyState, z, mh4Var, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
