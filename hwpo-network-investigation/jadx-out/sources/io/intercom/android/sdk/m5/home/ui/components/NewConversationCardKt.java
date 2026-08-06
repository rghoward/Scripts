package io.intercom.android.sdk.m5.home.ui.components;

import defpackage.bj1;
import defpackage.bj4;
import defpackage.ci4;
import defpackage.ei4;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gy2;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.ox6;
import defpackage.ph1;
import defpackage.th1;
import defpackage.xj8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.BotAndHumansFacePileKt;
import io.intercom.android.sdk.m5.components.HomeItemKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.IconType;
import io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NewConversationCardKt {

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
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OpenMessengerResponse.IconType.values().length];
            try {
                iArr2[OpenMessengerResponse.IconType.PAPER_PLANE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void NewConversationCard(final HomeCards.HomeNewConversationData homeNewConversationData, final List<AvatarWrapper> list, final AvatarWrapper avatarWrapper, final mh4<g2b> mh4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        homeNewConversationData.getClass();
        list.getClass();
        mh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-773584515);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.j(homeNewConversationData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(list) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.j(avatarWrapper) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i3 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            if (i4 != 0) {
                avatarWrapper = null;
            }
            IntercomCardKt.IntercomCard(null, null, gr1.b(-1464624655, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt.NewConversationCard.1
                public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i5) {
                    bj1Var.getClass();
                    if ((i5 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    if (homeNewConversationData.getHomeCard() != null) {
                        jt1Var2.K(995075445);
                        NewConversationCardKt.NewConversationCardV2(homeNewConversationData.getHomeCard(), mh4Var, jt1Var2, 0);
                        jt1Var2.B();
                    } else {
                        jt1Var2.K(995264607);
                        NewConversationCardKt.NewConversationCardV1(homeNewConversationData, list, avatarWrapper, mh4Var, jt1Var2, 0, 0);
                        jt1Var2.B();
                    }
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                    invoke(bj1Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 384, 3);
        }
        final AvatarWrapper avatarWrapper2 = avatarWrapper;
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ma7
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return NewConversationCardKt.NewConversationCard$lambda$0(homeNewConversationData, list, avatarWrapper2, mh4Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b NewConversationCard$lambda$0(HomeCards.HomeNewConversationData homeNewConversationData, List list, AvatarWrapper avatarWrapper, mh4 mh4Var, int i, int i2, jt1 jt1Var, int i3) {
        NewConversationCard(homeNewConversationData, list, avatarWrapper, mh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void NewConversationCardBotPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-322151692);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$NewConversationCardKt.INSTANCE.m342getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ja7
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return NewConversationCardKt.NewConversationCardBotPreview$lambda$4(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b NewConversationCardBotPreview$lambda$4(int i, jt1 jt1Var, int i2) {
        NewConversationCardBotPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void NewConversationCardFinWithHumanAccessPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1635839473);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$NewConversationCardKt.INSTANCE.m343getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ia7
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return NewConversationCardKt.NewConversationCardFinWithHumanAccessPreview$lambda$5(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b NewConversationCardFinWithHumanAccessPreview$lambda$5(int i, jt1 jt1Var, int i2) {
        NewConversationCardFinWithHumanAccessPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void NewConversationCardFinWithoutHumanAccessPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1289284327);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$NewConversationCardKt.INSTANCE.m344getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ka7
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return NewConversationCardKt.NewConversationCardFinWithoutHumanAccessPreview$lambda$6(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b NewConversationCardFinWithoutHumanAccessPreview$lambda$6(int i, jt1 jt1Var, int i2) {
        NewConversationCardFinWithoutHumanAccessPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void NewConversationCardTeammatePreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(605107279);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$NewConversationCardKt.INSTANCE.m341getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: oa7
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return NewConversationCardKt.NewConversationCardTeammatePreview$lambda$3(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b NewConversationCardTeammatePreview$lambda$3(int i, jt1 jt1Var, int i2) {
        NewConversationCardTeammatePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x0116  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    @gy2
    public static final void NewConversationCardV1(final HomeCards.HomeNewConversationData homeNewConversationData, final List<AvatarWrapper> list, AvatarWrapper avatarWrapper, final mh4<g2b> mh4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        AvatarWrapper avatarWrapper2;
        mh4<g2b> mh4Var2;
        int i4;
        Integer numValueOf;
        final AvatarWrapper avatarWrapper3;
        ox6 ox6VarJ;
        IconType icon;
        int i5;
        IconType icon2;
        final AvatarWrapper avatarWrapper4;
        xj8 xj8VarW;
        bj4 bj4VarO = jt1Var.o(-1141879848);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.j(homeNewConversationData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(list) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                avatarWrapper2 = avatarWrapper;
                i3 |= bj4VarO.j(avatarWrapper2) ? 256 : 128;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
                mh4Var2 = mh4Var;
            } else {
                mh4Var2 = mh4Var;
                if ((i & 3072) == 0) {
                    if (bj4VarO.j(mh4Var2)) {
                        i4 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i4 = 1024;
                    }
                    i3 |= i4;
                }
            }
            if ((i3 & 1171) == 1170 || !bj4VarO.r()) {
                numValueOf = null;
                if (i6 != 0) {
                    avatarWrapper3 = null;
                } else {
                    avatarWrapper3 = avatarWrapper2;
                }
                ox6VarJ = ox6.a.t;
                ox6 ox6VarB = ir9.b(ox6VarJ, 0.0f, 64.0f, 1);
                icon = homeNewConversationData.getAction().getIcon();
                if (icon == null) {
                    i5 = -1;
                } else {
                    i5 = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
                }
                if (i5 == 1) {
                    numValueOf = Integer.valueOf(R.drawable.intercom_send_message_icon);
                } else if (i5 == 2) {
                    numValueOf = Integer.valueOf(R.drawable.intercom_conversation_card_question);
                } else if (i5 == 3) {
                    numValueOf = Integer.valueOf(R.drawable.intercom_chevron);
                }
                icon2 = homeNewConversationData.getAction().getIcon();
                if ((icon2 != null ? WhenMappings.$EnumSwitchMapping$0[icon2.ordinal()] : -1) == 1) {
                    ox6VarJ = ir9.j(ox6VarJ, 16.0f);
                }
                HomeItemKt.HomeItem(ox6VarB, numValueOf, gr1.b(1023934521, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt.NewConversationCardV1.1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt$NewConversationCardV1$1$WhenMappings */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[IconType.values().length];
                            try {
                                iArr[IconType.FIN.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[IconType.FACE_PILE.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    public final void invoke(jt1 jt1Var2, int i7) {
                        if ((i7 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        IconType icon3 = homeNewConversationData.getAction().getIcon();
                        int i8 = icon3 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon3.ordinal()];
                        if (i8 == 1) {
                            jt1Var2.K(1718791131);
                            if (avatarWrapper3 != null) {
                                AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(ox6.a.t, 32.0f), avatarWrapper3, null, false, 0L, null, jt1Var2, 6, 60);
                            }
                            jt1Var2.B();
                            return;
                        }
                        if (i8 != 2) {
                            jt1Var2.K(-83081034);
                            jt1Var2.B();
                            return;
                        }
                        jt1Var2.K(1719018020);
                        if (avatarWrapper3 != null) {
                            List<AvatarWrapper> list2 = list;
                            ArrayList arrayList = new ArrayList(ph1.n(list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((AvatarWrapper) it.next()).getAvatar());
                            }
                            BotAndHumansFacePileKt.m21BotAndHumansFacePilehGBTI10(null, avatarWrapper3.getAvatar(), BotAndHumansFacePileKt.humanAvatarPairForHome(arrayList), 36.0f, null, jt1Var2, 3072, 17);
                        }
                        jt1Var2.B();
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ox6VarJ, null, homeNewConversationData.getAction().getLabel(), homeNewConversationData.getAction().getSubtitle(), null, mh4Var2, bj4VarO, ((i3 << 15) & 234881024) | 390, 144);
                avatarWrapper4 = avatarWrapper3;
            } else {
                bj4VarO.u();
                avatarWrapper4 = avatarWrapper2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: la7
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return NewConversationCardKt.NewConversationCardV1$lambda$1(homeNewConversationData, list, avatarWrapper4, mh4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        avatarWrapper2 = avatarWrapper;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            mh4Var2 = mh4Var;
        } else {
            mh4Var2 = mh4Var;
            if ((i & 3072) == 0) {
                if (bj4VarO.j(mh4Var2)) {
                    i4 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
        }
        if ((i3 & 1171) == 1170) {
            numValueOf = null;
            if (i6 != 0) {
                avatarWrapper3 = null;
            } else {
                avatarWrapper3 = avatarWrapper2;
            }
            ox6VarJ = ox6.a.t;
            ox6 ox6VarB2 = ir9.b(ox6VarJ, 0.0f, 64.0f, 1);
            icon = homeNewConversationData.getAction().getIcon();
            if (icon == null) {
                i5 = -1;
            } else {
                i5 = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
            }
            if (i5 == 1) {
                numValueOf = Integer.valueOf(R.drawable.intercom_send_message_icon);
            } else if (i5 == 2) {
                numValueOf = Integer.valueOf(R.drawable.intercom_conversation_card_question);
            } else if (i5 == 3) {
                numValueOf = Integer.valueOf(R.drawable.intercom_chevron);
            }
            icon2 = homeNewConversationData.getAction().getIcon();
            if ((icon2 != null ? WhenMappings.$EnumSwitchMapping$0[icon2.ordinal()] : -1) == 1) {
                ox6VarJ = ir9.j(ox6VarJ, 16.0f);
            }
            HomeItemKt.HomeItem(ox6VarB2, numValueOf, gr1.b(1023934521, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt.NewConversationCardV1.1

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt$NewConversationCardV1$1$WhenMappings */
                /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[IconType.values().length];
                        try {
                            iArr[IconType.FIN.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[IconType.FACE_PILE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public final void invoke(jt1 jt1Var2, int i7) {
                    if ((i7 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    IconType icon3 = homeNewConversationData.getAction().getIcon();
                    int i8 = icon3 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon3.ordinal()];
                    if (i8 == 1) {
                        jt1Var2.K(1718791131);
                        if (avatarWrapper3 != null) {
                            AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(ox6.a.t, 32.0f), avatarWrapper3, null, false, 0L, null, jt1Var2, 6, 60);
                        }
                        jt1Var2.B();
                        return;
                    }
                    if (i8 != 2) {
                        jt1Var2.K(-83081034);
                        jt1Var2.B();
                        return;
                    }
                    jt1Var2.K(1719018020);
                    if (avatarWrapper3 != null) {
                        List<AvatarWrapper> list2 = list;
                        ArrayList arrayList = new ArrayList(ph1.n(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((AvatarWrapper) it.next()).getAvatar());
                        }
                        BotAndHumansFacePileKt.m21BotAndHumansFacePilehGBTI10(null, avatarWrapper3.getAvatar(), BotAndHumansFacePileKt.humanAvatarPairForHome(arrayList), 36.0f, null, jt1Var2, 3072, 17);
                    }
                    jt1Var2.B();
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), ox6VarJ, null, homeNewConversationData.getAction().getLabel(), homeNewConversationData.getAction().getSubtitle(), null, mh4Var2, bj4VarO, ((i3 << 15) & 234881024) | 390, 144);
            avatarWrapper4 = avatarWrapper3;
        } else {
            numValueOf = null;
            if (i6 != 0) {
                avatarWrapper3 = null;
            } else {
                avatarWrapper3 = avatarWrapper2;
            }
            ox6VarJ = ox6.a.t;
            ox6 ox6VarB3 = ir9.b(ox6VarJ, 0.0f, 64.0f, 1);
            icon = homeNewConversationData.getAction().getIcon();
            if (icon == null) {
                i5 = -1;
            } else {
                i5 = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
            }
            if (i5 == 1) {
                numValueOf = Integer.valueOf(R.drawable.intercom_send_message_icon);
            } else if (i5 == 2) {
                numValueOf = Integer.valueOf(R.drawable.intercom_conversation_card_question);
            } else if (i5 == 3) {
                numValueOf = Integer.valueOf(R.drawable.intercom_chevron);
            }
            icon2 = homeNewConversationData.getAction().getIcon();
            if ((icon2 != null ? WhenMappings.$EnumSwitchMapping$0[icon2.ordinal()] : -1) == 1) {
                ox6VarJ = ir9.j(ox6VarJ, 16.0f);
            }
            HomeItemKt.HomeItem(ox6VarB3, numValueOf, gr1.b(1023934521, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt.NewConversationCardV1.1

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt$NewConversationCardV1$1$WhenMappings */
                /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[IconType.values().length];
                        try {
                            iArr[IconType.FIN.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[IconType.FACE_PILE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public final void invoke(jt1 jt1Var2, int i7) {
                    if ((i7 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    IconType icon3 = homeNewConversationData.getAction().getIcon();
                    int i8 = icon3 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon3.ordinal()];
                    if (i8 == 1) {
                        jt1Var2.K(1718791131);
                        if (avatarWrapper3 != null) {
                            AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(ox6.a.t, 32.0f), avatarWrapper3, null, false, 0L, null, jt1Var2, 6, 60);
                        }
                        jt1Var2.B();
                        return;
                    }
                    if (i8 != 2) {
                        jt1Var2.K(-83081034);
                        jt1Var2.B();
                        return;
                    }
                    jt1Var2.K(1719018020);
                    if (avatarWrapper3 != null) {
                        List<AvatarWrapper> list2 = list;
                        ArrayList arrayList = new ArrayList(ph1.n(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((AvatarWrapper) it.next()).getAvatar());
                        }
                        BotAndHumansFacePileKt.m21BotAndHumansFacePilehGBTI10(null, avatarWrapper3.getAvatar(), BotAndHumansFacePileKt.humanAvatarPairForHome(arrayList), 36.0f, null, jt1Var2, 3072, 17);
                    }
                    jt1Var2.B();
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), ox6VarJ, null, homeNewConversationData.getAction().getLabel(), homeNewConversationData.getAction().getSubtitle(), null, mh4Var2, bj4VarO, ((i3 << 15) & 234881024) | 390, 144);
            avatarWrapper4 = avatarWrapper3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: la7
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return NewConversationCardKt.NewConversationCardV1$lambda$1(homeNewConversationData, list, avatarWrapper4, mh4Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b NewConversationCardV1$lambda$1(HomeCards.HomeNewConversationData homeNewConversationData, List list, AvatarWrapper avatarWrapper, mh4 mh4Var, int i, int i2, jt1 jt1Var, int i3) {
        NewConversationCardV1(homeNewConversationData, list, avatarWrapper, mh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NewConversationCardV2(final OpenMessengerResponse.NewConversationData.HomeCard homeCard, final mh4<g2b> mh4Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(341363796);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(homeCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ox6 ox6VarJ = ox6.a.t;
            ox6 ox6VarB = ir9.b(ox6VarJ, 0.0f, 64.0f, 1);
            OpenMessengerResponse.IconType icon = homeCard.getIcon();
            Integer icon2 = icon != null ? icon.getIcon() : null;
            OpenMessengerResponse.IconType icon3 = homeCard.getIcon();
            if ((icon3 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[icon3.ordinal()]) == 1) {
                ox6VarJ = ir9.j(ox6VarJ, 16.0f);
            }
            HomeItemKt.HomeItem(ox6VarB, icon2, gr1.b(94824693, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt.NewConversationCardV2.1
                public final void invoke(jt1 jt1Var2, int i3) {
                    if ((i3 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    AvatarDetails avatarDetails = homeCard.getAvatarDetails();
                    if ((avatarDetails != null ? avatarDetails.getAvatarType() : null) == AvatarType.FACEPILE) {
                        Avatar avatarBuild = homeCard.getAvatarDetails().getAvatars().get(0).build();
                        avatarBuild.getClass();
                        List listV = th1.v(homeCard.getAvatarDetails().getAvatars());
                        ArrayList arrayList = new ArrayList(ph1.n(listV, 10));
                        Iterator it = listV.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((Avatar.Builder) it.next()).build());
                        }
                        BotAndHumansFacePileKt.m21BotAndHumansFacePilehGBTI10(null, avatarBuild, BotAndHumansFacePileKt.humanAvatarPairForHome(arrayList), 36.0f, null, jt1Var2, 3072, 17);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), ox6VarJ, null, homeCard.getText(), homeCard.getSubtitle(), null, mh4Var, bj4VarO, ((i2 << 21) & 234881024) | 390, 144);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: na7
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return NewConversationCardKt.NewConversationCardV2$lambda$2(homeCard, mh4Var, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b NewConversationCardV2$lambda$2(OpenMessengerResponse.NewConversationData.HomeCard homeCard, mh4 mh4Var, int i, jt1 jt1Var, int i2) {
        NewConversationCardV2(homeCard, mh4Var, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
