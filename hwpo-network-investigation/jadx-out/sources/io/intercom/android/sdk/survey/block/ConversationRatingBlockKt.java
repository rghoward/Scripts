package io.intercom.android.sdk.survey.block;

import defpackage.bj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ml5;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.xj8;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.survey.block.ConversationRatingBlockKt;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationRatingBlockKt {
    /* JADX INFO: renamed from: ConversationRatingBlock-cf5BqRc, reason: not valid java name */
    public static final void m438ConversationRatingBlockcf5BqRc(ox6 ox6Var, final BlockRenderData blockRenderData, final long j, final String str, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        bj4 bj4Var;
        blockRenderData.getClass();
        str.getClass();
        bj4 bj4VarO = jt1Var.o(1714913761);
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
            i3 |= bj4VarO.j(blockRenderData) ? 32 : 16;
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
            bj4Var = bj4VarO;
        } else {
            ox6 ox6Var3 = i4 != 0 ? ox6.a.t : ox6Var2;
            bj4Var = bj4VarO;
            IntercomCardKt.IntercomCard(ir9.c(ox6Var3, 1.0f), IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4Var, IntercomCardStyle.$stable << 15, 31), gr1.b(1828616789, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.ConversationRatingBlockKt$ConversationRatingBlock$1
                public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i5) {
                    bj1Var.getClass();
                    if ((i5 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    ox6.a aVar = ox6.a.t;
                    ox6 ox6VarC = ir9.c(aVar, 1.0f);
                    BlockRenderData blockRenderData2 = blockRenderData;
                    long j2 = j;
                    String str2 = str;
                    fl6 fl6VarD = dv0.d(di.a.e, false);
                    int iHashCode = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6 ox6VarC2 = it1.c(jt1Var2, ox6VarC);
                    bt1.c.getClass();
                    qr5.a aVar2 = bt1.a.b;
                    if (jt1Var2.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var2.q();
                    if (jt1Var2.l()) {
                        jt1Var2.k(aVar2);
                    } else {
                        jt1Var2.z();
                    }
                    rd7.d(jt1Var2, bt1.a.f, fl6VarD);
                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(jt1Var2, bt1.a.h);
                    rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                    BlockViewKt.m427RenderLegacyBlockssW7UJKQ(blockRenderData2.getBlock(), j2, eo7.i(aVar, 16.0f), str2, jt1Var2, 384, 0);
                    jt1Var2.I();
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                    invoke(bj1Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4Var), bj4Var, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
            ox6Var2 = ox6Var3;
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: m22
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ConversationRatingBlockKt.ConversationRatingBlock_cf5BqRc$lambda$0(ox6Var2, blockRenderData, j, str, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationRatingBlock_cf5BqRc$lambda$0(ox6 ox6Var, BlockRenderData blockRenderData, long j, String str, int i, int i2, jt1 jt1Var, int i3) {
        m438ConversationRatingBlockcf5BqRc(ox6Var, blockRenderData, j, str, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
