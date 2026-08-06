package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.ah5;
import defpackage.bj1;
import defpackage.bj4;
import defpackage.ci4;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.jt1;
import defpackage.ox6;
import defpackage.xj8;
import defpackage.ya2;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.ui.components.row.NoteCardRowKt;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NoteCardRowKt {
    public static final void NoteCardRow(ox6 ox6Var, final Part part, final String str, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        part.getClass();
        str.getClass();
        bj4 bj4VarO = jt1Var.o(-746207954);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(part) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.J(str) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ox6 ox6Var3 = i4 != 0 ? ox6.a.t : ox6Var2;
            IntercomCardKt.IntercomCard(eo7.j(14.0f, 12.0f, ox6Var3), IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(2124316578, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.NoteCardRowKt.NoteCardRow.1
                public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i5) {
                    bj1Var.getClass();
                    if ((i5 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    List<Block> blocks = part.getBlocks();
                    blocks.getClass();
                    String forename = part.getParticipant().getForename();
                    forename.getClass();
                    String str2 = str;
                    Avatar avatar = part.getParticipant().getAvatar();
                    avatar.getClass();
                    Boolean boolIsBot = part.getParticipant().isBot();
                    boolIsBot.getClass();
                    PostCardRowKt.m289PostContentFHprtrg(blocks, forename, str2, new AvatarWrapper(avatar, boolIsBot.booleanValue()), ah5.a(IntercomTheme.INSTANCE, jt1Var2, IntercomTheme.$stable), eo7.i(ir9.c(ox6.a.t, 1.0f), 16.0f), jt1Var2, 196608, 0);
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                    invoke(bj1Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
            ox6Var2 = ox6Var3;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: mc7
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return NoteCardRowKt.NoteCardRow$lambda$0(ox6Var2, part, str, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b NoteCardRow$lambda$0(ox6 ox6Var, Part part, String str, int i, int i2, jt1 jt1Var, int i3) {
        NoteCardRow(ox6Var, part, str, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void NoteCardRowPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1220886807);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$NoteCardRowKt.INSTANCE.m258getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ya2(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b NoteCardRowPreview$lambda$1(int i, jt1 jt1Var, int i2) {
        NoteCardRowPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
