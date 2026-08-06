package io.intercom.android.sdk.survey.block;

import defpackage.bj1;
import defpackage.bj4;
import defpackage.ci4;
import defpackage.ei4;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.jt1;
import defpackage.ox6;
import defpackage.xj8;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.survey.block.LinkListBlockKt;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LinkListBlockKt {
    /* JADX INFO: renamed from: LinkListBlock-cf5BqRc, reason: not valid java name */
    public static final void m440LinkListBlockcf5BqRc(ox6 ox6Var, final Block block, final long j, final String str, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        final ox6 ox6Var3;
        block.getClass();
        str.getClass();
        bj4 bj4VarO = jt1Var.o(-1519911583);
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
            i3 |= bj4VarO.j(block) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.i(j) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= bj4VarO.J(str) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i3 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
            ox6Var3 = ox6Var2;
        } else {
            ox6 ox6Var4 = i4 != 0 ? ox6.a.t : ox6Var2;
            IntercomCardStyle.Style styleM577conversationCardStylePEIptTM = IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31);
            bj4VarO = bj4VarO;
            ox6 ox6Var5 = ox6Var4;
            IntercomCardKt.IntercomCard(ox6Var5, styleM577conversationCardStylePEIptTM, gr1.b(-46303019, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.LinkListBlockKt$LinkListBlock$1
                public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i5) {
                    bj1Var.getClass();
                    if ((i5 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        BlockViewKt.m427RenderLegacyBlockssW7UJKQ(block, j, null, str, jt1Var2, 0, 4);
                    }
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                    invoke(bj1Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, (i3 & 14) | 384 | (IntercomCardStyle.Style.$stable << 3), 0);
            ox6Var3 = ox6Var5;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: n86
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return LinkListBlockKt.LinkListBlock_cf5BqRc$lambda$0(ox6Var3, block, j, str, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LinkListBlock_cf5BqRc$lambda$0(ox6 ox6Var, Block block, long j, String str, int i, int i2, jt1 jt1Var, int i3) {
        m440LinkListBlockcf5BqRc(ox6Var, block, j, str, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
