package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.ah5;
import defpackage.aj1;
import defpackage.al8;
import defpackage.b47;
import defpackage.bj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c15;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cka;
import defpackage.cz1;
import defpackage.d73;
import defpackage.di;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.g3;
import defpackage.gi0;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h86;
import defpackage.ir9;
import defpackage.it1;
import defpackage.j1b;
import defpackage.js7;
import defpackage.jt1;
import defpackage.kk;
import defpackage.kw7;
import defpackage.l02;
import defpackage.ly8;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.uh1;
import defpackage.we1;
import defpackage.ws0;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.z63;
import defpackage.zg5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.ui.components.row.PostCardRowKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.post.IntercomPostActivity;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PostCardRowKt {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                iArr[BlockType.HEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockType.SUBHEADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @IntercomPreviews
    private static final void PostCardPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(620144177);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PostCardRowKt.INSTANCE.m259getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: s68
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PostCardRowKt.PostCardPreview$lambda$5(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PostCardPreview$lambda$5(int i, jt1 jt1Var, int i2) {
        PostCardPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    public static final void PostCardRow(ox6 ox6Var, final Part part, final String str, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        Part part2;
        int i4;
        ox6 ox6Var3;
        xj8 xj8VarW;
        part.getClass();
        str.getClass();
        bj4 bj4VarO = jt1Var.o(-1691901714);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                part2 = part;
                i3 |= bj4VarO.j(part2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                if ((i & 384) == 0) {
                    if (bj4VarO.J(str)) {
                        i4 = 256;
                    } else {
                        i4 = 128;
                    }
                    i3 |= i4;
                }
                if ((i3 & 147) == 146 || !bj4VarO.r()) {
                    if (i5 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    Context context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i6 = IntercomTheme.$stable;
                    IntercomCardKt.IntercomCard(ir9.d(eo7.j(14.0f, 12.0f, ox6Var3), 200.0f), IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(1178622818, new AnonymousClass1(part2, str, new js7[]{new js7(Float.valueOf(0.0f), new uh1(uh1.j)), new js7(Float.valueOf(0.9f), new uh1(kk.a(intercomTheme, bj4VarO, i6)))}, context, ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(bj4VarO, i6).m751getAction0d7_KjU())), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
                    ox6Var2 = ox6Var3;
                } else {
                    bj4VarO.u();
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: t68
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return PostCardRowKt.PostCardRow$lambda$0(ox6Var2, part, str, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 384;
            if ((i3 & 147) == 146) {
                if (i5 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                Context context2 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                int i7 = IntercomTheme.$stable;
                IntercomCardKt.IntercomCard(ir9.d(eo7.j(14.0f, 12.0f, ox6Var3), 200.0f), IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(1178622818, new AnonymousClass1(part2, str, new js7[]{new js7(Float.valueOf(0.0f), new uh1(uh1.j)), new js7(Float.valueOf(0.9f), new uh1(kk.a(intercomTheme2, bj4VarO, i7)))}, context2, ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(intercomTheme2.getColors(bj4VarO, i7).m751getAction0d7_KjU())), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
                ox6Var2 = ox6Var3;
            } else {
                if (i5 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                Context context3 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                int i8 = IntercomTheme.$stable;
                IntercomCardKt.IntercomCard(ir9.d(eo7.j(14.0f, 12.0f, ox6Var3), 200.0f), IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(1178622818, new AnonymousClass1(part2, str, new js7[]{new js7(Float.valueOf(0.0f), new uh1(uh1.j)), new js7(Float.valueOf(0.9f), new uh1(kk.a(intercomTheme3, bj4VarO, i8)))}, context3, ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(intercomTheme3.getColors(bj4VarO, i8).m751getAction0d7_KjU())), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
                ox6Var2 = ox6Var3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: t68
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PostCardRowKt.PostCardRow$lambda$0(ox6Var2, part, str, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        part2 = part;
        if ((i2 & 4) != 0) {
            if ((i & 384) == 0) {
                if (bj4VarO.J(str)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i3 & 147) == 146) {
                if (i5 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                Context context4 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                int i9 = IntercomTheme.$stable;
                IntercomCardKt.IntercomCard(ir9.d(eo7.j(14.0f, 12.0f, ox6Var3), 200.0f), IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(1178622818, new AnonymousClass1(part2, str, new js7[]{new js7(Float.valueOf(0.0f), new uh1(uh1.j)), new js7(Float.valueOf(0.9f), new uh1(kk.a(intercomTheme4, bj4VarO, i9)))}, context4, ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(intercomTheme4.getColors(bj4VarO, i9).m751getAction0d7_KjU())), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
                ox6Var2 = ox6Var3;
            } else {
                if (i5 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                Context context5 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                int i10 = IntercomTheme.$stable;
                IntercomCardKt.IntercomCard(ir9.d(eo7.j(14.0f, 12.0f, ox6Var3), 200.0f), IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(1178622818, new AnonymousClass1(part2, str, new js7[]{new js7(Float.valueOf(0.0f), new uh1(uh1.j)), new js7(Float.valueOf(0.9f), new uh1(kk.a(intercomTheme5, bj4VarO, i10)))}, context5, ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(intercomTheme5.getColors(bj4VarO, i10).m751getAction0d7_KjU())), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
                ox6Var2 = ox6Var3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: t68
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PostCardRowKt.PostCardRow$lambda$0(ox6Var2, part, str, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        if ((i3 & 147) == 146) {
            if (i5 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            Context context6 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            IntercomCardKt.IntercomCard(ir9.d(eo7.j(14.0f, 12.0f, ox6Var3), 200.0f), IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(1178622818, new AnonymousClass1(part2, str, new js7[]{new js7(Float.valueOf(0.0f), new uh1(uh1.j)), new js7(Float.valueOf(0.9f), new uh1(kk.a(intercomTheme6, bj4VarO, i11)))}, context6, ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(intercomTheme6.getColors(bj4VarO, i11).m751getAction0d7_KjU())), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
            ox6Var2 = ox6Var3;
        } else {
            if (i5 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            Context context7 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
            int i12 = IntercomTheme.$stable;
            IntercomCardKt.IntercomCard(ir9.d(eo7.j(14.0f, 12.0f, ox6Var3), 200.0f), IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(1178622818, new AnonymousClass1(part2, str, new js7[]{new js7(Float.valueOf(0.0f), new uh1(uh1.j)), new js7(Float.valueOf(0.9f), new uh1(kk.a(intercomTheme7, bj4VarO, i12)))}, context7, ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(intercomTheme7.getColors(bj4VarO, i12).m751getAction0d7_KjU())), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
            ox6Var2 = ox6Var3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: t68
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PostCardRowKt.PostCardRow$lambda$0(ox6Var2, part, str, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PostCardRow$lambda$0(ox6 ox6Var, Part part, String str, int i, int i2, jt1 jt1Var, int i3) {
        PostCardRow(ox6Var, part, str, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0286  */
    /* JADX WARN: Code duplicated, block: B:101:0x0289  */
    /* JADX WARN: Code duplicated, block: B:102:0x028c  */
    /* JADX WARN: Code duplicated, block: B:105:0x029c  */
    /* JADX WARN: Code duplicated, block: B:112:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:114:0x02da  */
    /* JADX WARN: Code duplicated, block: B:116:0x02de  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:77:0x0108  */
    /* JADX WARN: Code duplicated, block: B:79:0x010f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0113  */
    /* JADX WARN: Code duplicated, block: B:83:0x0154  */
    /* JADX WARN: Code duplicated, block: B:85:0x015b  */
    /* JADX WARN: Code duplicated, block: B:86:0x015f  */
    /* JADX WARN: Code duplicated, block: B:90:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x0204  */
    /* JADX WARN: Code duplicated, block: B:94:0x0275  */
    /* JADX WARN: Code duplicated, block: B:96:0x0278  */
    /* JADX WARN: Code duplicated, block: B:98:0x0283  */
    /* JADX INFO: renamed from: PostContent-FHprtrg, reason: not valid java name */
    public static final void m289PostContentFHprtrg(final List<? extends Block> list, final String str, final String str2, final AvatarWrapper avatarWrapper, final long j, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        ox6 ox6Var2;
        int i6;
        ox6.a aVar;
        ox6 ox6Var3;
        Context context;
        aj1 aj1VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        bt1.a.c cVar;
        bt1.a.e eVar;
        bt1.a.b bVar;
        bt1.a.C0034a c0034a;
        int i7;
        bt1.a.d dVar;
        ox6 ox6Var4;
        ny8 ny8VarA;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        ox6 ox6Var5;
        bj4 bj4Var;
        boolean z;
        int i8;
        final ox6 ox6Var6;
        int i9;
        BlockType type;
        int i10;
        float f;
        xj8 xj8VarW;
        list.getClass();
        str.getClass();
        str2.getClass();
        avatarWrapper.getClass();
        bj4 bj4VarO = jt1Var.o(-1350453300);
        j1b j1bVar = bj4VarO.a;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.j(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.J(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.J(str2) ? 256 : 128;
        }
        if ((i2 & 8) == 0) {
            if ((i & 3072) == 0) {
                i3 |= bj4VarO.j(avatarWrapper) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (bj4VarO.i(j)) {
                    i4 = 16384;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    ox6Var2 = ox6Var;
                    if (bj4VarO.J(ox6Var2)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i3 |= i6;
                }
                if ((74899 & i3) == 74898 || !bj4VarO.r()) {
                    aVar = ox6.a.t;
                    if (i5 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var3);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    i7 = i3;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    ox6Var4 = ox6Var3;
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ox6Var5 = ox6Var4;
                    AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, 24.0f), avatarWrapper, null, false, 0L, null, bj4VarO, ((i7 >> 6) & 112) | 6, 60);
                    bj4Var = bj4VarO;
                    b47.b(bj4Var, ir9.n(aVar, 12.0f));
                    mia.b(Phrase.from(context, R.string.intercom_teammate_from_company).put("name", str).put("company", str2).format().toString(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var, IntercomTheme.$stable).getType04(), bj4Var, 0, 0, 131070);
                    z = true;
                    bj4Var.U(true);
                    b47.b(bj4Var, ir9.d(aVar, 16.0f));
                    bj4Var.K(-83077931);
                    i8 = 0;
                    for (Object obj : list) {
                        i9 = i8 + 1;
                        if (i8 < 0) {
                            ws0.m();
                            throw null;
                        }
                        Block block = (Block) obj;
                        ox6 ox6Var7 = ox6Var5;
                        BlockViewKt.m426BlockViewOkTjGUA(ir9.c(aVar, 1.0f), new BlockRenderData(block, null, new BlockRenderTextStyle(cka.b(20), ob4.z, 0L, new uh1(j), null, null, 52, null), new BlockRenderTextStyle(cka.b(16), ob4.y, 0L, new uh1(j), null, null, 52, null), null, 18, null), false, null, false, null, null, 0L, null, null, false, null, null, bj4Var, 6, 0, 8188);
                        type = block.getType();
                        if (type == null) {
                            i10 = -1;
                        } else {
                            i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                        }
                        if (i10 == 1) {
                            f = 32.0f;
                        } else if (i10 != 2) {
                            f = 8.0f;
                        } else {
                            f = 16.0f;
                        }
                        bj4Var.K(-83050692);
                        if (i8 != list.size() - 1) {
                            b47.b(bj4Var, ir9.d(aVar, f));
                        }
                        bj4Var.U(false);
                        z = true;
                        i8 = i9;
                        ox6Var5 = ox6Var7;
                    }
                    bj4Var.U(false);
                    bj4Var.U(z);
                    ox6Var6 = ox6Var5;
                } else {
                    bj4VarO.u();
                    bj4Var = bj4VarO;
                    ox6Var6 = ox6Var2;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: r68
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return PostCardRowKt.PostContent_FHprtrg$lambda$4(list, str, str2, avatarWrapper, j, ox6Var6, i, i2, (jt1) obj2, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            ox6Var2 = ox6Var;
            if ((74899 & i3) == 74898) {
                aVar = ox6.a.t;
                if (i5 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var3);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, aj1VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf2);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                i7 = i3;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ox6Var4 = ox6Var3;
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, ny8VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ox6Var5 = ox6Var4;
                AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, 24.0f), avatarWrapper, null, false, 0L, null, bj4VarO, ((i7 >> 6) & 112) | 6, 60);
                bj4Var = bj4VarO;
                b47.b(bj4Var, ir9.n(aVar, 12.0f));
                mia.b(Phrase.from(context, R.string.intercom_teammate_from_company).put("name", str).put("company", str2).format().toString(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var, IntercomTheme.$stable).getType04(), bj4Var, 0, 0, 131070);
                z = true;
                bj4Var.U(true);
                b47.b(bj4Var, ir9.d(aVar, 16.0f));
                bj4Var.K(-83077931);
                i8 = 0;
                while (r7.hasNext()) {
                    i9 = i8 + 1;
                    if (i8 < 0) {
                        ws0.m();
                        throw null;
                    }
                    Block block2 = (Block) obj;
                    ox6 ox6Var8 = ox6Var5;
                    BlockViewKt.m426BlockViewOkTjGUA(ir9.c(aVar, 1.0f), new BlockRenderData(block2, null, new BlockRenderTextStyle(cka.b(20), ob4.z, 0L, new uh1(j), null, null, 52, null), new BlockRenderTextStyle(cka.b(16), ob4.y, 0L, new uh1(j), null, null, 52, null), null, 18, null), false, null, false, null, null, 0L, null, null, false, null, null, bj4Var, 6, 0, 8188);
                    type = block2.getType();
                    if (type == null) {
                        i10 = -1;
                    } else {
                        i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                    }
                    if (i10 == 1) {
                        f = 32.0f;
                    } else if (i10 != 2) {
                        f = 8.0f;
                    } else {
                        f = 16.0f;
                    }
                    bj4Var.K(-83050692);
                    if (i8 != list.size() - 1) {
                        b47.b(bj4Var, ir9.d(aVar, f));
                    }
                    bj4Var.U(false);
                    z = true;
                    i8 = i9;
                    ox6Var5 = ox6Var8;
                }
                bj4Var.U(false);
                bj4Var.U(z);
                ox6Var6 = ox6Var5;
            } else {
                aVar = ox6.a.t;
                if (i5 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var3);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, aj1VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf3 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf3);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                i7 = i3;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ox6Var4 = ox6Var3;
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, ny8VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ox6Var5 = ox6Var4;
                AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, 24.0f), avatarWrapper, null, false, 0L, null, bj4VarO, ((i7 >> 6) & 112) | 6, 60);
                bj4Var = bj4VarO;
                b47.b(bj4Var, ir9.n(aVar, 12.0f));
                mia.b(Phrase.from(context, R.string.intercom_teammate_from_company).put("name", str).put("company", str2).format().toString(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var, IntercomTheme.$stable).getType04(), bj4Var, 0, 0, 131070);
                z = true;
                bj4Var.U(true);
                b47.b(bj4Var, ir9.d(aVar, 16.0f));
                bj4Var.K(-83077931);
                i8 = 0;
                while (r7.hasNext()) {
                    i9 = i8 + 1;
                    if (i8 < 0) {
                        ws0.m();
                        throw null;
                    }
                    Block block3 = (Block) obj;
                    ox6 ox6Var9 = ox6Var5;
                    BlockViewKt.m426BlockViewOkTjGUA(ir9.c(aVar, 1.0f), new BlockRenderData(block3, null, new BlockRenderTextStyle(cka.b(20), ob4.z, 0L, new uh1(j), null, null, 52, null), new BlockRenderTextStyle(cka.b(16), ob4.y, 0L, new uh1(j), null, null, 52, null), null, 18, null), false, null, false, null, null, 0L, null, null, false, null, null, bj4Var, 6, 0, 8188);
                    type = block3.getType();
                    if (type == null) {
                        i10 = -1;
                    } else {
                        i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                    }
                    if (i10 == 1) {
                        f = 32.0f;
                    } else if (i10 != 2) {
                        f = 8.0f;
                    } else {
                        f = 16.0f;
                    }
                    bj4Var.K(-83050692);
                    if (i8 != list.size() - 1) {
                        b47.b(bj4Var, ir9.d(aVar, f));
                    }
                    bj4Var.U(false);
                    z = true;
                    i8 = i9;
                    ox6Var5 = ox6Var9;
                }
                bj4Var.U(false);
                bj4Var.U(z);
                ox6Var6 = ox6Var5;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: r68
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return PostCardRowKt.PostContent_FHprtrg$lambda$4(list, str, str2, avatarWrapper, j, ox6Var6, i, i2, (jt1) obj2, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (bj4VarO.i(j)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        i5 = i2 & 32;
        if (i5 != 0) {
            if ((196608 & i) == 0) {
                ox6Var2 = ox6Var;
                if (bj4VarO.J(ox6Var2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if ((74899 & i3) == 74898) {
                aVar = ox6.a.t;
                if (i5 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var3);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, aj1VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf4 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf4);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                i7 = i3;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ox6Var4 = ox6Var3;
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, ny8VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ox6Var5 = ox6Var4;
                AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, 24.0f), avatarWrapper, null, false, 0L, null, bj4VarO, ((i7 >> 6) & 112) | 6, 60);
                bj4Var = bj4VarO;
                b47.b(bj4Var, ir9.n(aVar, 12.0f));
                mia.b(Phrase.from(context, R.string.intercom_teammate_from_company).put("name", str).put("company", str2).format().toString(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var, IntercomTheme.$stable).getType04(), bj4Var, 0, 0, 131070);
                z = true;
                bj4Var.U(true);
                b47.b(bj4Var, ir9.d(aVar, 16.0f));
                bj4Var.K(-83077931);
                i8 = 0;
                while (r7.hasNext()) {
                    i9 = i8 + 1;
                    if (i8 < 0) {
                        ws0.m();
                        throw null;
                    }
                    Block block4 = (Block) obj;
                    ox6 ox6Var10 = ox6Var5;
                    BlockViewKt.m426BlockViewOkTjGUA(ir9.c(aVar, 1.0f), new BlockRenderData(block4, null, new BlockRenderTextStyle(cka.b(20), ob4.z, 0L, new uh1(j), null, null, 52, null), new BlockRenderTextStyle(cka.b(16), ob4.y, 0L, new uh1(j), null, null, 52, null), null, 18, null), false, null, false, null, null, 0L, null, null, false, null, null, bj4Var, 6, 0, 8188);
                    type = block4.getType();
                    if (type == null) {
                        i10 = -1;
                    } else {
                        i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                    }
                    if (i10 == 1) {
                        f = 32.0f;
                    } else if (i10 != 2) {
                        f = 8.0f;
                    } else {
                        f = 16.0f;
                    }
                    bj4Var.K(-83050692);
                    if (i8 != list.size() - 1) {
                        b47.b(bj4Var, ir9.d(aVar, f));
                    }
                    bj4Var.U(false);
                    z = true;
                    i8 = i9;
                    ox6Var5 = ox6Var10;
                }
                bj4Var.U(false);
                bj4Var.U(z);
                ox6Var6 = ox6Var5;
            } else {
                aVar = ox6.a.t;
                if (i5 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var3);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, aj1VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf5 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf5);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                i7 = i3;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ox6Var4 = ox6Var3;
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, ny8VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ox6Var5 = ox6Var4;
                AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, 24.0f), avatarWrapper, null, false, 0L, null, bj4VarO, ((i7 >> 6) & 112) | 6, 60);
                bj4Var = bj4VarO;
                b47.b(bj4Var, ir9.n(aVar, 12.0f));
                mia.b(Phrase.from(context, R.string.intercom_teammate_from_company).put("name", str).put("company", str2).format().toString(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var, IntercomTheme.$stable).getType04(), bj4Var, 0, 0, 131070);
                z = true;
                bj4Var.U(true);
                b47.b(bj4Var, ir9.d(aVar, 16.0f));
                bj4Var.K(-83077931);
                i8 = 0;
                while (r7.hasNext()) {
                    i9 = i8 + 1;
                    if (i8 < 0) {
                        ws0.m();
                        throw null;
                    }
                    Block block5 = (Block) obj;
                    ox6 ox6Var11 = ox6Var5;
                    BlockViewKt.m426BlockViewOkTjGUA(ir9.c(aVar, 1.0f), new BlockRenderData(block5, null, new BlockRenderTextStyle(cka.b(20), ob4.z, 0L, new uh1(j), null, null, 52, null), new BlockRenderTextStyle(cka.b(16), ob4.y, 0L, new uh1(j), null, null, 52, null), null, 18, null), false, null, false, null, null, 0L, null, null, false, null, null, bj4Var, 6, 0, 8188);
                    type = block5.getType();
                    if (type == null) {
                        i10 = -1;
                    } else {
                        i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                    }
                    if (i10 == 1) {
                        f = 32.0f;
                    } else if (i10 != 2) {
                        f = 8.0f;
                    } else {
                        f = 16.0f;
                    }
                    bj4Var.K(-83050692);
                    if (i8 != list.size() - 1) {
                        b47.b(bj4Var, ir9.d(aVar, f));
                    }
                    bj4Var.U(false);
                    z = true;
                    i8 = i9;
                    ox6Var5 = ox6Var11;
                }
                bj4Var.U(false);
                bj4Var.U(z);
                ox6Var6 = ox6Var5;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: r68
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return PostCardRowKt.PostContent_FHprtrg$lambda$4(list, str, str2, avatarWrapper, j, ox6Var6, i, i2, (jt1) obj2, iIntValue);
                    }
                };
            }
        }
        i3 |= 196608;
        ox6Var2 = ox6Var;
        if ((74899 & i3) == 74898) {
            aVar = ox6.a.t;
            if (i5 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var3);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, aj1VarA);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf6 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf6);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            i7 = i3;
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ox6Var4 = ox6Var3;
            ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, aVar);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, ny8VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            ox6Var5 = ox6Var4;
            AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, 24.0f), avatarWrapper, null, false, 0L, null, bj4VarO, ((i7 >> 6) & 112) | 6, 60);
            bj4Var = bj4VarO;
            b47.b(bj4Var, ir9.n(aVar, 12.0f));
            mia.b(Phrase.from(context, R.string.intercom_teammate_from_company).put("name", str).put("company", str2).format().toString(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var, IntercomTheme.$stable).getType04(), bj4Var, 0, 0, 131070);
            z = true;
            bj4Var.U(true);
            b47.b(bj4Var, ir9.d(aVar, 16.0f));
            bj4Var.K(-83077931);
            i8 = 0;
            while (r7.hasNext()) {
                i9 = i8 + 1;
                if (i8 < 0) {
                    ws0.m();
                    throw null;
                }
                Block block6 = (Block) obj;
                ox6 ox6Var12 = ox6Var5;
                BlockViewKt.m426BlockViewOkTjGUA(ir9.c(aVar, 1.0f), new BlockRenderData(block6, null, new BlockRenderTextStyle(cka.b(20), ob4.z, 0L, new uh1(j), null, null, 52, null), new BlockRenderTextStyle(cka.b(16), ob4.y, 0L, new uh1(j), null, null, 52, null), null, 18, null), false, null, false, null, null, 0L, null, null, false, null, null, bj4Var, 6, 0, 8188);
                type = block6.getType();
                if (type == null) {
                    i10 = -1;
                } else {
                    i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                }
                if (i10 == 1) {
                    f = 32.0f;
                } else if (i10 != 2) {
                    f = 8.0f;
                } else {
                    f = 16.0f;
                }
                bj4Var.K(-83050692);
                if (i8 != list.size() - 1) {
                    b47.b(bj4Var, ir9.d(aVar, f));
                }
                bj4Var.U(false);
                z = true;
                i8 = i9;
                ox6Var5 = ox6Var12;
            }
            bj4Var.U(false);
            bj4Var.U(z);
            ox6Var6 = ox6Var5;
        } else {
            aVar = ox6.a.t;
            if (i5 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var3);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, aj1VarA);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf7 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf7);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            i7 = i3;
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ox6Var4 = ox6Var3;
            ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, aVar);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, ny8VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            ox6Var5 = ox6Var4;
            AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, 24.0f), avatarWrapper, null, false, 0L, null, bj4VarO, ((i7 >> 6) & 112) | 6, 60);
            bj4Var = bj4VarO;
            b47.b(bj4Var, ir9.n(aVar, 12.0f));
            mia.b(Phrase.from(context, R.string.intercom_teammate_from_company).put("name", str).put("company", str2).format().toString(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var, IntercomTheme.$stable).getType04(), bj4Var, 0, 0, 131070);
            z = true;
            bj4Var.U(true);
            b47.b(bj4Var, ir9.d(aVar, 16.0f));
            bj4Var.K(-83077931);
            i8 = 0;
            while (r7.hasNext()) {
                i9 = i8 + 1;
                if (i8 < 0) {
                    ws0.m();
                    throw null;
                }
                Block block7 = (Block) obj;
                ox6 ox6Var13 = ox6Var5;
                BlockViewKt.m426BlockViewOkTjGUA(ir9.c(aVar, 1.0f), new BlockRenderData(block7, null, new BlockRenderTextStyle(cka.b(20), ob4.z, 0L, new uh1(j), null, null, 52, null), new BlockRenderTextStyle(cka.b(16), ob4.y, 0L, new uh1(j), null, null, 52, null), null, 18, null), false, null, false, null, null, 0L, null, null, false, null, null, bj4Var, 6, 0, 8188);
                type = block7.getType();
                if (type == null) {
                    i10 = -1;
                } else {
                    i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                }
                if (i10 == 1) {
                    f = 32.0f;
                } else if (i10 != 2) {
                    f = 8.0f;
                } else {
                    f = 16.0f;
                }
                bj4Var.K(-83050692);
                if (i8 != list.size() - 1) {
                    b47.b(bj4Var, ir9.d(aVar, f));
                }
                bj4Var.U(false);
                z = true;
                i8 = i9;
                ox6Var5 = ox6Var13;
            }
            bj4Var.U(false);
            bj4Var.U(z);
            ox6Var6 = ox6Var5;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: r68
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return PostCardRowKt.PostContent_FHprtrg$lambda$4(list, str, str2, avatarWrapper, j, ox6Var6, i, i2, (jt1) obj2, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PostContent_FHprtrg$lambda$4(List list, String str, String str2, AvatarWrapper avatarWrapper, long j, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        m289PostContentFHprtrg(list, str, str2, avatarWrapper, j, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.PostCardRowKt$PostCardRow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass1 implements ei4<bj1, jt1, Integer, g2b> {
        final /* synthetic */ long $actionColor;
        final /* synthetic */ String $companyName;
        final /* synthetic */ Context $context;
        final /* synthetic */ js7<Float, uh1>[] $gradientColors;
        final /* synthetic */ Part $part;

        public AnonymousClass1(Part part, String str, js7<Float, uh1>[] js7VarArr, Context context, long j) {
            this.$part = part;
            this.$companyName = str;
            this.$gradientColors = js7VarArr;
            this.$context = context;
            this.$actionColor = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final g2b invoke$lambda$5$lambda$1$lambda$0(js7[] js7VarArr, cz1 cz1Var) {
            cz1Var.getClass();
            cz1Var.K1();
            js7[] js7VarArr2 = (js7[]) Arrays.copyOf(js7VarArr, js7VarArr.length);
            js7[] js7VarArr3 = (js7[]) Arrays.copyOf(js7VarArr2, js7VarArr2.length);
            float f = 0.0f;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L);
            int length = js7VarArr3.length;
            ArrayList arrayList = new ArrayList(length);
            int i = 0;
            while (i < length) {
                arrayList.add(new uh1(((uh1) js7VarArr3[i].u).a));
                i++;
                f = f;
                length = length;
            }
            float f2 = f;
            ArrayList arrayList2 = new ArrayList(js7VarArr3.length);
            for (js7 js7Var : js7VarArr3) {
                arrayList2.add(Float.valueOf(((Number) js7Var.t).floatValue()));
            }
            d73.Q(cz1Var, new h86(arrayList, arrayList2, jFloatToRawIntBits, jFloatToRawIntBits2), (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cz1Var.c() & 4294967295L)) - 120.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cz1Var.c() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(120.0f)) & 4294967295L), 0.0f, null, null, 120);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$5$lambda$3$lambda$2(Context context, Part part) {
            context.startActivity(IntercomPostActivity.Companion.buildPostIntent(context, part, part.getParentConversation().getId(), part.getParentConversation().lastParticipatingAdmin(), part.getParentConversation().getComposerState().isVisible(), false));
            return g2b.a;
        }

        public final void invoke(bj1 bj1Var, jt1 jt1Var, int i) {
            bj1Var.getClass();
            if ((i & 17) == 16 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            final Part part = this.$part;
            String str = this.$companyName;
            final js7<Float, uh1>[] js7VarArr = this.$gradientColors;
            final Context context = this.$context;
            long j = this.$actionColor;
            sp0.a aVar = di.a.m;
            c30.k kVar = c30.c;
            aj1 aj1VarA = yi1.a(kVar, aVar, jt1Var, 0);
            int iHashCode = Long.hashCode(jt1Var.v());
            kw7 kw7VarY = jt1Var.y();
            ox6.a aVar2 = ox6.a.t;
            ox6 ox6VarC = it1.c(jt1Var, aVar2);
            bt1.c.getClass();
            qr5.a aVar3 = bt1.a.b;
            if (jt1Var.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var.q();
            if (jt1Var.l()) {
                jt1Var.k(aVar3);
            } else {
                jt1Var.z();
            }
            bt1.a.c cVar = bt1.a.f;
            rd7.d(jt1Var, cVar, aj1VarA);
            bt1.a.e eVar = bt1.a.e;
            rd7.d(jt1Var, eVar, kw7VarY);
            Integer numValueOf = Integer.valueOf(iHashCode);
            bt1.a.b bVar = bt1.a.g;
            rd7.d(jt1Var, bVar, numValueOf);
            bt1.a.C0034a c0034a = bt1.a.h;
            rd7.c(jt1Var, c0034a);
            bt1.a.d dVar = bt1.a.d;
            rd7.d(jt1Var, dVar, ox6VarC);
            List<Block> blocks = part.getBlocks();
            blocks.getClass();
            String forename = part.getParticipant().getForename();
            forename.getClass();
            Avatar avatar = part.getParticipant().getAvatar();
            avatar.getClass();
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatar, false);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i2 = IntercomTheme.$stable;
            long jA = ah5.a(intercomTheme, jt1Var, i2);
            qs5 qs5Var = new qs5(true, 1.0f);
            jt1Var.K(453790434);
            boolean zJ = jt1Var.j(js7VarArr);
            Object objF = jt1Var.f();
            Object obj = jt1.a.a;
            if (zJ || objF == obj) {
                objF = new oh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.m
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        return PostCardRowKt.AnonymousClass1.invoke$lambda$5$lambda$1$lambda$0(js7VarArr, (cz1) obj2);
                    }
                };
                jt1Var.C(objF);
            }
            jt1Var.B();
            PostCardRowKt.m289PostContentFHprtrg(blocks, forename, str, avatarWrapper, jA, eo7.i(z63.e(qs5Var, (oh4) objF), 12.0f), jt1Var, 0, 0);
            ox6 ox6VarC2 = gi0.c(ir9.c(aVar2, 1.0f), zg5.a(intercomTheme, jt1Var, i2), al8.a);
            jt1Var.K(453809685);
            boolean zJ2 = jt1Var.j(context) | jt1Var.j(part);
            Object objF2 = jt1Var.f();
            if (zJ2 || objF2 == obj) {
                objF2 = new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.n
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return PostCardRowKt.AnonymousClass1.invoke$lambda$5$lambda$3$lambda$2(context, part);
                    }
                };
                jt1Var.C(objF2);
            }
            jt1Var.B();
            ox6 ox6VarC3 = we1.c(ox6VarC2, false, null, (mh4) objF2, 15);
            sp0.a aVar4 = di.a.n;
            aj1 aj1VarA2 = yi1.a(kVar, aVar4, jt1Var, 48);
            int iHashCode2 = Long.hashCode(jt1Var.v());
            kw7 kw7VarY2 = jt1Var.y();
            ox6 ox6VarC4 = it1.c(jt1Var, ox6VarC3);
            if (jt1Var.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var.q();
            if (jt1Var.l()) {
                jt1Var.k(aVar3);
            } else {
                jt1Var.z();
            }
            rd7.d(jt1Var, cVar, aj1VarA2);
            rd7.d(jt1Var, eVar, kw7VarY2);
            g3.c(iHashCode2, jt1Var, bVar, jt1Var, c0034a);
            rd7.d(jt1Var, dVar, ox6VarC4);
            IntercomDividerKt.IntercomDivider(ir9.c(aVar2, 0.9f).H(new c15(aVar4)), jt1Var, 0, 0);
            b47.b(jt1Var, ir9.d(aVar2, 14.0f));
            mia.b(nr1.f(jt1Var, R.string.intercom_view_post), null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var, i2).getType04SemiBold(), jt1Var, 0, 0, 131066);
            b47.b(jt1Var, ir9.d(aVar2, 14.0f));
            jt1Var.I();
            jt1Var.I();
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var, Integer num) {
            invoke(bj1Var, jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
